import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  public void turnAround() {
    turnLeft();
    turnLeft();
  }

  public void moveDown() {
    turnRight();
    move();
    turnLeft();
  }
}