package ua.dementia.artsystem;

/**
 * Created by WEUA on 08.04.2015.
 */
public class DataD30 extends baseData{

    public DataD30() {

        tableCrosshair = new int[7][15];
        tableRazn = new double[7][17];
        tableWeight = new double[7][17];
        tableOver = new double[7][17];
        tableUstup = new double[7][17];

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
        tableCrosshair[1][0] = 33; tableCrosshair[1][1] = 51; tableCrosshair[1][2] = 73;
        tableCrosshair[1][3] = 99; tableCrosshair[1][4] = 130; tableCrosshair[1][5] = 167;
        tableCrosshair[1][6] = 208; tableCrosshair[1][7] = 254; tableCrosshair[1][8] = 306;
        tableCrosshair[1][9] = 365; tableCrosshair[1][10] = 434; tableCrosshair[1][11] = 517;
        tableCrosshair[1][12] = 641; tableCrosshair[1][13] = 0; tableCrosshair[1][14] = 0;

        // заряд уменьшенный
        tableCrosshair[2][0] = 53; tableCrosshair[2][1] = 82; tableCrosshair[2][2] = 117;
        tableCrosshair[2][3] = 156; tableCrosshair[2][4] = 201; tableCrosshair[2][5] = 252;
        tableCrosshair[2][6] = 308; tableCrosshair[2][7] = 372; tableCrosshair[2][8] = 447;
        tableCrosshair[2][9] = 546; tableCrosshair[2][10] = 0; tableCrosshair[2][11] = 0;
        tableCrosshair[2][12] = 0; tableCrosshair[2][13] = 0; tableCrosshair[2][14] = 0;

        // заряд первый
        tableCrosshair[3][0] = 75; tableCrosshair[3][1] = 112; tableCrosshair[3][2] = 156;
        tableCrosshair[3][3] = 204; tableCrosshair[3][4] = 258; tableCrosshair[3][5] = 318;
        tableCrosshair[3][6] = 386; tableCrosshair[3][7] = 468; tableCrosshair[3][8] = 582;
        tableCrosshair[3][9] = 0; tableCrosshair[3][10] = 0; tableCrosshair[3][11] = 0;
        tableCrosshair[3][12] = 0; tableCrosshair[3][13] = 0; tableCrosshair[3][14] = 0;

        // заряд второй
        tableCrosshair[4][0] = 108; tableCrosshair[4][1] = 155; tableCrosshair[4][2] = 208;
        tableCrosshair[4][3] = 266; tableCrosshair[4][4] = 332; tableCrosshair[4][5] = 409;
        tableCrosshair[4][6] = 504; tableCrosshair[4][7] = 685; tableCrosshair[4][8] = 0;
        tableCrosshair[4][9] = 0; tableCrosshair[4][10] = 0; tableCrosshair[4][11] = 0;
        tableCrosshair[4][12] = 0; tableCrosshair[4][13] = 0; tableCrosshair[4][14] = 0;

        // заряд третий
        tableCrosshair[5][0] = 148; tableCrosshair[5][1] = 207; tableCrosshair[5][2] = 273;
        tableCrosshair[5][3] = 349; tableCrosshair[5][4] = 443; tableCrosshair[5][5] = 586;
        tableCrosshair[5][6] = 0; tableCrosshair[5][7] = 0; tableCrosshair[5][8] = 0;
        tableCrosshair[5][9] = 0; tableCrosshair[5][10] = 0; tableCrosshair[5][11] = 0;
        tableCrosshair[5][12] = 0; tableCrosshair[5][13] = 0; tableCrosshair[5][14] = 0;

        // заряд четвертый
        tableCrosshair[6][0] = 212; tableCrosshair[6][1] = 299; tableCrosshair[6][2] = 407;
        tableCrosshair[6][3] = 569; tableCrosshair[6][4] = 0; tableCrosshair[6][5] = 0;
        tableCrosshair[6][6] = 0; tableCrosshair[6][7] = 0; tableCrosshair[6][8] = 0;
        tableCrosshair[6][9] = 0; tableCrosshair[6][10] = 0; tableCrosshair[6][11] = 0;
        tableCrosshair[6][12] = 0; tableCrosshair[6][13] = 0; tableCrosshair[6][14] = 0;



        // fin
    }

    private void setRaznTable() {
        //
        // tableRazn
        // tableRazn[0][i]][i={0][...][16} - значение прицелов (от 50 до 650) и (от 850 до 1000_ с шагом 50
        // tableRazn[j][i]][i={0][...][16}][j={1][...][8} - значение поправки на разнобой
        // где j = 1 - полный заряд][j = 8  - шестой заряд 
        //
        tableRazn[0][0] = 50;
        tableRazn[0][13] = 850;
        for (int i = 1; i < 13; i++)
            tableRazn[0][i] = tableRazn[0][i - 1] + 50;
        for (int i = 14; i < 17; i++)
            tableRazn[0][i] = tableRazn[0][i - 1] + 50;

        // заряд полный
        tableRazn[1][0] = 1; tableRazn[1][1] = 2; tableRazn[1][2] = 3; tableRazn[1][3] = 4;
        tableRazn[1][4] = 5; tableRazn[1][5] = 6; tableRazn[1][6] = 7; tableRazn[1][7] = 8;
        tableRazn[1][8] = 9; tableRazn[1][9] = 11; tableRazn[1][10] = 14; tableRazn[1][11] = 20;
        tableRazn[1][12] = 28;
        tableRazn[1][13] = 24; tableRazn[1][14] = 15; tableRazn[1][15] = 10; tableRazn[1][16] = 8;

        // заряд уменьшенный 
        tableRazn[2][0] = 1; tableRazn[2][1] = 2; tableRazn[2][2] = 3; tableRazn[2][3] = 4;
        tableRazn[2][4] = 4; tableRazn[2][5] = 5; tableRazn[2][6] = 6; tableRazn[2][7] = 7;
        tableRazn[2][8] = 8; tableRazn[2][9] = 10; tableRazn[2][10] = 12; tableRazn[2][11] = 18;
        tableRazn[2][12] = 30;
        tableRazn[2][13] = 22; tableRazn[2][14] = 13; tableRazn[2][15] = 10; tableRazn[2][16] = 8;

        // заряд первый
        tableRazn[3][0] = 1; tableRazn[3][1] = 2; tableRazn[3][2] = 3; tableRazn[3][3] = 3;
        tableRazn[3][4] = 4; tableRazn[3][5] = 5; tableRazn[3][6] = 6; tableRazn[3][7] = 7;
        tableRazn[3][8] = 7; tableRazn[3][9] = 10; tableRazn[3][10] = 12; tableRazn[3][11] = 17;
        tableRazn[3][12] = 22;
        tableRazn[3][13] = 24; tableRazn[3][14] = 14; tableRazn[3][15] = 10; tableRazn[3][16] = 8;

        // заряд второй
        tableRazn[4][0] = 1; tableRazn[4][1] = 2; tableRazn[4][2] = 2; tableRazn[4][3] = 3;
        tableRazn[4][4] = 4; tableRazn[4][5] = 4; tableRazn[4][6] = 5; tableRazn[4][7] = 6;
        tableRazn[4][8] = 7; tableRazn[4][9] = 9; tableRazn[4][10] = 12; tableRazn[4][11] = 16;
        tableRazn[4][12] = 33;
        tableRazn[4][13] = 21; tableRazn[4][14] = 14; tableRazn[4][15] = 10; tableRazn[4][16] = 8;

        // заряд третий
        tableRazn[5][0] = 1; tableRazn[5][1] = 2; tableRazn[5][2] = 2; tableRazn[5][3] = 3;
        tableRazn[5][4] = 4; tableRazn[5][5] = 5; tableRazn[5][6] = 6; tableRazn[5][7] = 7;
        tableRazn[5][8] = 9; tableRazn[5][9] = 12; tableRazn[5][10] = 16; tableRazn[5][11] = 23;
        tableRazn[5][12] = 55;
        tableRazn[5][13] = 26; tableRazn[5][14] = 18; tableRazn[5][15] = 13; tableRazn[5][16] = 10;

        // заряд четвертый
        tableRazn[6][0] = 1; tableRazn[6][1] = 2; tableRazn[6][2] = 3; tableRazn[6][3] = 4;
        tableRazn[6][4] = 5; tableRazn[6][5] = 7; tableRazn[6][6] = 8; tableRazn[6][7] = 10;
        tableRazn[6][8] = 12; tableRazn[6][9] = 15; tableRazn[6][10] = 20; tableRazn[6][11] = 29;
        tableRazn[6][12] = 64;
        tableRazn[6][13] = 32; tableRazn[6][14] = 25; tableRazn[6][15] = 17; tableRazn[6][16] = 13;


        //fin

    }

    private void setWeightTable() {


        for (int i = 0; i < 17; i++)
            tableWeight[0][i] = tableRazn[0][i];

        // заряд полный
        tableWeight[1][0] = 0.1; tableWeight[1][1] = 0.1; tableWeight[1][2] = -0.1; tableWeight[1][3] = -0.3;
        tableWeight[1][4] = -0.4; tableWeight[1][5] = -0.6; tableWeight[1][6] = -0.8; tableWeight[1][7] = -1.1;
        tableWeight[1][8] = -1.5; tableWeight[1][9] = -2; tableWeight[1][10] = -2.6; tableWeight[1][11] = -3.3;
        tableWeight[1][12] = -4.9;
        tableWeight[1][13] = 4; tableWeight[1][14] = 2.9; tableWeight[1][15] = 2.1; tableWeight[1][16] = 1.6;

        // заряд уменьшенный 
        tableWeight[2][0] = 0.2; tableWeight[2][1] = 0.2; tableWeight[2][2] = 0.2; tableWeight[2][3] = 0.1;
        tableWeight[2][4] = 0.1; tableWeight[2][5] = 0; tableWeight[2][6] = -0.1; tableWeight[2][7] = -0.3;
        tableWeight[2][8] = -0.5; tableWeight[2][9] = -0.6; tableWeight[2][10] = -0.9; tableWeight[2][11] = -1.4;
        tableWeight[2][12] = -2.3;
        tableWeight[2][13] = 1.8; tableWeight[2][14] = 1.4; tableWeight[2][15] = 1.1; tableWeight[2][16] = 0.9;

        // заряд первый
        tableWeight[3][0] = 0.2; tableWeight[3][1] = 0.3; tableWeight[3][2] = 0.3; tableWeight[3][3] = 0.2;
        tableWeight[3][4] = 0.2; tableWeight[3][5] = 0.2; tableWeight[3][6] = 0.1; tableWeight[3][7] = 0;
        tableWeight[3][8] = 0; tableWeight[3][9] = -0.2; tableWeight[3][10] = -0.4; tableWeight[3][11] = -0.7;
        tableWeight[3][12] = -1.2;
        tableWeight[3][13] = 1.1; tableWeight[3][14] = 0.8; tableWeight[3][15] = 0.6; tableWeight[3][16] = 0.5;

        // заряд второй
        tableWeight[4][0] = 0.2; tableWeight[4][1] = 0.3; tableWeight[4][2] = 0.4; tableWeight[4][3] = 0.4;
        tableWeight[4][4] = 0.4; tableWeight[4][5] = 0.4; tableWeight[4][6] = 0.3; tableWeight[4][7] = 0.3;
        tableWeight[4][8] = 0.3; tableWeight[4][9] = 0.3; tableWeight[4][10] = 0.3; tableWeight[4][11] = 0.2;
        tableWeight[4][12] = 0;
        tableWeight[4][13] = 0; tableWeight[4][14] = 0; tableWeight[4][15] = 0; tableWeight[4][16] = 0;

        // заряд третий
        tableWeight[5][0] = 0.2; tableWeight[5][1] = 0.4; tableWeight[5][2] = 0.5; tableWeight[5][3] = 0.6;
        tableWeight[5][4] = 0.7; tableWeight[5][5] = 0.8; tableWeight[5][6] = 0.9; tableWeight[5][7] = 1.1;
        tableWeight[5][8] = 1.4; tableWeight[5][9] = 1.7; tableWeight[5][10] = 2.3; tableWeight[5][11] = 3.4;
        tableWeight[5][12] = 5;
        tableWeight[5][13] = -2.6; tableWeight[5][14] = -1.8; tableWeight[5][15] = -1.4; tableWeight[5][16] = -1.1;

        // заряд четвертый
        tableWeight[6][0] = 0.3; tableWeight[6][1] = 0.5; tableWeight[6][2] = 0.8; tableWeight[6][3] = 1.1;
        tableWeight[6][4] = 1.4; tableWeight[6][5] = 1.7; tableWeight[6][6] = 2; tableWeight[6][7] = 2.5;
        tableWeight[6][8] = 3.1; tableWeight[6][9] = 3.9; tableWeight[6][10] = 5.5; tableWeight[6][11] = 7.4;
        tableWeight[6][12] = 11.5;
        tableWeight[6][13] = -6.1; tableWeight[6][14] = -4.8; tableWeight[6][15] = -3.7; tableWeight[6][16] = -2.8;


        //fin


    }

    private void setOverTable()
    {
        for (int i = 0; i < 17; i++)
            tableOver[0][i] = tableRazn[0][i];

        // заряд полный
        tableOver[1][0] = 2.4; tableOver[1][1] = 1.6; tableOver[1][2] = 1.3; tableOver[1][3] = 1.1;
        tableOver[1][4] = 1; tableOver[1][5] = 0.9; tableOver[1][6] = 0.8; tableOver[1][7] = 0.8;
        tableOver[1][8] = 0.8; tableOver[1][9] = 0.9; tableOver[1][10] = 1; tableOver[1][11] = 1.1;
        tableOver[1][12] = 1.3;
        tableOver[1][13] = 0.7; tableOver[1][14] = 0.4; tableOver[1][15] = 0.3; tableOver[1][16] = 0.2;

        // заряд уменьшенный
        tableOver[2][0] = 3.2; tableOver[2][1] = 2.1; tableOver[2][2] = 1.6; tableOver[2][3] = 1.3;
        tableOver[2][4] = 1.1; tableOver[2][5] = 1; tableOver[2][6] = 1; tableOver[2][7] = 1;
        tableOver[2][8] = 1; tableOver[2][9] = 1.1; tableOver[2][10] = 1.2; tableOver[2][11] = 1.3;
        tableOver[2][12] = 1.7;
        tableOver[2][13] = 0.8; tableOver[2][14] = 0.6; tableOver[2][15] = 0.4; tableOver[2][16] = 0.3;

        // заряд первый
        tableOver[3][0] = 4.5; tableOver[3][1] = 2.6; tableOver[3][2] = 1.9; tableOver[3][3] = 1.6;
        tableOver[3][4] = 1.4; tableOver[3][5] = 1.3; tableOver[3][6] = 1.2; tableOver[3][7] = 1.2;
        tableOver[3][8] = 1.2; tableOver[3][9] = 1.2; tableOver[3][10] = 1.3; tableOver[3][11] = 1.5;
        tableOver[3][12] = 2;
        tableOver[3][13] = 1; tableOver[3][14] = 0.7; tableOver[3][15] = 0.5; tableOver[3][16] = 0.4;

        // заряд второй
        tableOver[4][0] = 6; tableOver[4][1] = 3.2; tableOver[4][2] = 2.4; tableOver[4][3] = 2;
        tableOver[4][4] = 1.8; tableOver[4][5] = 1.6; tableOver[4][6] = 1.5; tableOver[4][7] = 1.4;
        tableOver[4][8] = 1.4; tableOver[4][9] = 1.4; tableOver[4][10] = 1.6; tableOver[4][11] = 1.8;
        tableOver[4][12] = 2.4;
        tableOver[4][13] = 1.2; tableOver[4][14] = 0.8; tableOver[4][15] = 0.6; tableOver[4][16] = 0.4;

        // заряд третий
        tableOver[5][0] = 9.1; tableOver[5][1] = 4.5; tableOver[5][2] = 3.1; tableOver[5][3] = 2.6;
        tableOver[5][4] = 2.3; tableOver[5][5] = 2; tableOver[5][6] = 1.8; tableOver[5][7] = 1.8;
        tableOver[5][8] = 1.8; tableOver[5][9] = 2; tableOver[5][10] = 2.4; tableOver[5][11] = 2.9;
        tableOver[5][12] = 3.7;
        tableOver[5][13] = 1.4; tableOver[5][14] = 1; tableOver[5][15] = 0.7; tableOver[5][16] = 0.5;

        // заряд четвертый
        tableOver[6][0] = 12.5; tableOver[6][1] = 6.3; tableOver[6][2] = 4.8; tableOver[6][3] = 3.6;
        tableOver[6][4] = 3.1; tableOver[6][5] = 2.8; tableOver[6][6] = 2.5; tableOver[6][7] = 2.5;
        tableOver[6][8] = 2.6; tableOver[6][9] = 2.8; tableOver[6][10] = 3.3; tableOver[6][11] = 3.8;
        tableOver[6][12] = 5.3;
        tableOver[6][13] = 1.9; tableOver[6][14] = 1.4; tableOver[6][15] = 1; tableOver[6][16] = 0.7;

    }

    private void setUstupTable()
    {
        for (int i = 0; i < 17; i++)
            tableUstup[0][i] = tableRazn[0][i];

        // заряд полный
        tableUstup[1][0] = 0.2; tableUstup[1][1] = 0.3; tableUstup[1][2] = 0.4; tableUstup[1][3] = 0.4;
        tableUstup[1][4] = 0.5; tableUstup[1][5] = 0.6; tableUstup[1][6] = 0.6; tableUstup[1][7] = 0.7;
        tableUstup[1][8] = 0.8; tableUstup[1][9] = 0.9; tableUstup[1][10] = 1.1; tableUstup[1][11] = 1.3;
        tableUstup[1][12] = 1.9;
        tableUstup[1][13] = 1.4; tableUstup[1][14] = 1; tableUstup[1][15] = 1.8; tableUstup[1][16] = 0.6;

        // заряд уменьшенный
        tableUstup[2][0] = 0.3; tableUstup[2][1] = 0.3; tableUstup[2][2] = 0.4; tableUstup[2][3] = 0.5;
        tableUstup[2][4] = 0.6; tableUstup[2][5] = 0.6; tableUstup[2][6] = 0.7; tableUstup[2][7] = 0.8;
        tableUstup[2][8] = 0.9; tableUstup[2][9] = 1; tableUstup[2][10] = 1.2; tableUstup[2][11] = 1.5;
        tableUstup[2][12] = 2.2;
        tableUstup[2][13] = 1.5; tableUstup[2][14] = 1.2; tableUstup[2][15] = 0.9; tableUstup[2][16] = 0.7;

        // заряд первый
        tableUstup[3][0] = 0.3; tableUstup[3][1] = 0.4; tableUstup[3][2] = 0.5; tableUstup[3][3] = 0.5;
        tableUstup[3][4] = 0.6; tableUstup[3][5] = 0.6; tableUstup[3][6] = 0.7; tableUstup[3][7] = 0.8;
        tableUstup[3][8] = 0.9; tableUstup[3][9] = 1.1; tableUstup[3][10] = 1.3; tableUstup[3][11] = 1.7;
        tableUstup[3][12] = 2.5;
        tableUstup[3][13] = 1.7; tableUstup[3][14] = 1.3; tableUstup[3][15] = 1; tableUstup[3][16] = 0.8;

        // заряд второй
        tableUstup[4][0] = 0.4; tableUstup[4][1] = 0.5; tableUstup[4][2] = 0.6; tableUstup[4][3] = 0.6;
        tableUstup[4][4] = 0.6; tableUstup[4][5] = 0.7; tableUstup[4][6] = 0.8; tableUstup[4][7] = 0.9;
        tableUstup[4][8] = 1; tableUstup[4][9] = 1.2; tableUstup[4][10] = 1.5; tableUstup[4][11] = 2;
        tableUstup[4][12] = 2.9;
        tableUstup[4][13] = 1.9; tableUstup[4][14] = 1.5; tableUstup[4][15] = 1.1; tableUstup[4][16] = 0.9;

        // заряд третий
        tableUstup[5][0] = 0.5; tableUstup[5][1] = 0.6; tableUstup[5][2] = 0.7; tableUstup[5][3] = 0.7;
        tableUstup[5][4] = 0.7; tableUstup[5][5] = 0.8; tableUstup[5][6] = 0.9; tableUstup[5][7] = 1;
        tableUstup[5][8] = 1.2; tableUstup[5][9] = 1.4; tableUstup[5][10] = 1.9; tableUstup[5][11] = 2.6;
        tableUstup[5][12] = 3.8;
        tableUstup[5][13] = 2.2; tableUstup[5][14] = 1.7; tableUstup[5][15] = 1.3; tableUstup[5][16] = 1.1;

        // заряд четвертый
        tableUstup[6][0] = 0.6; tableUstup[6][1] = 0.7; tableUstup[6][2] = 0.8; tableUstup[6][3] = 0.8;
        tableUstup[6][4] = 0.9; tableUstup[6][5] = 1; tableUstup[6][6] = 1.1; tableUstup[6][7] = 1.2;
        tableUstup[6][8] = 1.4; tableUstup[6][9] = 1.8; tableUstup[6][10] = 2.5; tableUstup[6][11] = 3.2;
        tableUstup[6][12] = 5;
        tableUstup[6][13] = 2.8; tableUstup[6][14] = 2.2; tableUstup[6][15] = 1.8; tableUstup[6][16] = 1.4;
    }

}
