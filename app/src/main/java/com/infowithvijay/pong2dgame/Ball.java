package com.infowithvijay.pong2dgame;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Ball {

    public float cx;
    public float cy;
    public float velocity_x;
    public float velocity_y;

    private int radius;
    private Paint paint;

    public Ball(int radius, Paint paint) {  ///konstruktor för att starta varaiblen
       this.paint = paint;
       this.radius = radius;
       this.velocity_x = PongTable.PHY_BALL_SPEED;
       this.velocity_y = PongTable.PHY_BALL_SPEED;
    }

    ///// första paramenter måste vi identfiera kordianter, just därför vi har skapat variabllar cx och cy
    public void draw(Canvas canvas){
        canvas.drawCircle(cx,cy,radius,paint);
    }


    public void moveBall(Canvas canvas){
        cx += velocity_x; /// vi ändrar hastigheten på bollen för att flytta på den
        cy += velocity_y;

        if (cy < radius){
            cy = radius;
        }else if (cy + radius >= canvas.getHeight()){
            cy = canvas.getHeight() - radius - 1;
        }
    }

    public int getRadius() {
        return radius;
    } ////getter

//// helper funcktioner
    @Override
    public String toString() {
        return "Cx = " + cx + "Cy" + cy + "velX= " + velocity_x + " velY= " + velocity_y;
    }


}
