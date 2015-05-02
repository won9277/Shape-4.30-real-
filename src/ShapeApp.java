public class ShapeApp {

	public static void main(String[] args) {

		Point s0 = new ColorPoint(5, 10, "RED");
		s0.draw();

		Point s1 = new Point(3, 4);
		System.out.println(s1.getX());

		Drawable s2 = new Rect(3, 5);
		Visible s6 = new Rect(4, 5);
		Drawable s3 = new Triangle(3, 5);
		Visible s7 = new Triangle(6, 7);
		Drawable s4 = new Circle(5);

		s2.draw();
		s3.draw();
		s4.draw();
		s6.visible(true);
		s7.visible(false);

	}

}
