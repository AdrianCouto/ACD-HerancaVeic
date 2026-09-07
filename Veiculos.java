public class Veiculos {

    private int passageiros;
    private double capgas;
    private double autonomia;

    public Veiculos(int passageiros, double capgas, double autonomia){
        this.passageiros = passageiros;
        this.capgas = capgas;
        this.autonomia = autonomia;
    }

    public void setPassageiros(int passageiros){
        this.passageiros = passageiros;
    }

    public void setCapgas(double capgas){
        this.capgas = capgas;
    }

    public void setAutonomia(double autonomia){
        this.autonomia = autonomia;
    }

    public int getPassageiros(){
        return passageiros;
    }

    public double getCapgas(){
        return capgas;
    }

    public double getAutonomia(){
        return autonomia;
    }

}
