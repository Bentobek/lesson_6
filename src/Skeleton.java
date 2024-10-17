public class Skeleton extends Boss {
    private int arrows;


    public Skeleton(int health, String name, int damage, Weapen weapon, int arrows) {
        super(health, name ,damage, weapon);
        this.arrows = arrows;
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrowCount) {
        this.arrows = arrowCount;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Arrow Count: " + arrows);
    }
}
