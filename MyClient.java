import java.io.*;
import java.net*;
public class MyClient  {
public static void main(String[] args)  {
try{
Socket s=new Socket("localhost",8888);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
dout.writeUTF("Hello to Server from Client");
dout.flush();
dout.close();
s.close();
}cactch(Exception e) {System.out.println(e);}
}
}