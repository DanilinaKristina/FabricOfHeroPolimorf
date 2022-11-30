public class Superman extends Hero implements Flyable{
    @Override
    public String getName() {
        return "Супермен";
    }
    @Override
    public void canFly() {
        super.fly = true;
    }
    @Override
    public String getNameSuperPower() {
        return "Я самый сильный человек в мире !";
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
