package dmt.av.video;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class SingleImageCoverBitmapData implements Parcelable, Serializable {
    public static final Parcelable.Creator<SingleImageCoverBitmapData> CREATOR = new a();
    private final long date;
    private final int itemCoverWidth;
    private final int mediaType;
    private final Uri previewBitmapUri;
    private final String sourcePath;
    private final int srcHeight;
    private final int srcWidth;

    static {
        Covode.recordClassIndex(104092);
    }

    public static /* synthetic */ SingleImageCoverBitmapData copy$default(SingleImageCoverBitmapData singleImageCoverBitmapData, String str, int i2, long j2, int i3, int i4, int i5, Uri uri, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = singleImageCoverBitmapData.sourcePath;
        }
        if ((i6 & 2) != 0) {
            i2 = singleImageCoverBitmapData.itemCoverWidth;
        }
        if ((i6 & 4) != 0) {
            j2 = singleImageCoverBitmapData.date;
        }
        if ((i6 & 8) != 0) {
            i3 = singleImageCoverBitmapData.mediaType;
        }
        if ((i6 & 16) != 0) {
            i4 = singleImageCoverBitmapData.srcWidth;
        }
        if ((i6 & 32) != 0) {
            i5 = singleImageCoverBitmapData.srcHeight;
        }
        if ((i6 & 64) != 0) {
            uri = singleImageCoverBitmapData.previewBitmapUri;
        }
        return singleImageCoverBitmapData.copy(str, i2, j2, i3, i4, i5, uri);
    }

    public static int dmt_av_video_SingleImageCoverBitmapData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int dmt_av_video_SingleImageCoverBitmapData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String component1() {
        return this.sourcePath;
    }

    public final int component2() {
        return this.itemCoverWidth;
    }

    public final long component3() {
        return this.date;
    }

    public final int component4() {
        return this.mediaType;
    }

    public final int component5() {
        return this.srcWidth;
    }

    public final int component6() {
        return this.srcHeight;
    }

    public final Uri component7() {
        return this.previewBitmapUri;
    }

    public final SingleImageCoverBitmapData copy(String str, int i2, long j2, int i3, int i4, int i5, Uri uri) {
        l.d(str, "");
        return new SingleImageCoverBitmapData(str, i2, j2, i3, i4, i5, uri);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleImageCoverBitmapData)) {
            return false;
        }
        SingleImageCoverBitmapData singleImageCoverBitmapData = (SingleImageCoverBitmapData) obj;
        return l.a(this.sourcePath, singleImageCoverBitmapData.sourcePath) && this.itemCoverWidth == singleImageCoverBitmapData.itemCoverWidth && this.date == singleImageCoverBitmapData.date && this.mediaType == singleImageCoverBitmapData.mediaType && this.srcWidth == singleImageCoverBitmapData.srcWidth && this.srcHeight == singleImageCoverBitmapData.srcHeight && l.a(this.previewBitmapUri, singleImageCoverBitmapData.previewBitmapUri);
    }

    public final int hashCode() {
        String str = this.sourcePath;
        int i2 = 0;
        int hashCode = (((((((((((str != null ? str.hashCode() : 0) * 31) + dmt_av_video_SingleImageCoverBitmapData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.itemCoverWidth)) * 31) + dmt_av_video_SingleImageCoverBitmapData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.date)) * 31) + dmt_av_video_SingleImageCoverBitmapData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.mediaType)) * 31) + dmt_av_video_SingleImageCoverBitmapData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.srcWidth)) * 31) + dmt_av_video_SingleImageCoverBitmapData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.srcHeight)) * 31;
        Uri uri = this.previewBitmapUri;
        if (uri != null) {
            i2 = uri.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SingleImageCoverBitmapData(sourcePath=" + this.sourcePath + ", itemCoverWidth=" + this.itemCoverWidth + ", date=" + this.date + ", mediaType=" + this.mediaType + ", srcWidth=" + this.srcWidth + ", srcHeight=" + this.srcHeight + ", previewBitmapUri=" + this.previewBitmapUri + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.sourcePath);
        parcel.writeInt(this.itemCoverWidth);
        parcel.writeLong(this.date);
        parcel.writeInt(this.mediaType);
        parcel.writeInt(this.srcWidth);
        parcel.writeInt(this.srcHeight);
        parcel.writeParcelable(this.previewBitmapUri, i2);
    }

    public final long getDate() {
        return this.date;
    }

    public final int getItemCoverWidth() {
        return this.itemCoverWidth;
    }

    public final int getMediaType() {
        return this.mediaType;
    }

    public final Uri getPreviewBitmapUri() {
        return this.previewBitmapUri;
    }

    public final String getSourcePath() {
        return this.sourcePath;
    }

    public final int getSrcHeight() {
        return this.srcHeight;
    }

    public final int getSrcWidth() {
        return this.srcWidth;
    }

    public static class a implements Parcelable.Creator<SingleImageCoverBitmapData> {
        static {
            Covode.recordClassIndex(104093);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SingleImageCoverBitmapData[] newArray(int i2) {
            return new SingleImageCoverBitmapData[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SingleImageCoverBitmapData createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new SingleImageCoverBitmapData(parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Uri) parcel.readParcelable(SingleImageCoverBitmapData.class.getClassLoader()));
        }
    }

    public SingleImageCoverBitmapData(String str, int i2, long j2, int i3, int i4, int i5, Uri uri) {
        l.d(str, "");
        this.sourcePath = str;
        this.itemCoverWidth = i2;
        this.date = j2;
        this.mediaType = i3;
        this.srcWidth = i4;
        this.srcHeight = i5;
        this.previewBitmapUri = uri;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SingleImageCoverBitmapData(String str, int i2, long j2, int i3, int i4, int i5, Uri uri, int i6, g gVar) {
        this(str, i2, j2, i3, i4, i5, (i6 & 64) != 0 ? null : uri);
    }
}
