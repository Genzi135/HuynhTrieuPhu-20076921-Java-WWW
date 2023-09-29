package backend.emuns;

public enum EmpStatus {
    ACTIVE(1),
    IN_ACTIVE(0),
    TERMINATED(-1);

    EmpStatus(int i) {
    }

    public int getStatus(int i) {
        return i;
    }
}
