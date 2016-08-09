package chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.izabelsilva.ifpbgroupchat.R;

import java.util.ArrayList;
import java.util.List;

public class Contatos extends AppCompatActivity {

    List<String> opcoes;
    ArrayAdapter<String> adaptador;
    ListView lvOpcoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contatos);

        lvOpcoes = (ListView) findViewById(R.id.lista);

        opcoes = new ArrayList<String>();

        opcoes.add("Navegar na Internet");
        opcoes.add("Fazer uma ligação");
        opcoes.add("Sobre");
        opcoes.add("Sair");
//        String[] contatos = new String[]{"fernanda", "nanda", "flavia"};



    }
}
