package Jugadores;

public abstract class Jugador {
    protected String nombre;
    protected int edad;
    protected String equipo;
    public Jugador(String nombre,int edad, String equipo){
        this.nombre=nombre;
        this.equipo=equipo;
        this.edad=edad;
    }
public void imprimir(){
    System.out.println("Su nombre es: "+nombre+"Su edad es: "+edad+"su equipo es: "+equipo);
}

    public abstract void imprimir1();
}

class portero extends Jugador{
    protected int atajadas;
    protected int golesRecibidos;
    public portero(String nombre, int edad, String equipo, int atajadas, int golesRecibidos){
        super(nombre,edad,equipo);
        this.atajadas=atajadas;
        this.golesRecibidos=golesRecibidos;
    }
    @Override
    public void imprimir(){
        System.out.println("Portero");
        super.imprimir();
        System.out.println(" sus atajadas son: "+atajadas+" y los goles recibidos son: "+golesRecibidos);
    }

    @Override
    public void imprimir1() {

    }

}
        class defensa extends Jugador{
    protected int bloqueos;
    public defensa(String nombre, int edad, String equipo, int bloqueos){
        super(nombre,edad,equipo);
        this.bloqueos=bloqueos;

    }
    public void imprimir(){
        System.out.println("Defensa");
        super.imprimir();
        System.out.println("Su numero de bloqueos es: "+bloqueos);
    }

            @Override
            public void imprimir1() {

            }

        }
    class delantero extends Jugador{
        public delantero(String nombre, int edad, String equipo){
            super(nombre,edad,equipo);
        }

        @Override
        public void imprimir1() {

        }

        public void imprimir3(){
            System.out.println("Delantero");
            super.imprimir();
        }
}
