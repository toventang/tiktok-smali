package com.ss.android.ugc.aweme.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class Cut2EditTransferModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<Cut2EditTransferModel> CREATOR = new a();
    @c(a = "compressVideoTime", b = {"f"})
    private final long compressVideoTime;
    @c(a = "downloadResTime", b = {"e"})
    private final long downloadResTime;
    @c(a = "isVideoCompressed", b = {"a"})
    private final boolean isVideoCompressed;
    @c(a = "musicList", b = {"c"})
    private final List<com.ss.android.ugc.aweme.shortvideo.c> musicList;
    @c(a = "musicSyncMode", b = {"b"})
    private final boolean musicSyncMode;
    @c(a = "resizeImageTime", b = {"d"})
    private final long resizeImageTime;

    static {
        Covode.recordClassIndex(55344);
    }

    public Cut2EditTransferModel() {
        this(false, false, null, 0, 0, 0, 63, null);
    }

    public static int com_ss_android_ugc_aweme_edit_Cut2EditTransferModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.edit.Cut2EditTransferModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cut2EditTransferModel copy$default(Cut2EditTransferModel cut2EditTransferModel, boolean z, boolean z2, List list, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = cut2EditTransferModel.isVideoCompressed;
        }
        if ((i2 & 2) != 0) {
            z2 = cut2EditTransferModel.musicSyncMode;
        }
        if ((i2 & 4) != 0) {
            list = cut2EditTransferModel.musicList;
        }
        if ((i2 & 8) != 0) {
            j2 = cut2EditTransferModel.resizeImageTime;
        }
        if ((i2 & 16) != 0) {
            j3 = cut2EditTransferModel.downloadResTime;
        }
        if ((i2 & 32) != 0) {
            j4 = cut2EditTransferModel.compressVideoTime;
        }
        return cut2EditTransferModel.copy(z, z2, list, j2, j3, j4);
    }

    public final boolean component1() {
        return this.isVideoCompressed;
    }

    public final boolean component2() {
        return this.musicSyncMode;
    }

    public final List<com.ss.android.ugc.aweme.shortvideo.c> component3() {
        return this.musicList;
    }

    public final long component4() {
        return this.resizeImageTime;
    }

    public final long component5() {
        return this.downloadResTime;
    }

    public final long component6() {
        return this.compressVideoTime;
    }

    public final Cut2EditTransferModel copy(boolean z, boolean z2, List<com.ss.android.ugc.aweme.shortvideo.c> list, long j2, long j3, long j4) {
        l.d(list, "");
        return new Cut2EditTransferModel(z, z2, list, j2, j3, j4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cut2EditTransferModel)) {
            return false;
        }
        Cut2EditTransferModel cut2EditTransferModel = (Cut2EditTransferModel) obj;
        return this.isVideoCompressed == cut2EditTransferModel.isVideoCompressed && this.musicSyncMode == cut2EditTransferModel.musicSyncMode && l.a(this.musicList, cut2EditTransferModel.musicList) && this.resizeImageTime == cut2EditTransferModel.resizeImageTime && this.downloadResTime == cut2EditTransferModel.downloadResTime && this.compressVideoTime == cut2EditTransferModel.compressVideoTime;
    }

    public final int hashCode() {
        boolean z = this.isVideoCompressed;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        if (!this.musicSyncMode) {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        List<com.ss.android.ugc.aweme.shortvideo.c> list = this.musicList;
        return ((((((i7 + (list != null ? list.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_edit_Cut2EditTransferModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.resizeImageTime)) * 31) + com_ss_android_ugc_aweme_edit_Cut2EditTransferModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.downloadResTime)) * 31) + com_ss_android_ugc_aweme_edit_Cut2EditTransferModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.compressVideoTime);
    }

    public final String toString() {
        return "Cut2EditTransferModel(isVideoCompressed=" + this.isVideoCompressed + ", musicSyncMode=" + this.musicSyncMode + ", musicList=" + this.musicList + ", resizeImageTime=" + this.resizeImageTime + ", downloadResTime=" + this.downloadResTime + ", compressVideoTime=" + this.compressVideoTime + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.isVideoCompressed ? 1 : 0);
        parcel.writeInt(this.musicSyncMode ? 1 : 0);
        List<com.ss.android.ugc.aweme.shortvideo.c> list = this.musicList;
        parcel.writeInt(list.size());
        for (com.ss.android.ugc.aweme.shortvideo.c cVar : list) {
            parcel.writeSerializable(cVar);
        }
        parcel.writeLong(this.resizeImageTime);
        parcel.writeLong(this.downloadResTime);
        parcel.writeLong(this.compressVideoTime);
    }

    public final long getCompressVideoTime() {
        return this.compressVideoTime;
    }

    public final long getDownloadResTime() {
        return this.downloadResTime;
    }

    public final List<com.ss.android.ugc.aweme.shortvideo.c> getMusicList() {
        return this.musicList;
    }

    public final boolean getMusicSyncMode() {
        return this.musicSyncMode;
    }

    public final long getResizeImageTime() {
        return this.resizeImageTime;
    }

    public final boolean isVideoCompressed() {
        return this.isVideoCompressed;
    }

    public static class a implements Parcelable.Creator<Cut2EditTransferModel> {
        static {
            Covode.recordClassIndex(55345);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Cut2EditTransferModel[] newArray(int i2) {
            return new Cut2EditTransferModel[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Cut2EditTransferModel createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(parcel.readSerializable());
                readInt--;
            }
            return new Cut2EditTransferModel(z2, z, arrayList, parcel.readLong(), parcel.readLong(), parcel.readLong());
        }
    }

    public Cut2EditTransferModel(boolean z, boolean z2, List<com.ss.android.ugc.aweme.shortvideo.c> list, long j2, long j3, long j4) {
        l.d(list, "");
        this.isVideoCompressed = z;
        this.musicSyncMode = z2;
        this.musicList = list;
        this.resizeImageTime = j2;
        this.downloadResTime = j3;
        this.compressVideoTime = j4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Cut2EditTransferModel(boolean z, boolean z2, List list, long j2, long j3, long j4, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) == 0 ? z2 : false, (i2 & 4) != 0 ? new ArrayList() : list, (i2 & 8) != 0 ? 0 : j2, (i2 & 16) != 0 ? 0 : j3, (i2 & 32) == 0 ? j4 : 0);
    }
}
