package IDogfightModel;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class DogfightModel implements IDogfightModel,Observer{
	private ArrayList<IMobile> mobile[];
	private Sky sky;
	public DogfightModel() {
		this.sky=new Sky();
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
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

	public ArrayList<IMobile>[] getMobile() {
		return mobile;
	}
	public IMobile getMobileByPlayer(int player) {
		return this.player;
	}
	public void setMobilesHavesMoved() {
		
	}
}
