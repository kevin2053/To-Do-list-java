
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Lista {
    private List lista = new ArrayList();


    public Lista() {};



    public void setLista(List lista) {
        this.lista = lista;
    }

    public List getLista() {
        return lista;
    }

    public void aggiunta(String nome, String contenuto, String data, boolean completata){
        var ricordo = new Ricordo(nome,data,contenuto,completata);
        lista.add(ricordo);

    }

    public void clear(){
        lista.clear();
    }

    public void rimuoviElementi(int numerazione){
        lista.remove(numerazione);
    }


    @Override
    public String toString() {
        return "Lista{" +
                "lista=" + lista +
                '}';
    }

}
