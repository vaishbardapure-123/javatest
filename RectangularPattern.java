class RectangularPattern{
public static void main(String[] agrs){
int n = 8;
for(int i=1;i<n;i++){
for(int j=1;j<n;j++){
if(i==1 || j==1 || i==n-1 || j==n-1 || j==n-i || i==n-j || i==j){
System.out.print("*"+" ");
}
else{
System.out.print(" "+ " ");
}
}
System.out.println();
}
}
}
