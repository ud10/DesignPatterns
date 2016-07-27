package strategy;

interface Flys{
	String fly();
}
class ItFlys implements Flys{
	public String fly(){
		return "Flying High";
	}
}
class CantFlys implements Flys{
	public String fly(){
		return "I can't fly";
	}
}
/*
 * In Animals.java
 * public class Animal{
 *  	public Flys flyingType;
 */
public class StrategyPattern {

	public static void main(String[] args) {
		

	}

}
