package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    System.out.println("Hello, Alexei!");

    Point p1 = new Point(9, -1);
    Point p2 = new Point(2, -25);

    System.out.println("Расстояние между двумя точками "
            + "(" + p1.x + "," + p1.y + ")"
            + " и " + "(" + p2.x + "," + p2.y + ")"
            + " = " + p1.distance(p2));
  }

}