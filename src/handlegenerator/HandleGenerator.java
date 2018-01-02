package handlegenerator;

import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class HandleGenerator {
    public HandleGenerator(int numHandleElements,int numHandles) {
        createWordList();
        JTextArea output = new JTextArea();
        Random randomNumberGenerator = new Random();
        for( int i=0; i<numHandles; i++ ) {
            for( int j=0; j<numHandleElements; j++ ) 
                output.append( new String(" "+wordList[randomNumberGenerator.nextInt(wordList.length)]) );
            output.append( new String("\n") );
        }
	JScrollPane outputJScrollPane = new JScrollPane( 
                output, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        outputJScrollPane.setPreferredSize( new Dimension(100,295) );
        JOptionPane.showMessageDialog(null, outputJScrollPane);
    }
    private void createWordList() {
        wordList = new String[0];
        try {
            FileInputStream file = new FileInputStream("lib/words"); // file for read
            byte[] bytes = new byte[file.available()]; // make array appropriate size
            file.read(bytes);
            file.close(); // read file and close
            String fileString = new String(bytes); // convert file to one string
            wordList = fileString.split("\\s"); // split on whitespace for names
        } catch( Exception ex ) { JOptionPane.showMessageDialog(null, ex.getMessage()); }
    }
    private String[] wordList;
}
