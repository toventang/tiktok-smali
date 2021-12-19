package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class SmartCompileModelV1 extends dy {
    @c(a = "hw_compile_setting")
    private final String hwCompileSetting;
    @c(a = "sw_compile_setting")
    private final String swCompileSetting;

    static {
        Covode.recordClassIndex(76837);
    }

    public final String getHwCompileSetting() {
        return this.hwCompileSetting;
    }

    public final String getSwCompileSetting() {
        return this.swCompileSetting;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmartCompileModelV1(String str, int i2, String str2, String str3, String str4) {
        super(str, i2, str2);
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.swCompileSetting = str3;
        this.hwCompileSetting = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SmartCompileModelV1(java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, h.f.b.g r13) {
        /*
            r6 = this;
            r2 = r8
            r1 = r7
            r0 = r12 & 1
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0009
            r1 = r3
        L_0x0009:
            r0 = r12 & 2
            if (r0 == 0) goto L_0x000f
            r0 = -1
            r2 = -1
        L_0x000f:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x001a
        L_0x0013:
            r0 = r6
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L_0x001a:
            r3 = r9
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.property.SmartCompileModelV1.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
