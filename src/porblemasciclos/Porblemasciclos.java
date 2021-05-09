package porblemasciclos;
import java.util.Scanner;


public class Porblemasciclos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int valor;
         String fin = "si";
         
         do{
         System.out.println("Bienvenido a problemas ciclos, acontinuación se mostraran los ciclos disponibles");
            System.out.println("Ciclo For = 1");
            System.out.println("Ciclo Do-while = 2");
            System.out.println("Ciclo While = 3"); 
            System.out.println("Ingresa el número del ciclo al que quieres ingresar");
            valor = sc.nextInt();
            sc.nextLine();
                  
            switch(valor){
                case 1: 
                    System.out.println("Elegiste el ciclo For");
                        System.out.println("Acontinuación se mostraran los problemas disponibles "); 
                        System.out.println("Problema 1 = Números del 1 al 30");
                        System.out.println("Problema 2 = Días en un mes");
                        System.out.println("Problema 3 = Calificaciones");
                        System.out.println("Ingresa el número del problema al que quieres ingresar");
                        valor = sc.nextInt();
                        sc.nextLine();
                        
                        switch(valor){
                            case 1: Números();        break;
                            case 2: Días();           break;
                            case 3: Calificaciones(); break;
                            default:
                                 System.out.println("Ingresaste un valor incorrecto");
                        }   
                break;
                case 2: 
                     System.out.println("Elegiste el ciclo Do-while");
                        System.out.println("Acontinuación se mostraran los problemas disponibles "); 
                        System.out.println("Problema 1 = Calificación al usuario");
                        System.out.println("Problema 2 = Calificación al usuario 10 veces");
                        System.out.println("Ingresa el número del problema al que quieres ingresar");
                        valor = sc.nextInt();
                        sc.nextLine();
                        
                        switch(valor){
                            case 1: Usuario();     break;
                            case 2: Explicación(); break;
                            default:
                                 System.out.println("Ingresaste un valor incorrecto");
                        }   
                break;
                case 3: 
                     System.out.println("Elegiste el ciclo While");
                        System.out.println("Acontinuación se mostraran los problemas disponibles "); 
                        System.out.println("Problema 1 = Música en la fiesta");
                        System.out.println("Problema 2 = Se acabó la fiesta");
                        System.out.println("Ingresa el número del problema al que quieres ingresar");
                        valor = sc.nextInt();
                        sc.nextLine();
                        
                        switch(valor){
                            case 1: Música();     break;
                            case 2: MediaNoche(); break;
                            default:
                                 System.out.println("Ingresaste un valor incorrecto");
                        }   
                break;
                default:
                    System.out.println("Ingresaste un valor incorrecto");
                    System.out.println("¿Quieres reiniciar el programa (si o no)");
                    fin = sc.nextLine();
                 break;   
            }
                if(valor <= 3 && valor > 0){ 
                    System.out.println("Quieres ingresar a otro ciclo o no (si o no)");
                    fin = sc.nextLine();
                }
           }while(fin.equalsIgnoreCase("si"));
                System.out.println("Gracias por utilizar el programa");       
               
            
    }
    public static void Números(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido a Números del 1 al 30");
         System.out.println("Se imprimiran los números del 1 al 30 donde cada 7 números se imprimirá una linea vacia");
        
         for(int i = 1; i<=30; i++){
             if(i%7 ==0){
               System.out.println("");  
             }else{
             System.out.println(i);
             }
         }
    }
    public static void Días(){
        Scanner sc = new Scanner(System.in);
        int mes;
        
        System.out.println("Bienvenido a Días en un mes");
        System.out.println("Ingrese el número del mes para saber cuantos días tiene");
         mes = sc.nextInt();
          sc.nextLine();
             
        switch(mes){
            case 1:  
               System.out.println("Elegiste a enero");
                System.out.println("Enero tiene");
                 for(int i = 1; i<=31; i++){
                    System.out.print(i+ ", ");
                 }
                System.out.println("días");
            break;
            case 2:  
               System.out.println("Elegiste a febrero");
                System.out.println("Febrero tiene");
                 for(int i = 1; i<=28; i++){
                    System.out.print(i+ ", ");
                 }
                System.out.println("días");
                System.out.println("o 29 días si es año bisiesto");
            break;
            case 3:  
               System.out.println("Elegiste a marzo");
                System.out.println("Marzo tiene");
                 for(int i = 1; i<=31; i++){
                    System.out.print(i+ ", ");
                 }
                System.out.println("días");
            break;
            case 4:  
               System.out.println("Elegiste a abril");
                System.out.println("abril tiene");
                 for(int i = 1; i<=30; i++){
                    System.out.print(i+ ", ");
                 }
                System.out.println("días");
            break;
            case 5:  
               System.out.println("Elegiste a mayo");
                System.out.println("Mayo tiene");
                 for(int i = 1; i<=31; i++){
                    System.out.print(i+ ", ");
                 }
                System.out.println("días");
            break;
            case 6:  
               System.out.println("Elegiste a junio");
                System.out.println("Junio tiene");
                 for(int i = 1; i<=30; i++){
                    System.out.print(i+ ", ");
                 }
                System.out.println("días");
            break;
            case 7:  
               System.out.println("Elegiste a julio");
                System.out.println("Julio tiene");
                 for(int i = 1; i<=31; i++){
                    System.out.print(i+ ", ");
                 }
                System.out.println("días");
            break;
            case 8:  
               System.out.println("Elegiste a agosto");
                System.out.println("Agosto tiene");
                 for(int i = 1; i<=31; i++){
                    System.out.print(i+ ", ");
                 }
                System.out.println("días");
            break;
            case 9:  
               System.out.println("Elegiste a septiembre");
                System.out.println("septiembre tiene");
                 for(int i = 1; i<=30; i++){
                    System.out.print(i+ ", ");
                 }
                System.out.println("días");
            break;
            case 10:  
               System.out.println("Elegiste a octubre");
                System.out.println("Octubre tiene");
                 for(int i = 1; i<=31; i++){
                    System.out.print(i+ ", ");
                 }
                System.out.println("días");
            break;
            case 11:  
               System.out.println("Elegiste a noviembre");
                System.out.println("noviembre tiene");
                 for(int i = 1; i<=30; i++){
                    System.out.print(i+ ", ");
                 }
                System.out.println("días");
            break;
            case 12:  
               System.out.println("Elegiste a diciembre");
                System.out.println("diciembre tiene");
                 for(int i = 1; i<=31; i++){
                    System.out.print(i+ ", ");
                 }
                System.out.println("días");
            break;    
            default:
                 System.out.println("Ingresaste un valor incorrecto");
        }  
    }
    public static void Calificaciones(){
        Scanner sc = new Scanner(System.in);
        String alu;
        float cali1, cali2, cali3, pro;
        System.out.println("Bienvenido a Calificaciones");
        System.out.println("Se ingresaran los datos de 5 estudiantes");
        
        for(int i = 1; i<=5; i++){
             System.out.println("Ingresa el nombre del estudiante " + i);
              alu = sc.nextLine();
             
              System.out.println("Ingresa la calificación de " + alu + " en la materia de Fundamentos de la programación");
                cali1 = sc.nextFloat();
                 sc.nextLine();
              System.out.println("Ingresa la calificación de " + alu + " en la materia de Cálculo");
                cali2 = sc.nextFloat();
                 sc.nextLine();
              System.out.println("Ingresa la calificación de " + alu + " en la materia de Matemáticas discretas");
                cali3 = sc.nextFloat();
                 sc.nextLine();   
              
               pro = (cali1+cali2+cali3)/3;
               System.out.println("El estudiante " + alu);
               System.out.println("Tiene un " + cali1 + " en Fundamentos de la programación");
               System.out.println("Tiene un " + cali2 + " en Cálculo");
               System.out.println("Tiene un " + cali3 + " en Matemáticas discretas");
               System.out.println("Tiene un promedio de " + pro);
               
         }
    }
    public static void Usuario(){
        Scanner sc = new Scanner(System.in);
        int cal;
        int erronea=0;
        
        System.out.println("Calificación al usuario");
           
         do{
          System.out.println("Escriba una calificacion correcta: ");
           cal = sc.nextInt();
            sc.nextLine();
          
            if (cal <0 || cal > 10){
              erronea=1;
              System.out.println("La calificacion es erronea, introduzca de nuevo: ");
            }else{
              erronea = 0;
            }
          }while (erronea != 0);
          System.out.println("Gracias, su calificación es " + cal);
    }
    public static void Explicación(){
        Scanner sc = new Scanner(System.in);
        int calif=0;
        int erronea=0;
        int i;
        
        System.out.println("Bienvenido a Calificación al usuario 10 veces");      
            for (i = 1; i<=10; i++){
              do{
                System.out.println("Escriba una calificacion correcta: ");
                calif= sc.nextInt();
                 if (calif <0 || calif > 10){
                    System.out.println("La calificacion es erronea, introduzca de nuevo: ");
                    erronea = 1;
                 }else{
                    erronea = 0;
                 }
              }while(erronea != 0);
                System.out.println("Gracias!!");
            }
    }
    public static void Música(){
        Scanner sc = new Scanner(System.in);
        int inv = 1;
        
        System.out.println("Bienvenido a Música en la fiesta");
        System.out.println("La música comienza a sonar");
         while(inv!=0){
            System.out.println("¿Cúantos invitados hay en la fiesta?");
            inv = sc.nextInt();
            sc.nextLine();
            if(inv!=0){
            System.out.println("La música sigue sonando");
            }
        }
         System.out.println("Se acabó la fiesta y la música");
         
    }
    public static void MediaNoche(){
        Scanner sc = new Scanner(System.in);
        String tiempo = "no";
        
        System.out.println("Bienvenido a Se acabó la fiesta");
        System.out.println("La música comienza a sonar");
         
        while(tiempo.equalsIgnoreCase("no")){
            System.out.println("¿Ya es medianoche o más tarde?(si o no)  ");
            tiempo = sc.nextLine();
            if(tiempo.equalsIgnoreCase("no")){
            System.out.println("La música sigue sonando");
            }
           
        }
         System.out.println("Se acabó la fiesta y la música");
    }
    
}
