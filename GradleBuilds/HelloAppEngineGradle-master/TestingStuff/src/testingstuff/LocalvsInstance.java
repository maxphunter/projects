/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingstuff;

/**
 *
 * @author mhunter
 */
public class LocalvsInstance {
    
        String instance1;
        int instance2;
        double instance3;
    public static void main(String[] args){
        
        
        LocalvsInstance LVI = new LocalvsInstance();
        
        System.out.println(LVI.instance1);
        System.out.println(LVI.instance2);
        System.out.println(LVI.instance3);
        
        
        
    }
    
    public void doStuff(){
        instance1 = "HI";
        instance2 = 3;
        instance3 = 3.2;
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);
    }
}
