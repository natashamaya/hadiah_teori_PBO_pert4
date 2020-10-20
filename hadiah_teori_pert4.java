import java.util.Scanner;
public class hadiah_teori_pert4{
	public static void main(String[] args)
	{
		String nama;
		int NT1, NT2, NT3, NMID, NF;
		double NRATA, NA;
		char grade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Nama Anda : ");
		nama = input.nextLine();
		
		System.out.print("Masukkan Nilai Tugas 1 : ");
		NT1 = input.nextInt();
		
		System.out.print("Masukkan Nilai Tugas 2 : ");
		NT2 = input.nextInt();
		
		System.out.print("Masukkan Nilai Tugas 3 : ");
		NT3 = input.nextInt();
		
		System.out.print("Masukkan Nilai MID : ");
		NMID = input.nextInt();
		
		System.out.print("Masukkan Nilai Final : ");
		NF = input.nextInt();
		
		
		NRATA = (NT1 + NT2 + NT3)/3;
		NA = (NRATA * 0.3)+(NMID*0.3)+(NF * 0.4);
		System.out.print("Nilai Akhir Anda = " + NA);
		System.out.println("");
		
		
		if(NA>=80) {
			 grade = 'A';	
				
		}else if(NA>=60) {
			 grade = 'B';
			
		}else if(NA>=50){
			 grade = 'C';
			 
		}else if(NA >=40){
		     grade = 'D';
		     
		}else{
			 grade = 'E';
			 
		}
		
		System.out.println("Grade atau Nilai Huruf yang Anda dapatkan yaitu = "+grade);
		
	}
		}