package aa.bb.demorecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter
extends RecyclerView.Adapter<CustomAdapter.myViewHolder>
{


    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View V= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent  ,false);
        return new myViewHolder(V);

    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.txtNom.setText(Animal.getLstAnimals().get(position).getNom());
        holder.img.setImageResource(Animal.getLstAnimals().get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return Animal.getLstAnimals().size();
    }

    //classe interne
    public class myViewHolder extends  RecyclerView.ViewHolder{

        private TextView txtNom;
        private ImageView img;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNom=(TextView) itemView.findViewById(R.id.txtNom);
            img=(ImageView) itemView.findViewById(R.id.img);
        }

       }
}
