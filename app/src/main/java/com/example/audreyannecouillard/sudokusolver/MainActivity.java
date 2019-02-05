package com.example.audreyannecouillard.sudokusolver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvInstructions;
    TextView tvInvalidSudoku;
    TextView tvEmptySudoku;
    TextView tvUnsolvedSudoku;
    Button btnSolve;
    Button btnClear;
    EditText etSquare1;
    EditText etSquare2;
    EditText etSquare3;
    EditText etSquare4;
    EditText etSquare5;
    EditText etSquare6;
    EditText etSquare7;
    EditText etSquare8;
    EditText etSquare9;
    EditText etSquare10;
    EditText etSquare11;
    EditText etSquare12;
    EditText etSquare13;
    EditText etSquare14;
    EditText etSquare15;
    EditText etSquare16;
    EditText etSquare17;
    EditText etSquare18;
    EditText etSquare19;
    EditText etSquare20;
    EditText etSquare21;
    EditText etSquare22;
    EditText etSquare23;
    EditText etSquare24;
    EditText etSquare25;
    EditText etSquare26;
    EditText etSquare27;
    EditText etSquare28;
    EditText etSquare29;
    EditText etSquare30;
    EditText etSquare31;
    EditText etSquare32;
    EditText etSquare33;
    EditText etSquare34;
    EditText etSquare35;
    EditText etSquare36;
    EditText etSquare37;
    EditText etSquare38;
    EditText etSquare39;
    EditText etSquare40;
    EditText etSquare41;
    EditText etSquare42;
    EditText etSquare43;
    EditText etSquare44;
    EditText etSquare45;
    EditText etSquare46;
    EditText etSquare47;
    EditText etSquare48;
    EditText etSquare49;
    EditText etSquare50;
    EditText etSquare51;
    EditText etSquare52;
    EditText etSquare53;
    EditText etSquare54;
    EditText etSquare55;
    EditText etSquare56;
    EditText etSquare57;
    EditText etSquare58;
    EditText etSquare59;
    EditText etSquare60;
    EditText etSquare61;
    EditText etSquare62;
    EditText etSquare63;
    EditText etSquare64;
    EditText etSquare65;
    EditText etSquare66;
    EditText etSquare67;
    EditText etSquare68;
    EditText etSquare69;
    EditText etSquare70;
    EditText etSquare71;
    EditText etSquare72;
    EditText etSquare73;
    EditText etSquare74;
    EditText etSquare75;
    EditText etSquare76;
    EditText etSquare77;
    EditText etSquare78;
    EditText etSquare79;
    EditText etSquare80;
    EditText etSquare81;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        tvInstructions = findViewById(R.id.instructions);
        tvInvalidSudoku = findViewById(R.id.invalidSudoku);
        tvEmptySudoku = findViewById(R.id.emptySudoku);
        tvUnsolvedSudoku = findViewById(R.id.notSolved);
        btnSolve=findViewById(R.id.buttonSolve);
        btnClear=findViewById(R.id.buttonClear);
        etSquare1=findViewById(R.id.square1);
        etSquare2=findViewById(R.id.square2);
        etSquare3=findViewById(R.id.square3);
        etSquare4=findViewById(R.id.square4);
        etSquare5=findViewById(R.id.square5);
        etSquare6=findViewById(R.id.square6);
        etSquare7=findViewById(R.id.square7);
        etSquare8=findViewById(R.id.square8);
        etSquare9=findViewById(R.id.square9);
        etSquare10=findViewById(R.id.square10);
        etSquare11=findViewById(R.id.square11);
        etSquare12=findViewById(R.id.square12);
        etSquare13=findViewById(R.id.square13);
        etSquare14=findViewById(R.id.square14);
        etSquare15=findViewById(R.id.square15);
        etSquare16=findViewById(R.id.square16);
        etSquare17=findViewById(R.id.square17);
        etSquare18=findViewById(R.id.square18);
        etSquare19=findViewById(R.id.square19);
        etSquare20=findViewById(R.id.square20);
        etSquare21=findViewById(R.id.square21);
        etSquare22=findViewById(R.id.square22);
        etSquare23=findViewById(R.id.square23);
        etSquare24=findViewById(R.id.square24);
        etSquare25=findViewById(R.id.square25);
        etSquare26=findViewById(R.id.square26);
        etSquare27=findViewById(R.id.square27);
        etSquare28=findViewById(R.id.square28);
        etSquare29=findViewById(R.id.square29);
        etSquare30=findViewById(R.id.square30);
        etSquare31=findViewById(R.id.square31);
        etSquare32=findViewById(R.id.square32);
        etSquare33=findViewById(R.id.square33);
        etSquare34=findViewById(R.id.square34);
        etSquare35=findViewById(R.id.square35);
        etSquare36=findViewById(R.id.square36);
        etSquare37=findViewById(R.id.square37);
        etSquare38=findViewById(R.id.square38);
        etSquare39=findViewById(R.id.square39);
        etSquare40=findViewById(R.id.square40);
        etSquare41=findViewById(R.id.square41);
        etSquare42=findViewById(R.id.square42);
        etSquare43=findViewById(R.id.square43);
        etSquare44=findViewById(R.id.square44);
        etSquare45=findViewById(R.id.square45);
        etSquare46=findViewById(R.id.square46);
        etSquare47=findViewById(R.id.square47);
        etSquare48=findViewById(R.id.square48);
        etSquare49=findViewById(R.id.square49);
        etSquare50=findViewById(R.id.square50);
        etSquare51=findViewById(R.id.square51);
        etSquare52=findViewById(R.id.square52);
        etSquare53=findViewById(R.id.square53);
        etSquare54=findViewById(R.id.square54);
        etSquare55=findViewById(R.id.square55);
        etSquare56=findViewById(R.id.square56);
        etSquare57=findViewById(R.id.square57);
        etSquare58=findViewById(R.id.square58);
        etSquare59=findViewById(R.id.square59);
        etSquare60=findViewById(R.id.square60);
        etSquare61=findViewById(R.id.square61);
        etSquare62=findViewById(R.id.square62);
        etSquare63=findViewById(R.id.square63);
        etSquare64=findViewById(R.id.square64);
        etSquare65=findViewById(R.id.square65);
        etSquare66=findViewById(R.id.square66);
        etSquare67=findViewById(R.id.square67);
        etSquare68=findViewById(R.id.square68);
        etSquare69=findViewById(R.id.square69);
        etSquare70=findViewById(R.id.square70);
        etSquare71=findViewById(R.id.square71);
        etSquare72=findViewById(R.id.square72);
        etSquare73=findViewById(R.id.square73);
        etSquare74=findViewById(R.id.square74);
        etSquare75=findViewById(R.id.square75);
        etSquare76=findViewById(R.id.square76);
        etSquare77=findViewById(R.id.square77);
        etSquare78=findViewById(R.id.square78);
        etSquare79=findViewById(R.id.square79);
        etSquare80=findViewById(R.id.square80);
        etSquare81=findViewById(R.id.square81);

        btnSolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //each number is retrieved and put into an array to be able to use an object Sudoku
                int[] sudoku = new int[81];
                sudoku[0]=getNumber(etSquare1);
                sudoku[1]=getNumber(etSquare2);
                sudoku[2]=getNumber(etSquare3);
                sudoku[3]=getNumber(etSquare4);
                sudoku[4]=getNumber(etSquare5);
                sudoku[5]=getNumber(etSquare6);
                sudoku[6]=getNumber(etSquare7);
                sudoku[7]=getNumber(etSquare8);
                sudoku[8]=getNumber(etSquare9);
                sudoku[9]=getNumber(etSquare10);
                sudoku[10]=getNumber(etSquare11);
                sudoku[11]=getNumber(etSquare12);
                sudoku[12]=getNumber(etSquare13);
                sudoku[13]=getNumber(etSquare14);
                sudoku[14]=getNumber(etSquare15);
                sudoku[15]=getNumber(etSquare16);
                sudoku[16]=getNumber(etSquare17);
                sudoku[17]=getNumber(etSquare18);
                sudoku[18]=getNumber(etSquare19);
                sudoku[19]=getNumber(etSquare20);
                sudoku[20]=getNumber(etSquare21);
                sudoku[21]=getNumber(etSquare22);
                sudoku[22]=getNumber(etSquare23);
                sudoku[23]=getNumber(etSquare24);
                sudoku[24]=getNumber(etSquare25);
                sudoku[25]=getNumber(etSquare26);
                sudoku[26]=getNumber(etSquare27);
                sudoku[27]=getNumber(etSquare28);
                sudoku[28]=getNumber(etSquare29);
                sudoku[29]=getNumber(etSquare30);
                sudoku[30]=getNumber(etSquare31);
                sudoku[31]=getNumber(etSquare32);
                sudoku[32]=getNumber(etSquare33);
                sudoku[33]=getNumber(etSquare34);
                sudoku[34]=getNumber(etSquare35);
                sudoku[35]=getNumber(etSquare36);
                sudoku[36]=getNumber(etSquare37);
                sudoku[37]=getNumber(etSquare38);
                sudoku[38]=getNumber(etSquare39);
                sudoku[39]=getNumber(etSquare40);
                sudoku[40]=getNumber(etSquare41);
                sudoku[41]=getNumber(etSquare42);
                sudoku[42]=getNumber(etSquare43);
                sudoku[43]=getNumber(etSquare44);
                sudoku[44]=getNumber(etSquare45);
                sudoku[45]=getNumber(etSquare46);
                sudoku[46]=getNumber(etSquare47);
                sudoku[47]=getNumber(etSquare48);
                sudoku[48]=getNumber(etSquare49);
                sudoku[49]=getNumber(etSquare50);
                sudoku[50]=getNumber(etSquare51);
                sudoku[51]=getNumber(etSquare52);
                sudoku[52]=getNumber(etSquare53);
                sudoku[53]=getNumber(etSquare54);
                sudoku[54]=getNumber(etSquare55);
                sudoku[55]=getNumber(etSquare56);
                sudoku[56]=getNumber(etSquare57);
                sudoku[57]=getNumber(etSquare58);
                sudoku[58]=getNumber(etSquare59);
                sudoku[59]=getNumber(etSquare60);
                sudoku[60]=getNumber(etSquare61);
                sudoku[61]=getNumber(etSquare62);
                sudoku[62]=getNumber(etSquare63);
                sudoku[63]=getNumber(etSquare64);
                sudoku[64]=getNumber(etSquare65);
                sudoku[65]=getNumber(etSquare66);
                sudoku[66]=getNumber(etSquare67);
                sudoku[67]=getNumber(etSquare68);
                sudoku[68]=getNumber(etSquare69);
                sudoku[69]=getNumber(etSquare70);
                sudoku[70]=getNumber(etSquare71);
                sudoku[71]=getNumber(etSquare72);
                sudoku[72]=getNumber(etSquare73);
                sudoku[73]=getNumber(etSquare74);
                sudoku[74]=getNumber(etSquare75);
                sudoku[75]=getNumber(etSquare76);
                sudoku[76]=getNumber(etSquare77);
                sudoku[77]=getNumber(etSquare78);
                sudoku[78]=getNumber(etSquare79);
                sudoku[79]=getNumber(etSquare80);
                sudoku[80]=getNumber(etSquare81);

                //we create the object
                Sudoku sudokuToSolve = new Sudoku(sudoku);

                //we want verify that the sudoku is not empty
                if(sudokuToSolve.isSudokuEmpty()){
                    tvEmptySudoku.setVisibility(View.VISIBLE);
                }else {
                    //if it is not we solve it
                    sudoku = sudokuToSolve.solveSudoku();

                    //if the sudoku returned is null, it was invalid
                    if (sudoku == null) {
                        tvInvalidSudoku.setVisibility(View.VISIBLE);
                    }
                    else {
                        //the sudoku could not be completely solved
                        //we want to show the numbers after anyway
                        if(!sudokuToSolve.isSolved()){
                            tvUnsolvedSudoku.setVisibility(View.VISIBLE);
                        }

                        showNumber(sudoku[0], etSquare1);
                        showNumber(sudoku[1], etSquare2);
                        showNumber(sudoku[2], etSquare3);
                        showNumber(sudoku[3], etSquare4);
                        showNumber(sudoku[4], etSquare5);
                        showNumber(sudoku[5], etSquare6);
                        showNumber(sudoku[6], etSquare7);
                        showNumber(sudoku[7], etSquare8);
                        showNumber(sudoku[8], etSquare9);
                        showNumber(sudoku[9], etSquare10);
                        showNumber(sudoku[10], etSquare11);
                        showNumber(sudoku[11], etSquare12);
                        showNumber(sudoku[12], etSquare13);
                        showNumber(sudoku[13], etSquare14);
                        showNumber(sudoku[14], etSquare15);
                        showNumber(sudoku[15], etSquare16);
                        showNumber(sudoku[16], etSquare17);
                        showNumber(sudoku[17], etSquare18);
                        showNumber(sudoku[18], etSquare19);
                        showNumber(sudoku[19], etSquare20);
                        showNumber(sudoku[20], etSquare21);
                        showNumber(sudoku[21], etSquare22);
                        showNumber(sudoku[22], etSquare23);
                        showNumber(sudoku[23], etSquare24);
                        showNumber(sudoku[24], etSquare25);
                        showNumber(sudoku[25], etSquare26);
                        showNumber(sudoku[26], etSquare27);
                        showNumber(sudoku[27], etSquare28);
                        showNumber(sudoku[28], etSquare29);
                        showNumber(sudoku[29], etSquare30);
                        showNumber(sudoku[30], etSquare31);
                        showNumber(sudoku[31], etSquare32);
                        showNumber(sudoku[32], etSquare33);
                        showNumber(sudoku[33], etSquare34);
                        showNumber(sudoku[34], etSquare35);
                        showNumber(sudoku[35], etSquare36);
                        showNumber(sudoku[36], etSquare37);
                        showNumber(sudoku[37], etSquare38);
                        showNumber(sudoku[38], etSquare39);
                        showNumber(sudoku[39], etSquare40);
                        showNumber(sudoku[40], etSquare41);
                        showNumber(sudoku[41], etSquare42);
                        showNumber(sudoku[42], etSquare43);
                        showNumber(sudoku[43], etSquare44);
                        showNumber(sudoku[44], etSquare45);
                        showNumber(sudoku[45], etSquare46);
                        showNumber(sudoku[46], etSquare47);
                        showNumber(sudoku[47], etSquare48);
                        showNumber(sudoku[48], etSquare49);
                        showNumber(sudoku[49], etSquare50);
                        showNumber(sudoku[50], etSquare51);
                        showNumber(sudoku[51], etSquare52);
                        showNumber(sudoku[52], etSquare53);
                        showNumber(sudoku[53], etSquare54);
                        showNumber(sudoku[54], etSquare55);
                        showNumber(sudoku[55], etSquare56);
                        showNumber(sudoku[56], etSquare57);
                        showNumber(sudoku[57], etSquare58);
                        showNumber(sudoku[58], etSquare59);
                        showNumber(sudoku[59], etSquare60);
                        showNumber(sudoku[60], etSquare61);
                        showNumber(sudoku[61], etSquare62);
                        showNumber(sudoku[62], etSquare63);
                        showNumber(sudoku[63], etSquare64);
                        showNumber(sudoku[64], etSquare65);
                        showNumber(sudoku[65], etSquare66);
                        showNumber(sudoku[66], etSquare67);
                        showNumber(sudoku[67], etSquare68);
                        showNumber(sudoku[68], etSquare69);
                        showNumber(sudoku[69], etSquare70);
                        showNumber(sudoku[70], etSquare71);
                        showNumber(sudoku[71], etSquare72);
                        showNumber(sudoku[72], etSquare73);
                        showNumber(sudoku[73], etSquare74);
                        showNumber(sudoku[74], etSquare75);
                        showNumber(sudoku[75], etSquare76);
                        showNumber(sudoku[76], etSquare77);
                        showNumber(sudoku[77], etSquare78);
                        showNumber(sudoku[78], etSquare79);
                        showNumber(sudoku[79], etSquare80);
                        showNumber(sudoku[80], etSquare81);
                    }
                }
                btnSolve.setVisibility(View.INVISIBLE);
                btnClear.setVisibility(View.VISIBLE);

            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //we hide the error messages that could be there
                tvInvalidSudoku.setVisibility(View.INVISIBLE);
                tvEmptySudoku.setVisibility(View.INVISIBLE);
                tvUnsolvedSudoku.setVisibility(View.INVISIBLE);

                etSquare1.setText("");
                etSquare2.setText("");
                etSquare3.setText("");
                etSquare4.setText("");
                etSquare5.setText("");
                etSquare6.setText("");
                etSquare7.setText("");
                etSquare8.setText("");
                etSquare9.setText("");
                etSquare10.setText("");
                etSquare11.setText("");
                etSquare12.setText("");
                etSquare13.setText("");
                etSquare14.setText("");
                etSquare15.setText("");
                etSquare16.setText("");
                etSquare17.setText("");
                etSquare18.setText("");
                etSquare19.setText("");
                etSquare20.setText("");
                etSquare21.setText("");
                etSquare22.setText("");
                etSquare23.setText("");
                etSquare24.setText("");
                etSquare25.setText("");
                etSquare26.setText("");
                etSquare27.setText("");
                etSquare28.setText("");
                etSquare29.setText("");
                etSquare30.setText("");
                etSquare31.setText("");
                etSquare32.setText("");
                etSquare33.setText("");
                etSquare34.setText("");
                etSquare35.setText("");
                etSquare36.setText("");
                etSquare37.setText("");
                etSquare38.setText("");
                etSquare39.setText("");
                etSquare40.setText("");
                etSquare41.setText("");
                etSquare42.setText("");
                etSquare43.setText("");
                etSquare44.setText("");
                etSquare45.setText("");
                etSquare46.setText("");
                etSquare47.setText("");
                etSquare48.setText("");
                etSquare49.setText("");
                etSquare50.setText("");
                etSquare51.setText("");
                etSquare52.setText("");
                etSquare53.setText("");
                etSquare54.setText("");
                etSquare55.setText("");
                etSquare56.setText("");
                etSquare57.setText("");
                etSquare58.setText("");
                etSquare59.setText("");
                etSquare60.setText("");
                etSquare61.setText("");
                etSquare62.setText("");
                etSquare63.setText("");
                etSquare64.setText("");
                etSquare65.setText("");
                etSquare66.setText("");
                etSquare67.setText("");
                etSquare68.setText("");
                etSquare69.setText("");
                etSquare70.setText("");
                etSquare71.setText("");
                etSquare72.setText("");
                etSquare73.setText("");
                etSquare74.setText("");
                etSquare75.setText("");
                etSquare76.setText("");
                etSquare77.setText("");
                etSquare78.setText("");
                etSquare79.setText("");
                etSquare80.setText("");
                etSquare81.setText("");

                btnClear.setVisibility(View.INVISIBLE);
                btnSolve.setVisibility(View.VISIBLE);
            }
        });

    }
    public static int getNumber(EditText et){
        String text = et.getText().toString().trim();
        int number;
        if(text.matches("")){
            number=0;
        }else{
            number = Integer.parseInt(text);
        }
        return number;
    }
    public static void showNumber(int number, EditText et){
        if(number==0){
            et.setText("");
        }else {
            String text = "" + number;
            et.setText(text);
            et.setVisibility(View.VISIBLE);
        }
    }
}
