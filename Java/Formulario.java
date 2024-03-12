import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame{
    private JTextField textField1;
    private JTextArea textarea1;

    public Formulario(){
      setLayout(null);
      
      textfield1 = new JTextField();
      textfield1.setBounds(10,10,200,30);
      add(textfield1);
      
      textarea1 = new JTextArea();
      textarea1.setBounds(10,50,400,300);
    }

    public static void main(String[] args) {
      Formulario Formularioulario1 = new Formulario();
      Formularioulario1.setBounds(0,0,540,400);
      Formularioulario1.setVisible(true);
      Formularioulario1.setResizable(false);
      Formularioulario1.setLocationRelativeTo(null);
    }        
}

