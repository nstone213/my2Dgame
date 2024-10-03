package src.entity;

import java.awt.Color;
import java.awt.Graphics2D;

import src.main.GamePanel;
import src.main.KeyHandler;

public class Player extends Entity{
    GamePanel gp;
    KeyHandler keyH;

    public Player(GamePanel gp, KeyHandler keyH) {
        this.gp = gp;
        this.keyH = keyH;
        setDefaulValues();
    }

    public void setDefaulValues() {
        x = 100;
        y = 100;
        speed = 4;
    }

    public void getPlayerImage() {
        //to be done
    }

    public void update() {
        if(keyH.upPressed == true) {
            y -= speed;
        } else if (keyH.downPressed == true) {
            y += speed;
        } else if (keyH.leftPressed == true) {
            x -= speed;
        } else if (keyH.rightPreseed == true) {
            x += speed;
        }
    }

    public void draw(Graphics2D g2) {
        g2.setColor(Color.white);
        g2.fillRect(x, y, gp.tileSize, gp.tileSize);
    }
}
