public class OffRoad extends Veiculos{

    private double altura;

    public OffRoad(int passageiros, double capgas, double autonomia, double altura){
        super(passageiros, capgas, autonomia);
        this.altura = altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }

}