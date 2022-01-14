import java.util.Scanner;

class UseMonster {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Monster インスタンス生成
        System.out.println("バトルするポケモンを2匹登録してください");

        Monster [] monsters = new Monster[2];
        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + "匹目のポケモンを登録します");
            monsters[i] = new Monster();
            monsters[i].printData();
        }

        System.out.println(monsters[0].getName() + " vs " + monsters[1].getName() + " バトル開始");
        System.out.println("----------");
        System.out.println("----------");
        Battle battle = new Battle();
        battle.battle(monsters);
    }
}
