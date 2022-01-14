import java.util.Scanner;

class Trainer {
    private String name;
    private int level = 1;

    Scanner scan = new Scanner(System.in);

    Trainer () {
        System.out.println("あなたの名前は何ですか？");
        String name = scan.next();
        setName(name);
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

    public void setLevel (int level) {
        this.level = level;
    }

    public int getLevel (int level) {
        return this.level;
    }

    public void printData () {
        System.out.println("[トレーナー情報]");
        System.out.println("名前 : " + this.name + ", Level : " + this.level);
    }
}
