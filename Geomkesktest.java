import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Geomkesktest{
  @Test(expected=NullPointerException.class)
  public void funcOlemasolu(){
    Arvutused.geoKeskmine(null);
  }
  @Test
  public void kaksArvu(){
    assertEquals(6,Arvutused.geoKeskmine(new double[]{4,9}), 0.001);
  }
  @Test
  public void kolmArvu(){
    assertEquals(5,Arvutused.geoKeskmine(new double[]{1,5,25}), 0.001);
  }
}
