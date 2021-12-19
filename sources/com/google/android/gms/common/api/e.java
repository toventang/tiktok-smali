package com.google.android.gms.common.api;

import com.bytedance.covode.number.Covode;

public class e extends Exception {
    protected final Status mStatus;

    static {
        Covode.recordClassIndex(31202);
    }

    public int getStatusCode() {
        return this.mStatus.f49967g;
    }

    public String getStatusMessage() {
        return this.mStatus.f49968h;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(com.google.android.gms.common.api.Status r5) {
        /*
            r4 = this;
            int r3 = r5.f49967g
            java.lang.String r0 = r5.f49968h
            if (r0 == 0) goto L_0x002f
            java.lang.String r2 = r5.f49968h
        L_0x0008:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r0 = r0.length()
            int r1 = r0 + 13
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.StringBuilder r1 = r0.append(r3)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            r4.mStatus = r5
            return
        L_0x002f:
            java.lang.String r2 = ""
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.e.<init>(com.google.android.gms.common.api.Status):void");
    }
}
