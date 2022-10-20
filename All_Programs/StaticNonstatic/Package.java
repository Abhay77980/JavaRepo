package StaticNonstatic;
import MyPackage.MyClass;
public class Package
{
public static void main(String args[])
{
	MyClass obj=new MyClass();
	obj.set_value(10);
	obj.displayValue();
}
}
