package C19472842;

import ie.tudublin.*;

public class JonathansVisual extends Visual
{

    WaveForm wf;
    AudioBandsVisual abv;
    Cubes cub;
    Circle cir;
    CircleWaveForm cwf;
    BoxedSphere bsp;
    CircledSphere csp;
    Welcome wel;

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
        loadAudio("hooligan.mp3"); 

        wf = new WaveForm(this);
        abv = new AudioBandsVisual(this);
        cub = new Cubes(this);
        cir = new Circle(this);
        cwf = new CircleWaveForm(this);
        bsp = new BoxedSphere(this);
        csp = new CircledSphere(this);
        wel = new Welcome(this);
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

        //switch case to choose between visuals
        switch (which)
        {
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
            case 5:
            {
                wf.render();
                abv.render();
                break;
            }//end case 5
            case 6:
            {
                
                csp.render();
                break;
            }//end case 6
            default:
            {
                wel.render();
            }//end default
        }//end switch
    }
}

