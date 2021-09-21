import alg.Bubblesort;
import alg.InsertSort;

import alg.QuickSort;
import alg.SelectionSort;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    ActivityMain(){

        selectionSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String uebergabe = textField1.getText();
                uebergabe = uebergabe.trim();
                //uebergabe = uebergabe.replaceAll(",", "");
                String[] temp = uebergabe.split(",");
                Integer[] l = new Integer[temp.length];
                for (int i = 0; i < temp.length; i++) {
                    l[i] = Integer.parseInt(temp[i]);
                }
                textArea1.setText(new SelectionSort().call(l));
            }
        });
        insertionSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] temp = textField1.getText().trim().split(",");
                Integer[] l = new Integer[temp.length];
                for (int i = 0; i < temp.length; i++) {
                    l[i] = Integer.parseInt(temp[i]);
                }
                textArea1.setText(new InsertSort().call(l));
            }
        });

        bubbleSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] temp = textField1.getText().trim().split(",");
                Integer[] l = new Integer[temp.length];
                for (int i = 0; i < temp.length; i++) {
                    l[i] = Integer.parseInt(temp[i]);
                }
                textArea1.setText(new Bubblesort().sortBubble(l));
            }
        });
        quickSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String uebergabe = textField1.getText();
                uebergabe = uebergabe.trim();
                String[] temp = uebergabe.split(",");
                Integer[] l = new Integer[temp.length];
                for (int i = 0; i < temp.length; i++) {
                    l[i] = Integer.parseInt(temp[i]);
                }
                textArea1.setText(new QuickSort().sortQuick(l));
            }
        });
        mergeSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("ADG");
        frame.setContentPane(new ActivityMain().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 750);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
