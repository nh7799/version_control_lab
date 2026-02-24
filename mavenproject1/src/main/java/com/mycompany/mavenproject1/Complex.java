/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author nohimhasitha
 */
public class Complex {

    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(double real) {

        this.real = real;

    }

    public double getRealPart() {

        return this.real;

    }

    public double getImaginaryPart() {
        return this.imaginary;
    }

    public Complex add(Complex other) {
        double sumImaginary = this.imaginary + other.imaginary;
        double sumReal = this.real + other.real;
        return new Complex(sumReal, sumImaginary);
    }

    public Complex Subtract(Complex other) {
        double subtractedImaginary = this.imaginary - other.imaginary;
        double subtractedReal = this.real - other.real;
        return new Complex(subtractedReal, subtractedImaginary);
    }
    
    public Complex multiply(Complex other){
        double multipliedImaginary = this.imaginary * other.imaginary;
        double multipliedReal = this.real * other.real;
        return new Complex(multipliedReal,multipliedImaginary);
    }
    
    public Complex divide(Complex other){
        double dividedImaginary = this.imaginary / other.imaginary;
        double dividedReal = this.real / other.real;
        return new Complex(dividedImaginary,dividedReal);
    }
    
    public Complex abs(){
       
    }

}
