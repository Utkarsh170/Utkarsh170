import java.awt.event.*.;
class Outer implement ActionListener{
    AEvent2 obj;
    Outer(AEvent2){
        this.obj=obj;
    }
    public void actionPerformed(ActionEvent e){
        obj.tf.setText("Welcome");
    }
}