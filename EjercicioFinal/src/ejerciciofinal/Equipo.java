package ejerciciofinal;
///clase Equipo
public final class Equipo {
///agregando atrivutos
    private String nombre;
    private int num_jugadores;
    private String ciudad;
///Agregando métodos
///atrivuto de nombre
    public String obtener_nombre() {
        return nombre;
    }
    public void agregar_nombre(String g) {
        nombre = g;
    }
///atruvuto del numero de jugadores
    public int obtener_num_jugadores() {
        return num_jugadores;
    }
    public void agregar_num_jugadores(int h) {
        num_jugadores = h;
    }
///atrivuto de ciudad
    public String obtener_ciudad() {
        return ciudad;
    }
    public void agregar_ciudad(String i) {
        ciudad = i;
    }
///primer constructor
    public Equipo() {
        agregar_nombre("Liga de Loja");
        agregar_num_jugadores(20);
        agregar_ciudad("Loja");
    }
///segundo constructor
    public Equipo(String a) {
        agregar_nombre(a);
    }
///tercer constructor
    public Equipo(String b, int c) {
        agregar_nombre(b);
        agregar_num_jugadores(c);
    }
///cuarto constructor
    public Equipo(String d, int e, String f) {
        agregar_nombre(d);
        agregar_num_jugadores(e);
        agregar_ciudad(f);
    }
}
