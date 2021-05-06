package C19472842;


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
            jv.fill(34, 139, 34);
            jv.rect(i * gap, jv.height, gap,-jv.getSmoothedBands()[i] * 0.4f); 
        }
    }
}