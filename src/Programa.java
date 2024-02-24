/**
 * @author guiol
 */
public class Programa {

    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        pf.setCpf(123L);
        pf.setNome("Guilherme");

        PessoaJuridica pj = new PessoaJuridica();
        pj.setCnpj(12321L);
        pj.setNome("Steve");

        System.out.println("Nome pessoa física: " + pf.getNome() + ". Seu cpf: " + pf.getCpf());
        System.out.println("Nome pessoa Juridica: " + pj.getNome() + ". Seu cnpj: " + pj.getCnpj());
    }

}
