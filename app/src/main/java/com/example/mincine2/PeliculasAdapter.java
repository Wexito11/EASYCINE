package com.example.mincine2;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PeliculasAdapter extends RecyclerView.Adapter <PeliculasAdapter.ViewHolder> {

    private List<peliculas> peliculasList;

    public PeliculasAdapter(List<peliculas> peliculasList) {
        this.peliculasList = peliculasList;
    }

    @NonNull
    @Override
    public PeliculasAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_pelis, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PeliculasAdapter.ViewHolder holder, int position) {

        holder.textNombrePeliculaCard.setText(peliculasList.get(position).getNombre());
        holder.textCategoriaPeliCard.setText(peliculasList.get(position).getCategoria());
        holder.textDirectorCard.setText(peliculasList.get(position).getDirector());
        holder.imPeliculaCard.setImageResource(peliculasList.get(position).getIdImagen());
        holder.position=holder.getAdapterPosition();

    }

    @Override
    public int getItemCount() {
        return peliculasList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imPeliculaCard;
        private TextView textNombrePeliculaCard, textCategoriaPeliCard, textDirectorCard;
        private int position;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
             imPeliculaCard = itemView.findViewById(R.id.image1pelicard);
             textNombrePeliculaCard = itemView.findViewById(R.id.textNombrePeliculaCard);
             textCategoriaPeliCard = itemView.findViewById(R.id.textCategoriaPeliCard);
             textDirectorCard = itemView.findViewById(R.id.textDirectorCard);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(view.getContext(),DesPeliculas.class);
                    intent.putExtra("nombre", peliculasList.get(position).getNombre());
                    intent.putExtra("categoria", peliculasList.get(position).getCategoria());
                    intent.putExtra("director", peliculasList.get(position).getDirector());
                    intent.putExtra("idImagen", peliculasList.get(position).getIdImagen());
                    view.getContext().startActivity(intent);
                }
            });






        }

    }
}
