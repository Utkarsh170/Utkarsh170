import java.awt.*;
import java.awt.event.*;
public class ButtonEx2{
    public class void main(String args[]){
        Frame F=new Frame("Button Example");
        final TextField tf=new TextField();
        tf.setBounds(50,100,80,30);
        Button b=new Button("click here");
        b.setBounds(50,100,80,30);
        b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            tf.setText("Welcome to Javatpoint");
        }
        } );
        f.add(b);f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        F.setVisble(true);
    }
}           