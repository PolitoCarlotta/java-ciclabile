package listaNumeri;

public class Interi {

    private int[] elencoNumeri;

    private int contatore;

    private int lettura = 0;


    public Interi(int[] numeri){
        if(numeri == null || numeri.length == 0){
            System.out.println("L'array di interi deve essere costituito da almeno un elemento");
        }
        this.elencoNumeri = numeri;
        this.contatore = numeri.length;

    }

    public Interi(int numeroInteri){
        this.elencoNumeri = new int[numeroInteri];
        this.contatore = 0;
    }

    public void addElemento (int numero){
        if(this.contatore < elencoNumeri.length){
            elencoNumeri[contatore] = numero;
            contatore ++;
        } else {
            System.out.println("L'elenco è pieno, non puoi più aggiungere numeri.");
        }
    }

    public boolean hasAncoraElementi(){
        return lettura < contatore;
    }

    public int getElementoSuccessivo(){
        if(lettura < contatore){
            int valore = elencoNumeri[lettura];
            lettura ++;
            return valore;
        } else {
            System.out.println("Sei arrivato alla fine della lista, resetta il contatore");
            return -1;
        }

    }

    public void resetContatore(){
        this.lettura = 0;
    }


}
