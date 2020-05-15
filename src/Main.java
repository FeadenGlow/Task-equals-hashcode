public class Main {
    public static void main(String ... args) {
        Rectangle r1 = new Rectangle("blue", 200, 200);
        Rectangle r2 = new Rectangle("blue", 200, 200);
        System.out.println("r1 равен r2: "+r1.equals(r2));
        System.out.println("HashCode r1: "+r1.hashCode());
        System.out.println("HashCode r2: "+r2.hashCode());
        System.out.println("HashCode r1 равен HashCode r2: " + (r1.hashCode() == r2.hashCode()));
    }
}
