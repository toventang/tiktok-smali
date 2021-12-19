package com.kakao.network.storage;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class ImageInfo implements Parcelable {
    public static final Parcelable.Creator<ImageInfo> CREATOR = new Parcelable.Creator<ImageInfo>() {
        /* class com.kakao.network.storage.ImageInfo.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34395);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageInfo[] newArray(int i2) {
            return new ImageInfo[i2];
        }

        @Override // android.os.Parcelable.Creator
        public final ImageInfo createFromParcel(Parcel parcel) {
            return new ImageInfo(parcel);
        }
    };
    private String contentType;
    private Integer height;
    private Integer length;
    private String url;
    private Integer width;

    public int describeContents() {
        return 0;
    }

    public enum ImageSize {
        ORIGINAL("original");
        
        private final String imageSize;

        public final String getValue() {
            return this.imageSize;
        }

        static {
            Covode.recordClassIndex(34396);
        }

        private ImageSize(String str) {
            this.imageSize = str;
        }
    }

    public String getContentType() {
        return this.contentType;
    }

    public Integer getHeight() {
        return this.height;
    }

    public Integer getLength() {
        return this.length;
    }

    public String getUrl() {
        return this.url;
    }

    public Integer getWidth() {
        return this.width;
    }

    static {
        Covode.recordClassIndex(34394);
    }

    protected ImageInfo(Parcel parcel) {
        this.url = parcel.readString();
        this.length = Integer.valueOf(parcel.readInt());
        this.contentType = parcel.readString();
        this.width = Integer.valueOf(parcel.readInt());
        this.height = Integer.valueOf(parcel.readInt());
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.url);
        parcel.writeInt(this.length.intValue());
        parcel.writeString(this.contentType);
        parcel.writeInt(this.width.intValue());
        parcel.writeInt(this.height.intValue());
    }

    ImageInfo(String str, Integer num, String str2, Integer num2, Integer num3) {
        this.url = str;
        this.length = num;
        this.contentType = str2;
        this.width = num2;
        this.height = num3;
    }
}
