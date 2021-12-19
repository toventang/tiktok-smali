package com.ss.android.ugc.aweme.services.upload;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ExternalUploadVideoConfig {
    private final String appKey;
    private final String authorization;
    private final String fileHostName;
    private final int maxFailTime;
    private final int sliceSize;
    private final int sliceTimeout;
    private final String spaceName;
    private final String topAccessKey;
    private final String topSecretKey;
    private final String topSessionToken;
    private final String videoHostName;

    static {
        Covode.recordClassIndex(79839);
    }

    public ExternalUploadVideoConfig() {
        this(0, 0, null, null, 0, null, null, null, null, null, null, 2047, null);
    }

    public static int com_ss_android_ugc_aweme_services_upload_ExternalUploadVideoConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ ExternalUploadVideoConfig copy$default(ExternalUploadVideoConfig externalUploadVideoConfig, int i2, int i3, String str, String str2, int i4, String str3, String str4, String str5, String str6, String str7, String str8, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = externalUploadVideoConfig.maxFailTime;
        }
        if ((i5 & 2) != 0) {
            i3 = externalUploadVideoConfig.sliceSize;
        }
        if ((i5 & 4) != 0) {
            str = externalUploadVideoConfig.fileHostName;
        }
        if ((i5 & 8) != 0) {
            str2 = externalUploadVideoConfig.videoHostName;
        }
        if ((i5 & 16) != 0) {
            i4 = externalUploadVideoConfig.sliceTimeout;
        }
        if ((i5 & 32) != 0) {
            str3 = externalUploadVideoConfig.appKey;
        }
        if ((i5 & 64) != 0) {
            str4 = externalUploadVideoConfig.authorization;
        }
        if ((i5 & 128) != 0) {
            str5 = externalUploadVideoConfig.topAccessKey;
        }
        if ((i5 & 256) != 0) {
            str6 = externalUploadVideoConfig.topSecretKey;
        }
        if ((i5 & 512) != 0) {
            str7 = externalUploadVideoConfig.topSessionToken;
        }
        if ((i5 & 1024) != 0) {
            str8 = externalUploadVideoConfig.spaceName;
        }
        return externalUploadVideoConfig.copy(i2, i3, str, str2, i4, str3, str4, str5, str6, str7, str8);
    }

    public final int component1() {
        return this.maxFailTime;
    }

    public final String component10() {
        return this.topSessionToken;
    }

    public final String component11() {
        return this.spaceName;
    }

    public final int component2() {
        return this.sliceSize;
    }

    public final String component3() {
        return this.fileHostName;
    }

    public final String component4() {
        return this.videoHostName;
    }

    public final int component5() {
        return this.sliceTimeout;
    }

    public final String component6() {
        return this.appKey;
    }

    public final String component7() {
        return this.authorization;
    }

    public final String component8() {
        return this.topAccessKey;
    }

    public final String component9() {
        return this.topSecretKey;
    }

    public final ExternalUploadVideoConfig copy(int i2, int i3, String str, String str2, int i4, String str3, String str4, String str5, String str6, String str7, String str8) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        l.d(str7, "");
        l.d(str8, "");
        return new ExternalUploadVideoConfig(i2, i3, str, str2, i4, str3, str4, str5, str6, str7, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalUploadVideoConfig)) {
            return false;
        }
        ExternalUploadVideoConfig externalUploadVideoConfig = (ExternalUploadVideoConfig) obj;
        return this.maxFailTime == externalUploadVideoConfig.maxFailTime && this.sliceSize == externalUploadVideoConfig.sliceSize && l.a(this.fileHostName, externalUploadVideoConfig.fileHostName) && l.a(this.videoHostName, externalUploadVideoConfig.videoHostName) && this.sliceTimeout == externalUploadVideoConfig.sliceTimeout && l.a(this.appKey, externalUploadVideoConfig.appKey) && l.a(this.authorization, externalUploadVideoConfig.authorization) && l.a(this.topAccessKey, externalUploadVideoConfig.topAccessKey) && l.a(this.topSecretKey, externalUploadVideoConfig.topSecretKey) && l.a(this.topSessionToken, externalUploadVideoConfig.topSessionToken) && l.a(this.spaceName, externalUploadVideoConfig.spaceName);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_services_upload_ExternalUploadVideoConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((com_ss_android_ugc_aweme_services_upload_ExternalUploadVideoConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.maxFailTime) * 31) + com_ss_android_ugc_aweme_services_upload_ExternalUploadVideoConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.sliceSize)) * 31;
        String str = this.fileHostName;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_services_upload_ExternalUploadVideoConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.videoHostName;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_services_upload_ExternalUploadVideoConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.sliceTimeout)) * 31;
        String str3 = this.appKey;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.authorization;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.topAccessKey;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.topSecretKey;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.topSessionToken;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.spaceName;
        if (str8 != null) {
            i2 = str8.hashCode();
        }
        return hashCode7 + i2;
    }

    public final String toString() {
        return "ExternalUploadVideoConfig(maxFailTime=" + this.maxFailTime + ", sliceSize=" + this.sliceSize + ", fileHostName=" + this.fileHostName + ", videoHostName=" + this.videoHostName + ", sliceTimeout=" + this.sliceTimeout + ", appKey=" + this.appKey + ", authorization=" + this.authorization + ", topAccessKey=" + this.topAccessKey + ", topSecretKey=" + this.topSecretKey + ", topSessionToken=" + this.topSessionToken + ", spaceName=" + this.spaceName + ")";
    }

    public final String getAppKey() {
        return this.appKey;
    }

    public final String getAuthorization() {
        return this.authorization;
    }

    public final String getFileHostName() {
        return this.fileHostName;
    }

    public final int getMaxFailTime() {
        return this.maxFailTime;
    }

    public final int getSliceSize() {
        return this.sliceSize;
    }

    public final int getSliceTimeout() {
        return this.sliceTimeout;
    }

    public final String getSpaceName() {
        return this.spaceName;
    }

    public final String getTopAccessKey() {
        return this.topAccessKey;
    }

    public final String getTopSecretKey() {
        return this.topSecretKey;
    }

    public final String getTopSessionToken() {
        return this.topSessionToken;
    }

    public final String getVideoHostName() {
        return this.videoHostName;
    }

    public ExternalUploadVideoConfig(int i2, int i3, String str, String str2, int i4, String str3, String str4, String str5, String str6, String str7, String str8) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        l.d(str7, "");
        l.d(str8, "");
        this.maxFailTime = i2;
        this.sliceSize = i3;
        this.fileHostName = str;
        this.videoHostName = str2;
        this.sliceTimeout = i4;
        this.appKey = str3;
        this.authorization = str4;
        this.topAccessKey = str5;
        this.topSecretKey = str6;
        this.topSessionToken = str7;
        this.spaceName = str8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ExternalUploadVideoConfig(int r14, int r15, java.lang.String r16, java.lang.String r17, int r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25, h.f.b.g r26) {
        /*
            r13 = this;
            r1 = r25
            r9 = r21
            r8 = r20
            r7 = r19
            r2 = r14
            r10 = r22
            r4 = r16
            r3 = r15
            r11 = r23
            r5 = r17
            r0 = r1 & 1
            r6 = 0
            if (r0 == 0) goto L_0x0018
            r2 = 0
        L_0x0018:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x001d
            r3 = 0
        L_0x001d:
            r0 = r1 & 4
            java.lang.String r12 = ""
            if (r0 == 0) goto L_0x0024
            r4 = r12
        L_0x0024:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x0029
            r5 = r12
        L_0x0029:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x0052
        L_0x002d:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0032
            r7 = r12
        L_0x0032:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0037
            r8 = r12
        L_0x0037:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003c
            r9 = r12
        L_0x003c:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0041
            r10 = r12
        L_0x0041:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0046
            r11 = r12
        L_0x0046:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x004f
        L_0x004a:
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x004f:
            r12 = r24
            goto L_0x004a
        L_0x0052:
            r6 = r18
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig.<init>(int, int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
