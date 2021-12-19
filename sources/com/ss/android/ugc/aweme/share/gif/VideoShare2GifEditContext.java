package com.ss.android.ugc.aweme.share.gif;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VideoShare2GifEditContext implements Parcelable {
    public static final Parcelable.Creator<VideoShare2GifEditContext> CREATOR = new Parcelable.Creator<VideoShare2GifEditContext>() {
        /* class com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext.AnonymousClass1 */

        static {
            Covode.recordClassIndex(81085);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VideoShare2GifEditContext[] newArray(int i2) {
            return new VideoShare2GifEditContext[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VideoShare2GifEditContext createFromParcel(Parcel parcel) {
            return new VideoShare2GifEditContext(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public String f123488a;

    /* renamed from: b  reason: collision with root package name */
    public String f123489b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f123490c;

    /* renamed from: d  reason: collision with root package name */
    public int f123491d;

    /* renamed from: e  reason: collision with root package name */
    public String f123492e;

    /* renamed from: f  reason: collision with root package name */
    public String f123493f;

    /* renamed from: g  reason: collision with root package name */
    public int f123494g;

    /* renamed from: h  reason: collision with root package name */
    public int f123495h;

    /* renamed from: i  reason: collision with root package name */
    public int f123496i;

    /* renamed from: j  reason: collision with root package name */
    public int f123497j;

    /* renamed from: k  reason: collision with root package name */
    public float f123498k;

    /* renamed from: l  reason: collision with root package name */
    public float f123499l;

    /* renamed from: m  reason: collision with root package name */
    public long f123500m;
    public long n;
    public int o;
    public String p;
    public String q;
    public String r;

    public int describeContents() {
        return 0;
    }

    public VideoShare2GifEditContext() {
    }

    static {
        Covode.recordClassIndex(81084);
    }

    protected VideoShare2GifEditContext(Parcel parcel) {
        boolean z;
        this.f123488a = parcel.readString();
        this.f123489b = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f123490c = z;
        this.f123492e = parcel.readString();
        this.f123494g = parcel.readInt();
        this.f123495h = parcel.readInt();
        this.f123496i = parcel.readInt();
        this.f123497j = parcel.readInt();
        this.f123498k = parcel.readFloat();
        this.f123499l = parcel.readFloat();
        this.p = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.f123500m = parcel.readLong();
        this.n = parcel.readLong();
        this.o = parcel.readInt();
        this.f123491d = parcel.readInt();
        this.f123493f = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f123488a);
        parcel.writeString(this.f123489b);
        parcel.writeByte(this.f123490c ? (byte) 1 : 0);
        parcel.writeString(this.f123492e);
        parcel.writeInt(this.f123494g);
        parcel.writeInt(this.f123495h);
        parcel.writeInt(this.f123496i);
        parcel.writeInt(this.f123497j);
        parcel.writeFloat(this.f123498k);
        parcel.writeFloat(this.f123499l);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeLong(this.f123500m);
        parcel.writeLong(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.f123491d);
        parcel.writeString(this.f123493f);
    }
}
