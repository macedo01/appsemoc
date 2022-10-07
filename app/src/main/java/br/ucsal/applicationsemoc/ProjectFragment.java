package br.ucsal.applicationsemoc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ProjectFragment extends Fragment {


    private ArrayList<Item> itemsList;
    private RecyclerView recyclerView;



    private void setAdpter() {
        RecyclerAdpter adpter = new RecyclerAdpter(itemsList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adpter);

    }

    private void setUserInfo() {

        itemsList.add(new Item("PROJETO","A cultura institucional de integração das diferentes áreas do conhecimento alicerça o portfólio acadêmico da UCSal. Para a 25ª edição, a SEMOC traz como temática central “Educação Inclusiva”, que possibilita experienciar a indissociabilidade entre ensino, pesquisa e extensão e entre as grandes áreas do conhecimento:  Ciências Exatas e da Terra, Ciências Naturais, Engenharia / Tecnologia, Ciências da Saúde, Ciências Agrárias, Ciências Sociais, Ciências Humanas, Linguística, Letras e Artes. \n" +
                "\n" +
                "Este tema se sincroniza, assim, com a diretriz institucional de pautar agendas que privilegiam reflexões de relevância social, que sejam efetivas e inovadoras na perspectiva de soluções para problemas reais que afetam a vida humana, sempre enriquecidas por abordagens multidisciplinares, que abrangem as várias concepções de produção do conhecimento.\n" +
                "\n"  ));

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_project, container, false);

        recyclerView = v.findViewById(R.id.recyclerView_project);
        itemsList = new ArrayList<>();


        setUserInfo();
        setAdpter();

        return v;
    }

}
