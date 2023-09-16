package emuns;

public enum EmpStatus {
    ACTIVE(1),
    IN_ACTIVE(0),
    CLOSED(-1);

    EmpStatus(int i) {
    }

    public int getStatus(int i) {
        return i;
    }
}
