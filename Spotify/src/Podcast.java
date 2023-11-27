public class Podcast extends Audio{

    private String apresentador;
    private boolean video;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    @Override
    public void reproduzir() {
        super.reproduzir();
        System.out.println("Apresentador: " + apresentador);
        System.out.println("Possui o recurso audiovisual: " + video);
    }
}
