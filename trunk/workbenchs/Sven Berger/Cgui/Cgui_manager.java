package Cgui; 
import java.util.HashMap;

public final class Cgui_manager extends Cgui_WindowHandler
{
  /*
  # Globale Variablen-->
  */
  //HashMap für alle Gui-Objekte
  private HashMap Storage = new HashMap();
  private static Cgui_manager GuiManager=null;
  /*
  # <--Globale Variablen
  */
  /*
  * Konstruktoren-->
  */
  private Cgui_manager()
  {
      /*
       * Initialiesiere den Speicher-->
       */
       this.Storage.put("Windows",new HashMap());    
       /*
       *<-- Initialiesiere den Speicher
       */
    }
    
  //singleton: damit stellen wir sicher das es nur eine Instance gibt
  public static Cgui_manager get_guiManager()
  {
   if(GuiManager==null)GuiManager= new Cgui_manager();
   return GuiManager;
    }
  /*
   * <--Konstruktoren
   */
  /*
   * private objects access funktionen-->
   */
   protected HashMap get_Storage()
   {
    return this.Storage;
    }
  /*
   * <--private objects access funktionen
   */

}