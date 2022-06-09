
public class InherDemo6 {
	public static void main(String[] args) {
		Ibaco ibacoicecream=new Vanila();
		
		System.out.println("Cost of Vanila..:"+ibacoicecream.cost());
		
		ibacoicecream=new Strawberry(ibacoicecream);
		
		System.out.println("cost of vanila and strawberry to gether..:"+ibacoicecream.cost());
		
		Ibaco mycream=new Strawberry(new Fruit(new Nuts()));
		
		System.out.println("Cost-Strawberry+Fruit+Nut.."+mycream.cost());
	}
}
abstract class Ibaco{
	public abstract int cost();
}
abstract class IceCream extends Ibaco{
	
}
abstract class Toppings extends Ibaco{
	
}
class Vanila extends IceCream{
	Ibaco ibaco;
	public Vanila() {
		// TODO Auto-generated constructor stub
	}
	
	public Vanila(Ibaco ibaco) {
		this.ibaco=ibaco;
	}
	@Override
	public int cost() {
		if(ibaco==null) {
			return 10;
		}
		else {
			return 10+ibaco.cost();
		}
	}
}
class Strawberry extends IceCream{
	Ibaco ibaco;
	public Strawberry() {
		// TODO Auto-generated constructor stub
	}
	
	public Strawberry(Ibaco ibaco) {
		this.ibaco=ibaco;
	}
	@Override
	public int cost() {
		if(ibaco==null) {
			return 15;
		}
		else {
			return 15+ibaco.cost();
		}
	}
}
class Fruit extends IceCream{
	Ibaco ibaco;
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	
	public Fruit(Ibaco ibaco) {
		this.ibaco=ibaco;
	}
	@Override
	public int cost() {
		if(ibaco==null) {
			return 5;
		}
		else {
			return 5+ibaco.cost();
		}
	}
}
class Nuts extends IceCream{
	Ibaco ibaco;
	public Nuts() {
		// TODO Auto-generated constructor stub
	}
	
	public Nuts(Ibaco ibaco) {
		this.ibaco=ibaco;
	}
	@Override
	public int cost() {
		if(ibaco==null) {
			return 10;
		}
		else {
			return 10+ibaco.cost();
		}
	}
}