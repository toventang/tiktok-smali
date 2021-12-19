package com.apiguard3.cvm.safe.fs;

import com.apiguard3.internal.setAccessibilityPaneTitle;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public class FraudScore implements setAccessibilityPaneTitle<String>, Serializable {
    private static int getHeaders = 1;
    private static int getMethod = 0;
    private static final long serialVersionUID = -3520884770453645806L;
    private String score;
    private long timestamp = System.currentTimeMillis();

    static {
        Covode.recordClassIndex(2497);
    }

    public long AGRequest() {
        int i2 = getHeaders + 91;
        getMethod = i2 % 128;
        if (i2 % 2 == 0) {
            return this.timestamp;
        }
        long j2 = this.timestamp;
        throw new NullPointerException("hashCode");
    }

    public String getMethod() {
        int i2 = getMethod + 103;
        int i3 = i2 % 128;
        getHeaders = i3;
        int i4 = i2 % 2;
        String str = this.score;
        int i5 = i3 + 27;
        getMethod = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.apiguard3.internal.setAccessibilityPaneTitle
    public /* synthetic */ String getBody() {
        char c2;
        int i2 = getHeaders + 85;
        getMethod = i2 % 128;
        if (i2 % 2 == 0) {
            c2 = 'B';
        } else {
            c2 = 'E';
        }
        if (c2 != 'B') {
            getMethod();
            throw new NullPointerException("hashCode");
        }
        String method = getMethod();
        int i3 = getHeaders + 65;
        getMethod = i3 % 128;
        int i4 = i3 % 2;
        return method;
    }

    public FraudScore(String str) {
        this.score = str;
    }
}
