import java.awt.*;
import javax.swing.*;
public class TabbedEx extends JFrame{
       TabbedEx(){
       Container c1=getContentPane();
       jTabbedPane j1=new JTabbedPane();
       j1.addTab("Country",new Country());
       j1.addTab("Capitals",new Capital());
       j1.addTab("Population",new Population());
       c1.add(j1);
       }
public static void main(String[] args)  {
       TabbedEx obj=new TabbedEx();
       obj.setSize(300,300);
       obj.setTittle("Tabbed Pane Example");
       obj.setDefulatCloseOperation(JFrame.EXIT_ON_CLOSE);
       obj.setVisible(true);
}
}
class Country extends JPane{
      String listitems[]={"India",Australia","USA","Dubai"};
      Country(){
      JList b1=new JList(listitems);
      add(b1);
      }
}
class Capital extends JPanel{
    String listitems[]={"Delhi","Canberra","Washington DC","Abu Dhabi"};
    Capital(){
    Jlist b2=new JList(listitems);
    add(b2);
    }
}
class Populationt extends JPanel{
      String listitems[]={"1.3 Billion","25 Million","320 Millon","3 Million"};
      Population(){
      JList b3=new Jlist(listitems);
      add(b3);
}       