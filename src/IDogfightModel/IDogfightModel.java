package IDogfightModel;

import java.util.ArrayList;

public interface IDogfightModel {
	public static IArea getIArea() {
		return null;
		
	}
	public static void buildArea(Dimension dimension) {
		
	}
	public static void addMobile(IMobile Mobile) {
		
	}
	public static void removeMobile(IMobile mobile) {
		
	}
	public static ArrayList<IMobile> getMobiles(){
		return this.mobile;
	}
	public static IMobile getMobileByPlayer(int player) {
		return ;
	}
	public static void setMobilesHavesMoved() {
		
	}
}
