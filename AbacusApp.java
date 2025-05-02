import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AbacusApp extends JFrame {
    private Abacus abacus;

    private JTextField input1;
    private JTextField input2;
    private JLabel resultLabel;

    public AbacusApp() {
        abacus = new Abacus(5);

        setTitle("Chinese Abacus Simulator");
        setSize(400, 300);
        setLayout(new FlowLayout());

        input1 = new JTextField(5);
        input2 = new JTextField(5);
        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");
        JButton multiplyButton = new JButton("Multiply");
        JButton divideButton = new JButton("Divide");
        resultLabel = new JLabel("Result: ");

        add(input1);
        add(input2);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(resultLabel);

        addButton.addActionListener(e -> doOperation("+"));
        subtractButton.addActionListener(e -> doOperation("-"));
        multiplyButton.addActionListener(e -> doOperation("*"));
        divideButton.addActionListener(e -> doOperation("/"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

   
}
