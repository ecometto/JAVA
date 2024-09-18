package org.example;

import util.MathUtil;
import week2.Shapes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        System.out.println(MathUtil.isEven(5));
        System.out.println("--------------");

        System.out.println(MathUtil.isPrime(13));
        System.out.println("--------------");

        MathUtil.listOfPrimes(100);
        System.out.println("--------------");

        Shapes.shape1();
        System.out.println("--------------");

        Shapes.shape2();
        System.out.println("--------------");

        Shapes.shape3();
        System.out.println("--------------");

    }
}
