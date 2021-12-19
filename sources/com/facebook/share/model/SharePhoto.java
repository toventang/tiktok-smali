package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.share.model.ShareMedia;

public final class SharePhoto extends ShareMedia {
    public static final Parcelable.Creator<SharePhoto> CREATOR = new Parcelable.Creator<SharePhoto>() {
        /* class com.facebook.share.model.SharePhoto.AnonymousClass1 */

        static {
            Covode.recordClassIndex(30738);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SharePhoto[] newArray(int i2) {
            return new SharePhoto[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SharePhoto createFromParcel(Parcel parcel) {
            return new SharePhoto(parcel);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public final Bitmap f49151b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f49152c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f49153d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49154e;

    @Override // com.facebook.share.model.ShareMedia
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareMedia
    public final ShareMedia.b a() {
        return ShareMedia.b.PHOTO;
    }

    public static final class a extends ShareMedia.a<SharePhoto, a> {

        /* renamed from: b  reason: collision with root package name */
        public Bitmap f49155b;

        /* renamed from: c  reason: collision with root package name */
        public Uri f49156c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f49157d;

        /* renamed from: e  reason: collision with root package name */
        public String f49158e;

        static {
            Covode.recordClassIndex(30739);
        }

        public final SharePhoto a() {
            return new SharePhoto(this, (byte) 0);
        }

        /* access modifiers changed from: package-private */
        public final a a(Parcel parcel) {
            return a((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        }

        public final a a(SharePhoto sharePhoto) {
            if (sharePhoto == null) {
                return this;
            }
            a aVar = (a) super.a((ShareMedia) sharePhoto);
            aVar.f49155b = sharePhoto.f49151b;
            aVar.f49156c = sharePhoto.f49152c;
            aVar.f49157d = sharePhoto.f49153d;
            aVar.f49158e = sharePhoto.f49154e;
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(30737);
    }

    private SharePhoto(a aVar) {
        super(aVar);
        this.f49151b = aVar.f49155b;
        this.f49152c = aVar.f49156c;
        this.f49153d = aVar.f49157d;
        this.f49154e = aVar.f49158e;
    }

    SharePhoto(Parcel parcel) {
        super(parcel);
        boolean z;
        this.f49151b = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f49152c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f49153d = z;
        this.f49154e = parcel.readString();
    }

    /* synthetic */ SharePhoto(a aVar, byte b2) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareMedia
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f49151b, 0);
        parcel.writeParcelable(this.f49152c, 0);
        parcel.writeByte(this.f49153d ? (byte) 1 : 0);
        parcel.writeString(this.f49154e);
    }
}
