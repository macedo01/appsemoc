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

public class ProgramacaoFragment extends Fragment {


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

        itemsList.add(new Item("Programação", "Confira a programação* que foi preparada neste ano:\n" +
                "\n" +
                "Mesas Redondas – Clique aqui!\n" +
                "\n" +
                "Jornada de Pesquisa – Clique aqui!\n" +
                "\n" +
                "Bate Papo – Clique aqui!\n" +
                "\n" +
                "*A programação poderá ser atualializada a qualquer momento."));

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_programacao, container, false);;

        recyclerView = v.findViewById(R.id.recycleView_Programacao);
        itemsList = new ArrayList<>();


        setUserInfo();
        setAdpter();

        return v;
    }
}
