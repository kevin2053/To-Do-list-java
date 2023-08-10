public class Ricordo {
    private String nome;
    private String data;
    private String contenuto;
    private boolean completata;


    public Ricordo(String nome, String data, String contenuto, boolean completata) {
        this.nome = nome;
        this.data = data;
        this.contenuto = contenuto;
        this.completata = completata;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getData() {

        return data;
    }

    public void setData(String data) {

        this.data = data;
    }

    public String getContenuto() {

        return contenuto;
    }

    public void setContenuto(String contenuto) {

        this.contenuto = contenuto;
    }

    public boolean isCompletata() {

        return completata;
    }

    public void setCompletata(boolean completata) {

        this.completata = completata;
    }

    @Override
    public String toString() {
        return "Ricordo{" +
                "nome='" + nome + '\'' +
                ", data='" + data + '\'' +
                ", contenuto='" + contenuto + '\'' +
                ", completata=" + completata +
                '}';
    }
}
