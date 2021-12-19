package com.ss.android.ugc.aweme.ftc.components.audioeffect;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import h.f.b.l;
import java.io.Serializable;

public final class FTCAudioEffectParam implements Parcelable, Serializable {
    public static final a CREATOR = new a((byte) 0);
    @c(a = "challenge")
    private AVChallenge challenge;
    @c(a = "effectPath")
    private String effectPath;
    @c(a = "effectTag")
    private String effectTag;
    @c(a = "preprocessResult")
    private byte[] preprocessResult;
    @c(a = "seqIn")
    private int seqIn;
    @c(a = "seqOut")
    private int seqOut;
    private boolean showErrorToast;
    @c(a = "trackIndex")
    private int trackIndex;
    @c(a = "trackType")
    private int trackType;
    @c(a = "uploadId")
    private String uploadId;

    static {
        Covode.recordClassIndex(62018);
    }

    public FTCAudioEffectParam() {
        this(null, 0, 0, null, null, 0, 0, null, null, 511, null);
    }

    public final int describeContents() {
        return 0;
    }

    public static final class a implements Parcelable.Creator<FTCAudioEffectParam> {
        static {
            Covode.recordClassIndex(62019);
        }

        private a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FTCAudioEffectParam[] newArray(int i2) {
            return new FTCAudioEffectParam[i2];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FTCAudioEffectParam createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new FTCAudioEffectParam(parcel);
        }
    }

    public final AVChallenge getChallenge() {
        return this.challenge;
    }

    public final String getEffectPath() {
        return this.effectPath;
    }

    public final String getEffectTag() {
        return this.effectTag;
    }

    public final byte[] getPreprocessResult() {
        return this.preprocessResult;
    }

    public final int getSeqIn() {
        return this.seqIn;
    }

    public final int getSeqOut() {
        return this.seqOut;
    }

    public final boolean getShowErrorToast() {
        return this.showErrorToast;
    }

    public final int getTrackIndex() {
        return this.trackIndex;
    }

    public final int getTrackType() {
        return this.trackType;
    }

    public final String getUploadId() {
        return this.uploadId;
    }

    public final void setChallenge(AVChallenge aVChallenge) {
        this.challenge = aVChallenge;
    }

    public final void setPreprocessResult(byte[] bArr) {
        this.preprocessResult = bArr;
    }

    public final void setSeqIn(int i2) {
        this.seqIn = i2;
    }

    public final void setSeqOut(int i2) {
        this.seqOut = i2;
    }

    public final void setShowErrorToast(boolean z) {
        this.showErrorToast = z;
    }

    public final void setTrackIndex(int i2) {
        this.trackIndex = i2;
    }

    public final void setTrackType(int i2) {
        this.trackType = i2;
    }

    public final void setEffectPath(String str) {
        l.d(str, "");
        this.effectPath = str;
    }

    public final void setEffectTag(String str) {
        l.d(str, "");
        this.effectTag = str;
    }

    public final void setUploadId(String str) {
        l.d(str, "");
        this.uploadId = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FTCAudioEffectParam(android.os.Parcel r11) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r11, r0)
            java.lang.String r1 = r11.readString()
            if (r1 != 0) goto L_0x000c
            r1 = r0
        L_0x000c:
            h.f.b.l.b(r1, r0)
            int r2 = r11.readInt()
            int r3 = r11.readInt()
            java.lang.String r4 = r11.readString()
            if (r4 != 0) goto L_0x001e
            r4 = r0
        L_0x001e:
            h.f.b.l.b(r4, r0)
            java.lang.String r5 = r11.readString()
            if (r5 != 0) goto L_0x0028
            r5 = r0
        L_0x0028:
            h.f.b.l.b(r5, r0)
            int r6 = r11.readInt()
            int r7 = r11.readInt()
            byte[] r8 = r11.createByteArray()
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.AVChallenge> r0 = com.ss.android.ugc.aweme.shortvideo.AVChallenge.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r9 = r11.readParcelable(r0)
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r9 = (com.ss.android.ugc.aweme.shortvideo.AVChallenge) r9
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.audioeffect.FTCAudioEffectParam.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.uploadId);
        parcel.writeInt(this.trackType);
        parcel.writeInt(this.trackIndex);
        parcel.writeString(this.effectPath);
        parcel.writeString(this.effectTag);
        parcel.writeInt(this.seqIn);
        parcel.writeInt(this.seqOut);
        parcel.writeByteArray(this.preprocessResult);
        parcel.writeParcelable(this.challenge, i2);
    }

    public FTCAudioEffectParam(String str, int i2, int i3, String str2, String str3, int i4, int i5, byte[] bArr, AVChallenge aVChallenge) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.uploadId = str;
        this.trackType = i2;
        this.trackIndex = i3;
        this.effectPath = str2;
        this.effectTag = str3;
        this.seqIn = i4;
        this.seqOut = i5;
        this.preprocessResult = bArr;
        this.challenge = aVChallenge;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FTCAudioEffectParam(java.lang.String r12, int r13, int r14, java.lang.String r15, java.lang.String r16, int r17, int r18, byte[] r19, com.ss.android.ugc.aweme.shortvideo.AVChallenge r20, int r21, h.f.b.g r22) {
        /*
            r11 = this;
            r1 = r21
            r7 = r17
            r2 = r12
            r4 = r14
            r9 = r19
            r3 = r13
            r5 = r15
            r0 = r1 & 1
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x0011
            r2 = r6
        L_0x0011:
            r0 = r1 & 2
            r8 = 0
            if (r0 == 0) goto L_0x0017
            r3 = 0
        L_0x0017:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x001c
            r4 = 0
        L_0x001c:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x0021
            r5 = r6
        L_0x0021:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x0043
        L_0x0025:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x002a
            r7 = 0
        L_0x002a:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0040
        L_0x002e:
            r0 = r1 & 128(0x80, float:1.794E-43)
            r10 = 0
            if (r0 == 0) goto L_0x0034
            r9 = r10
        L_0x0034:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x003d
        L_0x0038:
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x003d:
            r10 = r20
            goto L_0x0038
        L_0x0040:
            r8 = r18
            goto L_0x002e
        L_0x0043:
            r6 = r16
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.audioeffect.FTCAudioEffectParam.<init>(java.lang.String, int, int, java.lang.String, java.lang.String, int, int, byte[], com.ss.android.ugc.aweme.shortvideo.AVChallenge, int, h.f.b.g):void");
    }
}
