package com.google.firebase.messaging;

import com.bytedance.covode.number.Covode;

public final class q extends Exception {
    private final int errorCode;

    static {
        Covode.recordClassIndex(33897);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r1.equals("invalid_parameters") == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r1.equals("toomanymessages") == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r1.equals("missing_to") == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    q(java.lang.String r4) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.q.<init>(java.lang.String):void");
    }
}
