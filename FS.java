class FS
{public void check(int num)
{
System.out.println("\f");
int first=0;
int second=1;
int third=0;
System.out.println(first);
System.out.println(second);
for(int i=3;i<=num;i++)
{
third=first+second;
first=second;
second=third;
System.out.println(third);
}
}
}
