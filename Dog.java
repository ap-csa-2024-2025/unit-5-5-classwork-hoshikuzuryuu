public class Dog
{
   
    private String breed;
    private double size;
    private String color;

    public void setBreed(String inputBreed)
    {
        breed = inputBreed;   
    }
    public String breed()
    {
        return breed;
    }
    public void setSize(double inputSize) 
    {
        
        size = inputSize;
        System.out.println("Your dog's size is now set to " +  size);
    }
    public void setColor(String inputColor)
    {

        color = inputColor;
        System.out.println("Your dog's color is now set to " +  color);
    }
    public void Bark() 
    {
        System.out.println("Woof!");
    }
    public void ChaseMailman()
    {
        System.out.println("Your canine companion gallops toward the mailman, whose peace is disturbed by the foe's sudden appearance.");
    }
    public void Wag()
    {
        System.out.println("In a fit of great joy, your canine companion's tail fwips back and forth swiftly, like an overclocked pendulum.");
    }
}
