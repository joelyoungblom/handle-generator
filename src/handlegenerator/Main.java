package handlegenerator;

import handlegenerator.HandleGenerator;
import javax.swing.*;

public class Main {
    public Main() { }
    public static void main( String[] args ) {
        int numHandleElements = Integer.parseInt( 
                JOptionPane.showInputDialog(null, new String("How many words in your handle?")));
        int numHandles = Integer.parseInt( 
                JOptionPane.showInputDialog(null, new String("How many handles do you want?")));
        JOptionPane.showMessageDialog(
                null, new String("Please wait while " + numHandles + " " 
                + numHandleElements + " element handles are generated."));
        HandleGenerator hg = new HandleGenerator(numHandleElements,numHandles);
    }
}
