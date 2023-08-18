//1 - pacote
package intro;

// 2 - Referencias as bibliotecas

//3 - Classe
public class Medidas {
    //3.1 - Atributos - Caractereisticas


    //3.2 - Metodos e funcoes
    public static void main(String[] args){
        calcularAreaModoCurto();
        calcularAreaModoExtenso();

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

        largura = 5;  //largura recebe 4 unidades
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "M e o comprimento de "
                + comprimento + "M a área é de " + resultado + "M²");

    }

}
