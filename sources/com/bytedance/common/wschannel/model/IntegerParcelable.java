package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class IntegerParcelable implements Parcelable {
    public static final Parcelable.Creator<IntegerParcelable> CREATOR = new Parcelable.Creator<IntegerParcelable>() {
        /* class com.bytedance.common.wschannel.model.IntegerParcelable.AnonymousClass1 */

        static {
            Covode.recordClassIndex(16065);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ IntegerParcelable[] newArray(int i2) {
            return new IntegerParcelable[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IntegerParcelable createFromParcel(Parcel parcel) {
            return new IntegerParcelable(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f27263a;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(16064);
    }

    public IntegerParcelable(int i2) {
        this.f27263a = i2;
    }

    protected IntegerParcelable(Parcel parcel) {
        this.f27263a = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f27263a);
    }
}
