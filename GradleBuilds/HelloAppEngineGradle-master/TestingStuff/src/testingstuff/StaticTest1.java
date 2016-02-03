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
public class StaticTest1 {
    static int count;
    static {count = 0;}
    
    StaticTest1(){
        count++;
    }
    
    public static void main(String[] args){
        count++;
        StaticTest1 mother = new StaticTest1();
        StaticTest1 father = new StaticTest1();
        StaticTest1 fawn = new StaticTest1();
        System.out.println(father.count);
    }
}
