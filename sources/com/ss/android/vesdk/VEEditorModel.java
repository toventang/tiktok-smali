package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.x;
import java.util.Arrays;

public class VEEditorModel implements Parcelable {
    public static final Parcelable.Creator<VEEditorModel> CREATOR = new Parcelable.Creator<VEEditorModel>() {
        /* class com.ss.android.vesdk.VEEditorModel.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99136);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEEditorModel[] newArray(int i2) {
            return new VEEditorModel[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEEditorModel createFromParcel(Parcel parcel) {
            return new VEEditorModel(parcel);
        }
    };
    public float A;
    public float B;
    public boolean C;
    public x.k D;
    public x.m E;

    /* renamed from: a  reason: collision with root package name */
    public String f150768a;

    /* renamed from: b  reason: collision with root package name */
    public int f150769b;

    /* renamed from: c  reason: collision with root package name */
    public int f150770c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f150771d;

    /* renamed from: e  reason: collision with root package name */
    public x.l f150772e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f150773f;

    /* renamed from: g  reason: collision with root package name */
    public int f150774g;

    /* renamed from: h  reason: collision with root package name */
    public int f150775h;

    /* renamed from: i  reason: collision with root package name */
    public int f150776i;

    /* renamed from: j  reason: collision with root package name */
    public String f150777j;

    /* renamed from: k  reason: collision with root package name */
    public int f150778k;

    /* renamed from: l  reason: collision with root package name */
    public int f150779l;

    /* renamed from: m  reason: collision with root package name */
    public int f150780m;
    public String[] n;
    public String[] o;
    public String[] p;
    public int q;
    public int r;
    public String s;
    public String t;
    public double u;
    public double v;
    public double w;
    public double x;
    public String y;
    public String z;

    public int describeContents() {
        return 0;
    }

    public VEEditorModel() {
    }

    static {
        Covode.recordClassIndex(99135);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"projectXML\":\"").append(this.f150768a).append('\"');
        sb.append(",\"inPoint\":").append(this.f150769b);
        sb.append(",\"outputPoint\":").append(this.f150770c);
        sb.append(",\"reverseDone\":").append(this.f150771d);
        sb.append(",\"videoOutRes\":").append(this.f150772e);
        sb.append(",\"separateAV\":").append(this.f150773f);
        sb.append(",\"masterTrackIndex\":").append(this.f150774g);
        sb.append(",\"hostTrackIndex\":").append(this.f150775h);
        sb.append(",\"audioEffectFilterIndex\":").append(this.f150776i);
        sb.append(",\"modelDir\":\"").append(this.f150777j).append('\"');
        sb.append(",\"colorFilterIndex\":").append(this.f150778k);
        sb.append(",\"effectHDRFilterIndex\":").append(this.f150779l);
        sb.append(",\"mLensHDRFilterIndex\":").append(this.f150780m);
        sb.append(",\"videoPaths\":").append(Arrays.toString(this.n));
        sb.append(",\"audioPaths\":").append(Arrays.toString(this.o));
        sb.append(",\"transitions\":").append(Arrays.toString(this.p));
        sb.append(",\"backgroundColor\":").append(this.q);
        sb.append(",\"videoBackgroundColor\":").append(this.r);
        sb.append(",\"outputFile\":\"").append(this.s).append('\"');
        sb.append(",\"watermarkFile\":\"").append(this.t).append('\"');
        sb.append(",\"watermarkWidth\":").append(this.u);
        sb.append(",\"watermarkHeight\":").append(this.v);
        sb.append(",\"watermarkOffsetX\":").append(this.w);
        sb.append(",\"watermarkOffsetY\":").append(this.x);
        sb.append(",\"colorFilterLeftPath\":\"").append(this.y).append('\"');
        sb.append(",\"colorFilterRightPath\":\"").append(this.z).append('\"');
        sb.append(",\"colorFilterPosition\":").append(this.A);
        sb.append(",\"colorFilterIntensity\":").append(this.B);
        sb.append(",\"useColorFilterResIntensity\":").append(this.C);
        sb.append(",\"videoGravity\":").append(this.D);
        sb.append(",\"videoScaleType\":").append(this.E);
        sb.append('}');
        return sb.toString();
    }

    protected VEEditorModel(Parcel parcel) {
        boolean z2;
        boolean z3;
        this.f150768a = parcel.readString();
        this.f150769b = parcel.readInt();
        this.f150770c = parcel.readInt();
        boolean z4 = false;
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f150771d = z2;
        this.f150772e = x.l.values()[parcel.readInt()];
        if (parcel.readInt() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f150773f = z3;
        this.f150774g = parcel.readInt();
        this.f150775h = parcel.readInt();
        this.f150776i = parcel.readInt();
        this.f150777j = parcel.readString();
        this.f150778k = parcel.readInt();
        this.f150779l = parcel.readInt();
        this.f150780m = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt != -1) {
            String[] strArr = new String[readInt];
            this.n = strArr;
            parcel.readStringArray(strArr);
        } else {
            this.n = null;
        }
        int readInt2 = parcel.readInt();
        if (readInt2 != -1) {
            String[] strArr2 = new String[readInt2];
            this.o = strArr2;
            parcel.readStringArray(strArr2);
        } else {
            this.o = null;
        }
        int readInt3 = parcel.readInt();
        if (readInt3 != -1) {
            String[] strArr3 = new String[readInt3];
            this.p = strArr3;
            parcel.readStringArray(strArr3);
        } else {
            this.p = null;
        }
        this.q = parcel.readInt();
        this.s = parcel.readString();
        this.t = parcel.readString();
        this.u = parcel.readDouble();
        this.v = parcel.readDouble();
        this.w = parcel.readDouble();
        this.x = parcel.readDouble();
        this.y = parcel.readString();
        this.z = parcel.readString();
        this.A = parcel.readFloat();
        this.B = parcel.readFloat();
        this.C = parcel.readInt() == 1 ? true : z4;
        this.D = x.k.values()[parcel.readInt()];
        this.E = x.m.values()[parcel.readInt()];
        this.r = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f150768a);
        parcel.writeInt(this.f150769b);
        parcel.writeInt(this.f150770c);
        parcel.writeInt(this.f150771d ? 1 : 0);
        parcel.writeInt(this.f150772e.ordinal());
        parcel.writeInt(this.f150773f ? 1 : 0);
        parcel.writeInt(this.f150774g);
        parcel.writeInt(this.f150775h);
        parcel.writeInt(this.f150776i);
        parcel.writeString(this.f150777j);
        parcel.writeInt(this.f150778k);
        parcel.writeInt(this.f150779l);
        parcel.writeInt(this.f150780m);
        String[] strArr = this.n;
        if (strArr != null) {
            parcel.writeInt(strArr.length);
            parcel.writeStringArray(this.n);
        } else {
            parcel.writeInt(-1);
        }
        String[] strArr2 = this.o;
        if (strArr2 != null) {
            parcel.writeInt(strArr2.length);
            parcel.writeStringArray(this.o);
        } else {
            parcel.writeInt(-1);
        }
        String[] strArr3 = this.p;
        if (strArr3 != null) {
            parcel.writeInt(strArr3.length);
            parcel.writeStringArray(this.p);
        } else {
            parcel.writeInt(-1);
        }
        parcel.writeInt(this.q);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeDouble(this.u);
        parcel.writeDouble(this.v);
        parcel.writeDouble(this.w);
        parcel.writeDouble(this.x);
        parcel.writeString(this.y);
        parcel.writeString(this.z);
        parcel.writeFloat(this.A);
        parcel.writeFloat(this.B);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeInt(this.D.ordinal());
        parcel.writeInt(this.E.ordinal());
        parcel.writeInt(this.r);
    }
}
