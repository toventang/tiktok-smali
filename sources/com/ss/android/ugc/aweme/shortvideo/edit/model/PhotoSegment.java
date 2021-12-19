package com.ss.android.ugc.aweme.shortvideo.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class PhotoSegment implements Parcelable {
    public static final Parcelable.Creator<PhotoSegment> CREATOR = new a();
    private final int height;
    private final String path;
    private final int width;

    static {
        Covode.recordClassIndex(83788);
    }

    public static /* synthetic */ PhotoSegment copy$default(PhotoSegment photoSegment, String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = photoSegment.path;
        }
        if ((i4 & 2) != 0) {
            i2 = photoSegment.width;
        }
        if ((i4 & 4) != 0) {
            i3 = photoSegment.height;
        }
        return photoSegment.copy(str, i2, i3);
    }

    public final String component1() {
        return this.path;
    }

    public final int component2() {
        return this.width;
    }

    public final int component3() {
        return this.height;
    }

    public final PhotoSegment copy(String str, int i2, int i3) {
        l.d(str, "");
        return new PhotoSegment(str, i2, i3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoSegment)) {
            return false;
        }
        PhotoSegment photoSegment = (PhotoSegment) obj;
        return l.a(this.path, photoSegment.path) && this.width == photoSegment.width && this.height == photoSegment.height;
    }

    public final int hashCode() {
        String str = this.path;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.width) * 31) + this.height;
    }

    public final String toString() {
        return "PhotoSegment(path=" + this.path + ", width=" + this.width + ", height=" + this.height + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.path);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getPath() {
        return this.path;
    }

    public final int getWidth() {
        return this.width;
    }

    public static class a implements Parcelable.Creator<PhotoSegment> {
        static {
            Covode.recordClassIndex(83789);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PhotoSegment[] newArray(int i2) {
            return new PhotoSegment[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PhotoSegment createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new PhotoSegment(parcel.readString(), parcel.readInt(), parcel.readInt());
        }
    }

    public PhotoSegment(String str, int i2, int i3) {
        l.d(str, "");
        this.path = str;
        this.width = i2;
        this.height = i3;
    }
}
