package ua.ithillel.java;

import java.util.Arrays;

public class Food {
    // ctrl + alt + L
    public static void main(String[] args) {
        // ctrl + alt + L
        String[] fruit = new String[6];
        fruit[0] = "1.Banana";
        fruit[1] = "2.Apple";
        fruit[2] = "3.Grapes";
        fruit[3] = "4.Lemon";
        fruit[4] = "5.Melon";
        fruit[5] = "6.Mango";
        System.out.println(Arrays.toString(fruit));

        String[] food = (String[]) Arrays.copyOf(fruit, fruit.length);
        System.out.println(Arrays.toString(food));
            }
        }
