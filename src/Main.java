public class Main {
    public static void main(String[] args) {
        Weapen bossWeapen = new Weapen(WeaponType.SWORD, "Laser");
        Boss boss = new Boss(1000,"Darth Vader" ,200 ,bossWeapen);

    boss.printInfo();

        System.out.println("-----------------------");

     Weapen skeletonWeapon1 = new Weapen(WeaponType.BOW, "Bone Bow");

        Skeleton skeleton1 = new Skeleton(300, "Dark Green Archer ", 50, skeletonWeapon1, 25);

     Weapen skeletonWeapon2 = new Weapen(WeaponType.BOW, "Shadow Bow");
        Skeleton skeleton2 = new Skeleton( 350, "Shadow Archer ", 60, skeletonWeapon2, 40);


        skeleton1.printInfo();

        System.out.println("---------------");

        skeleton2.printInfo();
    }
}


