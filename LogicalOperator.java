class LogicalOperator{
public static void main(String[] agrs){
int a = 10;
int b = 20;
boolean OrResult = (a<b) || (a>(--b));
boolean AndResult = (a<b) && (a<(b++));
System.out.println(OrResult);
System.out.println("b : "+b);
System.out.println(AndResult);
System.out.println("b :"+b);
}
}