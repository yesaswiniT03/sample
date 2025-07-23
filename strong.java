public class strong
{
public static int factorial(int n)
{
int fact=1;
for(int i=2;i<=n;i++)
{
fact*=i;
}
return fact;
}
public static boolean isStrong(int num)
{
int original=num;
int sum=0;
while(num>0)
{
int digit=num%10;
sum+=factorial(digit);
num/=10;
}
return sum==original;
}
public static void main(String[] args)
{
System.out.println("strong numbers between 1 to 5000 are:");
for(int i=1;i<=5000;i++)
{
if(isStrong(i))
{
System.out.println(i);
}
}
}
}