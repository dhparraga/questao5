package eventoJava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EventoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner leitor = new Scanner(System.in); 
	List<Evento> listaEventos = new ArrayList<>();
	
	
	Integer reply; 

	reply = 0;
	while (!reply.equals(3)) {
//		clearScreen();
		headerOption();
		System.out.print("Digite a opção: ");
		reply = leitor.nextInt();
	switch (reply) {
	case 1:
		Evento ee = adicionarNovoEvento(); 
		
		if(ee != null) {
			listaEventos.add(ee); 
		}
		break; 
	case 2:
		if(listaEventos.isEmpty()) {
			System.out.println("Ops! sem eventos cadastrado :(");
			break; 
		}
		
		for (Evento e: listaEventos) {
			System.out.println("Evento: " + e.getNomeEvento());
			System.out.println("Data Evento: " + e.getDataEvento());
			System.out.println("Tempo de duração: " + e.getDuracaoEvento() + " minutos" );
			System.out.printf("\n \n");
		}
		
		break; 
	case 3:
		System.out.println("Ok, sistema finalizando..."); 
		break; 
	
	default:
		System.out.println("Opção inválida...");
		break; 
		
	} 
} 
	

	
	}
	
	
	public static void headerOption() {
		
		System.out.println(" --------------------------");
		System.out.println("Escolha uma das opções:");
		System.out.println("[1] Inserir novo Evento");
		System.out.println("[2] Listar Eventos");
		System.out.println("[3] Sair");
		System.out.println(" --------------------------");
	}
	
	
	public static void clearScreen() {
		for (int i = 0; i < 100; i ++) {
			System.out.printf("\n");
		}
	}
	
	public static Evento adicionarNovoEvento() {
		Evento e = null; 
		
		System.out.print("Nome evento:");
		String nomeEvento = new java.util.Scanner(System.in).nextLine();
		System.out.println("Data do evento:");
		String dataEvento = new java.util.Scanner(System.in).next(); 
		System.out.println("Tempo evento(minutos)");
		int minutos = new java.util.Scanner(System.in).nextInt(); 
		
		return e = new Evento(nomeEvento, dataEvento, minutos); 
	}
		

}

