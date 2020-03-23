import processing.core.PApplet;

public class Hello extends PApplet
{

    public static void main (String[] args)
    {
        PApplet.main("Hello");
    }

    public void settings()
    {
        size(800,600);
    }

    public void setup()
    {
        textAlign(CENTER, CENTER);
        textSize(28);
        fill(255);
    }

    public void draw()
    {
        background(0);
        text("Hello Everyone!", width/2f, height/2f);
    }
}
