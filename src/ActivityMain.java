import alg.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

/**
 * @author Tom Keppeler tomkeppeler25gmail.com
 */

public class ActivityMain {
    private JButton selectionSortButton;
    private JButton insertionSortButton;
    private JButton bubbleSortButton;
    private JTextField textField1;
    private JTextArea textArea1;
    private JPanel panel;
    private JButton quickSortButton;
    private JButton mergeSortButton;
    private JButton heapSortButton;
    private JRadioButton zahlenRadioButton;
    private JRadioButton textRadioButton;

    ActivityMain(){
            selectionSortButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(zahlenRadioButton.isSelected()){
                        String[] temp = textField1.getText().trim().split(",");
                        Integer[] l = new Integer[temp.length];
                        for (int i = 0; i < temp.length; i++) {
                           l[i] = Integer.parseInt(temp[i].trim());
                        }
                        textArea1.setText(new SelectionSort<Integer>().call(l));
                    }else{
                        String[] temp = textField1.getText().trim().split(",");
                        String[] l = new String[temp.length];
                        for (int i = 0; i < temp.length; i++) {
                            l[i] = temp[i].trim();
                        }
                        textArea1.setText(new SelectionSort<String>().call(l));
                    }
                }
            });

            insertionSortButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(zahlenRadioButton.isSelected()) {
                        String[] temp = textField1.getText().trim().split(",");
                        Integer[] l = new Integer[temp.length];
                        for (int i = 0; i < temp.length; i++) {
                            l[i] = Integer.parseInt(temp[i].trim());
                        }
                        String tmp = new InsertSort<Integer>().call(l);
                        textArea1.setText(tmp);
                    }else{
                        String[] temp = textField1.getText().trim().split(",");
                        String[] l = new String[temp.length];
                        for (int i = 0; i < temp.length; i++) {
                            l[i] =temp[i].trim();
                        }
                        String tmp = new InsertSort<String>().call(l);
                        textArea1.setText(tmp);
                    }
                }
            });

            bubbleSortButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(zahlenRadioButton.isSelected()) {
                        String[] temp = textField1.getText().trim().split(",");
                        Integer[] l = new Integer[temp.length];
                        for (int i = 0; i < temp.length; i++) {
                            l[i] = Integer.parseInt(temp[i].trim());
                        }
                        textArea1.setText(new Bubblesort<Integer>().sortBubble(l));
                    }else{
                        String[] temp = textField1.getText().trim().split(",");
                        String[] l = new String[temp.length];
                        for (int i = 0; i < temp.length; i++) {
                            l[i] = temp[i].trim();
                        }
                        textArea1.setText(new Bubblesort<String>().sortBubble(l));
                    }
                    }
            });

            quickSortButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(zahlenRadioButton.isSelected()) {
                        String[] temp = textField1.getText().trim().split(",");
                        Integer[] l = new Integer[temp.length];
                        for (int i = 0; i < temp.length; i++) {
                            l[i] = Integer.parseInt(temp[i].trim());
                        }
                        textArea1.setText(new QuickSort<Integer>().sortQuick(l));
                    }else{
                        String[] temp = textField1.getText().trim().split(",");
                        String[] l = new String[temp.length];
                        for (int i = 0; i < temp.length; i++) {
                            l[i] = temp[i].trim();
                        }
                        textArea1.setText(new QuickSort<String>().sortQuick(l));
                    }
                }
            });

            mergeSortButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(zahlenRadioButton.isSelected()){
                        String[] temp = textField1.getText().trim().split(",");
                        Integer[] l = new Integer[temp.length];
                        for (int i = 0; i < temp.length; i++) {
                            l[i] = Integer.parseInt(temp[i].trim());
                        }
                        textArea1.setText(new Mergesort<Integer>().sortMerge(l));
                    }else{
                        String[] temp = textField1.getText().trim().split(",");
                        String[] l = new String[temp.length];
                        for (int i = 0; i < temp.length; i++) {
                            l[i] = temp[i].trim();
                        }
                        textArea1.setText(new Mergesort<String>().sortMerge(l));
                    }
                }

            });

            heapSortButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(zahlenRadioButton.isSelected()){
                        String[] temp = textField1.getText().trim().split(",");
                        Integer[] l = new Integer[temp.length];
                        for (int i = 0; i < temp.length; i++) {
                            l[i] = Integer.parseInt(temp[i].trim());
                        }
                        textArea1.setText(new Heapsort<Integer>().call(l));
                    }else{
                        String[] temp = textField1.getText().trim().split(",");
                        String[] l = new String[temp.length];
                        for (int i = 0; i < temp.length; i++) {
                            l[i] = temp[i].trim();
                        }
                        textArea1.setText(new Heapsort<String>().call(l));
                    }
                }
            });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("ADG Rechner");
        frame.setContentPane(new ActivityMain().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
