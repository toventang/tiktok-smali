package com.apiguard3.url_matcher;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.apiguard3.internal.checkCertificates;
import com.apiguard3.internal.getState;
import com.apiguard3.internal.log;
import com.bytedance.covode.number.Covode;
import org.json.JSONArray;

public class MatchConfig {
    private static long AGRequest$Builder = 3836574155578311068L;
    private static char[] getUrl = {43996, 'N', 33235, 876, 'I'};
    private static int method;
    private static int newBuilder = 1;
    private String AGRequest = "";
    private boolean getBody;
    private Match getHeaders = Match.AGRequest;
    private boolean getMethod;

    static {
        Covode.recordClassIndex(2630);
    }

    public String AGRequest() {
        int i2 = newBuilder + 55;
        int i3 = i2 % 128;
        method = i3;
        int i4 = i2 % 2;
        String str = this.AGRequest;
        int i5 = i3 + 69;
        newBuilder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public Boolean getBody() {
        int i2 = newBuilder + 29;
        method = i2 % 128;
        int i3 = i2 % 2;
        Boolean valueOf = Boolean.valueOf(this.getMethod);
        int i4 = newBuilder + 89;
        method = i4 % 128;
        int i5 = i4 % 2;
        return valueOf;
    }

    public Match getMethod() {
        int i2 = method + 71;
        int i3 = i2 % 128;
        newBuilder = i3;
        int i4 = i2 % 2;
        Match match = this.getHeaders;
        int i5 = i3 + 99;
        method = i5 % 128;
        int i6 = i5 % 2;
        return match;
    }

    public Boolean getUrl() {
        boolean z;
        int i2 = newBuilder + 73;
        method = i2 % 128;
        if (i2 % 2 == 0) {
        }
        Boolean valueOf = Boolean.valueOf(this.getBody);
        int i3 = method + 57;
        newBuilder = i3 % 128;
        if (i3 % 2 != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return valueOf;
        }
        throw new NullPointerException("hashCode");
    }

    public int hashCode() {
        char c2;
        int i2;
        int i3 = newBuilder + 87;
        method = i3 % 128;
        int i4 = i3 % 2;
        int hashCode = (((this.AGRequest.hashCode() + 527) * 31) + this.getHeaders.hashCode()) * 31;
        if (!this.getMethod) {
            c2 = 30;
        } else {
            c2 = 27;
        }
        int i5 = 0;
        if (c2 != 27) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        int i6 = (hashCode + i2) * 31;
        if (this.getBody) {
            int i7 = method + 75;
            newBuilder = i7 % 128;
            int i8 = i7 % 2;
            i5 = 1;
        }
        int i9 = i6 + i5;
        int i10 = method + 53;
        newBuilder = i10 % 128;
        int i11 = i10 % 2;
        return i9;
    }

    public enum Match {
        getUrl,
        getHeaders,
        getMethod,
        getBody,
        AGRequest;
        
        private static int AGRequest$Builder;
        private static boolean addHeader;
        private static int get = 0;
        private static boolean newBuilder;
        private static int post;
        private static char[] url;

        static void getMethod() {
            AGRequest$Builder = 243;
            newBuilder = true;
            addHeader = true;
            url = new char[]{316, 326, 327, 308, 325, 330, 315, 310, 322, 321, 312, 311, 329, 319};
        }

        static {
            Covode.recordClassIndex(2631);
            post = 1;
            getMethod();
            int i2 = get + 35;
            post = i2 % 128;
            int i3 = i2 % 2;
        }

        public static Match getMethod(String str) {
            int hashCode = str.hashCode();
            if (hashCode != -1768228930) {
                if (hashCode != -1069493097) {
                    if (hashCode != 2346) {
                        if (hashCode == 215180831 && str.equals(getHeaders(126 - TextUtils.indexOf((CharSequence) "", '0', 0), null, null, "").intern())) {
                            int i2 = post + 49;
                            get = i2 % 128;
                            int i3 = i2 % 2;
                            return getMethod;
                        }
                    } else if (str.equals(getHeaders(ExpandableListView.getPackedPositionType(0) + 127, null, null, "").intern())) {
                        return getUrl;
                    }
                } else if (str.equals(getHeaders(126 - TextUtils.lastIndexOf("", '0', 0, 0), null, null, "").intern())) {
                    return getHeaders;
                }
            } else if (str.equals(getHeaders(127 - (ViewConfiguration.getScrollBarSize() >> 8), null, null, "").intern())) {
                int i4 = post + 63;
                get = i4 % 128;
                if (i4 % 2 == 0) {
                    return getBody;
                }
            }
            checkCertificates.getMethod(log.getBody.getHeaders, getState.getHeaders.headers);
            return AGRequest;
        }

        private static String getHeaders(int i2, String str, int[] iArr, String str2) {
            char[] cArr;
            int i3 = post + 3;
            get = i3 % 128;
            byte[] bArr = str2;
            bArr = str2;
            if (i3 % 2 == 0 ? str2 != null : str2 != null) {
                bArr = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr2 = bArr;
            char[] cArr2 = str;
            if (str != null) {
                int i4 = get + 41;
                post = i4 % 128;
                if (i4 % 2 == 0) {
                    cArr = str.toCharArray();
                } else {
                    cArr = str.toCharArray();
                }
                int i5 = post + 61;
                get = i5 % 128;
                int i6 = i5 % 2;
                cArr2 = cArr;
            }
            char[] cArr3 = cArr2;
            char[] cArr4 = url;
            int i7 = AGRequest$Builder;
            int i8 = 0;
            if (addHeader) {
                int length = bArr2.length;
                char[] cArr5 = new char[length];
                while (i8 < length) {
                    cArr5[i8] = (char) (cArr4[bArr2[(length - 1) - i8] + i2] - i7);
                    i8++;
                }
                return new String(cArr5);
            } else if (!newBuilder) {
                int length2 = iArr.length;
                char[] cArr6 = new char[length2];
                while (i8 < length2) {
                    cArr6[i8] = (char) (cArr4[iArr[(length2 - 1) - i8] - i2] - i7);
                    i8++;
                }
                return new String(cArr6);
            } else {
                int length3 = cArr3.length;
                char[] cArr7 = new char[length3];
                for (int i9 = 0; i9 < length3; i9++) {
                    cArr7[i9] = (char) (cArr4[cArr3[(length3 - 1) - i9] - i2] - i7);
                }
                return new String(cArr7);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                MatchConfig matchConfig = (MatchConfig) obj;
                if (this.AGRequest.equals(matchConfig.AGRequest)) {
                    int i2 = newBuilder;
                    int i3 = i2 + 21;
                    method = i3 % 128;
                    if (i3 % 2 != 0 ? this.getHeaders == matchConfig.getHeaders : this.getHeaders == matchConfig.getHeaders) {
                        if (this.getMethod == matchConfig.getMethod && this.getBody == matchConfig.getBody) {
                            int i4 = i2 + 39;
                            method = i4 % 128;
                            int i5 = i4 % 2;
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        int i6 = method + 33;
        newBuilder = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        return true;
    }

    MatchConfig(JSONArray jSONArray) {
        String str = (String) jSONArray.opt(0);
        if (str != null) {
            String[] split = str.split(getUrl(ViewConfiguration.getScrollDefaultDelay() >> 16, (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)), (char) (43907 - Color.argb(0, 0, 0, 0))).intern());
            this.getMethod = split[0].equals(getUrl(((Process.getThreadPriority(0) + 20) >> 6) + 1, 3 - (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), (char) View.MeasureSpec.getSize(0)).intern());
            this.getBody = split[split.length - 1].equals(getUrl((ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 4, 1 - Color.argb(0, 0, 0, 0), (char) Drawable.resolveOpacity(0, 0)).intern());
            this.getHeaders = Match.getMethod(split[this.getMethod ? 1 : 0]);
        }
        String str2 = (String) jSONArray.opt(1);
        if (str2 != null) {
            this.AGRequest = this.getBody ? str2.toLowerCase() : str2;
        }
    }

    private static String getUrl(int i2, int i3, char c2) {
        char[] cArr = new char[i3];
        int i4 = method + 91;
        newBuilder = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (i6 < i3) {
            int i7 = method + 5;
            newBuilder = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[i6] = (char) ((int) ((((long) getUrl[i2 % i6]) ^ (((long) i6) - AGRequest$Builder)) & ((long) c2)));
                i6 += 28;
            } else {
                cArr[i6] = (char) ((int) ((((long) getUrl[i2 + i6]) ^ (((long) i6) * AGRequest$Builder)) ^ ((long) c2)));
                i6++;
            }
        }
        return new String(cArr);
    }
}
