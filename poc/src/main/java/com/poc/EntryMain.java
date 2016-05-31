package com.poc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EntryMain {

	public static void main(String args[]) throws IOException {  
        // We'll try all possibilities. We can not use new keyword here. Trying  
        // others.  
        // Try Class.forName()  
        int i = 0;  
        try {  
             @SuppressWarnings("unused")  
             Singleton singleton = (Singleton) Class.forName("com.poc.Singleton")  
                       .newInstance();  
        } catch (Exception e) {  
             e.printStackTrace();  
        }  
        Singleton singleton = Singleton.getInstance();  
        FileOutputStream fileOut = new FileOutputStream("singleton.ser");  
        ObjectOutputStream out = new ObjectOutputStream(fileOut);  
        out.writeObject(singleton);  
        out.close();  
        fileOut.close();  
        // Try deserialization  
        try {  
             FileInputStream fileIn = new FileInputStream("singleton.ser");  
             ObjectInputStream in = new ObjectInputStream(fileIn);  
             singleton = (Singleton) in.readObject();  
             in.close();  
             fileIn.close();  
        } catch (IOException ioe) {  
             ioe.printStackTrace();  
             return;  
        } catch (ClassNotFoundException c) {  
             c.printStackTrace();  
             return;  
        } catch (Exception e) {  
             e.printStackTrace();  
        }  
        // Try clone  
        try {  
             @SuppressWarnings("unused")  
             Singleton singleton2 = (Singleton) singleton.clone();  
        } catch (Exception e) {  
             e.printStackTrace();  
        }  
        // Try multi-threading  
        while (i < 10) {  
             Thread t = new Thread(new TrySingletonThread());  
             t.setName("Thread - " + i);  
             t.start();  
             i++;  
        }  
   }  
}
