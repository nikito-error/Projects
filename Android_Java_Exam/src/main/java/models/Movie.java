package models;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private String tittle;
    private String genre;
    private Float cena;
    private int br;
    private String summary;

    public Movie(String tittle, String genre, Float cena, int br, String summary) {
        this.tittle = tittle;
        this.genre = genre;
        this.cena = cena;
        this.br = br;
        this.summary = summary;
    }

    protected Movie(Parcel in) {
        tittle = in.readString();
        genre = in.readString();
        if (in.readByte() == 0) {
            cena = null;
        } else {
            cena = in.readFloat();
        }
        br = in.readInt();
        summary = in.readString();
    }

    @Override
    public String toString() {
        return "Movie{" +
                "tittle='" + tittle + '\'' +
                ", genre='" + genre + '\'' +
                ", cena=" + cena +
                ", br=" + br +
                ", summary='" + summary + '\'' +
                '}';
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Float getCena() {
        return cena;
    }

    public void setCena(Float cena) {
        this.cena = cena;
    }

    public int getBr() {
        return br;
    }

    public void setBr(int br) {
        this.br = br;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(tittle);
        dest.writeString(genre);
        if (cena == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeFloat(cena);
        }
        dest.writeInt(br);
        dest.writeString(summary);
    }
}
