package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;

public final class ShareMediaContent extends ShareContent<ShareMediaContent, Object> {
    public static final Parcelable.Creator<ShareMediaContent> CREATOR = new Parcelable.Creator<ShareMediaContent>() {
        /* class com.facebook.share.model.ShareMediaContent.AnonymousClass1 */

        static {
            Covode.recordClassIndex(30712);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareMediaContent[] newArray(int i2) {
            return new ShareMediaContent[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareMediaContent createFromParcel(Parcel parcel) {
            return new ShareMediaContent(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final List<ShareMedia> f49123a;

    @Override // com.facebook.share.model.ShareContent
    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30711);
    }

    ShareMediaContent(Parcel parcel) {
        super(parcel);
        this.f49123a = Arrays.asList((ShareMedia[]) parcel.readParcelableArray(ShareMedia.class.getClassLoader()));
    }

    @Override // com.facebook.share.model.ShareContent
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelableArray((ShareMedia[]) this.f49123a.toArray(), i2);
    }
}
