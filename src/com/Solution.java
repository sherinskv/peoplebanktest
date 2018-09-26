package com;

public class Solution {

	public static void main(String[] args) {		
		
		Animal[] animals = new Animal[]{
				new Bird(new Fly(), new Sing()),
				new Duck(new Swim(), new Quack()),
				new Chicken(new Cluck()),
				new Chicken(new CockDoodle()),
				new Parrot(new Fly(),new Omlet() ), //OmletCockDoodle, OmletMeow, OmletWoof Can use for different type of Parrot live.
				new Fish(new Swim()),
				new Shark(new Swim()),
				new ClownFish(new Swim()),
				new Dolphin(new Swim()),
				new Frog(new Jump(), new Croak()),
				new Dog(new Walk(), new Bark()),
				new Butterfly(new Fly()),
				new Cat(new Walk(), new Meow())
				};
		
		int flyCount = 0;
		int walkCount = 0;
		int singCount = 0;
		int swimCount = 0;
		
		for(int i = 0; i< animals.length; i++){
			
			if(animals[i].getmovementType() instanceof  Fly){
				flyCount++;
			}else if (animals[i].getmovementType() instanceof  Walk){
				walkCount++;
			}else if (animals[i].getmovementType() instanceof Swim){
				swimCount++;
			}
			
			if (animals[i].getCommunicateType() instanceof  Sing){
				singCount++;
			}
			
		}
		
		System.out.println("flyCount"+flyCount);
		System.out.println("walkCount"+ walkCount);
		System.out.println("singCount"+singCount);
		System.out.println("swimCount"+swimCount);

	}

}
