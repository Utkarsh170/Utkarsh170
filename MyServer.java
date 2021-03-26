import java.io.*;
import java.net.*;
public class MyServer   {
public static void main(String[] args) {
try[
ServerSocket ss=new ServerSocket(9999);
Socket s=ss.accept();//establishes connection
DataInputStream dis=new DataInputStream(s.getInputStream());
String str=(String)dis.readUTF();
System.out.printIn("massage= "+str);
ss.close();
}catch(Exception e) {System.out.println(e); }
}
}