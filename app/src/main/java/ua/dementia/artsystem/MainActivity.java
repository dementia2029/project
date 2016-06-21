package ua.dementia.artsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity {

    int temp;

    Spinner comboBox1,inRange_min,inRange_max;
    EditText inRange0,inDgun,inDq,inDmain,inAngleBig,inAngleSmall,textBox_inf2,textBox_inf3,inBeta1,inBeta2;
    double RangeMain;
    baseData tables;

    TextView label_deltaV,label_deltaH,label_Dq,label_Angle,label_AngleMax,label_AngleMin,label_Angle1,label_AngleMax1,
            label_AngleMin1,label_dUstup,label_dUstupMax,label_dUstupMin,label_zInt,label_zIntMax,label_zIntMin, label_inf2, label_inf1;

    ArrayList<String> list1, list2, list3;

    RadioButton radioFirst,radioSecond,radioThird,radioFourth,radioFifth,radioSixth,radioFull;

    LinearLayout[] ll = new LinearLayout[15], rowsis2 = new LinearLayout[15];

    EditText[] arrInAngle=new EditText[15],arr18Col=new EditText[15];

    EditText[][] arrayOfEditText = new EditText[][]{arrInAngle,arr18Col};

    String[] arrayOfIdEditText = new String[]{"inAngle","in18C"};

    TextView[] arrRange=new TextView[15], arrCrossHair=new TextView[15], arrRazn=new TextView[15],arrRaznD=new TextView[15],
            arrSumm=new TextView[15],arrWeight=new TextView[15],arrWeightD=new TextView[15],arrOver=new TextView[15],
            arrOverD=new TextView[15],arrUstupT=new TextView[15],arrUstup=new TextView[15],arrUstupMin=new TextView[15],
            arrUstupMax=new TextView[15],arrLevelMin=new TextView[15],arrLevelMax=new TextView[15],arrLevel=new TextView[15],
            arr10angle=new TextView[15],arrInterval=new TextView[15],arrIntervalMin=new TextView[15],arrIntervalMax=new TextView[15],
            arrSummary=new TextView[15],arrSummaryMin=new TextView[15],arrSummaryMax=new TextView[15];

    TextView[][] arrayOfTextView = new TextView[][]{arrRange,arrCrossHair,arrRazn,arrRaznD,arrSumm,arrWeight,arrWeightD,arrOver,
            arrOverD,arrUstupT,arrUstup,arrUstupMin,arrUstupMax,arrLevelMin,arrLevelMax,arrLevel,arr10angle,arrInterval,arrIntervalMin,
            arrIntervalMax,arrSummary,arrSummaryMin,arrSummaryMax};

    String[] arrayOfIdTextView = new String[]{"label_Range","label_CrossHair","label_Razn","label_RaznD","label_Summ","label_Weight","label_WeightD",
            "label_Over","label_OverD","label_UstupT","label_Ustup","label_UstupMin","label_UstupMax","label_LevelMin","label_LevelMax","label_Level",
            "label_10angle","label_Interval","label_IntervalMin","label_IntervalMax","label_Summary","label_SummaryMin","label_SummaryMax"};

    double doubleValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE);

        //AndroidBug5497Workaround.assistActivity(this);

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 23; j++) {
                temp = getResources().getIdentifier(arrayOfIdTextView[j] + (i + 1), "id", "ua.dementia.artsystem");
                arrayOfTextView[j][i] = (TextView) findViewById(temp);
                if(j!=0){
                    arrayOfTextView[j][i].setText("0");
                }
            }
            for (int j = 0; j < 2; j++) {
                temp = getResources().getIdentifier(arrayOfIdEditText[j] + (i + 1), "id", "ua.dementia.artsystem");
                arrayOfEditText[j][i] = (EditText) findViewById(temp);
                arrayOfEditText[j][i].setKeyListener(DigitsKeyListener.getInstance(true,true));

            }
            temp = getResources().getIdentifier("line" + (i + 1), "id", "ua.dementia.artsystem");
            ll[i] = (LinearLayout) findViewById(temp);
            temp = getResources().getIdentifier("row" + (i + 1), "id", "ua.dementia.artsystem");
            rowsis2[i] = (LinearLayout) findViewById(temp);
        }

        comboBox1 = (Spinner) findViewById(R.id.spinner1);
        inRange_min = (Spinner) findViewById(R.id.spinner2);
        inRange_max = (Spinner) findViewById(R.id.spinner3);

        inRange0 =  (EditText) findViewById(R.id.inRange0);
        inDgun = (EditText) findViewById(R.id.inDgun);
        inDq = (EditText) findViewById(R.id.inDq);
        inDmain = (EditText) findViewById(R.id.inDmain);
        inAngleBig  = (EditText) findViewById(R.id.inAngleBig);
        inAngleSmall = (EditText) findViewById(R.id.inAngleSmall);
        textBox_inf2 = (EditText) findViewById(R.id.textbox_inf2);
        textBox_inf3 = (EditText) findViewById(R.id.textbox_inf3);
        inBeta1 = (EditText) findViewById(R.id.inBeta1);
        inBeta2 = (EditText) findViewById(R.id.inBeta2);

        label_inf2 = (TextView) findViewById(R.id.label_inf2);
        label_inf1 = (TextView) findViewById(R.id.label_inf1);

        label_deltaV = (TextView) findViewById(R.id.label_deltaV);
        label_deltaH = (TextView) findViewById(R.id.label_deltaH);
        label_Dq = (TextView) findViewById(R.id.label_Dq);

        label_Angle = (TextView) findViewById(R.id.label_Angle);
        label_AngleMax = (TextView) findViewById(R.id.label_AngleMax);
        label_AngleMin = (TextView) findViewById(R.id.label_AngleMin);

        label_Angle1 = (TextView) findViewById(R.id.label_Angle1);
        label_AngleMax1 = (TextView) findViewById(R.id.label_AngleMax1);
        label_AngleMin1 = (TextView) findViewById(R.id.label_AngleMin1);

        label_dUstup = (TextView) findViewById(R.id.label_dUstup);
        label_dUstupMax = (TextView) findViewById(R.id.label_dUstupMax);
        label_dUstupMin = (TextView) findViewById(R.id.label_dUstupMin);

        label_zInt = (TextView) findViewById(R.id.label_zInt);
        label_zIntMax = (TextView) findViewById(R.id.label_zIntMax);
        label_zIntMin = (TextView) findViewById(R.id.label_zIntMin);

        radioFirst = (RadioButton) findViewById(R.id.radioFirst);
        radioSecond = (RadioButton) findViewById(R.id.radioSecond);
        radioThird = (RadioButton) findViewById(R.id.radioThird);
        radioFourth = (RadioButton) findViewById(R.id.radioFourth);
        radioFifth = (RadioButton) findViewById(R.id.radioFifth);
        radioSixth = (RadioButton) findViewById(R.id.radioSixth);
        radioFull = (RadioButton) findViewById(R.id.radioFull);

        inDgun.setKeyListener(DigitsKeyListener.getInstance(true,true));
        inDmain.setKeyListener(DigitsKeyListener.getInstance(true,true));
        inDq.setKeyListener(DigitsKeyListener.getInstance(true,true));
        inRange0.setKeyListener(DigitsKeyListener.getInstance(true,true));
        inAngleBig.setKeyListener(DigitsKeyListener.getInstance(true,false));
        inAngleSmall.setKeyListener(DigitsKeyListener.getInstance(true,false));
        textBox_inf3.setKeyListener(DigitsKeyListener.getInstance(true,false));
        textBox_inf2.setKeyListener(DigitsKeyListener.getInstance(true,false));
        inBeta2.setKeyListener(DigitsKeyListener.getInstance(true,false));
        inBeta1.setKeyListener(DigitsKeyListener.getInstance(true,false));

        list1 = new ArrayList<String>();
        list1.add("2С3М");
        list1.add("2С1");
        list1.add("Д30");
        list1.add("2А65");
        list1.add("2А36");

        int temp777 = 3000;

        list2 = new ArrayList<String>();
        list2.add("3000");

        for (int i = 0; i < 14; i++)
            list2.add(Integer.toString(temp777 = temp777 + 1000));

        list3 = new ArrayList<String>(list2);

        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this,
                R.layout.spinner_item, list1);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        comboBox1.setAdapter(dataAdapter1);

        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                R.layout.spinner_item, list2);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        inRange_min.setAdapter(dataAdapter2);

        comboBox1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                switch (position) {
                    case 0:
                        radioFull.setChecked(true);
                        label_inf2.setVisibility(View.GONE);
                        textBox_inf2.setVisibility(View.GONE);
                        textBox_inf3.setVisibility(View.GONE);

                        label_inf1.setVisibility(View.VISIBLE);
                        inRange0.setVisibility(View.VISIBLE);

                        radioFull.setText("П");
                        radioFirst.setText("1");
                        radioSecond.setText("2");
                        radioThird.setText("3");
                        radioFourth.setText("4");
                        radioFifth.setText("5");
                        radioSixth.setText("6");

                        radioFourth.setVisibility(View.VISIBLE);
                        radioFifth.setVisibility(View.VISIBLE);
                        radioSixth.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        radioFull.setChecked(true);
                        label_inf2.setVisibility(View.GONE);
                        textBox_inf2.setVisibility(View.GONE);
                        textBox_inf3.setVisibility(View.GONE);

                        label_inf1.setVisibility(View.VISIBLE);
                        inRange0.setVisibility(View.VISIBLE);

                        radioFull.setText("П");
                        radioFirst.setText("Зм");
                        radioSecond.setText("1");
                        radioThird.setText("2");
                        radioFourth.setText("3");
                        radioFifth.setText("4");

                        radioFourth.setVisibility(View.VISIBLE);
                        radioFifth.setVisibility(View.VISIBLE);
                        radioSixth.setVisibility(View.GONE);
                        break;
                    case 2:
                        radioFull.setChecked(true);
                        label_inf2.setVisibility(View.VISIBLE);
                        textBox_inf2.setVisibility(View.VISIBLE);
                        textBox_inf3.setVisibility(View.VISIBLE);

                        label_inf1.setVisibility(View.GONE);
                        inRange0.setVisibility(View.GONE);

                        radioFull.setText("П");
                        radioFirst.setText("Зм");
                        radioSecond.setText("1");
                        radioThird.setText("2");
                        radioFourth.setText("3");
                        radioFifth.setText("4");

                        radioFourth.setVisibility(View.VISIBLE);
                        radioFifth.setVisibility(View.VISIBLE);
                        radioSixth.setVisibility(View.GONE);
                        break;
                    case 3:
                        radioFull.setChecked(true);
                        label_inf2.setVisibility(View.VISIBLE);
                        textBox_inf2.setVisibility(View.VISIBLE);
                        textBox_inf3.setVisibility(View.VISIBLE);

                        label_inf1.setVisibility(View.GONE);
                        inRange0.setVisibility(View.GONE);

                        radioFull.setText("Д");
                        radioFirst.setText("П");
                        radioSecond.setText("2");
                        radioThird.setText("3");
                        radioFourth.setText("4");
                        radioFifth.setText("5");

                        radioFourth.setVisibility(View.VISIBLE);
                        radioFifth.setVisibility(View.VISIBLE);
                        radioSixth.setVisibility(View.GONE);
                        break;
                    case 4:
                        radioFull.setChecked(true);
                        label_inf2.setVisibility(View.VISIBLE);
                        textBox_inf2.setVisibility(View.VISIBLE);
                        textBox_inf3.setVisibility(View.VISIBLE);

                        label_inf1.setVisibility(View.GONE);
                        inRange0.setVisibility(View.GONE);

                        radioFull.setText("П");
                        radioFirst.setText("Зм");
                        radioSecond.setText("1");
                        radioThird.setText("2");
                        radioFourth.setVisibility(View.GONE);
                        radioFifth.setVisibility(View.GONE);
                        radioSixth.setVisibility(View.GONE);
                        break;
                }
            }
            public void onNothingSelected(AdapterView<?> parent) {}});

        inRange_min.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(inRange_min.getSelectedItemId()>inRange_max.getSelectedItemId()){
                    inRange_max.setSelection(14);
                }
            }
            public void onNothingSelected(AdapterView<?> parent) {}});

        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this,
                R.layout.spinner_item, list3);
        dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        inRange_max.setAdapter(dataAdapter3);
        inRange_max.setSelection(14);

        inRange_max.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                long x =(int)inRange_max.getSelectedItemId();

                int x2 = (int) x;

                if(inRange_max.getSelectedItemId()<inRange_min.getSelectedItemId()){
                    inRange_min.setSelection(x2);
                }
            }
            public void onNothingSelected(AdapterView<?> parent) {}});
    }

    public void about(View view)
    {
        Intent intent = new Intent(MainActivity.this, About.class);
        startActivity(intent);
    }

    public void buttonCalc(View view){
        Calculation calculate = new Calculation();

        double temp1, temp2;

        switch (comboBox1.getSelectedItemPosition()){
            case 0:
                tables = new Data();
                try{
                    RangeMain = Double.parseDouble(inRange0.getText().toString());
                }
                catch (NumberFormatException e){
                    RangeMain = 0;
                }
                break;
            case 1:
                tables = new DataD30();
                try{
                    RangeMain = Double.parseDouble(inRange0.getText().toString());
                }
                catch (NumberFormatException e){
                    RangeMain = 0;
                }
                break;
            case 2:
                tables = new DataD30();

                try{
                    temp1 = Double.parseDouble(textBox_inf2.getText().toString());
                }
                catch (NumberFormatException n){
                    temp1=0;
                }

                try{
                    temp2 = Double.parseDouble(textBox_inf3.getText().toString());
                }
                catch (NumberFormatException n){
                    temp2=0;
                }

                    if (temp1 == 0  && temp2 == 0)
                        RangeMain = 0;
                    else {
                        double tempAngle = 100 * calculate.AngleD30(temp1, temp2);
                        RangeMain = 1910.0 / tempAngle;

                    }
                    break;
            case 3:
                tables = new Data2A65();
                try{
                    temp1 = Double.parseDouble(textBox_inf2.getText().toString());
                }
                catch (NumberFormatException n){
                    temp1=0;
                }

                try{
                    temp2 = Double.parseDouble(textBox_inf3.getText().toString());
                }
                catch (NumberFormatException n){
                    temp2=0;
                }

                if (temp1 == 0  && temp2 == 0)
                    RangeMain = 0;
                else {
                    double tempAngle = 100 * calculate.AngleD30(temp1, temp2);
                    RangeMain = 1910.0 / tempAngle;
                }
                break;
            case 4:
                tables = new Data2A36();
                try{
                    temp1 = Double.parseDouble(textBox_inf2.getText().toString());
                }
                catch (NumberFormatException n){
                    temp1=0;
                }

                try{
                    temp2 = Double.parseDouble(textBox_inf3.getText().toString());
                }
                catch (NumberFormatException n){
                    temp2=0;
                }

                if (temp1 == 0  && temp2 == 0)
                    RangeMain = 0;
                else {
                    double tempAngle = 100 * calculate.AngleD30(temp1, temp2);
                    RangeMain = 1910.0 / tempAngle;
                }
                break;
        }

        int rows = 16;

        int rowmin = Integer.parseInt(inRange_min.getSelectedItem().toString())/1000-3;
        int rowmax = Integer.parseInt(inRange_max.getSelectedItem().toString())/1000-2;

        for(int i=0;i<15;i++){
            rowsis2[i].setVisibility(View.GONE);
            ll[i].setVisibility(View.GONE);
        }

        for(int i=rowmin;i<rowmax;i++){
            rowsis2[i].setVisibility(View.VISIBLE);
            ll[i].setVisibility(View.VISIBLE);
        }

        try{
            temp1 = Double.parseDouble(inDgun.getText().toString());
        }
        catch (NumberFormatException n){
            temp1=0;
        }

        try{
            temp2 = Double.parseDouble(inDmain.getText().toString());
        }
        catch (NumberFormatException n){
            temp2=0;
        }

        double deltaV = temp1 - temp2;
        label_deltaV.setText(String.valueOf(round2(deltaV,1)+"%"));
        if("0.0%".equals(label_deltaV.getText().toString())){
            label_deltaV.setText("0%");
        }

        try{
            temp1 = Double.parseDouble(inBeta1.getText().toString());
        }
        catch (NumberFormatException n){
            temp1=0;
        }

        try{
            temp2 = Double.parseDouble(inBeta2.getText().toString());
        }
        catch (NumberFormatException n){
            temp2=0;
        }

        double deltaH = (Math.abs(temp1) + 0.01 * temp2) * 0.1 * RangeMain;

        if (temp1 < 0)
        {
            deltaH *= -1;
        }

        deltaH = round2(deltaH,1);

        label_deltaH.setText(String.valueOf(Math.round(deltaH)));

        try{
            temp1 = Double.parseDouble(inDq.getText().toString());
        }
        catch (NumberFormatException n){
            temp1=0;
        }

        if (temp1 > 0)
        {
            label_Dq.setText((int)(round2(temp1,1))+ "+");
        }
        else if (temp1 == 0)
        {
            label_Dq.setText(String.valueOf(temp1));
        }
        else
        {
            label_Dq.setText((int)Math.abs(temp1)+ "-");
        }

        double angle = calculate.Angle(inAngleBig, inAngleSmall);
        double angleMin;
        double angleMax;
        if (angle >= 5 && angle <= 55)
        {
            angleMin = angle - 5;
            angleMax = angle + 5;
        }
        else if (angle < 5)
        {
            angleMin = 55 + angle;
            angleMax = angle + 5;
        }
        else
        {
            angleMin = angle - 5;
            angleMax = angle - 55;
        }

        double dUstup = Math.round(calculate.DeltaD(angle, RangeMain));
        double dUstupMin = Math.round(calculate.DeltaD(angleMin, RangeMain));
        double dUstupMax = Math.round(calculate.DeltaD(angleMax, RangeMain));

        label_Angle.setText(String.valueOf((int)angle));
        label_AngleMin.setText(String.valueOf((int)angleMin));
        label_AngleMax.setText(String.valueOf((int)angleMax));

        label_Angle1.setText(label_Angle.getText().toString());
        label_AngleMin1.setText(label_AngleMin.getText().toString());
        label_AngleMax1.setText(label_AngleMax.getText().toString());

        if (angle <= 15 || angle >= 45)
            label_dUstup.setText(String.valueOf((int)dUstup));
        else
            label_dUstup.setText(String.format("+%s", String.valueOf((int)dUstup)));

        if (angleMin <= 15 || angleMin >= 45)
            label_dUstupMin.setText(String.valueOf((int)dUstupMin));
        else
            label_dUstupMin.setText(String.format("+%s", String.valueOf((int)dUstupMin)));
        if (angleMax <= 15 || angleMax >= 45)
            label_dUstupMax.setText(String.valueOf((int)dUstupMax));
        else
            label_dUstupMax.setText(String.format("+%s", String.valueOf((int)dUstupMax)));

        double dInterval = Math.round(calculate.DeltaZ(angle, RangeMain));
        double dIntervalMin = Math.round(calculate.DeltaZ(angleMin, RangeMain));
        double dIntervalMax = Math.round(calculate.DeltaZ(angleMax, RangeMain));

        if (angle >= 30 && angle <= 60)
            label_zInt.setText("Л" +Math.abs((int)dInterval));
        else
            label_zInt.setText("П" + (int)dInterval);
        if (angleMin >= 30 && angleMin <= 60)
            label_zIntMin.setText("Л" + Math.abs((int)dIntervalMin));
        else
            label_zIntMin.setText("П" + (int)dIntervalMin);
        if (angleMax >= 30 && angleMax <= 60)
            label_zIntMax.setText("Л" + Math.abs((int)dIntervalMax));
        else
            label_zIntMax.setText("П" + (int)dIntervalMax);

        int charge = 1;
        if (radioFirst.isChecked())
            charge = 2;
        if (radioSecond.isChecked())
            charge = 3;
        if (radioThird.isChecked())
            charge = 4;
        if (radioFourth.isChecked())
            charge = 5;
        if (radioFifth.isChecked())
            charge = 6;
        if (radioSixth.isChecked())
            charge = 7;

        for (int j = 0; j < 15; j++)
        {
            if (Integer.parseInt(arrRange[0].getText().toString())==(tables.tableCrosshair[0][j]))
            {
                arrCrossHair[0].setText(String.valueOf(tables.tableCrosshair[charge][j]));
                break;
            }
        }

        for (int i = 1; i < rows - 1; i++)
        {
            String kek = arrRange[i-1].getText().toString();
            int kek2 = Integer.parseInt(kek);
            int temp = kek2 + 1000;
            arrRange[i].setText(String.valueOf(temp));
            for (int j = 0; j < 15; j++)
            {
                if (Integer.parseInt(arrRange[i].getText().toString()) == tables.tableCrosshair[0][j])
                {
                    arrCrossHair[i].setText(String.valueOf(tables.tableCrosshair[charge][j]));
                    break;
                }
            }
        }

        for (int i = 0; i < rows - 1; i++)
        {
            double result = 0;
            double temp = Double.parseDouble(arrCrossHair[i].getText().toString());
            if (temp == 0)
            {
                rowsis2[i].setVisibility(View.GONE);
                ll[i].setVisibility(View.GONE);
                continue;
            }

            calculate.interpolate(tables.tableRazn, charge, temp);

            result = round2(Calculation.result1,1);

            arrRazn[i].setText(String.valueOf(result));
            arrRaznD[i].setText(String.valueOf(round2(result * deltaV * (-1), 1)));

            try{
                temp1 = Double.parseDouble(arrInAngle[i].getText().toString());
            }

            catch(NumberFormatException e){
                temp1 = 0;
            }
            arrSumm[i].setText(String.valueOf(Double.parseDouble(arrRaznD[i].getText().toString()) + temp1));

            calculate.interpolate(tables.tableWeight, charge, temp);
            result = round2(Calculation.result1,1);
            arrWeight[i].setText(String.valueOf(result));

            try{
                temp1 = Double.parseDouble(inDq.getText().toString());
            }

            catch (NumberFormatException e){
                temp1 = 0;
            }

            result = result * temp1;
            result = round2(result, 1);
            arrWeightD[i].setText(String.valueOf(result));

            calculate.interpolateReversed(tables.tableOver, charge, temp);
            result = round2(Calculation.result2,1);
            arrOver[i].setText(String.valueOf(result));

            result *= 0.1 * deltaH;
            result = round2(result, 1);
            arrOverD[i].setText(String.valueOf(result));

            calculate.interpolate(tables.tableUstup, charge, temp);
            result = round2(Calculation.result1,1);
            arrUstupT[i].setText(String.valueOf(result));

            result *= 0.1 * dUstup;
            result = round2(result, 1);
            arrUstup[i].setText(String.valueOf(result));

            result = 0.1 * dUstupMin * Double.parseDouble(arrUstupT[i].getText().toString());
            result = round2(result, 1);
            arrUstupMin[i].setText(String.valueOf(result));

            result = 0.1 * dUstupMax * Double.parseDouble(arrUstupT[i].getText().toString());
            result = round2(result, 1);
            arrUstupMax[i].setText(String.valueOf(result));

            result = (Double.parseDouble(arrUstupMin[i].getText().toString()) - Double.parseDouble(arrUstup[i].getText().toString())) / 5;
            result = round2(result, 1);
            arrLevelMin[i].setText(String.valueOf(result));

            result = (Double.parseDouble(arrUstupMax[i].getText().toString()) - Double.parseDouble(arrUstup[i].getText().toString())) / 5;
            result = round2(result, 1);
            arrLevelMax[i].setText(String.valueOf(result));

            result = Double.parseDouble(arrSumm[i].getText().toString()) + Double.parseDouble(arrWeightD[i].getText().toString()) +
                    Double.parseDouble(arrOverD[i].getText().toString()) + Double.parseDouble(arrUstup[i].getText().toString());
            result = round2(result, 1);
            arrLevel[i].setText(String.valueOf(result));

            result = 10 / (0.001 * Double.parseDouble(arrRange[i].getText().toString()));
            result = round2(result, 1);
            arr10angle[i].setText(String.valueOf(result));

            result *= 0.1 * dInterval;
            result = round2(result, 1);
            arrInterval[i].setText(String.valueOf(result));

            result = 0.1 * dIntervalMin * Double.parseDouble(arr10angle[i].getText().toString());
            result = round2(result, 1);
            arrIntervalMin[i].setText(String.valueOf(result));

            result = 0.1 * dIntervalMax * Double.parseDouble(arr10angle[i].getText().toString());
            result = round2(result, 1);
            arrIntervalMax[i].setText(String.valueOf(result));

            try{
                temp1 = Double.parseDouble(arr18Col[i].getText().toString());
            }

            catch (NumberFormatException e){
                temp1 = 0;
            }

            result = temp1 + Double.parseDouble(arrInterval[i].getText().toString());
            result = round2(result, 1);
            arrSummary[i].setText(String.valueOf(result));

            result = (Double.parseDouble(arrIntervalMin[i].getText().toString()) - Double.parseDouble(arrInterval[i].getText().toString())) / 5.0;
            result = round2(result, 1);
            arrSummaryMin[i].setText(String.valueOf(result));

            result = (Double.parseDouble(arrIntervalMax[i].getText().toString()) - Double.parseDouble(arrInterval[i].getText().toString())) / 5.0;
            result = round2(result, 1);
            arrSummaryMax[i].setText(String.valueOf(result));

            if("0.0".equals(arrRazn[i].getText().toString()))
                arrRazn[i].setText("0");
            if("0.0".equals(arrRaznD[i].getText().toString()))
                arrRaznD[i].setText("0");
            if("0.0".equals(arrSumm[i].getText().toString()))
                arrSumm[i].setText("0");
            if("0.0".equals(arrWeight[i].getText().toString()))
                arrWeight[i].setText("0");
            if("0.0".equals(arrWeightD[i].getText().toString()))
                arrWeightD[i].setText("0");
            if("0.0".equals(arrOver[i].getText().toString()))
                arrOver[i].setText("0");
            if("0.0".equals(arrOverD[i].getText().toString()))
                arrOverD[i].setText("0");

            if("0.0".equals(arrUstupT[i].getText().toString()))
                arrUstupT[i].setText("0");
            if("0.0".equals(arrUstup[i].getText().toString()))
                arrUstup[i].setText("0");
            if("0.0".equals(arrUstupMin[i].getText().toString()))
                arrUstupMin[i].setText("0");
            if("0.0".equals(arrUstupMax[i].getText().toString()))
                arrUstupMax[i].setText("0");
            if("0.0".equals(arrLevelMin[i].getText().toString()))
                arrLevelMin[i].setText("0");
            if("0.0".equals(arrLevelMax[i].getText().toString()))
                arrLevelMax[i].setText("0");
            if("0.0".equals(arrLevel[i].getText().toString()))
                arrLevel[i].setText("0");
            if("0.0".equals(arr10angle[i].getText().toString()))
                arr10angle[i].setText("0");
            if("0.0".equals(arrInterval[i].getText().toString()))
                arrInterval[i].setText("0");
            if("0.0".equals(arrIntervalMin[i].getText().toString()))
                arrIntervalMin[i].setText("0");
            if("0.0".equals(arrIntervalMax[i].getText().toString()))
                arrIntervalMax[i].setText("0");
            if("0.0".equals(arrSummary[i].getText().toString()))
                arrSummary[i].setText("0");
            if("0.0".equals(arrSummaryMin[i].getText().toString()))
                arrSummaryMin[i].setText("0");
            if("0.0".equals(arrSummaryMax[i].getText().toString()))
                arrSummaryMax[i].setText("0");
        }
    }

    public static double round2(double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }
}
