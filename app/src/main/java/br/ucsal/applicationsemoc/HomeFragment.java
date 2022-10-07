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

public class HomeFragment extends Fragment {


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

        itemsList.add(new Item("APRESENTAÇÃO","A Semana de Mobilização Científica – SEMOC – é uma atividade promovida anualmente pela Universidade Católica do Salvador (UCSAL), integrando a programação regular de atividades do calendário acadêmico desde 1998, sendo organizada e executada com a participação de todos os segmentos da comunidade acadêmica (docentes, discentes e funcionários), e já é uma tradição na cidade do Salvador. \n" +
                "\n" +
                "Dentre seus principais objetivos, a SEMOC pretende estimular e socializar as iniciativas no campo da pesquisa científica e da extensão desenvolvidas na Universidade, contribuir para a conscientização da comunidade acadêmica sobre a importância da integração entre ensino, pesquisa e extensão, promover o intercâmbio intra e interinstitucional em torno da produção do conhecimento e das ações comunitárias, e fomentar a difusão e o fortalecimento da diversidade científica no Estado da Bahia, como também no âmbito nacional e internacional.\n" +
                "\n" +
                "A série SEMOC tem gerado importantes desdobramentos para o fortalecimento da ambiência acadêmica, dentre os quais se inclui o estímulo à sensibilização e mobilização dos diversos segmentos da comunidade universitária, com repercussões na produção e socialização da pesquisa científica, no intercâmbio de atividades culturais, na articulação entre os campi e entre diferentes instituições e na criação e aprofundamento de redes nacionais e  internacionais.\n" +
                "\n" +
                "Neste já tradicional evento anual, docentes, discentes, funcionários, pesquisadores e comunidades realizam atividades diversas em torno das temáticas selecionadas, anualmente, que inclui conferências, mesas redondas, jornadas de pesquisa, debates, apresentações de trabalho, minicursos, oficinas e atividades culturais.\n" +
                "\n" +
                "A sucessão de temáticas centrais da série SEMOC demonstra um encadeamento lógico e tradutor do mérito privilegiado pela UCSal, circunscrito em preocupações explícitas com questões sociais e com princípios basilares de cunho universal, que articula-se, dessa forma, com a proposta pedagógica institucional, como, também, evidencia a tendência de colocar no centro dos debates temas de ampla abrangência científica e de abordagem interdisciplinar. \n" +
                "\n" +
                "A cultura institucional de integração das diferentes áreas do conhecimento alicerça o portfólio acadêmico da UCSal. Para a 25ª edição, a SEMOC traz como temática central “Educação Inclusiva”, que possibilita experienciar a indissociabilidade entre ensino, pesquisa e extensão e entre as grandes áreas do conhecimento:  Ciências Exatas e da Terra, Ciências Naturais, Engenharia / Tecnologia, Ciências da Saúde, Ciências Agrárias, Ciências Sociais, Ciências Humanas, Linguística, Letras e Artes. \n" +
                "\n" +
                "Este tema se sincroniza, assim, com a diretriz institucional de pautar agendas que privilegiam reflexões de relevância social, que sejam efetivas e inovadoras na perspectiva de soluções para problemas reais que afetam a vida humana, sempre enriquecidas por abordagens multidisciplinares, que abrangem as várias concepções de produção do conhecimento."));

        itemsList.add(new Item("COMISSÃO ORGANIZADORA E EXECUTIVA","Comitê Executivo \n" +
                "\n" +
                "Profa. Dra. Silvana Sá de Carvalho PPGTAS)\n" +
                "Profª Drª. Kátia Oliver (PPGPSC)\n" +
                "Prof Dr. Tagore Trajano (PPGD)\n" +
                "Profª. Drª.Liana Oliveira(PPGTAS)\n" +
                "Profª Drª. Sumaia Midlej (PPGFSC)\n" +
                "Prof. Dr. Moacir Tinôco (PPGTAS)\n" +
                "Matheus Oliveira (PPGPSC)\n" +
                "\n" +
                "Comitê de Organização\n" +
                "\n" +
                "Profª Léa Maria Bonfim Medeiros e Ana Cláudia Souza (Extensão)\n" +
                "Tatiana Oliveira e Chris Cerqueira (Assessoria de Comunicação – Ascom)\n" +
                "Lucas Peixinho (Administração Campus)\n" +
                "Linda Gomes (Biblioteca)\n" +
                "\n" +
                "Subcomitê por Eixo Temático\n" +
                "\n" +
                "Eixo 1: Profª Drª. Kátia Oliver – Coordenação do PPGPSC\n" +
                "\n" +
                "Eixo 2 : Prof Dr. Tagore Trajano – Coordenação do PPGD\n" +
                "\n" +
                "Eixo 3 :Profª. Drª. Maina Pirajá – Coordenação do PPGTAS\n" +
                "\n" +
                "Eixo 4 :Prof Dr. Tagore Trajano – Coordenação do PPGD\n" +
                "\n" +
                "Eixo 5 :Profª Drª. Sumaia Midlej – Coordenação do PPGFSC"));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = v.findViewById(R.id.recycle_view_content);
        itemsList = new ArrayList<>();


        setUserInfo();
        setAdpter();

        return v;
    }
}
