package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public final class ShareMessengerMediaTemplateContent extends ShareContent<ShareMessengerMediaTemplateContent, Object> {
    public static final Parcelable.Creator<ShareMessengerMediaTemplateContent> CREATOR = new Parcelable.Creator<ShareMessengerMediaTemplateContent>() {
        /* class com.facebook.share.model.ShareMessengerMediaTemplateContent.AnonymousClass1 */

        static {
            Covode.recordClassIndex(30720);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareMessengerMediaTemplateContent[] newArray(int i2) {
            return new ShareMessengerMediaTemplateContent[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareMessengerMediaTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerMediaTemplateContent(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final a f49134a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49135b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f49136c;

    /* renamed from: d  reason: collision with root package name */
    public final ShareMessengerActionButton f49137d;

    @Override // com.facebook.share.model.ShareContent
    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30719);
    }

    public enum a {
        IMAGE,
        VIDEO;

        static {
            Covode.recordClassIndex(30721);
        }
    }

    ShareMessengerMediaTemplateContent(Parcel parcel) {
        super(parcel);
        this.f49134a = (a) parcel.readSerializable();
        this.f49135b = parcel.readString();
        this.f49136c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f49137d = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    @Override // com.facebook.share.model.ShareContent
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeSerializable(this.f49134a);
        parcel.writeString(this.f49135b);
        parcel.writeParcelable(this.f49136c, i2);
        parcel.writeParcelable(this.f49137d, i2);
    }
}
