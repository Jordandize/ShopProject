package cons.projects.shop.enums;

public enum Color {
	
	DARKORANGE   (255, 140,   0),
	DARKTURQUOISE(  0, 206, 209),
	BLACK        (  0,   0,   0);
	
    private final int r;
    private final int g;
    private final int b;
    private final String rgb;
	
	private Color(final int r, final int g, final int b) {
		this.r = r;
        this.g = g;
        this.b = b;
        this.rgb = "rgb(" + r + ", " + g + ", " + b + ")";
	}
	
	public String getRGB() {
        return rgb;
    }

    public int getRed() {
        return r;
    }

    public int getGreen() {
        return g;
    }

    public int getBlue() {
        return b;
    }

}
