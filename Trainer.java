import java.util.Scanner;

class Trainer extends Characters {
    Scanner scan = new Scanner(System.in);

    Trainer () {
//        System.out.println("あなたの名前は何ですか？");
//        String name = scan.next();
//        setName(name);
    }

    public void setInfo () {
        System.out.println("あなたの名前は何ですか？");
        String name = scan.next();
        setName(name);
        System.out.println("[トレーナー情報]");
        System.out.println("名前 : " + getName() + ", Level : " + getLevel());
        System.out.println();
        System.out.println("----------");
        System.out.println();
    }
}
