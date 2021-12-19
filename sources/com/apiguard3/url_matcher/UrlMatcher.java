package com.apiguard3.url_matcher;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import org.json.JSONObject;

public class UrlMatcher implements Serializable {
    private static char[] AGRequest = {50387, 59014, 32863, 41479, 29525, 20750, 14303, 5533, 11225, 2445, 28490, 19715, 41687, 32923, 35779, 43395, 53087, 60684, 731, 8373, 18014, 25628, 39419, 49080, 56701, 17713, 26494, 432, 9208, 52268, 61039};
    private static int getBody = 1;
    private static long getHeaders = 5666502623060042308L;
    private static int getMethod = 0;
    private static final long serialVersionUID = -8578215390633979422L;
    private String domain;
    private String path;
    private String port;
    private String queryString;
    private String scheme;

    static {
        Covode.recordClassIndex(2636);
    }

    public String AGRequest() {
        int i2 = getBody;
        int i3 = i2 + 89;
        getMethod = i3 % 128;
        int i4 = i3 % 2;
        String str = this.port;
        int i5 = i2 + 45;
        getMethod = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getBody() {
        int i2 = getBody + 1;
        int i3 = i2 % 128;
        getMethod = i3;
        int i4 = i2 % 2;
        String str = this.scheme;
        int i5 = i3 + 63;
        getBody = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getMethod() {
        int i2 = getBody;
        int i3 = i2 + 95;
        getMethod = i3 % 128;
        int i4 = i3 % 2;
        String str = this.path;
        int i5 = i2 + 37;
        getMethod = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getUrl() {
        int i2 = getBody + 37;
        getMethod = i2 % 128;
        if (i2 % 2 == 0) {
            return this.queryString;
        }
        return this.queryString;
    }

    public String getHeaders() {
        boolean z;
        int i2 = getMethod + 9;
        getBody = i2 % 128;
        if (i2 % 2 != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return this.domain;
        }
        String str = this.domain;
        throw new NullPointerException("hashCode");
    }

    public int hashCode() {
        char c2;
        int i2;
        int hashCode;
        int hashCode2;
        char c3;
        int i3;
        int i4 = getMethod + 51;
        getBody = i4 % 128;
        int i5 = i4 % 2;
        String str = this.path;
        if (str != null) {
            c2 = 16;
        } else {
            c2 = 'J';
        }
        int i6 = 0;
        if (c2 != 'J') {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i2 + 527) * 31;
        String str2 = this.port;
        if (str2 == null) {
            hashCode = 0;
        } else {
            hashCode = str2.hashCode();
        }
        int i8 = (i7 + hashCode) * 31;
        String str3 = this.scheme;
        if (str3 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str3.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        String str4 = this.queryString;
        if (str4 != null) {
            c3 = '.';
        } else {
            c3 = '+';
        }
        if (c3 != '+') {
            i3 = str4.hashCode();
        } else {
            int i10 = getMethod + 35;
            getBody = i10 % 128;
            int i11 = i10 % 2;
            i3 = 0;
        }
        int i12 = (i9 + i3) * 31;
        String str5 = this.domain;
        if (str5 != null) {
            i6 = str5.hashCode();
        } else {
            int i13 = getMethod + 13;
            getBody = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = i12 + i6;
        int i16 = getMethod + 69;
        getBody = i16 % 128;
        int i17 = i16 % 2;
        return i15;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                UrlMatcher urlMatcher = (UrlMatcher) obj;
                if (TextUtils.equals(this.path, urlMatcher.path) && TextUtils.equals(this.port, urlMatcher.port)) {
                    int i2 = getBody + 3;
                    getMethod = i2 % 128;
                    int i3 = i2 % 2;
                    if (TextUtils.equals(this.scheme, urlMatcher.scheme) && TextUtils.equals(this.queryString, urlMatcher.queryString)) {
                        int i4 = getBody + 3;
                        getMethod = i4 % 128;
                        int i5 = i4 % 2;
                        if (TextUtils.equals(this.domain, urlMatcher.domain)) {
                            int i6 = getMethod + 99;
                            getBody = i6 % 128;
                            if (i6 % 2 != 0) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        int i7 = getBody + 19;
        getMethod = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public UrlMatcher(JSONObject jSONObject) {
        if (jSONObject.has(getHeaders(-16777216 - Color.rgb(0, 0, 0), 3 - TextUtils.lastIndexOf("", '0'), (char) (50468 - PhoneNumberUtils.toaFromString(""))).intern())) {
            this.path = jSONObject.optJSONArray(getHeaders(Color.red(0), 4 - ExpandableListView.getPackedPositionType(0), (char) (50339 - View.resolveSize(0, 0))).intern()).toString();
        }
        if (jSONObject.has(getHeaders(3 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 3 - TextUtils.indexOf((CharSequence) "", '0'), (char) (29477 - Drawable.resolveOpacity(0, 0))).intern())) {
            this.port = jSONObject.optJSONArray(getHeaders(4 - TextUtils.indexOf("", "", 0, 0), (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 3, (char) (TextUtils.indexOf("", "") + 29477)).intern()).toString();
        }
        if (jSONObject.has(getHeaders((ViewConfiguration.getFadingEdgeLength() >> 16) + 8, 6 - TextUtils.indexOf("", "", 0), (char) (-16766038 - Color.rgb(0, 0, 0))).intern())) {
            this.scheme = jSONObject.optJSONArray(getHeaders(TextUtils.getOffsetAfter("", 0) + 8, TextUtils.indexOf((CharSequence) "", '0') + 7, (char) (TextUtils.indexOf("", "") + 11178)).intern()).toString();
        }
        if (jSONObject.has(getHeaders(((Process.getThreadPriority(0) + 20) >> 6) + 14, View.MeasureSpec.makeMeasureSpec(0, 0) + 11, (char) (Color.red(0) + 35762)).intern())) {
            this.queryString = jSONObject.optJSONArray(getHeaders(14 - View.MeasureSpec.getMode(0), Color.red(0) + 11, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 35762)).intern()).toString();
        }
        if (jSONObject.has(getHeaders(25 - (Process.myTid() >> 22), 7 - (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)), (char) (TextUtils.indexOf("", "", 0, 0) + 17749)).intern())) {
            this.domain = jSONObject.optJSONArray(getHeaders((SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)) + 24, (ViewConfiguration.getScrollBarSize() >> 8) + 6, (char) ((Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 17748)).intern()).toString();
        }
    }

    private static String getHeaders(int i2, int i3, char c2) {
        int i4 = getBody;
        int i5 = i4 + 111;
        getMethod = i5 % 128;
        int i6 = i5 % 2;
        char[] cArr = new char[i3];
        int i7 = i4 + 47;
        getMethod = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        while (i9 < i3) {
            cArr[i9] = (char) ((int) ((((long) AGRequest[i2 + i9]) ^ (((long) i9) * getHeaders)) ^ ((long) c2)));
            i9++;
            int i10 = getBody + 105;
            getMethod = i10 % 128;
            int i11 = i10 % 2;
        }
        return new String(cArr);
    }
}
