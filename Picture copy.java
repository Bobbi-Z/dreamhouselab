
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{

    private Square OCD;
    private Square windowbox1;
    private Square windowbox2;
    private Circle wincircle1;
    private Circle wincircle2;
    private Circle wincircle3;
    private Square ocd2;
    private Square ocd3;
    private Square ocd4;
    private Square ocd5;
    private Square towerl;
    private Square towerr;
    private Square mainshadow;
    private Square mainhouse;
    private Square bottomofdoor;
    private Circle topofdoor;
    private Circle doorknob;
    private Triangle roof1;
    private Triangle roof2;
    private Circle moon;
    private Square nightsky;
    private Square grass;
    private Square westsand;
    private Square eastsand;
    private Square westwater;
    private Square eastwater;
    private Circle wave;
    private Circle wave2;
    private Circle wave3;
    private Circle wave4;
    private Circle wave5;
    private Circle wave6;
    private Circle wave7;
    private Circle wave8;
    private Circle wave9;
    private Circle wave10;
    private Circle wave11;
    private Circle wave12;
    private Circle wave13;
    private Circle wave14;
    private Circle wave15;
    private Circle wave16;
    private Circle wwave;
    private Circle wwave2;
    private Circle wwave3;
    private Circle wwave4;
    private Circle wwave5;
    private Circle wwave6;
    private Circle wwave7;
    private Circle wwave8;
    private Circle wwave9;
    private Circle wwave10;
    private Circle wwave11;
    private Circle wwave12;
    private Circle wwave13;
    private Circle wwave14;
    private Circle wwave15;
    private Circle wwave16;
    private Circle ewave;
    private Circle ewave2;
    private Circle ewave3;
    private Circle ewave4;
    private Circle ewave5;
    private Circle ewave6;
    private Circle ewave7;
    private Circle ewave8;
    private Circle ewave9;
    private Circle ewave10;
    private Circle ewave11;
    private Circle ewave12;
    private Circle ewave13;
    private Circle ewave14;
    private Circle ewave15;
    private Circle ewave16;
    private Circle eewave;
    private Circle eewave2;
    private Circle eewave3;
    private Circle eewave4;
    private Circle eewave5;
    private Circle eewave6;
    private Circle eewave7;
    private Circle eewave8;
    private Circle eewave9;
    private Circle eewave10;
    private Circle eewave11;
    private Circle eewave12;
    private Circle eewave13;
    private Circle eewave14;
    private Circle eewave15;
    private Circle eewave16;
    private Circle sun;
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        nightsky = new Square();
        nightsky.changeColor("black");
        nightsky.changeSize(2000);
        nightsky.moveHorizontal(950);
        nightsky.moveVertical(-150);
        nightsky.makeVisible();
        
        OCD = new Square();
        OCD.changeColor("black");
        OCD.changeSize(200);
        OCD.moveHorizontal (-20);
        OCD.moveVertical (619);
        OCD.makeVisible();
        
        grass = new Square();
        grass.changeColor("green");
        grass.changeSize(2000);
        grass.moveHorizontal(0);
        grass.moveVertical(620);
        grass.makeVisible();
        
        westsand = new Square();
        westsand.changeColor("yellow");
        westsand.changeSize(500);
        westsand.moveHorizontal(0);
        westsand.moveVertical(620);
        westsand.makeVisible();
        
        eastsand = new Square();
        eastsand.changeColor("yellow");
        eastsand.changeSize(500);
        eastsand.moveHorizontal(1420);
        eastsand.moveVertical(620);
        eastsand.makeVisible();
        
        westwater = new Square();
        westwater.changeColor("blue");
        westwater.changeSize(500);
        westwater.moveHorizontal(-320);
        westwater.moveVertical(620);
        westwater.makeVisible();
        
        eastwater = new Square();
        eastwater.changeColor("blue");
        eastwater.changeSize(500);
        eastwater.moveHorizontal(1720);
        eastwater.moveVertical(620);
        eastwater.makeVisible();
        
        wave = new Circle ();
        wave.changeColor("black");
        wave.changeSize(50);
        wave.moveHorizontal(-05);
        wave.moveVertical(570);
        wave.makeVisible();
        
        wave2 = new Circle ();
        wave2.changeColor("blue");
        wave2.changeSize(45);
        wave2.moveHorizontal(05);
        wave2.moveVertical(572);
        wave2.makeVisible();
        
        wave3 = new Circle ();
        wave3.changeColor("black");
        wave3.changeSize(50);
        wave3.moveHorizontal(05);
        wave3.moveVertical(620);
        wave3.makeVisible();
        
        wave4 = new Circle ();
        wave4.changeColor("blue");
        wave4.changeSize(45);
        wave4.moveHorizontal(0);
        wave4.moveVertical(622);
        wave4.makeVisible();
        
        wave5 = new Circle ();
        wave5.changeColor("black");
        wave5.changeSize(50);
        wave5.moveHorizontal(-05);
        wave5.moveVertical(670);
        wave5.makeVisible();
        
        wave6 = new Circle ();
        wave6.changeColor("blue");
        wave6.changeSize(45);
        wave6.moveHorizontal(05);
        wave6.moveVertical(672);
        wave6.makeVisible();
        
        wave7 = new Circle ();
        wave7.changeColor("black");
        wave7.changeSize(50);
        wave7.moveHorizontal(05);
        wave7.moveVertical(720);
        wave7.makeVisible();
        
        wave8 = new Circle ();
        wave8.changeColor("blue");
        wave8.changeSize(45);
        wave8.moveHorizontal(0);
        wave8.moveVertical(722);
        wave8.makeVisible();
        
        wave9 = new Circle ();
        wave9.changeColor("black");
        wave9.changeSize(50);
        wave9.moveHorizontal(-05);
        wave9.moveVertical(770);
        wave9.makeVisible();
        
        wave10 = new Circle ();
        wave10.changeColor("blue");
        wave10.changeSize(45);
        wave10.moveHorizontal(05);
        wave10.moveVertical(772);
        wave10.makeVisible();
        
        wave11 = new Circle ();
        wave11.changeColor("black");
        wave11.changeSize(50);
        wave11.moveHorizontal(05);
        wave11.moveVertical(820);
        wave11.makeVisible();
        
        wave12 = new Circle ();
        wave12.changeColor("blue");
        wave12.changeSize(45);
        wave12.moveHorizontal(0);
        wave12.moveVertical(822);
        wave12.makeVisible();
        
        wave13 = new Circle ();
        wave13.changeColor("black");
        wave13.changeSize(50);
        wave13.moveHorizontal(-05);
        wave13.moveVertical(870);
        wave13.makeVisible();
        
        wave14 = new Circle ();
        wave14.changeColor("blue");
        wave14.changeSize(45);
        wave14.moveHorizontal(05);
        wave14.moveVertical(872);
        wave14.makeVisible();
        
        wave15 = new Circle ();
        wave15.changeColor("black");
        wave15.changeSize(50);
        wave15.moveHorizontal(05);
        wave15.moveVertical(920);
        wave15.makeVisible();
        
        wave16 = new Circle ();
        wave16.changeColor("blue");
        wave16.changeSize(45);
        wave16.moveHorizontal(0);
        wave16.moveVertical(922);
        wave16.makeVisible();
        
        wwave = new Circle ();
        wwave.changeColor("black");
        wwave.changeSize(50);
        wwave.moveHorizontal(50);
        wwave.moveVertical(570);
        wwave.makeVisible();
        
        wwave2 = new Circle ();
        wwave2.changeColor("blue");
        wwave2.changeSize(45);
        wwave2.moveHorizontal(60);
        wwave2.moveVertical(572);
        wwave2.makeVisible();
        
        wwave3 = new Circle ();
        wwave3.changeColor("black");
        wwave3.changeSize(50);
        wwave3.moveHorizontal(60);
        wwave3.moveVertical(620);
        wwave3.makeVisible();
        
        wwave4 = new Circle ();
        wwave4.changeColor("blue");
        wwave4.changeSize(45);
        wwave4.moveHorizontal(55);
        wwave4.moveVertical(622);
        wwave4.makeVisible();
        
        wwave5 = new Circle ();
        wwave5.changeColor("black");
        wwave5.changeSize(50);
        wwave5.moveHorizontal(50);
        wwave5.moveVertical(670);
        wwave5.makeVisible();
        
        wwave6 = new Circle ();
        wwave6.changeColor("blue");
        wwave6.changeSize(45);
        wwave6.moveHorizontal(60);
        wwave6.moveVertical(672);
        wwave6.makeVisible();
        
        wwave7 = new Circle ();
        wwave7.changeColor("black");
        wwave7.changeSize(50);
        wwave7.moveHorizontal(60);
        wwave7.moveVertical(720);
        wwave7.makeVisible();
        
        wwave8 = new Circle ();
        wwave8.changeColor("blue");
        wwave8.changeSize(45);
        wwave8.moveHorizontal(55);
        wwave8.moveVertical(722);
        wwave8.makeVisible();
        
        wwave9 = new Circle ();
        wwave9.changeColor("black");
        wwave9.changeSize(50);
        wwave9.moveHorizontal(50);
        wwave9.moveVertical(770);
        wwave9.makeVisible();
        
        wwave10 = new Circle ();
        wwave10.changeColor("blue");
        wwave10.changeSize(45);
        wwave10.moveHorizontal(60);
        wwave10.moveVertical(772);
        wwave10.makeVisible();
        
        wwave11 = new Circle ();
        wwave11.changeColor("black");
        wwave11.changeSize(50);
        wwave11.moveHorizontal(60);
        wwave11.moveVertical(820);
        wwave11.makeVisible();
        
        wwave12 = new Circle ();
        wwave12.changeColor("blue");
        wwave12.changeSize(45);
        wwave12.moveHorizontal(55);
        wwave12.moveVertical(822);
        wwave12.makeVisible();
        
        wwave13 = new Circle ();
        wwave13.changeColor("black");
        wwave13.changeSize(50);
        wwave13.moveHorizontal(50);
        wwave13.moveVertical(870);
        wwave13.makeVisible();
        
        wwave14 = new Circle ();
        wwave14.changeColor("blue");
        wwave14.changeSize(45);
        wwave14.moveHorizontal(60);
        wwave14.moveVertical(872);
        wwave14.makeVisible();
        
        wwave15 = new Circle ();
        wwave15.changeColor("black");
        wwave15.changeSize(50);
        wwave15.moveHorizontal(60);
        wwave15.moveVertical(920);
        wwave15.makeVisible();
        
        wwave16 = new Circle ();
        wwave16.changeColor("blue");
        wwave16.changeSize(45);
        wwave16.moveHorizontal(55);
        wwave16.moveVertical(922);
        wwave16.makeVisible();
        
        ewave = new Circle ();
        ewave.changeColor("black");
        ewave.changeSize(50);
        ewave.moveHorizontal(1835);
        ewave.moveVertical(570);
        ewave.makeVisible();

        ewave2 = new Circle ();
        ewave2.changeColor("blue");
        ewave2.changeSize(45);
        ewave2.moveHorizontal(1830);
        ewave2.moveVertical(572);
        ewave2.makeVisible();
        
        ewave3 = new Circle ();
        ewave3.changeColor("black");
        ewave3.changeSize(50);
        ewave3.moveHorizontal(1830);
        ewave3.moveVertical(620);
        ewave3.makeVisible();

    ewave4 = new Circle ();
        ewave4.changeColor("blue");
        ewave4.changeSize(45);
        ewave4.moveHorizontal(1840);
        ewave4.moveVertical(622);
        ewave4.makeVisible();

        ewave5 = new Circle ();
        ewave5.changeColor("black");
        ewave5.changeSize(50);
        ewave5.moveHorizontal(1835);
        ewave5.moveVertical(670);
        ewave5.makeVisible();

        ewave6 = new Circle ();
        ewave6.changeColor("blue");
        ewave6.changeSize(45);
        ewave6.moveHorizontal(1830);
        ewave6.moveVertical(672);
        ewave6.makeVisible();

    ewave7 = new Circle ();
        ewave7.changeColor("black");
        ewave7.changeSize(50);
        ewave7.moveHorizontal(1830);
        ewave7.moveVertical(720);
        ewave7.makeVisible();

    ewave8 = new Circle ();
        ewave8.changeColor("blue");
        ewave8.changeSize(45);
        ewave8.moveHorizontal(1840);
        ewave8.moveVertical(722);
        ewave8.makeVisible();

        ewave9 = new Circle ();
        ewave9.changeColor("black");
        ewave9.changeSize(50);
        ewave9.moveHorizontal(1835);
        ewave9.moveVertical(770);
        ewave9.makeVisible();

        ewave10 = new Circle ();
        ewave10.changeColor("blue");
        ewave10.changeSize(45);
        ewave10.moveHorizontal(1830);
        ewave10.moveVertical(772);
        ewave10.makeVisible();

    ewave11 = new Circle ();
        ewave11.changeColor("black");
        ewave11.changeSize(50);
        ewave11.moveHorizontal(1830);
        ewave11.moveVertical(820);
        ewave11.makeVisible();

    ewave12 = new Circle ();
        ewave12.changeColor("blue");
        ewave12.changeSize(45);
        ewave12.moveHorizontal(1840);
        ewave12.moveVertical(822);
        ewave12.makeVisible();

        ewave13 = new Circle ();
        ewave13.changeColor("black");
        ewave13.changeSize(50);
        ewave13.moveHorizontal(1835);
        ewave13.moveVertical(870);
        ewave13.makeVisible();

        ewave14 = new Circle ();
        ewave14.changeColor("blue");
        ewave14.changeSize(45);
        ewave14.moveHorizontal(1830);
        ewave14.moveVertical(872);
        ewave14.makeVisible();

    ewave15 = new Circle ();
        ewave15.changeColor("black");
        ewave15.changeSize(50);
        ewave15.moveHorizontal(1830);
        ewave15.moveVertical(920);
        ewave15.makeVisible();

    ewave16 = new Circle ();
        ewave16.changeColor("blue");
        ewave16.changeSize(45);
        ewave16.moveHorizontal(1840);
        ewave16.moveVertical(922);
        ewave16.makeVisible();
        
        eewave = new Circle ();
        eewave.changeColor("black");
        eewave.changeSize(50);
        eewave.moveHorizontal(1780);
        eewave.moveVertical(570);
        eewave.makeVisible();

        eewave2 = new Circle ();
        eewave2.changeColor("blue");
        eewave2.changeSize(45);
        eewave2.moveHorizontal(1775);
        eewave2.moveVertical(572);
        eewave2.makeVisible();
        
        eewave3 = new Circle ();
        eewave3.changeColor("black");
        eewave3.changeSize(50);
        eewave3.moveHorizontal(1775);
        eewave3.moveVertical(620);
        eewave3.makeVisible();

    eewave4 = new Circle ();
        eewave4.changeColor("blue");
        eewave4.changeSize(45);
        eewave4.moveHorizontal(1785);
        eewave4.moveVertical(622);
        eewave4.makeVisible();

        eewave5 = new Circle ();
        eewave5.changeColor("black");
        eewave5.changeSize(50);
        eewave5.moveHorizontal(1780);
        eewave5.moveVertical(670);
        eewave5.makeVisible();

        eewave6 = new Circle ();
        eewave6.changeColor("blue");
        eewave6.changeSize(45);
        eewave6.moveHorizontal(1775);
        eewave6.moveVertical(672);
        eewave6.makeVisible();

    eewave7 = new Circle ();
        eewave7.changeColor("black");
        eewave7.changeSize(50);
        eewave7.moveHorizontal(1775);
        eewave7.moveVertical(720);
        eewave7.makeVisible();

    eewave8 = new Circle ();
        eewave8.changeColor("blue");
        eewave8.changeSize(45);
        eewave8.moveHorizontal(1785);
        eewave8.moveVertical(722);
        eewave8.makeVisible();

        eewave9 = new Circle ();
        eewave9.changeColor("black");
        eewave9.changeSize(50);
        eewave9.moveHorizontal(1780);
        eewave9.moveVertical(770);
        eewave9.makeVisible();

        eewave10 = new Circle ();
        eewave10.changeColor("blue");
        eewave10.changeSize(45);
        eewave10.moveHorizontal(1775);
        eewave10.moveVertical(772);
        eewave10.makeVisible();

    eewave11 = new Circle ();
        eewave11.changeColor("black");
        eewave11.changeSize(50);
        eewave11.moveHorizontal(1775);
        eewave11.moveVertical(820);
        eewave11.makeVisible();

    eewave12 = new Circle ();
        eewave12.changeColor("blue");
        eewave12.changeSize(45);
        eewave12.moveHorizontal(1785);
        eewave12.moveVertical(822);
        eewave12.makeVisible();

        eewave13 = new Circle ();
        eewave13.changeColor("black");
        eewave13.changeSize(50);
        eewave13.moveHorizontal(1780);
        eewave13.moveVertical(870);
        eewave13.makeVisible();

        eewave14 = new Circle ();
        eewave14.changeColor("blue");
        eewave14.changeSize(45);
        eewave14.moveHorizontal(1775);
        eewave14.moveVertical(872);
        eewave14.makeVisible();

    eewave15 = new Circle ();
        eewave15.changeColor("black");
        eewave15.changeSize(50);
        eewave15.moveHorizontal(1775);
        eewave15.moveVertical(920);
        eewave15.makeVisible();

    eewave16 = new Circle ();
        eewave16.changeColor("blue");
        eewave16.changeSize(45);
        eewave16.moveHorizontal(1785);
        eewave16.moveVertical(922);
        eewave16.makeVisible();
        
        towerl = new Square ();
        towerl.changeColor("magenta");
        towerl.changeSize(400);
        towerl.moveHorizontal(465);
        towerl.moveVertical(220);
        towerl.makeVisible();
        
        ocd2 = new Square();
        ocd2.changeColor("blue");
        ocd2.changeSize(200);
        ocd2.moveHorizontal(465);
        ocd2.moveVertical(420);
        ocd2.makeVisible();
        
        ocd3 = new Square();
        ocd3.changeColor("blue");
        ocd3.changeSize(200);
        ocd3.moveHorizontal(465);
        ocd3.moveVertical(220);
        ocd3.makeVisible();
        
        towerr = new Square ();
        towerr.changeColor("magenta");
        towerr.changeSize(400);
        towerr.moveHorizontal(1035);
        towerr.moveVertical(220);
        towerr.makeVisible();
        
        ocd4 = new Square();
        ocd4.changeColor("black");
        ocd4.changeSize(200);
        ocd4.moveHorizontal(1235);
        ocd4.moveVertical(420);
        ocd4.makeVisible();
        
        ocd5 = new Square();
        ocd5.changeColor("black");
        ocd5.changeSize(200);
        ocd5.moveHorizontal(1235);
        ocd5.moveVertical(220);
        ocd5.makeVisible();
        
        mainshadow = new Square();
        mainshadow.changeColor("black");
        mainshadow.moveHorizontal(767);
        mainshadow.moveVertical(269);
        mainshadow.changeSize(356);
        mainshadow.makeVisible();
        
        mainhouse = new Square();
        mainhouse.changeColor("magenta");
        mainhouse.moveHorizontal(770);
        mainhouse.moveVertical(275);
        mainhouse.changeSize(350);
        mainhouse.makeVisible();
        
        topofdoor = new Circle();
        topofdoor.changeColor("black");
        topofdoor.changeSize(50);
        topofdoor.moveHorizontal(905);
        topofdoor.moveVertical(490);
        topofdoor.makeVisible();
        
        bottomofdoor = new Square();
        bottomofdoor.changeColor("black");
        bottomofdoor.changeSize(50);
        bottomofdoor.moveHorizontal(925);
        bottomofdoor.moveVertical(575);
        bottomofdoor.makeVisible();
        
        doorknob = new Circle();
        doorknob.changeColor("yellow");
        doorknob.changeSize(5);
        doorknob.moveHorizontal(910);
        doorknob.moveVertical(535);
        doorknob.makeVisible();
        
        roof1 = new Triangle();
        roof1.changeSize(150, 300);
        roof1.changeColor("red");
        roof1.moveHorizontal(1090);
        roof1.moveVertical(75);
        roof1.makeVisible();

        roof2 = new Triangle();
        roof2.changeSize(150, 300);
        roof2.changeColor("red");
        roof2.moveHorizontal(710);
        roof2.moveVertical(75);
        roof2.makeVisible();
        
        windowbox1 = new Square();
        windowbox1.changeSize(150);
        windowbox1.changeColor("black");
        windowbox1.moveHorizontal(800);
        windowbox1.moveVertical(350);
        windowbox1.makeVisible();
        
        windowbox2 = new Square();
        windowbox2.changeSize(150);
        windowbox2.changeColor("black");
        windowbox2.moveHorizontal(950);
        windowbox2.moveVertical(350);
        windowbox2.makeVisible();
        
        wincircle1 = new Circle();
        wincircle1.changeSize(100);
        wincircle1.changeColor("black");
        wincircle1.moveHorizontal(980);
        wincircle1.moveVertical(250);
        wincircle1.makeVisible();
        
        wincircle2 = new Circle();
        wincircle2.changeSize(100);
        wincircle2.changeColor("black");
        wincircle2.moveHorizontal(880);
        wincircle2.moveVertical(250);
        wincircle2.makeVisible();
        
        wincircle3 = new Circle();
        wincircle3.changeSize(100);
        wincircle3.changeColor("black");
        wincircle3.moveHorizontal(780);
        wincircle3.moveVertical(250);
        wincircle3.makeVisible();

        moon = new Circle();
        moon.changeColor("blue");
        moon.moveHorizontal(1550);
        moon.moveVertical(-10);
        moon.changeSize(200);
        moon.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.changeSize(200);
        sun.makeVisible();

   
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(mainhouse != null)   // only if it's painted already...
        {
            mainhouse.changeColor("black");
            mainhouse.changeColor("white");
            roof1.changeColor("black");
            moon.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(mainhouse != null)   // only if it's painted already...
        {
            mainhouse.changeColor("red");
            mainhouse.changeColor("black");
            roof1.changeColor("green");
            moon.changeColor("yellow");
        }
    }

}
