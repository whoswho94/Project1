public class Reimbursement {
    private int id;
    private String name;
    private int ReburtAmount;
    private String ReaReburtAmount;
    private boolean ReburtStatus;

    public Reimbursement(){

    }

    public Reimbursement(int id, String name, int ReburtAmount, String ReaReburtAmount, boolean ReburtStatus){
        this.id = id;
        this.name = name;
        this.ReburtAmount = ReburtAmount;
        this.ReaReburtAmount = ReaReburtAmount;
        this.ReburtStatus = ReburtStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReburtAmount() {
        return ReburtAmount;
    }

    public void setReburtAmount(int reburtAmount) {
        ReburtAmount = reburtAmount;
    }

    public String getReaReburtAmount() {
        return ReaReburtAmount;
    }

    public void setReaReburtAmount(String reaReburtAmount) {
        ReaReburtAmount = reaReburtAmount;
    }

    public boolean isReburtStatus() {
        return ReburtStatus;
    }

}
