package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Bonjour depuis Maven et Git!");
        System.out.println("TP1 DevOps - Académie Mohammed VI Aviation Civile");
        
        // Exemple de méthode
        App app = new App();
        System.out.println("Résultat : " + app.addNumbers(5, 3));
    }
    
    public int addNumbers(int a, int b) {
        return a + b;
    }
}
