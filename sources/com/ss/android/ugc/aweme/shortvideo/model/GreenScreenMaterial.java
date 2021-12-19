package com.ss.android.ugc.aweme.shortvideo.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class GreenScreenMaterial implements Parcelable, Serializable {
    public static final Parcelable.Creator<GreenScreenMaterial> CREATOR = new Creator();
    public static final Companion Companion = new Companion(null);
    public static final String[] MEDIA_TYPE_STRING = {"all", UGCMonitor.TYPE_PHOTO, "video", "giphy"};
    @c(a = "author_name")
    private String authorName;
    @c(a = "end_time")
    private long endTime;
    private String localPath;
    private String mediasource;
    @c(a = "resource_id")
    private String resId;
    @c(a = "start_time")
    private long startTime;
    @c(a = "effect_id")
    private String stickerId;
    @c(a = StringSet.type)
    private int type;

    public static class Creator implements Parcelable.Creator<GreenScreenMaterial> {
        static {
            Covode.recordClassIndex(84448);
        }

        @Override // android.os.Parcelable.Creator
        public final GreenScreenMaterial createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new GreenScreenMaterial(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GreenScreenMaterial[] newArray(int i2) {
            return new GreenScreenMaterial[i2];
        }
    }

    public GreenScreenMaterial() {
        this(0, 0, 0, null, null, null, null, null, 255, null);
    }

    public static final byte[] bundleToBytes(Bundle bundle) {
        return Companion.bundleToBytes(bundle);
    }

    public static final Bundle bytesToBundle(byte[] bArr) {
        return Companion.bytesToBundle(bArr);
    }

    public static int com_ss_android_ugc_aweme_shortvideo_model_GreenScreenMaterial_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_shortvideo_model_GreenScreenMaterial_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ GreenScreenMaterial copy$default(GreenScreenMaterial greenScreenMaterial, int i2, long j2, long j3, String str, String str2, String str3, String str4, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = greenScreenMaterial.type;
        }
        if ((i3 & 2) != 0) {
            j2 = greenScreenMaterial.startTime;
        }
        if ((i3 & 4) != 0) {
            j3 = greenScreenMaterial.endTime;
        }
        if ((i3 & 8) != 0) {
            str = greenScreenMaterial.resId;
        }
        if ((i3 & 16) != 0) {
            str2 = greenScreenMaterial.authorName;
        }
        if ((i3 & 32) != 0) {
            str3 = greenScreenMaterial.stickerId;
        }
        if ((i3 & 64) != 0) {
            str4 = greenScreenMaterial.localPath;
        }
        if ((i3 & 128) != 0) {
            str5 = greenScreenMaterial.mediasource;
        }
        return greenScreenMaterial.copy(i2, j2, j3, str, str2, str3, str4, str5);
    }

    public static final void register(com.bytedance.creativex.a.a.c cVar) {
        Companion.register(cVar);
    }

    public final int component1() {
        return this.type;
    }

    public final long component2() {
        return this.startTime;
    }

    public final long component3() {
        return this.endTime;
    }

    public final String component4() {
        return this.resId;
    }

    public final String component5() {
        return this.authorName;
    }

    public final String component6() {
        return this.stickerId;
    }

    public final String component7() {
        return this.localPath;
    }

    public final String component8() {
        return this.mediasource;
    }

    public final GreenScreenMaterial copy(int i2, long j2, long j3, String str, String str2, String str3, String str4, String str5) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        return new GreenScreenMaterial(i2, j2, j3, str, str2, str3, str4, str5);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GreenScreenMaterial)) {
            return false;
        }
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) obj;
        return this.type == greenScreenMaterial.type && this.startTime == greenScreenMaterial.startTime && this.endTime == greenScreenMaterial.endTime && l.a(this.resId, greenScreenMaterial.resId) && l.a(this.authorName, greenScreenMaterial.authorName) && l.a(this.stickerId, greenScreenMaterial.stickerId) && l.a(this.localPath, greenScreenMaterial.localPath) && l.a(this.mediasource, greenScreenMaterial.mediasource);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_shortvideo_model_GreenScreenMaterial_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((com_ss_android_ugc_aweme_shortvideo_model_GreenScreenMaterial_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.type) * 31) + com_ss_android_ugc_aweme_shortvideo_model_GreenScreenMaterial_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.startTime)) * 31) + com_ss_android_ugc_aweme_shortvideo_model_GreenScreenMaterial_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.endTime)) * 31;
        String str = this.resId;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_shortvideo_model_GreenScreenMaterial_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.authorName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.stickerId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.localPath;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.mediasource;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "GreenScreenMaterial(type=" + this.type + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", resId=" + this.resId + ", authorName=" + this.authorName + ", stickerId=" + this.stickerId + ", localPath=" + this.localPath + ", mediasource=" + this.mediasource + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.type);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeString(this.resId);
        parcel.writeString(this.authorName);
        parcel.writeString(this.stickerId);
        parcel.writeString(this.localPath);
        parcel.writeString(this.mediasource);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(84447);
        }

        private Companion() {
        }

        public final String[] getMEDIA_TYPE_STRING() {
            return GreenScreenMaterial.MEDIA_TYPE_STRING;
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final void register(com.bytedance.creativex.a.a.c cVar) {
            l.d(cVar, "");
            cVar.a("extra_key_green_screen_material", GreenScreenMaterial.class);
        }

        public final byte[] bundleToBytes(Bundle bundle) {
            l.d(bundle, "");
            Parcel obtain = Parcel.obtain();
            l.b(obtain, "");
            obtain.writeBundle(bundle);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        }

        public final Bundle bytesToBundle(byte[] bArr) {
            l.d(bArr, "");
            Parcel obtain = Parcel.obtain();
            l.b(obtain, "");
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            Bundle readBundle = obtain.readBundle(GreenScreenMaterial.class.getClassLoader());
            obtain.recycle();
            if (readBundle == null) {
                l.b();
            }
            return readBundle;
        }
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getMediasource() {
        return this.mediasource;
    }

    public final String getResId() {
        return this.resId;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(84446);
    }

    public final void setEndTime(long j2) {
        this.endTime = j2;
    }

    public final void setStartTime(long j2) {
        this.startTime = j2;
    }

    public final void setType(int i2) {
        this.type = i2;
    }

    public final void setAuthorName(String str) {
        l.d(str, "");
        this.authorName = str;
    }

    public final void setLocalPath(String str) {
        l.d(str, "");
        this.localPath = str;
    }

    public final void setMediasource(String str) {
        l.d(str, "");
        this.mediasource = str;
    }

    public final void setResId(String str) {
        l.d(str, "");
        this.resId = str;
    }

    public final void setStickerId(String str) {
        l.d(str, "");
        this.stickerId = str;
    }

    public GreenScreenMaterial(int i2, long j2, long j3, String str, String str2, String str3, String str4, String str5) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        this.type = i2;
        this.startTime = j2;
        this.endTime = j3;
        this.resId = str;
        this.authorName = str2;
        this.stickerId = str3;
        this.localPath = str4;
        this.mediasource = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GreenScreenMaterial(int r13, long r14, long r16, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, h.f.b.g r24) {
        /*
            r12 = this;
            r1 = r23
            r9 = r20
            r10 = r21
            r3 = r14
            r7 = r18
            r2 = r13
            r8 = r19
            r0 = r1 & 1
            if (r0 == 0) goto L_0x0011
            r2 = 1
        L_0x0011:
            r0 = r1 & 2
            r5 = 0
            if (r0 == 0) goto L_0x0019
            r3 = 0
        L_0x0019:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x003f
        L_0x001d:
            r0 = r1 & 8
            java.lang.String r11 = ""
            if (r0 == 0) goto L_0x0024
            r7 = r11
        L_0x0024:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x0029
            r8 = r11
        L_0x0029:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x002e
            r9 = r11
        L_0x002e:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0033
            r10 = r11
        L_0x0033:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003c
        L_0x0037:
            r1 = r12
            r1.<init>(r2, r3, r5, r7, r8, r9, r10, r11)
            return
        L_0x003c:
            r11 = r22
            goto L_0x0037
        L_0x003f:
            r5 = r16
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial.<init>(int, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
