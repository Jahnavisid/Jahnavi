package jdk5andabove;

public enum Fruits {
	mango,apple("this apple is from kashmir..."),grapes;
String details;
private Fruits() {
	
}

private Fruits(String details) {
	this.details=details;
}
}
