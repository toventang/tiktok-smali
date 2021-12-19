package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public final class ShareMessengerOpenGraphMusicTemplateContent extends ShareContent<ShareMessengerOpenGraphMusicTemplateContent, Object> {
    public static final Parcelable.Creator<ShareMessengerOpenGraphMusicTemplateContent> CREATOR = new Parcelable.Creator<ShareMessengerOpenGraphMusicTemplateContent>() {
        /* class com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent.AnonymousClass1 */

        static {
            Covode.recordClassIndex(30723);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareMessengerOpenGraphMusicTemplateContent[] newArray(int i2) {
            return new ShareMessengerOpenGraphMusicTemplateContent[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareMessengerOpenGraphMusicTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerOpenGraphMusicTemplateContent(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final Uri f49139a;

    /* renamed from: b  reason: collision with root package name */
    public final ShareMessengerActionButton f49140b;

    @Override // com.facebook.share.model.ShareContent
    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30722);
    }

    ShareMessengerOpenGraphMusicTemplateContent(Parcel parcel) {
        super(parcel);
        this.f49139a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f49140b = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    @Override // com.facebook.share.model.ShareContent
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f49139a, i2);
        parcel.writeParcelable(this.f49140b, i2);
    }
}
