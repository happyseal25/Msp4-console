package msplab4.mbeans;

public interface PointsCounterMBean  {
    void addShot(boolean isSuccessful);
    long getSumAllPoint();
    long getSumMissedPoint();
}
