package br.com.senac.mybike;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapterBike extends RecyclerView.Adapter<MyAdapterBike.ViewHolder> {

    Context context;
    List<Bike> lstBike;

    //Criando o construtor da classe Adaptadora - alt+insert
    public MyAdapterBike(Context context, List<Bike> lstBike) {
        this.context = context;
        this.lstBike = lstBike;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Intancia a janela modelo

        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_bike,null);

        // intanciancoa classe Viewholder

        ViewHolder holder = new ViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //inserir os valores nos componetes do modelo
        holder.txtTitulo.setText(lstBike.get(position).getTitulo());
        holder.txtPreco.setText(lstBike.get(position).getPreco());
        holder.txtDisp.setText(lstBike.get(position).getDisponivel());
        holder.imgBike.setImageResource(lstBike.get(position).getImagemBike());



    }

    //Quantos itens vaina lista
    @Override
    public int getItemCount() {
        return  lstBike.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitulo, txtPreco,txtDisp;
        ImageView imgBike;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtTitulo = itemView.findViewById(R.id.txtModeloTituloBike);
            txtPreco = itemView.findViewById(R.id.txtModeloPrecoBike);
            txtDisp = itemView.findViewById(R.id.txtModeloDisponivelBike);

            imgBike = itemView.findViewById(R.id.imgModeloBike);
        }
    }


}
