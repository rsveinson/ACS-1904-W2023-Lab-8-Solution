import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class ReadBinaryInfo{
    public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException {
        char[] initials = new char[4];
        String[] name = new String[4];
        int[] age = new int[4]; 
        
        DataInputStream dis = new DataInputStream( new FileInputStream("Lab8.ser"));
        
        // for(int i = 0; i < initials.length; i++){
            // initials[i] = dis.readChar();
            // name[i] = dis.readUTF();
            // age[i] = dis.readInt();
        // }
        // int j = 0;
        // while(dis.available() > 0){
            // initials[j] = dis.readChar();
            // name[j] = dis.readUTF();
            // age[j] = dis.readInt();
            // j++;
        // }
        
        
        while(dis.available() > 0){
            System.out.println(dis.readChar() + ". " + dis.readUTF() + ", " + dis.readInt());
        }
        
        // for(int i = 0; i < initials.length; i++)
            // System.out.println(initials[i] + ". " + name[i] + ", " + age[i]);

        System.out.println("end of program");
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
