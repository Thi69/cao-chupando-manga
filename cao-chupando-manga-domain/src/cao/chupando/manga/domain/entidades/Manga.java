package cao.chupando.manga.domain.entidades;

public class Manga {
    private int Id;
    private String nome;
    private String sinopse;
    private boolean status;

    public int getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public boolean isStatus() {
        return status;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
