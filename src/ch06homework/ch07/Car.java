package ch06homework.ch07;

public class Car {
	//field
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//Constructor
	Car(){
		
	}
	
	Car(String model){
		this(model,"����",250);
	}
	
	Car(String model, String color){
		this(model,color,250);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color= color;
		this.maxSpeed=maxSpeed;
	}
}
