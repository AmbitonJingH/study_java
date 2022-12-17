package background;

import hero.Gongben;
import hero.Yase;

public class Game {

    public static void main(String[] args) {

        Yase yase = new Yase("亚瑟", "男", 200.0f, 100.0f, 2000);
        Gongben gongben = new Gongben("宫本", "男", 200.0f, 100.0f, 2000);
        boolean open = true;
        //写剧本
        //亚瑟发动一技能攻击宫本
        yase.firstaction();
        gongben.subblood(yase.getGjl());
        gongben.thirdaction();
        yase.subblood(gongben.getGjl());
        gongben.secondaction();
        yase.subblood(gongben.getGjl());
        yase.beiDong();
        while(open){
            gongben.noraction();
            yase.subblood(gongben.getGjl()-yase.getFyl());
            yase.beiDong();
            if(yase.getBloodnum()<0){
                System.out.println("宫本杀掉了亚瑟");
                open = false;
            }
        }
    }

}
