package com.ss.android.ugc.aweme.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;

public final class AnchorIcon implements Parcelable {
    public static final Parcelable.Creator<AnchorIcon> CREATOR = new a();
    @c(a = "uri")

    /* renamed from: a  reason: collision with root package name */
    public String f66461a;
    @c(a = "url_list")

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<String> f66462b;

    static {
        Covode.recordClassIndex(40846);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f66461a);
        ArrayList<String> arrayList = this.f66462b;
        if (arrayList != null) {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            for (String str : arrayList) {
                parcel.writeString(str);
            }
            return;
        }
        parcel.writeInt(0);
    }

    public static class a implements Parcelable.Creator<AnchorIcon> {
        static {
            Covode.recordClassIndex(40847);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AnchorIcon[] newArray(int i2) {
            return new AnchorIcon[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AnchorIcon createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            l.d(parcel, "");
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(parcel.readString());
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            return new AnchorIcon(readString, arrayList);
        }
    }

    private /* synthetic */ AnchorIcon() {
        this(null, null);
    }

    public AnchorIcon(String str, ArrayList<String> arrayList) {
        this.f66461a = str;
        this.f66462b = arrayList;
    }
}
