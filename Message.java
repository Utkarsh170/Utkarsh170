import java.awt.*;
import java.awt.event.*;
class Message extends Frame{
//closing the frame 
Message(){
this.addWindowListener(new WindowAdpter(){
public void windowClosing(WindowEvent e){
    system.exit(0);
}
});
}
public void paint(Graphics g){
    this.setBackgroud'(new Color(80,20,20);
    Font f=new Font("Arial",Font,BOLD,30);
    g.setFont(f);
    g.setColor(Color.green);
    g.drawString(" Hello World! ",65,130);
}
public static void main(String[] args){
    Message m= Message();
    m.setTitle("Message");
    m.setVisible(true);
    m.setSize(400,300);
}
}