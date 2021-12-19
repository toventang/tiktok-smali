package com.ss.android.ttve.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public class VETrackParams implements Parcelable {
    public static final Parcelable.Creator<VETrackParams> CREATOR = new Parcelable.Creator<VETrackParams>() {
        /* class com.ss.android.ttve.model.VETrackParams.AnonymousClass1 */

        static {
            Covode.recordClassIndex(37661);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VETrackParams[] newArray(int i2) {
            return new VETrackParams[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VETrackParams createFromParcel(Parcel parcel) {
            return new VETrackParams(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public List<String> f61151a;

    /* renamed from: b  reason: collision with root package name */
    public List<Integer> f61152b;

    /* renamed from: c  reason: collision with root package name */
    public List<Integer> f61153c;

    /* renamed from: d  reason: collision with root package name */
    public List<Integer> f61154d;

    /* renamed from: e  reason: collision with root package name */
    public List<Integer> f61155e;

    /* renamed from: f  reason: collision with root package name */
    public List<Double> f61156f;

    /* renamed from: g  reason: collision with root package name */
    public int f61157g;

    /* renamed from: h  reason: collision with root package name */
    public b f61158h;

    /* renamed from: i  reason: collision with root package name */
    public int f61159i;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public VETrackParams f61160a = new VETrackParams((byte) 0);

        static {
            Covode.recordClassIndex(37662);
        }
    }

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(37660);
    }

    private VETrackParams() {
        this.f61157g = -1;
        this.f61158h = b.DEFAULT;
    }

    public enum b {
        DEFAULT,
        HOST,
        External;

        static {
            Covode.recordClassIndex(37663);
        }
    }

    public String toString() {
        return "VETrackParams{paths=" + this.f61151a + ", trimIns=" + this.f61152b + ", trimOuts=" + this.f61153c + ", seqIns=" + this.f61154d + ", seqOuts=" + this.f61155e + ", speeds=" + this.f61156f + ", layer=" + this.f61157g + ", trackPriority=" + this.f61158h + ", extFlag=" + this.f61159i + '}';
    }

    /* synthetic */ VETrackParams(byte b2) {
        this();
    }

    protected VETrackParams(Parcel parcel) {
        b bVar;
        this.f61157g = -1;
        this.f61158h = b.DEFAULT;
        this.f61151a = parcel.createStringArrayList();
        ArrayList arrayList = new ArrayList();
        this.f61152b = arrayList;
        parcel.readList(arrayList, Integer.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.f61153c = arrayList2;
        parcel.readList(arrayList2, Integer.class.getClassLoader());
        ArrayList arrayList3 = new ArrayList();
        this.f61154d = arrayList3;
        parcel.readList(arrayList3, Integer.class.getClassLoader());
        ArrayList arrayList4 = new ArrayList();
        this.f61155e = arrayList4;
        parcel.readList(arrayList4, Integer.class.getClassLoader());
        ArrayList arrayList5 = new ArrayList();
        this.f61156f = arrayList5;
        parcel.readList(arrayList5, Double.class.getClassLoader());
        this.f61157g = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            bVar = null;
        } else {
            bVar = b.values()[readInt];
        }
        this.f61158h = bVar;
        this.f61159i = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int ordinal;
        parcel.writeStringList(this.f61151a);
        parcel.writeList(this.f61152b);
        parcel.writeList(this.f61153c);
        parcel.writeList(this.f61154d);
        parcel.writeList(this.f61155e);
        parcel.writeList(this.f61156f);
        parcel.writeInt(this.f61157g);
        b bVar = this.f61158h;
        if (bVar == null) {
            ordinal = -1;
        } else {
            ordinal = bVar.ordinal();
        }
        parcel.writeInt(ordinal);
        parcel.writeInt(this.f61159i);
    }
}
