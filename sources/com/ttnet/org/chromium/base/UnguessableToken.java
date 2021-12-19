package com.ttnet.org.chromium.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class UnguessableToken implements Parcelable {
    public static final Parcelable.Creator<UnguessableToken> CREATOR = new Parcelable.Creator<UnguessableToken>() {
        /* class com.ttnet.org.chromium.base.UnguessableToken.AnonymousClass1 */

        static {
            Covode.recordClassIndex(103285);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UnguessableToken[] newArray(int i2) {
            return new UnguessableToken[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UnguessableToken createFromParcel(Parcel parcel) {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            if (readLong == 0 || readLong2 == 0) {
                return null;
            }
            return new UnguessableToken(readLong, readLong2, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final long f155215a;

    /* renamed from: b  reason: collision with root package name */
    private final long f155216b;

    public int describeContents() {
        return 0;
    }

    public long getHighForSerialization() {
        return this.f155215a;
    }

    public long getLowForSerialization() {
        return this.f155216b;
    }

    static {
        Covode.recordClassIndex(103284);
    }

    private UnguessableToken parcelAndUnparcelForTesting() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        UnguessableToken createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    private UnguessableToken(long j2, long j3) {
        this.f155215a = j2;
        this.f155216b = j3;
    }

    private static UnguessableToken create(long j2, long j3) {
        return new UnguessableToken(j2, j3);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f155215a);
        parcel.writeLong(this.f155216b);
    }

    /* synthetic */ UnguessableToken(long j2, long j3, byte b2) {
        this(j2, j3);
    }
}
