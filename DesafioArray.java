package arrays;

//import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner tcl = new Scanner(System.in);//variable for data entry
		
		System.out.print("Digite o número total de notas: ");//message
		final int notasNum = tcl.nextInt();//data input
		
		double notasAluno[] = new double[notasNum];//creating an array
		
		for(int i = 0; i < notasNum; i++) {//loop for user data entry
			System.out.printf("Digite a %dª nota: ", i + 1);//message
			double notas = tcl.nextDouble();//data input
			
			notasAluno[i] = notas;//adding notes to the array
		}
		//System.out.println(Arrays.toString(notasAluno));
		
		tcl.close();
		
		double totalAluno = 0;//variable to add the student's total grade
		for(double nota: notasAluno) {//loop to calculate the student's total grade
			totalAluno += nota;
		}
		System.out.printf("A média do aluno é %.1f.", totalAluno / notasNum);//message showing the student's final average
	}

}
