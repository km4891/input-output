import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class App {

    // public static void Write (String name, String address, String phone) {

    // }
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner (System.in);
        int selection = 0;
        
        // startup menu
        System.out.println("Welcome to password saver!");
        System.out.println("1. Write to file");
        System.out.println("2. Read from file");
        System.out.print("Choose an option: ");

        selection =input.nextInt();
        String website, username, password;
        
        switch (selection) {

            case 1:
                
               

                    try {
                        // creates writer function to save user input
                        BufferedWriter writer = new BufferedWriter(new FileWriter("info.txt"));
                        System.out.print("Enter website name: ");
                        website = input.next();
                        writer.write("Website: " + website);
                        System.out.print("Enter your username: ");
                        username = input.next();
                        writer.write("\n" + "Username: " + username);
                        System.out.print("Enter your password: ");
                        password = input.next();
                        writer.write("\n" + "Password: " + password);
                        // if not close() program will not write any data
                        writer.close();
                        // basic catch incase file cannot be found or opened
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

        
            case 2:
                try {
                    BufferedReader reader = new BufferedReader(new FileReader("info.txt"));
                        String line;
                        // read a line from the file and put it in the line variable, once null it will break the while loop
                        while((line = reader.readLine()) != null)
                            System.out.println(line);
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
    }
    input.close();
    }
}
