import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Add the import statement for the Lista class

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JTextField textField = new JTextField(20);
        textField.setBounds(50, 50, 200, 30);
        frame.add(textField);

        JButton button = new JButton("Submit");
        button.setBounds(50, 100, 200, 30);
        frame.add(button);

        Lista<String> lista = new Lista<>();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                lista.add(input);
                textField.setText("");
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
