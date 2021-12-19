package dmt.av.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VEPreviewMusicParams implements Parcelable {
    public static final Parcelable.Creator<VEPreviewMusicParams> CREATOR = new Parcelable.Creator<VEPreviewMusicParams>() {
        /* class dmt.av.video.VEPreviewMusicParams.AnonymousClass1 */

        static {
            Covode.recordClassIndex(104100);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEPreviewMusicParams[] newArray(int i2) {
            return new VEPreviewMusicParams[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEPreviewMusicParams createFromParcel(Parcel parcel) {
            return new VEPreviewMusicParams(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public String f156736a;

    /* renamed from: b  reason: collision with root package name */
    public int f156737b;

    /* renamed from: c  reason: collision with root package name */
    public int f156738c;

    /* renamed from: d  reason: collision with root package name */
    public int f156739d;

    /* renamed from: e  reason: collision with root package name */
    public float f156740e;

    /* renamed from: f  reason: collision with root package name */
    public String f156741f;

    /* renamed from: g  reason: collision with root package name */
    public float f156742g;

    /* renamed from: h  reason: collision with root package name */
    public int f156743h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f156744i;

    /* renamed from: j  reason: collision with root package name */
    public int f156745j;

    /* renamed from: k  reason: collision with root package name */
    public int f156746k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f156747l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f156748m;
    public int n;
    public double o;
    public double p;
    public double q;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(104099);
    }

    public VEPreviewMusicParams() {
        this.f156743h = 1;
        this.f156740e = 1.0f;
    }

    public String toString() {
        return "VEPreviewMusicParams{mPath='" + this.f156736a + '\'' + ", mInPoint=" + this.f156737b + ", mDuration=" + this.f156738c + ", mVolume=" + this.f156740e + ", previewStartTime=" + this.f156742g + ", bgmdelay=" + this.n + '}';
    }

    protected VEPreviewMusicParams(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.f156743h = 1;
        this.f156736a = parcel.readString();
        this.f156737b = parcel.readInt();
        this.f156738c = parcel.readInt();
        this.f156740e = parcel.readFloat();
        this.f156741f = parcel.readString();
        this.f156743h = parcel.readInt();
        this.f156742g = parcel.readFloat();
        if (parcel.readByte() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f156744i = z;
        this.f156745j = parcel.readInt();
        this.f156746k = parcel.readInt();
        this.f156747l = parcel.readByte() != 1 ? false : z2;
        this.n = parcel.readInt();
        this.o = parcel.readDouble();
        this.p = parcel.readDouble();
        this.q = parcel.readDouble();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f156736a);
        parcel.writeInt(this.f156737b);
        parcel.writeInt(this.f156738c);
        parcel.writeFloat(this.f156740e);
        parcel.writeString(this.f156741f);
        parcel.writeInt(this.f156743h);
        parcel.writeFloat(this.f156742g);
        parcel.writeInt(this.f156744i ? 1 : 0);
        parcel.writeInt(this.f156745j);
        parcel.writeInt(this.f156746k);
        parcel.writeByte(this.f156747l ? (byte) 1 : 0);
        parcel.writeInt(this.n);
        parcel.writeDouble(this.o);
        parcel.writeDouble(this.p);
        parcel.writeDouble(this.q);
    }
}
