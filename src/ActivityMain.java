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

    ActivityMain() {
        selectionSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (zahlenRadioButton.isSelected()) {
                    textArea1.setText(new SelectionSort<Integer>().call(getIntField1()));
                } else {
                    textArea1.setText(new SelectionSort<String>().call(getTextField1()));
                }
            }
        });

        insertionSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (zahlenRadioButton.isSelected()) {
                    textArea1.setText(new InsertSort<Integer>().call(getIntField1()));
                } else {
                    textArea1.setText(new InsertSort<String>().call(getTextField1()));
                }
            }
        });

        bubbleSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (zahlenRadioButton.isSelected()) {
                    textArea1.setText(new Bubblesort<Integer>().sortBubble(getIntField1()));
                } else {
                    textArea1.setText(new Bubblesort<String>().sortBubble(getTextField1()));
                }
            }
        });

        quickSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (zahlenRadioButton.isSelected()) {
                    textArea1.setText(new QuickSort<Integer>().sortQuick(getIntField1()));
                } else {
                    textArea1.setText(new QuickSort<String>().sortQuick(getTextField1()));
                }
            }
        });

        mergeSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (zahlenRadioButton.isSelected()) {
                    textArea1.setText(new Mergesort<Integer>().sortMerge(getIntField1()));
                } else {
                    textArea1.setText(new Mergesort<String>().sortMerge(getTextField1()));
                }
            }

        });

        heapSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (zahlenRadioButton.isSelected()) {
                    textArea1.setText(new Heapsort<Integer>().call(getIntField1()));
                } else {
                    textArea1.setText(new Heapsort<String>().call(getTextField1()));
                }
            }
        });
    }

    protected String[] getTextField1() {
        String[] a = textField1.getText().trim().split(",");
        String[] l = new String[a.length];
        int i = 0;
        for (String s : a) {
            l[i++] = s.trim();
        }
        return l;
    }

    protected Integer[] getIntField1() {
        String[] a = textField1.getText().trim().split(",");
        Integer[] l = new Integer[a.length];
        int i = 0;
        for (String s : a) {
            l[i++] = Integer.parseInt(s.trim());
        }
        return l;
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
