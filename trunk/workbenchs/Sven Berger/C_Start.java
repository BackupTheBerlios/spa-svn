import Cgui.Cgui_manager;
public class C_Start
{
    private static Cgui_manager GuiManager=Cgui_manager.get_guiManager();
    
    public static void main(String args[])
    {
        /*Cgui_Window test= new Cgui_Window("Test1",0.6, 0.7);
        Cgui_Window test2= new Cgui_Window("Test2");
        Cgui_Window test3= new Cgui_Window("Test3", 100, 200);
        test3.change_resizeEnabled();
        test3.change_resizeEnabled();*/
         C_Start a= new C_Start();
         a.init();
      }
       
       public void init()
       {
                int a=this.GuiManager.create_Window();
                int b=this.GuiManager.create_Window();
                GuiManager.change_resizeEnabled(b);
    }
}