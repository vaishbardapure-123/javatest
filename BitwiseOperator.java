class BitwiseOperator{
public static void main(String[] agrs){
int x = 10;
int y = 20;
boolean OrResult = (x!=y) | (++x>y);
System.out.println(OrResult);
System.out.println("x : "+x);
boolean AndResult = (x==y) & (x!=y++);
System.out.println(AndResult);
System.out.println("y :"+y);
}
}