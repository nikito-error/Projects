package holders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kontrolno_2_18621695.R;

public class MovieHolder extends RecyclerView.ViewHolder{
    TextView tittle;
    TextView genre;
    TextView price;
    TextView br;

    public TextView getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle.setText(tittle);
    }

    public TextView getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre.setText(genre);
    }

    public TextView getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price.setText(Float.toString(price));
    }

    public TextView getBr() {
        return br;
    }

    public void setBr(Integer br) {
        this.br.setText(Integer.toString(br));
    }

    public MovieHolder(@NonNull View itemView) {
        super(itemView);
        tittle=itemView.findViewById(R.id.tittle);
        genre=itemView.findViewById(R.id.genre);
        price=itemView.findViewById(R.id.price);
        br=itemView.findViewById(R.id.br);
    }
}
