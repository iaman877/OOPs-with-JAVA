public class WrapperToPri
{
   public static void main(String args[]){
   //Converting Integer to int
   Integer a=new Integer(3);
   int i=a.intValue();//converting Integer to int
   int j=a;//unboxing, now compiler will write a.intValue() internally
   System.out.println(a);
   System.out.println(i);
   System.out.println(j);
 }

}
