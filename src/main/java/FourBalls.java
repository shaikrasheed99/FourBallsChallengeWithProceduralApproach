import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int HEIGHT = 600;
    public static final int WIDTH = 600;
    public static final int DIAMETER = 20;
    private int ballOneWidth = 0;
    private int ballTwoWidth = 0;
    private int ballThreeWidth = 0;
    private int ballFourWidth = 0;

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawAndMoveBallWithSpeedOf(1);
        drawAndMoveBallWithSpeedOf(2);
        drawAndMoveBallWithSpeedOf(3);
        drawAndMoveBallWithSpeedOf(4);
    }

    private void drawAndMoveBallWithSpeedOf(int speedUnit) {
        switch (speedUnit) {
            case 1:
                drawBallWith(ballOneWidth, 1);
                ballOneWidth += speedUnit;
                break;
            case 2:
                drawBallWith(ballTwoWidth, 2);
                ballTwoWidth += speedUnit;
                break;
            case 3:
                drawBallWith(ballThreeWidth, 3);
                ballThreeWidth += speedUnit;
                break;
            case 4:
                drawBallWith(ballFourWidth, 4);
                ballFourWidth += speedUnit;
                break;
        }
    }

    private void drawBallWith(int newWidth, int changeHeightByUnits) {
        float newHeight = (HEIGHT * changeHeightByUnits) / 5.0f;
        ellipse(newWidth, newHeight, DIAMETER, DIAMETER);
    }
}
