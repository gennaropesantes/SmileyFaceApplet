import java.applet.Applet;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Label;

public class SmileyFace extends Applet 
{
	@Override
	public void init()
	{
		this.setSize(250, 250);
		add(new Label("Hello!"));
	}
	@Override
	public void paint(Graphics smileyFace)
	{
		smileyFace.drawOval(20, 40, 100, 100);
		smileyFace.drawOval(35, 70, 25, 25);
		smileyFace.drawOval(60, 70, 25, 25);
		smileyFace.drawArc(25, 35, 35, 60, 50, 100);
		smileyFace.drawArc(35, 90, 70, 40, -100, 100);
	}
}
