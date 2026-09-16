import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    SkyPainter sky = new SkyPainter();
    LakePainter lake = new LakePainter();
    LilyPainter Julia = new LilyPainter();
    FrogPainter frog = new FrogPainter();

    sky.setPaint(1000);
    lake.setPaint(1000);
    Julia.setPaint(1000);
    frog.setPaint(1000);

    sky.paintSky();
    lake.paintLake();
    Julia.paintLilies();
    frog.paintFrog();
  }
}