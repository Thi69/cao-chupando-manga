package cao.chupando.manga.domain.entidades;

public class Autor {
    private int Id;
    private String nome;
    private String country;

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public String getCountry() {
        return country;
    }
    
    
}
