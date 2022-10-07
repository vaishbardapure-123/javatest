class SwitchCondition{
public static void main(String[] agrs){
System.out.println("main started");
char alphabet = 'A';
switch(alphabet){
case 'A' : {
	System.out.println("A for Apple");
	System.out.println("A for Alphabet");
}
break;
case 'B' : System.out.println("B for Ball");
           System.out.println("B for Bag");
break;
case 'C' : System.out.println("C for Cat");
break;
case 'D' : {
	System.out.println("D for Dog");
	System.out.println("D for Don");
}
break;
default : System.out.println("Invalid Statement:");
System.out.println("main ended");
}}}