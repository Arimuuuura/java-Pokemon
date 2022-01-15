import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Monster extends Characters {
    private String attribute;
    private int hp = 100;
    private List<String> skills = new ArrayList<>();

    Scanner scan = new Scanner(System.in);

    public void setAttribute (String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute () {
        return this.attribute;
    }

    public void setHp (int hp) {
        this.hp = hp;
    }

    public int getHp () {
        return this.hp;
    }

    public void setSkills () {
        for (int i = 1; i <=2; i++) {
            System.out.println(i + "番目の技は？");
            String skill = scan.next();
            this.skills.add(skill);
        }
    }

    public List<String> getSkills () {
        return skills;
    }

    public void setInfo () {
        // ポケモンの名前を登録
        System.out.println("ポケモンの名前は何ですか？");
        String pokeName = scan.next();
        setName(pokeName);

        // ポケモンの属性を登録
        System.out.println("属性は何ですか？");
        String pokeAttr = scan.next();
        setAttribute(pokeAttr);

        // ポケモンの技を2種類登録
        setSkills();
    }

    public void printMonster () {
        System.out.println("[ポケモン情報]");
        System.out.println("名前 : " + getName() + ", 属性 : " + this.attribute + ", 技 : " + skills + ", HP : " + this.hp + ", Level : " + getLevel());
        System.out.println();
    }
}
