/*	
#	Datei: Cgui_Window.java
#     Entwickler: Michael Schmidt
#     Status: Signing
# 	Version: 0.0 22:52 10.03.05
#	Beschreibung: Diese Klasse implementiert die grundlegenden Steuerungsfunktionen für ein Fenster
#     		  Cgui-> Cgui_Windowmanager -> Cgui_Window
#	ToDo: Pointobjekt(x,y); Methoden fertig machen; schließen; größe ändern; minimieren
*/
import javax.swing.JFrame;
public class Cgui_Window extends JFrame
{
  /*
  #	Globale Variablen-->
  */
  //Erstellen eines globalen Objektes von JFrame
  private JFrame fenster = new JFrame();
  /*
  #	<--Globale Variablen
  */
  /*
  #	Konstruktoren-->
  */
  //Standardkonstruktor
  public Cgui_Window()
  {
    this.init_Fenster("");
  }
  //Standardkonstruktor mit Titelübergabe
  public Cgui_Window(final String Str_window_name)
  {
    this.init_Fenster(FensterTitel);
  }
  //Standardkonstrukor mit Titel und groeße in Pixeln
  public Cgui_Window (final String Str_window_name,final int ix,final int iy)
  {
    if(ix > iwidth() || iy > iheight())
    {
      this.fenster.setSize(i_get_Breite(), i_get_Höhe());
    }
    else
    {
      this.fenster.setSize(ix,iy);
    }
    this.init_Fenster(FensterTitel);
  }
  //Standardkonstruktor mit Titel und relativer Groeße
  public Cgui_Window (final String str_FensterTitel,final double rx,final double ry)
  {
    this.fenster.setSize((int)(this.i_get_Breite()*rx),(int)(this.i_get_Breite()*ry));
    this.init_Fenster(FensterTitel);
  }
  /*
  #	<--Konstruktoren
  */
  /*
  #	Funktionen-->
  */

  //Herausfinden der wirklichen Bildschirmaufloesung(y)
  private int i_get_Höhe()
  {
    return (getToolkit().getScreenSize().height);
  }

  //Herausfinden der wirklichen Bildschirmaufloesung(x)
  private int i_get_Breite()
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
  #	<--Funktionen
  */
  /*
  #	Methoden-->
  */
  public void setze_relSize
}

