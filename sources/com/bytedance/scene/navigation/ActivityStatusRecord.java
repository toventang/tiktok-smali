package com.bytedance.scene.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

class ActivityStatusRecord implements Parcelable {
    public static final Parcelable.Creator<ActivityStatusRecord> CREATOR = new Parcelable.Creator<ActivityStatusRecord>() {
        /* class com.bytedance.scene.navigation.ActivityStatusRecord.AnonymousClass1 */

        static {
            Covode.recordClassIndex(26337);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ActivityStatusRecord[] newArray(int i2) {
            return new ActivityStatusRecord[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ActivityStatusRecord createFromParcel(Parcel parcel) {
            return new ActivityStatusRecord(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    int f42932a;

    /* renamed from: b  reason: collision with root package name */
    int f42933b;

    /* renamed from: c  reason: collision with root package name */
    int f42934c;

    /* renamed from: d  reason: collision with root package name */
    int f42935d;

    /* renamed from: e  reason: collision with root package name */
    int f42936e;

    /* renamed from: f  reason: collision with root package name */
    int f42937f;

    public int describeContents() {
        return 0;
    }

    ActivityStatusRecord() {
    }

    static {
        Covode.recordClassIndex(26336);
    }

    protected ActivityStatusRecord(Parcel parcel) {
        this.f42932a = parcel.readInt();
        this.f42933b = parcel.readInt();
        this.f42934c = parcel.readInt();
        this.f42935d = parcel.readInt();
        this.f42936e = parcel.readInt();
        this.f42937f = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f42932a);
        parcel.writeInt(this.f42933b);
        parcel.writeInt(this.f42934c);
        parcel.writeInt(this.f42935d);
        parcel.writeInt(this.f42936e);
        parcel.writeInt(this.f42937f);
    }
}
