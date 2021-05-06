package C19472842;

import processing.core.*;

public class CircleWaveForm {
    JonathansVisual jv;
    float angle = 0;
    float cy = 0;
    float cx = 0;

    public CircleWaveForm(JonathansVisual jv)
    {
        this.jv = jv; 
        cy = this.jv.height;
        cx = this.jv.width;
    }

    public void render()
    {
        jv.colorMode(PApplet.HSB);
        //creating the 2 waveforms 
        for(int i = 0 ; i < jv.getAudioBuffer().size() ; i ++)
        {
            jv.stroke(
                PApplet.map(i, 0, jv.getAudioBuffer().size(), 0, 255)
                , 255
                , 255
            );

            jv.line(i, cy/4 , i, cy/4 + cy/4 * jv.getAudioBuffer().get(i));

            jv.line(i, (cy/4 *3) , i, (cy/4 *3) + (cy/4 ) * jv.getAudioBuffer().get(i));
        }


        float c = PApplet.map(jv.getSmoothedAmplitude(), 0, 1, 0, 255);
        jv.stroke(c, 180, 255);        
        jv.strokeWeight(2);
        jv.noFill();

        //creating circle in the centre of the screen
        for(int i = 0; i < 1000; i++)
        {
            jv.ellipse(jv.width / 2, jv.height / 2,  + (jv.getSmoothedAmplitude() * i + 50),  + (jv.getSmoothedAmplitude() * i + 50));
            
        }

        
    }

    
}