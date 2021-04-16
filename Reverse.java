class Reverse
{
public void calc(int num)
{
System.out.println("\f");
int rem=0;
int reverse=0;
while(num>0)
{
rem=num%10;
num=num/10;
reverse=reverse*10+rem;
}
System.out.println("The reverse no is "+rem);
}
}

