
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;






public class listaHash {
    public static void main(String[] args) {
        System.out.println("Criando um arco-íris ");
          
            //chamando a lista
            Set<String> rainbow = new HashSet<>();

            rainbow.add("vermelho");
            rainbow.add("laranja");
            rainbow.add("amarelo");
            rainbow.add("verde");
            rainbow.add("azul");
            rainbow.add("anil");
            rainbow.add("violeta");
        
            System.out.println("\nAs cores presentes são " + rainbow);

            //tamanho da lista 
            System.out.println("\nTemos o total de " + rainbow.size() + " cores neste arco-íris ");

            //colocando em ordem alfabética
            Set<String> rainbowAlf = new TreeSet<>(rainbow);

            System.out.println("\nMudando para a ordem alfabética " + rainbowAlf);

            //invertendo ordem da lista 
            ArrayList<String> rainbowInvertArrayList = new ArrayList<>(rainbowAlf);
            Collections.reverse(rainbowInvertArrayList);

            System.out.println("\nInvertendo a  ordem " + rainbowInvertArrayList);


            //estabelecendo uma condição para print
            System.out.println("\nPrintando cores que começam com v");
            for(String cor : rainbow){
                if (cor.startsWith("v") || cor.startsWith("V")) {
                System.out.println(cor);
            }
            }

            //limpando com uma condição e mostrando os que sairam 
            rainbow.removeIf(cor -> !cor.toLowerCase().startsWith("v"));
            System.out.println("\nRemovendo cores que não começam com 'v': " + rainbow);
        
            //limpando toda a lista 
            rainbow.clear();
            System.out.println("\nLimpando o conjunto: " + rainbow);
            //mostrando o conjunto vazio
            System.out.println("\nO conjunto está vazio? " + rainbow.isEmpty());
        }
    }













        


    
