import java.util.*;
public class Building extends Facility
{
	
	private String name;
	private int aaminFloor;
	private int maxFloor;
	private int capacity;
	private ArrayList<Room> rooms = new ArrayList<Room>();
	
	public Building(String name, int minFloor, int maxFloor) throws Exception
	{
		if(minFloor <= maxFloor)
		{
			this.name = name;
			this.minFloor = minFloor;
			this.maxFloor = maxFloor;
			capacity = 0;
		}
		else
			throw new IllegalArgumentException();
	}
	
	public void addRoom(Room r) throws Exception
	{	
		for(int i = 0; i < rooms.size(); i++)
		{
			if(r.getName().equals(rooms.get(i).getName()))
				throw new DuplicateRoomException();
		}

		rooms.add(r);
	}
	
	public ArrayList<Room> getRooms()
	{
		return rooms;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getMinFloor()
	{
		return minFloor;
	}
	
	public int getMaxFloor()
	{
		return maxFloor;
	}
	
	public String toString()
	{
		return "Building(" + name + ")";
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public void addCapacity(int capacity)
	{
		this.capacity = this.capacity +capacity;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj == null || (obj instanceof Building))
			return false;
		
		Building b = (Building) obj;
		
		if(name == b.getName() && minFloor == b.getMinFloor()
				&& maxFloor == b.getMaxFloor() && capacity == b.getCapacity())
			return true;
		else
			return false;
	}
	
}