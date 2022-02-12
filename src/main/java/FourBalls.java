import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int HEIGHT = 600;
    public static final int WIDTH = 600;
    public static final int DIAMETER = 20;
    private int moveBallOneWidth = 0;
    private int moveBallTwoWidth = 0;
    private int moveBallThreeWidth = 0;
    private int moveBallFourWidth = 0;

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
                drawABallWith(moveBallOneWidth, 1);
                moveBallOneWidth += speedUnit;
                break;
            case 2:
                drawABallWith(moveBallTwoWidth, 2);
                moveBallTwoWidth += speedUnit;
                break;
            case 3:
                drawABallWith(moveBallThreeWidth, 3);
                moveBallThreeWidth += speedUnit;
                break;
            case 4:
                drawABallWith(moveBallFourWidth, 4);
                moveBallFourWidth += speedUnit;
                break;
        }
    }

    private void drawABallWith(int newWidth, int changeHeightByUnits) {
        float newHeight = (HEIGHT * changeHeightByUnits) / 5.0f;
        ellipse(newWidth, newHeight, DIAMETER, DIAMETER);
    }
}
