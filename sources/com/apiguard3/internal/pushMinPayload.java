package com.apiguard3.internal;

import android.os.Process;
import android.os.SystemClock;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewConfiguration;
import com.apiguard3.internal.getState;
import com.apiguard3.internal.log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class pushMinPayload implements log {
    private static char[] addHeader = {'i', 'd', 't', 's', ':', 'j', 'k', 'l', 'm'};
    private static int method = 1;
    private static int newBuilder;
    private static char url = 3;
    private String AGRequest;
    private volatile boolean AGRequest$Builder;
    private log.getBody getBody;
    private int getHeaders;
    private RB<Pair<String, Number>> getMethod;
    private long getUrl;

    static {
        Covode.recordClassIndex(2563);
    }

    public pushMinPayload() {
        this((byte) 0);
    }

    public final String AGRequest() {
        int i2 = method + 97;
        int i3 = i2 % 128;
        newBuilder = i3;
        int i4 = i2 % 2;
        String str = this.AGRequest;
        int i5 = i3 + 21;
        method = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void getBody() {
        boolean z;
        int i2 = method + 105;
        newBuilder = i2 % 128;
        if (i2 % 2 == 0) {
            z = false;
        } else {
            z = true;
        }
        this.AGRequest$Builder = z;
        int i3 = newBuilder + 113;
        method = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void getHeaders() {
        int i2 = method + 81;
        newBuilder = i2 % 128;
        int i3 = i2 % 2;
        this.AGRequest$Builder = true;
        int i4 = method + 77;
        newBuilder = i4 % 128;
        int i5 = i4 % 2;
    }

    public final int getMethod() {
        int i2 = method + 121;
        newBuilder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getHeaders;
        }
        return this.getHeaders;
    }

    public final long url() {
        int i2 = newBuilder + 91;
        int i3 = i2 % 128;
        method = i3;
        int i4 = i2 % 2;
        long j2 = this.getUrl;
        int i5 = i3 + 71;
        newBuilder = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    public final String getUrl() {
        JSONArray jSONArray = new JSONArray();
        Iterator<Pair<String, Number>> it = AGRequest(false).iterator();
        int i2 = newBuilder + 113;
        method = i2 % 128;
        while (true) {
            int i3 = i2 % 2;
            if (!it.hasNext()) {
                return jSONArray.toString();
            }
            Pair<String, Number> next = it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(getMethod("\u0001\u0002", (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 51), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2).intern(), next.first);
            jSONObject.put(getMethod("\u0000\u0005", (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 35), TextUtils.indexOf("", "", 0) + 2).intern(), next.second);
            jSONArray.put(jSONObject);
            i2 = newBuilder + 123;
            method = i2 % 128;
        }
    }

    @Override // com.apiguard3.internal.log
    public final void getUrl(log.getBody getbody) {
        int i2 = newBuilder + 113;
        int i3 = i2 % 128;
        method = i3;
        int i4 = i2 % 2;
        this.getBody = getbody;
        int i5 = i3 + 67;
        newBuilder = i5 % 128;
        int i6 = i5 % 2;
    }

    private pushMinPayload(byte b2) {
        this.AGRequest = getState.getHeaders.getHeaders.AGRequest();
        this.getHeaders = 0;
        this.getUrl = 0;
        this.getBody = log.getBody.getHeaders;
        this.AGRequest$Builder = false;
        this.getMethod = new RB<>(20);
        this.getBody = log.getBody.getHeaders;
    }

    @Override // com.apiguard3.internal.log
    public final void getHeaders(APIGuard$Callback aPIGuard$Callback) {
        if (!this.AGRequest$Builder) {
            int i2 = method + 111;
            newBuilder = i2 % 128;
            int i3 = i2 % 2;
            if (aPIGuard$Callback.getMethod.compareTo((Enum) this.getBody) <= 0) {
                getBody(aPIGuard$Callback.AGRequest, aPIGuard$Callback.getBody, aPIGuard$Callback.getUrl);
                int i4 = newBuilder + 95;
                method = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    public final synchronized List<Pair<String, Number>> AGRequest(boolean z) {
        boolean z2;
        RB<Pair<String, Number>> rb;
        MethodCollector.i(2722);
        List<Pair<String, Number>> url2 = this.getMethod.getUrl();
        Collections.reverse(url2);
        boolean z3 = false;
        if (z) {
            int i2 = method + 121;
            newBuilder = i2 % 128;
            if (i2 % 2 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                rb = this.getMethod;
            } else {
                rb = this.getMethod;
            }
            rb.getBody();
        }
        int i3 = method + 99;
        newBuilder = i3 % 128;
        if (i3 % 2 != 0) {
            z3 = true;
        }
        if (!z3) {
            MethodCollector.o(2722);
            return url2;
        }
        MethodCollector.o(2722);
        return url2;
    }

    private synchronized void getBody(String str, String str2, long j2) {
        String str3;
        int i2;
        MethodCollector.i(2723);
        StringBuilder sb = new StringBuilder();
        if (str2 == null) {
            str3 = "";
        } else {
            int i3 = method + 43;
            newBuilder = i3 % 128;
            int i4 = i3 % 2;
            str3 = str2;
        }
        String str4 = "";
        if (!TextUtils.isEmpty(str)) {
            if (this.getBody.compareTo((Enum) log.getBody.getUrl) < 0) {
                i2 = 100;
            } else {
                int i5 = method + 109;
                newBuilder = i5 % 128;
                int i6 = i5 % 2;
                i2 = 300;
            }
            if (str.length() > i2) {
                str = str.substring(str.length() - i2);
                int i7 = newBuilder + 81;
                method = i7 % 128;
                int i8 = i7 % 2;
            }
            str4 = str;
        }
        String str5 = "";
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            str5 = getMethod("", (byte) (205 - PhoneNumberUtils.toaFromString("")), (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1))).intern();
        }
        sb.append(str3);
        sb.append(str5);
        sb.append(str4);
        String obj = sb.toString();
        if (TextUtils.isEmpty(obj)) {
            MethodCollector.o(2723);
            return;
        }
        this.getMethod.getHeaders(new Pair<>(obj, Long.valueOf(j2)));
        if (!str2.equals(this.AGRequest)) {
            this.getHeaders = 1;
            this.AGRequest = str2;
        } else {
            this.getHeaders++;
            int i9 = newBuilder + 11;
            method = i9 % 128;
            int i10 = i9 % 2;
        }
        this.getUrl = j2;
        MethodCollector.o(2723);
    }

    private static String getMethod(String str, byte b2, int i2) {
        char c2;
        char c3;
        int i3 = newBuilder + 125;
        method = i3 % 128;
        char[] cArr = str;
        if (i3 % 2 != 0) {
            if (str != null) {
                char[] charArray = str.toCharArray();
                int i4 = newBuilder + 33;
                method = i4 % 128;
                int i5 = i4 % 2;
                cArr = charArray;
            }
            char[] cArr2 = cArr;
            char[] cArr3 = addHeader;
            char c4 = url;
            char[] cArr4 = new char[i2];
            if (i2 % 2 != 0) {
                int i6 = newBuilder + 5;
                method = i6 % 128;
                int i7 = i6 % 2;
                i2--;
                cArr4[i2] = (char) (cArr2[i2] - b2);
            }
            if (i2 > 1) {
                for (int i8 = 0; i8 < i2; i8 += 2) {
                    char c5 = cArr2[i8];
                    int i9 = i8 + 1;
                    char c6 = cArr2[i9];
                    if (c5 != c6) {
                        int AGRequest2 = setNextClusterForwardId.AGRequest(c5, c4);
                        int body = setNextClusterForwardId.getBody(c5, c4);
                        int AGRequest3 = setNextClusterForwardId.AGRequest(c6, c4);
                        int body2 = setNextClusterForwardId.getBody(c6, c4);
                        if (body != body2) {
                            c3 = ';';
                        } else {
                            c3 = 25;
                        }
                        if (c3 == 25) {
                            int headers = setNextClusterForwardId.getHeaders(AGRequest2, c4);
                            int headers2 = setNextClusterForwardId.getHeaders(AGRequest3, c4);
                            int body3 = setNextClusterForwardId.getBody(headers, body, c4);
                            int body4 = setNextClusterForwardId.getBody(headers2, body2, c4);
                            cArr4[i8] = cArr3[body3];
                            cArr4[i9] = cArr3[body4];
                        } else if (AGRequest2 == AGRequest3) {
                            int headers3 = setNextClusterForwardId.getHeaders(body, c4);
                            int headers4 = setNextClusterForwardId.getHeaders(body2, c4);
                            int body5 = setNextClusterForwardId.getBody(AGRequest2, headers3, c4);
                            int body6 = setNextClusterForwardId.getBody(AGRequest3, headers4, c4);
                            cArr4[i8] = cArr3[body5];
                            cArr4[i9] = cArr3[body6];
                        } else {
                            int body7 = setNextClusterForwardId.getBody(AGRequest2, body2, c4);
                            int body8 = setNextClusterForwardId.getBody(AGRequest3, body, c4);
                            cArr4[i8] = cArr3[body7];
                            cArr4[i9] = cArr3[body8];
                        }
                    } else {
                        int i10 = method + 31;
                        newBuilder = i10 % 128;
                        if (i10 % 2 == 0) {
                            c2 = '2';
                        } else {
                            c2 = 17;
                        }
                        if (c2 != '2') {
                            cArr4[i8] = (char) (c5 << b2);
                            cArr4[i8 >>> 1] = (char) (c6 / b2);
                        } else {
                            cArr4[i8] = (char) (c5 - b2);
                            cArr4[i9] = (char) (c6 - b2);
                        }
                    }
                }
            }
            return new String(cArr4);
        }
        throw new NullPointerException("hashCode");
    }
}
