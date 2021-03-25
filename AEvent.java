import java.awt.*;
import java.awt.event.*;
class AEvent extends Frame implement ActionListtener{
    TextField tf;
    AEvent(){

        //    create components 
          tf=new Textfield();
          tf.setBounds(60,50,170,20);
          Button b= new Button("Click Me");
          b.setBounds(100,120,80,30);


          //
            b.addActionListener(this); //

            add(b);add(tf);
            setSize(300,300);
            setLayout(null);
            setVisble(true);
    }

    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome");
    }
    public static void main(String args[]){
        new AEvent();
    }
}


    