package com.bytedance.apm.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class SpPair implements Parcelable {
    public static final Parcelable.Creator<SpPair> CREATOR = new Parcelable.Creator<SpPair>() {
        /* class com.bytedance.apm.core.SpPair.AnonymousClass1 */

        static {
            Covode.recordClassIndex(14547);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SpPair[] newArray(int i2) {
            return new SpPair[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SpPair createFromParcel(Parcel parcel) {
            return new SpPair(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public String f24870a;

    /* renamed from: b  reason: collision with root package name */
    public Object f24871b;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(14546);
    }

    protected SpPair(Parcel parcel) {
        this.f24870a = parcel.readString();
        this.f24871b = parcel.readValue(getClass().getClassLoader());
    }

    public SpPair(String str, Object obj) {
        this.f24870a = str;
        this.f24871b = obj;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f24870a);
        parcel.writeValue(this.f24871b);
    }
}
