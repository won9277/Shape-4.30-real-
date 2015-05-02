public class Point implements Visible, Drawable {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println("x 좌표 : " + getX() + " y 좌표 : " + getY()
				+ "에 점을 찍습니다.");
	}

	@Override
	public void visible(boolean isVisible) {
		if (isVisible == true)
			draw();
		else
			System.out.println(" 좌표 : " + getX() + "y 좌표 : " + getY()
					+ " 인 점을 지웁니다");

	}
}
