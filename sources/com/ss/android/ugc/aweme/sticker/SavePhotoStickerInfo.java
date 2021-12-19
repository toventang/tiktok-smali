package com.ss.android.ugc.aweme.sticker;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class SavePhotoStickerInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<SavePhotoStickerInfo> CREATOR = new a();
    @c(a = "capturedPhotoDir", b = {"c"})
    private String capturedPhotoDir;
    @c(a = "capturedPhotoPaths", b = {"a"})
    private List<String> capturedPhotoPaths;
    @c(a = "stickerToast", b = {"b"})
    private final String stickerToast;

    static {
        Covode.recordClassIndex(88028);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SavePhotoStickerInfo copy$default(SavePhotoStickerInfo savePhotoStickerInfo, List list, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = savePhotoStickerInfo.capturedPhotoPaths;
        }
        if ((i2 & 2) != 0) {
            str = savePhotoStickerInfo.stickerToast;
        }
        if ((i2 & 4) != 0) {
            str2 = savePhotoStickerInfo.capturedPhotoDir;
        }
        return savePhotoStickerInfo.copy(list, str, str2);
    }

    public final List<String> component1() {
        return this.capturedPhotoPaths;
    }

    public final String component2() {
        return this.stickerToast;
    }

    public final String component3() {
        return this.capturedPhotoDir;
    }

    public final SavePhotoStickerInfo copy(List<String> list, String str, String str2) {
        return new SavePhotoStickerInfo(list, str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavePhotoStickerInfo)) {
            return false;
        }
        SavePhotoStickerInfo savePhotoStickerInfo = (SavePhotoStickerInfo) obj;
        return l.a(this.capturedPhotoPaths, savePhotoStickerInfo.capturedPhotoPaths) && l.a(this.stickerToast, savePhotoStickerInfo.stickerToast) && l.a(this.capturedPhotoDir, savePhotoStickerInfo.capturedPhotoDir);
    }

    public final int hashCode() {
        List<String> list = this.capturedPhotoPaths;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.stickerToast;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.capturedPhotoDir;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "SavePhotoStickerInfo(capturedPhotoPaths=" + this.capturedPhotoPaths + ", stickerToast=" + this.stickerToast + ", capturedPhotoDir=" + this.capturedPhotoDir + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeStringList(this.capturedPhotoPaths);
        parcel.writeString(this.stickerToast);
        parcel.writeString(this.capturedPhotoDir);
    }

    public final String getCapturedPhotoDir() {
        return this.capturedPhotoDir;
    }

    public final List<String> getCapturedPhotoPaths() {
        return this.capturedPhotoPaths;
    }

    public final String getStickerToast() {
        return this.stickerToast;
    }

    public static class a implements Parcelable.Creator<SavePhotoStickerInfo> {
        static {
            Covode.recordClassIndex(88029);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SavePhotoStickerInfo[] newArray(int i2) {
            return new SavePhotoStickerInfo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SavePhotoStickerInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new SavePhotoStickerInfo(parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }
    }

    public final void setCapturedPhotoDir(String str) {
        this.capturedPhotoDir = str;
    }

    public final void setCapturedPhotoPaths(List<String> list) {
        this.capturedPhotoPaths = list;
    }

    public SavePhotoStickerInfo(List<String> list, String str, String str2) {
        this.capturedPhotoPaths = list;
        this.stickerToast = str;
        this.capturedPhotoDir = str2;
    }
}
