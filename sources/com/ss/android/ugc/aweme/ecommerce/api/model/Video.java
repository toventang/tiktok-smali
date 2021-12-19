package com.ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class Video implements Parcelable {
    public static final Parcelable.Creator<Video> CREATOR = new a();
    @c(a = "id")

    /* renamed from: a  reason: collision with root package name */
    public final String f84633a;
    @c(a = "duration")

    /* renamed from: b  reason: collision with root package name */
    public final Double f84634b;
    @c(a = "post_url")

    /* renamed from: c  reason: collision with root package name */
    public final String f84635c;
    @c(a = "media_type")

    /* renamed from: d  reason: collision with root package name */
    public final String f84636d;
    @c(a = "video_infos")

    /* renamed from: e  reason: collision with root package name */
    public final List<VideoInfo> f84637e;

    static {
        Covode.recordClassIndex(52852);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Video)) {
            return false;
        }
        Video video = (Video) obj;
        return l.a(this.f84633a, video.f84633a) && l.a(this.f84634b, video.f84634b) && l.a(this.f84635c, video.f84635c) && l.a(this.f84636d, video.f84636d) && l.a(this.f84637e, video.f84637e);
    }

    public final int hashCode() {
        String str = this.f84633a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Double d2 = this.f84634b;
        int hashCode2 = (hashCode + (d2 != null ? d2.hashCode() : 0)) * 31;
        String str2 = this.f84635c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f84636d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<VideoInfo> list = this.f84637e;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "Video(id=" + this.f84633a + ", duration=" + this.f84634b + ", postUrl=" + this.f84635c + ", mediaType=" + this.f84636d + ", urls=" + this.f84637e + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f84633a);
        Double d2 = this.f84634b;
        if (d2 != null) {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f84635c);
        parcel.writeString(this.f84636d);
        List<VideoInfo> list = this.f84637e;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (VideoInfo videoInfo : list) {
                videoInfo.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    public static class a implements Parcelable.Creator<Video> {
        static {
            Covode.recordClassIndex(52853);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Video[] newArray(int i2) {
            return new Video[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Video createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            String readString = parcel.readString();
            ArrayList arrayList = null;
            Double valueOf = parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(VideoInfo.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            }
            return new Video(readString, valueOf, readString2, readString3, arrayList);
        }
    }

    public Video(String str, Double d2, String str2, String str3, List<VideoInfo> list) {
        this.f84633a = str;
        this.f84634b = d2;
        this.f84635c = str2;
        this.f84636d = str3;
        this.f84637e = list;
    }
}
