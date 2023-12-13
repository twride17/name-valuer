package namevalues;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NameValuer {

    public static void main(String[] args) {
        int totalValue = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("names.txt"));
            ArrayList<String> names = new ArrayList<>(Arrays.asList(reader.readLine().replaceAll("\"", "").split(",")));
            Collections.sort(names);
            for(int i = 0; i < names.size(); i++) {
                totalValue += (i + 1) * Name.calculateValue(names.get(i));
            }
        } catch(IOException e) {}
        System.out.println(totalValue);
    }
}
