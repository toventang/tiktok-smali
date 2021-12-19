package com.ss.android.ugc.aweme.sticker;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;

public final class PlDataBean implements Parcelable, Serializable {
    public static final Parcelable.Creator<PlDataBean> CREATOR = new a();
    @c(a = "albumFilter")
    private int albumFilter;
    @c(a = "alg")
    private ArrayList<String> alg;
    @c(a = "face_count_max")
    private int faceCountMax;
    @c(a = "face_count_min")
    private int faceCountMin;
    @c(a = "guide")
    private boolean guide;
    @c(a = "imgK")
    private String imgK;
    @c(a = "loading")
    private boolean loading;
    @c(a = "max_count")
    private int maxCount;
    @c(a = "min_count")
    private int minCount;
    @c(a = "relation")
    private String relation;

    static {
        Covode.recordClassIndex(88026);
    }

    public PlDataBean() {
        this(null, null, null, false, false, 0, 0, 0, 0, 0, 1023, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        ArrayList<String> arrayList = this.alg;
        parcel.writeInt(arrayList.size());
        for (String str : arrayList) {
            parcel.writeString(str);
        }
        parcel.writeString(this.relation);
        parcel.writeString(this.imgK);
        parcel.writeInt(this.loading ? 1 : 0);
        parcel.writeInt(this.guide ? 1 : 0);
        parcel.writeInt(this.albumFilter);
        parcel.writeInt(this.faceCountMin);
        parcel.writeInt(this.faceCountMax);
        parcel.writeInt(this.minCount);
        parcel.writeInt(this.maxCount);
    }

    public final int getAlbumFilter() {
        return this.albumFilter;
    }

    public final ArrayList<String> getAlg() {
        return this.alg;
    }

    public final int getFaceCountMax() {
        return this.faceCountMax;
    }

    public final int getFaceCountMin() {
        return this.faceCountMin;
    }

    public final boolean getGuide() {
        return this.guide;
    }

    public final String getImgK() {
        return this.imgK;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final int getMinCount() {
        return this.minCount;
    }

    public final String getRelation() {
        return this.relation;
    }

    public static class a implements Parcelable.Creator<PlDataBean> {
        static {
            Covode.recordClassIndex(88027);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PlDataBean[] newArray(int i2) {
            return new PlDataBean[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PlDataBean createFromParcel(Parcel parcel) {
            String readString;
            l.d(parcel, "");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (true) {
                readString = parcel.readString();
                if (readInt == 0) {
                    break;
                }
                arrayList.add(readString);
                readInt--;
            }
            String readString2 = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new PlDataBean(arrayList, readString, readString2, z2, z, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
    }

    public final void setAlbumFilter(int i2) {
        this.albumFilter = i2;
    }

    public final void setFaceCountMax(int i2) {
        this.faceCountMax = i2;
    }

    public final void setFaceCountMin(int i2) {
        this.faceCountMin = i2;
    }

    public final void setGuide(boolean z) {
        this.guide = z;
    }

    public final void setImgK(String str) {
        this.imgK = str;
    }

    public final void setLoading(boolean z) {
        this.loading = z;
    }

    public final void setMaxCount(int i2) {
        this.maxCount = i2;
    }

    public final void setMinCount(int i2) {
        this.minCount = i2;
    }

    public final void setRelation(String str) {
        this.relation = str;
    }

    public final void setAlg(ArrayList<String> arrayList) {
        l.d(arrayList, "");
        this.alg = arrayList;
    }

    public PlDataBean(ArrayList<String> arrayList, String str, String str2, boolean z, boolean z2, int i2, int i3, int i4, int i5, int i6) {
        l.d(arrayList, "");
        this.alg = arrayList;
        this.relation = str;
        this.imgK = str2;
        this.loading = z;
        this.guide = z2;
        this.albumFilter = i2;
        this.faceCountMin = i3;
        this.faceCountMax = i4;
        this.minCount = i5;
        this.maxCount = i6;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlDataBean(ArrayList arrayList, String str, String str2, boolean z, boolean z2, int i2, int i3, int i4, int i5, int i6, int i7, g gVar) {
        this((i7 & 1) != 0 ? new ArrayList() : arrayList, (i7 & 2) != 0 ? null : str, (i7 & 4) == 0 ? str2 : null, (i7 & 8) != 0 ? true : z, (i7 & 16) == 0 ? z2 : true, (i7 & 32) != 0 ? 0 : i2, (i7 & 64) != 0 ? 2 : i3, (i7 & 128) != 0 ? 5 : i4, (i7 & 256) != 0 ? -1 : i5, (i7 & 512) == 0 ? i6 : -1);
    }
}
