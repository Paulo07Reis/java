package modulo_01_fundamentos_do_java.aula12;

public class Aluno {
    private String nome;
    private Integer idade;

    public Aluno(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if (idade < 0){
            throw new IllegalArgumentException("O valor deve ser positivo!");
        } else {
            this.idade = idade;
        }
    }
}
