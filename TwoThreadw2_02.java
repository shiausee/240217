
package twothreadw2_02;

public class TwoThreadw2_02 extends Thread {
public static void main(String[] args) {

   TwoThreadw2_02 t1 = new TwoThreadw2_02();
   t1.run();
  
}

public void run(){
try{
    for(int i=1;i<11;i++){
        System.out.print(i+" ");
        if(i==5){
            TwoThreadw2_02 t2 = new TwoThreadw2_02();
            t2.stringAL();
        }
    }
}catch (Exception e) {
        e.printStackTrace();
    }
}

public void stringAL(){
    for(int x=1; x<11 ;x++ ){
        System.out.print("W ");
    }
}
}