class Stringcomparison4{  
 public static void main(String args[]){  
   String s1="Satish";  
   String s2="Satish";  
   String s3="Kumar";  
   System.out.println(s1.compareTo(s2));//0  
   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
 }  
}  
