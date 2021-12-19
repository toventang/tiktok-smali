package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class NewPersAdSettings implements Serializable {
    @c(a = "desc_mode_1p")
    private final String descMode1P;
    @c(a = "desc_mode_3p")
    private final String descMode3P;
    @c(a = "mode_1p")
    private final Integer mode1P;
    @c(a = "mode_3p")
    private final Integer mode3P;
    @c(a = "show_mode_1p")
    private final Boolean showMode1P;
    @c(a = "show_mode_3p")
    private final Boolean showMode3P;
    @c(a = "title_mode_1p")
    private final String titleMode1P;
    @c(a = "title_mode_3p")
    private final String titleMode3P;

    static {
        Covode.recordClassIndex(47337);
    }

    public NewPersAdSettings() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ NewPersAdSettings copy$default(NewPersAdSettings newPersAdSettings, Integer num, Boolean bool, String str, String str2, Integer num2, Boolean bool2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = newPersAdSettings.mode1P;
        }
        if ((i2 & 2) != 0) {
            bool = newPersAdSettings.showMode1P;
        }
        if ((i2 & 4) != 0) {
            str = newPersAdSettings.titleMode1P;
        }
        if ((i2 & 8) != 0) {
            str2 = newPersAdSettings.descMode1P;
        }
        if ((i2 & 16) != 0) {
            num2 = newPersAdSettings.mode3P;
        }
        if ((i2 & 32) != 0) {
            bool2 = newPersAdSettings.showMode3P;
        }
        if ((i2 & 64) != 0) {
            str3 = newPersAdSettings.titleMode3P;
        }
        if ((i2 & 128) != 0) {
            str4 = newPersAdSettings.descMode3P;
        }
        return newPersAdSettings.copy(num, bool, str, str2, num2, bool2, str3, str4);
    }

    public final Integer component1() {
        return this.mode1P;
    }

    public final Boolean component2() {
        return this.showMode1P;
    }

    public final String component3() {
        return this.titleMode1P;
    }

    public final String component4() {
        return this.descMode1P;
    }

    public final Integer component5() {
        return this.mode3P;
    }

    public final Boolean component6() {
        return this.showMode3P;
    }

    public final String component7() {
        return this.titleMode3P;
    }

    public final String component8() {
        return this.descMode3P;
    }

    public final NewPersAdSettings copy(Integer num, Boolean bool, String str, String str2, Integer num2, Boolean bool2, String str3, String str4) {
        return new NewPersAdSettings(num, bool, str, str2, num2, bool2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewPersAdSettings)) {
            return false;
        }
        NewPersAdSettings newPersAdSettings = (NewPersAdSettings) obj;
        return l.a(this.mode1P, newPersAdSettings.mode1P) && l.a(this.showMode1P, newPersAdSettings.showMode1P) && l.a(this.titleMode1P, newPersAdSettings.titleMode1P) && l.a(this.descMode1P, newPersAdSettings.descMode1P) && l.a(this.mode3P, newPersAdSettings.mode3P) && l.a(this.showMode3P, newPersAdSettings.showMode3P) && l.a(this.titleMode3P, newPersAdSettings.titleMode3P) && l.a(this.descMode3P, newPersAdSettings.descMode3P);
    }

    public final int hashCode() {
        Integer num = this.mode1P;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Boolean bool = this.showMode1P;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.titleMode1P;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.descMode1P;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num2 = this.mode3P;
        int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Boolean bool2 = this.showMode3P;
        int hashCode6 = (hashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str3 = this.titleMode3P;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.descMode3P;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode7 + i2;
    }

    public final String toString() {
        return "NewPersAdSettings(mode1P=" + this.mode1P + ", showMode1P=" + this.showMode1P + ", titleMode1P=" + this.titleMode1P + ", descMode1P=" + this.descMode1P + ", mode3P=" + this.mode3P + ", showMode3P=" + this.showMode3P + ", titleMode3P=" + this.titleMode3P + ", descMode3P=" + this.descMode3P + ")";
    }

    public final String getDescMode1P() {
        return this.descMode1P;
    }

    public final String getDescMode3P() {
        return this.descMode3P;
    }

    public final Integer getMode1P() {
        return this.mode1P;
    }

    public final Integer getMode3P() {
        return this.mode3P;
    }

    public final Boolean getShowMode1P() {
        return this.showMode1P;
    }

    public final Boolean getShowMode3P() {
        return this.showMode3P;
    }

    public final String getTitleMode1P() {
        return this.titleMode1P;
    }

    public final String getTitleMode3P() {
        return this.titleMode3P;
    }

    public NewPersAdSettings(Integer num, Boolean bool, String str, String str2, Integer num2, Boolean bool2, String str3, String str4) {
        this.mode1P = num;
        this.showMode1P = bool;
        this.titleMode1P = str;
        this.descMode1P = str2;
        this.mode3P = num2;
        this.showMode3P = bool2;
        this.titleMode3P = str3;
        this.descMode3P = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NewPersAdSettings(java.lang.Integer r12, java.lang.Boolean r13, java.lang.String r14, java.lang.String r15, java.lang.Integer r16, java.lang.Boolean r17, java.lang.String r18, java.lang.String r19, int r20, h.f.b.g r21) {
        /*
            r11 = this;
            r2 = r20
            r9 = r18
            r3 = r12
            r5 = r14
            r4 = r13
            r6 = r15
            r1 = r2 & 1
            r0 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L_0x0016
            r3 = r7
        L_0x0016:
            r0 = r2 & 2
            if (r0 == 0) goto L_0x001b
            r4 = r8
        L_0x001b:
            r0 = r2 & 4
            java.lang.String r10 = ""
            if (r0 == 0) goto L_0x0022
            r5 = r10
        L_0x0022:
            r0 = r2 & 8
            if (r0 == 0) goto L_0x0027
            r6 = r10
        L_0x0027:
            r0 = r2 & 16
            if (r0 == 0) goto L_0x0043
        L_0x002b:
            r0 = r2 & 32
            if (r0 == 0) goto L_0x0040
        L_0x002f:
            r0 = r2 & 64
            if (r0 == 0) goto L_0x0034
            r9 = r10
        L_0x0034:
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003d
        L_0x0038:
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x003d:
            r10 = r19
            goto L_0x0038
        L_0x0040:
            r8 = r17
            goto L_0x002f
        L_0x0043:
            r7 = r16
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.api.model.NewPersAdSettings.<init>(java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
