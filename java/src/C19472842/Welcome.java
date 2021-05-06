package C19472842;

import processing.core.*;

public class Welcome {
    JonathansVisual jv;
    float angle =0;
    float width=0;
    float height =0;

    public Welcome(JonathansVisual jv)
    {
        this.jv= jv;
        width = this.jv.width;
        height = this.jv.height;
    }

    public void render()
    {
        String title = "Welcome";
        String subtitle = "Press space to start";
        String subtitle2 = "Press start to play music";
        String subtitle3 = "Press 1-6 for visuals";
        String subtitle4 = "by Jonathan Hew C19472842";
        float titleSize = width / 10f;
        float subtitleSize = width / 20f;
        float subtitle2Size = width /30f;
        float subtitle3Size = width /30f;
        float subtitle4Size = width /50f;

        int titleFill = 100;
        int subtitleFill = 200; 

        jv.textAlign(JonathansVisual.CENTER);
        jv.fill(titleFill, 255, 255);
        jv.textSize(titleSize);
        jv.text(title, width / 2, height /6 * 2);

        jv.fill(subtitleFill, 255, 255);
        jv.textSize(subtitleSize);
        jv.text(subtitle, width / 2, height /6 *3);
        jv.rotateY(angle);

        jv.fill(subtitleFill, 255, 255);
        jv.textSize(subtitle2Size);
        jv.text(subtitle2, width / 2, height /6 *4);

        jv.fill(subtitleFill, 255, 255);
        jv.textSize(subtitle3Size);
        jv.text(subtitle3, width / 2, height /6 * 5);

        jv.fill(255, 255, 255);
        jv.textSize(subtitle4Size);
        jv.text(subtitle4, width / 2, height/10 * 9);

    }
}
