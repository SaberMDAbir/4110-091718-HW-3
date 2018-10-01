/*
MD Abir A. Choudhury
091718 - Calories
HW 3
*/

import javax.swing.*;
import java.lang.String;

class Calories{
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "This program will calculate the number of 230 calories in the candy bars to eat to maintain your weight.", "Introduction", JOptionPane.PLAIN_MESSAGE);
        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age in years?"));
        int height = Integer.parseInt(JOptionPane.showInputDialog("What is your total height in inches?"));
        int weight = Integer.parseInt(JOptionPane.showInputDialog("What is your weight in pounds?"));
        String gender = JOptionPane.showInputDialog("What is your gender? Enter 'M' for male calculation or 'F' for female calculation.");
        // do some error check

        double calories = 0.00;
        if(gender.equals("M")) {
            calories = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
            JOptionPane.showMessageDialog(null, "A male with those measurements should eat " + (calories / 230) + " candy bars per day to maintain his weight.");
        }
        else if(gender.equals("F")) {
            calories = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
            JOptionPane.showMessageDialog(null, "A female with those measurements should eat " + (calories / 230) + " candy bars per day to maintain her weight."); 
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid Entry");
            System.exit(0);
        }
    }
}