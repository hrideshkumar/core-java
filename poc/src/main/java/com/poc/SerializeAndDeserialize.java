package com.poc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeAndDeserialize {

	public void writeobj(Object e) {

		try {
			FileOutputStream fileOut = new FileOutputStream("D:/mywork/poc/employee.seri");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in /tmp/employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
	public Singletone readobj() {
		Singletone e = null; 
		try {
			FileInputStream fileOut = new FileInputStream("D:/mywork/poc/employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileOut);
			e = (Singletone) in.readObject();
			System.out.println("obj saved.");
		} catch (IOException i) {
			i.printStackTrace();
		}catch (ClassNotFoundException i) {
			i.printStackTrace();
		}
		return e;
	}
}
