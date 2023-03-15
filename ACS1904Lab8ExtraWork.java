import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class ACS1904Lab8ExtraWork{
    public static void main(String[] args)throws FileNotFoundException {
        ArrayList<Cat> cats = new ArrayList<>();
        
        // add some cats
        cats.add(new Cat("Emerson", 17));
        cats.add(new Cat("Rincewind", 1));
        cats.add(new Cat("Alax", 16));
        
        printList(cats);
        
        // **** write the list to an xml file ****
        // open the output stream
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream("cats.xml"));
        encoder.writeObject(cats);
        encoder.close();
        
        // ****** now read it back *************
        XMLDecoder decoder = new XMLDecoder(new FileInputStream("cats.xml"));
        ArrayList<Cat> newCats = new ArrayList<>();
        newCats = (ArrayList)decoder.readObject();
        printList(newCats);
        
        

        System.out.println("end of program");
    }
    
    public static void printList(ArrayList<Cat> list){
        for(Cat c : list){
            System.out.println(c);
        }
    }
}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
