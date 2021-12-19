package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public final class ShareOpenGraphObject extends ShareOpenGraphValueContainer<ShareOpenGraphObject, Object> {
    public static final Parcelable.Creator<ShareOpenGraphObject> CREATOR = new Parcelable.Creator<ShareOpenGraphObject>() {
        /* class com.facebook.share.model.ShareOpenGraphObject.AnonymousClass1 */

        static {
            Covode.recordClassIndex(30734);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareOpenGraphObject[] newArray(int i2) {
            return new ShareOpenGraphObject[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareOpenGraphObject createFromParcel(Parcel parcel) {
            return new ShareOpenGraphObject(parcel);
        }
    };

    static {
        Covode.recordClassIndex(30733);
    }

    ShareOpenGraphObject(Parcel parcel) {
        super(parcel);
    }
}
