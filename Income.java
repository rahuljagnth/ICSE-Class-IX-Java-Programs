class Income
{
public void calc(int salary)
{
System.out.println("\f");
int hra;
int sal;
if(salary<=10000)
{
hra=500;
sal=salary+hra;
System.out.println("The salary is"+sal);
}
else if(salary>10000&&salary<=15000)
{
hra=1000;
sal=salary+hra;
System.out.println("Your Salary is "+sal);
}
else
{
hra=2000;
sal=salary+hra;
System.out.println("Your Salary is "+sal);
}
}
}


