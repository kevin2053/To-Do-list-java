
public class Main {
    public static void main(String[] args) {


        var lista = new Lista();

        lista.aggiunta("cucinare","cucinare qualcosa","2023",false);
        lista.aggiunta("guidare","guidare qualcosa","2023",false);
        System.out.println(lista.getLista());

        lista.rimuoviElementi(0);
        System.out.println(lista.getLista());
        lista.clear();
        System.out.println(lista.getLista());





    }
}