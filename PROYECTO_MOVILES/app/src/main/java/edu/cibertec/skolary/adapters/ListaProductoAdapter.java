package edu.cibertec.skolary.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import edu.cibertec.skolary.R;
import edu.cibertec.skolary.responseDTO.Producto;

public class ListaProductoAdapter extends RecyclerView.Adapter<ListaProductoAdapter.ViewHolder> {

    private ArrayList<Producto>dataset;
    public ListaProductoAdapter(ArrayList<Producto> dataset){
        this.dataset=dataset;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_catalogo,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Producto p = dataset.get(position);
        holder.textView.setText(p.getName());

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView;

        public ViewHolder(View itemView){
            super(itemView);

            imageView = (ImageView)itemView.findViewById(R.id.ivproducto);
            textView = (TextView)itemView.findViewById(R.id.tvnombre);
        }
    }
}
