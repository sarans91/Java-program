    class pizza{
        int size;
        String crust;
        String topping;     //creating a instant variables

public pizza(){      // creating a default constructor it will return the default value of instant variable

    System.out.println(size+" "+crust+" "+topping);
}
public pizza(int size,String crust,String topping){
    this.size=size;
    this.crust=crust;
    this.topping=topping;                               //creating the paramameterized constructor
    System.out.print(size+" "+crust+" " +topping);
}
}
class method{
    public static void main(String[] args){
pizza newpizza=new pizza();
pizza newpizza1=new pizza(10,"thin","chicken");
    }
}

