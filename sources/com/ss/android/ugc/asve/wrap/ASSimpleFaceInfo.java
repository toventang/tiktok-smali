package com.ss.android.ugc.asve.wrap;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ASSimpleFaceInfo implements Parcelable {
    public static final a CREATOR = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public float f62386a;

    static {
        Covode.recordClassIndex(38333);
    }

    public final int describeContents() {
        return 0;
    }

    public static final class a implements Parcelable.Creator<ASSimpleFaceInfo> {
        static {
            Covode.recordClassIndex(38334);
        }

        private a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ASSimpleFaceInfo[] newArray(int i2) {
            return new ASSimpleFaceInfo[i2];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ASSimpleFaceInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new ASSimpleFaceInfo(parcel);
        }
    }

    public ASSimpleFaceInfo(float f2) {
        this.f62386a = f2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ASSimpleFaceInfo(Parcel parcel) {
        this(parcel.readFloat());
        l.d(parcel, "");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeFloat(this.f62386a);
    }
}
