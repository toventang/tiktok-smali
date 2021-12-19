package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class CameraEffectTextures implements ShareModel {
    public static final Parcelable.Creator<CameraEffectTextures> CREATOR = new Parcelable.Creator<CameraEffectTextures>() {
        /* class com.facebook.share.model.CameraEffectTextures.AnonymousClass1 */

        static {
            Covode.recordClassIndex(30696);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CameraEffectTextures[] newArray(int i2) {
            return new CameraEffectTextures[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CameraEffectTextures createFromParcel(Parcel parcel) {
            return new CameraEffectTextures(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f49092a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Bundle f49093a = new Bundle();

        static {
            Covode.recordClassIndex(30697);
        }
    }

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30695);
    }

    private CameraEffectTextures(a aVar) {
        this.f49092a = aVar.f49093a;
    }

    CameraEffectTextures(Parcel parcel) {
        this.f49092a = parcel.readBundle(getClass().getClassLoader());
    }

    /* synthetic */ CameraEffectTextures(a aVar, byte b2) {
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
        parcel.writeBundle(this.f49092a);
    }
}
