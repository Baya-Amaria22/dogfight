package IDogfightModel;

import java.awt.Color;

public class Sky implements IArea{
	private Color image;
	
	public Dimension dimension;
	public Sky(Dimension dimension) {
		this.dimension=dimension;
	}
	public Dimension getDimension() {
		return this.dimension;
	}
	public Color getImage() {
		return image;
	}
}