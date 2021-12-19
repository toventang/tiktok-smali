package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.share.model.ShareOpenGraphAction;

public final class ShareOpenGraphContent extends ShareContent<ShareOpenGraphContent, Object> {
    public static final Parcelable.Creator<ShareOpenGraphContent> CREATOR = new Parcelable.Creator<ShareOpenGraphContent>() {
        /* class com.facebook.share.model.ShareOpenGraphContent.AnonymousClass1 */

        static {
            Covode.recordClassIndex(30732);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareOpenGraphContent[] newArray(int i2) {
            return new ShareOpenGraphContent[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareOpenGraphContent createFromParcel(Parcel parcel) {
            return new ShareOpenGraphContent(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final ShareOpenGraphAction f49147a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49148b;

    @Override // com.facebook.share.model.ShareContent
    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30731);
    }

    ShareOpenGraphContent(Parcel parcel) {
        super(parcel);
        this.f49147a = new ShareOpenGraphAction(new ShareOpenGraphAction.a().a(parcel), (byte) 0);
        this.f49148b = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f49147a, 0);
        parcel.writeString(this.f49148b);
    }
}
