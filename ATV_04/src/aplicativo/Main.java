package aplicativo;

import java.util.ArrayList;
import java.util.List;

import aplicativo.*;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente(40,"Jose roberto","11111111111","Gerente",4225.50, 0.15,"Nordeste",0); //Criando gerente
        Vendedor vendedor1 = new Vendedor(27,"Alfredo jorge","22222222222","Vendedor", 1400.50, gerente,0,0.05,0);//Criando vendedor
        Vendedor vendedor2 = new Vendedor(27,"joão jose","333333333","Vendedor", 1400.50, gerente,0,0.05,0);//Criando outro vendedor

        List<Vendas> vendas = new ArrayList<>();
        List<Vendas> vendas02 = new ArrayList<>();
        List<Vendedor> vendedores = new ArrayList<>();

        
        vendedores.add(vendedor1);
        vendedores.add(vendedor2);

       
        gerente.setVendedores(vendedores);

        
        Vendas vendas1 = new Vendas(500);
        Vendas vendas2 = new Vendas(350);
        Vendas vendas3 = new Vendas(225);
        Vendas vendas4 = new Vendas(500);
        Vendas vendas5 = new Vendas(600);
        Vendas vendas6 = new Vendas(700);
        Vendas vendas7 = new Vendas(800);
        Vendas vendas8 = new Vendas(725);
        Vendas vendas9 = new Vendas(650);
        Vendas vendas10 = new Vendas(19);

        //Adiciona vendas a primeira lista de vendas
        vendas.add(vendas1);
        vendas.add(vendas2);
        vendas.add(vendas3);
        vendas.add(vendas4);
        vendas.add(vendas5);

        //Adiciona vendas a segunda lista de vendas
        vendas02.add(vendas6);
        vendas02.add(vendas7);
        vendas02.add(vendas8);
        vendas02.add(vendas9);
        vendas02.add(vendas10);

        vendedor1.setVendas(vendas);

        vendedor2.setVendas(vendas02);

        vendedor1.getTotalVendas();
        vendedor1.getTotalComissao();

        vendedor2.getTotalVendas();
        vendedor2.getTotalComissao();

        gerente.getComissaoTotalGerente();

        System.out.println();
        System.out.println("Primeiro Vendedor: " + vendedor1.getNome()+" "+vendedor1.getVendas()+ " " + "Salario " + vendedor1.getSalario());
        System.out.println();
        System.out.println("Segundo Vendedor: " + vendedor2.getNome()+" "+vendedor2.getVendas()+ " " +  "Salario " + vendedor2.getSalario());
        System.out.println();
        System.out.println("Gerente" + gerente.getNome()+" "+gerente.getSalario());//Gerente

    }
}
