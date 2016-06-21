package ua.dementia.artsystem;

/**
 * Created by WEUA on 08.04.2015.
 */
public class Data2A65 extends baseData {
    public Data2A65() {

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

    private void setCrosshairTable() {
        //
        // tableCrosshair
        // tableCrosshair[0][i]][i={0][...][14} - дальности от 3000 до 17000
        // tableCrosshair[j][i]][i={0][...][14}][j={1][...][8} - значение прицелов
        // где j = 1 - полный заряд][j = 8  - шестой заряд
        //
        tableCrosshair[0][0]=3000;
        for (int i = 1; i < 15; i++)
            tableCrosshair[0][i]=tableCrosshair[0][i - 1]+1000;

        // заряд дальнобойный
        tableCrosshair[1][0]=25;
        tableCrosshair[1][1]=34;
        tableCrosshair[1][2]=45;
        tableCrosshair[1][3]=56;
        tableCrosshair[1][4]=68;
        tableCrosshair[1][5]=81;
        tableCrosshair[1][6]=95;
        tableCrosshair[1][7]=112;
        tableCrosshair[1][8]=130;
        tableCrosshair[1][9]=150;
        tableCrosshair[1][10]=172;
        tableCrosshair[1][11]=197;
        tableCrosshair[1][12]=224;
        tableCrosshair[1][13]=255;
        tableCrosshair[1][14]=288;

        // заряд полный
        tableCrosshair[2][0]=37;
        tableCrosshair[2][1]=51;
        tableCrosshair[2][2]=66;
        tableCrosshair[2][3]=83;
        tableCrosshair[2][4]=103;
        tableCrosshair[2][5]=121;
        tableCrosshair[2][6]=148;
        tableCrosshair[2][7]=176;
        tableCrosshair[2][8]=207;
        tableCrosshair[2][9]=242;
        tableCrosshair[2][10]=281;
        tableCrosshair[2][11]=325;
        tableCrosshair[2][12]=373;
        tableCrosshair[2][13]=428;
        tableCrosshair[2][14]=489;

        // заряд второй
        tableCrosshair[3][0]=62;
        tableCrosshair[3][1]=88;
        tableCrosshair[3][2]=117;
        tableCrosshair[3][3]=149;
        tableCrosshair[3][4]=186;
        tableCrosshair[3][5]=227;
        tableCrosshair[3][6]=272;
        tableCrosshair[3][7]=322;
        tableCrosshair[3][8]=378;
        tableCrosshair[3][9]=442;
        tableCrosshair[3][10]=519;
        tableCrosshair[3][11]=633;
        tableCrosshair[3][12]=0;
        tableCrosshair[3][13]=0;
        tableCrosshair[3][14]=0;

        // заряд третий
        tableCrosshair[4][0]=89;
        tableCrosshair[4][1]=126;
        tableCrosshair[4][2]=167;
        tableCrosshair[4][3]=213;
        tableCrosshair[4][4]=263;
        tableCrosshair[4][5]=318;
        tableCrosshair[4][6]=381;
        tableCrosshair[4][7]=434;
        tableCrosshair[4][8]=549;
        tableCrosshair[4][9]=0;
        tableCrosshair[4][10]=0;
        tableCrosshair[4][11]=0;
        tableCrosshair[4][12]=0;
        tableCrosshair[4][13]=0;
        tableCrosshair[4][14]=0;

        // заряд четвертый
        tableCrosshair[5][0]=107;
        tableCrosshair[5][1]=151;
        tableCrosshair[5][2]=199;
        tableCrosshair[5][3]=251;
        tableCrosshair[5][4]=309;
        tableCrosshair[5][5]=375;
        tableCrosshair[5][6]=452;
        tableCrosshair[5][7]=557;
        tableCrosshair[5][8]=0;
        tableCrosshair[5][9]=0;
        tableCrosshair[5][10]=0;
        tableCrosshair[5][11]=0;
        tableCrosshair[5][12]=0;
        tableCrosshair[5][13]=0;
        tableCrosshair[5][14]=0;

        // заряд пятый
        tableCrosshair[6][0]=133;
        tableCrosshair[6][1]=185;
        tableCrosshair[6][2]=242;
        tableCrosshair[6][3]=304;
        tableCrosshair[6][4]=377;
        tableCrosshair[6][5]=465;
        tableCrosshair[6][6]=599;
        tableCrosshair[6][7]=0;
        tableCrosshair[6][8]=0;
        tableCrosshair[6][9]=0;
        tableCrosshair[6][10]=0;
        tableCrosshair[6][11]=0;
        tableCrosshair[6][12]=0;
        tableCrosshair[6][13]=0;
        tableCrosshair[6][14]=0;


        // fin
    }

    private void setRaznTable() {
        //
        // tableRazn
        // tableRazn[0][i]][i={0][...][16} - значение прицелов (от 50 до 650) и (от 850 до 1000_ с шагом 50
        // tableRazn[j][i]][i={0][...][16}][j={1][...][8} - значение поправки на разнобой
        // где j = 1 - полный заряд][j = 8  - шестой заряд
        //
        tableRazn[0][0]=50;
        tableRazn[0][13]=850;
        for (int i = 1; i < 13; i++)
            tableRazn[0][i]=tableRazn[0][i - 1]+50;
        for (int i = 14; i < 17; i++)
            tableRazn[0][i]=tableRazn[0][i - 1]+50;

        // заряд дальнобойный
        // 50 100 150 200 250 300 350 400 450 500 550 600 650
        tableRazn[1][0]=1.1;
        tableRazn[1][1]=2.3;
        tableRazn[1][2]=3.7;
        tableRazn[1][3]=5.2;
        tableRazn[1][4]=6.7;
        tableRazn[1][5]=8.2;
        tableRazn[1][6]=9.7;
        tableRazn[1][7]=11;
        tableRazn[1][8]=13;
        tableRazn[1][9]=16;
        tableRazn[1][10]=19;
        tableRazn[1][11]=23;
        tableRazn[1][12]=30;
        tableRazn[1][13]=68;
        tableRazn[1][14]=38;
        tableRazn[1][15]=24;
        tableRazn[1][16]=17;

        // заряд полный
        tableRazn[2][0]=1.1;
        tableRazn[2][1]=2.3;
        tableRazn[2][2]=3.6;
        tableRazn[2][3]=5.1;
        tableRazn[2][4]=6.5;
        tableRazn[2][5]=7.8;
        tableRazn[2][6]=9.1;
        tableRazn[2][7]=10;
        tableRazn[2][8]=12;
        tableRazn[2][9]=14;
        tableRazn[2][10]=17;
        tableRazn[2][11]=21;
        tableRazn[2][12]=28;
        tableRazn[2][13]=41;
        tableRazn[2][14]=23;
        tableRazn[2][15]=16;
        tableRazn[2][16]=12;

        // заряд второй
        tableRazn[3][0]=1.1;
        tableRazn[3][1]=2.2;
        tableRazn[3][2]=3.4;
        tableRazn[3][3]=4.5;
        tableRazn[3][4]=5.4;
        tableRazn[3][5]=6.4;
        tableRazn[3][6]=7.4;
        tableRazn[3][7]=8.5;
        tableRazn[3][8]=10;
        tableRazn[3][9]=12;
        tableRazn[3][10]=15;
        tableRazn[3][11]=19;
        tableRazn[3][12]=27;
        tableRazn[3][13]=26;
        tableRazn[3][14]=17;
        tableRazn[3][15]=13;
        tableRazn[3][16]=10;

        // заряд третий
        tableRazn[4][0]=1.1;
        tableRazn[4][1]=2.1;
        tableRazn[4][2]=3.1;
        tableRazn[4][3]=3.9;
        tableRazn[4][4]=4.7;
        tableRazn[4][5]=5.5;
        tableRazn[4][6]=6.5;
        tableRazn[4][7]=7.6;
        tableRazn[4][8]=9.1;
        tableRazn[4][9]=11;
        tableRazn[4][10]=14;
        tableRazn[4][11]=19;
        tableRazn[4][12]=27;
        tableRazn[4][13]=26;
        tableRazn[4][14]=17;
        tableRazn[4][15]=13;
        tableRazn[4][16]=10;

        // заряд четвертый
        tableRazn[5][0]=1;
        tableRazn[5][1]=2;
        tableRazn[5][2]=2.8;
        tableRazn[5][3]=3.6;
        tableRazn[5][4]=4.3;
        tableRazn[5][5]=5.1;
        tableRazn[5][6]=6.1;
        tableRazn[5][7]=7.2;
        tableRazn[5][8]=8.8;
        tableRazn[5][9]=11;
        tableRazn[5][10]=14;
        tableRazn[5][11]=19;
        tableRazn[5][12]=27;
        tableRazn[5][13]=26;
        tableRazn[5][14]=17;
        tableRazn[5][15]=13;
        tableRazn[5][16]=10;

        // заряд пятый
        tableRazn[6][0]=1;
        tableRazn[6][1]=1.8;
        tableRazn[6][2]=2.5;
        tableRazn[6][3]=3.2;
        tableRazn[6][4]=4.1;
        tableRazn[6][5]=5.1;
        tableRazn[6][6]=6.2;
        tableRazn[6][7]=7.7;
        tableRazn[6][8]=9.6;
        tableRazn[6][9]=12;
        tableRazn[6][10]=16;
        tableRazn[6][11]=22;
        tableRazn[6][12]=30;
        tableRazn[6][13]=27;
        tableRazn[6][14]=19;
        tableRazn[6][15]=14;
        tableRazn[6][16]=11;


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

        // заряд дальнобойный
        tableWeight[1][0]=0;
        tableWeight[1][1]=0;
        tableWeight[1][2]=-0.3;
        tableWeight[1][3]=-0.6;
        tableWeight[1][4]=-0.9;
        tableWeight[1][5]=-1.3;
        tableWeight[1][6]=-1.7;
        tableWeight[1][7]=-2.1;
        tableWeight[1][8]=-2.5;
        tableWeight[1][9]=-3;
        tableWeight[1][10]=-3.6;
        tableWeight[1][11]=-4.5;
        tableWeight[1][12]=-5.7;
        tableWeight[1][13]=16;
        tableWeight[1][14]=7.2;
        tableWeight[1][15]=4.4;
        tableWeight[1][16]=3.1;

        // заряд полный
        tableWeight[2][0]=0.1;
        tableWeight[2][1]=0.1;
        tableWeight[2][2]=0;
        tableWeight[2][3]=-0.1;
        tableWeight[2][4]=-0.3;
        tableWeight[2][5]=-0.5;
        tableWeight[2][6]=-0.7;
        tableWeight[2][7]=-0.9;
        tableWeight[2][8]=-1.1;
        tableWeight[2][9]=-1.4;
        tableWeight[2][10]=-1.8;
        tableWeight[2][11]=-2.3;
        tableWeight[2][12]=-3.3;
        tableWeight[2][13]=5.1;
        tableWeight[2][14]=2.9;
        tableWeight[2][15]=2;
        tableWeight[2][16]=1.5;

        // заряд второй
        tableWeight[3][0]=0.3;
        tableWeight[3][1]=0.4;
        tableWeight[3][2]=0.5;
        tableWeight[3][3]=0.6;
        tableWeight[3][4]=0.7;
        tableWeight[3][5]=0.7;
        tableWeight[3][6]=0.8;
        tableWeight[3][7]=0.8;
        tableWeight[3][8]=0.9;
        tableWeight[3][9]=0.9;
        tableWeight[3][10]=1;
        tableWeight[3][11]=1.2;
        tableWeight[3][12]=1.7;
        tableWeight[3][13]=-1.1;
        tableWeight[3][14]=-0.7;
        tableWeight[3][15]=-0.5;
        tableWeight[3][16]=-0.4;

        // заряд третий
        tableWeight[4][0]=0.3;
        tableWeight[4][1]=0.5;
        tableWeight[4][2]=0.6;
        tableWeight[4][3]=0.7;
        tableWeight[4][4]=0.8;
        tableWeight[4][5]=0.9;
        tableWeight[4][6]=0.9;
        tableWeight[4][7]=1;
        tableWeight[4][8]=1.1;
        tableWeight[4][9]=1.3;
        tableWeight[4][10]=1.5;
        tableWeight[4][11]=2;
        tableWeight[4][12]=2.9;
        tableWeight[4][13]=-2.4;
        tableWeight[4][14]=-1.6;
        tableWeight[4][15]=-1.2;
        tableWeight[4][16]=-0.9;

        // заряд четвертый
        tableWeight[5][0]=0.3;
        tableWeight[5][1]=0.5;
        tableWeight[5][2]=0.6;
        tableWeight[5][3]=0.7;
        tableWeight[5][4]=0.8;
        tableWeight[5][5]=0.9;
        tableWeight[5][6]=1;
        tableWeight[5][7]=1.2;
        tableWeight[5][8]=1.4;
        tableWeight[5][9]=1.6;
        tableWeight[5][10]=2;
        tableWeight[5][11]=2.6;
        tableWeight[5][12]=4;
        tableWeight[5][13]=-3.4;
        tableWeight[5][14]=-2.3;
        tableWeight[5][15]=-1.7;
        tableWeight[5][16]=-1.3;

        // заряд пятый
        tableWeight[6][0]=0.3;
        tableWeight[6][1]=0.5;
        tableWeight[6][2]=0.6;
        tableWeight[6][3]=0.8;
        tableWeight[6][4]=0.9;
        tableWeight[6][5]=1.1;
        tableWeight[6][6]=1.3;
        tableWeight[6][7]=1.5;
        tableWeight[6][8]=1.8;
        tableWeight[6][9]=2.3;
        tableWeight[6][10]=3.0;
        tableWeight[6][11]=4.1;
        tableWeight[6][12]=6.5;
        tableWeight[6][13]=-4;
        tableWeight[6][14]=-3.5;
        tableWeight[6][15]=-2.5;
        tableWeight[6][16]=-2;


        //fin


    }


    // на превышение
    private void setOverTable() {
        for (int i = 0; i < 17; i++)
            tableOver[0][i]=tableRazn[0][i];

        // заряд дальнобойный
        tableOver[1][0]=1.8;
        tableOver[1][1]=1.1;
        tableOver[1][2]=0.8;
        tableOver[1][3]=0.7;
        tableOver[1][4]=0.6;
        tableOver[1][5]=0.6;
        tableOver[1][6]=0.6;
        tableOver[1][7]=0.5;
        tableOver[1][8]=0.5;
        tableOver[1][9]=0.5;
        tableOver[1][10]=0.5;
        tableOver[1][11]=0.6;
        tableOver[1][12]=0.6;
        tableOver[1][13]=1.2;
        tableOver[1][14]=0.5;
        tableOver[1][15]=0.3;
        tableOver[1][16]=0.2;

        // заряд полный
        tableOver[2][0]=2.5;
        tableOver[2][1]=1.5;
        tableOver[2][2]=1.1;
        tableOver[2][3]=0.9;
        tableOver[2][4]=0.9;
        tableOver[2][5]=0.8;
        tableOver[2][6]=0.8;
        tableOver[2][7]=0.7;
        tableOver[2][8]=0.7;
        tableOver[2][9]=0.7;
        tableOver[2][10]=0.8;
        tableOver[2][11]=0.8;
        tableOver[2][12]=1;
        tableOver[2][13]=1.1;
        tableOver[2][14]=0.5;
        tableOver[2][15]=0.3;
        tableOver[2][16]=0.2;

        // заряд второй
        tableOver[3][0]=4;
        tableOver[3][1]=2.3;
        tableOver[3][2]=1.7;
        tableOver[3][3]=1.4;
        tableOver[3][4]=1.3;
        tableOver[3][5]=1.1;
        tableOver[3][6]=1.1;
        tableOver[3][7]=1;
        tableOver[3][8]=1;
        tableOver[3][9]=1.1;
        tableOver[3][10]=1.1;
        tableOver[3][11]=1.3;
        tableOver[3][12]=1.8;
        tableOver[3][13]=1;
        tableOver[3][14]=0.6;
        tableOver[3][15]=0.4;
        tableOver[3][16]=0.3;

        // заряд третий
        tableOver[4][0]=5.5;
        tableOver[4][1]=3.1;
        tableOver[4][2]=2.2;
        tableOver[4][3]=1.8;
        tableOver[4][4]=1.6;
        tableOver[4][5]=1.4;
        tableOver[4][6]=1.3;
        tableOver[4][7]=1.3;
        tableOver[4][8]=1.3;
        tableOver[4][9]=1.3;
        tableOver[4][10]=1.5;
        tableOver[4][11]=1.7;
        tableOver[4][12]=2.3;
        tableOver[4][13]=1.3;
        tableOver[4][14]=0.8;
        tableOver[4][15]=0.6;
        tableOver[4][16]=0.4;

        // заряд четвертый
        tableOver[5][0]=6.6;
        tableOver[5][1]=3.4;
        tableOver[5][2]=2.7;
        tableOver[5][3]=2.1;
        tableOver[5][4]=1.9;
        tableOver[5][5]=1.6;
        tableOver[5][6]=1.5;
        tableOver[5][7]=1.4;
        tableOver[5][8]=1.4;
        tableOver[5][9]=1.5;
        tableOver[5][10]=1.7;
        tableOver[5][11]=1.9;
        tableOver[5][12]=2.7;
        tableOver[5][13]=1.4;
        tableOver[5][14]=0.9;
        tableOver[5][15]=0.6;
        tableOver[5][16]=0.4;

        // заряд пятый
        tableOver[6][0]=8.3;
        tableOver[6][1]=4.4;
        tableOver[6][2]=3.1;
        tableOver[6][3]=2.4;
        tableOver[6][4]=2.1;
        tableOver[6][5]=1.9;
        tableOver[6][6]=1.7;
        tableOver[6][7]=1.7;
        tableOver[6][8]=1.7;
        tableOver[6][9]=1.9;
        tableOver[6][10]=2;
        tableOver[6][11]=2.4;
        tableOver[6][12]=3.3;
        tableOver[6][13]=1.7;
        tableOver[6][14]=1;
        tableOver[6][15]=0.7;
        tableOver[6][16]=0.5;


    }

    private void setUstupTable() {
        for (int i = 0; i < 17; i++)
            tableUstup[0][i]=tableRazn[0][i];

        // заряд дальнобойный
        tableUstup[1][0]=0.1;
        tableUstup[1][1]=0.2;
        tableUstup[1][2]=0.2;
        tableUstup[1][3]=0.3;
        tableUstup[1][4]=0.3;
        tableUstup[1][5]=0.4;
        tableUstup[1][6]=0.4;
        tableUstup[1][7]=0.5;
        tableUstup[1][8]=0.5;
        tableUstup[1][9]=0.6;
        tableUstup[1][10]=0.7;
        tableUstup[1][11]=0.8;
        tableUstup[1][12]=1;
        tableUstup[1][13]=2.6;
        tableUstup[1][14]=1.1;
        tableUstup[1][15]=0.7;
        tableUstup[1][16]=0.5;

        // заряд полный
        tableUstup[2][0]=0.1;
        tableUstup[2][1]=0.2;
        tableUstup[2][2]=0.3;
        tableUstup[2][3]=0.3;
        tableUstup[2][4]=0.4;
        tableUstup[2][5]=0.5;
        tableUstup[2][6]=0.5;
        tableUstup[2][7]=0.6;
        tableUstup[2][8]=0.6;
        tableUstup[2][9]=0.7;
        tableUstup[2][10]=0.8;
        tableUstup[2][11]=1;
        tableUstup[2][12]=1.3;
        tableUstup[2][13]=1.8;
        tableUstup[2][14]=1;
        tableUstup[2][15]=0.7;
        tableUstup[2][16]=0.5;

        // заряд второй
        tableUstup[3][0]=0.2;
        tableUstup[3][1]=0.3;
        tableUstup[3][2]=0.4;
        tableUstup[3][3]=0.4;
        tableUstup[3][4]=0.5;
        tableUstup[3][5]=0.5;
        tableUstup[3][6]=0.6;
        tableUstup[3][7]=0.7;
        tableUstup[3][8]=0.7;
        tableUstup[3][9]=0.9;
        tableUstup[3][10]=1;
        tableUstup[3][11]=1.4;
        tableUstup[3][12]=1.7;
        tableUstup[3][13]=1.7;
        tableUstup[3][14]=1.1;
        tableUstup[3][15]=0.9;
        tableUstup[3][16]=0.7;

        // заряд третий
        tableUstup[4][0]=0.3;
        tableUstup[4][1]=0.4;
        tableUstup[4][2]=0.4;
        tableUstup[4][3]=0.5;
        tableUstup[4][4]=0.5;
        tableUstup[4][5]=0.6;
        tableUstup[4][6]=0.7;
        tableUstup[4][7]=0.7;
        tableUstup[4][8]=0.8;
        tableUstup[4][9]=1;
        tableUstup[4][10]=1.2;
        tableUstup[4][11]=1.6;
        tableUstup[4][12]=2.4;
        tableUstup[4][13]=2.1;
        tableUstup[4][14]=1.4;
        tableUstup[4][15]=1.1;
        tableUstup[4][16]=0.9;

        // заряд четвертый
        tableUstup[5][0]=0.4;
        tableUstup[5][1]=0.4;
        tableUstup[5][2]=0.5;
        tableUstup[5][3]=0.5;
        tableUstup[5][4]=0.6;
        tableUstup[5][5]=0.6;
        tableUstup[5][6]=0.7;
        tableUstup[5][7]=0.8;
        tableUstup[5][8]=0.9;
        tableUstup[5][9]=1.1;
        tableUstup[5][10]=1.3;
        tableUstup[5][11]=1.7;
        tableUstup[5][12]=2.7;
        tableUstup[5][13]=2.3;
        tableUstup[5][14]=1.5;
        tableUstup[5][15]=1.2;
        tableUstup[5][16]=0.9;

        // заряд пятый
        tableUstup[6][0]=0.5;
        tableUstup[6][1]=0.5;
        tableUstup[6][2]=0.5;
        tableUstup[6][3]=0.6;
        tableUstup[6][4]=0.6;
        tableUstup[6][5]=0.7;
        tableUstup[6][6]=0.8;
        tableUstup[6][7]=0.9;
        tableUstup[6][8]=1;
        tableUstup[6][9]=1.2;
        tableUstup[6][10]=1.5;
        tableUstup[6][11]=2;
        tableUstup[6][12]=3.1;
        tableUstup[6][13]=2.5;
        tableUstup[6][14]=1.7;
        tableUstup[6][15]=1.3;
        tableUstup[6][16]=1.1;
    }
}