/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

public class Week1 extends Thread {

    
    public static void main(String[] args) {
        new Thread(new Week1()).start();
    }
    
    public void run(){
    try{
        for(int i=1;i<101;i++){
            System.out.println(i);
            sleep(5000);
            if((i%50)==0){
                System.out.println("Welcome to Java");
                        
            }
            
        }
    }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
