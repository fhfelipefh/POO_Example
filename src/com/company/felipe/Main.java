package com.company.felipe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

	//Identidade
    //Encapsulamento
    //Herança
    //Polimorfismo

    // Densidade da água pura 997kg/m³ : 1g/cm^3
    // Água possui 1Kg/L
    // Multiplique o volume em m^3 pelo valor da densidade
    // 1 ml = 1 centimetro cubico
    // Densidade da água = 1g/cm^3 / densidade do óleo = 0,9g/cm^3
    //Água ⇒ D = m v

    Scanner user = new Scanner(System.in);
    final double water = 1; // 1 = 1g/cm^3
    final double oil = 0.9; //0,9 = 0,9g/cm^3
    int container = 0;
    int option = 0;
    int value = 0;

    // Criação de objetos e atribuição das suas características
    Bottle bottle = new Bottle();
    bottle.setCapacityMax(500);
    bottle.setWeight(550);
    bottle.setThermal(false);

    Cupoftea cupoftea  = new Cupoftea();
    cupoftea.setCapacityMax(250);
    cupoftea.setWeight(165);
    cupoftea.setType("Vidro");

    while(true) {
        do {
            System.out.println("----- Menu ----- ");
            System.out.println("(1) Garrafa");
            System.out.println("(2) Xicará de chá");
            //coloque os recipientes disponiveis aqui.
            container = user.nextInt();
        } while (container == 0);

        do {
            System.out.println("(1) Preencher");
            System.out.println("(2) Esvaziar");
            System.out.println("(3) Calcular peso");
            option = user.nextInt();
        } while (option == 0);

        if (container == 1) {
            System.out.println("Garrafa");
            if (option == 1) {
                System.out.println("Preencher, Insira um valor em Ml");
                value = user.nextInt();
                bottle.fill(value);
            } else if (option == 2) {
                System.out.println("Esvaziar");
                bottle.drainOut();
                if(bottle.isThermal() == true){
                    System.out.println("Você perdeu sua água fria.");
                }
            } else if (option == 3) {
                System.out.println("Calcular peso");
                bottle.calcweight(water);
            }

        } else if (container == 2) {
            System.out.println("Xicará de chá");
            if (option == 1) {
                System.out.println("Preencher, Insira um valor em Ml");
                value = user.nextInt();
                cupoftea.fill(value);
            } else if (option == 2) {
                System.out.println("Esvaziar");
                cupoftea.drainOut();
            } else if (option == 3) {
                System.out.println("Calcular peso");
                cupoftea.calcweight(water);
            }
        } else if( container == 3){

        }



        }
    }
}
