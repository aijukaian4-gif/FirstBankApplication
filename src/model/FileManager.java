package model;

import java.io.FileWriter;
import java.io.IOException;


public class FileManager {


    public static void saveAccount(String data){


        try{


            FileWriter writer =
            new FileWriter("accounts.txt", true);


            writer.write(data);
            writer.write("\n");


            writer.close();


        }
        catch(IOException e){

            System.out.println(
            "Saving failed: " + e.getMessage()
            );

        }


    }

}