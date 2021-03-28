import javax.swing.*;
public class Table{
       JFrame f;
       JLabel contact;
       Table(){
       f=new JLabel("MY Contact"}
       String data[][]={{"At NO.1","Rahul","2624562"},
               {"At No.2","Honey","92426426"},
               {"At No.3","Aman","82762853"},
               {"At NO.4","Yash","75927296"},
               {"At No.5",Rohit",72928391"},
        String column[]={"POSITION","NAME","Number"};
        JTable jt=new JTable(data, column);
        JTable jt=new JTable(data, column);
    jt.setBounds(30,40,200,300);
    JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,400);
        f.setTitle("JTable") ;
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        }
        public static void main(String[] args){
        new Table();
        }
}