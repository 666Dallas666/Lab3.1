package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CircleTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину окружности:");
        String tester = reader.readLine();
        int test = Integer.parseInt(tester);
        System.out.println("Ведите диаметр окружности:");
        String tester1 = reader.readLine();
        int test1 = Integer.parseInt(tester1);
        Circle Test = new Circle(test, test1);
        Test.setDiameter(test1);
        Test.setLength(test);
        System.out.println("Диаметр окружности: " + Test.getDiameter());
        System.out.println("Длина окружности: " + Test.getLength());
    }
}
