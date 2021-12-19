package com.bytedance.android.live.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImageModel implements Parcelable {
    public static final Parcelable.Creator<ImageModel> CREATOR = new Parcelable.Creator<ImageModel>() {
        /* class com.bytedance.android.live.base.model.ImageModel.AnonymousClass1 */

        static {
            Covode.recordClassIndex(3575);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ImageModel[] newArray(int i2) {
            return new ImageModel[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ImageModel createFromParcel(Parcel parcel) {
            return new ImageModel(parcel);
        }
    };
    @c(a = "avg_color")
    public String avgColor;
    @c(a = "content")
    Content content;
    @c(a = "height")
    public int height;
    @c(a = "image_type")
    int imageType;
    @c(a = "is_animated")
    boolean isAnimated;
    private boolean isFeedCandidate;
    private boolean isLoaded;
    private boolean isMonitored;
    @c(a = "uri")
    public String mUri;
    @c(a = "url_list")
    public List<String> mUrls = new ArrayList();
    @c(a = "open_web_url")
    public String schema;
    @c(a = "width")
    public int width;

    public int describeContents() {
        return 0;
    }

    public static class Content implements Parcelable {
        public static final Parcelable.Creator<Content> CREATOR = new Parcelable.Creator<Content>() {
            /* class com.bytedance.android.live.base.model.ImageModel.Content.AnonymousClass1 */

            static {
                Covode.recordClassIndex(3577);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Content[] newArray(int i2) {
                return new Content[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Content createFromParcel(Parcel parcel) {
                return new Content(parcel);
            }
        };
        @c(a = StringSet.name)

        /* renamed from: a  reason: collision with root package name */
        public String f7366a;
        @c(a = "font_color")

        /* renamed from: b  reason: collision with root package name */
        public String f7367b;
        @c(a = "level")

        /* renamed from: c  reason: collision with root package name */
        public long f7368c;

        public int describeContents() {
            return 0;
        }

        public Content() {
        }

        static {
            Covode.recordClassIndex(3576);
        }

        protected Content(Parcel parcel) {
            this.f7366a = parcel.readString();
            this.f7367b = parcel.readString();
            this.f7368c = parcel.readLong();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f7366a);
            parcel.writeString(this.f7367b);
            parcel.writeLong(this.f7368c);
        }
    }

    public String getAvgColor() {
        return this.avgColor;
    }

    public int getHeight() {
        return this.height;
    }

    @c(a = "content")
    public Content getImageContent() {
        return this.content;
    }

    @c(a = "image_type")
    public int getImageType() {
        return this.imageType;
    }

    @c(a = "open_web_url")
    public String getSchema() {
        return this.schema;
    }

    @c(a = "uri")
    public String getUri() {
        return this.mUri;
    }

    @c(a = "url_list")
    public List<String> getUrls() {
        return this.mUrls;
    }

    public int getWidth() {
        return this.width;
    }

    @c(a = "is_animated")
    public boolean isAnimated() {
        return this.isAnimated;
    }

    public boolean isFeedCandidate() {
        return this.isFeedCandidate;
    }

    public boolean isLoaded() {
        return this.isLoaded;
    }

    public boolean isMonitored() {
        return this.isMonitored;
    }

    static {
        Covode.recordClassIndex(3574);
    }

    public ImageModel() {
    }

    public int hashCode() {
        return hash(this.avgColor, this.mUri, this.mUrls, Integer.valueOf(this.width), Integer.valueOf(this.height));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder append = sb.append("{\"uri\":\"");
        String str = this.mUri;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        StringBuilder append2 = append.append(str).append("\",\"image_type\":\"");
        String str3 = this.schema;
        if (str3 != null) {
            str2 = str3;
        }
        append2.append(str2).append("\",\"url_list\":[");
        List<String> list = this.mUrls;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append("\"").append(this.mUrls.get(i2)).append("\"");
                if (i2 != size - 1) {
                    sb.append(",");
                }
            }
        }
        sb.append("]}");
        return sb.toString();
    }

    @c(a = "is_animated")
    public void setAnimated(boolean z) {
        this.isAnimated = z;
    }

    public void setAvgColor(String str) {
        this.avgColor = str;
    }

    @c(a = "content")
    public void setContent(Content content2) {
        this.content = content2;
    }

    public void setFeedCandidate(boolean z) {
        this.isFeedCandidate = z;
    }

    public void setHeight(int i2) {
        this.height = i2;
    }

    @c(a = "image_type")
    public void setImageType(int i2) {
        this.imageType = i2;
    }

    public void setLoaded(boolean z) {
        this.isLoaded = z;
    }

    public void setMonitored(boolean z) {
        this.isMonitored = z;
    }

    @c(a = "open_web_url")
    public void setSchema(String str) {
        this.schema = str;
    }

    @c(a = "uri")
    public void setUri(String str) {
        this.mUri = str;
    }

    @c(a = "url_list")
    public void setUrls(List<String> list) {
        this.mUrls = list;
    }

    public void setWidth(int i2) {
        this.width = i2;
    }

    public static ImageModel genBy(String str) {
        ImageModel imageModel = new ImageModel();
        imageModel.setUrls(Collections.singletonList(str));
        return imageModel;
    }

    private static int hash(Object... objArr) {
        int hashCode;
        if (objArr == null) {
            return 0;
        }
        int i2 = 1;
        for (Object obj : objArr) {
            int i3 = i2 * 31;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i2 = i3 + hashCode;
        }
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ImageModel imageModel = (ImageModel) obj;
            if (this.width != imageModel.width || this.height != imageModel.height || !equals(this.avgColor, imageModel.avgColor) || !equals(this.mUri, imageModel.mUri) || !equals(this.mUrls, imageModel.mUrls)) {
                return false;
            }
            return true;
        }
        return false;
    }

    protected ImageModel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.mUri = parcel.readString();
        this.mUrls = parcel.createStringArrayList();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.schema = parcel.readString();
        this.imageType = parcel.readInt();
        this.content = (Content) parcel.readParcelable(Content.class.getClassLoader());
        boolean z4 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isAnimated = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isLoaded = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isMonitored = z3;
        this.isFeedCandidate = parcel.readByte() == 0 ? false : z4;
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public ImageModel(String str, List<String> list) {
        this.mUri = str;
        this.mUrls = list;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.mUri);
        parcel.writeStringList(this.mUrls);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.schema);
        parcel.writeInt(this.imageType);
        parcel.writeParcelable(this.content, i2);
        parcel.writeByte(this.isAnimated ? (byte) 1 : 0);
        parcel.writeByte(this.isLoaded ? (byte) 1 : 0);
        parcel.writeByte(this.isMonitored ? (byte) 1 : 0);
        parcel.writeByte(this.isFeedCandidate ? (byte) 1 : 0);
    }

    public ImageModel(String str, List<String> list, String str2) {
        this.mUri = str;
        this.mUrls = list;
        this.schema = str2;
    }
}
