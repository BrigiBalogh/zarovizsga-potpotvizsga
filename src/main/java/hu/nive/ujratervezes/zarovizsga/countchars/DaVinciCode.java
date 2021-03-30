package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DaVinciCode {


    public int encode(String input, char c) {

        if (c != '0' && c != '1' && c != 'x') {
            throw new IllegalArgumentException(" The data is invalid" + c);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(input))) {

            int count = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                for (char cc : line.toCharArray()) {
                    if (cc == c) {
                        count++;
                    }
                }
            }
            return count;

        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file !", ioe);
        }

    }
}
