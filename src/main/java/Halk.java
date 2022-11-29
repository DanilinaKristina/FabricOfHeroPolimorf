public class Halk extends Hero{
    @Override
    public String getName() {
        return "Халк";
    }

    @Override
    public String getNameSuperPower() {
        return "Я все крушить !";
    }

    @Override
    public int getPower() {
        return 6;
    }

    @Override
    public Type getType() {
        return Type.DC;
    }
}
