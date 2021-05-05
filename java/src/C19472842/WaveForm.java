package C19472842;

import processing.core.*;

// This is an example of a visual that renders the waveform
public class WaveForm
{
    JonathansVisual jv;
    float cy = 0;
    float[] lerpedBuffer;

    public WaveForm(JonathansVisual jv)
    {
        this.jv = jv;
        cy = this.jv.height;

    }

    public void render()
    {
        jv.colorMode(PApplet.HSB);
        for(int i = 0 ; i < jv.getAudioBuffer().size() ; i ++)
        {
            jv.stroke(
                PApplet.map(i, 0, jv.getAudioBuffer().size(), 0, 255)
                , 255
                , 255
            );

            jv.line(i, cy, i, cy + cy * jv.getAudioBuffer().get(i));
        }

        
    }
}