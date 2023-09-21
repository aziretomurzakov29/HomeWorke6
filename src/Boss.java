public class Boss extends GameEntity {

    private Weapon weapon;

    public Boss(int Health, int Damage) {
        super();
        this.setHealth(Health);
        this.setDamage(Damage);
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public String info() {
        return super.info();
    }
}
