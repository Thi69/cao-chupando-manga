package cao.chupando.manga.domain.entidades;

public class Volume {
    private int Id;
    private String resumo;
    private int numero;
    private Manga manga;

    public int getId() {
        return Id;
    }

    public String getResumo() {
        return resumo;
    }

    public int getNumero() {
        return numero;
    }

    public Manga getManga() {
        return manga;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setManga(Manga manga) {
        this.manga = manga;
    }
    
    
}
