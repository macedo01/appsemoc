package br.ucsal.applicationsemoc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdpter extends RecyclerView.Adapter<RecyclerAdpter.MyViewHolder> {

    private ArrayList<Item> itemList;

    public RecyclerAdpter(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView titulo;
        private TextView texto;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.textViewTitle);
            texto = itemView.findViewById(R.id.textViewContent);
        }
    }

    @NonNull
    @Override
    public RecyclerAdpter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items,parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdpter.MyViewHolder holder, int position) {
        String titulo = itemList.get(position).getTitulo();
        String texto = itemList.get(position).getTexto();

        holder.titulo.setText(titulo);
        holder.texto.setText(texto);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
