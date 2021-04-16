class Grade
{
public void calc(int marks)
{
char gr;
System.out.println("\f");
if(marks>=90)
{
gr='A';
System.out.println("Your Grade is "+gr);
}
else if(marks<=89 && marks>=80)
{
gr='B';
System.out.println("Your Grade is "+gr);
}
else if(marks<=79)
{
gr='C';
System.out.println("Your Grade is "+gr);
}
}
}

