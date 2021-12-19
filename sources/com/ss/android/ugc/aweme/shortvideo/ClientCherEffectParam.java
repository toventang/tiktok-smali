package com.ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class ClientCherEffectParam implements Parcelable, Serializable {
    public static final a CREATOR = new a((byte) 0);
    @c(a = "duration")
    private double[] duration;
    @c(a = "matrix")
    private String[] matrix;
    @c(a = "segUseCher")
    private boolean[] segUseCher;

    static {
        Covode.recordClassIndex(81953);
    }

    public ClientCherEffectParam() {
        this(null, null, null, 7, null);
    }

    public final int describeContents() {
        return 0;
    }

    public static final class a implements Parcelable.Creator<ClientCherEffectParam> {
        static {
            Covode.recordClassIndex(81954);
        }

        private a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ClientCherEffectParam[] newArray(int i2) {
            return new ClientCherEffectParam[i2];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ClientCherEffectParam createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new ClientCherEffectParam(parcel);
        }
    }

    public final double[] getDuration() {
        return this.duration;
    }

    public final String[] getMatrix() {
        return this.matrix;
    }

    public final boolean[] getSegUseCher() {
        return this.segUseCher;
    }

    public final void setDuration(double[] dArr) {
        this.duration = dArr;
    }

    public final void setMatrix(String[] strArr) {
        this.matrix = strArr;
    }

    public final void setSegUseCher(boolean[] zArr) {
        this.segUseCher = zArr;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ClientCherEffectParam(Parcel parcel) {
        this(parcel.createStringArray(), parcel.createDoubleArray(), parcel.createBooleanArray());
        l.d(parcel, "");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeStringArray(this.matrix);
        parcel.writeDoubleArray(this.duration);
        parcel.writeBooleanArray(this.segUseCher);
    }

    public ClientCherEffectParam(String[] strArr, double[] dArr, boolean[] zArr) {
        this.matrix = strArr;
        this.duration = dArr;
        this.segUseCher = zArr;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClientCherEffectParam(String[] strArr, double[] dArr, boolean[] zArr, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : strArr, (i2 & 2) != 0 ? null : dArr, (i2 & 4) != 0 ? null : zArr);
    }
}
