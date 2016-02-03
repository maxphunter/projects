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
public class RunnableTest {
    public static void main(String[] args){
        System.out.println("===Runnable Test===");
        
        //Anonymous Runnable
        Runnable r1= new Runnable(){
          @Override
          public void run(){
              System.out.println("Hello World one!");
          }
        };
      
        // Lambda Runnable
        Runnable r2 = () -> System.out.println("Hello world two!");
        
        r1.run();
        r2.run();
    }
}
