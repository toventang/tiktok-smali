package com.apiguard3.network;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.apiguard3.internal.setNextFocusForwardId;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class UriFilter implements Serializable {
    private static int getBody = 1;
    private static int getHeaders = 0;
    private static long getMethod = -4134420662193816087L;
    private static final long serialVersionUID = -1274302831362763316L;
    private final ArrayList<UrlTest> bypassMatchers;
    private final ArrayList<UrlTest> filterMatchers;

    static {
        Covode.recordClassIndex(2627);
    }

    /* access modifiers changed from: package-private */
    public class UrlTest implements Serializable {
        private static int AGRequest = 0;
        private static int getBody = 1;
        private static final long serialVersionUID = 6812434843444644337L;
        final Pattern domain;
        final String domainRegex;
        final Pattern path;
        final String pathRegex;
        final Pattern port;
        final String portRegex;
        final Pattern queryString;
        final String queryStringRegex;
        final Pattern scheme;
        final String schemeRegex;

        static {
            Covode.recordClassIndex(2629);
        }

        public UrlTest getMethod() {
            UrlTest urlTest = new UrlTest(this.schemeRegex, this.domainRegex, this.pathRegex, this.queryStringRegex, this.portRegex);
            int i2 = getBody + 13;
            AGRequest = i2 % 128;
            int i3 = i2 % 2;
            return urlTest;
        }

        UrlTest(UriFilter uriFilter) {
            this(null, null, null, null, null);
        }

        /* access modifiers changed from: package-private */
        public Pattern getMethod(String str) {
            int i2 = AGRequest;
            int i3 = i2 + 121;
            getBody = i3 % 128;
            int i4 = i3 % 2;
            if (str != null) {
                return Pattern.compile(str);
            }
            int i5 = i2 + 35;
            getBody = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }

        UrlTest(UrlMatcherSpec urlMatcherSpec) {
            this.schemeRegex = urlMatcherSpec.AGRequest;
            this.domainRegex = urlMatcherSpec.getUrl;
            this.pathRegex = urlMatcherSpec.getBody;
            this.queryStringRegex = urlMatcherSpec.getHeaders;
            this.portRegex = urlMatcherSpec.getMethod;
            this.scheme = getMethod(urlMatcherSpec.AGRequest);
            this.domain = getMethod(urlMatcherSpec.getUrl);
            this.path = getMethod(urlMatcherSpec.getBody);
            this.queryString = getMethod(urlMatcherSpec.getHeaders);
            this.port = getMethod(urlMatcherSpec.getMethod);
        }

        UrlTest(String str, String str2, String str3, String str4, String str5) {
            this.schemeRegex = str;
            this.domainRegex = str2;
            this.pathRegex = str3;
            this.queryStringRegex = str4;
            this.portRegex = str5;
            this.scheme = getMethod(str);
            this.domain = getMethod(str2);
            this.path = getMethod(str3);
            this.queryString = getMethod(str4);
            this.port = getMethod(str5);
        }
    }

    private UriFilter() {
        this.filterMatchers = new ArrayList<>();
        this.bypassMatchers = new ArrayList<>();
    }

    public static UriFilter getBody() {
        try {
            UriFilter uriFilter = new UriFilter(new JSONObject(getHeaders("ꤱ咣꾫٘奘끮દ巸됈༼晷뢗Ꮧ檶뵽ᐖ溢솈ᣠ獪쩀᳌瞂캢⅑砂퍦▰糜휦⸮腶?㋋蔘?㜷觜㮾鈜㾞").intern()));
            int i2 = getBody + 115;
            getHeaders = i2 % 128;
            int i3 = i2 % 2;
            return uriFilter;
        } catch (JSONException unused) {
            return null;
        }
    }

    public UriFilter getUrl() {
        UriFilter uriFilter = new UriFilter();
        Iterator<UrlTest> it = this.filterMatchers.iterator();
        int i2 = getBody + 77;
        getHeaders = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            uriFilter.filterMatchers.add(it.next().getMethod());
        }
        Iterator<UrlTest> it2 = this.bypassMatchers.iterator();
        while (it2.hasNext()) {
            int i4 = getHeaders + 125;
            getBody = i4 % 128;
            int i5 = i4 % 2;
            uriFilter.bypassMatchers.add(it2.next().getMethod());
        }
        return uriFilter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r8 == null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r8 == null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        r1 = r3 + 107;
        com.apiguard3.network.UriFilter.getBody = r1 % 128;
        r0 = r1 % 2;
        r8 = r8.toCharArray();
        r1 = com.apiguard3.network.UriFilter.getBody + 83;
        com.apiguard3.network.UriFilter.getHeaders = r1 % 128;
        r0 = r1 % 2;
        r8 = r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getHeaders(java.lang.String r8) {
        /*
            int r3 = com.apiguard3.network.UriFilter.getHeaders
            int r1 = r3 + 13
            int r0 = r1 % 128
            com.apiguard3.network.UriFilter.getBody = r0
            int r0 = r1 % 2
            r2 = 0
            r4 = 1
            if (r0 != 0) goto L_0x002e
            r0 = 6
            if (r8 != 0) goto L_0x0031
        L_0x0011:
            char[] r8 = (char[]) r8
            char r7 = r8[r2]
            int r0 = r8.length
            int r0 = r0 - r4
            char[] r6 = new char[r0]
        L_0x0019:
            int r0 = r8.length
            if (r4 >= r0) goto L_0x0048
            int r5 = r4 + -1
            char r1 = r8[r4]
            int r0 = r4 * r7
            r1 = r1 ^ r0
            long r2 = (long) r1
            long r0 = com.apiguard3.network.UriFilter.getMethod
            long r2 = r2 ^ r0
            int r0 = (int) r2
            char r0 = (char) r0
            r6[r5] = r0
            int r4 = r4 + 1
            goto L_0x0019
        L_0x002e:
            if (r8 != 0) goto L_0x0031
            goto L_0x0011
        L_0x0031:
            int r1 = r3 + 107
            int r0 = r1 % 128
            com.apiguard3.network.UriFilter.getBody = r0
            int r0 = r1 % 2
            char[] r8 = r8.toCharArray()
            int r0 = com.apiguard3.network.UriFilter.getBody
            int r1 = r0 + 83
            int r0 = r1 % 128
            com.apiguard3.network.UriFilter.getHeaders = r0
            int r0 = r1 % 2
            goto L_0x0011
        L_0x0048:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.network.UriFilter.getHeaders(java.lang.String):java.lang.String");
    }

    public UriFilter(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(getHeaders("딍䢑鞁⦛瓁쏋ໆ嗤ꃮ").intern());
        if (optJSONArray == null) {
            ArrayList<UrlTest> arrayList = new ArrayList<>();
            this.filterMatchers = arrayList;
            arrayList.add(new UrlTest(this));
        } else {
            this.filterMatchers = new ArrayList<>(optJSONArray.length());
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                this.filterMatchers.add(new UrlTest(new UrlMatcherSpec(optJSONArray.optJSONObject(i2))));
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray(getHeaders("耿綣﷥紽ﵗ粫ﳣ簱ﱢ羭").intern());
        if (optJSONArray2 == null) {
            this.bypassMatchers = new ArrayList<>();
            return;
        }
        this.bypassMatchers = new ArrayList<>(optJSONArray2.length());
        for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
            this.bypassMatchers.add(new UrlTest(new UrlMatcherSpec(optJSONArray2.optJSONObject(i3))));
        }
    }

    class UrlMatcherSpec {
        private static int[] AGRequest$Builder = {274768258, -460734329, 385227926, 1802921141, -1473451936, 313610845, -999783055, -661229295, -1268497219, -497846068, 1267869726, 525490847, 354467068, -731929766, -636875800, 1348588641, -2064845836, 856806659};
        private static int newBuilder = 1;
        private static int url;
        String AGRequest;
        String getBody;
        String getHeaders;
        String getMethod;
        String getUrl;

        static {
            Covode.recordClassIndex(2628);
        }

        private static String getBody(int[] iArr, int i2) {
            boolean z;
            char[] cArr = new char[4];
            char[] cArr2 = new char[(iArr.length << 1)];
            int[] iArr2 = (int[]) AGRequest$Builder.clone();
            int i3 = 0;
            while (true) {
                if (i3 >= iArr.length) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    String str = new String(cArr2, 0, i2);
                    int i4 = url + 51;
                    newBuilder = i4 % 128;
                    int i5 = i4 % 2;
                    return str;
                }
                int i6 = newBuilder + 39;
                url = i6 % 128;
                int i7 = i6 % 2;
                cArr[0] = (char) (iArr[i3] >> 16);
                cArr[1] = (char) iArr[i3];
                int i8 = i3 + 1;
                cArr[2] = (char) (iArr[i8] >> 16);
                cArr[3] = (char) iArr[i8];
                setNextFocusForwardId.getHeaders(cArr, iArr2, false);
                int i9 = i3 << 1;
                cArr2[i9] = cArr[0];
                cArr2[i9 + 1] = cArr[1];
                cArr2[i9 + 2] = cArr[2];
                cArr2[i9 + 3] = cArr[3];
                i3 += 2;
            }
        }

        UrlMatcherSpec(JSONObject jSONObject) {
            if (jSONObject != null) {
                if (jSONObject.has(getBody(new int[]{1841888393, -1589541664, 1230824156, 508803151}, 7 - (ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1))).intern())) {
                    this.AGRequest = jSONObject.optString(getBody(new int[]{1841888393, -1589541664, 1230824156, 508803151}, TextUtils.getTrimmedLength("") + 6).intern());
                }
                if (jSONObject.has(getBody(new int[]{765167780, 625595021, 842409025, -1874063062}, 6 - ExpandableListView.getPackedPositionGroup(0)).intern())) {
                    this.getUrl = jSONObject.optString(getBody(new int[]{765167780, 625595021, 842409025, -1874063062}, 6 - View.resolveSize(0, 0)).intern());
                }
                if (jSONObject.has(getBody(new int[]{-1097433922, -218692052}, Drawable.resolveOpacity(0, 0) + 4).intern())) {
                    this.getBody = jSONObject.optString(getBody(new int[]{-1097433922, -218692052}, ExpandableListView.getPackedPositionChild(0) + 5).intern());
                }
                if (jSONObject.has(getBody(new int[]{1279443160, -118206450, -1551945332, 1082761954, 82939761, -1190267680}, 11 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                    this.getHeaders = jSONObject.optString(getBody(new int[]{1279443160, -118206450, -1551945332, 1082761954, 82939761, -1190267680}, 11 - View.MeasureSpec.getSize(0)).intern());
                }
                if (jSONObject.has(getBody(new int[]{-509172795, -1130149391}, '4' - AndroidCharacter.getMirror('0')).intern())) {
                    this.getMethod = jSONObject.optString(getBody(new int[]{-509172795, -1130149391}, 5 - (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1))).intern());
                }
            }
        }
    }
}
