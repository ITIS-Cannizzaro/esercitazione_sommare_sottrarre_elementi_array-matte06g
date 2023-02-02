
import java.util.Scanner;
public class Nessimatteo
{
	static double sommapari = 0;
	static double diffdispari = 0;
	static double[]array = new double[10];

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < array.length; i++)
		{
			System.out.println("Inserire un valore intero:");
			array[i] = in.nextInt();
		}
		System.out.println("Selezionare l'esercizio:");
		System.out.println("1-Somma gli elementi dell'Array con indice pari;");
		System.out.println("2-Sottrae gli elementi  dell'Array con indice dispari;");
		System.out.println("3-Dato un array di interi realizza un array inverso.");
		int scelta = in.nextInt();
		switch(scelta)
		{
		case 1:
			sommadeipari(array);
			System.out.println("La somma degli elementi pari è " + sommapari + ";");
			break;
		case 2:
			sommadeidispari(array);
			System.out.println("La diff degli elementi dispari è " + diffdispari + ";");
			break;
		case 3:
			ordineinverso();
			break;
		}

	}
	static double sommadeipari(double[]a)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] % 2 == 0)
			{
				sommapari += array[i];
			}
			
		}
		return sommapari;
	}
	static double sommadeidispari(double[]a)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] % 2 != 0)
			{
				diffdispari -= array[i];
			}
		}
		return diffdispari;
	}
	static void ordineinverso()
	{
		double[]banana = new double[10];
		for(int i = array.length - 1, j = 0; i >= 0 && j < array.length; i--, j++)
		{
			
			banana[j] = array[i];
		}
		for(int i = 0; i < array.length; i++)
		{
			array[i] = banana[i];
		}
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		
	}
	static void swap(int a, int b, double[]banana)
	{
		double temp = array[a];
		array[a] = array[b];
		array [b] = temp;
	}
	

}
