import java.util.Scanner;

public class game {
	public static char [][] creatarray(char [][]x1){
		char [][]x=x1;
		System.out.println("       1         2          3    ");
		System.out.println("   ++++++++++++++++++++++++++++");
		for(int i=0;i<3;i++) {
			System.out.print((i+1));
			for(int j=0;j<3;j++) {
				
				if(j==2) 
					System.out.print("  +    "+x[i][j]+"     +");
				else
					System.out.print("  +    "+x[i][j]);	
			}
			System.out.println();
			System.out.println("   ++++++++++++++++++++++++++++");
		}
		return x;
	}
	public static char [][] RecieveThEimput(char [][]x2) {
		char [][]x=x2;	
		System.out.println("user x  enter the place of x which do you whant");
		System.out.println("enter the number of row ");
		Scanner imput=new Scanner(System.in);
		int num1=imput.nextInt();
		System.out.println("enter the number of colom ");
		int num2=imput.nextInt();
		if((num1<=3)&&(0<num1)&&(0<num2)&&(num2<=3)) {
		if(x[num1-1][num2-1]!='X'&&x[num1-1][num2-1]!='O') {
			   x[num1-1][num2-1]='X';
		}
		else {

			System.out.println("bad entery");
		for(int i=0;i<10;i++) {
			System.out.println("enter the number of row ");
		 num1=imput.nextInt();
		System.out.println("enter the number of colom ");
	     num2=imput.nextInt();
	     if((num1<=3)&&(0<num1)&&(0<num2)&&(num2<=3)) {
		if(x[num1-1][num2-1]!='X'&&x[num1-1][num2-1]!='O') { 
		x[num1-1][num2-1]='X';
		break;}
		else
			System.out.println("bad entery");}
		}
		}
		}
		else
		{

			System.out.println("bad entery");
		for(int i=0;i<10;i++) {
			System.out.println("enter the number of row ");
		 num1=imput.nextInt();
		System.out.println("enter the number of colom ");
	     num2=imput.nextInt();
	     if((num1<=3)&&(0<num1)&&(0<num2)&&(num2<=3)) {
		if(x[num1-1][num2-1]!='X'&&x[num1-1][num2-1]!='O') { 
		x[num1-1][num2-1]='X';
		break;}
		else
			System.out.println("bad entery");}
		}
		}
		return x;
	}
	public static char [][] RecieveThEimput2(char [][]x2) {
		char [][]x=x2;	
		System.out.println("user O  enter the place of x which do you whant");
		System.out.println("enter the number of row ");
		Scanner imput=new Scanner(System.in);
		int n1=imput.nextInt();
		System.out.println("enter the number of colom ");
		int n2=imput.nextInt();
		if((n1<=3)&&(0<n1)&&(0<n2)&&(n2<=3)) {
		if(x[n1-1][n2-1]!='X'&&x[n1-1][n2-1]!='O'&&n1<=3&&n2<=3) { 
		x[n1-1][n2-1]='O';}
		else {

			System.out.println("bad entery");
			for(int i=0;i<10;i++) {
				System.out.println("enter the number of row ");
			 n1=imput.nextInt();
			System.out.println("enter the number of colom ");
		     n2=imput.nextInt();
		     if((n1<=3)&&(0<n1)&&(0<n2)&&(n2<=3)) {
			if(x[n1-1][n2-1]!='X'&&x[n1-1][n2-1]!='O') { 
			x[n1-1][n2-1]='O';
			break;}
			else
				System.out.println("bad entery");}
			}
		
		}
		
		}
		
		else
		{
			System.out.println("bad entery");
			for(int i=0;i<10;i++) {
				System.out.println("enter the number of row ");
			 n1=imput.nextInt();
			System.out.println("enter the number of colom ");
		     n2=imput.nextInt();
		     if((n1<=3)&&(0<n1)&&(0<n2)&&(n2<=3)) {
			if(x[n1-1][n2-1]!='X'&&x[n1-1][n2-1]!='O') { 
			x[n1-1][n2-1]='O';
			break;}
			else
				System.out.println("bad entery");}
			}
		}
		return x;
	}

	public static int rowcheck( char [][]x3) {
		
			char [][]x=x3;
		for(int i=0;i<3;i++) {
			int j=0;
			if((x[i][j]=='X')&&(x[i][j+1]=='X')&&(x[i][j+2]=='X')) {
				return 1;
				
			}
			if((x[i][j]=='O')&&(x[i][j+1]=='O')&&(x[i][j+2]=='O')) {
				return 2;
			}
		}
		return 0;	
	}
	
	public static int colomcheck( char [][]x3) {
		char [][]x=x3;
		for(int j=0;j<3;j++) {
			int i=0;
			if(x[i][j]=='X'&&x[i+1][j]=='X'&&x[i+2][j]=='X') {
				return 1;
			}
			if(x[i][j]=='O'&&x[i+1][j]=='O'&&x[i+2][j]=='O') {
				return 2;
			}
		}
		return 0;	
	}
	public static int diagonalcheck1(char[][]x4) {
		char [][]x=x4;
		int j=0;
		int i=0;
		if(x[i][j]=='X'&&x[i+1][j+1]=='X'&&x[i+2][j+2]=='X') {
			return 1;
		}
		if(x[i][j]=='O'&&x[i+1][j+1]=='O'&&x[i+2][j+2]=='O') {
			return 2; }
		return 0;
	}
	public static int diagonalcheck2(char[][]x5) {
		char [][]x=x5;
		int i=0;
		int j=2;
		if(x[i][j]=='X'&&x[i+1][j-1]=='X'&&x[i+2][j-2]=='X') {
			return 1;
		}
		if(x[i][j]=='O'&&x[i+1][j-1]=='O'&&x[i+2][j-2]=='O') {
			return 2;
		}
		return 0;
	}
	public static int closeGame(char[][]x5) {
		char [][]x=x5;
		int c=0;
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if(x[i][j]=='X'||x[i][j]=='O') {
				c++;	
				}
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		int s; 
		int t;
		int v;
		int q;
		char[][]x=new char[3][3];
		creatarray(x);
		for (int i=0;i<5;i++ ){
			x=RecieveThEimput(x);
		    creatarray(x);
		    r=diagonalcheck2(x);		    
		    s=diagonalcheck1(x);
		    t=colomcheck(x);
		    v=rowcheck(x);
		    q=closeGame(x);
		    if((r==1)||(s==1)||(t==1)||(v==1)) {
		    	System.out.println("the user X is win");
             break;
		    }
		    if((r==2)||(s==2)||(t==2)||(v==2)) {
		    	System.out.println("the user O is win");
		    	break;
         	}
		    if(q==9) {
		    	System.out.println("no one is win");
		    	break;
		    }
		    
		    x=RecieveThEimput2(x);
		    creatarray(x);
		    r=diagonalcheck2(x);		    
		    s=diagonalcheck1(x);
		    t=colomcheck(x);
		    v=rowcheck(x);
		    q=closeGame(x);
		    if((r==1)||(s==1)||(t==1)||(v==1)) {
		    	System.out.println("the user X is win");
		    	System.out.println("congratulations");
             break;
		    }
		    if((r==2)||(s==2)||(t==2)||(v==2)) {
		    	System.out.println("the user O is win");
		    	System.out.println("congratulations");
		    	break;}
		    	 if(q==9) {
				    	System.out.println("no one is win");
				    	break;
				    }
         	} 

}
}
