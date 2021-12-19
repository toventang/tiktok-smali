package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.SharePhoto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SharePhotoContent extends ShareContent<SharePhotoContent, a> {
    public static final Parcelable.Creator<SharePhotoContent> CREATOR = new Parcelable.Creator<SharePhotoContent>() {
        /* class com.facebook.share.model.SharePhotoContent.AnonymousClass1 */

        static {
            Covode.recordClassIndex(30741);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SharePhotoContent[] newArray(int i2) {
            return new SharePhotoContent[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SharePhotoContent createFromParcel(Parcel parcel) {
            return new SharePhotoContent(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final List<SharePhoto> f49159a;

    @Override // com.facebook.share.model.ShareContent
    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30740);
    }

    public static class a extends ShareContent.a<SharePhotoContent, a> {

        /* renamed from: g  reason: collision with root package name */
        public final List<SharePhoto> f49160g = new ArrayList();

        static {
            Covode.recordClassIndex(30742);
        }

        public final SharePhotoContent a() {
            return new SharePhotoContent(this, (byte) 0);
        }

        public final a a(SharePhotoContent sharePhotoContent) {
            if (sharePhotoContent == null) {
                return this;
            }
            return ((a) super.a((ShareContent) sharePhotoContent)).b(sharePhotoContent.f49159a);
        }

        private a b(List<SharePhoto> list) {
            if (list != null) {
                for (SharePhoto sharePhoto : list) {
                    a(sharePhoto);
                }
            }
            return this;
        }

        public final a a(SharePhoto sharePhoto) {
            if (sharePhoto != null) {
                this.f49160g.add(new SharePhoto.a().a(sharePhoto).a());
            }
            return this;
        }

        public final a a(List<SharePhoto> list) {
            this.f49160g.clear();
            b(list);
            return this;
        }
    }

    private SharePhotoContent(a aVar) {
        super(aVar);
        this.f49159a = Collections.unmodifiableList(aVar.f49160g);
    }

    SharePhotoContent(Parcel parcel) {
        super(parcel);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
        ArrayList<ShareMedia> arrayList = new ArrayList(readParcelableArray.length);
        for (Parcelable parcelable : readParcelableArray) {
            arrayList.add(parcelable);
        }
        ArrayList arrayList2 = new ArrayList();
        for (ShareMedia shareMedia : arrayList) {
            if (shareMedia instanceof SharePhoto) {
                arrayList2.add(shareMedia);
            }
        }
        this.f49159a = Collections.unmodifiableList(arrayList2);
    }

    /* synthetic */ SharePhotoContent(a aVar, byte b2) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareContent
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        List<SharePhoto> list = this.f49159a;
        ShareMedia[] shareMediaArr = new ShareMedia[list.size()];
        for (int i3 = 0; i3 < list.size(); i3++) {
            shareMediaArr[i3] = list.get(i3);
        }
        parcel.writeParcelableArray(shareMediaArr, i2);
    }
}
