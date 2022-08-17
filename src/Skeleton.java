public class Skeleton extends Boss {
    private int arrows;


    public Skeleton(int Health, int Damage, int arrows) {
        super(Health, Damage);
        this.arrows = arrows;
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public String info() {
        return "Skeleton health: " + this.getHealth()
                + "\nSkeleton damage: " + this.getDamage()
                + "\nNumber of arrows: " + this.getArrows();
    }


}
