
package ejerciciofinal;

public class EjercicioFinal {

    public static void main(String[] args) {
        ///Creando objetos 
        
        ///Objeto 1
        Equipo e = new Equipo();
        System.out.printf("Nombre: %s - Jugadores: %d - Ciudad: %s\n", e.obtener_nombre(), e.obtener_num_jugadores(), e.obtener_ciudad());
        ///Objeto 2
        Equipo e2 = new Equipo("Barcelona");
        e2.agregar_num_jugadores(22);
        e2.agregar_ciudad("Guayaquil");
        System.out.printf("Nombre: %s - Jugadores: %d - Ciudad: %s\n", e2.obtener_nombre(), e2.obtener_num_jugadores(), e2.obtener_ciudad());
        ///Objeto 3
        Equipo e3 = new Equipo("Depotivo Cuenca", 24);
        e3.agregar_ciudad("Cuenca");
        System.out.printf("Nombre: %s - Jugadores: %d - Ciudad: %s\n", e3.obtener_nombre(), e3.obtener_num_jugadores(), e3.obtener_ciudad());
        ///Objeto 4
        Equipo e4 = new Equipo("Independiente", 23, "Del Valle"); 
        System.out.printf("Nombre: %s - Jugadores: %d - Ciudad: %s\n", e4.obtener_nombre(), e4.obtener_num_jugadores(), e4.obtener_ciudad());      
    }
    
}
