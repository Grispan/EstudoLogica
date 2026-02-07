
package estudollogica;
import java.util.Scanner;

public class Exercicio1 {
    /* Faça um programa que possua um vetor denominado A que armazene 6 numeros intei- ´
ros. O programa deve executar os seguintes passos:
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
(b) Armazene em uma variavel inteira (simples) a soma entre os valores das posições
A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. ˜
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/
     
    //Criação do Scanner
    Scanner leitor = new Scanner(System.in);
    //Criação do Vetor
    int [] A  = new int [7];
    
    //atribuição de valores do array
    for(int i = 0; i < A.length;i++){
    System.out.println("Atribua o 6 valores do Array");
    A[i] = leitor.nextInt();
    }
    //imprimir os números do array
    for(int i = 0;i < A.length;i++){
        System.out.println("Os números do Array são: " + A[i]);
}
    
}

