import java.awt.*;
import java.awt.event.*;
public class labelEx2 extends Frame implements   ActionListener{
    TextField tf;Label l;Button b;
    LabelEx2()[
        tf=new TextField();
        tf.setBounds(50,50,150,20);
        l=new Label();
        l.setBounds(50,100,250,20);
        b=new Button("Find IP");
        b.setBounds(50,150,60,30);
        b.addActionListener(this);
        add(b);add(tf);add(1);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
}
public void actionPerformed(ActionEvent e){
    try{
        String host=tf.getText();
        String ip=java.net.InetAddress.getByName(host).getHostAddress();
        l.setText("IP of"+ host+ "+ip);
    }
    catch(Exception ex)
    {
        System.out.println(ex);
    
    }
}
    public static void main(String[]args){
        new LabelEx2();
    }
}