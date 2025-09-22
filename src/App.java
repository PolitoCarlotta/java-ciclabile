import listaNumeri.Interi;

public class App {
    public static void main(String[] args) throws Exception {
        
        Interi i1 = new Interi();

        Interi i2 = new Interi(new int[]{5, 9, 3, 7, 11});

        i1.addElemento(5);
        i1.addElemento(2);

        System.out.println(i1.getElementoSuccessivo());
        System.out.println(i1.hasAncoraElementi());
        System.out.println(i1.getElementoSuccessivo());
        System.out.println(i1.hasAncoraElementi());
        System.out.println(i1.getElementoSuccessivo());
        System.out.println(i1.hasAncoraElementi());
        i1.resetContatore();
        System.out.println(i1.getElementoSuccessivo());
        System.out.println(i1.hasAncoraElementi());






    }
}
