package com.example.samsungproject.objects;

import android.graphics.Canvas;

public abstract class GameObject {
    protected double posX = 0;
    protected double posY = 0;
    protected double velX = 0;
    protected double velY = 0;

    public GameObject(double posX, double posY){
        this.posX = posX;
        this.posY = posY;
    }

    public abstract void draw(Canvas canvas);
    public abstract void update();

    protected double getPosX(){ return 0; }
    protected double getPosY(){ return 0; }


}
