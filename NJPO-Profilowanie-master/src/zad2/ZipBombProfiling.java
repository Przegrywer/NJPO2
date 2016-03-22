package zad2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ZipBombProfiling extends Thread{
	 
    private static int i = 0;;
 
    @Override
    public void run() {
        i++;
        DataOutputStream dos;
        try {
            System.out.println("tworzenie watku " + i);
            dos = new DataOutputStream(
            		new FileOutputStream("src/FILE" + i + ".dat"));
            for(int j = 0; j < 1000000; j++){
            	dos.write((int)Math.random() * 100);
            }
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
       
 
    }
 
}