import java.util.*;
class employe
{
    int emp_no;
    String name;
    String dep;
    double salary;
    public employe()
    {
        System.out.println(emp_no+" "+name+" "+dep+" "+salary);
    }
    public employe(int emp_no,String name,String dep,double salary)
    {
        this.emp_no =emp_no;
        this.name=name;
        this.dep=dep;
        this.salary=salary;
        System.out.println(emp_no+" "+name+" "+dep+" "+salary);
    }
    public employe(employe t)
    {
        this.emp_no =t.emp_no;
        this.name=t.name;
        this.dep=t.dep;
        this.salary=t.salary;
        System.out.println(emp_no+" "+name+" "+dep+" "+salary);

    }
   // void printf(){

      //  System.out.println(emp_no+" "+name+" "+dep+" "+salary);

   // }
}
 class Main
{
    public static void main(String args[])
    {
        employe obj1 = new employe();
        //obj1.printf();
        employe obj2 = new employe(1,"m","se",67.8);
        employe obj3 = new employe(obj2);
    }
}