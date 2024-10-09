/*


/**
 *
 * @author 60000092
 */
import java.util.Scanner;

public class Media {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
        ex9();

    }

    public static void ex1() {
        int nota_1, nota_2, nota_3;

        System.out.println("informe sua nota : ");

        nota_1 = scanner.nextInt();

        System.out.println("informe sua segunda nota: ");

        nota_2 = scanner.nextInt();

        System.out.println("informe sua terceira nota: ");

        nota_3 = scanner.nextInt();

        int resultado = (nota_1 + nota_2 + nota_3) / 3;

        System.out.println("sua media sera de: " + resultado);

        if (resultado >= 60) {
            System.out.println("Parabens voce foi aprovado");
        } else {
            System.out.println("Reprovo se fudeo burro");
        }

    }

    public static void ex2() {
        String nome;
        System.out.println("infome um nome: ");
        nome = scanner.next();
        System.out.println("seu nome e: " + nome);
    }

    public static void ex3() {
        int numero_1, numero_2;
        System.out.println("Informe um numero: ");
        numero_1 = scanner.nextInt();
        System.out.println("informe o segundo numero: ");
        numero_2 = scanner.nextInt();

        System.out.println("a soma dos 2 numeros e " + (numero_1 + numero_2));
        System.out.println("a divisao dos 2 numeros e " + (numero_1 / numero_2));
        System.out.println("a subtrcao dos 2 numeros e " + (numero_1 - numero_2));
        System.out.println("a multiplicacao dos 2 numeros e " + (numero_1 * numero_2));

    }

    public static void ex4() {
        int num1, num2;

        System.out.println("insira o primeiro valor: ");
        num1 = scanner.nextInt();

        System.out.println("insira o segundo valor: ");
        num2 = scanner.nextInt();

        int resultado;

        if (num1 > num2) {
            System.out.println(num1 + " e maior que " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " e menor que " + num2);

        } else if (num1 == num2) {
            System.out.println(num1 + " e igual a " + num2);
        }
    }

    public static void ex5() {
        int valor1;

        System.out.println("insira o primeiro valor: ");
        valor1 = scanner.nextInt();

        int resultado;

        if (valor1 % 2 != 0) {
            System.out.println(" e impar ");
        } else {
            System.out.println(" e par ");

        }
    }

    public static void ex6() {
        int valor1;

        System.out.println("insira um valor: ");
        valor1 = scanner.nextInt();

        System.out.println(valor1 + " elevado a 2 e " + valor1 * valor1);

        System.out.println(valor1 + " elevado a 4 e " + valor1 * valor1 * valor1 * valor1);

        System.out.println(valor1 + " elevado a 6 e " + valor1 * valor1 * valor1 * valor1 * valor1 * valor1);

        System.out.println(valor1 + " elevado a 8 e " + valor1 * valor1 * valor1 * valor1 * valor1 * valor1 * valor1 * valor1);

        System.out.println(valor1 + " elevado a 10 e " + valor1 * valor1 * valor1 * valor1 * valor1 * valor1 * valor1 * valor1 * valor1 * valor1);

    }

    public static void ex7() {
        int valor1, valor2;

        System.out.println("Insira o primeiro valor: ");
        valor1 = scanner.nextInt();

        System.out.println("Insira o segundo valor: ");
        valor2 = scanner.nextInt();

        if (valor1 > valor2) {
            System.out.println(valor1 + " e maior que " + valor2);
        } else {
            System.out.println(valor2 + "e maior que " + valor1);
        }
        if (valor1 == valor2) {
            System.out.println(valor1 + " e igual a " + valor2);

        } else {
            System.out.println(valor1 + " e diferente do " + valor2);
        }

    }

    public static void ex8() {
        double leitura_inicial, leitura_final, consumo, media_dia;

        int dias;

        String endereco, nome;

        System.out.println("Leitura da Agua: ");
        System.out.println("Informe o nome do responsavel: ");
        nome = scanner.nextLine();
        endereco = scanner.nextLine();
        System.out.println("Leitura inicial: ");
        leitura_inicial = scanner.nextDouble();
        System.out.println("Leitura final: ");
        leitura_final = scanner.nextDouble();
        consumo = leitura_final - leitura_inicial;
        dias = 30;
        media_dia = consumo / dias;
        System.out.println("Relatorio de consumo: ");
        System.out.println("cliente" + nome + " -Endereço: " + endereco);
        System.out.printf("> consumo " + consumo);
        System.out.printf("\n>Dias: " + dias);
        System.out.printf("\n>Media Diaria e" + media_dia);

    }

    public static void ex9() {
        int num_1;

        System.out.println("qual o valor: ");
        num_1 = scanner.nextInt();

        if (num_1 > 10 && num_1 < 100) {
            System.out.println(" o valor elevado a 2 e " + Math.pow(num_1, 2));
        } else {
            System.out.println("a raiz quadrada de " + num_1 + " e " + Math.sqrt(num_1));

        }

    }

}
