package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class KtfInfo implements Serializable {
    @c(a = "caution_label")
    private final String cautionLabel;
    private boolean hasShowOnce;
    @c(a = "message_text_on_share")
    private final String messageTextOnShare;
    @c(a = "show_message_on_share")
    private final boolean showMessageOnShare;
    @c(a = "show_warning")
    private final boolean showWarning;
    @c(a = "warning_text")
    private final String warningText;

    static {
        Covode.recordClassIndex(59414);
    }

    public KtfInfo() {
        this(false, null, null, false, null, false, 63, null);
    }

    public static /* synthetic */ KtfInfo copy$default(KtfInfo ktfInfo, boolean z, String str, String str2, boolean z2, String str3, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = ktfInfo.showWarning;
        }
        if ((i2 & 2) != 0) {
            str = ktfInfo.cautionLabel;
        }
        if ((i2 & 4) != 0) {
            str2 = ktfInfo.warningText;
        }
        if ((i2 & 8) != 0) {
            z2 = ktfInfo.showMessageOnShare;
        }
        if ((i2 & 16) != 0) {
            str3 = ktfInfo.messageTextOnShare;
        }
        if ((i2 & 32) != 0) {
            z3 = ktfInfo.hasShowOnce;
        }
        return ktfInfo.copy(z, str, str2, z2, str3, z3);
    }

    public final boolean component1() {
        return this.showWarning;
    }

    public final String component2() {
        return this.cautionLabel;
    }

    public final String component3() {
        return this.warningText;
    }

    public final boolean component4() {
        return this.showMessageOnShare;
    }

    public final String component5() {
        return this.messageTextOnShare;
    }

    public final boolean component6() {
        return this.hasShowOnce;
    }

    public final KtfInfo copy(boolean z, String str, String str2, boolean z2, String str3, boolean z3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return new KtfInfo(z, str, str2, z2, str3, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KtfInfo)) {
            return false;
        }
        KtfInfo ktfInfo = (KtfInfo) obj;
        return this.showWarning == ktfInfo.showWarning && l.a(this.cautionLabel, ktfInfo.cautionLabel) && l.a(this.warningText, ktfInfo.warningText) && this.showMessageOnShare == ktfInfo.showMessageOnShare && l.a(this.messageTextOnShare, ktfInfo.messageTextOnShare) && this.hasShowOnce == ktfInfo.hasShowOnce;
    }

    public final int hashCode() {
        boolean z = this.showWarning;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        String str = this.cautionLabel;
        int i7 = 0;
        int hashCode = (i6 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.warningText;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z2 = this.showMessageOnShare;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (hashCode2 + i8) * 31;
        String str3 = this.messageTextOnShare;
        if (str3 != null) {
            i7 = str3.hashCode();
        }
        int i12 = (i11 + i7) * 31;
        if (!this.hasShowOnce) {
            i2 = 0;
        }
        return i12 + i2;
    }

    public final void resetState() {
        this.hasShowOnce = false;
    }

    public final String toString() {
        return "KtfInfo(showWarning=" + this.showWarning + ", cautionLabel=" + this.cautionLabel + ", warningText=" + this.warningText + ", showMessageOnShare=" + this.showMessageOnShare + ", messageTextOnShare=" + this.messageTextOnShare + ", hasShowOnce=" + this.hasShowOnce + ")";
    }

    public final String getCautionLabel() {
        return this.cautionLabel;
    }

    public final boolean getHasShowOnce() {
        return this.hasShowOnce;
    }

    public final String getMessageTextOnShare() {
        return this.messageTextOnShare;
    }

    public final boolean getShowMessageOnShare() {
        return this.showMessageOnShare;
    }

    public final boolean getShowWarning() {
        return this.showWarning;
    }

    public final String getWarningText() {
        return this.warningText;
    }

    public final void setHasShowOnce(boolean z) {
        this.hasShowOnce = z;
    }

    public KtfInfo(boolean z, String str, String str2, boolean z2, String str3, boolean z3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.showWarning = z;
        this.cautionLabel = str;
        this.warningText = str2;
        this.showMessageOnShare = z2;
        this.messageTextOnShare = str3;
        this.hasShowOnce = z3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ KtfInfo(boolean r9, java.lang.String r10, java.lang.String r11, boolean r12, java.lang.String r13, boolean r14, int r15, h.f.b.g r16) {
        /*
            r8 = this;
            r7 = r14
            r2 = r9
            r4 = r11
            r3 = r10
            r5 = r12
            r1 = r15 & 1
            r0 = 0
            if (r1 == 0) goto L_0x000b
            r2 = 0
        L_0x000b:
            r0 = r15 & 2
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x0012
            r3 = r6
        L_0x0012:
            r0 = r15 & 4
            if (r0 == 0) goto L_0x0017
            r4 = r6
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.KtfInfo.<init>(boolean, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, int, h.f.b.g):void");
    }
}
