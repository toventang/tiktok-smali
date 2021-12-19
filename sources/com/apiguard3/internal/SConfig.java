package com.apiguard3.internal;

import android.graphics.drawable.Drawable;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.webkit.URLUtil;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class SConfig {
    static {
        Covode.recordClassIndex(2529);
    }

    public static class AGRequest {
        private static boolean getBody = false;
        private static int getHeaders = 1;
        private static int getUrl;

        static {
            Covode.recordClassIndex(2530);
            getUrl = 0;
            getUrl = 4;
        }

        static /* synthetic */ boolean getBody() {
            int i2 = getHeaders;
            int i3 = i2 + 3;
            getUrl = i3 % 128;
            int i4 = i3 % 2;
            boolean z = getBody;
            int i5 = i2 + 79;
            getUrl = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            throw new NullPointerException("hashCode");
        }

        public static void getBody(boolean z) {
            int i2 = getHeaders + 97;
            int i3 = i2 % 128;
            getUrl = i3;
            int i4 = i2 % 2;
            getBody = z;
            int i5 = i3 + 11;
            getHeaders = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public static class getUrl {
        private static long AGRequest = 0;
        private static int AGRequest$Builder;
        private static int addHeader = 1;
        private static long getBody = 0;
        private static long getHeaders = 0;
        private static long getMethod = 0;
        private static long getUrl = 0;
        private static boolean method = true;
        private static int url;

        static void AGRequest() {
            AGRequest$Builder = 137;
        }

        static {
            Covode.recordClassIndex(2531);
            url = 0;
            AGRequest();
            int i2 = addHeader + 101;
            url = i2 % 128;
            int i3 = i2 % 2;
        }

        public static synchronized void getMethod() {
            long currentTimeMillis;
            synchronized (getUrl.class) {
                MethodCollector.i(2150);
                int i2 = addHeader + 41;
                url = i2 % 128;
                if (i2 % 2 == 0) {
                    currentTimeMillis = System.currentTimeMillis();
                } else {
                    currentTimeMillis = System.currentTimeMillis();
                }
                getUrl = currentTimeMillis;
                int i3 = url + 115;
                addHeader = i3 % 128;
                if (i3 % 2 != 0) {
                    MethodCollector.o(2150);
                } else {
                    try {
                        throw new NullPointerException("hashCode");
                    } catch (Throwable th) {
                        MethodCollector.o(2150);
                        throw th;
                    }
                }
            }
        }

        public static synchronized void getUrl() {
            char c2;
            long currentTimeMillis;
            synchronized (getUrl.class) {
                MethodCollector.i(2151);
                int i2 = addHeader + 113;
                int i3 = i2 % 128;
                url = i3;
                int i4 = i2 % 2;
                if (!method) {
                    c2 = '%';
                } else {
                    c2 = '.';
                }
                if (c2 != '%') {
                    int i5 = i3 + 103;
                    addHeader = i5 % 128;
                    if (i5 % 2 != 0) {
                        currentTimeMillis = System.currentTimeMillis();
                    } else {
                        currentTimeMillis = System.currentTimeMillis();
                    }
                    getHeaders = currentTimeMillis;
                    int i6 = addHeader + 25;
                    url = i6 % 128;
                    int i7 = i6 % 2;
                }
                method = false;
                MethodCollector.o(2151);
            }
        }

        public static synchronized String getBody() {
            char c2;
            boolean z;
            synchronized (getUrl.class) {
                MethodCollector.i(2149);
                if (AGRequest.getBody()) {
                    c2 = '0';
                } else {
                    c2 = '?';
                }
                if (c2 != '0') {
                    int i2 = url + 63;
                    addHeader = i2 % 128;
                    int i3 = i2 % 2;
                    MethodCollector.o(2149);
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                try {
                    if (getMethod == 0) {
                        sb.append(a.a(getBody(URLUtil.isContentUrl("content:"), "\u0019\u001b\u0004\u000bￌ\u0002￡\u0014", (ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) + 225, 8 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2).intern(), new Object[]{Long.valueOf(AGRequest)}));
                        int i4 = url + 123;
                        addHeader = i4 % 128;
                        int i5 = i4 % 2;
                    } else {
                        sb.append(a.a(getBody(!PhoneNumberUtils.compare("", ""), "￥\u001d￞￙￥\u001d￞\u0014￳&+-\u0016\u001d￞￙", 208 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 16 - Drawable.resolveOpacity(0, 0), 11 - TextUtils.lastIndexOf("", '0', 0)).intern(), new Object[]{Long.valueOf(AGRequest), Long.valueOf(getBody / getMethod), Long.valueOf(getMethod)}));
                        getBody = 0;
                        getMethod = 0;
                    }
                    AGRequest = 0;
                    if (getUrl != 0) {
                        if (getHeaders == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            sb.append(a.a(getBody(TextUtils.isEmpty(""), "\u001e￟ￚ￦\u001e￟\u0015￴'#￦\u0017", 207 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 12 - (ViewConfiguration.getEdgeSlop() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11).intern(), new Object[]{Long.valueOf(getHeaders - getUrl), Long.valueOf(getHeaders)}));
                            getUrl = 0;
                            getHeaders = 0;
                        }
                    }
                } catch (Throwable unused) {
                }
                String obj = sb.toString();
                MethodCollector.o(2149);
                return obj;
            }
        }

        public static synchronized void getMethod(long j2) {
            synchronized (getUrl.class) {
                MethodCollector.i(2142);
                int i2 = url + 17;
                addHeader = i2 % 128;
                int i3 = i2 % 2;
                if (!AGRequest.getBody()) {
                    MethodCollector.o(2142);
                    return;
                }
                AGRequest = j2;
                int i4 = addHeader + 89;
                url = i4 % 128;
                if (i4 % 2 == 0) {
                    MethodCollector.o(2142);
                } else {
                    MethodCollector.o(2142);
                }
            }
        }

        public static synchronized void getUrl(long j2) {
            synchronized (getUrl.class) {
                MethodCollector.i(2144);
                if (AGRequest.getBody()) {
                    int i2 = addHeader + 115;
                    url = i2 % 128;
                    if (i2 % 2 == 0) {
                        getBody += j2;
                        getMethod++;
                    } else {
                        getBody = j2 ^ getBody;
                        getMethod /= 0;
                    }
                }
                int i3 = url + 61;
                addHeader = i3 % 128;
                if (i3 % 2 != 0) {
                    MethodCollector.o(2144);
                } else {
                    MethodCollector.o(2144);
                }
            }
        }

        private static String getBody(boolean z, String str, int i2, int i3, int i4) {
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            char[] cArr3 = new char[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                cArr3[i5] = (char) (cArr2[i5] + i2);
                cArr3[i5] = (char) (cArr3[i5] - AGRequest$Builder);
            }
            if (i4 > 0) {
                char[] cArr4 = new char[i3];
                System.arraycopy(cArr3, 0, cArr4, 0, i3);
                int i6 = i3 - i4;
                System.arraycopy(cArr4, 0, cArr3, i6, i4);
                System.arraycopy(cArr4, i4, cArr3, 0, i6);
                int i7 = addHeader + 125;
                url = i7 % 128;
                int i8 = i7 % 2;
            }
            if (z) {
                char[] cArr5 = new char[i3];
                for (int i9 = 0; i9 < i3; i9++) {
                    int i10 = addHeader + 75;
                    url = i10 % 128;
                    int i11 = i10 % 2;
                    cArr5[i9] = cArr3[(i3 - i9) - 1];
                }
                cArr3 = cArr5;
            }
            return new String(cArr3);
        }
    }
}
