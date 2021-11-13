package _04_hospital;

import javax.swing.JOptionPane;

public class test {
	

	public static int numFun(int num) {
	
        if (num / 10 == 0){

             return num; 
       } else {

             return (num % 10) + numFun(num / 10); 

       }

} 

}

