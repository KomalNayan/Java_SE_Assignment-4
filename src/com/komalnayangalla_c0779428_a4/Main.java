package com.komalnayangalla_c0779428_a4;

import java.util.*;
import javax.swing.*;

public class Main {
    public void login()
    {
        String userName = "Will1234";
        String password = "12345678";
        int trials = 1;

        String un = JOptionPane.showInputDialog("Enter Username :");
        String pass = JOptionPane.showInputDialog("Enter Password :");
        while( !(un.equals(userName) && pass.equals(password)) && trials < 2)
        {
            trials++;
            JOptionPane.showMessageDialog(null,"Incorrect Credentials!\nEnter Again..");
            un = JOptionPane.showInputDialog("Enter Username :");
            pass = JOptionPane.showInputDialog("Enter Password :");
        }
        if(trials >= 2)
        {
            JOptionPane.showMessageDialog(null,"Entered Incorrect Credentials 2 times\nAccess Denied!");
            System.exit(1);
        }
        else {
            String day = JOptionPane.showInputDialog("To find Meeting Schedule\nEnter day of the week :");
            if(day.equalsIgnoreCase("Monday"))
                JOptionPane.showMessageDialog(null,"Day : Monday\nMeeting Time : 8 - 10 A.M.");
            else if(day.equalsIgnoreCase("Tuesday"))
                JOptionPane.showMessageDialog(null,"Day : Tuesday\nMeeting Time : 2 - 4 P.M.");
            else if(day.equalsIgnoreCase("Wednesday"))
                JOptionPane.showMessageDialog(null,"Day : Wednesday\nMeeting Time : 1 - 3 P.M.");
            else if(day.equalsIgnoreCase("Thursday"))
                JOptionPane.showMessageDialog(null,"Day : Thursday\nNo Meeting");
            else if(day.equalsIgnoreCase("Friday"))
                JOptionPane.showMessageDialog(null,"Day : Friday\nMeeting Time : 8 - 10 A.M. \n & 5 - 6 P.M.");
            else if(day.equalsIgnoreCase("Saturday"))
                JOptionPane.showMessageDialog(null,"Day : Saturday\nHoliday!");
            else if(day.equalsIgnoreCase("Sunday"))
                JOptionPane.showMessageDialog(null,"Day : Sunday\nHoliday!");
            else
                JOptionPane.showMessageDialog(null,"Enter a valid day of the week!");
        }

    }
    public static void main(String[] args) {

        Main m = new Main();
        int ch = 0;
        while (true)
        {
            try {
                ch = Integer.parseInt(JOptionPane.showInputDialog("Choose one of the following..\n1.) Login\n2.) Exit \n\n Enter your choice:"));
            }
            catch (Exception e)
            {
                ch = 6;
            }
            switch (ch)
            {
                case 1:
                    m.login();
                    break;
                case 2:
                    System.exit(1);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Enter 1 or 2 !");
                    break;

            }
        }


        }

}

