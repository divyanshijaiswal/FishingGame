/*
 * Activity 4.9.4
 */
public class Fish extends LakeObject
{
    @Override
    public double getCost()
    {
        return getWeight() * super.getCost();
    }
}
