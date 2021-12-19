package org.apache.commons.logging;

import com.bytedance.covode.number.Covode;

public class LogConfigurationException extends RuntimeException {
    protected Throwable cause;

    static {
        Covode.recordClassIndex(106351);
    }

    public LogConfigurationException() {
    }

    public Throwable getCause() {
        return this.cause;
    }

    public LogConfigurationException(String str) {
        super(str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LogConfigurationException(java.lang.Throwable r2) {
        /*
            r1 = this;
            if (r2 != 0) goto L_0x0007
            r0 = 0
        L_0x0003:
            r1.<init>(r0, r2)
            return
        L_0x0007:
            java.lang.String r0 = r2.toString()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogConfigurationException.<init>(java.lang.Throwable):void");
    }

    public LogConfigurationException(String str, Throwable th) {
        super(new StringBuffer().append(str).append(" (Caused by ").append(th).append(")").toString());
        this.cause = null;
        this.cause = th;
    }
}
