package ar.edu.unlam.pb1.CodigoAscii;

public class CodigoAscii {

	public static void main(String[] args) { // con While declaro una variable y le incremento el valor --> contador -->
		String mostraMayusculas;							// entre los valores
		String mostraMinusculas;
		String mostraNumeros;
		String mostraEspeciales;
		String mostraEspeciales2;
		String mostraEspeciales3;
		String mostraEspeciales4;
		
		mostraMayusculas = " ";
		for (int i = 65; i <= 90; i++) {
			char letraMayuscula = (char) i;
			mostraMayusculas += " " + letraMayuscula;
		}
		mostrarMensaje("---Caracteres en Mayusculas---\n");
		mostrarMensaje(mostraMayusculas + "\n");

		mostraMinusculas = " ";
		for (int i = 97; i <= 122; i++) {
			char letraMinuscula = (char) i;
			mostraMinusculas += " " + letraMinuscula;
		}
		mostrarMensaje("---Caracteres en minuscula---\n");
		mostrarMensaje(mostraMinusculas + "\n");

		mostraNumeros = " ";
		for (int i = 48; i <= 57; i++) {
			char numeros = (char) i;
			mostraNumeros += " " + numeros;
		}
		mostrarMensaje("---Caracteres Numericos---\n");
		mostrarMensaje(mostraNumeros + "\n");

		mostraEspeciales = " ";
		for (int i = 32; i <= 47; i++) { // 32 es el espacio en blanco
			char especiales = (char) i;
			mostraEspeciales += " " + especiales;
		}
		mostraEspeciales2 = " ";
		for (int i = 58; i <= 64; i++) {
			char especiales2 = (char) i;
			mostraEspeciales2 += " " + especiales2;
		}
		mostraEspeciales3 = " ";
		for (int i = 91; i <= 96; i++) {
			char especiales3 = (char) i;
			mostraEspeciales3 += " " + especiales3;
		}
		mostraEspeciales4 = " ";
		for (int i = 123; i <= 126; i++) {
			char especiales4 = (char) i;
			mostraEspeciales4 += " " + especiales4;
		}
		mostrarMensaje("---Caracteres especiales---");
		mostrarMensaje("\n" + mostraEspeciales + mostraEspeciales2 + mostraEspeciales3 + mostraEspeciales4);
	}

	public static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
}
