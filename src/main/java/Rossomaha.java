public class Rossomaha extends Hero{
    @Override
    public String getName() {
        return "Россомаха";
    }

    @Override
    public String getNameSuperPower() {
        return "У меня есть когти !";
    }

    @Override
    public int getPower() {
        return 3;
    }

    @Override
    public Type getType() {
        return Type.MARVEL;
    }
}
