public class Weapon {
    private WeaponType typeOfWeapon;

    private NameOfWeapon nameOfWeapon;

    public Weapon(WeaponType typeOfWeapon, NameOfWeapon nameOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
        this.nameOfWeapon = nameOfWeapon;
    }

    public NameOfWeapon getNameOfWeapon() {
        return nameOfWeapon;
    }

    public WeaponType getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public void setNameOfWeapon(NameOfWeapon nameOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
    }

    public void setTypeOfWeapon(WeaponType typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public String printInfo() {
        return "Type of weapon: " + this.getTypeOfWeapon()
                + "\nName of weapon: " + this.nameOfWeapon;
    }
}
