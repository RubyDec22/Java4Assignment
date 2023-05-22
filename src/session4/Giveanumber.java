package session4;

import java.util.Scanner;

public class Giveanumber {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		for(int i=1; i<=20; i=i+4){
			if(i==5){
				i=i-1;
			}
			System.out.print(i+",");
			}
		System.out.println();
		System.out.println("choose a number less than 10 to print");
		System.out.println("give me a number?");
		Scanner ui=new Scanner (System.in);
		int n=ui.nextInt();
		for(int i=n; i<=10; i=i-1) {
			if(i<0) {
				continue;
				}
			System.out.print(i+" ");
			}
	   System.out.println();
	   System.out.println("give me a word?");
	   Scanner ux=new Scanner (System.in);
	   String h=ux.nextLine();
	   for(int z=0; z<h.length(); z++) {
		   System.out.print(h.charAt(z)+" ");
		   Thread.sleep(500);
	   }
		
		}

}
