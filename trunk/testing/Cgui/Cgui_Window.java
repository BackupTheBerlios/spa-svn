/*  
#   Datei: Cgui_Window.java
#     Entwickler: Michael Schmidt
#     Status: v.01->Testing
#   Version: 0.1 18:35 11.03.2005
#   Beschreibung: Diese Klasse implementiert die grundlegenden Steuerungsfunktionen für ein Fenster
#             Cgui-> Cgui_Windowmanager -> Cgui_Window
#   ToDo: Pointobjekt(x,y); schließen; minimieren; (alle) Methoden aus dieser Klasse nach (Cgui) Windowmanager; package; move ifs to set_Size
*/
import javax.swing.JFrame;
public class Cgui_Window extends JFrame
{
  /*
  # Globale Variablen-->
  */

  //Erstellen eines globalen Objektes von JFrame
  private JFrame fenster = new JFrame();

  /*
  # <--Globale Variablen
  */
  /*
  # Konstruktoren-->
  */

 
  //Standardkonstruktor erstellt ein neues Fenster
  private Cgui_Window()
  {
    this.set_relSize(0.7d, 0.7d);
    this.init_Fenster("");
  }

  //Standardkonstruktor mit Titelübergabe erstellt ein neues Fenster
  public Cgui_Window(final String str_FensterTitel)
  {
    this.set_relSize(0.7d, 0.7d);
    this.init_Fenster(str_FensterTitel);
  }

  //Standardkonstrukor mit groeße in Pixeln erstellt ein neues Fenster
  public Cgui_Window (final int i_SizeX, final int i_SizeY)
  {
    //überprüft ob das Fenster in der Auflösung gesetzt werden kann
    //wenn nicht dann wird es auf die maximale größe gesetzt( bringt keine Probleme da
    //alle Groeßen angaben sollten relative sein obwohl funktionen für absolute werte vorhanden sing

    if(i_SizeX > i_getBreite() || i_SizeY > i_getHöhe())
    {
      this.set_absSize(i_getBreite(), i_getHöhe());
    }
    else
    {
      this.set_absSize(i_SizeX, i_SizeY);
    }
    this.init_Fenster("");
  }

  //Standardkonstrukor mit Titel und groeße in Pixeln erstellt ein neues Fenster
  public Cgui_Window (final String str_FensterTitel, final int i_SizeX, final int i_SizeY)
  {
    if(i_SizeX > i_getBreite() || i_SizeY > i_getHöhe())
    {
      this.set_absSize(i_getBreite(), i_getHöhe());
    }
    else
    {
      this.set_absSize(i_SizeX, i_SizeY);
    }
    this.init_Fenster(str_FensterTitel);
  }

  //Standardkonstruktor mit relativer Groeße erstellt ein neues Fenster
  public Cgui_Window (final double drel_SizeX, final double drel_SizeY)
  {
    this.set_relSize(drel_SizeX, drel_SizeY);
    this.init_Fenster("");
  }

  //Standardkonstruktor mit Titel und relativer Groeße erstellt ein neues Fenster
  public Cgui_Window (final String str_FensterTitel, final double drel_SizeX, final double drel_SizeY)
  {
    this.set_relSize(drel_SizeX, drel_SizeY);
    this.init_Fenster(str_FensterTitel);
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
    this.fenster.setSize((int)(i_SizeX * drel_SizeX),(int)(i_SizeY * drel_SizeY));
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
  private void init_Fenster(String str_FensterTitel)
  {
    this.fenster.setTitle(str_FensterTitel);
    this.fenster.show();
  }

  /*
  # <--Funktionen
  */
  /*
  # Methoden-->
  */
  //ändert die relative Groeße des Fensters
  public void set_relSize(final double drel_SizeX, final double drel_SizeY)
  {
    this.set_Size( drel_SizeX, drel_SizeY, i_getBreite(), i_getHöhe());
  }

  //ändert die Groeße des Fensters
  public void set_absSize(final int i_SizeX, final int i_SizeY)
  {
    this.set_Size(1.0d, 1.0d, i_SizeX, i_SizeY);
  }
  /*
  # <--Methoden
  */
}