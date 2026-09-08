import java.util.ArrayList;    
import java.util.Scanner;    

public class Main{

    public static void main(String[] args){

        ArrayList<Veiculos> veiculos = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        TipoVeiculo tipoVeiculo;

        Veiculos novoVeiculo;

        while (true) {

        System.out.println("1 - Adicionar veiculo\n2 - Ver veiculos\n0 - Sair");

        int opc = entrada.nextInt();

            switch(opc){

                case 1: 
                    System.out.println("Tipo de veiculo:\n0 - Veiculo genérico\n1 - Caminhão\n2 - Offroad\n");
                    int tipo = entrada.nextInt();

                    if(tipo == 0){
                        tipoVeiculo = TipoVeiculo.VEICULO;
                    } else if(tipo == 1){
                        tipoVeiculo = TipoVeiculo.CAMINHAO;
                    } else if(tipo == 2){
                        tipoVeiculo = TipoVeiculo.OFFROAD;
                    }else{
                        System.out.println("Tipo inválido.");
                        continue;
                    }
      
                    System.out.println("\nNOVO VEICULO");

                    System.out.print("Passageiros: ");
                    int passageiros = entrada.nextInt();

                    System.out.print("Capacidade do tanque: ");
                    double capgas = entrada.nextDouble();

                    System.out.print("Autonomia: ");
                    double autonomia = entrada.nextDouble();

                    switch(tipoVeiculo){

                        case VEICULO:
                            novoVeiculo = new Veiculos(passageiros, capgas, autonomia);
                            veiculos.add(novoVeiculo);
                            
                            break;
                        
                        case CAMINHAO:
                            System.out.println("Carga total: ");
                            double cargatotal = entrada.nextDouble();

                            novoVeiculo = new Caminhao(passageiros, capgas, autonomia, cargatotal);

                            veiculos.add(novoVeiculo);
                            
                            break;

                        case OFFROAD:
                            System.out.println("Altura do veiculo: ");
                            double altura = entrada.nextDouble();

                            novoVeiculo = new OffRoad(passageiros, capgas, autonomia, altura);

                            veiculos.add(novoVeiculo);

                            break;

                    }

                    break;
                
                case 2:
                    int i = 1;
                    
                    for (Veiculos v: veiculos) {
                        
                        System.out.println("Veículo " + (i));
                        System.out.println("Tipo: " + v.getClass().getSimpleName());
                        System.out.println("Passageiros: " + v.getPassageiros());
                        System.out.println("Capacidade: " + v.getCapgas());
                        System.out.println("Autonomia: " + v.getAutonomia());

                        if (v.getClass() == Caminhao.class) {

                            Caminhao caminhao = (Caminhao) v;

                            System.out.println("Carga máxima: " + caminhao.getCargatotal() + "\n");

                        } else if (v.getClass() == OffRoad.class) {

                            OffRoad offroad = (OffRoad) v;

                            System.out.println("Altura: " + offroad.getAltura() + "\n");

                        }
                    
                        i++;
                    }
                
                    break;
                    
                case 0:
                    entrada.close();
                    return;

                    
            }

        }
    }

}
