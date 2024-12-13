public class Person
{
    private String nameF = "";
    private String nameL = "";
    private int age;
    private String ssn = "";
    
    public void setNameF (String inputNameF)
    {
        nameF = inputNameF;
    }
    public void setNameL (String inputNameL)
    {
        nameL = inputNameL;
    }
    public void setAge (int inputAge)
    {
        age = inputAge;
    }
    public void setSSN (String inputSSN)
    {
        ssn = inputSSN;
    }
    public String getNameF ()
    {
        return nameF;
    }
    public String getNameL ()
    {
        return nameL;
    }
    public int getAge ()
    {
        return age;
    }
    public String getSSN ()
    {
        return ssn;
    }
    public String toString ()
    {
        String result = "SSN: " + getSSN() + "\n\tName: " + getNameF() + " " + getNameL() + "\n\tAge: " + getAge();
        return result;
    }   

}


