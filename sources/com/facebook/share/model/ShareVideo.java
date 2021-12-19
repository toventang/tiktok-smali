package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.share.model.ShareMedia;

public final class ShareVideo extends ShareMedia {
    public static final Parcelable.Creator<ShareVideo> CREATOR = new Parcelable.Creator<ShareVideo>() {
        /* class com.facebook.share.model.ShareVideo.AnonymousClass1 */

        static {
            Covode.recordClassIndex(30746);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareVideo[] newArray(int i2) {
            return new ShareVideo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareVideo createFromParcel(Parcel parcel) {
            return new ShareVideo(parcel);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public final Uri f49165b;

    @Override // com.facebook.share.model.ShareMedia
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareMedia
    public final ShareMedia.b a() {
        return ShareMedia.b.VIDEO;
    }

    static {
        Covode.recordClassIndex(30745);
    }

    public static final class a extends ShareMedia.a<ShareVideo, a> {

        /* renamed from: b  reason: collision with root package name */
        public Uri f49166b;

        static {
            Covode.recordClassIndex(30747);
        }

        public final ShareVideo a() {
            return new ShareVideo(this, (byte) 0);
        }

        public final a a(ShareVideo shareVideo) {
            if (shareVideo == null) {
                return this;
            }
            a aVar = (a) super.a((ShareMedia) shareVideo);
            aVar.f49166b = shareVideo.f49165b;
            return aVar;
        }

        /* access modifiers changed from: package-private */
        public final a a(Parcel parcel) {
            return a((ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader()));
        }
    }

    private ShareVideo(a aVar) {
        super(aVar);
        this.f49165b = aVar.f49166b;
    }

    ShareVideo(Parcel parcel) {
        super(parcel);
        this.f49165b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    /* synthetic */ ShareVideo(a aVar, byte b2) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareMedia
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f49165b, 0);
    }
}
