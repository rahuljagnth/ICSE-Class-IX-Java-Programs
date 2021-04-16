class Salary
{
public void calc(float sale)
{
System.out.println("\f");
double total;
if(sale<=10000)
{
total=.10*sale;
System.out.println("Your Total is "+total);
}
else if(sale>10000&&sale<=20000)
{
total=.15*sale;
System.out.println("Your Total is "+total);
}
else if(sale>20000&&sale<=50000)
{
total=.30*sale;
System.out.println("Your Total is"+total);
}
else if(sale>50000)
{
total=.40*sale;
System.out.println("Your Total is"+total);
}
}
}


