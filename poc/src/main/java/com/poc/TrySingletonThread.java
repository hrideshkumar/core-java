package com.poc;

public class TrySingletonThread implements Runnable {

	
    public void run() {  
         System.out.println(Thread.currentThread().getName()  
                   + " got singleton with ID: "  
                   + Singleton.getInstance().hashCode());  
    }  

	
}
