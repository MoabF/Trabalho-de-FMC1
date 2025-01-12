import java.util.Scanner;

public class Faceis {
    static double piso(double num){
        if (num%1!=0) {
            if (num>=0) {
                return (int)num;
            }
            else{
                return (int)num-1;
            }
        }
        else{
            return (int)num;
        }
    }
    static double teto(double num){
        if (num%1!=0) {
            if (num>=0) {
                return (int)num+1;
            }
            else{
                return (int)num;
            }
        }
        else{
            return (int)num;
        }
    }
    static int div(int num1, int num2){
        System.out.println(num1/num2);
        return num1/num2;
    }
    static int mod(int num1, int num2){
        return num1%num2;
    }
    static void primos(int num1, int num2){
        int contador_de_primos=0;
        int contador=0;
        int aux;
        if (num2>num1) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

            for(int i= num2; i <= num1; i++){
                for(int j= 2; j <= (int)Math.sqrt(i); j++){
                //Proposição 2.1. Se n é um número composto, 
                //então n tem um divisor primo p <= \sqrt(n). (Crivo de Eratóstenes)
                    if (i>=2) {
                    if(i%j==0){
                        contador++;
                    }}
                }
                if ((i>=2)&&(contador == 0)) {
                    System.out.printf("%d ", i);
                    contador_de_primos++;
                }
                contador = 0;
                    /*System.out.printf("%d ", i);
                        contador_de_primos++;*/
                
            }
            if (contador_de_primos==0) {
                System.out.println("Não existem primos presentes nesse intervalo");
            }
       // }
    }
    public static void main(String[] args) {
        int menu, num1, num2; double num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da função que você deseja usar:\n"
                            +"1-Função piso\n2-Função teto\n3-Função div\n"+
                            "4-Função mod\n5-Cálculo de primos em um intervalo");
        menu = scanner.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Digite um número:");
                num3 = scanner.nextDouble();
                System.out.println("O resultado é: " + (int)piso(num3));
                break;
            case 2:
                System.out.println("Digite um número:");
                num3 = scanner.nextDouble();
                System.out.println("O resultado é: "+(int)teto(num3));
                break;
            case 3:
                System.out.println("Digite o primeiro número:");
                num1 = scanner.nextInt();
                System.out.println("Digite o segundo número:");
                num2 = scanner.nextInt();
                System.out.printf("O resultado do %d div %d é: %d", num1, num2, div(num1, num2));
                break;
            case 4:
                System.out.println("Digite o primeiro número:");
                num1 = scanner.nextInt();
                System.out.println("Digite o segundo número:");
                num2 = scanner.nextInt();
                System.out.printf("O resultado do %d mod %d é: %d", num1, num2, mod(num1, num2));
                break;
            case 5:
                System.out.println("Digite o primeiro número:");
                num1 = scanner.nextInt();
                System.out.println("Digite o segundo número:");
                num2 = scanner.nextInt();
                System.out.println("Os primos que estão presentes nesse intervalo são: ");
                primos(num1, num2);
                break;
            default:
                System.out.println("Dígito inválido");
                break;
        }
        scanner.close();   
    }
}
