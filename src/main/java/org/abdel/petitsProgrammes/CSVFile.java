package org.abdel.petitsProgrammes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CSVFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        String csvFile = "test.csv";
        FileWriter writer = new FileWriter(csvFile);

        CSVUtils.writeLine(writer, Arrays.asList("a", "b", "c", "d"));

        //custom separator + quote
        CSVUtils.writeLine(writer, Arrays.asList("aaa", "bb,b", "cc,c"), ',', '"');

        //custom separator + quote
        CSVUtils.writeLine(writer, Arrays.asList("aaa", "bbb", "cc,c"), '|', '\'');

        //double-quotes
        CSVUtils.writeLine(writer, Arrays.asList("aaa", "bbb", "cc\"c"));


        writer.flush();
        writer.close();
        
        System.out.println("done!");
	}

}
