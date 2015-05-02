public class Rect extends Shape implements Visible, Drawable {

	private int height, width;

	public Rect(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public double calculateArea() {

		return height * width;
	}

	@Override
	public void draw() {
		System.out.println("폭이 : " + getWidth() + " 높이는 : " + getHeight()
				+ " 인 사각형을 그립니다.");

	}

	@Override
	public void visible(boolean isVisible) {
		if (isVisible == true)
			draw();
		else
			System.out.println("폭이 : " + getWidth() + " 높이는 : " + getHeight()
					+ " 인 사각형을 지웁니다.");
	}

}
