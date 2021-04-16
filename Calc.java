class Calc
{
public void calc(int num1,int num2,int choice)
{
System.out.println("\f");
int result;
switch(choice)
{
case 1:
{
result=num1+ num2;
System.out.println("The Sum is "+result);
break;
}
case 2:
{
result=num1-num2;
System.out.println("The Subtraction is "+result);
break;
}
case 3:
{
result=num1*num2;
System.out.println("The Product is "+result);
break;
}
case 4:
{
result=num1/num2;
System.out.println("The Division is "+result);
break;
}
}
}
}



