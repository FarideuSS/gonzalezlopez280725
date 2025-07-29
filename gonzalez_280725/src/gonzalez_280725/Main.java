/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gonzalez_280725;

/**
 *
 * @author UFG
 */
public class Main {
    
    public static String nombres = "Farid Mauricio";
    public static String apellidos = "Gonzalez Lopez";
    public static int anio_de_nacimiento = 2005;
    public static int mes_de_nacimiento = 9;
    public static float estatura = 1.75f; // altura en metros
    public static float peso = 160.0f; // peso en libras
    public static char genero = 'M';
    public static String estado_familiar = "Ocupado...";
    public static double salario_mensual = 746.16d; // monto en dolares
    
    
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double imc = 0.0d;
        float tasa_kilogramo = 0.453592f; // 1 libra equivale a 0.453592 KG
        int dias_laborales = 22; // dias laborales al mes
        int horas_laborales = 8; // horas laborales al dia
        
        //conversion de lb a kg
        float peso_kilogramos = Main.peso * tasa_kilogramo;
        
        // elavando al cuadrado la estatura
        float estatura_al_cuadrado = Main.estatura*Main.estatura;
        
        // calcular el IMC
        imc = peso_kilogramos/estatura_al_cuadrado;
        
        // calculando el salario diario
        double salario_diario = Main.salario_mensual/dias_laborales;
        
        // calculando el salario por hora
        double salario_hora = salario_diario/horas_laborales;
        
        // salida de datos
        System.out.println("Saludos "+Main.nombres+" "+Main.apellidos);
        System.out.println("Su peso en libras es: "+Main.peso+", pero en kilogramos es: "+peso_kilogramos);
        System.out.println("Su IMC es: "+imc);
        System.out.println("Su salario mensual es: "+Main.salario_mensual);
        System.out.println("Su salario diario es: "+salario_diario);
        System.out.println("Su salario por hora es: "+salario_hora);
    }
    
}
