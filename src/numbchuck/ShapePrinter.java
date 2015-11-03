/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbchuck;

/**
 *
 * @author Alex Parks
 */
public class ShapePrinter {

    public static void printSquare(int size) {
        printRectangle(size, size);
    }

    public static void printRectangle(int height, int width) {
        System.out.println("In print rectangle");
       

        for (int row = 0; row <= height; row++) {
            for (int column = 0; column < width; column++) {
                System.out.print("l0l0");

            }
            System.out.println("");

        }
    }

}
