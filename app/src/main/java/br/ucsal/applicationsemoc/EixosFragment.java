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

public class EixosFragment extends Fragment {


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


        itemsList.add(new Item("Eixos Tematicos", "Eixo 1: Racismo Ambiental, Refugiados Ambientais, Politícas Públicas e Inclusão Social\n" +
                "\n" +
                "Eixo 2 : Diversidade, Alteridade e Educação Inclusiva\n" +
                "\n" +
                "Eixo 3 : Povos Tradicionais e o Direito ao Território\n" +
                "\n" +
                "Eixo 4 : Educação Bioética e Direito Universal à Vida\n" +
                "\n" +
                "Eixo 5 : O Papel da Comunidade e da Família na Educação Inclusiva"));

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_eixos, container, false);;

        recyclerView = v.findViewById(R.id.recycleView_Eixos);
        itemsList = new ArrayList<>();


        setUserInfo();
        setAdpter();

        return v;
    }
}
