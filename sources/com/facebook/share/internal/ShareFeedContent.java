package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.share.model.ShareContent;

public class ShareFeedContent extends ShareContent<ShareFeedContent, Object> {
    public static final Parcelable.Creator<ShareFeedContent> CREATOR = new Parcelable.Creator<ShareFeedContent>() {
        /* class com.facebook.share.internal.ShareFeedContent.AnonymousClass1 */

        static {
            Covode.recordClassIndex(30658);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareFeedContent[] newArray(int i2) {
            return new ShareFeedContent[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareFeedContent createFromParcel(Parcel parcel) {
            return new ShareFeedContent(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f49059a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49060b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49061c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49062d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49063e;

    /* renamed from: f  reason: collision with root package name */
    public final String f49064f;

    /* renamed from: g  reason: collision with root package name */
    public final String f49065g;

    @Override // com.facebook.share.model.ShareContent
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30657);
    }

    ShareFeedContent(Parcel parcel) {
        super(parcel);
        this.f49059a = parcel.readString();
        this.f49060b = parcel.readString();
        this.f49061c = parcel.readString();
        this.f49062d = parcel.readString();
        this.f49063e = parcel.readString();
        this.f49064f = parcel.readString();
        this.f49065g = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f49059a);
        parcel.writeString(this.f49060b);
        parcel.writeString(this.f49061c);
        parcel.writeString(this.f49062d);
        parcel.writeString(this.f49063e);
        parcel.writeString(this.f49064f);
        parcel.writeString(this.f49065g);
    }
}
