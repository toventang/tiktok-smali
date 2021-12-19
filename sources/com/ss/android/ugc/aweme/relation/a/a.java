package com.ss.android.ugc.aweme.relation.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;

public final class a implements Serializable {
    private final String desc;
    private final String header;
    private final int iconRes;
    private final String leftButtonText;
    private final String rightButtonText;
    private final int socialRecType;
    private final int step;
    private final String title;
    private final String toast;

    static {
        Covode.recordClassIndex(78247);
    }

    public static int com_ss_android_ugc_aweme_relation_consent_SocialConsentConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ a copy$default(a aVar, int i2, String str, int i3, String str2, String str3, String str4, String str5, String str6, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = aVar.socialRecType;
        }
        if ((i5 & 2) != 0) {
            str = aVar.header;
        }
        if ((i5 & 4) != 0) {
            i3 = aVar.iconRes;
        }
        if ((i5 & 8) != 0) {
            str2 = aVar.title;
        }
        if ((i5 & 16) != 0) {
            str3 = aVar.desc;
        }
        if ((i5 & 32) != 0) {
            str4 = aVar.leftButtonText;
        }
        if ((i5 & 64) != 0) {
            str5 = aVar.rightButtonText;
        }
        if ((i5 & 128) != 0) {
            str6 = aVar.toast;
        }
        if ((i5 & 256) != 0) {
            i4 = aVar.step;
        }
        return aVar.copy(i2, str, i3, str2, str3, str4, str5, str6, i4);
    }

    public final int component1() {
        return this.socialRecType;
    }

    public final String component2() {
        return this.header;
    }

    public final int component3() {
        return this.iconRes;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.desc;
    }

    public final String component6() {
        return this.leftButtonText;
    }

    public final String component7() {
        return this.rightButtonText;
    }

    public final String component8() {
        return this.toast;
    }

    public final int component9() {
        return this.step;
    }

    public final a copy(int i2, String str, int i3, String str2, String str3, String str4, String str5, String str6, int i4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        return new a(i2, str, i3, str2, str3, str4, str5, str6, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.socialRecType == aVar.socialRecType && l.a(this.header, aVar.header) && this.iconRes == aVar.iconRes && l.a(this.title, aVar.title) && l.a(this.desc, aVar.desc) && l.a(this.leftButtonText, aVar.leftButtonText) && l.a(this.rightButtonText, aVar.rightButtonText) && l.a(this.toast, aVar.toast) && this.step == aVar.step;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_relation_consent_SocialConsentConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_relation_consent_SocialConsentConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.socialRecType) * 31;
        String str = this.header;
        int i2 = 0;
        int hashCode = (((com_ss_android_ugc_aweme_relation_consent_SocialConsentConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_relation_consent_SocialConsentConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.iconRes)) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.desc;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.leftButtonText;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.rightButtonText;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.toast;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return ((hashCode5 + i2) * 31) + com_ss_android_ugc_aweme_relation_consent_SocialConsentConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.step);
    }

    public final String toString() {
        return "SocialConsentConfig(socialRecType=" + this.socialRecType + ", header=" + this.header + ", iconRes=" + this.iconRes + ", title=" + this.title + ", desc=" + this.desc + ", leftButtonText=" + this.leftButtonText + ", rightButtonText=" + this.rightButtonText + ", toast=" + this.toast + ", step=" + this.step + ")";
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getHeader() {
        return this.header;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final String getLeftButtonText() {
        return this.leftButtonText;
    }

    public final String getRightButtonText() {
        return this.rightButtonText;
    }

    public final int getSocialRecType() {
        return this.socialRecType;
    }

    public final int getStep() {
        return this.step;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getToast() {
        return this.toast;
    }

    public a(int i2, String str, int i3, String str2, String str3, String str4, String str5, String str6, int i4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        this.socialRecType = i2;
        this.header = str;
        this.iconRes = i3;
        this.title = str2;
        this.desc = str3;
        this.leftButtonText = str4;
        this.rightButtonText = str5;
        this.toast = str6;
        this.step = i4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(int r13, java.lang.String r14, int r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, int r22, h.f.b.g r23) {
        /*
            r12 = this;
            r2 = r22
            r9 = r19
            r8 = r18
            r7 = r17
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r1 = r2 & 1
            r0 = 0
            if (r1 == 0) goto L_0x0013
            r3 = 0
        L_0x0013:
            r0 = r2 & 2
            java.lang.String r10 = ""
            if (r0 == 0) goto L_0x001a
            r4 = r10
        L_0x001a:
            r0 = r2 & 4
            if (r0 == 0) goto L_0x001f
            r5 = 0
        L_0x001f:
            r0 = r2 & 8
            if (r0 == 0) goto L_0x0024
            r6 = r10
        L_0x0024:
            r0 = r2 & 16
            if (r0 == 0) goto L_0x0029
            r7 = r10
        L_0x0029:
            r0 = r2 & 32
            if (r0 == 0) goto L_0x002e
            r8 = r10
        L_0x002e:
            r0 = r2 & 64
            if (r0 == 0) goto L_0x0033
            r9 = r10
        L_0x0033:
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003e
        L_0x0037:
            r2 = r12
            r11 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x003e:
            r10 = r20
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.a.a.<init>(int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, h.f.b.g):void");
    }
}
