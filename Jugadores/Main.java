package Jugadores;

public class Main {
    public static void main(String[] agrs){
        delantero jugador1= new delantero("Juan",23,"Real Madril");
        portero jugador2= new portero("Pepe",25,"Juventus",23,18);
        defensa jugador3=new defensa("Richart",28,"Barcelona",23);
        jugador1.imprimir();
        jugador2.imprimir();
        jugador3.imprimir();
    }
}
