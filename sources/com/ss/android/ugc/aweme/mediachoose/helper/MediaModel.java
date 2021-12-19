package com.ss.android.ugc.aweme.mediachoose.helper;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class MediaModel implements Parcelable, Cloneable, Comparable<MediaModel> {
    public static final Parcelable.Creator<MediaModel> CREATOR = new Parcelable.Creator<MediaModel>() {
        /* class com.ss.android.ugc.aweme.mediachoose.helper.MediaModel.AnonymousClass1 */

        static {
            Covode.recordClassIndex(70069);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MediaModel[] newArray(int i2) {
            return new MediaModel[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MediaModel createFromParcel(Parcel parcel) {
            return new MediaModel(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public String f109389a;

    /* renamed from: b  reason: collision with root package name */
    public String f109390b;

    /* renamed from: c  reason: collision with root package name */
    public String f109391c;

    /* renamed from: d  reason: collision with root package name */
    public String f109392d;

    /* renamed from: e  reason: collision with root package name */
    public String f109393e;

    /* renamed from: f  reason: collision with root package name */
    public long f109394f;

    /* renamed from: g  reason: collision with root package name */
    public int f109395g;

    /* renamed from: h  reason: collision with root package name */
    public long f109396h;

    /* renamed from: i  reason: collision with root package name */
    public long f109397i;

    /* renamed from: j  reason: collision with root package name */
    public String f109398j;

    /* renamed from: k  reason: collision with root package name */
    public String f109399k;

    /* renamed from: l  reason: collision with root package name */
    public int f109400l;

    /* renamed from: m  reason: collision with root package name */
    public int f109401m;
    public long n;
    public Uri o;
    public String p;
    public int q;
    public int r;
    public float s = 1.0f;
    public String t;

    public int describeContents() {
        return 0;
    }

    public final MediaModel a() {
        return (MediaModel) super.clone();
    }

    @Override // java.lang.Object
    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public int hashCode() {
        return this.f109389a.hashCode();
    }

    static {
        Covode.recordClassIndex(70068);
    }

    public final boolean b() {
        if (this.f109395g == 4) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "MediaModel{id=" + this.f109389a + ", filePath='" + this.f109390b + '\'' + ", date=" + this.f109394f + ", type=" + this.f109395g + ", duration=" + this.f109396h + ", fileSize=" + this.f109397i + ", mimeType='" + this.f109398j + '\'' + ", thumbnail='" + this.f109399k + '\'' + ", width=" + this.f109400l + ", height=" + this.f109401m + ", modify=" + this.n + ", userName=" + this.p + ", startTime=" + this.q + ", endTime=" + this.r + ", speed=" + this.s + ", extra='" + this.t + '\'' + '}';
    }

    public MediaModel(long j2) {
        this.f109389a = String.valueOf(j2);
    }

    public MediaModel(String str) {
        this.f109389a = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(MediaModel mediaModel) {
        long j2 = this.f109394f;
        long j3 = mediaModel.f109394f;
        if (j2 > j3) {
            return -1;
        }
        if (j2 < j3) {
            return 1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaModel)) {
            return false;
        }
        return ((MediaModel) obj).f109389a.equals(this.f109389a);
    }

    protected MediaModel(Parcel parcel) {
        this.f109389a = parcel.readString();
        this.f109390b = parcel.readString();
        this.f109391c = parcel.readString();
        this.f109392d = parcel.readString();
        this.f109393e = parcel.readString();
        this.f109394f = parcel.readLong();
        this.f109395g = parcel.readInt();
        this.f109396h = parcel.readLong();
        this.f109397i = parcel.readLong();
        this.f109398j = parcel.readString();
        this.f109399k = parcel.readString();
        this.f109400l = parcel.readInt();
        this.f109401m = parcel.readInt();
        this.p = parcel.readString();
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.t = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f109389a);
        parcel.writeString(this.f109390b);
        parcel.writeString(this.f109391c);
        parcel.writeString(this.f109392d);
        parcel.writeString(this.f109393e);
        parcel.writeLong(this.f109394f);
        parcel.writeInt(this.f109395g);
        parcel.writeLong(this.f109396h);
        parcel.writeLong(this.f109397i);
        parcel.writeString(this.f109398j);
        parcel.writeString(this.f109399k);
        parcel.writeInt(this.f109400l);
        parcel.writeInt(this.f109401m);
        parcel.writeString(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeString(this.t);
    }
}
