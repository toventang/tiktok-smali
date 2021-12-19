package com.apiguard3.url_matcher;

import android.text.TextUtils;
import com.apiguard3.internal.setOnApplyWindowInsetsListener;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public class UrlMatcherConfig implements Serializable {
    private static char AGRequest$Builder = 11366;
    private static int addHeader = 0;
    private static int get = 1;
    private static char method = 32377;
    private static char newBuilder = 61064;
    private static final long serialVersionUID = -4792909588470935642L;
    private static char url = 38437;
    private transient MatchesConfig AGRequest;
    private String domainStr;
    private transient MatchesConfig getBody;
    private transient MatchesConfig getHeaders;
    private transient MatchesConfig getMethod;
    private transient MatchesConfig getUrl;
    private String pathStr;
    private String portStr;
    private String queryStr;
    private String schemeStr;

    static {
        Covode.recordClassIndex(2637);
    }

    UrlMatcherConfig() {
    }

    public MatchesConfig AGRequest() {
        int i2 = addHeader + 53;
        int i3 = i2 % 128;
        get = i3;
        if (i2 % 2 != 0 ? this.getMethod == null : this.getMethod == null) {
            int i4 = i3 + 77;
            addHeader = i4 % 128;
            int i5 = i4 % 2;
            return getBody(this.schemeStr);
        }
        MatchesConfig matchesConfig = this.getMethod;
        int i6 = i3 + 121;
        addHeader = i6 % 128;
        int i7 = i6 % 2;
        return matchesConfig;
    }

    public UrlMatcherConfig addHeader() {
        UrlMatcherConfig urlMatcherConfig = new UrlMatcherConfig();
        urlMatcherConfig.schemeStr = this.schemeStr;
        urlMatcherConfig.domainStr = this.domainStr;
        urlMatcherConfig.portStr = this.portStr;
        urlMatcherConfig.pathStr = this.pathStr;
        urlMatcherConfig.queryStr = this.queryStr;
        int i2 = get + 21;
        addHeader = i2 % 128;
        if (i2 % 2 == 0) {
            return urlMatcherConfig;
        }
        throw new NullPointerException("hashCode");
    }

    public MatchesConfig getBody() {
        int i2 = get + 103;
        int i3 = i2 % 128;
        addHeader = i3;
        if (i2 % 2 == 0 ? this.AGRequest == null : this.AGRequest == null) {
            int i4 = i3 + 45;
            get = i4 % 128;
            int i5 = i4 % 2;
            return getBody(this.queryStr);
        }
        MatchesConfig matchesConfig = this.AGRequest;
        int i6 = i3 + 13;
        get = i6 % 128;
        int i7 = i6 % 2;
        return matchesConfig;
    }

    public MatchesConfig getHeaders() {
        int i2 = addHeader + 1;
        get = i2 % 128;
        if (i2 % 2 == 0) {
            MatchesConfig matchesConfig = this.getBody;
            throw new NullPointerException("hashCode");
        } else if (this.getBody == null) {
            return getBody(this.domainStr);
        } else {
            MatchesConfig matchesConfig2 = this.getBody;
            int i3 = addHeader + 95;
            get = i3 % 128;
            int i4 = i3 % 2;
            return matchesConfig2;
        }
    }

    public MatchesConfig getMethod() {
        int i2 = addHeader + 25;
        get = i2 % 128;
        if (i2 % 2 == 0) {
            MatchesConfig matchesConfig = this.getUrl;
            throw new NullPointerException("hashCode");
        } else if (this.getUrl != null) {
            return this.getUrl;
        } else {
            int i3 = addHeader + 19;
            get = i3 % 128;
            int i4 = i3 % 2;
            return getBody(this.portStr);
        }
    }

    public MatchesConfig getUrl() {
        int i2;
        MatchesConfig matchesConfig = this.getHeaders;
        if (matchesConfig != null) {
            i2 = addHeader + 27;
            get = i2 % 128;
        } else {
            int i3 = addHeader + 65;
            get = i3 % 128;
            int i4 = i3 % 2;
            matchesConfig = getBody(this.pathStr);
            i2 = get + 57;
            addHeader = i2 % 128;
        }
        int i5 = i2 % 2;
        return matchesConfig;
    }

    public int hashCode() {
        int hashCode;
        int i2;
        int i3;
        int i4;
        int i5 = get + 105;
        addHeader = i5 % 128;
        int i6 = i5 % 2;
        String str = this.schemeStr;
        int i7 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (hashCode + 527) * 31;
        String str2 = this.domainStr;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            int i9 = get + 111;
            addHeader = i9 % 128;
            int i10 = i9 % 2;
            i2 = 0;
        }
        int i11 = (i8 + i2) * 31;
        String str3 = this.portStr;
        if (str3 != null) {
            i3 = str3.hashCode();
            int i12 = get + 41;
            addHeader = i12 % 128;
            int i13 = i12 % 2;
        } else {
            int i14 = addHeader + 57;
            get = i14 % 128;
            int i15 = i14 % 2;
            i3 = 0;
        }
        int i16 = (i11 + i3) * 31;
        String str4 = this.pathStr;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i17 = (i16 + i4) * 31;
        String str5 = this.queryStr;
        if (str5 != null) {
            i7 = str5.hashCode();
        }
        return i17 + i7;
    }

    public UrlMatcherConfig(UrlMatcher urlMatcher) {
        this.schemeStr = urlMatcher.getBody();
        this.domainStr = urlMatcher.getHeaders();
        this.portStr = urlMatcher.AGRequest();
        this.pathStr = urlMatcher.getMethod();
        this.queryStr = urlMatcher.getUrl();
        this.getMethod = AGRequest();
        this.getBody = getHeaders();
        this.getUrl = getMethod();
        this.getHeaders = getUrl();
        this.AGRequest = getBody();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x0022 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [char[]] */
    private static String AGRequest(String str) {
        boolean z;
        boolean z2;
        int i2 = get + 99;
        addHeader = i2 % 128;
        if (i2 % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new NullPointerException("hashCode");
        }
        if (str == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            int i3 = addHeader + 59;
            get = i3 % 128;
            int i4 = i3 % 2;
            str = str.toCharArray();
        }
        char[] cArr = (char[]) str;
        char[] cArr2 = new char[cArr.length];
        char[] cArr3 = new char[2];
        for (int i5 = 0; i5 < cArr.length; i5 += 2) {
            cArr3[0] = cArr[i5];
            int i6 = i5 + 1;
            cArr3[1] = cArr[i6];
            setOnApplyWindowInsetsListener.AGRequest(cArr3, AGRequest$Builder, method, url, newBuilder);
            cArr2[i5] = cArr3[0];
            cArr2[i6] = cArr3[1];
        }
        return new String(cArr2, 1, (int) cArr2[0]);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        com.apiguard3.internal.checkCertificates.AGRequest(com.apiguard3.internal.log.getBody.AGRequest, AGRequest("閹駛咮椑胺⏇☓稑ိ㮙ᚏが飏轿蚱勖ꄈ調鵽㧉唟뇠瞽証믓鈨῀밷駞令蘢턁").intern());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        return new com.apiguard3.url_matcher.MatchesConfig(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        return new com.apiguard3.url_matcher.MatchesConfig(null);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.apiguard3.url_matcher.MatchesConfig getBody(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0012
        L_0x0002:
            com.apiguard3.url_matcher.MatchesConfig r2 = new com.apiguard3.url_matcher.MatchesConfig
            r2.<init>()
            int r0 = com.apiguard3.url_matcher.UrlMatcherConfig.addHeader
            int r1 = r0 + 31
            int r0 = r1 % 128
            com.apiguard3.url_matcher.UrlMatcherConfig.get = r0
            int r0 = r1 % 2
            return r2
        L_0x0012:
            int r0 = com.apiguard3.url_matcher.UrlMatcherConfig.get
            int r1 = r0 + 51
            int r0 = r1 % 128
            com.apiguard3.url_matcher.UrlMatcherConfig.addHeader = r0
            int r1 = r1 % 2
            r0 = 27
            if (r1 != 0) goto L_0x0027
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x002d
            goto L_0x0002
        L_0x0027:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0002
        L_0x002d:
            r2 = 0
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Exception -> 0x0039 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0039 }
            com.apiguard3.url_matcher.MatchesConfig r0 = new com.apiguard3.url_matcher.MatchesConfig
            r0.<init>(r1)
            return r0
        L_0x0039:
            com.apiguard3.internal.log$getBody r1 = com.apiguard3.internal.log.getBody.AGRequest     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "閹駛咮椑胺⏇☓稑ိ㮙ᚏが飏轿蚱勖ꄈ調鵽㧉唟뇠瞽証믓鈨῀밷駞令蘢턁"
            java.lang.String r0 = AGRequest(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = r0.intern()     // Catch:{ all -> 0x004e }
            com.apiguard3.internal.checkCertificates.AGRequest(r1, r0)     // Catch:{ all -> 0x004e }
            com.apiguard3.url_matcher.MatchesConfig r0 = new com.apiguard3.url_matcher.MatchesConfig
            r0.<init>(r2)
            return r0
        L_0x004e:
            com.apiguard3.url_matcher.MatchesConfig r0 = new com.apiguard3.url_matcher.MatchesConfig
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.url_matcher.UrlMatcherConfig.getBody(java.lang.String):com.apiguard3.url_matcher.MatchesConfig");
    }

    public boolean equals(Object obj) {
        int i2 = get + 71;
        addHeader = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            UrlMatcherConfig urlMatcherConfig = (UrlMatcherConfig) obj;
            if (TextUtils.equals(this.schemeStr, urlMatcherConfig.schemeStr) && TextUtils.equals(this.domainStr, urlMatcherConfig.domainStr)) {
                int i4 = addHeader + 41;
                get = i4 % 128;
                if (i4 % 2 == 0 ? TextUtils.equals(this.portStr, urlMatcherConfig.portStr) : TextUtils.equals(this.portStr, urlMatcherConfig.portStr)) {
                    if (TextUtils.equals(this.pathStr, urlMatcherConfig.pathStr)) {
                        int i5 = get + 109;
                        addHeader = i5 % 128;
                        int i6 = i5 % 2;
                        if (TextUtils.equals(this.queryStr, urlMatcherConfig.queryStr)) {
                            int i7 = get + 9;
                            addHeader = i7 % 128;
                            int i8 = i7 % 2;
                            return true;
                        }
                    }
                }
            }
            int i9 = get + 117;
            addHeader = i9 % 128;
            int i10 = i9 % 2;
        }
        return false;
    }
}
