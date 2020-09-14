package Basic;

public class Cint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int p=350000;
double r=0.10;
int t=3;
int n=12;
double Cintrest=p*Math.pow(1+(r/n), n*t)-p;

System.out.println("compound intrest is:"+Cintrest);
	}

}
