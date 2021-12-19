package com.ss.android.ugc.aweme.utils;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class ZoomAnimationUtils {
    static {
        Covode.recordClassIndex(93267);
    }

    public static class ZoomInfo implements Parcelable {
        public static final Parcelable.Creator<ZoomInfo> CREATOR = new Parcelable.Creator<ZoomInfo>() {
            /* class com.ss.android.ugc.aweme.utils.ZoomAnimationUtils.ZoomInfo.AnonymousClass1 */

            static {
                Covode.recordClassIndex(93269);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ZoomInfo[] newArray(int i2) {
                return new ZoomInfo[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ZoomInfo createFromParcel(Parcel parcel) {
                return new ZoomInfo(parcel);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public int f142580a;

        /* renamed from: b  reason: collision with root package name */
        public int f142581b;

        /* renamed from: c  reason: collision with root package name */
        public int f142582c;

        /* renamed from: d  reason: collision with root package name */
        public int f142583d;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(93268);
        }

        protected ZoomInfo(Parcel parcel) {
            this.f142580a = parcel.readInt();
            this.f142581b = parcel.readInt();
            this.f142582c = parcel.readInt();
            this.f142583d = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f142580a);
            parcel.writeInt(this.f142581b);
            parcel.writeInt(this.f142582c);
            parcel.writeInt(this.f142583d);
        }

        public ZoomInfo(int i2, int i3, int i4, int i5) {
            this.f142580a = i2;
            this.f142581b = i3;
            this.f142582c = i4;
            this.f142583d = i5;
        }
    }

    public static ZoomInfo a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new ZoomInfo(iArr[0], iArr[1], view.getWidth(), view.getHeight());
    }
}
