package com.example.app;

class Calculator {
    int a;
    int b;
    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int Add() {
        return a + b;
    }
    public int Subtract() {
        return a - b;
    }
    public int Multiply() {
        return a * b;
    }
    public int Divide() {
        return a / b;
    }    
}

public class App 
{
    public static void main( String[] args )
    {
        Calculator c = new Calculator(4, 4);
        System.out.println(c.Add() + " " + c.Divide() + " " + c.Subtract() + " " + c.Multiply());
        return;
    }
}
