class PrimeNo
{
public void check(int num)
{
System.out.println("\f");
int flag=0;
for (int i=1;i<=num;i++)
{
if(num%i==0)
{
flag++;
}
}
if (flag==1||flag==2)
{
System.out.println("number is prime");
}
else
{
System.out.println("number is not prime");
}
}
}
