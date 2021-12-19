package com.bytedance.scene.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.a.d;
import com.bytedance.scene.c.g;
import com.bytedance.scene.j;

/* access modifiers changed from: package-private */
public class Record implements Parcelable {
    public static final Parcelable.Creator<Record> CREATOR = new Parcelable.Creator<Record>() {
        /* class com.bytedance.scene.navigation.Record.AnonymousClass1 */

        static {
            Covode.recordClassIndex(26341);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Record[] newArray(int i2) {
            return new Record[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Record createFromParcel(Parcel parcel) {
            return new Record(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    j f42944a;

    /* renamed from: b  reason: collision with root package name */
    boolean f42945b;

    /* renamed from: c  reason: collision with root package name */
    ActivityStatusRecord f42946c;

    /* renamed from: d  reason: collision with root package name */
    d f42947d;

    /* renamed from: e  reason: collision with root package name */
    Object f42948e;

    /* renamed from: f  reason: collision with root package name */
    boolean f42949f;

    /* renamed from: g  reason: collision with root package name */
    g f42950g;

    /* renamed from: h  reason: collision with root package name */
    String f42951h;

    public int describeContents() {
        return 0;
    }

    public Record() {
    }

    static {
        Covode.recordClassIndex(26340);
    }

    protected Record(Parcel parcel) {
        boolean z;
        this.f42946c = (ActivityStatusRecord) parcel.readParcelable(ActivityStatusRecord.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f42945b = z;
        this.f42951h = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f42946c, i2);
        parcel.writeByte(this.f42945b ? (byte) 1 : 0);
        parcel.writeString(this.f42951h);
    }
}
