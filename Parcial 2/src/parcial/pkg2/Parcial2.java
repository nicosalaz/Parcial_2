/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Parcial2 {

    public static Persona get_entrenador(){
        Scanner entrada = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        System.out.println("nombre: ");
        String nombre_entrenado = str.nextLine();
        System.out.println("identificacion: ");
        String identificacion = str.nextLine();
        System.out.println("edad: ");
        int edad = entrada.nextInt();
        System.out.println("nacionalidad: ");
        String nacio = str.nextLine();
        Persona entrenador = new Persona(nombre_entrenado,identificacion,edad,nacio);
        
        return entrenador;
    }
    public static Jugador get_jugador(){
        Scanner entrada = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        System.out.println("apodo: ");
        String apodo = entrada.nextLine();
        System.out.println("rol: ");
        String rol = entrada.nextLine();
        System.out.println("nombre: ");
        String nombre = str.nextLine();
        System.out.println("identificacion: ");
        String identificacion = str.nextLine();
        System.out.println("edad: ");
        int edad = entrada.nextInt();
        System.out.println("nacionalidad: ");
        String nacio = str.nextLine();
        Jugador j = new Jugador(apodo, rol, nombre, identificacion, edad, nacio);
        return j;
    }
    public static Torneo get_torneo(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("nombre del torneo: ");
        String nombre = entrada.nextLine();
        System.out.println("fecha (DD-MM-YYYY): ");
        String fecha = entrada.nextLine();
        System.out.println("puesto que ocupo: ");
        String puesto = entrada.nextLine();
        System.out.println("Tipo de juego: ");
        String tipo = entrada.nextLine();
        Torneo t = new Torneo(nombre,fecha,puesto,tipo);
        
        return t;
    }
    
    
    
    public static void main(String[] args) {
        boolean estado_juego = true;
        int opcion=0;
        String nombre;
        String nombre_ind;
        int cantidad;
        int cantidadEnfrentamientosDisputados;
        int cantidadTorneosDisputados ;
        int cantidadEnfrentamientosGanados;
        int cantidadTorneosGanados ;
        int cantidadEnfrentamientosDisputados_ind;
        int cantidadTorneosDisputados_ind ;
        int cantidadEnfrentamientosGanados_ind;
        int cantidadTorneosGanados_ind ;
        String pais ;
        int opc_equipo = 0;
        int opc_ind = 0;
        ArrayList<Equipo> listaEquipo = new ArrayList<Equipo>();
        ArrayList<Individual> listajugadores = new ArrayList<Individual>();
        int contador = 1;
        
        do{
            Scanner sc = new Scanner(System.in);
            Scanner entrada = new Scanner(System.in);
            Scanner str = new Scanner(System.in);
          
            System.out.println("Bienvenido. Seleccione un opcion:");
            System.out.println("1. Crear Equipo.");
            System.out.println("2. Crear Jugador(es) individual.");
            System.out.println("3. Imprimir Datos del equipo.");
            System.out.println("4. Imprimir Datos Jugador(es) individual.");
            System.out.println("5. Imprimir estadisticas del equipo");
            System.out.println("6. Imprimir jugador individual.");
            System.out.println("7. Salir.");
            opcion = sc.nextInt();
            
            switch(opcion)
            {
                case 1:
                    System.out.println("Nombre Equipo: ");
                    nombre = str.nextLine();
                    System.out.println("Cantidad Jugadores: ");
                    cantidad = entrada.nextInt();
                    System.out.println("cantidad de Enfrentamientos Disputados: ");
                    cantidadEnfrentamientosDisputados = entrada.nextInt();
                    System.out.println("cantidad de Torneos Disputados: ");
                    cantidadTorneosDisputados = entrada.nextInt();
                    System.out.println("cantidad de Enfrentamientos Ganados: ");
                    cantidadEnfrentamientosGanados = entrada.nextInt();
                    System.out.println("cantidad de Torneos Ganados: ");
                    cantidadTorneosGanados = entrada.nextInt();
                    System.out.println("pais: ");
                    pais = str.nextLine();
                    System.out.println("########################## Entrenador ##########################");
                    Persona entrenador = get_entrenador();
                    
                    Equipo team = new Equipo(nombre, cantidad, entrenador, cantidadEnfrentamientosDisputados, cantidadTorneosDisputados, cantidadEnfrentamientosGanados, cantidadTorneosGanados, pais);
                    listaEquipo.add(team);
                    System.out.println("########################## Jugadores ##########################");
                    while( contador <= cantidad){
                        System.out.println("jugador # "+contador);
                        Jugador jugador = get_jugador();
                        team.crearListaJugadores(jugador);
                        contador++;
                    }
                    contador = 1;
                    System.out.println("########################## Torneos ##########################");
                    while( contador <= cantidadTorneosDisputados){
                        System.out.println("Torneo # "+contador);
                        Torneo torneo = get_torneo();
                        team.crearListaTorneos(torneo);
                        contador++;
                    }
                    cantidadEnfrentamientosDisputados = 0;
                    cantidadTorneosDisputados = 0;
                    cantidadEnfrentamientosGanados = 0;
                    cantidadTorneosGanados = 0;
                    cantidad = 0;
                    contador = 1;
                    break;
                case 2:
                    System.out.println("Nombre Equipo: ");
                    nombre = str.nextLine();
                    System.out.println("cantidad de Enfrentamientos Disputados: ");
                    cantidadEnfrentamientosDisputados_ind = entrada.nextInt();
                    System.out.println("cantidad de Torneos Disputados: ");
                    cantidadTorneosDisputados_ind = entrada.nextInt();
                    System.out.println("cantidad de Enfrentamientos Ganados: ");
                    cantidadEnfrentamientosGanados_ind = entrada.nextInt();
                    System.out.println("cantidad de Torneos Ganados: ");
                    cantidadTorneosGanados_ind = entrada.nextInt();
                    System.out.println("pais: ");
                    pais = str.nextLine();
                    System.out.println("########################## Entrenador ##########################");
                    Persona entrenador_ind = get_entrenador();
                    Individual jug_ind = new Individual(nombre, entrenador_ind, cantidadEnfrentamientosDisputados_ind, cantidadTorneosDisputados_ind, cantidadEnfrentamientosGanados_ind, cantidadTorneosGanados_ind);
                    listajugadores.add(jug_ind);
                    System.out.println("########################## Torneos ##########################");
                    while( contador <= cantidadTorneosDisputados_ind){
                        System.out.println("Torneo # "+contador);
                        Torneo torneo = get_torneo();
                        jug_ind.crearListaTorneos(torneo);
                        contador++;
                    }
                    cantidadEnfrentamientosDisputados_ind = 0;
                    cantidadTorneosDisputados_ind = 0;
                    cantidadEnfrentamientosGanados_ind = 0;
                    cantidadTorneosGanados_ind = 0;
                    contador = 1;
                break;
                case 3:
                    System.out.println("seleccione el equipo que desea: ");
                    for (int i = 0; i < listaEquipo.size(); i++) {
                        System.out.println(i+". "+listaEquipo.get(i).getNombreEquipo());
                    }
                    opc_equipo = entrada.nextInt();
                    System.out.println(listaEquipo.get(opc_equipo).toString());
                    System.out.println("########################## Jugadores ##########################");
                    listaEquipo.get(opc_equipo).imprimirListaJugadores();
                    System.out.println("########################## Torneos ##########################");
                    listaEquipo.get(opc_equipo).imprimirTorneos();
                    opc_equipo = 0;
                    break;
                case 4:
                    System.out.println("seleccione el jugador que desea:");
                    for (int i = 0; i < listajugadores.size(); i++) {
                        System.out.println(i+". "+listajugadores.get(i).getNombreEquipo());
                    }
                    opc_ind = entrada.nextInt();
                    System.out.println(listajugadores.get(opc_ind).toString());
                    System.out.println("########################## Torneos ##########################");
                    listajugadores.get(opc_ind).imprimirTorneos();
                    opc_ind = 0;
                    break;
                case 5:
                    System.out.println("seleccione el equipo que desea: ");
                    for (int i = 0; i < listaEquipo.size(); i++) {
                        System.out.println(i+". "+listaEquipo.get(i).getNombreEquipo());
                    }
                    opc_equipo = entrada.nextInt();
                    System.out.println("Porcentaje de torneos ganados: "+listaEquipo.get(opc_equipo).porcentajeTGanados()+" % ");
                    System.out.println("Porcentaje de torneos perdidos: "+listaEquipo.get(opc_equipo).porcentajeTPerdidos()+" % ");
                    System.out.println("Porcentaje de efectividad: "+listaEquipo.get(opc_equipo).porcentajeEfectividad()+" % ");
                    break;
                case 6:
                    System.out.println("seleccione el jugador que desea:");
                    for (int i = 0; i < listajugadores.size(); i++) {
                        System.out.println(i+". "+listajugadores.get(i).getNombreEquipo());
                    }
                    opc_ind = entrada.nextInt();
                    System.out.println("Porcentaje de torneos ganados: "+listajugadores.get(opc_ind).porcentajeTGanados()+" % ");
                    System.out.println("Porcentaje de torneos perdidos: "+listajugadores.get(opc_ind).porcentajeTPerdidos()+" % ");
                    System.out.println("Porcentaje de efectividad: "+listajugadores.get(opc_ind).porcentajeEfectividad()+" % ");
                    
                    break;
                case 7:
                    estado_juego = false;
                    break;
                
            }
        }while(estado_juego == true);
    }
    
}
