package htl;

import java.util.Arrays;

public class Hospital {
String name;
Room[] rooms = new Room[15];
int counter = 0;

    Hospital (String Name){
        this.name = Name;
    }


public void addRoom(String id, int noofbeds, boolean criticalcare){
Room room = new Room(id,noofbeds,criticalcare);
rooms[counter] = room;
counter++;
}

public void addRoom(String id){
    Room room = new Room(id);
    rooms[counter] = room;
    counter++;
}

public void changeBedsInRoom(String id, int noOfBeds){
    for (int i = 0; i < counter; i++) {
        if(id ==  this.rooms[i].getId()){
            rooms[i].setNoofbeds(noOfBeds);
        }
    }
}

public int getNumberOfBeds(){
    int beds = 0;
    for (int i = 0; i < this.counter; i++) {
        if(rooms[i].getCriticalcare() == false){
        beds += rooms[i].getNoofbeds();
        }
    }
return beds;
}

public int getNumberOfCriticalBeds(){
        int beds = 0;
        for (int i = 0; i < this.counter; i++) {
            if(rooms[i].getCriticalcare() == true){
                beds += rooms[i].getNoofbeds();
            }
        }
        return beds;
    }


    @Override
    public String toString() {
        return "Hospital:" + name + ": " + getNumberOfCriticalBeds() +" / " + getNumberOfBeds();
    }
}
