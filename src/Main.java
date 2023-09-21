public class Main {
    public static void main(String[] args) {
        Boss Statham = new Boss(700, 60);

        Weapon StathamWeapon = new Weapon(WeaponType.FIREARMS, NameOfWeapon.RIFLE);

        System.out.println("Boss specifications:");
        System.out.println("Health - " + Statham.getHealth());
        System.out.println("Health - " + Statham.getHealth());
        System.out.println("Damage - " + Statham.getDamage());
        System.out.println("Type of weapon - " + StathamWeapon.getTypeOfWeapon());
        System.out.println("Name of weapon - " + StathamWeapon.getNameOfWeapon());
        System.out.println("--------------------------");
        System.out.println(Statham.info());
        System.out.println(StathamWeapon.printInfo());
        System.out.println("--------------------------");

        Skeleton Bob = new Skeleton(200, 15, 50);
        Weapon SkeletWeapon = new Weapon(WeaponType.THROWING, NameOfWeapon.BOW);
        System.out.println(Bob.info());
        System.out.println(SkeletWeapon.printInfo());
        System.out.println("--------------------------");

        Skeleton David = new Skeleton(150, 15, 40);
        System.out.println(David.info());
        System.out.println(SkeletWeapon.printInfo());
        System.out.println("--------------------------");


    }
}