package ExcetionDemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo3 {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fp = new FileInputStream("E:\\myFile.txt");

        System.out.println("file is read successfully");

    }
}
