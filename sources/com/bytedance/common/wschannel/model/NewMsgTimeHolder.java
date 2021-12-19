package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class NewMsgTimeHolder implements Parcelable {
    public static final Parcelable.Creator<NewMsgTimeHolder> CREATOR = new Parcelable.Creator<NewMsgTimeHolder>() {
        /* class com.bytedance.common.wschannel.model.NewMsgTimeHolder.AnonymousClass1 */

        static {
            Covode.recordClassIndex(16067);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ NewMsgTimeHolder[] newArray(int i2) {
            return new NewMsgTimeHolder[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ NewMsgTimeHolder createFromParcel(Parcel parcel) {
            return new NewMsgTimeHolder(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final long f27264a;

    /* renamed from: b  reason: collision with root package name */
    public final long f27265b;

    /* renamed from: c  reason: collision with root package name */
    public final long f27266c;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(16066);
    }

    protected NewMsgTimeHolder(Parcel parcel) {
        this.f27264a = parcel.readLong();
        this.f27265b = parcel.readLong();
        this.f27266c = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f27264a);
        parcel.writeLong(this.f27265b);
        parcel.writeLong(this.f27266c);
    }

    public NewMsgTimeHolder(long j2, long j3, long j4) {
        this.f27264a = j2;
        this.f27265b = j3;
        this.f27266c = j4;
    }
}
