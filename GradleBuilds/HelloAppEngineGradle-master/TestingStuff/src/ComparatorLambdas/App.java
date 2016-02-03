/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComparatorLambdas;

/**
 *
 * @author mhunter
 */

//
//                System.out.println("helloThere");
//                System.out.println("this is code passed in a lambda expression");

public class App {
    
        public static void main(String[] args){
            Runner runner = new Runner();
            runner.run(new Executable() {
                @Override
                public void execute() {
                    System.out.println("hello there.");
                }
            });
            
            System.out.println("=========");
            runner.run(()-> {
                System.out.println("helloThere");
                System.out.println("this is code passed in a lambda expression");
            });
            
        }
    }

class Runner {
    public void run(Executable e){
        System.out.println("Executing code block ...");
        e.execute();
    };
}

//a functional interface is one that has only one method...
interface Executable{
    void execute();
}