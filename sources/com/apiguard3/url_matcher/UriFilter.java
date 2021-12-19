package com.apiguard3.url_matcher;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import com.apiguard3.internal.checkCertificates;
import com.apiguard3.internal.getState;
import com.apiguard3.internal.log;
import com.apiguard3.internal.setNextFocusUpId;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class UriFilter implements Serializable {
    private static int AGRequest = 1;
    private static int getBody = 0;
    private static int getHeaders = 0;
    private static long getMethod = 600695878488654813L;
    private static char getUrl = 0;
    private static final long serialVersionUID = -2530827875991961122L;
    private final List<UrlMatcherConfig> matchers;

    static {
        Covode.recordClassIndex(2634);
    }

    public UriFilter() {
        this.matchers = new ArrayList();
    }

    public int hashCode() {
        int i2 = getBody + 41;
        AGRequest = i2 % 128;
        if (i2 % 2 != 0) {
            return this.matchers.hashCode() + 527;
        }
        return this.matchers.hashCode() + 360;
    }

    public boolean getBody() {
        if (this.matchers.size() == 0) {
            return false;
        }
        int i2 = getBody;
        int i3 = i2 + 123;
        AGRequest = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 101;
        AGRequest = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        throw new NullPointerException("hashCode");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.apiguard3.url_matcher.UriFilter$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        private static int AGRequest;
        static final /* synthetic */ int[] getBody;
        private static int getMethod = 1;
        static final /* synthetic */ int[] getUrl;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|4|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0023 */
        static {
            /*
            // Method dump skipped, instructions count: 124
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.url_matcher.UriFilter.AnonymousClass1.<clinit>():void");
        }
    }

    public static UriFilter getMethod() {
        try {
            UriFilter uriFilter = new UriFilter(new JSONObject(getUrl("菝ݛᦸࡖ", "㎽Ჾ憢㯕䪧酰ꂯቤ㢀ᙡ吱?텭뎲홲?鼬苪ű꫓斳儡觨㫳嵷疘阓梥㰛뢦ڄ韛袯邖⻩韐磨罴⅙㴭㛣琉ᬗ", "襹诧⥉夵", (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 13609), Color.red(0)).intern()).optJSONArray(getUrl("菝ݛᦸࡖ", "Ꝕᆁ알䘛屼హ敕᤹", "﹗㒈?髟", (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.getDefaultSize(0, 0)).intern()));
            int i2 = getBody + 121;
            AGRequest = i2 % 128;
            int i3 = i2 % 2;
            return uriFilter;
        } catch (JSONException unused) {
            checkCertificates.AGRequest(log.getBody.AGRequest, getUrl("菝ݛᦸࡖ", "ﺌ谂䋹뜁䔓?햴焨㯷䇚씫ਐ멎샔䬥๠긝쒱゜෸褼鴋폢?ᗿ롣뵘ꔻᦽꄠ⾨宺ك䫉ꆤ蕍싋⼍醃敝ὂṠ", "嵸좭魕뫉", (char) (51611 - (Process.myTid() >> 22)), (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 1439214940).intern());
            return null;
        }
    }

    public UriFilter getHeaders() {
        UriFilter uriFilter = new UriFilter();
        Iterator<UrlMatcherConfig> it = this.matchers.iterator();
        while (it.hasNext()) {
            int i2 = getBody + 89;
            AGRequest = i2 % 128;
            if (i2 % 2 != 0) {
                uriFilter.getHeaders(it.next().addHeader());
            } else {
                uriFilter.getHeaders(it.next().addHeader());
                throw new NullPointerException("hashCode");
            }
        }
        int i3 = AGRequest + 69;
        getBody = i3 % 128;
        int i4 = i3 % 2;
        return uriFilter;
    }

    public void getHeaders(UrlMatcherConfig urlMatcherConfig) {
        int i2 = getBody + 125;
        AGRequest = i2 % 128;
        int i3 = i2 % 2;
        this.matchers.add(urlMatcherConfig);
        int i4 = AGRequest + 93;
        getBody = i4 % 128;
        int i5 = i4 % 2;
    }

    public UriFilter(JSONArray jSONArray) {
        this();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    this.matchers.add(new UrlMatcherConfig(new UrlMatcher(optJSONObject)));
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            int i2 = AGRequest + 15;
            getBody = i2 % 128;
            int i3 = i2 % 2;
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        } else {
            boolean equals = this.matchers.equals(((UriFilter) obj).matchers);
            int i4 = AGRequest + 69;
            getBody = i4 % 128;
            int i5 = i4 % 2;
            return equals;
        }
    }

    public boolean AGRequest(URL url) {
        int i2 = getBody + 77;
        AGRequest = i2 % 128;
        if (i2 % 2 == 0) {
            throw new NullPointerException("hashCode");
        } else if (url == null) {
            return false;
        } else {
            for (UrlMatcherConfig urlMatcherConfig : this.matchers) {
                if (getMethod(url, urlMatcherConfig).booleanValue()) {
                    int i3 = AGRequest + 121;
                    getBody = i3 % 128;
                    int i4 = i3 % 2;
                    return true;
                }
            }
            int i5 = AGRequest + 93;
            getBody = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
    }

    static Boolean getMethod(MatchConfig matchConfig, String str) {
        boolean z;
        int i2 = getBody + 13;
        AGRequest = i2 % 128;
        int i3 = i2 % 2;
        if (!matchConfig.getUrl().booleanValue()) {
            int i4 = getBody + 103;
            AGRequest = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = str.toLowerCase();
        }
        String AGRequest2 = matchConfig.AGRequest();
        int i6 = AnonymousClass1.getUrl[matchConfig.getMethod().ordinal()];
        boolean z2 = true;
        if (i6 == 1) {
            z = str.equals(AGRequest2);
            int i7 = AGRequest + 33;
            getBody = i7 % 128;
            int i8 = i7 % 2;
        } else if (i6 == 2) {
            z = str.startsWith(AGRequest2);
        } else if (i6 == 3) {
            z = str.contains(AGRequest2);
        } else if (i6 != 4) {
            checkCertificates.getMethod(log.getBody.getHeaders, getState.getHeaders.headers);
            return Boolean.FALSE;
        } else {
            z = str.endsWith(AGRequest2);
        }
        if (matchConfig.getBody().booleanValue() == z) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    static Boolean getMethod(MatchesConfig matchesConfig, String str) {
        boolean z;
        boolean z2;
        int i2 = AGRequest + 97;
        getBody = i2 % 128;
        int i3 = i2 % 2;
        if (str == null) {
            str = "";
        }
        List<MatchConfig> AGRequest2 = matchesConfig.AGRequest();
        int i4 = AnonymousClass1.getBody[matchesConfig.getMethod().ordinal()];
        if (i4 == 1) {
            return Boolean.TRUE;
        }
        if (i4 == 2) {
            for (MatchConfig matchConfig : AGRequest2) {
                if (!getMethod(matchConfig, str).booleanValue()) {
                    int i5 = AGRequest + 29;
                    getBody = i5 % 128;
                    if (i5 % 2 == 0) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = Boolean.FALSE;
                    throw new NullPointerException("hashCode");
                }
            }
            return Boolean.TRUE;
        } else if (i4 == 3) {
            for (MatchConfig matchConfig2 : AGRequest2) {
                if (!getMethod(matchConfig2, str).booleanValue()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    int i6 = getBody + 105;
                    AGRequest = i6 % 128;
                    if (i6 % 2 != 0) {
                        return Boolean.TRUE;
                    }
                    Boolean bool2 = Boolean.TRUE;
                    throw new NullPointerException("hashCode");
                }
            }
            return Boolean.FALSE;
        } else if (i4 != 4) {
            checkCertificates.getMethod(log.getBody.getHeaders, getState.getHeaders.values);
            return Boolean.FALSE;
        } else {
            Iterator<MatchConfig> it = AGRequest2.iterator();
            int i7 = getBody + 43;
            AGRequest = i7 % 128;
            int i8 = i7 % 2;
            do {
                if (!it.hasNext()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return Boolean.TRUE;
                }
            } while (!getMethod(it.next(), str).booleanValue());
            int i9 = getBody + 61;
            AGRequest = i9 % 128;
            int i10 = i9 % 2;
            return Boolean.FALSE;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        if (getMethod(r6.getHeaders(), r5.getHost()).booleanValue() != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        if (getMethod(r6.getUrl(), r5.getPath()).booleanValue() != false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        r1 = com.apiguard3.url_matcher.UriFilter.getBody + 97;
        com.apiguard3.url_matcher.UriFilter.AGRequest = r1 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0067, code lost:
        if ((r1 % 2) == 0) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0069, code lost:
        r3 = 18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
        r1 = r6.getBody();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006f, code lost:
        if (r3 == 18) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007d, code lost:
        if (getMethod(r1, r5.getQuery()).booleanValue() != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        if (getMethod(r1, r5.getQuery()).booleanValue() == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009a, code lost:
        if (getMethod(r2, r5.getProtocol()).booleanValue() != false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009d, code lost:
        r1 = com.apiguard3.url_matcher.UriFilter.getBody + 21;
        com.apiguard3.url_matcher.UriFilter.AGRequest = r1 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a9, code lost:
        if ((r1 % 2) == 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ab, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        if (getMethod(r6.getHeaders(), r5.getHost()).booleanValue() == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Boolean getMethod(java.net.URL r5, com.apiguard3.url_matcher.UrlMatcherConfig r6) {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.url_matcher.UriFilter.getMethod(java.net.URL, com.apiguard3.url_matcher.UrlMatcherConfig):java.lang.Boolean");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:6:0x0018 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:11:0x0024 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r11v1, types: [char[]] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [char[]] */
    private static String getUrl(String str, String str2, String str3, char c2, int i2) {
        char c3;
        boolean z;
        boolean z2;
        int i3 = getBody + 1;
        AGRequest = i3 % 128;
        int i4 = i3 % 2;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        if (str2 == 0) {
            c3 = 30;
        } else {
            c3 = 'P';
        }
        if (c3 != 30) {
            str2 = str2.toCharArray();
        }
        char[] cArr3 = (char[]) str2;
        if (str == 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int i5 = getBody + 95;
            AGRequest = i5 % 128;
            if (i5 % 2 != 0) {
                str = str.toCharArray();
            } else {
                str.toCharArray();
                throw new NullPointerException("hashCode");
            }
        }
        char[] cArr4 = (char[]) cArr2.clone();
        char[] cArr5 = (char[]) ((char[]) str).clone();
        cArr4[0] = (char) (c2 ^ cArr4[0]);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length = cArr3.length;
        char[] cArr6 = new char[length];
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return new String(cArr6);
            }
            int i7 = AGRequest + 67;
            getBody = i7 % 128;
            if (i7 % 2 != 0) {
                setNextFocusUpId.getHeaders(cArr4, cArr5, i6);
                cArr6[i6] = (char) ((int) (((((long) (cArr3[i6] ^ cArr4[(i6 << 4) - 5])) % getMethod) ^ ((long) getHeaders)) | ((long) getUrl)));
                i6 += 12;
            } else {
                setNextFocusUpId.getHeaders(cArr4, cArr5, i6);
                cArr6[i6] = (char) ((int) (((((long) (cArr3[i6] ^ cArr4[(i6 + 3) % 4])) ^ getMethod) ^ ((long) getHeaders)) ^ ((long) getUrl)));
                i6++;
            }
        }
    }
}
