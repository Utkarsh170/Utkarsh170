import java.awt.*;
class labelEx{
    public staticvoid main(String args[]){
        Frame f=new Frame("Label Example");
        Label l1,l12;
        l1=new Label("First Label.");
        l1.setBounds(60,110,110,40);
        l2=new Label("Second Label.");
        l2.setBounds(60,160,120,40);
        f.add(l1);f.add(l2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setvisible(true);
    }
}        

