import java.util.Scanner;

class Trainer extends Characters implements Recovery {
    Scanner scan = new Scanner(System.in);
    private Monster monster = new Monster();
    private boolean isAdventure;

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

    public void setIsAdventure () {
        Scanner scan = new Scanner(System.in);
        System.out.println("冒険に出かけますか？( yes / no )");
        String isAdventure = scan.next();

        if (!isAdventure.equals("yes")) {
            System.out.println(getName() + " は、静かに家路についた。");
            this.isAdventure = false;
            return;
        }

        if (monster.getHp() == 0) {
            this.recovery();
        }

        System.out.println();
        System.out.println("==========");
        System.out.println(getName() + " は、冒険に出かけた。");
        System.out.println("==========");
        System.out.println();
        this.isAdventure = true;
    }

    public boolean getIsAdventure () {
        return this.isAdventure;
    };

    public void recovery () {
        monster.setHp(100);
        System.out.println();
        System.out.println("==========");
        System.out.println(monster.getName() + "のHPは回復した。");
        System.out.println("==========");
        System.out.println();
    };
}
