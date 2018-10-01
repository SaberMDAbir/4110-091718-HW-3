/*
MD Abir A. Choudhury
091718 - Exam
HW 3
A Class assessment is based on Three Examinations, Homework and 
a Final Project. The weight for each category is as follows: 
Exam 1, Exam 2 and Exam 3 Weight 45% of the overall grade, 
Homework Weight 25% and Final Project Weight 30%.
Write a Java Application that prompt the user to enter the three 
examinations (exam1, exam 2, and exam 3), homework and final 
project grades then calculate and display the overall grade along 
with a message as follow:
The message is “Excellent” if the overall grade is more than 90, 
“Good” if the overall grade is between 80 and 90, “Average” 
is the overall grade is between 70 and 80, and “Poor” if the 
overall grade is less than 70.
*/

import javax.swing.*;
import java.lang.String;
import java.text.DecimalFormat;

class Exam{
    public static void main(String[] args) {
        double exam1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the first exam score"));
        double exam2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the second exam score"));
        double exam3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the third exam score"));
        double homework = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the homework score"));
        double finalProject = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the final project score"));

        // calculate the grades according to the weight
        double finalGrade = (((.45 * exam1) + (.45 * exam2) + (.45 * exam3))/3) + (.25 * homework) + (.35 * finalProject);
        DecimalFormat df = new DecimalFormat("###.##");

        // check if the grade is Excellent, Good, Average, or Poor
        if (finalGrade >= 90) {
            JOptionPane.showMessageDialog(null, "Your grade is excellent. Your final grade is " + df.format(finalGrade));
        }
        else if (finalGrade < 90 && finalGrade >= 80) {
            JOptionPane.showMessageDialog(null, "Your grade is good. Your final grade is " + df.format(finalGrade));
        }
        else if (finalGrade < 80 && finalGrade >= 70) {
            JOptionPane.showMessageDialog(null, "Your grade is average. Your final grade is " + df.format(finalGrade));
        }
        else if (finalGrade < 70) {
            JOptionPane.showMessageDialog(null, "Your grade is poor. Your final grade is " + df.format(finalGrade));
        }
    } 
}
