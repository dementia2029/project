package ua.dementia.artsystem;

/**
 * Created by Shved Corporation on 05.04.2015.
 */
public class Data extends baseData {

    public Data() {
        tableCrosshair = new int[8][15];
        tableRazn = new double[8][17];
        tableWeight = new double[8][17];
        tableOver = new double[8][17];
        tableUstup = new double[8][17];

        setCrosshairTable();
        setRaznTable();
        setWeightTable();
        setOverTable();
        setUstupTable();
    }

    private void setCrosshairTable()
    {
        tableCrosshair[0][0] = 3000;
        for (int i = 1; i < 15; i++)
            tableCrosshair[0][i] = tableCrosshair[0][i - 1] + 1000;

        // заряд полный
        tableCrosshair[1][0] = 38; tableCrosshair[1][1] = 54; tableCrosshair[1][2] = 74;
        tableCrosshair[1][3] = 96; tableCrosshair[1][4] = 121; tableCrosshair[1][5] = 150;
        tableCrosshair[1][6] = 183; tableCrosshair[1][7] = 220; tableCrosshair[1][8] = 261;
        tableCrosshair[1][9] = 307; tableCrosshair[1][10] = 358; tableCrosshair[1][11] = 416;
        tableCrosshair[1][12] = 482; tableCrosshair[1][13] = 565; tableCrosshair[1][14] = 718;

        // заряд первый
        tableCrosshair[2][0] = 46; tableCrosshair[2][1] = 66; tableCrosshair[2][2] = 89;
        tableCrosshair[2][3] = 116; tableCrosshair[2][4] = 146; tableCrosshair[2][5] = 181;
        tableCrosshair[2][6] = 220; tableCrosshair[2][7] = 264; tableCrosshair[2][8] = 312;
        tableCrosshair[2][9] = 365; tableCrosshair[2][10] = 426; tableCrosshair[2][11] = 498;
        tableCrosshair[2][12] = 592; tableCrosshair[2][13] = 0; tableCrosshair[2][14] = 0;

        // заряд второй
        tableCrosshair[3][0] = 65; tableCrosshair[3][1] = 95; tableCrosshair[3][2] = 130;
        tableCrosshair[3][3] = 169; tableCrosshair[3][4] = 212; tableCrosshair[3][5] = 259;
        tableCrosshair[3][6] = 312; tableCrosshair[3][7] = 371; tableCrosshair[3][8] = 438;
        tableCrosshair[3][9] = 521; tableCrosshair[3][10] = 653; tableCrosshair[3][11] = 0;
        tableCrosshair[3][12] = 0; tableCrosshair[3][13] = 0; tableCrosshair[3][14] = 0;

        // заряд третий
        tableCrosshair[4][0] = 98; tableCrosshair[4][1] = 140; tableCrosshair[4][2] = 187;
        tableCrosshair[4][3] = 239; tableCrosshair[4][4] = 295; tableCrosshair[4][5] = 359;
        tableCrosshair[4][6] = 432; tableCrosshair[4][7] = 526; tableCrosshair[4][8] = 723;
        tableCrosshair[4][9] = 0; tableCrosshair[4][10] = 0; tableCrosshair[4][11] = 0;
        tableCrosshair[4][12] = 0; tableCrosshair[4][13] = 0; tableCrosshair[4][14] = 0;

        // заряд четвертый
        tableCrosshair[5][0] = 118; tableCrosshair[5][1] = 168; tableCrosshair[5][2] = 221;
        tableCrosshair[5][3] = 281; tableCrosshair[5][4] = 347; tableCrosshair[5][5] = 425;
        tableCrosshair[5][6] = 525; tableCrosshair[5][7] = 0; tableCrosshair[5][8] = 0;
        tableCrosshair[5][9] = 0; tableCrosshair[5][10] = 0; tableCrosshair[5][11] = 0;
        tableCrosshair[5][12] = 0; tableCrosshair[5][13] = 0; tableCrosshair[5][14] = 0;

        // заряд пятый
        tableCrosshair[6][0] = 143; tableCrosshair[6][1] = 200; tableCrosshair[6][2] = 263;
        tableCrosshair[6][3] = 333; tableCrosshair[6][4] = 418; tableCrosshair[6][5] = 531;
        tableCrosshair[6][6] = 0; tableCrosshair[6][7] = 0; tableCrosshair[6][8] = 0;
        tableCrosshair[6][9] = 0; tableCrosshair[6][10] = 0; tableCrosshair[6][11] = 0;
        tableCrosshair[6][12] = 0; tableCrosshair[6][13] = 0; tableCrosshair[6][14] = 0;

        // заряд шестой
        tableCrosshair[7][0] = 196; tableCrosshair[7][1] = 275; tableCrosshair[7][2] = 370;
        tableCrosshair[7][3] = 497; tableCrosshair[7][4] = 0; tableCrosshair[7][5] = 0;
        tableCrosshair[7][6] = 0; tableCrosshair[7][7] = 0; tableCrosshair[7][8] = 0;
        tableCrosshair[7][9] = 0; tableCrosshair[7][10] = 0; tableCrosshair[7][11] = 0;
        tableCrosshair[7][12] = 0; tableCrosshair[7][13] = 0; tableCrosshair[7][14] = 0;
    }

    private void setRaznTable() {
        tableRazn[0][0] = 50;
        tableRazn[0][13] = 850;
        for (int i = 1; i < 13; i++)
            tableRazn[0][i] = tableRazn[0][i - 1] + 50;
        for (int i = 14; i < 17; i++)
            tableRazn[0][i] = tableRazn[0][i - 1] + 50;

        // заряд полный
        tableRazn[1][0] = 1.1; tableRazn[1][1] = 2.3; tableRazn[1][2] = 3.4; tableRazn[1][3] = 4.5;
        tableRazn[1][4] = 5.6; tableRazn[1][5] = 6.6; tableRazn[1][6] = 7.6; tableRazn[1][7] = 8.6;
        tableRazn[1][8] = 10; tableRazn[1][9] = 12; tableRazn[1][10] = 15; tableRazn[1][11] = 20;
        tableRazn[1][12] = 26;
        tableRazn[1][13] = 33; tableRazn[1][14] = 19; tableRazn[1][15] = 14; tableRazn[1][16] = 12;

        // заряд первый
        tableRazn[2][0] = 1.1; tableRazn[2][1] = 2.2; tableRazn[2][2] = 3.3; tableRazn[2][3] = 4.3;
        tableRazn[2][4] = 5.2; tableRazn[2][5] = 6.2; tableRazn[2][6] = 7.2; tableRazn[2][7] = 8.3;
        tableRazn[2][8] = 9.7; tableRazn[2][9] = 12; tableRazn[2][10] = 14; tableRazn[2][11] = 19;
        tableRazn[2][12] = 27;
        tableRazn[2][13] = 29; tableRazn[2][14] = 19; tableRazn[2][15] = 13; tableRazn[2][16] = 11;

        // заряд второй
        tableRazn[3][0] = 1; tableRazn[3][1] = 2.1; tableRazn[3][2] = 3.1; tableRazn[3][3] = 3.9;
        tableRazn[3][4] = 4.6; tableRazn[3][5] = 5.4; tableRazn[3][6] = 6.3; tableRazn[3][7] = 7.4;
        tableRazn[3][8] = 8.9; tableRazn[3][9] = 11; tableRazn[3][10] = 13; tableRazn[3][11] = 17;
        tableRazn[3][12] = 27;
        tableRazn[3][13] = 26; tableRazn[3][14] = 18; tableRazn[3][15] = 12; tableRazn[3][16] = 10;

        // заряд третий
        tableRazn[4][0] = 0.9; tableRazn[4][1] = 1.9; tableRazn[4][2] = 2.7; tableRazn[4][3] = 3.3;
        tableRazn[4][4] = 3.9; tableRazn[4][5] = 4.5; tableRazn[4][6] = 5.4; tableRazn[4][7] = 6.5;
        tableRazn[4][8] = 7.9; tableRazn[4][9] = 9.7; tableRazn[4][10] = 12; tableRazn[4][11] = 18;
        tableRazn[4][12] = 27;
        tableRazn[4][13] = 24; tableRazn[4][14] = 16; tableRazn[4][15] = 12; tableRazn[4][16] = 8.9;

        // заряд четвертый
        tableRazn[5][0] = 1; tableRazn[5][1] = 1.8; tableRazn[5][2] = 2.5; tableRazn[5][3] = 3.1;
        tableRazn[5][4] = 3.7; tableRazn[5][5] = 4.3; tableRazn[5][6] = 5; tableRazn[5][7] = 6.1;
        tableRazn[5][8] = 7.6; tableRazn[5][9] = 9.5; tableRazn[5][10] = 12; tableRazn[5][11] = 17;
        tableRazn[5][12] = 28;
        tableRazn[5][13] = 23; tableRazn[5][14] = 16; tableRazn[5][15] = 12; tableRazn[5][16] = 9.7;

        // заряд пятый
        tableRazn[6][0] = 0.8; tableRazn[6][1] = 1.5; tableRazn[6][2] = 2.2; tableRazn[6][3] = 2.8;
        tableRazn[6][4] = 3.5; tableRazn[6][5] = 4.5; tableRazn[6][6] = 5.6; tableRazn[6][7] = 6.8;
        tableRazn[6][8] = 9.2; tableRazn[6][9] = 12; tableRazn[6][10] = 15; tableRazn[6][11] = 21;
        tableRazn[6][12] = 34;
        tableRazn[6][13] = 28; tableRazn[6][14] = 19; tableRazn[6][15] = 14; tableRazn[6][16] = 11;


        // заряд шестой
        tableRazn[7][0] = 1; tableRazn[7][1] = 2; tableRazn[7][2] = 3.1; tableRazn[7][3] = 4.2;
        tableRazn[7][4] = 5.5; tableRazn[7][5] = 6.9; tableRazn[7][6] = 8.6; tableRazn[7][7] = 11;
        tableRazn[7][8] = 13; tableRazn[7][9] = 17; tableRazn[7][10] = 22; tableRazn[7][11] = 31;
        tableRazn[7][12] = 54;
        tableRazn[7][13] = 38; tableRazn[7][14] = 25; tableRazn[7][15] = 18; tableRazn[7][16] = 16;
    }

    private void setWeightTable() {


        for (int i = 0; i < 17; i++)
            tableWeight[0][i] = tableRazn[0][i];

        // заряд полный
        tableWeight[1][0] = 0.1; tableWeight[1][1] = 0.1; tableWeight[1][2] = 0; tableWeight[1][3] = -0.2;
        tableWeight[1][4] = -0.4; tableWeight[1][5] = -0.6; tableWeight[1][6] = -0.8; tableWeight[1][7] = -1;
        tableWeight[1][8] = -1.3; tableWeight[1][9] = -1.6; tableWeight[1][10] = -2; tableWeight[1][11] = -2.8;
        tableWeight[1][12] = -4.1;
        tableWeight[1][13] = 5; tableWeight[1][14] = 3.2; tableWeight[1][15] = 2.2; tableWeight[1][16] = 1.6;

        // заряд первый
        tableWeight[2][0] = 0.1; tableWeight[2][1] = 0.1; tableWeight[2][2] = 0; tableWeight[2][3] = -0.1;
        tableWeight[2][4] = -0.3; tableWeight[2][5] = -0.5; tableWeight[2][6] = -0.6; tableWeight[2][7] = -0.8;
        tableWeight[2][8] = -1; tableWeight[2][9] = -1.3; tableWeight[2][10] = -1.8; tableWeight[2][11] = -2.6;
        tableWeight[2][12] = -3.7;
        tableWeight[2][13] = 4.4; tableWeight[2][14] = 2.9; tableWeight[2][15] = 2.1; tableWeight[2][16] = 1.6;

        // заряд второй
        tableWeight[3][0] = 0.2; tableWeight[3][1] = 0.4; tableWeight[3][2] = 0.5; tableWeight[3][3] = 0.5;
        tableWeight[3][4] = 0.5; tableWeight[3][5] = 0.5; tableWeight[3][6] = 0.5; tableWeight[3][7] = 0.5;
        tableWeight[3][8] = 0.5; tableWeight[3][9] = 0.5; tableWeight[3][10] = 0.5; tableWeight[3][11] = 0.5;
        tableWeight[3][12] = 0.6;
        tableWeight[3][13] = -0.4; tableWeight[3][14] = -0.3; tableWeight[3][15] = -0.2; tableWeight[3][16] = -0.2;

        // заряд третий
        tableWeight[4][0] = 0.2; tableWeight[4][1] = 0.4; tableWeight[4][2] = 0.5; tableWeight[4][3] = 0.5;
        tableWeight[4][4] = 0.6; tableWeight[4][5] = 0.6; tableWeight[4][6] = 0.7; tableWeight[4][7] = 0.7;
        tableWeight[4][8] = 0.8; tableWeight[4][9] = 0.9; tableWeight[4][10] = 1; tableWeight[4][11] = 1.3;
        tableWeight[4][12] = 1.9;
        tableWeight[4][13] = -1.5; tableWeight[4][14] = -1; tableWeight[4][15] = -0.7; tableWeight[4][16] = -0.6;

        // заряд четвертый
        tableWeight[5][0] = 0.3; tableWeight[5][1] = 0.4; tableWeight[5][2] = 0.5; tableWeight[5][3] = 0.6;
        tableWeight[5][4] = 0.6; tableWeight[5][5] = 0.7; tableWeight[5][6] = 0.8; tableWeight[5][7] = 0.8;
        tableWeight[5][8] = 0.9; tableWeight[5][9] = 1.1; tableWeight[5][10] = 1.4; tableWeight[5][11] = 1.9;
        tableWeight[5][12] = 2.6;
        tableWeight[5][13] = -2.5; tableWeight[5][14] = -1.7; tableWeight[5][15] = -1.3; tableWeight[5][16] = -1;

        // заряд пятый
        tableWeight[6][0] = 0.3; tableWeight[6][1] = 0.4; tableWeight[6][2] = 0.6; tableWeight[6][3] = 0.7;
        tableWeight[6][4] = 0.9; tableWeight[6][5] = 1; tableWeight[6][6] = 1.2; tableWeight[6][7] = 1.5;
        tableWeight[6][8] = 1.9; tableWeight[6][9] = 2.4; tableWeight[6][10] = 3; tableWeight[6][11] = 4;
        tableWeight[6][12] = 6.1;
        tableWeight[6][13] = -5.4; tableWeight[6][14] = -3.7; tableWeight[6][15] = -2.6; tableWeight[6][16] = -2;

        // заряд шестой
        tableWeight[7][0] = 0.3; tableWeight[7][1] = 0.6; tableWeight[7][2] = 0.9; tableWeight[7][3] = 1.2;
        tableWeight[7][4] = 1.5; tableWeight[7][5] = 1.8; tableWeight[7][6] = 2.3; tableWeight[7][7] = 2.9;
        tableWeight[7][8] = 3.5; tableWeight[7][9] = 4.4; tableWeight[7][10] = 5.9; tableWeight[7][11] = 7.9;
        tableWeight[7][12] = 14;
        tableWeight[7][13] = -9.3; tableWeight[7][14] = -6.2; tableWeight[7][15] = -4.6; tableWeight[7][16] = -3.4;


    }

    private void setOverTable()
    {

        for (int i = 0; i < 17; i++)
            tableOver[0][i] = tableRazn[0][i];

        // заряд полный
        tableOver[1][0] = 2.6; tableOver[1][1] = 1.5; tableOver[1][2] = 1.2; tableOver[1][3] = 1.1;
        tableOver[1][4] = 1; tableOver[1][5] = 0.9; tableOver[1][6] = 0.8; tableOver[1][7] = 0.8;
        tableOver[1][8] = 0.7; tableOver[1][9] = 0.8; tableOver[1][10] = 0.9; tableOver[1][11] = 1;
        tableOver[1][12] = 1.2;
        tableOver[1][13] = 0.8; tableOver[1][14] = 0.5; tableOver[1][15] = 0.3; tableOver[1][16] = 0.2;

        // заряд первый
        tableOver[2][0] = 3.1; tableOver[2][1] = 1.9; tableOver[2][2] = 1.5; tableOver[2][3] = 1.3;
        tableOver[2][4] = 1.1; tableOver[2][5] = 1; tableOver[2][6] = 0.9; tableOver[2][7] = 0.9;
        tableOver[2][8] = 0.9; tableOver[2][9] = 0.9; tableOver[2][10] = 1; tableOver[2][11] = 1.1;
        tableOver[2][12] = 1.3;
        tableOver[2][13] = 1; tableOver[2][14] = 0.6; tableOver[2][15] = 0.4; tableOver[2][16] = 0.3;

        // заряд второй
        tableOver[3][0] = 4; tableOver[3][1] = 2.4; tableOver[3][2] = 1.8; tableOver[3][3] = 1.5;
        tableOver[3][4] = 1.3; tableOver[3][5] = 1.2; tableOver[3][6] = 1.1; tableOver[3][7] = 1.1;
        tableOver[3][8] = 1.1; tableOver[3][9] = 1.1; tableOver[3][10] = 1.2; tableOver[3][11] = 1.4;
        tableOver[3][12] = 2;
        tableOver[3][13] = 1.2; tableOver[3][14] = 0.9; tableOver[3][15] = 0.7; tableOver[3][16] = 0.5;

        // заряд третий
        tableOver[4][0] = 5.8; tableOver[4][1] = 3.2; tableOver[4][2] = 2.2; tableOver[4][3] = 1.8;
        tableOver[4][4] = 1.6; tableOver[4][5] = 1.5; tableOver[4][6] = 1.4; tableOver[4][7] = 1.3;
        tableOver[4][8] = 1.4; tableOver[4][9] = 1.4; tableOver[4][10] = 1.5; tableOver[4][11] = 1.8;
        tableOver[4][12] = 2.5;
        tableOver[4][13] = 1.4; tableOver[4][14] = 1; tableOver[4][15] = 0.7; tableOver[4][16] = 0.5;

        // заряд четвертый
        tableOver[5][0] = 7; tableOver[5][1] = 3.9; tableOver[5][2] = 2.7; tableOver[5][3] = 2.2;
        tableOver[5][4] = 1.9; tableOver[5][5] = 1.7; tableOver[5][6] = 1.6; tableOver[5][7] = 1.5;
        tableOver[5][8] = 1.5; tableOver[5][9] = 1.6; tableOver[5][10] = 1.7; tableOver[5][11] = 2;
        tableOver[5][12] = 2.5;
        tableOver[5][13] = 1.5; tableOver[5][14] = 1; tableOver[5][15] = 0.7; tableOver[5][16] = 0.5;

        // заряд пятый
        tableOver[6][0] = 8.5; tableOver[6][1] = 4.6; tableOver[6][2] = 3.3; tableOver[6][3] = 2.5;
        tableOver[6][4] = 2.2; tableOver[6][5] = 2; tableOver[6][6] = 1.9; tableOver[6][7] = 1.7;
        tableOver[6][8] = 1.8; tableOver[6][9] = 1.9; tableOver[6][10] = 2.1; tableOver[6][11] = 2.5;
        tableOver[6][12] = 3.2;
        tableOver[6][13] = 1.8; tableOver[6][14] = 1.2; tableOver[6][15] = 0.8; tableOver[6][16] = 0.5;

        // заряд шестой
        tableOver[7][0] = 12; tableOver[7][1] = 6; tableOver[7][2] = 4.3; tableOver[7][3] = 3.4;
        tableOver[7][4] = 2.8; tableOver[7][5] = 2.5; tableOver[7][6] = 2.4; tableOver[7][7] = 2.4;
        tableOver[7][8] = 2.4; tableOver[7][9] = 2.5; tableOver[7][10] = 2.9; tableOver[7][11] = 3.5;
        tableOver[7][12] = 5.3;
        tableOver[7][13] = 2.4; tableOver[7][14] = 1.5; tableOver[7][15] = 1; tableOver[7][16] = 0.7;
    }

    private void setUstupTable()
    {

        for (int i = 0; i < 17; i++)
            tableUstup[0][i] = tableRazn[0][i];

        // заряд полный
        tableUstup[1][0] = 0.2; tableUstup[1][1] = 0.2; tableUstup[1][2] = 0.3; tableUstup[1][3] = 0.4;
        tableUstup[1][4] = 0.4; tableUstup[1][5] = 0.5; tableUstup[1][6] = 0.6; tableUstup[1][7] = 0.6;
        tableUstup[1][8] = 0.7; tableUstup[1][9] = 0.8; tableUstup[1][10] = 1; tableUstup[1][11] = 1.3;
        tableUstup[1][12] = 1.6;
        tableUstup[1][13] = 1.8; tableUstup[1][14] = 1.2; tableUstup[1][15] = 0.8; tableUstup[1][16] = 0.6;

        // заряд первый
        tableUstup[2][0] = 0.2; tableUstup[2][1] = 0.3; tableUstup[2][2] = 0.4; tableUstup[2][3] = 0.4;
        tableUstup[2][4] = 0.5; tableUstup[2][5] = 0.5; tableUstup[2][6] = 0.6; tableUstup[2][7] = 0.6;
        tableUstup[2][8] = 0.7; tableUstup[2][9] = 0.8; tableUstup[2][10] = 1; tableUstup[2][11] = 1.3;
        tableUstup[2][12] = 1.7;
        tableUstup[2][13] = 1.8; tableUstup[2][14] = 1.2; tableUstup[2][15] = 0.9; tableUstup[2][16] = 0.7;

        // заряд второй
        tableUstup[3][0] = 0.3; tableUstup[3][1] = 0.3; tableUstup[3][2] = 0.4; tableUstup[3][3] = 0.5;
        tableUstup[3][4] = 0.5; tableUstup[3][5] = 0.6; tableUstup[3][6] = 0.6; tableUstup[3][7] = 0.7;
        tableUstup[3][8] = 0.8; tableUstup[3][9] = 0.9; tableUstup[3][10] = 1.1; tableUstup[3][11] = 1.5;
        tableUstup[3][12] = 2;
        tableUstup[3][13] = 2; tableUstup[3][14] = 1.4; tableUstup[3][15] = 1; tableUstup[3][16] = 0.8;

        // заряд третий
        tableUstup[4][0] = 0.3; tableUstup[4][1] = 0.4; tableUstup[4][2] = 0.5; tableUstup[4][3] = 0.5;
        tableUstup[4][4] = 0.6; tableUstup[4][5] = 0.6; tableUstup[4][6] = 0.7; tableUstup[4][7] = 0.8;
        tableUstup[4][8] = 0.9; tableUstup[4][9] = 1; tableUstup[4][10] = 1.2; tableUstup[4][11] = 1.7;
        tableUstup[4][12] = 2.6;
        tableUstup[4][13] = 2.2; tableUstup[4][14] = 1.5; tableUstup[4][15] = 1.1; tableUstup[4][16] = 0.9;

        // заряд четвертый
        tableUstup[5][0] = 0.4; tableUstup[5][1] = 0.5; tableUstup[5][2] = 0.5; tableUstup[5][3] = 0.6;
        tableUstup[5][4] = 0.6; tableUstup[5][5] = 0.7; tableUstup[5][6] = 0.8; tableUstup[5][7] = 0.9;
        tableUstup[5][8] = 1; tableUstup[5][9] = 1.2; tableUstup[5][10] = 1.5; tableUstup[5][11] = 2;
        tableUstup[5][12] = 2.7;
        tableUstup[5][13] = 2.4; tableUstup[5][14] = 1.7; tableUstup[5][15] = 1.3; tableUstup[5][16] = 1;

        // заряд пятый
        tableUstup[6][0] = 0.5; tableUstup[6][1] = 0.5; tableUstup[6][2] = 0.6; tableUstup[6][3] = 0.6;
        tableUstup[6][4] = 0.7; tableUstup[6][5] = 0.8; tableUstup[6][6] = 0.8; tableUstup[6][7] = 0.9;
        tableUstup[6][8] = 1.1; tableUstup[6][9] = 1.3; tableUstup[6][10] = 1.6; tableUstup[6][11] = 2.1;
        tableUstup[6][12] = 3.2;
        tableUstup[6][13] = 2.8; tableUstup[6][14] = 2; tableUstup[6][15] = 1.5; tableUstup[6][16] = 1.1;

        // заряд шестой
        tableUstup[7][0] = 0.6; tableUstup[7][1] = 0.7; tableUstup[7][2] = 0.7; tableUstup[7][3] = 0.8;
        tableUstup[7][4] = 0.8; tableUstup[7][5] = 0.9; tableUstup[7][6] = 1; tableUstup[7][7] = 1.2;
        tableUstup[7][8] = 1.4; tableUstup[7][9] = 1.7; tableUstup[7][10] = 2.2; tableUstup[7][11] = 2.9;
        tableUstup[7][12] = 5;
        tableUstup[7][13] = 3.4; tableUstup[7][14] = 2.4; tableUstup[7][15] = 1.8; tableUstup[7][16] = 1.4;
    }
}