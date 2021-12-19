package com.apiguard3.cvm.safe.config;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SConfig implements Serializable {
    private static int AGRequest = 0;
    private static int getBody = 1;
    private static long getMethod = 4787781871953891530L;
    private static final long serialVersionUID = 7438889113625161744L;
    private List<AnalysesEntry> endpointAnalyzed = new ArrayList();
    private List<ScoredEntry> endpointScored = new ArrayList();
    private String fraudQueryHeaderKeyName;

    static {
        Covode.recordClassIndex(2495);
    }

    private SConfig() {
    }

    public List<ScoredEntry> getMethod() {
        int i2 = getBody + 19;
        AGRequest = i2 % 128;
        if (i2 % 2 == 0) {
            return this.endpointScored;
        }
        return this.endpointScored;
    }

    public String AGRequest() {
        char c2;
        int i2 = AGRequest + 59;
        getBody = i2 % 128;
        if (i2 % 2 != 0) {
            c2 = 25;
        } else {
            c2 = '@';
        }
        if (c2 == 25) {
            return this.fraudQueryHeaderKeyName;
        }
        String str = this.fraudQueryHeaderKeyName;
        throw new NullPointerException("hashCode");
    }

    public List<AnalysesEntry> getHeaders() {
        boolean z;
        int i2 = AGRequest + 43;
        int i3 = i2 % 128;
        getBody = i3;
        int i4 = i2 % 2;
        List<AnalysesEntry> list = this.endpointAnalyzed;
        int i5 = i3 + 45;
        AGRequest = i5 % 128;
        if (i5 % 2 == 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return list;
        }
        throw new NullPointerException("hashCode");
    }

    private static String getUrl(String str) {
        char c2;
        int i2 = AGRequest + 113;
        int i3 = i2 % 128;
        getBody = i3;
        if (i2 % 2 != 0) {
            c2 = 'C';
        } else {
            c2 = '3';
        }
        char[] cArr = str;
        cArr = str;
        if (c2 == '3' ? str != null : str != null) {
            int i4 = i3 + 33;
            AGRequest = i4 % 128;
            int i5 = i4 % 2;
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        char c3 = cArr2[0];
        char[] cArr3 = new char[(cArr2.length - 1)];
        for (int i6 = 1; i6 < cArr2.length; i6++) {
            int i7 = getBody + 7;
            AGRequest = i7 % 128;
            int i8 = i7 % 2;
            cArr3[i6 - 1] = (char) ((int) (((long) (cArr2[i6] ^ (i6 * c3))) ^ getMethod));
        }
        return new String(cArr3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.apiguard3.cvm.safe.config.SConfig getUrl(org.json.JSONObject r8) {
        /*
        // Method dump skipped, instructions count: 261
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.cvm.safe.config.SConfig.getUrl(org.json.JSONObject):com.apiguard3.cvm.safe.config.SConfig");
    }
}
