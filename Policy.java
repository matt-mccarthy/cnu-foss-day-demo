import java.util.*;

public class Policy
{
	ArrayList<Person> coveredPeople;
	ArrayList<Car> coveredVehicles;
	int cost;
	int effectiveYear;
	int expirationYear;

	public Policy()
	{
		// TODO: initialize everything to a new list or 0
	}

	public void addPerson(Person p)
	{
		// TODO: add p to the list of people
	}

	public void addVehicle(Car c)
	{
		// TODO: add c to the list of vehicles
	}

	public ArrayList<Person> getPeople()
	{
		// TODO: return the list of covered people
		return null;
	}

	public ArrayList<Car> getCars()
	{
		// TODO: return the list of covered vehicles
		return null;
	}

	public int getCost()
	{
		// TODO: return the cost
		return Integer.MAX_VALUE;
	}

	public void setCost(int in)
	{
		// TODO: set the cost
	}

	public int getEffectiveYear()
	{
		// TODO: get the year in which the policy goes into effect
		return -1;
	}

	public void setEffectiveYear(int in)
	{
		// TODO: set the year in which the policy goes into effect
	}

	public int getExpirationYear()
	{
		// TODO: get the year in which the policy expires
		return -1;
	}

	public void setExpirationYear(int in)
	{
		// TODO: get the year in which the policy expires
	}
}
