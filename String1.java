import java.util.*;
class String1
{
     
  public static void main(String argv[])
  {
      String reverse=new String();
      String str="Nirma University";
      System.out.print("String is: ");
      System.out.println(str);

      for(int i = str.length() - 1; i >= 0; i--)
      {
        reverse = reverse + str.charAt(i);
      }
      
      System. out. print("Reversed string is:");
      System. out. println(reverse);

      System.out.print("Replaced String : ");
      System.out.println("ab" + str.substring(2,16));

      System.out.println("Contains SubString 'Uni' : " + str.contains("Uni"));
      System.out.println("Contains SubString 'rma' : " + str.contains("rma"));


      // Using String Buffer

      StringBuffer S = new StringBuffer(str);
      System.out.println("Reverse of String is: " + S.reverse().toString());
  }
  
}