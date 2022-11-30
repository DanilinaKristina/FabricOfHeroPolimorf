import lombok.ToString;
@ToString

public class Application {
    public static void main(String[] args) {
        Hero hero1 = new Betmen();
        Hero hero2 = new Aquaman();
        Hero hero3 = new Halk();
        Hero hero4 = new Rossomaha();
        Hero hero5 = new Spiderman();
        Hero hero6 = new Superman();
        Arena boi = new Arena();
        boi.fight(hero1,hero2);
        boi.fight(hero3,hero4);
        boi.fight(hero5,hero6);
        Arena boi2 = new Arena();
        boi2.fightFlyingHero(hero2,hero1);
        boi2.fightFlyingHero(hero6,hero1);


    }
}
