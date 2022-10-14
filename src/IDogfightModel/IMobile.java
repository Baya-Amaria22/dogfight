package IDogfightModel;

import java.awt.Image;
import java.awt.Point;

public interface IMobile {
//public static final DogfightModel dogfightModel;
public static Direction getDirection() {
	return getDirection();
}
public static void setDirection(Direction direction) {
	
}
public static Position getPosition() {
	return getPosition();
}
public static Dimension getDimension() {
	return getDimension();
}
public static int getWidth() {
	return 1;
}
public static int getHeight() {
	return 1;
}
public static int getSpeed() {
	return 1;
}
public static Image getImage() {
	return getImage();
}
public static void move() {
	
}
public static void placeInArea(IArea area) {
	
}
public static boolean isPlayer(int player) {
	return true;
}
public static void setDogfightModel(DogfightModel dogfightModel) {
	
}
public static boolean hit() {
	return true;
}
public static boolean isWeapon() {
	return true;
}
}
