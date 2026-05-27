package com.dubannet.quizadaptadores.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dubannet.quizadaptadores.R;
import com.dubannet.quizadaptadores.clases.Carro;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CarroAdaptador extends RecyclerView.Adapter<CarroAdaptador.ViewHolder> {

    private List<Carro> datos;

    public CarroAdaptador(List<Carro> datos) {
        this.datos = datos;
    }

    @NonNull
    @Override
    public CarroAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_carro,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarroAdaptador.ViewHolder holder, int position) {
        Carro dato = datos.get(position);
        holder.bind(dato);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView txtNombre,txtModelo,txtColor,txtAno;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            img=itemView.findViewById(R.id.imgCarro);
            txtModelo=itemView.findViewById(R.id.txtModelo);
            txtNombre=itemView.findViewById(R.id.txtNombre);
            txtColor=itemView.findViewById(R.id.txtColor);
            txtAno=itemView.findViewById(R.id.txtAno);
        }
        public void bind(Carro dato){
            txtModelo.setText(dato.getModelo());
            txtColor.setText(dato.getColor());
            txtAno.setText(dato.getAno());
            txtNombre.setText(dato.getNombre());
            if (dato.getImg() != null && !dato.getImg().isEmpty()) {
                Picasso.get()
                        .load(dato.getImg())
                        .placeholder(R.drawable.ic_launcher_background)
                        .error(R.drawable.ic_launcher_background)
                        .into(img);
            }

        }
    }
}
