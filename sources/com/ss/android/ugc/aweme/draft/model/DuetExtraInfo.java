package com.ss.android.ugc.aweme.draft.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class DuetExtraInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<DuetExtraInfo> CREATOR = new a();
    @c(a = "duet_audio_path")
    private final String duetAudioPath;
    @c(a = "duet_layout_direction")
    private final int duetLayoutDirection;
    @c(a = "duet_layout_mode")
    private final String duetLayoutMode;
    @c(a = "duet_video_height")
    private final int duetVideoHeight;
    @c(a = "duet_video_path")
    private final String duetVideoPath;
    @c(a = "duet_video_width")
    private final int duetVideoWidth;

    static {
        Covode.recordClassIndex(51863);
    }

    public DuetExtraInfo() {
        this(null, null, 0, 0, null, 0, 63, null);
    }

    public static int com_ss_android_ugc_aweme_draft_model_DuetExtraInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ DuetExtraInfo copy$default(DuetExtraInfo duetExtraInfo, String str, String str2, int i2, int i3, String str3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = duetExtraInfo.duetVideoPath;
        }
        if ((i5 & 2) != 0) {
            str2 = duetExtraInfo.duetAudioPath;
        }
        if ((i5 & 4) != 0) {
            i2 = duetExtraInfo.duetVideoWidth;
        }
        if ((i5 & 8) != 0) {
            i3 = duetExtraInfo.duetVideoHeight;
        }
        if ((i5 & 16) != 0) {
            str3 = duetExtraInfo.duetLayoutMode;
        }
        if ((i5 & 32) != 0) {
            i4 = duetExtraInfo.duetLayoutDirection;
        }
        return duetExtraInfo.copy(str, str2, i2, i3, str3, i4);
    }

    public final String component1() {
        return this.duetVideoPath;
    }

    public final String component2() {
        return this.duetAudioPath;
    }

    public final int component3() {
        return this.duetVideoWidth;
    }

    public final int component4() {
        return this.duetVideoHeight;
    }

    public final String component5() {
        return this.duetLayoutMode;
    }

    public final int component6() {
        return this.duetLayoutDirection;
    }

    public final DuetExtraInfo copy(String str, String str2, int i2, int i3, String str3, int i4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return new DuetExtraInfo(str, str2, i2, i3, str3, i4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetExtraInfo)) {
            return false;
        }
        DuetExtraInfo duetExtraInfo = (DuetExtraInfo) obj;
        return l.a(this.duetVideoPath, duetExtraInfo.duetVideoPath) && l.a(this.duetAudioPath, duetExtraInfo.duetAudioPath) && this.duetVideoWidth == duetExtraInfo.duetVideoWidth && this.duetVideoHeight == duetExtraInfo.duetVideoHeight && l.a(this.duetLayoutMode, duetExtraInfo.duetLayoutMode) && this.duetLayoutDirection == duetExtraInfo.duetLayoutDirection;
    }

    public final int hashCode() {
        String str = this.duetVideoPath;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.duetAudioPath;
        int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_draft_model_DuetExtraInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.duetVideoWidth)) * 31) + com_ss_android_ugc_aweme_draft_model_DuetExtraInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.duetVideoHeight)) * 31;
        String str3 = this.duetLayoutMode;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((hashCode2 + i2) * 31) + com_ss_android_ugc_aweme_draft_model_DuetExtraInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.duetLayoutDirection);
    }

    public final String toString() {
        return "DuetExtraInfo(duetVideoPath=" + this.duetVideoPath + ", duetAudioPath=" + this.duetAudioPath + ", duetVideoWidth=" + this.duetVideoWidth + ", duetVideoHeight=" + this.duetVideoHeight + ", duetLayoutMode=" + this.duetLayoutMode + ", duetLayoutDirection=" + this.duetLayoutDirection + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.duetVideoPath);
        parcel.writeString(this.duetAudioPath);
        parcel.writeInt(this.duetVideoWidth);
        parcel.writeInt(this.duetVideoHeight);
        parcel.writeString(this.duetLayoutMode);
        parcel.writeInt(this.duetLayoutDirection);
    }

    public final String getDuetAudioPath() {
        return this.duetAudioPath;
    }

    public final int getDuetLayoutDirection() {
        return this.duetLayoutDirection;
    }

    public final String getDuetLayoutMode() {
        return this.duetLayoutMode;
    }

    public final int getDuetVideoHeight() {
        return this.duetVideoHeight;
    }

    public final String getDuetVideoPath() {
        return this.duetVideoPath;
    }

    public final int getDuetVideoWidth() {
        return this.duetVideoWidth;
    }

    public static class a implements Parcelable.Creator<DuetExtraInfo> {
        static {
            Covode.recordClassIndex(51864);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DuetExtraInfo[] newArray(int i2) {
            return new DuetExtraInfo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DuetExtraInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new DuetExtraInfo(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }
    }

    public DuetExtraInfo(String str, String str2, int i2, int i3, String str3, int i4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.duetVideoPath = str;
        this.duetAudioPath = str2;
        this.duetVideoWidth = i2;
        this.duetVideoHeight = i3;
        this.duetLayoutMode = str3;
        this.duetLayoutDirection = i4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DuetExtraInfo(java.lang.String r9, java.lang.String r10, int r11, int r12, java.lang.String r13, int r14, int r15, h.f.b.g r16) {
        /*
            r8 = this;
            r7 = r14
            r2 = r9
            r4 = r11
            r3 = r10
            r5 = r12
            r0 = r15 & 1
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x000c
            r2 = r6
        L_0x000c:
            r0 = r15 & 2
            if (r0 == 0) goto L_0x0011
            r3 = r6
        L_0x0011:
            r1 = r15 & 4
            r0 = 0
            if (r1 == 0) goto L_0x0017
            r4 = 0
        L_0x0017:
            r0 = r15 & 8
            if (r0 == 0) goto L_0x001c
            r5 = 0
        L_0x001c:
            r0 = r15 & 16
            if (r0 == 0) goto L_0x002a
        L_0x0020:
            r0 = r15 & 32
            if (r0 == 0) goto L_0x0025
            r7 = 0
        L_0x0025:
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        L_0x002a:
            r6 = r13
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.draft.model.DuetExtraInfo.<init>(java.lang.String, java.lang.String, int, int, java.lang.String, int, int, h.f.b.g):void");
    }
}
