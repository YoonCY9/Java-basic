package oop.ex;

public class RectangleOopMain {

    public static void main(String[] args) {
        Reactangle reactangle = new Reactangle();
        reactangle.width = 6;
        reactangle.height = 8;

        int area = reactangle.calculateArea(reactangle.width, reactangle.height);
        System.out.println("넓이: " + area);



    }
}
