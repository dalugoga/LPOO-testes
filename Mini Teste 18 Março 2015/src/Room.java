import java.util.ArrayList;

public class Room extends Facility
{
	private String number;
	private Building building;
	private int floor;
	private int capacity;
	private ArrayList<User> users = new ArrayList<User>();
	
	public Room(Building b, String number, int floor) throws Exception
	{	
		if(b.getMaxFloor() < floor || b.getMinFloor() > floor)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			building = b;
			this.number = number;
			this.floor = floor;
			capacity = 0;
			building.addRoom(this);
		}
	}
	
	public Room(Building b, String number, int floor, int capacity) throws Exception
	{
		if(b.getMaxFloor() < floor || b.getMinFloor() > floor)
			throw new IllegalArgumentException();
		else
		{
			building = b;
			this.number = number;
			this.floor = floor;
			this.capacity = capacity;
			b.addCapacity(capacity);
			building.addRoom(this);
		}
	}
	
	public Room()
	{
		
	}
	public Building getBuilding()
	{
		return building;
	}
	
	public String getNumber()
	{
		return number;
	}
	
	public int getFloor()
	{
		return floor;
	}
	
	public String getName()
	{
		return building.getName() + number;
	}
	
	public String toString()
	{
		return "Room(" + building.getName() + "," + number + ")";
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj == null || (obj instanceof Room))
			return false;
		
		Room r = (Room) obj;
		
		
		if(number == r.getNumber() && building.equals(r.getBuilding())
				&& floor == r.getFloor() && capacity == r.getCapacity())
			return true;
		else
			return false;
	}
	
	public void authorize(User u)
	{
		users.add(u);
	}
	
	public boolean canEnter(User u)
	{
		if(users.contains(u))
			return true;
		else
			return false;
	}
	
	
}
