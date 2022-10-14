package IDogfightModel;

public class Missile extends Mobile {
	private int SPPED=4;
	private int WIDTH=30;
	private int HEIGHT=10;
	private int MAX_DISTANCE_TRAVELED=1400;
	private String IMAGE="missile";
	
	public Missile(Direction direction, Dimension dimension,Position position,int HEIGHT,String IMAGE) {
		super(direction, position, dimension, HEIGHT, IMAGE)
	}
	public static int getWidthADirection(Direction direction) {
		return 1 ;
	}
	public static int getHeightWithADirection(Direction direction) {
		return 1;
	}
	public static void move() {
		
	}
	public static boolean isWeapon() {
		return false;
	}
}
