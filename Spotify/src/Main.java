
public class Main {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.setTitulo("Can't Stop");
        musica.setDuracao(3);
        musica.setTotalDeReproducoes(500);
        musica.setCurtidas(1.200);
        musica.setClassificacao(10);
        musica.setGenero("Rock");
        musica.setNacionalidade("EUA");
        musica.reproduzir();

        Podcast podcast = new Podcast();
        podcast.setTitulo("Jovem Nerd");
        podcast.setDuracao(120);
        podcast.setTotalDeReproducoes(200);
        podcast.setCurtidas(600);
        podcast.setClassificacao(9);
        podcast.setApresentador("Jovem Nerd e Azaghal");
        podcast.setVideo(true);
        podcast.reproduzir();
    }
}
