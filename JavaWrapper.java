
package javawrapper;

public class JavaWrapper 
{
    
    public void Boxing()
    {
        int x = 44;
        Integer Value = x;
        int valueBack = Value.intValue();
        
        System.out.println(valueBack);
    }
    
    public void Autoboxing()
    {
        int x = 44;
        
        Integer y  = x;
        
        y  += 20;
        
         System.out.println(y);
    }
    
    public void Unboxing()
    {
        Integer value = 34;
        
        int num = value.intValue();
        
         System.out.println(num);
    }
    
    public void Autoboxing2()
    {
        Integer num = 5;
        
        int x = num;
        
        x += 30;
        
         System.out.println(x);
    }
    
    public JavaWrapper()
    {
        Boxing();
        Autoboxing();
        Unboxing();
        Autoboxing2();
        
        
        
    }
    
    
    
    
}
