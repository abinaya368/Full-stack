package programs;

public class Operators {
    public void main(String[] args) {
       int a=5, b=8;
       
       //Arithmetic
       System.out.println("Addition"+(a+b));
       System.out.println("SUbtraction"+(a-b));
	   System.out.println("multiplication"+(a*b));
    
       //Relational
	   System.out.println("Equal to"+(a+b));
       System.out.println("Not equal"+(a-b));
	   System.out.println("Greater than"+(a*b));
       System.out.println("Less than"+(a<=b));	
       
       //Logical
       boolean condition1 = true, condition2 = false;   //false(0) true(1)
    
       System.out.println("Logical AND"+(condition1 && condition2));
       System.out.println("Logical OR"+(condition1 || condition2));
       System.out.println("Logical NOT"+(!condition1));
       
       //unary(5 types)
       System.out.println("unary negation:"+(~a));
       System.out.println("unary negation:"+(~b));
       System.out.println("Post Increment"+(a++));
       System.out.println("Pre  decrement"+(--b));
       
       //Assignment
       a+=5; //a= a+5
       System.out.println("+= "+a );
       
       //Ternary <? :>
       String res = (a>b)?"a is greater" : "b is greater " ;
       System.out.println("Result:"+ res); 
       
       //Bitwise
       /***
        * AND-->&
        * OR-->
        * NOT-->~
        * XOR-->^
        */
       
    }
}
       
       
	

