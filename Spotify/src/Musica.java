public class Musica extends Audio{

    private String genero;
    private String nacionalidade;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public void reproduzir() {
        super.reproduzir();
        System.out.println("Genero: " + genero);
        System.out.println("Nacionalidade: " + nacionalidade);
    }
}
