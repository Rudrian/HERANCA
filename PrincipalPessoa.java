package Heranca;

public class PrincipalPessoa {

    public static void main(String[] args) {


        Pessoa pessoa = new Pessoa("Joao da Silva", "(11) 99999-9999");
        System.out.println("Pessoa: ");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Telefone: " + pessoa.getTelefone());


        PessoaFisica pessoaFisica = new PessoaFisica("Rudrian Almeida Domingues", "(15) 99602-6913", "46399982871", "093-904-02-1");
        System.out.println("\nPessoa Física: ");
        System.out.println("Nome: " + pessoaFisica.getNome());
        System.out.println("Telefone: " + pessoaFisica.getTelefone());
        System.out.println("CPF: " + pessoaFisica.getCpf());
        System.out.println("RG: " + pessoaFisica.getRg());
        
        PessoaJuridica pessoaJuridica = new PessoaJuridica("EMPRESA JGT", "(12) 43289-8743", "12.345.678/0001-95");
        System.out.println("\nPessoa Juridica: ");
        System.out.println("Nome: " + pessoaJuridica.getNome());
        System.out.println("Telefone: " + pessoaJuridica.getTelefone());
        System.out.println("CPF: " + pessoaJuridica.getCnpj());
    }
}
