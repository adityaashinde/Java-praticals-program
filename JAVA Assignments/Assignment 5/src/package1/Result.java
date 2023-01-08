package package1;

public class Result{
	public static void main(String[] args) {
		int [][] marks = {
				{78,65,79,79,67},
				{87,56,55,68,66},
				{68,78,87,82,93}
		};
		System.out.println("Result :");
		System.out.println("Total marks of each students:");
		
		int total;
		for(int r=0; r<3; r++) {
			System.out.print("Student"+(r+1)+":");
			total=0;
			for(int c=0; c<5; c++) {
				total=total + marks[r][c];
			}
			System.out.println(total);
		}
		System.out.println("Average of each subjects:");
		for (int c=0; c<5; c++) {
			System.out.print("Subject" + (c+1)+":");
			total = 0;
			for (int r=0;r<3;r++) {
				total = total + marks[r][c];
			}
			System.out.println(total/3);
		}
	}
}

