package com.ss.android.ugc.aweme.detail.transition;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class FeedShareElementInfo<T extends Parcelable> implements Parcelable {
    public static final Parcelable.Creator<FeedShareElementInfo> CREATOR = new Parcelable.Creator<FeedShareElementInfo>() {
        /* class com.ss.android.ugc.aweme.detail.transition.FeedShareElementInfo.AnonymousClass1 */

        static {
            Covode.recordClassIndex(49681);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FeedShareElementInfo[] newArray(int i2) {
            return new FeedShareElementInfo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FeedShareElementInfo createFromParcel(Parcel parcel) {
            return new FeedShareElementInfo(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public transient View f79855a;

    /* renamed from: b  reason: collision with root package name */
    public Parcelable f79856b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f79857c;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(49680);
    }

    public FeedShareElementInfo(View view) {
        this.f79855a = view;
        view.setTag(R.id.b1z, this);
    }

    protected FeedShareElementInfo(Parcel parcel) {
        boolean z;
        this.f79856b = parcel.readParcelable(Parcelable.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f79857c = z;
    }

    public static FeedShareElementInfo a(View view) {
        if (view == null) {
            return null;
        }
        Object tag = view.getTag(R.id.b1z);
        if (tag instanceof FeedShareElementInfo) {
            return (FeedShareElementInfo) tag;
        }
        return null;
    }

    public static void a(View view, FeedShareElementInfo feedShareElementInfo) {
        if (view != null) {
            view.setTag(R.id.b1z, feedShareElementInfo);
        }
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f79856b, i2);
        parcel.writeByte(this.f79857c ? (byte) 1 : 0);
    }
}
