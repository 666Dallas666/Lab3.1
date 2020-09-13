package com.company;
public class Circle {
    int length;
    int diameter;
    Circle(int длина, int диаметр){
        length = длина;
        diameter = диаметр;
    }
    public void setLength(int длина){
        length = длина;
    }
    public void setDiameter(int диаметр){
        diameter = диаметр;
    }
    public int getLength(){
        return length;
    }
    public int getDiameter(){
        return diameter;
    }
}
