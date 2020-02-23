public class SIandCI{
	public static double simpleInterest(double p,double t,double r){
		return (p*t*r)/100;
}
	public static double compoundInterest(double p,double t,double r){
		return p * Math.pow(1.0+r/100.0,t) - p;
}
}
