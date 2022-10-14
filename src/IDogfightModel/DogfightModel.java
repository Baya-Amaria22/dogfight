package IDogfightModel;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public abstract class DogfightModel implements IDogfightModel,Observer{
	private ArrayList<IMobile> mobile;
	private Sky sky;
	public DogfightModel(ArrayList<IMobile> mobil) {
		this.sky=new Sky(null);
		this.mobile=new ArrayList<IMobile> ();
	}

	public Sky getSky() {
		return sky;
	}
	public void buildArea(Dimension dimension) {
		
	}
	public void addMobile(IMobile mobile) {
		
	}
	public void removeMobile(IMobile mobile) {
		
	}

	public ArrayList<IMobile> getMobile() {
		return mobile;
	}
	public IMobile getMobileByPlayer(int player) {
		return this.player;
	}
	public void setMobilesHavesMoved() {
		
	}
}
