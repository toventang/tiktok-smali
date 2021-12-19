package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ShareStoryContent extends ShareContent<ShareStoryContent, Object> {
    public static final Parcelable.Creator<ShareStoryContent> CREATOR = new Parcelable.Creator<ShareStoryContent>() {
        /* class com.facebook.share.model.ShareStoryContent.AnonymousClass1 */

        static {
            Covode.recordClassIndex(30744);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareStoryContent[] newArray(int i2) {
            return new ShareStoryContent[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareStoryContent createFromParcel(Parcel parcel) {
            return new ShareStoryContent(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final ShareMedia f49161a;

    /* renamed from: b  reason: collision with root package name */
    public final SharePhoto f49162b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f49163c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49164d;

    @Override // com.facebook.share.model.ShareContent
    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30743);
    }

    ShareStoryContent(Parcel parcel) {
        super(parcel);
        List<String> unmodifiableList;
        this.f49161a = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.f49162b = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f49163c = unmodifiableList;
        this.f49164d = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f49161a, 0);
        parcel.writeParcelable(this.f49162b, 0);
        parcel.writeStringList(this.f49163c);
        parcel.writeString(this.f49164d);
    }
}
