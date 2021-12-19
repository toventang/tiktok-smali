package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareVideo;

public final class ShareVideoContent extends ShareContent<ShareVideoContent, a> {
    public static final Parcelable.Creator<ShareVideoContent> CREATOR = new Parcelable.Creator<ShareVideoContent>() {
        /* class com.facebook.share.model.ShareVideoContent.AnonymousClass1 */

        static {
            Covode.recordClassIndex(30749);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareVideoContent[] newArray(int i2) {
            return new ShareVideoContent[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareVideoContent createFromParcel(Parcel parcel) {
            return new ShareVideoContent(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f49167a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49168b;

    /* renamed from: c  reason: collision with root package name */
    public final SharePhoto f49169c;

    /* renamed from: d  reason: collision with root package name */
    public final ShareVideo f49170d;

    @Override // com.facebook.share.model.ShareContent
    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30748);
    }

    public static final class a extends ShareContent.a<ShareVideoContent, a> {

        /* renamed from: g  reason: collision with root package name */
        public String f49171g;

        /* renamed from: h  reason: collision with root package name */
        public String f49172h;

        /* renamed from: i  reason: collision with root package name */
        public SharePhoto f49173i;

        /* renamed from: j  reason: collision with root package name */
        public ShareVideo f49174j;

        static {
            Covode.recordClassIndex(30750);
        }

        public final a a(ShareVideo shareVideo) {
            if (shareVideo == null) {
                return this;
            }
            this.f49174j = new ShareVideo.a().a(shareVideo).a();
            return this;
        }

        /* Return type fixed from 'com.facebook.share.model.ShareContent$a' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.facebook.share.model.ShareContent] */
        @Override // com.facebook.share.model.ShareContent.a
        public final /* synthetic */ a a(ShareVideoContent shareVideoContent) {
            SharePhoto a2;
            ShareVideoContent shareVideoContent2 = shareVideoContent;
            if (shareVideoContent2 == null) {
                return this;
            }
            a aVar = (a) super.a(shareVideoContent2);
            aVar.f49171g = shareVideoContent2.f49167a;
            aVar.f49172h = shareVideoContent2.f49168b;
            SharePhoto sharePhoto = shareVideoContent2.f49169c;
            if (sharePhoto == null) {
                a2 = null;
            } else {
                a2 = new SharePhoto.a().a(sharePhoto).a();
            }
            aVar.f49173i = a2;
            return aVar.a(shareVideoContent2.f49170d);
        }
    }

    private ShareVideoContent(a aVar) {
        super(aVar);
        this.f49167a = aVar.f49171g;
        this.f49168b = aVar.f49172h;
        this.f49169c = aVar.f49173i;
        this.f49170d = aVar.f49174j;
    }

    ShareVideoContent(Parcel parcel) {
        super(parcel);
        this.f49167a = parcel.readString();
        this.f49168b = parcel.readString();
        SharePhoto.a a2 = new SharePhoto.a().a(parcel);
        if (a2.f49156c == null && a2.f49155b == null) {
            this.f49169c = null;
        } else {
            this.f49169c = a2.a();
        }
        this.f49170d = new ShareVideo.a().a(parcel).a();
    }

    public /* synthetic */ ShareVideoContent(a aVar, byte b2) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareContent
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f49167a);
        parcel.writeString(this.f49168b);
        parcel.writeParcelable(this.f49169c, 0);
        parcel.writeParcelable(this.f49170d, 0);
    }
}
