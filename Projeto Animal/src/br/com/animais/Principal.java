package br.com.animais;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int i = 0;

        try {
            System.out.println("Crie seu novo animal virtual! \nInforme o nome do animal: ");
            String nome = sc.nextLine();
            System.out.println("Informe a classe do animal: ");
            String classe = sc.nextLine();
            System.out.println("Informe a família do animal: ");
            String familia = sc.nextLine();

            Animal animal = new Animal(nome, classe, familia);
            System.out.println(animal.nasceu());

            while(i != 4){
                System.out.println("\nO que o " + nome + ", vai fazer agora? \n1 - Comer \n2 - Correr \n3 - Dormir " +
                        "\n4 - Morrer");
                i = sc.nextInt();

                if(i > 0 && i < 5){
                    switch (i){
                        case 1:
                            System.out.println(animal.comer());
                            break;
                        case 2:
                            System.out.println(animal.correr());
                            break;
                        case 3:
                            System.out.println(animal.dormir());
                            break;
                        case 4:
                            System.out.println(animal.morrer());
                            break;
                    }
                } else{
                    System.out.println("Opção inválida, tente novamente.");
                }
            }
            System.out.println("GAME OVER!");

        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
