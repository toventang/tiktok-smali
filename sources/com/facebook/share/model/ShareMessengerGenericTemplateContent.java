package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public final class ShareMessengerGenericTemplateContent extends ShareContent<ShareMessengerGenericTemplateContent, Object> {
    public static final Parcelable.Creator<ShareMessengerGenericTemplateContent> CREATOR = new Parcelable.Creator<ShareMessengerGenericTemplateContent>() {
        /* class com.facebook.share.model.ShareMessengerGenericTemplateContent.AnonymousClass1 */

        static {
            Covode.recordClassIndex(30715);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareMessengerGenericTemplateContent[] newArray(int i2) {
            return new ShareMessengerGenericTemplateContent[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareMessengerGenericTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateContent(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final boolean f49125a;

    /* renamed from: b  reason: collision with root package name */
    public final a f49126b;

    /* renamed from: c  reason: collision with root package name */
    public final ShareMessengerGenericTemplateElement f49127c;

    @Override // com.facebook.share.model.ShareContent
    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30714);
    }

    public enum a {
        HORIZONTAL,
        SQUARE;

        static {
            Covode.recordClassIndex(30716);
        }
    }

    ShareMessengerGenericTemplateContent(Parcel parcel) {
        super(parcel);
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f49125a = z;
        this.f49126b = (a) parcel.readSerializable();
        this.f49127c = (ShareMessengerGenericTemplateElement) parcel.readParcelable(ShareMessengerGenericTemplateElement.class.getClassLoader());
    }

    @Override // com.facebook.share.model.ShareContent
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeByte(this.f49125a ? (byte) 1 : 0);
        parcel.writeSerializable(this.f49126b);
        parcel.writeParcelable(this.f49127c, i2);
    }
}
