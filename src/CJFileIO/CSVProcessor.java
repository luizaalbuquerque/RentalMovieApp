/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CJFileIO;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author Charles Franklin Jahn 2020315
 */
public class CSVProcessor {

    public void processCSV() throws IOException {
        System.out.println("LOADING...");
        String inputFile = "movies_test.csv";
        DataInput dataInput = new DataInput();
        List<String> lines = dataInput.InputData(inputFile);
        System.out.println(lines.get(0));
    }
}
