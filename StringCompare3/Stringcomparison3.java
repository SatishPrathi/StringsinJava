class Stringcomparison3{  
 public static void main(String args[]){  
   String s1="Satish";  
   String s2="Satish";  
   String s3=new String("Satish");  
   System.out.println(s1==s2);//true (because both refer to same instance)  
   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
 }  
}  
