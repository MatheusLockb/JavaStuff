
import java.util.ArrayList;
import java.util.Scanner;
    
    public class App {
        public static void main(String[] args) throws Exception {
            ArrayList<Restaurante> ifood = new ArrayList<>();
            Scanner input = new Scanner(System.in);
            String nome;
            String endereco;
            double preco;
            String tipoComida;
    
            System.out.println("--- Cadastro de 5 restaurantes ---");
            for(int i = 0; i < 5; i++)
            {
                System.out.print("\t Nome: ");
                nome = input.nextLine();
                System.out.print("\t Endereço: ");
                endereco = input.nextLine();
                System.out.print("\t Preço: ");
                preco = input.nextDouble();
                tipoComida = input.nextLine();
                System.out.print("\t Tipo comida: ");
                tipoComida = input.nextLine();
                Restaurante temporario = new Restaurante(nome, endereco, preco, tipoComida);
                ifood.add(temporario);
            }
    
            System.out.print("Digite o tipo de comida: ");
            tipoComida = input.nextLine();
    
            for(Restaurante restaurante : ifood)
            {
                if(restaurante.getTipoComida().equals(tipoComida))
                {
                    restaurante.exibirDados();
                }
            }
        }
    }

