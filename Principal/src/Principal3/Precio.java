package Principal3;


public final class Precio {

    private double euros;

    public double obtener() {
        return euros;
    }

    public void agregar(double x) {
        euros = x;
    }

    public Precio() {
        agregar(30.2);

    }
    public Precio( double y){
        agregar(y);
    }
}
