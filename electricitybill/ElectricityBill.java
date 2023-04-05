class ElectricityBill
{
    private double units = 0.0;
    double c = 0.0; 
    public ElectricityBill(double units)
    {
        this.units=units;
    }
    double calculate()
    {
        if(units<=75)
        {
            if(units>0 && units<=50)
            {
                c = (1.45)*units;
            }
            else
            {
                c = (1.45)*50+(units-50)*2.6;
            }
        }
        else if(units>=76 && units<=225)
        {
            if(units<=100)
            {
                c = units*(2.6);
            }
            else if(units<200)
            {
                c = (2.6)*100+(units-100)*3.6;
            }
            else if(units<225)
            {
                c = (2.6)*100+(3.6)*(100)+(units-200)*6.9;
            }
        }
        else
        {
            if(units<=300)
            {
                c = (2.65)*50+(3.35)*50+(5.40)*100+(units-200)*7.1;
            }
            else if(units<=400)
            {
                c = (2.65)*50+(3.35)*50+(5.40)*100+(7.1)*100+(units-300)*7.95;
            }
            else if(units<=500)
            {
                c = (2.65)*50+(3.35)*50+(5.40)*100+(7.1)*100+(7.95)*100+(units-400)*8.5;
            }
            else
            {
                c = (2.65)*50+(3.35)*50+(5.40)*100+(7.1)*100+(7.95)*100+(8.5)*100+(units-500)*9.95;
            }
        }
        return c;
    }
}