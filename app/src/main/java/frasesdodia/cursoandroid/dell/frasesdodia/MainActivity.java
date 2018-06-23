package frasesdodia.cursoandroid.dell.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoNovaFrase;
    private TextView textoNovaFrase;
    private ArrayList<String> frases;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.iniciarValores();

        textoNovaFrase = (TextView) findViewById(R.id.texto_nova_frase_id);
        botaoNovaFrase = (Button) findViewById(R.id.botao_nova_frase_id);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                textoNovaFrase.setText(frases.get(r.nextInt(frases.size())));
            }
        });
    }

    private void iniciarValores() {
        frases = new ArrayList<String>();
        frases.add("Não perca a motivação só porque as coisas não estão correndo como o previsto. Adversidade gera sabedoria e é isso que levará você ao sucesso.");
        frases.add("Encare o que fez de errado com motivação, pois é isso que o ajudará a fazer certo da próxima vez.");
        frases.add("As pessoas dizem frequentemente que a motivação não dura. Bem, nem o banho - e é por isso que ele é recomendado diariamente.");
        frases.add("A motivação não acontece por acaso, como tudo na vida você tem de batalhar para a alcançar.");
        frases.add("Você não só tem o direito de ser feliz como também tem a obrigação de lutar para alcançar a felicidade.");
    }
}
