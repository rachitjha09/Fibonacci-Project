//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main m=new Main();
        System.out.println(m.fib(8));
    }
    public static int fib(int n){
        if(n<=1){
            return n;
        } else{
            return fib(n-2) + fib(n-1);
        }
    }
}