package C19472842;

import processing.core.*;

import java.util.ArrayList;

public class BoxedSphere 
{
    JonathansVisual jv;
    float cx = 0;
    float cy = 0;
    float angle = 0;
    float angle2 = 0;
    float gap =0;

    boolean moveup = true;
    boolean movedown = false;

    public BoxedSphere (JonathansVisual jv)
    {
        this.jv = jv; 
        cx = this.jv.width;
        cy = this.jv.height;
        
    }

    public void render()
    {
        jv.lights();
        jv.strokeWeight(2);
        float c = PApplet.map(jv.getSmoothedAmplitude(), 0, 1, 0, 255);
        jv.stroke(c, 75,255);
        jv.noFill();
        //jv.fill(c, 255, 255);
        angle += 0.01f;
        angle2 -= 0.01f;
        float s = 100 + (100 * jv.getSmoothedAmplitude() * 10);
        float s2 = 10 + (50 * jv.getSmoothedAmplitude() * 10);

        jv.pushMatrix();
        jv.translate(cx / 6, cy / 6, 0);
        jv.rotateY(angle);
        jv.rotateX(angle);
        jv.box(s);
        jv.popMatrix();

        jv.pushMatrix();
        jv.translate(cx/6,cy/6,0);
        jv.rotateY(angle2);
        jv.rotateX(angle2);
        jv.strokeWeight(1);
        jv.sphere(s2);
        jv.popMatrix();

        jv.pushMatrix();
        jv.translate(cx/6 *5, cy / 6, 0);
        jv.rotateY(angle);
        jv.rotateX(angle);
        jv.box(s);
        jv.popMatrix();

        jv.pushMatrix();
        jv.translate(cx/6 *5 ,cy/6,0);
        jv.rotateY(angle2);
        jv.rotateX(angle2);
        jv.strokeWeight(1);
        jv.sphere(s2);
        jv.popMatrix();

        jv.pushMatrix();
        jv.translate(cx/6 , cy /6*5  , 0);
        jv.rotateY(angle);
        jv.rotateX(angle);
        jv.box(s);
        jv.popMatrix();

        jv.pushMatrix();
        jv.translate(cx/6 ,cy/6*5,0);
        jv.rotateY(angle2);
        jv.rotateX(angle2);
        jv.strokeWeight(1);
        jv.sphere(s2);
        jv.popMatrix();

        jv.pushMatrix();
        jv.translate(cx/6*5 , cy/6 *5 , 0);
        jv.rotateY(angle);
        jv.rotateX(angle);
        jv.box(s);
        jv.popMatrix();

        jv.pushMatrix();
        jv.translate(cx/6*5 ,cy/6 *5,0);
        jv.rotateY(angle2);
        jv.rotateX(angle2);
        jv.strokeWeight(1);
        jv.sphere(s2);
        jv.popMatrix();

        jv.pushMatrix();
        jv.translate(cx/2 , cy/2 , 0);
        jv.rotateY(angle);
        jv.rotateX(angle);
        jv.box(s);
        jv.popMatrix();

        jv.pushMatrix();
        jv.translate(cx/2,cy/2,0);
        jv.rotateY(angle2);
        jv.rotateX(angle2);
        jv.strokeWeight(1);
        jv.sphere(s2);
        jv.popMatrix();

    }
}