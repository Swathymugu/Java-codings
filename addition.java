import java.io.*;
class Add 
{
 public static void main(String arg[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter a,b");
  int a=Integer.parseInt(br.readLine());
  int b=Integer.parseInt(br.readLine());
  int c =a+b;
  System.out.println(c);
 }
}