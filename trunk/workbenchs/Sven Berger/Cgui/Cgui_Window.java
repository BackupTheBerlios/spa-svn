/*  
#   Datei: Cgui_Window.java
#     Entwickler: Michael Schmidt, Sven Berger
#     Status: v.02
#   Version: 0.2 22:35 19.03.2005
#   Beschreibung: Diese Klasse implementiert die grundlegenden Steuerungsfunktionen für ein Fenster
#             Cgui_manager -> Cgui_Window
#   ToDo: Punktobjekt(x,y) besser als dieser mist von Java;
*/
package Cgui;
import javax.swing.JFrame;
public class Cgui_Window extends JFrame
{
  /*
  # Globale Variablen-->
  */

  //Erstellen eines globalen Objektes von JFrame
  private JFrame Window = new JFrame();

  /*
  # <--Globale Variablen
  */
  /*
  # Konstruktoren-->
  */

 
  //Standardkonstruktor erstellt ein neues Fenster
  protected Cgui_Window()
  {
    this.set_relSize(0.7d, 0.7d);
    this.init_Window("");
  }

  //Konstruktor mit Titelübergabe erstellt ein neues Fenster
  protected Cgui_Window(final String str_WindowTitel)
  {
    this.set_relSize(0.7d, 0.7d);
    this.init_Window(str_WindowTitel);
  }

  //Konstrukor mit groeße in Pixeln erstellt ein neues Fenster
  protected Cgui_Window (final int i_SizeX, final int i_SizeY)
  {
    this.set_absSize(i_SizeX, i_SizeY);
    this.init_Window("");
  }

  //Konstrukor mit Titel und groeße in Pixeln erstellt ein neues Fenster
  protected Cgui_Window (final String str_WindowTitel, final int i_SizeX, final int i_SizeY)
  {
    this.set_absSize(i_SizeX, i_SizeY);
    this.init_Window(str_WindowTitel);
  }

  //Konstruktor mit relativer Groeße erstellt ein neues Fenster
  protected Cgui_Window (final double drel_SizeX, final double drel_SizeY)
  {
    this.set_relSize(drel_SizeX, drel_SizeY);
    this.init_Window("");
  }

  //Konstruktor mit Titel und relativer Groeße erstellt ein neues Fenster
  public Cgui_Window (final String str_WindowTitel, final double drel_SizeX, final double drel_SizeY)
  {
    this.set_relSize(drel_SizeX, drel_SizeY);
    this.init_Window(str_WindowTitel);
  }
  /*
  # <--Konstruktoren
  */
  /*
  # Funktionen-->
  */
  //ändert die Grösse
  private void set_Size(final double drel_SizeX, final double drel_SizeY, final int i_SizeX, final int i_SizeY)
  {
    this.Window.setSize((int)(i_SizeX * drel_SizeX),(int)(i_SizeY * drel_SizeY));
  }

  //Herausfinden der wirklichen Bildschirmaufloesung(y)
  private int i_getHöhe()
  {
    return (getToolkit().getScreenSize().height);
  }

  //Herausfinden der wirklichen Bildschirmaufloesung(x)
  private int i_getBreite()
  {
    return (getToolkit().getScreenSize().width);
  }

  //initialiesiert das Fenster
  private void init_Window(String str_WindowTitel)
  {
    this.Window.setTitle(str_WindowTitel);
    this.Window.setDefaultLookAndFeelDecorated(true);
    this.Window.show();
  }

  /*
  # <--Funktionen
  */
  /*
  # Methoden-->
  */
  //ändert die relative Groeße des Fensters
  protected void set_relSize(final double drel_SizeX, final double drel_SizeY)
  {
    this.set_Size( drel_SizeX, drel_SizeY, i_getBreite(), i_getHöhe());
  }

  //ändert die Groeße des Fensters
  protected void set_absSize(final int i_SizeX, final int i_SizeY)
  {
    this.set_Size(1.0d, 1.0d, i_SizeX, i_SizeY);
  }
  
/*  protected void set_position(x ,y)
  {
	this.Window.setLocation(new Point(x, y));
  }*/

  protected JFrame get_WindowObjekt()
  {
  	return (this.Window);
  }

  protected void change_resizeEnabled()
  {
	if(this.Window.isResizable())this.Window.setResizable(false);
      else this.Window.setResizable(true);   
  }
  /*
  # <--Methoden
  */
}