package ua.dementia.artsystem;

/**
 * Created by WEUA on 08.04.2015.
 */
public class Data2A36 extends baseData {

    public Data2A36() {

        tableCrosshair = new int[5][15];
        tableRazn = new double[5][17];
        tableWeight = new double[5][17];
        tableOver = new double[5][17];
        tableUstup = new double[5][17];

        setCrosshairTable();
        setRaznTable();
        setWeightTable();
        setOverTable();
        setUstupTable();
    }

    private void setCrosshairTable() {

        tableCrosshair[0][0]=3000;
        for (int i = 1; i < 15; i++)
            tableCrosshair[0][i]=tableCrosshair[0][i - 1]+1000;

        // заряд полный
        tableCrosshair[1][0]=19;
        tableCrosshair[1][1]=26;
        tableCrosshair[1][2]=33;
        tableCrosshair[1][3]=41;
        tableCrosshair[1][4]=50;
        tableCrosshair[1][5]=60;
        tableCrosshair[1][6]=71;
        tableCrosshair[1][7]=84;
        tableCrosshair[1][8]=97;
        tableCrosshair[1][9]=112;
        tableCrosshair[1][10]=129;
        tableCrosshair[1][11]=148;
        tableCrosshair[1][12]=169;
        tableCrosshair[1][13]=192;
        tableCrosshair[1][14]=218;

        // заряд уменьшенный
        tableCrosshair[2][0]=27;
        tableCrosshair[2][1]=38;
        tableCrosshair[2][2]=50;
        tableCrosshair[2][3]=64;
        tableCrosshair[2][4]=78;
        tableCrosshair[2][5]=95;
        tableCrosshair[2][6]=114;
        tableCrosshair[2][7]=136;
        tableCrosshair[2][8]=160;
        tableCrosshair[2][9]=188;
        tableCrosshair[2][10]=219;
        tableCrosshair[2][11]=253;
        tableCrosshair[2][12]=291;
        tableCrosshair[2][13]=333;
        tableCrosshair[2][14]=378;

        // заряд первый
        tableCrosshair[3][0]=36;
        tableCrosshair[3][1]=51;
        tableCrosshair[3][2]=68;
        tableCrosshair[3][3]=88;
        tableCrosshair[3][4]=109;
        tableCrosshair[3][5]=134;
        tableCrosshair[3][6]=163;
        tableCrosshair[3][7]=195;
        tableCrosshair[3][8]=231;
        tableCrosshair[3][9]=272;
        tableCrosshair[3][10]=317;
        tableCrosshair[3][11]=367;
        tableCrosshair[3][12]=422;
        tableCrosshair[3][13]=489;
        tableCrosshair[3][14]=570;

        // заряд второй
        tableCrosshair[4][0]=53;
        tableCrosshair[4][1]=76;
        tableCrosshair[4][2]=102;
        tableCrosshair[4][3]=132;
        tableCrosshair[4][4]=166;
        tableCrosshair[4][5]=205;
        tableCrosshair[4][6]=248;
        tableCrosshair[4][7]=296;
        tableCrosshair[4][8]=349;
        tableCrosshair[4][9]=411;
        tableCrosshair[4][10]=483;
        tableCrosshair[4][11]=578;
        tableCrosshair[4][12]=0;
        tableCrosshair[4][13]=0;
        tableCrosshair[4][14]=0;


        // fin
    }

    private void setRaznTable() {

        tableRazn[0][0]=50;
        tableRazn[0][14]=900;
        tableRazn[0][15]=950;
        tableRazn[0][16]=0;
        for (int i = 1; i < 14; i++)
            tableRazn[0][i]=tableRazn[0][i - 1]+50;

        // заряд полный
        // 50 100 150 200 250 300 350 400 450 500 550 600 650
        tableRazn[1][0]=1;
        tableRazn[1][1]=2;
        tableRazn[1][2]=4;
        tableRazn[1][3]=5;
        tableRazn[1][4]=6;
        tableRazn[1][5]=8;
        tableRazn[1][6]=9;
        tableRazn[1][7]=11;
        tableRazn[1][8]=12;
        tableRazn[1][9]=14;
        tableRazn[1][10]=17;
        tableRazn[1][11]=21;
        tableRazn[1][12]=27;
        tableRazn[1][13]=38;
        tableRazn[1][14]=0;
        tableRazn[1][15]=43;
        tableRazn[1][16]=0;

        //////////////////////CHTO ETO ^^^^///////////////////////////

        // заряд уменьшенный 
        tableRazn[2][0]=1;
        tableRazn[2][1]=2;
        tableRazn[2][2]=4;
        tableRazn[2][3]=5;
        tableRazn[2][4]=6;
        tableRazn[2][5]=7;
        tableRazn[2][6]=9;
        tableRazn[2][7]=10;
        tableRazn[2][8]=12;
        tableRazn[2][9]=14;
        tableRazn[2][10]=16;
        tableRazn[2][11]=21;
        tableRazn[2][12]=28;
        tableRazn[2][13]=46;
        tableRazn[2][14]=28;
        tableRazn[2][15]=19;
        tableRazn[2][16]=0;

        // заряд первый
        tableRazn[3][0]=1;
        tableRazn[3][1]=2;
        tableRazn[3][2]=3;
        tableRazn[3][3]=5;
        tableRazn[3][4]=6;
        tableRazn[3][5]=7;
        tableRazn[3][6]=8;
        tableRazn[3][7]=9;
        tableRazn[3][8]=11;
        tableRazn[3][9]=13;
        tableRazn[3][10]=16;
        tableRazn[3][11]=21;
        tableRazn[3][12]=30;
        tableRazn[3][13]=56;
        tableRazn[3][14]=21;
        tableRazn[3][15]=14;
        tableRazn[3][16]=0;

        // заряд второй
        tableRazn[4][0]=1;
        tableRazn[4][1]=2;
        tableRazn[4][2]=3;
        tableRazn[4][3]=4;
        tableRazn[4][4]=5;
        tableRazn[4][5]=6;
        tableRazn[4][6]=7;
        tableRazn[4][7]=8;
        tableRazn[4][8]=10;
        tableRazn[4][9]=12;
        tableRazn[4][10]=15;
        tableRazn[4][11]=20;
        tableRazn[4][12]=29;
        tableRazn[4][13]=72;
        tableRazn[4][14]=18;
        tableRazn[4][15]=13;
        tableRazn[4][16]=0;


        //fin

    }

    private void setWeightTable() {


        for (int i = 0; i < 17; i++)
            tableWeight[0][i]=tableRazn[0][i];

        /*
            tableWeight[0][0] = 50;
        tableWeight[0][13] = 850;
        for (int i = 1; i < 13; i++)
            tableWeight[0][i] = tableWeight[0][i - 1] + 50;
        for (int i = 14; i < 17; i++)
            tableWeight[0][i] = tableWeight[0][i - 1] + 50;
         */

        // заряд полный
        tableWeight[1][0]=0;
        tableWeight[1][1]=-0.2;
        tableWeight[1][2]=-0.5;
        tableWeight[1][3]=-0.9;
        tableWeight[1][4]=-1.4;
        tableWeight[1][5]=-1.8;
        tableWeight[1][6]=-2.2;
        tableWeight[1][7]=-2.7;
        tableWeight[1][8]=-3.2;
        tableWeight[1][9]=-3.8;
        tableWeight[1][10]=-4.6;
        tableWeight[1][11]=-5.5;
        tableWeight[1][12]=-7.2;
        tableWeight[1][13]=-9.7;
        tableWeight[1][14]=2.4;
        tableWeight[1][15]=8.2;
        tableWeight[1][16]=0;

        // заряд уменьшенный 
        tableWeight[2][0]=0.2;
        tableWeight[2][1]=0.2;
        tableWeight[2][2]=0.2;
        tableWeight[2][3]=0;
        tableWeight[2][4]=-0.1;
        tableWeight[2][5]=-0.2;
        tableWeight[2][6]=-0.4;
        tableWeight[2][7]=-0.5;
        tableWeight[2][8]=-0.7;
        tableWeight[2][9]=-0.9;
        tableWeight[2][10]=-1.1;
        tableWeight[2][11]=-1.5;
        tableWeight[2][12]=-2.2;
        tableWeight[2][13]=-4.2;
        tableWeight[2][14]=2.2;
        tableWeight[2][15]=1.3;
        tableWeight[2][16]=0;

        // заряд первый
        tableWeight[3][0]=0.2;
        tableWeight[3][1]=0.3;
        tableWeight[3][2]=0.3;
        tableWeight[3][3]=0.2;
        tableWeight[3][4]=0.1;
        tableWeight[3][5]=0;
        tableWeight[3][6]=-0.1;
        tableWeight[3][7]=-0.2;
        tableWeight[3][8]=-0.3;
        tableWeight[3][9]=-0.5;
        tableWeight[3][10]=-0.6;
        tableWeight[3][11]=-1;
        tableWeight[3][12]=-1.6;
        tableWeight[3][13]=-3;
        tableWeight[3][14]=1.2;
        tableWeight[3][15]=0.9;
        tableWeight[3][16]=0;

        // заряд второй
        tableWeight[4][0]=0.2;
        tableWeight[4][1]=0.3;
        tableWeight[4][2]=0.4;
        tableWeight[4][3]=0.4;
        tableWeight[4][4]=0.4;
        tableWeight[4][5]=0.4;
        tableWeight[4][6]=0.4;
        tableWeight[4][7]=0.3;
        tableWeight[4][8]=0.2;
        tableWeight[4][9]=0.1;
        tableWeight[4][10]=0;
        tableWeight[4][11]=-0.1;
        tableWeight[4][12]=-0.7;
        tableWeight[4][13]=-0.9;
        tableWeight[4][14]=0.4;
        tableWeight[4][15]=0.3;
        tableWeight[4][16]=0;


        //fin


    }


    // на превышение
    private void setOverTable() {
        for (int i = 0; i < 17; i++)
            tableOver[0][i]=tableRazn[0][i];

        // заряд полный
        tableOver[1][0]=1.4;
        tableOver[1][1]=0.9;
        tableOver[1][2]=0.7;
        tableOver[1][3]=0.6;
        tableOver[1][4]=0.5;
        tableOver[1][5]=0.5;
        tableOver[1][6]=0.5;
        tableOver[1][7]=0.4;
        tableOver[1][8]=0.4;
        tableOver[1][9]=0.4;
        tableOver[1][10]=0.4;
        tableOver[1][11]=0.4;
        tableOver[1][12]=0.5;
        tableOver[1][13]=0.6;
        tableOver[1][14]=0.9;
        tableOver[1][15]=0.3;
        tableOver[1][16]=0;

        // заряд уменьшенный 
        tableOver[2][0]=2;
        tableOver[2][1]=1.2;
        tableOver[2][2]=0.9;
        tableOver[2][3]=0.8;
        tableOver[2][4]=0.7;
        tableOver[2][5]=0.7;
        tableOver[2][6]=0.6;
        tableOver[2][7]=0.6;
        tableOver[2][8]=0.6;
        tableOver[2][9]=0.6;
        tableOver[2][10]=0.6;
        tableOver[2][11]=0.7;
        tableOver[2][12]=0.8;
        tableOver[2][13]=1.4;
        tableOver[2][14]=0.5;
        tableOver[2][15]=0.3;
        tableOver[2][16]=0;

        // заряд первый
        tableOver[3][0]=2.6;
        tableOver[3][1]=1.5;
        tableOver[3][2]=1.1;
        tableOver[3][3]=1;
        tableOver[3][4]=0.9;
        tableOver[3][5]=0.8;
        tableOver[3][6]=0.8;
        tableOver[3][7]=0.8;
        tableOver[3][8]=0.8;
        tableOver[3][9]=0.8;
        tableOver[3][10]=0.8;
        tableOver[3][11]=0.9;
        tableOver[3][12]=1.1;
        tableOver[3][13]=1.9;
        tableOver[3][14]=0.4;
        tableOver[3][15]=0.3;
        tableOver[3][16]=0;

        // заряд второй
        tableOver[4][0]=3.4;
        tableOver[4][1]=2.1;
        tableOver[4][2]=1.6;
        tableOver[4][3]=1.3;
        tableOver[4][4]=1.1;
        tableOver[4][5]=1;
        tableOver[4][6]=1;
        tableOver[4][7]=1;
        tableOver[4][8]=1;
        tableOver[4][9]=1;
        tableOver[4][10]=1.1;
        tableOver[4][11]=1.3;
        tableOver[4][12]=1.8;
        tableOver[4][13]=3.2;
        tableOver[4][14]=0.6;
        tableOver[4][15]=0.4;
        tableOver[4][16]=0;


    }

    private void setUstupTable() {
        for (int i = 0; i < 17; i++)
            tableUstup[0][i]=tableRazn[0][i];

        // заряд полный
        tableUstup[1][0]=0.1;
        tableUstup[1][1]=0.2;
        tableUstup[1][2]=0.2;
        tableUstup[1][3]=0.3;
        tableUstup[1][4]=0.3;
        tableUstup[1][5]=0.4;
        tableUstup[1][6]=0.4;
        tableUstup[1][7]=0.4;
        tableUstup[1][8]=0.5;
        tableUstup[1][9]=0.5;
        tableUstup[1][10]=0.6;
        tableUstup[1][11]=0.7;
        tableUstup[1][12]=0.8;
        tableUstup[1][13]=1.1;
        tableUstup[1][14]=2.4;
        tableUstup[1][15]=1;
        tableUstup[1][16]=0;

        // заряд уменьшенный 
        tableUstup[2][0]=0.1;
        tableUstup[2][1]=0.2;
        tableUstup[2][2]=0.3;
        tableUstup[2][3]=0.3;
        tableUstup[2][4]=0.4;
        tableUstup[2][5]=0.4;
        tableUstup[2][6]=0.5;
        tableUstup[2][7]=0.5;
        tableUstup[2][8]=0.6;
        tableUstup[2][9]=0.7;
        tableUstup[2][10]=0.8;
        tableUstup[2][11]=0.9;
        tableUstup[2][12]=1.2;
        tableUstup[2][13]=2.2;
        tableUstup[2][14]=1.2;
        tableUstup[2][15]=0.8;
        tableUstup[2][16]=0;

        // заряд первый
        tableUstup[3][0]=0.2;
        tableUstup[3][1]=0.2;
        tableUstup[3][2]=0.3;
        tableUstup[3][3]=0.4;
        tableUstup[3][4]=0.4;
        tableUstup[3][5]=0.5;
        tableUstup[3][6]=0.5;
        tableUstup[3][7]=0.6;
        tableUstup[3][8]=0.7;
        tableUstup[3][9]=0.8;
        tableUstup[3][10]=0.9;
        tableUstup[3][11]=1.1;
        tableUstup[3][12]=1.6;
        tableUstup[3][13]=3;
        tableUstup[3][14]=1.1;
        tableUstup[3][15]=0.7;
        tableUstup[3][16]=0;

        // заряд второй
        tableUstup[4][0]=0.2;
        tableUstup[4][1]=0.3;
        tableUstup[4][2]=0.4;
        tableUstup[4][3]=0.4;
        tableUstup[4][4]=0.5;
        tableUstup[4][5]=0.5;
        tableUstup[4][6]=0.6;
        tableUstup[4][7]=0.7;
        tableUstup[4][8]=0.8;
        tableUstup[4][9]=0.9;
        tableUstup[4][10]=1.1;
        tableUstup[4][11]=1.4;
        tableUstup[4][12]=2.1;
        tableUstup[4][13]=4.4;
        tableUstup[4][14]=1.1;
        tableUstup[4][15]=0.8;
        tableUstup[4][16]=0;


    }
}