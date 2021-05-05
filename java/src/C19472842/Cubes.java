package C19472842;

import processing.core.*;

public class Cubes
{
    JonathansVisual jv;
    float angle = 0;
    float cy = 0;
    float cx = 0;


    public Cubes (JonathansVisual jv)
    {
        this.jv = jv; 
        cy = this.jv.height;
        cx = this.jv.width;
    }


    public void render() 
    {
        jv.lights();
        jv.strokeWeight(2);
        float c = PApplet.map(jv.getSmoothedAmplitude(), 0, 1, 0, 255);
        jv.stroke(c, 255, 255);
        //jv.noFill();
        jv.fill(c, 255, 255);
        angle += 0.01f;
        float s = 100 + (100 * jv.getSmoothedAmplitude() * 10);

        jv.pushMatrix();
        jv.translate(cx / 4, cy / 2, 0);
        jv.rotateY(angle);
        jv.rotateX(angle);
        jv.box(s);
        jv.popMatrix();

        jv.pushMatrix();
        jv.translate(cx * 0.75f, cy / 2, 0);
        jv.rotateY(angle);
        jv.rotateX(angle);
        jv.box(s);
        jv.popMatrix();
    }//end render 

    

}
