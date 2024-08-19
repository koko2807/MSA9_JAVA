package Day07.Ex01_Shape;

public class Circle extends Shape{

	double radius;		// 반지름
	
	// 생성자
	public Circle() {
		this(0);
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		// 원의 넓이 = (원주율) x (반지름) x (반지름)
		return Math.PI * Math.pow(radius,2);
	}


	@Override
	double round() {
		// 원의 둘레 = 2 x (원주율) x (반지름)
		return 2 * Math.PI * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double raidus) {
		this.radius = raidus;
	}

	@Override
	public String toString() {
		return "Circle [raidus=" + radius + "]";
	}

}
