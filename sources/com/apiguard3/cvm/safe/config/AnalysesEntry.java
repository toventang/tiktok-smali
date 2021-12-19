package com.apiguard3.cvm.safe.config;

import com.apiguard3.internal.setAccessibilityPaneTitle;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public class AnalysesEntry implements setAccessibilityPaneTitle<String>, Serializable {
    private static int AGRequest = 0;
    private static int getMethod = 1;
    private static final long serialVersionUID = -1592337098982454365L;
    private String urlPattern;

    static {
        Covode.recordClassIndex(2494);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.apiguard3.internal.setAccessibilityPaneTitle
    public /* synthetic */ String getBody() {
        int i2 = getMethod + 9;
        AGRequest = i2 % 128;
        int i3 = i2 % 2;
        String url = getUrl();
        int i4 = AGRequest + 41;
        getMethod = i4 % 128;
        int i5 = i4 % 2;
        return url;
    }

    public String getUrl() {
        int i2 = AGRequest + 115;
        getMethod = i2 % 128;
        if (i2 % 2 != 0) {
            return this.urlPattern;
        }
        return this.urlPattern;
    }

    public AnalysesEntry(String str) {
        this.urlPattern = str;
    }
}
