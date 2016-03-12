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
		coveredPeople = new ArrayList<Person>();
		coveredVehicles = new ArrayList<Car>();
		cost = 0;
		effectiveYear = 0;
		expirationYear = 0;
	}

	public void addPerson(Person p)
	{
		// TODO: add p to the list of people
		coveredPeople.add(p);
	}

	public void addVehicle(Car c)
	{
		// TODO: add c to the list of vehicles
		coveredVehicles.add(c);
	}

	public ArrayList<Person> getPeople()
	{
		// TODO: return the list of covered people
		return coveredPeople;
	}

	public ArrayList<Car> getCars()
	{
		// TODO: return the list of covered vehicles
		return coveredVehicles;
	}

	public int getCost()
	{
		// TODO: return the cost
		return cost;
	}

	public void setCost(int in)
	{
		// TODO: set the cost
		cost = in;
	}

	public int getEffectiveYear()
	{
		// TODO: get the year in which the policy goes into effect
		return effectiveYear;
	}

	public void setEffectiveYear(int in)
	{
		// TODO: set the year in which the policy goes into effect
		effectiveYear = in;
	}

	public int getExpirationYear()
	{
		// TODO: get the year in which the policy expires
		return expirationYear;
	}

	public void setExpirationYear(int in)
	{
		// TODO: get the year in which the policy expires
		expirationYear = in;
	}
}
