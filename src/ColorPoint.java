public class ColorPoint extends Point implements Visible, Drawable {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ColorPoint(int x, int y) {
		super(x, y);
		this.color = null;
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("x 좌표 : " + getX() + " y 좌표 : " + getY() + " 색깔은  "
				+ getColor() + "에 점을 찍습니다.");
	}

	@Override
	public void visible(boolean isVisible) {
		if (isVisible == true)
			draw();
		else
			System.out.println(" 좌표 : " + getX() + "y 좌표 : " + getY()
					+ " 색깔은  " + getColor() + " 인 점을 지웁니다");

	}

}
