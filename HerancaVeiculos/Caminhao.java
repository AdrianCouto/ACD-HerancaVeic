public class Caminhao extends Veiculos{

    private double cargatotal;

    public Caminhao(int passageiros, double capgas, double autonomia, double cargatotal){
        super(passageiros, capgas, autonomia);
        this.cargatotal = cargatotal;
    }

    public void setCargatotal(double cargatotal){
        this.cargatotal = cargatotal;
    }

    public double getCargatotal(){
        return cargatotal;
    }

}