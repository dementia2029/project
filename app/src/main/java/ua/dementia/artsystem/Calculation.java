package ua.dementia.artsystem;

import android.widget.EditText;

/**
 * Created by Shved Corporation on 05.04.2015.
 */
public class Calculation {

    public double corr=0;

    public static double result1=0;
    public static double result2=0;

    public double interpolate(double x[][], int charge, double ch)
    {
        corr = 0;

        if (ch <= 50)
            corr = (ch * x[ charge][0]) / x[0][0];

        if ((ch > 50) && (ch <= 650))
        {
            for (int i = 1; i < 13; i++)
            {
                if (Math.abs(ch - x[0][i - 1]) <= 50)
                {
                    corr = ((x[charge][i] - x[charge][i - 1])/50 * (ch - x[0][i - 1])) + x[charge][i - 1];

                    break;
                }
            }
        }

        if ((ch > 650) && (ch < 850))
        {
            if (Math.abs(850 - ch) >= Math.abs(ch - 650))
                corr = (ch * x[charge][13]) / x[0][13];
            else
                corr = (ch * x[charge][12]) / x[0][12];
        }

        if (ch >= 850)
        {
            for (int i = 1; i < 13; i++)
            {
                if (Math.abs(ch - x[0][i - 1]) <= 25)
                {
                    corr = (x[0][i - 1] * x[1][i - 1]) / ch;
                    break;
                }

                if (Math.abs(x[0][i] - ch) <= 25)
                {
                    corr = (x[0][i] * x[1][i]) / ch;
                    break;
                }
            }
        }
        return result1 = corr;
    }

    public double interpolateReversed(double x[][], int charge, double ch)
    {
        corr = 0;

        if (ch <= 50)
            corr = (x[0][0] * x[charge][0]) / ch;


        if ((ch > 50) && (ch <= 650))
        {
            for (int i = 1; i < 13; i++)
            {
                if (Math.abs(ch - x[0][i - 1]) <= 25)
                {
                    corr = (x[0][i - 1] * x[charge][i - 1]) / ch;
                    break;
                }

                if (Math.abs(x[0][i] - ch) <= 25)
                {
                    corr = (x[0][i] * x[charge][i]) / ch;
                    break;
                }
            }
        }

        if ((ch > 650) && (ch < 850))
        {
            if (Math.abs(850 - ch) >= Math.abs(ch - 650))
                corr = (x[0][13] * x[charge][13]) / ch;
            else
                corr = (x[0][12] * x[charge][12]) / ch;
        }

        if (ch >= 850)
        {
            for (int i = 1; i < 13; i++)
            {
                if (Math.abs(ch - x[0][i - 1]) <= 25)
                {
                    corr = (x[0][i - 1] * x[1][i - 1]) / ch;
                    break;
                }

                if (Math.abs(x[0][i] - ch) <= 25)
                {
                    corr = (x[0][i] * x[1][i]) / ch;
                    break;
                }
            }
        }
        return result2 = corr;
    }

    public double DeltaZ( double du,  double Range0)
    {
        double rad = ((360 - (6*du))* (Math.PI/180));

        if (du >= 0 && du <= 30)
        {
            return Math.abs(Math.sin(rad) * Range0);
        }
        else
        {
            return -Math.abs(Math.sin(rad) * Range0);
        }
    }

    public double DeltaD( double du,  double Range0)
    {
        double rad = ((360 - (6 * du)) * (Math.PI / 180));
        if ((du >= 0 && du <= 15) || (du >= 45 && du <= 60))
        {
            return -Math.abs(Math.cos(rad) * Range0);
        }
        else
        {
            return Math.abs(Math.cos(rad) * Range0);
        }
    }

    public double  Angle( EditText big,  EditText small)
    {
        double Big,Small;
        try{
            Big = Double.parseDouble(big.getText().toString());
        }

        catch (NumberFormatException e) {
            Big = 0;
        }

        try{
            Small = Double.parseDouble(small.getText().toString());
        }

        catch (NumberFormatException e){
            Small = 0;
        }
        if (Small >= 50)
            Big++;
        return Big;
    }

    public double AngleD30( double big,  double small)
    {
        small = small * 0.01;

        double result;
        if (big < 0)
            result = -(Math.abs(big) + small);
        else
            result = big + small;
        return result;
    }
}