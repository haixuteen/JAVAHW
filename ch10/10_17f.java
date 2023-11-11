// hw10_17f,
class Car
{
   protected String owner;
   protected String id;

   public Car(String own,String s)
   {
      owner=own;
      id=s;
   }
   final void show()
   {
      System.out.println("車主姓名:"+owner);
      System.out.println("車牌號碼:"+id);
   }
}

class CColor extends Car
{
   public String color;

   public CColor(String own,String s,String col)
   {
      super(own,s);
      color=col;
   }
   public void show_data()
   {
      System.out.println("車主姓名:"+owner);
      System.out.println("車牌號碼:"+id);
      System.out.println("車身顏色:"+color);
   }
}

public class hw10_17f
{
   public static void main(String args[])
   {
      CColor mycar=new CColor("Riaan","A1-2345","Black");
      mycar.show_data();
   }
}

/* output------------
車主姓名:Riaan
車牌號碼:A1-2345
車身顏色:Black
-------------------*/