package Session3;

import java.util.Scanner;

public class Nesteforloop {
public static void main(String[] args) {
	/* for(int i = 1; i<=4; i++) {
		for(int j =1; j<=4; j++) {
	System.out.print(" "+j);
			System.out.println(i);
		}
	System.out.println();
	}

}*/
	/*for(int i = 1; i<=5; i++) {
		for(int j = 1; j<i+1; j++) {
			System.out.print(j+"");
		}
		System.out.println();

}*/

/*int num = 8;

for(int i=0;i<num;i++) {
	for(int j=1;j<=num-i;j++) {
		System.out.println("* ");
	}
System.out.println();
}*/


//Diamond pattern
Scanner sc= new Scanner(System.in);

//No.of rows by user to give for pattern printing
System.out.print("Enter no.of rows: ");

int rows = sc.nextInt();

//Top half of diamond
for(int i= 1;i<=rows;i++) {
	//leading spaces
	for(int j= 1; j<rows; j++ ) {
		System.out.print(" ");
		
	}
	//print*
	for(int k = 1; k<(2*i-1); k++) {
		System.out.print("*");
	}
	System.out.println();

//Bottom half of diamond
	for(int i1= rows-1;i1<=1;i1++) {
		//leading spaces
		for(int j=rows;j>i1;j--) {
			
			System.out.print("");
		}
		//print*
		for(int k=1;k<=(2*i-1); k++) {
			System.out.print("*");
		}
		System.out.println();
	}
}

}

}



