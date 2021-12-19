package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {
    public static final Parcelable.Creator<ShareMessengerURLActionButton> CREATOR = new Parcelable.Creator<ShareMessengerURLActionButton>() {
        /* class com.facebook.share.model.ShareMessengerURLActionButton.AnonymousClass1 */

        static {
            Covode.recordClassIndex(30725);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareMessengerURLActionButton[] newArray(int i2) {
            return new ShareMessengerURLActionButton[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareMessengerURLActionButton createFromParcel(Parcel parcel) {
            return new ShareMessengerURLActionButton(parcel);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public final Uri f49141b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f49142c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f49143d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f49144e;

    /* renamed from: f  reason: collision with root package name */
    public final a f49145f;

    static {
        Covode.recordClassIndex(30724);
    }

    public enum a {
        WebviewHeightRatioFull,
        WebviewHeightRatioTall,
        WebviewHeightRatioCompact;

        static {
            Covode.recordClassIndex(30726);
        }
    }

    ShareMessengerURLActionButton(Parcel parcel) {
        super(parcel);
        boolean z;
        this.f49141b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        boolean z2 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f49143d = z;
        this.f49142c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f49145f = (a) parcel.readSerializable();
        this.f49144e = parcel.readByte() == 0 ? false : z2;
    }
}
