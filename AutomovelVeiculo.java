package Heranca;

public class AutomovelVeiculo extends Veiculo {
    private int numPortas;
    private String motor;

    public AutomovelVeiculo(String marca, String modelo, int ano, String cor, int numPortas, String motor) {
        super(marca, modelo, ano, cor);
        this.numPortas = numPortas;
        this.motor = motor;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
