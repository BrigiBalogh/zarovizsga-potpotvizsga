package hu.nive.ujratervezes.zarovizsga.housecup;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HouseCup {

    private MysqlDataSource dateSource;

    public HouseCup(MysqlDataSource dateSource) {
        this.dateSource = dateSource;
    }

    public int getPointsOfHouse(String houseName) {
        int sumPoints = 0;
        try (Connection conn = dateSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(
                     "select sum(points_earned) from house_points where house_name = ?");
             ) {
            ps.setString(1, houseName);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    sumPoints = rs.getInt(1);
                }else {
                    throw new IllegalArgumentException("House does not exits");
                }
            }catch (SQLException sqle) {
                throw new IllegalStateException("Cannot query",sqle);
            }
        }catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query", sqle);
        }
        return sumPoints;
    }
}

