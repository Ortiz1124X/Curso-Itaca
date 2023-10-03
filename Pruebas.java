package alumnos;

public class Pruebas {

	public static void main(String[] args) {
		Notas n1 = new Notas("Mates");
		n1.anyadirNota(10.00);
		n1.anyadirNota(5.00);
		n1.anyadirNota(2.00);
		Notas n2 = new Notas("Ingles");
		n2.anyadirNota(3.00);
		n2.anyadirNota(3.00);
		n2.anyadirNota(1.00);
		Notas n3 = new Notas("Dibujo");
		n3.anyadirNota(2.00);
		n3.anyadirNota(5.00);
		n3.anyadirNota(2.00);
		Asignaturas a1 = new Asignaturas();
		a1.anyadirAsignatura(n1);
		a1.anyadirAsignatura(n2);
		a1.anyadirAsignatura(n3);
		
//		System.out.println(n3.infoNotas());
//		System.out.println(n3.notaMedia());
//		System.out.println(n3.menoresCinco());
//		System.out.println(a1.infoAsignaturas());
//		System.out.println(a1.infoMedias());
//		System.out.println(a1.infoSuspendidas());
//		System.out.println(n1.menoresCinco());
//		a1.generarInforme();
	}//main

}//pruebas
