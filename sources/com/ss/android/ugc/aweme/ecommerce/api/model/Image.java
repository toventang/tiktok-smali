package com.ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class Image implements Parcelable {
    public static final Parcelable.Creator<Image> CREATOR = new a();
    @c(a = "height")
    private final Integer height;
    @c(a = "mimetype")
    private final String mimetype;
    @c(a = "thumb_uri")
    private final String thumbUri;
    @c(a = "thumb_url_list")
    private final List<String> thumbUrls;
    @c(a = "uri")
    private final String uri;
    @c(a = "url_list")
    private final List<String> urls;
    @c(a = "width")
    private final Integer width;

    static {
        Covode.recordClassIndex(52842);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.api.model.Image */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Image copy$default(Image image, Integer num, Integer num2, String str, String str2, List list, String str3, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = image.width;
        }
        if ((i2 & 2) != 0) {
            num2 = image.height;
        }
        if ((i2 & 4) != 0) {
            str = image.mimetype;
        }
        if ((i2 & 8) != 0) {
            str2 = image.uri;
        }
        if ((i2 & 16) != 0) {
            list = image.urls;
        }
        if ((i2 & 32) != 0) {
            str3 = image.thumbUri;
        }
        if ((i2 & 64) != 0) {
            list2 = image.thumbUrls;
        }
        return image.copy(num, num2, str, str2, list, str3, list2);
    }

    public final Integer component1() {
        return this.width;
    }

    public final Integer component2() {
        return this.height;
    }

    public final String component3() {
        return this.mimetype;
    }

    public final String component4() {
        return this.uri;
    }

    public final List<String> component5() {
        return this.urls;
    }

    public final String component6() {
        return this.thumbUri;
    }

    public final List<String> component7() {
        return this.thumbUrls;
    }

    public final Image copy(Integer num, Integer num2, String str, String str2, List<String> list, String str3, List<String> list2) {
        return new Image(num, num2, str, str2, list, str3, list2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        return l.a(this.width, image.width) && l.a(this.height, image.height) && l.a(this.mimetype, image.mimetype) && l.a(this.uri, image.uri) && l.a(this.urls, image.urls) && l.a(this.thumbUri, image.thumbUri) && l.a(this.thumbUrls, image.thumbUrls);
    }

    public final int hashCode() {
        Integer num = this.width;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.height;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.mimetype;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.uri;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.urls;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.thumbUri;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list2 = this.thumbUrls;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "Image(width=" + this.width + ", height=" + this.height + ", mimetype=" + this.mimetype + ", uri=" + this.uri + ", urls=" + this.urls + ", thumbUri=" + this.thumbUri + ", thumbUrls=" + this.thumbUrls + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        Integer num = this.width;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num2 = this.height;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.mimetype);
        parcel.writeString(this.uri);
        parcel.writeStringList(this.urls);
        parcel.writeString(this.thumbUri);
        parcel.writeStringList(this.thumbUrls);
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getMimetype() {
        return this.mimetype;
    }

    public final String getThumbUri() {
        return this.thumbUri;
    }

    public final List<String> getThumbUrls() {
        return this.thumbUrls;
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrls() {
        return this.urls;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public static class a implements Parcelable.Creator<Image> {
        static {
            Covode.recordClassIndex(52843);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Image[] newArray(int i2) {
            return new Image[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Image createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            Integer num = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new Image(valueOf, num, parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.createStringArrayList());
        }
    }

    public final com.bytedance.lighten.a.a.a toImageUrlModel() {
        return new com.bytedance.lighten.a.a.a(this.urls);
    }

    public final com.bytedance.lighten.a.a.a toThumbImageUrlModel() {
        return new com.bytedance.lighten.a.a.a(this.thumbUrls);
    }

    public final com.bytedance.lighten.a.a.a toThumbFirstImageUrlModel() {
        List<String> list = this.thumbUrls;
        if (list == null || list.isEmpty()) {
            return toImageUrlModel();
        }
        return toThumbImageUrlModel();
    }

    public Image(Integer num, Integer num2, String str, String str2, List<String> list, String str3, List<String> list2) {
        this.width = num;
        this.height = num2;
        this.mimetype = str;
        this.uri = str2;
        this.urls = list;
        this.thumbUri = str3;
        this.thumbUrls = list2;
    }
}
