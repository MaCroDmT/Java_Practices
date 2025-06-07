abstract  class BasicCalculator inherites Calculation
{
public double vale1;
public double value2;

BasicCalculator()
{}
BasicCalculator(double v1,double v2);
{
this.value=v1;
this.value2=v2;
}
public void setValue1(double v1)
{
value1=v1;
}
public double getValue1()
{
return value1;
}
public void setValue2(double v2)
{
value2=v2;
}
public double getValue2()
{
	return value2;
}

}