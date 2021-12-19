package com.ss.android.ugc.aweme.ecommerce.preloader;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class ImagePreloadConfig implements Parcelable {
    public static final Parcelable.Creator<ImagePreloadConfig> CREATOR = new a();
    @c(a = "priority")

    /* renamed from: a  reason: collision with root package name */
    public final List<Integer> f86938a;
    @c(a = "option")

    /* renamed from: b  reason: collision with root package name */
    public final int f86939b;

    static {
        Covode.recordClassIndex(54499);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagePreloadConfig)) {
            return false;
        }
        ImagePreloadConfig imagePreloadConfig = (ImagePreloadConfig) obj;
        return l.a(this.f86938a, imagePreloadConfig.f86938a) && this.f86939b == imagePreloadConfig.f86939b;
    }

    public final int hashCode() {
        List<Integer> list = this.f86938a;
        return ((list != null ? list.hashCode() : 0) * 31) + this.f86939b;
    }

    public final String toString() {
        return "ImagePreloadConfig(priority=" + this.f86938a + ", option=" + this.f86939b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        List<Integer> list = this.f86938a;
        parcel.writeInt(list.size());
        for (Integer num : list) {
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.f86939b);
    }

    public static class a implements Parcelable.Creator<ImagePreloadConfig> {
        static {
            Covode.recordClassIndex(54500);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ImagePreloadConfig[] newArray(int i2) {
            return new ImagePreloadConfig[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ImagePreloadConfig createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
                readInt--;
            }
            return new ImagePreloadConfig(arrayList, parcel.readInt());
        }
    }

    public /* synthetic */ ImagePreloadConfig() {
        this(z.INSTANCE, 0);
    }

    public ImagePreloadConfig(List<Integer> list, int i2) {
        l.d(list, "");
        this.f86938a = list;
        this.f86939b = i2;
    }
}
