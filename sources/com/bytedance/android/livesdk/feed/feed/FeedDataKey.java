package com.bytedance.android.livesdk.feed.feed;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public class FeedDataKey implements Parcelable {
    public static final Parcelable.Creator<FeedDataKey> CREATOR = new Parcelable.Creator<FeedDataKey>() {
        /* class com.bytedance.android.livesdk.feed.feed.FeedDataKey.AnonymousClass1 */

        static {
            Covode.recordClassIndex(9677);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FeedDataKey[] newArray(int i2) {
            return new FeedDataKey[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FeedDataKey createFromParcel(Parcel parcel) {
            return new FeedDataKey(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), (byte) 0);
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static final Integer f17454d = 1;

    /* renamed from: e  reason: collision with root package name */
    private static final Integer f17455e = 0;

    /* renamed from: f  reason: collision with root package name */
    private static final Integer f17456f = 31;

    /* renamed from: a  reason: collision with root package name */
    public String f17457a;

    /* renamed from: b  reason: collision with root package name */
    public String f17458b;

    /* renamed from: c  reason: collision with root package name */
    public long f17459c;

    /* renamed from: g  reason: collision with root package name */
    private int f17460g;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(9676);
    }

    public int hashCode() {
        int i2;
        Integer num = f17456f;
        int intValue = num.intValue();
        String str = this.f17458b;
        int i3 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int intValue2 = num.intValue() * (intValue + i2);
        String str2 = this.f17457a;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return (num.intValue() * (intValue2 + i3)) + Long.valueOf(this.f17459c).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("label: ");
        String str = this.f17458b;
        String str2 = "null";
        if (str == null) {
            str = str2;
        }
        StringBuilder append = sb.append(str).append("; url: ");
        String str3 = this.f17457a;
        if (str3 != null) {
            str2 = str3;
        }
        return append.append(str2).append("; id: ").append(this.f17459c).append("; repeatCheck: ").append(this.f17460g).toString();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof FeedDataKey)) {
            FeedDataKey feedDataKey = (FeedDataKey) obj;
            if (!TextUtils.equals(this.f17458b, feedDataKey.f17458b) || !TextUtils.equals(this.f17457a, feedDataKey.f17457a) || this.f17459c != feedDataKey.f17459c) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f17458b);
        parcel.writeString(this.f17457a);
        parcel.writeLong(this.f17459c);
        parcel.writeInt(this.f17460g);
    }

    public static FeedDataKey a(String str, String str2, long j2) {
        int intValue = f17454d.intValue();
        if (!TextUtils.isEmpty(str)) {
            return new FeedDataKey(str, str2, j2, intValue);
        }
        throw new IllegalArgumentException("label must not be null or empty");
    }

    private FeedDataKey(String str, String str2, long j2, int i2) {
        this.f17457a = "";
        this.f17458b = "";
        this.f17459c = Long.MIN_VALUE;
        this.f17460g = f17454d.intValue();
        this.f17458b = str;
        this.f17457a = str2;
        this.f17459c = j2;
        this.f17460g = i2;
    }

    /* synthetic */ FeedDataKey(String str, String str2, long j2, int i2, byte b2) {
        this(str, str2, j2, i2);
    }
}
