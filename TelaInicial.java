import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class TelaInicial extends JFrame
{
    
    private ArrayList<JButton> buttons = new ArrayList<JButton>();
    public TelaInicial(){
        super("Tela Inicial - Seja Bem vindo!");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(640, 480));
        AddButtons();
        this.pack();
        this.setVisible(true);
    }
    
    
    private void AddButtons(){
       buttons.add(new JButton("One"));
       buttons.add(new JButton("Two"));
       buttons.add(new JButton("Three"));
       buttons.add(new JButton("Four"));
       
       for(JButton button : buttons){
           button.setSize(50, 50);
           this.add(button);
       }
    }
}
