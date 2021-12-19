package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.Objects;

public class VEDisplaySettings implements Parcelable {
    public static final Parcelable.Creator<VEDisplaySettings> CREATOR = new Parcelable.Creator<VEDisplaySettings>() {
        /* class com.ss.android.vesdk.VEDisplaySettings.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99131);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEDisplaySettings[] newArray(int i2) {
            return new VEDisplaySettings[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEDisplaySettings createFromParcel(Parcel parcel) {
            return new VEDisplaySettings(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public int f150752a;

    /* renamed from: b  reason: collision with root package name */
    public int f150753b;

    /* renamed from: c  reason: collision with root package name */
    public c f150754c;

    /* renamed from: d  reason: collision with root package name */
    public int f150755d;

    /* renamed from: e  reason: collision with root package name */
    public int f150756e;

    /* renamed from: f  reason: collision with root package name */
    public int f150757f;

    /* renamed from: g  reason: collision with root package name */
    public long f150758g;

    /* renamed from: h  reason: collision with root package name */
    public float f150759h;

    /* renamed from: i  reason: collision with root package name */
    public as f150760i;

    /* renamed from: j  reason: collision with root package name */
    public VESize f150761j;

    /* renamed from: k  reason: collision with root package name */
    public VESize f150762k;

    /* renamed from: l  reason: collision with root package name */
    public VESize f150763l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f150764m;
    public b n;
    public float o;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final VEDisplaySettings f150765a = new VEDisplaySettings((byte) 0);

        static {
            Covode.recordClassIndex(99132);
        }
    }

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99130);
    }

    private VEDisplaySettings() {
        this.f150754c = c.SCALE_MODE_CENTER_INSIDE;
        this.f150762k = new VESize(0, 0);
        this.f150763l = new VESize(0, 0);
        this.f150764m = false;
        this.n = b.NONE;
        this.o = 0.0f;
    }

    public enum b {
        NONE,
        GAUSSIAN_BLUR;

        static {
            Covode.recordClassIndex(99133);
        }
    }

    public enum c {
        SCALE_MODE_CENTER_CROP,
        SCALE_MODE_CENTER_INSIDE,
        SCALE_MODE_FIT_FULL,
        SCALE_MODE_USER_DEF;

        static {
            Covode.recordClassIndex(99134);
        }
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f150752a), Integer.valueOf(this.f150753b), this.f150754c, Integer.valueOf(this.f150755d), Integer.valueOf(this.f150756e), Integer.valueOf(this.f150757f), Long.valueOf(this.f150758g), Float.valueOf(this.f150759h), this.f150760i, this.f150761j, this.f150762k, this.f150763l, Boolean.valueOf(this.f150764m), this.n, Float.valueOf(this.o));
    }

    public String toString() {
        return "VEDisplaySettings{mTranslateX=" + this.f150752a + ", mTranslateY=" + this.f150753b + ", mFitMode=" + this.f150754c + ", mRotation=" + this.f150755d + ", mBgColor=" + this.f150758g + ", mDisplayRatio=" + this.f150759h + ", mDisplayRatioMode=" + this.f150760i + ", mRenderSize=" + this.f150761j + ", mLayoutSize=" + this.f150762k + ", mEffect=" + this.n + ", mEffectIntensity=" + this.o + '}';
    }

    /* synthetic */ VEDisplaySettings(byte b2) {
        this();
    }

    protected VEDisplaySettings(Parcel parcel) {
        c cVar;
        this.f150754c = c.SCALE_MODE_CENTER_INSIDE;
        this.f150762k = new VESize(0, 0);
        this.f150763l = new VESize(0, 0);
        this.f150764m = false;
        this.n = b.NONE;
        this.o = 0.0f;
        this.f150752a = parcel.readInt();
        this.f150753b = parcel.readInt();
        int readInt = parcel.readInt();
        as asVar = null;
        if (readInt == -1) {
            cVar = null;
        } else {
            cVar = c.values()[readInt];
        }
        this.f150754c = cVar;
        this.f150755d = parcel.readInt();
        this.f150756e = parcel.readInt();
        this.f150757f = parcel.readInt();
        this.f150758g = (long) parcel.readInt();
        this.f150759h = parcel.readFloat();
        int readInt2 = parcel.readInt();
        this.f150760i = readInt2 != -1 ? as.values()[readInt2] : asVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VEDisplaySettings vEDisplaySettings = (VEDisplaySettings) obj;
            if (this.f150752a == vEDisplaySettings.f150752a && this.f150753b == vEDisplaySettings.f150753b && this.f150755d == vEDisplaySettings.f150755d && this.f150756e == vEDisplaySettings.f150756e && this.f150757f == vEDisplaySettings.f150757f && this.f150758g == vEDisplaySettings.f150758g && Float.compare(vEDisplaySettings.f150759h, this.f150759h) == 0 && this.f150764m == vEDisplaySettings.f150764m && Float.compare(vEDisplaySettings.o, this.o) == 0 && this.f150754c == vEDisplaySettings.f150754c && this.f150760i == vEDisplaySettings.f150760i && this.f150761j.equals(vEDisplaySettings.f150761j) && this.f150762k.equals(vEDisplaySettings.f150762k) && this.f150763l.equals(vEDisplaySettings.f150763l) && this.n == vEDisplaySettings.n) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int ordinal;
        parcel.writeInt(this.f150752a);
        parcel.writeInt(this.f150753b);
        c cVar = this.f150754c;
        int i3 = -1;
        if (cVar == null) {
            ordinal = -1;
        } else {
            ordinal = cVar.ordinal();
        }
        parcel.writeInt(ordinal);
        parcel.writeInt(this.f150755d);
        parcel.writeInt(this.f150756e);
        parcel.writeInt(this.f150757f);
        parcel.writeLong(this.f150758g);
        parcel.writeFloat(this.f150759h);
        as asVar = this.f150760i;
        if (asVar != null) {
            i3 = asVar.ordinal();
        }
        parcel.writeInt(i3);
    }
}
