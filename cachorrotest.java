import java.util.Scanner;

public class CachorroTest
{
	public static void main(String[] args)
{
		
		Scanner input = new Scanner(System.in);
		String nome;
		System.out.println("Nome:");
		nome = input.nextLine();
		Cachorro alf = new Cachorro();
		alf.latir(nome);
		
}



}