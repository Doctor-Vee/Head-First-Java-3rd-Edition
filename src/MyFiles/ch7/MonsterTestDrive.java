package MyFiles.ch7;

public class MonsterTestDrive {
    public static void main(String[] args) {
        Monster[] monsters = new Monster[3];
        monsters[0] = new Vampire();
        monsters[1] = new Dragon();
        monsters[2] = new Monster();
        for (int i = 0; i < monsters.length; i++) {
            monsters[i].frighten(i);
        }
    }
}
class Monster {
    // A
    Number frighten (int x) {
        System.out.println("arrrgh");
        return 1;
    }
}
class Vampire extends Monster {
    // B
    Integer frighten(int b){
        System.out.println("a bite?");
        return 1;
    }
}
class Dragon extends Monster {
    Integer frighten(int degree) {
        System.out.println("breathe fire");
        return 1;
    }
}