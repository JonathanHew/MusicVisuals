package C19472842;

import processing.core.*;

// This is an example of a visual that uses the audio bands
public class AudioBandsVisual
{
    JonathansVisual jv;

    public AudioBandsVisual(JonathansVisual jv)
    {
        this.jv = jv;
         
    }

    public void render()
    {
        float gap = jv.width / (float) jv.getBands().length;
        jv.noStroke();
        for(int i = 0 ; i < jv.getBands().length ; i ++)
        {
            //mv.fill(PApplet.map(i, 0, mv.getBands().length, 255, 0), 255, 255);
            jv.fill(34, 139, 34);
            jv.rect(i * gap, jv.height, gap,-jv.getSmoothedBands()[i] * 0.4f); 
        }
    }
}