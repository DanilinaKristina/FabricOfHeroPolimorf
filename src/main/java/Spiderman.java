public  class  Spiderman extends Hero implements Flyable{
    @Override
    public String getName() {
        return "Человек-паук";
    }

    @Override
    public void canFly() {
        super.fly = true;
    }

    @Override
    public String getNameSuperPower() {
        return "У меня есть суперчутье !";
    }

    @Override
    public int getPower() {
        return 8;
    }

    @Override
    public Type getType() {
        return Type.MARVEL;
    }
}
