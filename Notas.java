package alumnos;

import java.util.ArrayList;

public class Notas {
	private String asignatura;
	private ArrayList<Double> listaNotas = new ArrayList<>();
	
	public Notas(String a) {
		this.asignatura = a;
	}
	
	public void anyadirNota(Double d) {
		//añadir el double al arraylist
	}
	
	//metodo que devuelve una cadena con la lista de notas
	public String infoNotas() {
		String info = "Asignatura: " + this.asignatura + "\n";
		
		for(Double d : this.listaNotas) {
			//concatenar la informacion necesaria para generar el texto pedido
		}
		//añadir un salto de linea
		return info;
	}
	
	//metodo para calcular la nota media
	public Double notaMedia() {
		Double media = 0.0;
		for(Double d : this.listaNotas) {
			//sumar todas las notas almacenando el resultado en el double media
		}
		//dividir la suma de las notas por el numero de notas y almacenarlo en el double media 
		return media;
	}
	
	//metodo que dice cuantas notas son menores que 5 del total
	public String menoresCinco() {
		int contador =0;
		
		//usando un bucle for each, incrementar el contador si una nota es < 5.0
		
		return "Hay " + contador + " notas menores que cinco de un total de " + this.listaNotas.size();
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public ArrayList<Double> getListaNotas() {
		return listaNotas;
	}

	public void setListaNotas(ArrayList<Double> listaNotas) {
		this.listaNotas = listaNotas;
	}
	
}
