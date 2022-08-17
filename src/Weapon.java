public class Weapon {
    private TypeOfWeapon typeOfWeapon;
    private NameOfWeapon nameOfWeapon;

    public Weapon(TypeOfWeapon typeOfWeapon, NameOfWeapon nameOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
        this.nameOfWeapon = nameOfWeapon;
    }

    public NameOfWeapon getNameOfWeapon() {
        return nameOfWeapon;
    }

    public TypeOfWeapon getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public void setNameOfWeapon(NameOfWeapon nameOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
    }

    public void setTypeOfWeapon(TypeOfWeapon typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public String info() {
        return "Type of weapon: " + this.getTypeOfWeapon()
                + "\nName of weapon: " + this.nameOfWeapon;
    }
}
