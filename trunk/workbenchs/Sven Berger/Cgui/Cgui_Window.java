import javax.swing.JFrame;
public class Cgui_Window extends JFrame
{
  //Erstellen eines globalen Objektes von Frame
  private JFrame fenster = new JFrame();
  //Standardkonstruktor mit default Titel
  public Cgui_Window()
  {
    this.fenster.setTitle("");
    this.fenster.show();
  }
  //Standardkonstruktor mit TitelÃ¼bergabe
  public Cgui_Window(final String Str_window_name)
  {
    this.fenster.setTitle(Str_window_name);
    this.fenster.show();
  }
  //Standardkonstrukor mit Titel und PixelgrÃ¶ÃŸe
  public Cgui_Window (final String Str_window_name,final int ix,final int iy)
  {
    if(ix > iwidth() || iy > iheight())
    {
      this.fenster.setSize(iwidth(),iheight());
    }
    else
    {
      this.fenster.setSize(ix,iy);
    }
    this.fenster.setTitle(Str_window_name);
    this.fenster.show();
  }
  //Standardkonstruktor mit Titel und relativer GrÃ¶ÃŸe
  public Cgui_Window (final String Str_window_name,final double rx,final double ry)
  {
    this.fenster.setSize((int)(this.iwidth()*rx),(int)(this.iheight()*ry));
    this.fenster.setTitle(Str_window_name);
    this.fenster.show();
  }
  //Herausfinden der wirklichen BildschirmhÃ¶he
  private int iheight()
  {
    return (getToolkit().getScreenSize().height);
  }
  //Herausfinden der wirklichen Bildschirmbreite
  private int iwidth()
  {
    return (getToolkit().getScreenSize().width);
  }

}

