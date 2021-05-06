package C19472842;

import processing.core.*;


public class CircledSphere 
{
    JonathansVisual jv;
    float cx=0;
    float cy=0;
    float angle =0;

    public CircledSphere (JonathansVisual jv)
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
        jv.stroke(c, 255, 180);
        jv.noFill();
        angle += 0.01f;
        float s = 50 + (75 * jv.getSmoothedAmplitude() * 10);
        
        //creating sphere in centre
        jv.pushMatrix();
        jv.translate(cx/2,cy/2,0);
        jv.rotateY(angle);
        jv.rotateX(angle);
        jv.strokeWeight(1);
        jv.sphere(s);
        jv.popMatrix();

        //creating cicles which surround the sphere 
        jv.strokeWeight(5);
        for(int i = 1000; i < 5000; i=i+1000)
        {
            jv.ellipse(jv.width / 2, jv.height / 2,  + (250 + jv.getSmoothedAmplitude() * i),  + (250 + jv.getSmoothedAmplitude() * i));
            
        }
    }
}

