import java.util.Scanner;
class Alg_est_de_euclides{
    private int a;
    private int b;
    private int q;//quociente
    private int r;//resto
    public Alg_est_de_euclides(int a, int b){
        this.a=a;
        this.b=b;
        q = a/b;
        r = a%b;
    }
    public int calculo_de_mdc(){
        System.out.println("Cálculo baseado no algoritmo de Euclides: ");
        if(r==0){
        System.out.println(a+" = "+ b + " * " + q + " + " + r);
            return b;
        }
        else{
            do{
                System.out.println(a+" = "+ b + " * " + q + " + " + r);
                a = b;
                b = r;
                q = a/r;
                r = a%r;
            }while(r != 0);
            System.out.println(a+" = "+ b + " * " + q + " + " + r);
            return b;
        }
    }
}

public class Mdc_Main{
    public static void main(String[] args){
        int num1 = 0; int num2 = 0; int num_aux = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de MDC(a, b)");
        System.out.println("Digite o a:");
        num1 = scanner.nextInt();
        System.out.println("Agora digite o b:");
        num2 = scanner.nextInt();
        Alg_est_de_euclides mdc = new Alg_est_de_euclides(num1, num2);
        num_aux = mdc.calculo_de_mdc();
        System.out.printf("O MDC(%d, %d) é: %d", num1, num2, num_aux);
        scanner.close();
    }
}