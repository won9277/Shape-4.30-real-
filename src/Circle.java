public class Circle extends Shape implements Visible, Drawable {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {

		return radius * radius * Math.PI;
	}

	@Override
	public void draw() {
		System.out.println("반지름은  : " + getRadius() + "인 원을 그립니다.");
	}

	@Override
	public void visible(boolean isVisible) {
		if (isVisible == true)
			draw();
		else
			System.out.println("반지름은  : " + getRadius() + "인 원을 지웁니다");

	}

}
