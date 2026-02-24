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

    public Complex multiply(Complex other) {
        double real = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginary = (this.imaginary * other.real) + (this.real + other.imaginary);
        return new Complex(real, imaginary);
    }

    public Complex divide(Complex other) {
        double dividedImaginary = ((this.real * other.real) + (this.imaginary * other.imaginary)) + ((this.imaginary * other.real) - (this.real * other.imaginary));
        double dividedReal = Math.pow(other.real, 2) + Math.pow(other.imaginary, 2);
        return new Complex(dividedImaginary, dividedReal);
    }

    public Complex abs() {
        double real = Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2));
        return new Complex(real, 0);
}