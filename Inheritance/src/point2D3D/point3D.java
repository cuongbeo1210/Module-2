package point2D3D;

public class point3D extends point2D {
    private float z = 0.0f;

    public point3D() {
        super();
        this.z = 0;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] test = new float[3];
        test[0] = this.z;
        test[1] = this.z;
        test[2] = this.z;
        return test;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
    }
}
