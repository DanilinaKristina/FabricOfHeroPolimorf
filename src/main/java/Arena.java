public class Arena {
    public void fight (Hero name1, Hero name2) {
        System.out.println("Битва между " + name1.getName() + " и " + name2.getName());
        System.out.println("Битва началась! " + name1.getName() + " кричит \n" + name1.getNameSuperPower());
        System.out.println(name2.getName() + " кричит в ответ \n" + name2.getNameSuperPower());
        int i = (int) Math.floor(Math.random() * 101);
        if( i <= 85){
            if(name1.getPower() < name2.getPower() ) {
                System.out.println("\nВ битве победил " + name2.getName() + " с силой " + name2.getPower());
            } else {
                System.out.println("\nВ битве победил " + name1.getName() + " с силой " + name1.getPower());
            }
        } else {
            if(name1.getPower() < name2.getPower() ) {
                System.out.println("\nВмешался случай! Жизнь преподнесла сюрприз. Победил " + name1.getName());
            } else {
                System.out.println("\nВмешался случай! Жизнь преподнесла сюрприз. Победил " + name2.getName());
            }
        }



    }
}
