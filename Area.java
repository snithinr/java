//constructor overloading

class Area{
	int length=10;
	int breadth=20;
	int a;
	Area(){
		a =length*breadth; 
	}
	Area(int length,int breadth){
		a =length*breadth;
	}
	Area(int side){
		this(side,side);
	}
	void show(){
		System.out.println("Area = "+a);
	}
}


class AreaTestDrive{
	public static void main(String[]args){
		Area a = new Area();
		a.show();
		Area a1= new Area(10,20);
		a1.show();
		Area a2= new Area(10);
		a2.show();
	}
}