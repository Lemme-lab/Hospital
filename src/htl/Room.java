package htl;

public class Room {

private String id;
private int noofbeds;
private boolean criticalcare;


    Room (String id_1, int noofbeds_1, boolean criticalcare_1){
        this.id = id_1;
        this.noofbeds = noofbeds_1;
        this.criticalcare = criticalcare_1;
    }

    Room (String id_1){
        this.id = id_1;
        this.noofbeds = 3;
        this.criticalcare = false;
    }



    public void setNoofbeds(int noofbeds) {
        this.noofbeds = noofbeds;
    }

    public String getId() {
        return this.id;
    }
    public boolean getCriticalcare() {
        return this.criticalcare;
    }

    public int getNoofbeds() {
        return this.noofbeds;
    }
}