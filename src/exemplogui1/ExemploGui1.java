package exemplogui1;

import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JFrame;


public class ExemploGui1 {

    
    public static void main(String[] args) {
        JFrame marco = new JFrame("primeiro programa Gui1");
        marco.setSize(600,800);
        
        JDialog venta2 = new JDialog (marco);
        venta2.setBounds(10, 200, 200, 200);
        venta2.setBackground(Color.ORANGE);
        venta2.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
    }                      
    }
    


