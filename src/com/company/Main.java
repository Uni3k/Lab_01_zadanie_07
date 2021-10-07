package com.company;

public class Main
{
    public static void main(String[] args) {
        //Obiekt klasy
        Liczba x = new Liczba(8);
        System.out.println("Pierwiastek kwadratowy liczby to : "+x.sqrt());
    }
}
class Liczba{
    int x;
    public Liczba(int x){
        this.x=x;
    }
    public double sqrt(){
        return Math.sqrt(x);
    }
}

