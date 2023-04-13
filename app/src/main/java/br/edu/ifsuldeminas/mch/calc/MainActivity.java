package br.edu.ifsuldeminas.mch.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.congrace.exp4j.Calculable;
import de.congrace.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ifsuldeminas.mch.calc";
    private Button buttonIgual, buttonClear, buttonDelete, buttonVirgula, buttonZero, buttonUm, buttonDois, buttonTres, buttonQuatro, buttonCinco, buttonSeis, buttonSete, buttonOito, buttonNove, buttonAdicao, buttonSub, buttonMulti, buttonDivisao;
    private TextView textViewResultado, textViewUltimaExpressao;
    private String expressao = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResultado = findViewById(R.id.textViewResultadoID);
        textViewUltimaExpressao = findViewById(R.id.textViewUltimaExpressaoID);

        buttonIgual = findViewById(R.id.buttonIgualID);
        buttonClear = findViewById(R.id.buttonResetID);
        buttonDelete = findViewById(R.id.buttonDeleteID);
        buttonVirgula = findViewById(R.id.buttonVirgulaID);
        buttonZero = findViewById(R.id.buttonZeroID);
        buttonUm = findViewById(R.id.buttonUmID);
        buttonDois = findViewById(R.id.buttonDoisID);
        buttonTres = findViewById(R.id.buttonTresID);
        buttonQuatro = findViewById(R.id.buttonQuatroID);
        buttonCinco = findViewById(R.id.buttonCincoID);
        buttonSeis = findViewById(R.id.buttonSeisID);
        buttonSete = findViewById(R.id.buttonSeteID);
        buttonOito = findViewById(R.id.buttonOitoID);
        buttonNove = findViewById(R.id.buttonNoveID);
        buttonAdicao = findViewById(R.id.buttonSomaID);
        buttonSub = findViewById(R.id.buttonSubtracaoID);
        buttonMulti = findViewById(R.id.buttonMultiplicacaoID);
        buttonDivisao = findViewById(R.id.buttonDivisaoID);

        // Botões dos sinais

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(expressao);
                expressao = expressao.substring(0,expressao.length()-1);
                textViewUltimaExpressao.setText(expressao);
                textViewResultado.setText("");
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = "";
                textViewUltimaExpressao.setText("");
                textViewResultado.setText("");
            }
        });

        buttonVirgula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = expressao + ".";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        buttonAdicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = expressao + "+";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = expressao + "-";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = expressao + "*";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        buttonDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = expressao + "/";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        buttonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculable avaliadorExpressao = null;
                try {
                    avaliadorExpressao = new ExpressionBuilder(expressao).build();

                    Double resultado = avaliadorExpressao.calculate();

                    textViewResultado.setText(resultado.toString());
                } catch (Exception e) {
                    Log.d(TAG, e.getMessage());
                }
            }
        });

        // Botões numéricos
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = expressao + "0";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        buttonUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = expressao + "1";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        buttonDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = expressao + "2";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        buttonTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = expressao + "3";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        buttonQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = expressao + "4";
                textViewUltimaExpressao.setText(expressao);
            }
        });
        buttonCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = expressao + "5";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        buttonSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = expressao + "6";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        buttonSete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = expressao + "7";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        buttonOito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = expressao + "8";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        buttonNove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = expressao + "9";
                textViewUltimaExpressao.setText(expressao);
            }
        });
    }
}