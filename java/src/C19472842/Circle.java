package C19472842;

import processing.core.*;

public class Circle
{
    JonathansVisual jv;

    public Circle(JonathansVisual jv)
    {
        this.jv = jv; 
    }

    public void render()
    {
        float c = PApplet.map(jv.getSmoothedAmplitude(), 0, 1, 0, 255);
        jv.stroke(c, 255, 255);        
        jv.strokeWeight(2);
        jv.noFill();
        //jv.fill(c, 255, 255);
        // See the difference lerping makes? It smooths out the jitteryness of average, so the visual looks smoother
        //ellipse(width / 4, 100, 50 + average * 500, 50 + average * 500);

        for(int i = 1000; i < 50000; i=i+500)
        {
            jv.ellipse(jv.width / 2, jv.height / 2,  + (jv.getSmoothedAmplitude() * i),  + (jv.getSmoothedAmplitude() * i));
            
        }
        
                     
    }

    
}