package com.ss.android.ugc.aweme.shortvideo.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class EmbaddedWindowInfo implements Parcelable {
    public static final a CREATOR = new a((byte) 0);
    @c(a = "w")

    /* renamed from: a  reason: collision with root package name */
    public int f131101a;
    @c(a = "h")

    /* renamed from: b  reason: collision with root package name */
    public int f131102b;
    @c(a = "x")

    /* renamed from: c  reason: collision with root package name */
    public int f131103c;
    @c(a = "y")

    /* renamed from: d  reason: collision with root package name */
    public int f131104d;
    @c(a = "s")

    /* renamed from: e  reason: collision with root package name */
    public int f131105e;
    @c(a = "e")

    /* renamed from: f  reason: collision with root package name */
    public int f131106f;

    static {
        Covode.recordClassIndex(85914);
    }

    public final int describeContents() {
        return 0;
    }

    public static final class a implements Parcelable.Creator<EmbaddedWindowInfo> {
        static {
            Covode.recordClassIndex(85915);
        }

        private a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EmbaddedWindowInfo[] newArray(int i2) {
            return new EmbaddedWindowInfo[i2];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EmbaddedWindowInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new EmbaddedWindowInfo(parcel);
        }
    }

    public EmbaddedWindowInfo() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EmbaddedWindowInfo(Parcel parcel) {
        this();
        l.d(parcel, "");
        this.f131101a = parcel.readInt();
        this.f131102b = parcel.readInt();
        this.f131103c = parcel.readInt();
        this.f131104d = parcel.readInt();
        this.f131105e = parcel.readInt();
        this.f131106f = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.f131101a);
        parcel.writeInt(this.f131102b);
        parcel.writeInt(this.f131103c);
        parcel.writeInt(this.f131104d);
        parcel.writeInt(this.f131105e);
        parcel.writeInt(this.f131106f);
    }
}
