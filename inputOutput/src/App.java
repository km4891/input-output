import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class App {

    
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner (System.in);
        int selection = 0;
            

        System.out.println("1. Write to file");
        System.out.println("2. Read from file");

        selection =input.nextInt();
        
        switch (selection) {

            case 1:
                String name, address, phone;
                System.out.println("Please enter your name: ");
                name = input.next();
                System.out.println("Please enter your");
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("info.text"));
                    writer.write(name);
                    writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            

        
            
            try {
            BufferedReader reader = new BufferedReader(new FileReader("info.txt"));
                String line;
                // read a line from the file and put it in the line variable
                while((line = reader.readLine()) != null)
                    System.out.println(reader.readLine());
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    }
}
