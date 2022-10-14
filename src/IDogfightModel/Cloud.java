package IDogfightModel;

public class Cloud extends Mobile{
	private int SPPED=1;
	private int WIDTH=300;
	private int HEIGHT=150;
	private String IMAGE="cloud";
	//public Cloud(Direction direction,Dimension dimension){
	
	//}
	public Cloud(Direction direction, Position position, Dimension dimension, int speed, String image) {
		super(direction, position, dimension, speed, image);
		
	}
}
