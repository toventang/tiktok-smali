package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.share.model.ShareOpenGraphValueContainer;

public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer<ShareOpenGraphAction, a> {
    public static final Parcelable.Creator<ShareOpenGraphAction> CREATOR = new Parcelable.Creator<ShareOpenGraphAction>() {
        /* class com.facebook.share.model.ShareOpenGraphAction.AnonymousClass1 */

        static {
            Covode.recordClassIndex(30729);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareOpenGraphAction[] newArray(int i2) {
            return new ShareOpenGraphAction[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareOpenGraphAction createFromParcel(Parcel parcel) {
            return new ShareOpenGraphAction(parcel);
        }
    };

    static {
        Covode.recordClassIndex(30728);
    }

    ShareOpenGraphAction(Parcel parcel) {
        super(parcel);
    }

    private ShareOpenGraphAction(a aVar) {
        super(aVar);
    }

    public static final class a extends ShareOpenGraphValueContainer.a<ShareOpenGraphAction, a> {
        static {
            Covode.recordClassIndex(30730);
        }

        /* access modifiers changed from: private */
        public a a(ShareOpenGraphAction shareOpenGraphAction) {
            if (shareOpenGraphAction == null) {
                return this;
            }
            a aVar = (a) super.a((ShareOpenGraphValueContainer) shareOpenGraphAction);
            aVar.f49150a.putString("og:type", shareOpenGraphAction.b("og:type"));
            return aVar;
        }

        /* access modifiers changed from: package-private */
        public final a a(Parcel parcel) {
            return a((ShareOpenGraphAction) parcel.readParcelable(ShareOpenGraphAction.class.getClassLoader()));
        }
    }

    /* synthetic */ ShareOpenGraphAction(a aVar, byte b2) {
        this(aVar);
    }
}
