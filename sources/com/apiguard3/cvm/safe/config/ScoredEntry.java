package com.apiguard3.cvm.safe.config;

import com.apiguard3.internal.setAccessibilityPaneTitle;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public class ScoredEntry implements setAccessibilityPaneTitle<String>, Serializable {
    private static int AGRequest = 1;
    private static int getHeaders = 0;
    private static final long serialVersionUID = 1452964406245549076L;
    private String urlPattern;

    static {
        Covode.recordClassIndex(2496);
    }

    public String getMethod() {
        int i2 = getHeaders + 91;
        int i3 = i2 % 128;
        AGRequest = i3;
        int i4 = i2 % 2;
        String str = this.urlPattern;
        int i5 = i3 + 109;
        getHeaders = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.apiguard3.internal.setAccessibilityPaneTitle
    public /* synthetic */ String getBody() {
        char c2;
        int i2 = AGRequest + 19;
        getHeaders = i2 % 128;
        int i3 = i2 % 2;
        String method = getMethod();
        int i4 = AGRequest + 67;
        getHeaders = i4 % 128;
        if (i4 % 2 == 0) {
            c2 = '=';
        } else {
            c2 = '8';
        }
        if (c2 == '=') {
            return method;
        }
        throw new NullPointerException("hashCode");
    }

    public ScoredEntry(String str) {
        this.urlPattern = str;
    }
}
