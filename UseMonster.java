import java.util.Scanner;

class UseMonster {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Trainer インスタンス生成
        Trainer trainer = new Trainer();
        trainer.printData();

        // Monster インスタンス生成
        System.out.println("バトルするポケモンを2匹登録してください");

        Monster [] monsters = new Monster[2];
        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + "匹目のポケモンを登録します");
            monsters[i] = new Monster();
            monsters[i].printData();
        }

        Battle.battle(monsters);

        for (int i = 0; i < 2; i++) {
            monsters[i].printData();
        }
    }
}
