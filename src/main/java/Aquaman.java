public class Aquaman extends Hero{


    @Override
    public String getName() {
        return "Аквамен";
    }

    @Override
    public String getNameSuperPower() {
        return "Я как рыба в воде";
    }

    @Override
    public int getPower() {
        return 7;
    }

    @Override
    public Type getType() {
        return Type.DC;
    }
}
