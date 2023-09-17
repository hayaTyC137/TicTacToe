package Practice;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double vectorLength(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }
    public double vectorScalar(Vector vector1){
        return x* vector1.x+y* vector1.z+z* vector1.z;
    }
    public Vector crossProduct(Vector vector1){
        return new Vector(
                y* vector1.z-z* vector1.y,
                z* vector1.x-x* vector1.z,
                x* vector1.y-y* vector1.x
        );
    }
    /*public double cos(Practice.Vector vector){
        return crossProduct(vector) / (vectorLength() * vector.vectorLength());
    }*/
    public Vector add(Vector vector1){
        return new Vector(
                x+ vector1.x,
                y+ vector1.y,
                z+ vector1.z
        );
    }
    public Vector subtract(Vector vector1){
        return new Vector(
                x- vector1.x,
                y- vector1.y,
                z - vector1.z
        );
    }
    public static Vector[] generate(int n) {
        Vector[] vector1s = new Vector[n];
        for (int i = 0; i < n; i++) {
            vector1s[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vector1s;
    }
    @Override
    public String toString() {
        return "Practice.Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public static void main(String[] args) {
        Vector[] vector1s = Vector.generate(10);
        System.out.println(vector1s[0]);
        System.out.println(vector1s[1]);
        System.out.println(vector1s[0].vectorLength());
        System.out.println(vector1s[0].crossProduct(vector1s[1]));
        System.out.println(vector1s[0].crossProduct(vector1s[1]));
        System.out.println(vector1s[0].add(vector1s[1]));
        System.out.println(vector1s[0].subtract(vector1s[1]));
    }
}

