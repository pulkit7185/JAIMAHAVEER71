import java.util.Scanner;
class Active21
{
 public static void main(String[] args)
 {
  int size ,i;
  System.out.println("enter size of an array");
  Scanner sc=new Scanner(System.in);
  size=sc.nextInt();
  
  int a[]=new int[size];
  
  for(i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
   }
  System.out.println("printed value's are");
  
   for(i=0;i<size;i++)
  {
   System.out.println(a[i]+" ");
   }
  System.out.println("hence proved");
 }
} 
  