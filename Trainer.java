abstract class Trainer
{
String dept = "java";
private int salary = 10000;
Trainer()
{
System.out.println("payilagam");
}
Trainer(String dept)
{
this.dept = dept;

}
int getsalary()
{
return salary;
}
void training()
{
System.out.println(this.dept);
}
}






