package com.ss.android.ugc.aweme.preload;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.List;

public class PreloadExtraInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.ss.android.ugc.aweme.preload.PreloadExtraInfo.AnonymousClass1 */

        static {
            Covode.recordClassIndex(74665);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            return new PreloadExtraInfo[i2];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new PreloadExtraInfo(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f115719a;

    /* renamed from: b  reason: collision with root package name */
    public final String f115720b;

    /* renamed from: c  reason: collision with root package name */
    public final String f115721c;

    /* renamed from: d  reason: collision with root package name */
    public final int f115722d;

    /* renamed from: e  reason: collision with root package name */
    public List<String> f115723e;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(74664);
    }

    public PreloadExtraInfo(Parcel parcel) {
        this.f115719a = parcel.readString();
        this.f115720b = parcel.readString();
        this.f115721c = parcel.readString();
        this.f115722d = parcel.readInt();
        parcel.readStringList(this.f115723e);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f115719a);
        parcel.writeString(this.f115720b);
        parcel.writeString(this.f115721c);
        parcel.writeInt(this.f115722d);
        parcel.writeStringList(this.f115723e);
    }

    public PreloadExtraInfo(String str, String str2, String str3, int i2, List<String> list) {
        this.f115719a = str;
        this.f115720b = str2;
        this.f115721c = str3;
        this.f115722d = i2;
        this.f115723e = list;
    }
}
