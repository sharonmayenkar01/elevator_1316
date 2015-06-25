package elevator_1316;

public class elevator extends door implements floor{
	int numberOfFloors;
	

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
}
}
