package C19472842;

import ie.tudublin.*;
import example.*;


public class JonathansVisual extends Visual
{

    WaveForm wf;
    AudioBandsVisual abv;
    Cubes cub;
    Circle cir;
    Test test;
    CircleWaveForm cwf;
    BoxedSphere bsp;

    int which = 0;

    public void settings()
    {
        //size(1024, 500, P3D);
        fullScreen(P3D);
    }

    public void setup()
    {
        surface.setResizable(true);

        startMinim();

        // Call loadAudio to load an audio file to process 
        loadAudio("heroplanet.mp3"); 

        wf = new WaveForm(this);
        abv = new AudioBandsVisual(this);
        cub = new Cubes(this);
        cir = new Circle(this);
        test = new Test(this);
        cwf = new CircleWaveForm(this);
        bsp = new BoxedSphere(this);
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }

        if (key >= '0' && key <= '6')
        {
            which = key - '0';
        }
    }

    public void draw()
    {
        colorMode(HSB);
        background(0);
        //blue color
        //background(135,206,250);
        try
        {
            // Call this if you want to use FFT data
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();        
        //wf.render();
        //abv.render();

        switch (which)
        {
            case 0:
            {
                wf.render();
                abv.render();
                break;
            }//end case 0
            case 1:
            {
                cwf.render();
                break;
            }//end case 1;
            case 2: 
            {
                cub.render();
                break;
            }//end case 2
            case 3:
            {
                cir.render();
                
                break;
            }//end case 3
            case 4:
            {
                bsp.render();
                break;
            }//end case 4 
            case 6:
            {
                
                test.render();
                break;
            }
        }//end switch
    }
}

