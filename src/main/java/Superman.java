public class Superman extends Hero{
    @Override
    public String getName() {
        return "Супермен";
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
