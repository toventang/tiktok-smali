package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.ShareOpenGraphValueContainer.a;

public abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends a> implements ShareModel {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f49149a;

    static {
        Covode.recordClassIndex(30735);
    }

    public int describeContents() {
        return 0;
    }

    public final String b(String str) {
        return this.f49149a.getString(str);
    }

    public static abstract class a<P extends ShareOpenGraphValueContainer, E extends a> {

        /* renamed from: a  reason: collision with root package name */
        public Bundle f49150a = new Bundle();

        static {
            Covode.recordClassIndex(30736);
        }

        public E a(P p) {
            if (p != null) {
                this.f49150a.putAll((Bundle) p.f49149a.clone());
            }
            return this;
        }
    }

    ShareOpenGraphValueContainer(Parcel parcel) {
        this.f49149a = parcel.readBundle(a.class.getClassLoader());
    }

    public final Object a(String str) {
        return a(this.f49149a, str);
    }

    protected ShareOpenGraphValueContainer(a<P, E> aVar) {
        this.f49149a = (Bundle) aVar.f49150a.clone();
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.f49149a);
    }
}
