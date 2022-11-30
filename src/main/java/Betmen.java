public class Betmen extends Hero implements Flyable{
    @Override
    public String getName() {
        return "Бетмен";
    }
    @Override
    public void canFly() {
        super.fly = true;
    }
    @Override
    public String getNameSuperPower() {
        return "Моя сила - это деньги";
    }

    @Override
    public int getPower() {
        return 10;
    }

    @Override
    public Type getType() {
        return Type.DC;
    }
}
