 package com.teste.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

  public void gerarNovaFrase(View view){

        String[] frases= {
                "Às vezes as coisas demoram, mas acontecem. O importante é saber esperar e não perder a fé!",
                "Não se preocupe em entender, viver ultrapassa qualquer entendimento.",
                "Só existem dois dias no ano em que nada pode ser feito. Um se chama ontem e o outro se chama amanhã, portanto hoje é o dia certo para amar, acreditar, fazer e principalmente viver.- Dalai Lama",
                "A mudança que você quer está na decisão que você toma.",
                "Viva sua vida com quem te deixa feliz e não com quem você tenha que agradar.",
                "Que o dia seja leve, que a tristeza seja breve e que o dia seja feliz.",
                "A simplicidade é o mais alto grau de sofisticação.",
                "Todo mundo crê em algo. Eu creio que tomarei outra xícara de café.",
                "Pare de reclamar da segunda-feira e aproveite a semana.",
                "Situações difíceis constroem pessoas mais fortes.",
                "Você está vivendo aquilo que precisa viver, isso vai te fazer crescer.",
                "Ninguém é o que já foi. Aceite a mudança.",
                "Um brinde ao que é vivido e não postado.",
                "Situações difíceis constroem pessoas mais fortes.",
                "Você nunca encontrará um arco-íris se estiver olhando para baixo.",
                "Já que é preciso aceitar a vida, que seja então corajosamente.",
                "Pare de reclamar da segunda-feira e aproveite a semana.",
                "Levanta, sacode a poeira, dá a volta por cima.",
                "Respeite sua mente e trate seu corpo com carinho.",
                "Um passo de cada vez. Até meio passo serve. Siga firme, não há motivo para ter pressa.",
                "Toda manhã você tem duas escolhas: continuar dormindo com seus sonhos ou acordar e persegui-los!",

        };
        int num = new Random().nextInt( 21);

      TextView texto =  findViewById(R.id.textResultado);
      texto.setText(frases[num]);
  }

}