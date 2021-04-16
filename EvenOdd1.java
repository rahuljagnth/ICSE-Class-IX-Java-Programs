class EvenOdd1
{
public void display()
{
System.out.println("\f");
int ecount=0;
int ocount=0;
for(int i=1;i<=50;i++)
{
if(i%2==0)
{
ecount++;
System.out.println("Even Numbers are "+i);
}
else
{
ocount++;
System.out.println("Odd Numbers are "+i);
}
}
System.out.println("Number of even is "+ecount);
System.out.println("Number of Odd is "+ecount);
}
}

