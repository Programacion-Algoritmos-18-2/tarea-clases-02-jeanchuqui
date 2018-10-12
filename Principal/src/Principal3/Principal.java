package Principal3;

public class Principal {

    public static void main(String[] args) {
        Precio p = new Precio();
        Precio n = new Precio(255);
        System.out.println(p.obtener());
        System.out.println(n.obtener());
    }

}
