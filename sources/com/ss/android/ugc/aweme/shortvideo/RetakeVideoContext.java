package com.ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.vesdk.VERecordData;
import h.f.b.l;

public final class RetakeVideoContext implements Parcelable, bi {
    public static final a CREATOR = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f124747a;

    /* renamed from: b  reason: collision with root package name */
    public long f124748b;

    /* renamed from: c  reason: collision with root package name */
    public int f124749c;

    /* renamed from: d  reason: collision with root package name */
    public VERecordData f124750d;

    /* renamed from: e  reason: collision with root package name */
    public MultiEditVideoStatusRecordData f124751e;

    /* renamed from: f  reason: collision with root package name */
    public String f124752f;

    /* renamed from: g  reason: collision with root package name */
    public StitchParams f124753g;

    static {
        Covode.recordClassIndex(81977);
    }

    public final int describeContents() {
        return 0;
    }

    public static final class a implements Parcelable.Creator<RetakeVideoContext> {
        static {
            Covode.recordClassIndex(81978);
        }

        private a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RetakeVideoContext[] newArray(int i2) {
            return new RetakeVideoContext[i2];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RetakeVideoContext createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new RetakeVideoContext(parcel);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.bi
    public final long a() {
        return this.f124748b;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.bi
    public final int b() {
        return this.f124749c;
    }

    public RetakeVideoContext() {
        String str = dj.f126462e;
        l.b(str, "");
        this.f124752f = str;
    }

    public final void a(String str) {
        l.d(str, "");
        this.f124752f = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RetakeVideoContext(Parcel parcel) {
        this();
        l.d(parcel, "");
        this.f124747a = parcel.readLong();
        this.f124748b = parcel.readLong();
        this.f124749c = parcel.readInt();
        this.f124750d = (VERecordData) parcel.readParcelable(VERecordData.class.getClassLoader());
        String readString = parcel.readString();
        if (readString == null) {
            readString = dj.f126462e;
            l.b(readString, "");
        }
        this.f124752f = readString;
        this.f124751e = (MultiEditVideoStatusRecordData) parcel.readParcelable(MultiEditVideoStatusRecordData.class.getClassLoader());
        this.f124753g = (StitchParams) parcel.readParcelable(StitchParams.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeLong(this.f124747a);
        parcel.writeLong(this.f124748b);
        parcel.writeInt(this.f124749c);
        parcel.writeParcelable(this.f124750d, i2);
        parcel.writeString(this.f124752f);
        parcel.writeParcelable(this.f124751e, i2);
        parcel.writeParcelable(this.f124753g, i2);
    }
}
