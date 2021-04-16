class Digit
{
public void calc(int num)
{
System.out.println("\f");
int sum=0;
int rem=0;
while(num>0)
{
rem=num%10;
sum=sum+rem;
num=num/10;
}
System.out.println("Your sum of the digit is "+sum);
}
}
