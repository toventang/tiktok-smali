package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.share.model.ShareContent;

public final class ShareLinkContent extends ShareContent<ShareLinkContent, a> {
    public static final Parcelable.Creator<ShareLinkContent> CREATOR = new Parcelable.Creator<ShareLinkContent>() {
        /* class com.facebook.share.model.ShareLinkContent.AnonymousClass1 */

        static {
            Covode.recordClassIndex(30706);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareLinkContent[] newArray(int i2) {
            return new ShareLinkContent[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareLinkContent createFromParcel(Parcel parcel) {
            return new ShareLinkContent(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f49111a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49112b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f49113c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49114d;

    @Override // com.facebook.share.model.ShareContent
    public final int describeContents() {
        return 0;
    }

    public static final class a extends ShareContent.a<ShareLinkContent, a> {

        /* renamed from: g  reason: collision with root package name */
        static final String f49115g = a.class.getSimpleName();

        /* renamed from: h  reason: collision with root package name */
        public String f49116h;

        /* renamed from: i  reason: collision with root package name */
        public String f49117i;

        /* renamed from: j  reason: collision with root package name */
        public Uri f49118j;

        /* renamed from: k  reason: collision with root package name */
        public String f49119k;

        static {
            Covode.recordClassIndex(30707);
        }

        /* Return type fixed from 'com.facebook.share.model.ShareContent$a' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.facebook.share.model.ShareContent] */
        @Override // com.facebook.share.model.ShareContent.a
        public final /* bridge */ /* synthetic */ a a(ShareLinkContent shareLinkContent) {
            ShareLinkContent shareLinkContent2 = shareLinkContent;
            if (shareLinkContent2 == null) {
                return this;
            }
            a aVar = (a) super.a(shareLinkContent2);
            aVar.f49119k = shareLinkContent2.f49114d;
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(30705);
    }

    private ShareLinkContent(a aVar) {
        super(aVar);
        this.f49111a = aVar.f49116h;
        this.f49112b = aVar.f49117i;
        this.f49113c = aVar.f49118j;
        this.f49114d = aVar.f49119k;
    }

    ShareLinkContent(Parcel parcel) {
        super(parcel);
        this.f49111a = parcel.readString();
        this.f49112b = parcel.readString();
        this.f49113c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f49114d = parcel.readString();
    }

    public /* synthetic */ ShareLinkContent(a aVar, byte b2) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareContent
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f49111a);
        parcel.writeString(this.f49112b);
        parcel.writeParcelable(this.f49113c, 0);
        parcel.writeString(this.f49114d);
    }
}
