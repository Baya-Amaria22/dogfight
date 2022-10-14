package IDogfightModel;

public class Plane extends Mobile{
	private int SPPED=2;
	private int WIDTH=100;
	private int HEIGHT=30;
	private int player;
	public Plane(Direction direction, Position position, Dimension dimension, int speed, String image) {
		super(direction, position, dimension, speed, image);
	}
	public static boolean isPlayer(int player) {
		return true;
	}
	public static boolean hit() {
		return false;
	}
}
