package Heranca;

public class PrincipalVeiculo {

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("Honda", "Civic", 2020, "Branco");
        System.out.println("Veículo:");
        System.out.println("Marca: " + veiculo.getMarca());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Ano: " + veiculo.getAno());
        System.out.println("Cor: " + veiculo.getCor());

        AutomovelVeiculo automovel = new AutomovelVeiculo("Chevrolet", "Chevette", 1992, "Preto", 2, "1.8 Turbo Gasolina");
        System.out.println("\nAutomóvel:");
        System.out.println("Marca: " + automovel.getMarca());
        System.out.println("Modelo: " + automovel.getModelo());
        System.out.println("Ano: " + automovel.getAno());
        System.out.println("Cor: " + automovel.getCor());
        System.out.println("Número de Portas: " + automovel.getNumPortas());
        System.out.println("Motor: " + automovel.getMotor());

        Moto moto = new Moto("Honda", "Hornet", 2010, "Vermelho", 500);
        System.out.println("\nMoto:");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Cor: " + moto.getCor());
        System.out.println("Cilindradas: " + moto.getCilindradas());
    }
}
