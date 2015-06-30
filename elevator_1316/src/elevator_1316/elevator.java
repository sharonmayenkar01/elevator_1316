package elevator_1316;

public class elevator extends door implements floor{
	int numberOfFloors,floorChoice;
	

void moveUp(){
	System.out.println("Move up");
}
void moveDown(){
	System.out.println("Move down");
}

@Override
public void changeFloor() {
	// TODO Auto-generated method stub	
}
@Override
public void enterFloor() {
	// TODO Auto-generated method stub
	System.out.println("Enter the floor of you want to go");
}
}
