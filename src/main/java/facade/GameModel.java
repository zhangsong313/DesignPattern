package facade;

import java.util.ArrayList;
import java.util.List;
// 游戏模型对象
public class GameModel{
    private List<GameObject> objects = new ArrayList<>(); // 持有一系列模型物体
    public GameModel(){ // 初始化
        objects.add(new Tank());
        objects.add(new Bullet());
        objects.add(new Wall());
    }

    public void paint() { // 绘制所有物体
        for (GameObject object : objects) {
            object.paint();
        }
    }
}
