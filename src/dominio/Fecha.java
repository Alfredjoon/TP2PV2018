/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Alfred
 */
public class Fecha {

    public void mostrarFecha(Calendar cal) {
        cal.add(Calendar.DAY_OF_MONTH, 100);
        DateFormat dateFormatter;
        dateFormatter = DateFormat.getDateInstance(DateFormat.FULL);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE" + "," + "dd MMMM yyyy");
        System.out.println("La fecha 100 dias despues es: " + dateFormatter.format(cal.getTime()));

    }

    public void restarFecha(String fechaInicial, String fechaFinal) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date fInicial = sdf.parse(fechaInicial);
        Date fFinal = sdf.parse(fechaFinal);
        Calendar feInicial = Calendar.getInstance();
        Calendar feFinal = Calendar.getInstance();
        feInicial.setTime(fInicial);
        feFinal.setTime(fFinal);

        long mili = feFinal.getTimeInMillis() - feInicial.getTimeInMillis();
        long days = mili / 86400000;

        int dias = -1;
        while (feInicial.before(feFinal) || feInicial.equals(feFinal)) {

            dias++;
            feInicial.add(Calendar.DATE, 1);

        }
        System.out.println("La cantidad de dias entre las dos fechas es: " + dias + " dias");
        System.out.println("La cantidad de dias entre las dos fechas es: " + days + " dias");

    }

    public void calcularEdad() throws ParseException {
        Scanner scan = new Scanner(System.in);
        String fnacimiento;
        System.out.println("ingrese fechad de nachimiento");
        fnacimiento = scan.next();
        Calendar fnaci = new GregorianCalendar();
        Calendar fActual = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = sdf.parse(fnacimiento);
        fnaci.setTime(fecha);
        long days = (fActual.getTimeInMillis() - fnaci.getTimeInMillis()) / 604800000;

        System.out.println("La cantidad de semanas vividas es : " + days);
    }

    public void mostrarEstacion() throws ParseException {
        
        Scanner sc = new Scanner(System.in);
       SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
       Calendar c = Calendar.getInstance();
       String fecha;
       
       System.out.println("ingrese fecha, Formato dd/MM/yyyy");
       fecha = sc.next();
       c.setTime(sd.parse(fecha));
       
       switch(c.get(Calendar.MONTH)+1){
                    
            case 1:                        
            case 2: 
                System.out.println("Verano");
                break;
            case 3:     
                 if(c.get(Calendar.DAY_OF_MONTH)>=21){
                System.out.println("Otoño");
                }else{
                 System.out.println("Verano");
                 }
                break;                        
            case 4:
            case 5:
                System.out.println("Otoño");
                break;                
            case 6:
                 if(c.get(Calendar.DAY_OF_MONTH)>=21){
                System.out.println("Invierno");
                }else{
                 System.out.println("Otoño");
                 }   
                break;                
            case 7: 
            case 8:     
                System.out.println("Invierno");
                break;
            case 9:
                 if(c.get(Calendar.DAY_OF_MONTH)>=21){
                System.out.println("Primavera");
                }else{
                 System.out.println("Invierno");
                 } 
                 break;
            case 10:
            case 11:    
                System.out.println("Primavera");
                break;
            case 12:    
                 if(c.get(Calendar.DAY_OF_MONTH)>=21){
                System.out.println("Verano");
                }else{
                 System.out.println("Primavera");
                 } 
                 break;
                
            default:System.out.println("OPCION INCORRECTA");
                   
        }
        
            }   

    public void mostrarFechaRango() throws ParseException {
        Scanner scan = new Scanner(System.in);
        Calendar fInicial = Calendar.getInstance();
        Calendar fFinal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaI, fechaF;
        System.out.println("ingrese Fecha inicial ");
        fechaI = scan.next();
        System.out.println("ingrese Fecha final ");
        fechaF = scan.next();
        fInicial.setTime(sdf.parse(fechaI));
        fFinal.setTime(sdf.parse(fechaF));
        while (fInicial.before(fFinal) || !fInicial.equals(fFinal)) {

            fInicial.add(Calendar.DAY_OF_WEEK, 1);

            System.out.println(fInicial.getTime());

        }

    }

    public void mostrarCanditadDomingos() throws ParseException {

        Scanner scan = new Scanner(System.in);
        Calendar fInicial = Calendar.getInstance();
        Calendar fFinal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaI, fechaF;
        System.out.println("ingrese Fecha inicial ");
        fechaI = scan.next();
        System.out.println("ingrese Fecha final ");
        fechaF = scan.next();
        fInicial.setTime(sdf.parse(fechaI));
        fFinal.setTime(sdf.parse(fechaF));
        int domingos = 0;
        while (fInicial.before(fFinal) || !fInicial.equals(fFinal)) {

            fInicial.add(Calendar.DAY_OF_MONTH, 1);

            if (fInicial.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                domingos++;
            }

        }
        System.out.println("la cantidad de domingos es " + domingos);

    }

}
