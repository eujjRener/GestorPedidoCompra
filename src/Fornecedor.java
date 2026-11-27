public class Fornecedor {

    private String nome;
    private String cnpj;

    public Fornecedor(String nome, String cnpj){
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("O nome não pode ser nulo");
        }
        if(cnpj == null || cnpj.length() != 14){
            throw new IllegalArgumentException("CPNJ Precisa ter mais de 14 caracteres");
        }
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }
}
