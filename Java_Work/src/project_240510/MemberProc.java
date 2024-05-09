package project_240510;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MemberProc extends JFrame implements ActionListener {
    private JComboBox<String> pizzaComboBox;
    private JButton orderButton;

    public MemberProc() {
        setTitle("Pizza Order System");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Select Pizza:");
        
        pizzaComboBox = new JComboBox<>(new String[]{"Pepperoni", "Margherita", "Hawaiian"});
        orderButton = new JButton("Place Order");

        orderButton.addActionListener(this);

        panel.add(label);
        panel.add(pizzaComboBox);
        panel.add(orderButton);
        
        
        

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == orderButton) {
            String selectedPizza = (String) pizzaComboBox.getSelectedItem();
            JOptionPane.showMessageDialog(this, "You ordered " + selectedPizza + " pizza.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MemberProc::new);
    }
}
