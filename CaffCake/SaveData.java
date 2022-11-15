package CaffCake;

import java.io.FileWriter;
import java.io.IOException;

public class SaveData {

    protected String bill;

    public SaveData(String billPrint) {
        bill = billPrint;
    }

    public void saveData(String bill) {

        try {
            FileWriter myWriter = new FileWriter("Data.txt", true);
            myWriter.write(bill + "\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}