package br.edu.principal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;
public class principal {

	public static void main(String[] args) {
		LocalDate dataAtual = LocalDate.now();
        int dia = dataAtual.getDayOfMonth();
        int mes = dataAtual.getMonthValue();
        int ano = dataAtual.getYear();
        
       LocalTime horaAtual = LocalTime.now();
       int hora = horaAtual.getHour();
       int min = horaAtual.getMinute();
       
       System.out.println("Data Atual: " + dia + "/" + mes + "/" + ano + " - ");
       
       switch (mes) {
       case 1: System.out.println("janeiro"); break;
       case 2: System.out.println("fevereiro"); break;
       case 3: System.out.println("março"); break;
       case 4: System.out.println("abril"); break;
       case 5: System.out.println("maio"); break;
       case 6: System.out.println("junho"); break;
       case 7: System.out.println("julho"); break;
       case 8: System.out.println("agosto"); break;
       case 9: System.out.println("setembro"); break;
       case 10: System.out.println("outubro"); break;
       case 11: System.out.println("novembro"); break;
       case 12: System.out.println("dezembro"); break;
   }
       System.out.println("Hora Atual: " + hora + ":" + min);
	}

}
