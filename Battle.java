import java.util.Random;

class Battle {
    public void battle (Monster [] monsters) {
        int index = 1;
        while (monsters[0].getHp() > 0 && monsters[1].getHp() > 0) {
            System.out.println(index + "ターン");
            attack(monsters);
            index += 1;
        }

        if (monsters[0].getHp() > 0) {
            System.out.println(monsters[0].getName() + " の勝利！！");
            monsters[0].setLevel(monsters[0].getLevel() + 1);
            System.out.println(monsters[0].getName() + " の Level が " + monsters[0].getLevel() + " になった");
        } else if (monsters[1].getHp() > 0) {
            System.out.println(monsters[1].getName() + " の勝利！！");
            monsters[1].setLevel(monsters[1].getLevel() + 1);
            System.out.println(monsters[1].getName() + " の Level が " + monsters[1].getLevel() + " になった");
        }
    }

    public static void attack (Monster [] monsters) {
        int skillNum = new Random().nextInt(2);
        int monsterNum = new Random().nextInt(2);
        System.out.println(monsters[monsterNum].getName() + " の " + monsters[monsterNum].getSkills().get(skillNum) + " 攻撃 ");
        damage(monsters, monsterNum);
        System.out.println();
        System.out.println("----------");
        System.out.println();
    }

    public static void damage (Monster [] monsters, int monsterNum) {
        int damage = new Random().nextInt(50);
        switch (monsterNum) {
            case 0:
                System.out.println("相手の " + monsters[1].getName() + "　は、" + damage + " のダメージ");
                if (monsters[1].getHp() >= damage) {
                    monsters[1].setHp(monsters[1].getHp() - damage);
                } else {
                    monsters[1].setHp(0);
                }
                System.out.println(monsters[1].getName() + "のHPは" + monsters[1].getHp() + "になった");
                break;
            case 1:
                System.out.println("相手の " + monsters[0].getName() + "　は、" + damage + " のダメージ");
                if (monsters[0].getHp() >= damage) {
                    monsters[0].setHp(monsters[0].getHp() - damage);
                } else {
                    monsters[0].setHp(0);
                }
                System.out.println(monsters[0].getName() + "のHPは" + monsters[0].getHp() + "になった");
                break;
        }
    }
}
