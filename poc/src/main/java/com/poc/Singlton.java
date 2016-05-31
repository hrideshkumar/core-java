package com.poc;

import java.io.Serializable;

class Singleton implements Cloneable, Serializable { 

	private static final long serialVersionUID = 1L;  
     
    private static Singleton instance;  
     
    private Singleton() {  
       
    }  
     
    public static Singleton getInstance() {  
         if (instance == null) {  
              synchronized (Singleton.class) {  
                   // Double checked thread locking  
                   if (instance == null) {  
                        instance = new Singleton();  
                   }  
              }  
         }  
         return instance;  
    }  
     
    protected Object clone() throws CloneNotSupportedException {  
        //return  instance;
    	throw new CloneNotSupportedException("Singleton class cannot be cloned");  
    }  
    
    public final Object readObject() {  
         return getInstance();  
    }  
}
