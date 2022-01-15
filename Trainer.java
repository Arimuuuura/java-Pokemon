import java.util.Scanner;

class Trainer extends Characters {
    Scanner scan = new Scanner(System.in);
    private Monster monster = new Monster();

    public Monster getMonster () {
        return this.monster;
    }

    public void setInfo () {
        System.out.println("あなたの名前は何ですか？");
        String name = scan.next();
        setName(name);
        monster.setInfo();
    }

    public void printTrainer () {
        System.out.println("----------");
        System.out.println("[トレーナー情報]");
        System.out.println("名前 : " + getName() + ", Level : " + getLevel());
        monster.printMonster();
        System.out.println();
        System.out.println("----------");
        System.out.println();
    }
}
