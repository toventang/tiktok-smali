package com.ss.android.ttvecamera;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class TEFocusParameters implements Parcelable {
    public static final Parcelable.Creator<TEFocusParameters> CREATOR = new Parcelable.Creator<TEFocusParameters>() {
        /* class com.ss.android.ttvecamera.TEFocusParameters.AnonymousClass1 */

        static {
            Covode.recordClassIndex(37797);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TEFocusParameters[] newArray(int i2) {
            return new TEFocusParameters[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TEFocusParameters createFromParcel(Parcel parcel) {
            return new TEFocusParameters(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public Rect f61367a;

    /* renamed from: b  reason: collision with root package name */
    public Rect f61368b;

    /* renamed from: c  reason: collision with root package name */
    public int f61369c;

    /* renamed from: d  reason: collision with root package name */
    public int f61370d;

    public int describeContents() {
        return 0;
    }

    public TEFocusParameters() {
    }

    static {
        Covode.recordClassIndex(37796);
    }

    public String toString() {
        return "active size is:" + this.f61367a.toString() + " crop size is: " + this.f61368b.toString() + "  max AF regions is: " + this.f61369c + "  max AE regions is: " + this.f61370d;
    }

    public TEFocusParameters(Parcel parcel) {
        this.f61367a = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.f61369c = parcel.readInt();
        this.f61370d = parcel.readInt();
        this.f61368b = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f61367a, i2);
        parcel.writeInt(this.f61369c);
        parcel.writeInt(this.f61370d);
        parcel.writeParcelable(this.f61368b, i2);
    }
}
