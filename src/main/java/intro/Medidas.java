//1 - pacote
package intro;

// 2 - Referencias as bibliotecas

import java.util.Scanner;

//3 - Classe
public class Medidas {
    //3.1 - Atributos - Caractereisticas

    //3.2 - Métodos e funções
    public static void main(String[] args){
        //Estrutura condicional = verificar uma condição  - Fazer uma pergunta para uma pessoa, hardware ou software.

        // Utilizar a classe scanner do java para ler a escolha do usuário no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U   D E  O P Ç Õ E S");
        System.out.println("c - Calcular Area Modo Curto");
        System.out.println("d - Contar até Dez");
        System.out.println("e - Calcular Area Modo Extenso");
        System.out.println("i - If Simples");
        System.out.println("r - Contagem regressiva de 10 a 0");
        System.out.println("Digite a opção desejada: ");
        String opcao = scanner.next();

        //switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do software.

        //String opcao = "ifSimples";

        switch (opcao){
            case "c":
            case "C":
                System.out.println("Você escolheu o método calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "d":
            case "D":
                System.out.println("Você escolheu o método contarAteDez");
                contarAteDez();
                break;
            case "e":
            case "E":
                System.out.println("Você escolheu o método calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            case "i":
            case "I":
                System.out.println("Você escolheu o método ifSimples");
                ifSimples();
                break;
            case "r":
            case "R":
                System.out.println("Você escolheu o método ContagemRegressiva");
                contagemRegressiva();
                break;
            default:
                System.out.println("Você escolheu outro valor que não tem uma ação associada");
                break;
        }

    }

    public static void ifSimples(){
        //Estrutura condicional = verificar uma condição  - Fazer uma pergunta para uma pessoa, hardware ou software.
        //if = se
        //else = senão

        String modo = "curto";

        if (modo == "curto"){
            calcularAreaModoCurto();
        }
        else {
            calcularAreaModoExtenso();
        }

    }
    public static void calcularAreaModoCurto(){
        System.out.println("Calculo de areas Modo Curto");
        // Calculo de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "M e o comprimento de "
                + comprimento + "M a área é de " + largura * comprimento + "M²");
    }
    public static void calcularAreaModoExtenso(){

        System.out.println("Calculo de areas Modo Extenso");
        // Calculo de area - Exemplo o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5;  //largura recebe 5 unidades
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "M e o comprimento de "
                + comprimento + "M a área é de " + resultado + "M²");

    }
public static void contarAteDez(){

        // Loops ou Repetições
        // for  = repetição incondicional
        System.out.println("Contagem Crescente");
        for(int numero = 1; numero <= 10; numero++){
            System.out.println(numero);
        }

}

public static void contagemRegressiva(){
    System.out.println("Contagem Regressiva");
    for(int numero = 10; numero > -1; numero--){
        System.out.println(numero);
    }
}


}
