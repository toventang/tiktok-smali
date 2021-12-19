package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class CameraEffectArguments implements ShareModel {
    public static final Parcelable.Creator<CameraEffectArguments> CREATOR = new Parcelable.Creator<CameraEffectArguments>() {
        /* class com.facebook.share.model.CameraEffectArguments.AnonymousClass1 */

        static {
            Covode.recordClassIndex(30693);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CameraEffectArguments[] newArray(int i2) {
            return new CameraEffectArguments[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CameraEffectArguments createFromParcel(Parcel parcel) {
            return new CameraEffectArguments(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f49090a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Bundle f49091a = new Bundle();

        static {
            Covode.recordClassIndex(30694);
        }
    }

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30692);
    }

    private CameraEffectArguments(a aVar) {
        this.f49090a = aVar.f49091a;
    }

    CameraEffectArguments(Parcel parcel) {
        this.f49090a = parcel.readBundle(getClass().getClassLoader());
    }

    /* synthetic */ CameraEffectArguments(a aVar, byte b2) {
        this(aVar);
    }

    public static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.f49090a);
    }
}
