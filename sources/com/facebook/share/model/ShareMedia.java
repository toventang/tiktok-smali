package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public abstract class ShareMedia implements ShareModel {

    /* renamed from: a  reason: collision with root package name */
    final Bundle f49120a;

    static {
        Covode.recordClassIndex(30708);
    }

    public abstract b a();

    public int describeContents() {
        return 0;
    }

    public enum b {
        PHOTO,
        VIDEO;

        static {
            Covode.recordClassIndex(30710);
        }
    }

    public static abstract class a<M extends ShareMedia, B extends a> {

        /* renamed from: a  reason: collision with root package name */
        public Bundle f49121a = new Bundle();

        static {
            Covode.recordClassIndex(30709);
        }

        public B a(M m2) {
            if (m2 == null) {
                return this;
            }
            this.f49121a.putAll(new Bundle(m2.f49120a));
            return this;
        }
    }

    ShareMedia(Parcel parcel) {
        this.f49120a = parcel.readBundle();
    }

    protected ShareMedia(a aVar) {
        this.f49120a = new Bundle(aVar.f49121a);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.f49120a);
    }
}
