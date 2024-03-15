import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class Third {
    public static void main(String[] args) {
        
    JFrame f = new JFrame("==Sovle Equation==");

    JLabel l1 = new JLabel("--Find roots of equation aX^2 + bX + c = 0 --");
    l1.setBounds(30, 20, 300, 35);
    f.add(l1);

    JLabel a = new JLabel("Enter value a : ");
    a.setBounds(30, 40, 300, 35);
    f.add(a);

    JTextField j1 = new JTextField(); 
    j1.setBounds(30, 70, 250, 25);
    f.add(j1);

    JLabel b = new JLabel("Enter value b : ");
    b.setBounds(30, 100, 300, 35);
    f.add(b);

    JTextField j2 = new JTextField(); 
    j2.setBounds(30, 130, 250, 25);
    f.add(j2);

    JLabel c = new JLabel("Enter value c : ");
    c.setBounds(30, 160, 300, 35);
    f.add(c);

    JTextField j3 = new JTextField(); 
    j3.setBounds(30, 190, 250, 25);
    f.add(j3);

    JLabel result = new JLabel("Result: ");
    result.setBounds(30, 220, 300, 25);
    f.add(result);

    JButton B = new JButton("Find");
    B.setBounds(30, 260, 70, 35);
    B.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(j1.getText());
                double b = Double.parseDouble(j2.getText());
                double c = Double.parseDouble(j3.getText());
                
                double discriminant = b * b - 4 * a * c;
    
                if (discriminant > 0) {
                    float root1 = (float) ((-b + Math.sqrt(discriminant)) / (2 * a));
                    float root2 = (float) ((-b - Math.sqrt(discriminant)) / (2 * a));
    
                    result.setText("Roots are: X1 = " + root1 + " and X2 = " + root2);
                
                }
                else if (discriminant == 0){
                    float root = (float) (-b/(2*a));
                    result.setText("Root are X =  " + root);
                } 
                else {
                    result.setText("The equation has no real roots");
                }
            }
         
    });

    f.add(B);
    f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);
    f.getContentPane().setBackground(Color.LIGHT_GRAY);

    }

}
