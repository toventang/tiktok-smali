package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public final class ShareMessengerGenericTemplateElement implements ShareModel {
    public static final Parcelable.Creator<ShareMessengerGenericTemplateElement> CREATOR = new Parcelable.Creator<ShareMessengerGenericTemplateElement>() {
        /* class com.facebook.share.model.ShareMessengerGenericTemplateElement.AnonymousClass1 */

        static {
            Covode.recordClassIndex(30718);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareMessengerGenericTemplateElement[] newArray(int i2) {
            return new ShareMessengerGenericTemplateElement[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareMessengerGenericTemplateElement createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateElement(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f49129a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49130b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f49131c;

    /* renamed from: d  reason: collision with root package name */
    public final ShareMessengerActionButton f49132d;

    /* renamed from: e  reason: collision with root package name */
    public final ShareMessengerActionButton f49133e;

    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30717);
    }

    ShareMessengerGenericTemplateElement(Parcel parcel) {
        this.f49129a = parcel.readString();
        this.f49130b = parcel.readString();
        this.f49131c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f49132d = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
        this.f49133e = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f49129a);
        parcel.writeString(this.f49130b);
        parcel.writeParcelable(this.f49131c, i2);
        parcel.writeParcelable(this.f49132d, i2);
        parcel.writeParcelable(this.f49133e, i2);
    }
}
