public class Halk extends Hero implements Flyable{
    @Override
    public String getName() {
        return "Халк";
    }
    public void canFly (){

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
