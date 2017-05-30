package com.codepolitan.primawan.dotaleague;

import android.os.Parcel;
import android.os.Parcelable;

public class Tim implements Parcelable {
    String nama;
    int idLogo;

    public Tim(String nama, int idLogo) {
        this.nama = nama;
        this.idLogo = idLogo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getIdLogo() {
        return idLogo;
    }

    public void setIdLogo(int idLogo) {
        this.idLogo = idLogo;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeInt(this.idLogo);
    }

    protected Tim(Parcel in) {
        this.nama = in.readString();
        this.idLogo = in.readInt();
    }

    public static final Parcelable.Creator<Tim> CREATOR = new Parcelable.Creator<Tim>() {
        @Override
        public Tim createFromParcel(Parcel source) {
            return new Tim(source);
        }

        @Override
        public Tim[] newArray(int size) {
            return new Tim[size];
        }
    };
}
