import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task1 {
    
    public static void main(String[] args) throws IOException{

        File input = new File("data.txt");
        FileReader fr = null;
        Scanner ob = new Scanner(System.in);
        String SearchWord, str;
        System.out.print("Enter word to search : ");
        SearchWord = ob.nextLine();
        try{
            fr=new FileReader(input);
            BufferedReader br = new BufferedReader(fr);

            while((str=br.readLine())!=null){
                if(str.contains(SearchWord))
                System.out.println(str);
            }
        }
        catch(FileNotFoundException ex){
            Logger.getLogger(Task1.class.getName()).log(Level.SEVERE,null,ex);
        } catch(IOException ex){
            Logger.getLogger(Task1.class.getName()).log(Level.SEVERE,null,ex);
        }
        finally{
            fr.close();
        }
        }
    }

