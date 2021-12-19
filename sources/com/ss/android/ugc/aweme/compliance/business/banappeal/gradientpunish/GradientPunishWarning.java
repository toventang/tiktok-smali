package com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class GradientPunishWarning {
    @c(a = "toast_text")
    private final String bubbleText;
    @c(a = "detail_url")
    private final String detailUrl;
    @c(a = "popup_confirm")
    private final String dialogButton;
    @c(a = "popup_text")
    private final String dialogMessage;
    @c(a = "warn_type")
    private final int warnType;

    static {
        Covode.recordClassIndex(47472);
    }

    public GradientPunishWarning() {
        this(null, null, null, 0, null, 31, null);
    }

    public static int com_ss_android_ugc_aweme_compliance_business_banappeal_gradientpunish_GradientPunishWarning_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ GradientPunishWarning copy$default(GradientPunishWarning gradientPunishWarning, String str, String str2, String str3, int i2, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = gradientPunishWarning.dialogMessage;
        }
        if ((i3 & 2) != 0) {
            str2 = gradientPunishWarning.dialogButton;
        }
        if ((i3 & 4) != 0) {
            str3 = gradientPunishWarning.bubbleText;
        }
        if ((i3 & 8) != 0) {
            i2 = gradientPunishWarning.warnType;
        }
        if ((i3 & 16) != 0) {
            str4 = gradientPunishWarning.detailUrl;
        }
        return gradientPunishWarning.copy(str, str2, str3, i2, str4);
    }

    public final String component1() {
        return this.dialogMessage;
    }

    public final String component2() {
        return this.dialogButton;
    }

    public final String component3() {
        return this.bubbleText;
    }

    public final int component4() {
        return this.warnType;
    }

    public final String component5() {
        return this.detailUrl;
    }

    public final GradientPunishWarning copy(String str, String str2, String str3, int i2, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        return new GradientPunishWarning(str, str2, str3, i2, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GradientPunishWarning)) {
            return false;
        }
        GradientPunishWarning gradientPunishWarning = (GradientPunishWarning) obj;
        return l.a(this.dialogMessage, gradientPunishWarning.dialogMessage) && l.a(this.dialogButton, gradientPunishWarning.dialogButton) && l.a(this.bubbleText, gradientPunishWarning.bubbleText) && this.warnType == gradientPunishWarning.warnType && l.a(this.detailUrl, gradientPunishWarning.detailUrl);
    }

    public final int hashCode() {
        String str = this.dialogMessage;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.dialogButton;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.bubbleText;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_compliance_business_banappeal_gradientpunish_GradientPunishWarning_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.warnType)) * 31;
        String str4 = this.detailUrl;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "GradientPunishWarning(dialogMessage=" + this.dialogMessage + ", dialogButton=" + this.dialogButton + ", bubbleText=" + this.bubbleText + ", warnType=" + this.warnType + ", detailUrl=" + this.detailUrl + ")";
    }

    public final String getBubbleText() {
        return this.bubbleText;
    }

    public final String getDetailUrl() {
        return this.detailUrl;
    }

    public final String getDialogButton() {
        return this.dialogButton;
    }

    public final String getDialogMessage() {
        return this.dialogMessage;
    }

    public final int getWarnType() {
        return this.warnType;
    }

    public GradientPunishWarning(String str, String str2, String str3, int i2, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.dialogMessage = str;
        this.dialogButton = str2;
        this.bubbleText = str3;
        this.warnType = i2;
        this.detailUrl = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GradientPunishWarning(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, java.lang.String r11, int r12, h.f.b.g r13) {
        /*
            r6 = this;
            r3 = r9
            r4 = r10
            r2 = r8
            r1 = r7
            r0 = r12 & 1
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x000b
            r1 = r5
        L_0x000b:
            r0 = r12 & 2
            if (r0 == 0) goto L_0x0010
            r2 = r5
        L_0x0010:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0015
            r3 = r5
        L_0x0015:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x001b
            r0 = 0
            r4 = 0
        L_0x001b:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0024
        L_0x001f:
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L_0x0024:
            r5 = r11
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.GradientPunishWarning.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, h.f.b.g):void");
    }
}
