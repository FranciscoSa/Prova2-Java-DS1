import java.util.Scanner;

public class App {
    
    public static void main(String[] args){
        
        String nome = "";
        int anoNascimeto = 0;
        char tipoCNH = ' ';
        Motorista motorista;
        
        Scanner entrada = new Scanner(System.in);
    
        System.out.print("Digite seu o seu nome : ");
        nome = entrada.nextLine();
        System.out.print("Digite seu ano de nascimente EX: 2010 : ");
        anoNascimeto = entrada.nextInt();
        
        if (anoNascimeto > 2003){
            System.out.print("Você não pode dirigir, você ainda não completou 18 anos.");
        }else{

            motorista = new Motorista(nome, anoNascimeto);
            System.out.print("Qual tipo de hábilitação você deseja <-> A) Moto B) Carro ou Z) Moto e carro : ");
            tipoCNH = Character.toUpperCase(entrada.next().charAt(0));
            motorista.tirarCNH(tipoCNH);

            System.out.println("Nome : " + motorista.nome);
            System.out.println("Idade : " + (2021 - motorista.anoNascimento));
            System.out.println("Tipo CNH : " + motorista.tipoCNH);
        }
        entrada.close();
    }

}
