public class GameEntity {

    private int Health;

    private int Damage;

    public int getHealth() {
        return Health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public String info() {
        return "Boss health: " + this.Health
                + "\nBoss damage: " + this.Damage;
    }
}
