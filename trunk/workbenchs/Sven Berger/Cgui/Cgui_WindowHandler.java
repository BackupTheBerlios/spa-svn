/*  
#   Datei: Cgui_WindowHandler.java
#     Entwickler: Sven Berger
#     Status: v.01
#   Version: 0.1 22:35 19.03.2005
#   Beschreibung: Diese Klasse dient dazu die Klasse Cgui_Window zu umschließen und dient dazu die zugriffe auf #  #                 die Implementierung zu zu lassen.
#             Cgui_manager -> Cgui_Window
#   ToDo: Punktobjekt(x,y) besser als dieser mist von Java;kommentare; interface
*/

package Cgui;
import java.util.HashMap;

public abstract class Cgui_WindowHandler extends Cgui_abstractHandler
{
  /*
  * Zugriffs-Methoden der Klasse Cgui_Window //todo: shift to abstract class --->
  */
  public int create_Window()
  {
      return(this.putW(null, new Cgui_Window()));
  }
  
    public int create_Window(double px, double py)
  {
      return(this.putW(null, new Cgui_Window(px, py)));
  }
  
     public int create_Window(int ix, int iy)
  {
      return(this.putW(null, new Cgui_Window(ix, iy)));
  }
  
  public void create_Window(String id)
  {
      this.putW(id, new Cgui_Window(id));
  }
  
  public void create_Window(String id, double px, double py)
  {
      this.putW(id, new Cgui_Window(id, px, py));
  }
  
    public void create_Window(String id, int ix, int iy)
  {
      this.putW(id, new Cgui_Window(id, ix, iy));
  }
  
  public void change_resizeEnabled(String id)
  {
    ((Cgui_Window)this.getW(id)).change_resizeEnabled();
    }
  public void change_resizeEnabled(int id)
  {
    ((Cgui_Window)this.getW(new Integer(id))).change_resizeEnabled();
    }
  
  private int putW(String id, Object objekt)
  {
      HashMap lokale_HashMap=(HashMap)get_Storage().get("Windows");
      if(id!=null)lokale_HashMap.put(id, objekt); 
      lokale_HashMap.put(new Integer((lokale_HashMap.size()+1)), objekt); 
      return lokale_HashMap.size();
    }
  private Object getW(Object id)
  {
      return ((HashMap)get_Storage().get("Windows")).get(id);
    }
  /*
  * <---Methoden für das Handling der Klasse Cgui_Window
  */
}