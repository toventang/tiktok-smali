package com.ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class VideoInfo implements Parcelable {
    public static final Parcelable.Creator<VideoInfo> CREATOR = new a();
    @c(a = "main_url")

    /* renamed from: a  reason: collision with root package name */
    public final String f84638a;
    @c(a = "backup_url")

    /* renamed from: b  reason: collision with root package name */
    public final String f84639b;
    @c(a = "url_expire")

    /* renamed from: c  reason: collision with root package name */
    public final Integer f84640c;
    @c(a = "width")

    /* renamed from: d  reason: collision with root package name */
    public final Integer f84641d;
    @c(a = "height")

    /* renamed from: e  reason: collision with root package name */
    public final Integer f84642e;
    @c(a = "file_hash")

    /* renamed from: f  reason: collision with root package name */
    public final String f84643f;
    @c(a = "format")

    /* renamed from: g  reason: collision with root package name */
    public final String f84644g;
    @c(a = "size")

    /* renamed from: h  reason: collision with root package name */
    public final Integer f84645h;
    @c(a = "bitrate")

    /* renamed from: i  reason: collision with root package name */
    public final Integer f84646i;

    static {
        Covode.recordClassIndex(52854);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfo)) {
            return false;
        }
        VideoInfo videoInfo = (VideoInfo) obj;
        return l.a(this.f84638a, videoInfo.f84638a) && l.a(this.f84639b, videoInfo.f84639b) && l.a(this.f84640c, videoInfo.f84640c) && l.a(this.f84641d, videoInfo.f84641d) && l.a(this.f84642e, videoInfo.f84642e) && l.a(this.f84643f, videoInfo.f84643f) && l.a(this.f84644g, videoInfo.f84644g) && l.a(this.f84645h, videoInfo.f84645h) && l.a(this.f84646i, videoInfo.f84646i);
    }

    public final int hashCode() {
        String str = this.f84638a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f84639b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f84640c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f84641d;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f84642e;
        int hashCode5 = (hashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31;
        String str3 = this.f84643f;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f84644g;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num4 = this.f84645h;
        int hashCode8 = (hashCode7 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Integer num5 = this.f84646i;
        if (num5 != null) {
            i2 = num5.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "VideoInfo(mainUrl=" + this.f84638a + ", backupUrl=" + this.f84639b + ", urlExpire=" + this.f84640c + ", width=" + this.f84641d + ", height=" + this.f84642e + ", fileHash=" + this.f84643f + ", format=" + this.f84644g + ", size=" + this.f84645h + ", bitrate=" + this.f84646i + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f84638a);
        parcel.writeString(this.f84639b);
        Integer num = this.f84640c;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num2 = this.f84641d;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num3 = this.f84642e;
        if (num3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f84643f);
        parcel.writeString(this.f84644g);
        Integer num4 = this.f84645h;
        if (num4 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num5 = this.f84646i;
        if (num5 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
            return;
        }
        parcel.writeInt(0);
    }

    public static class a implements Parcelable.Creator<VideoInfo> {
        static {
            Covode.recordClassIndex(52855);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VideoInfo[] newArray(int i2) {
            return new VideoInfo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VideoInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer num = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            Integer valueOf3 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Integer valueOf4 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new VideoInfo(readString, readString2, valueOf, valueOf2, valueOf3, readString3, readString4, valueOf4, num);
        }
    }

    public VideoInfo(String str, String str2, Integer num, Integer num2, Integer num3, String str3, String str4, Integer num4, Integer num5) {
        this.f84638a = str;
        this.f84639b = str2;
        this.f84640c = num;
        this.f84641d = num2;
        this.f84642e = num3;
        this.f84643f = str3;
        this.f84644g = str4;
        this.f84645h = num4;
        this.f84646i = num5;
    }
}
