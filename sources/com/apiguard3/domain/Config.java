package com.apiguard3.domain;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.PhoneNumberUtils;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.URLUtil;
import android.widget.ExpandableListView;
import com.apiguard3.internal.checkCertificates;
import com.apiguard3.internal.getMethod;
import com.apiguard3.internal.getState;
import com.apiguard3.internal.log;
import com.apiguard3.internal.rm;
import com.apiguard3.url_matcher.UriFilter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ugc.effectplatform.b.a.e;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class Config implements Serializable {
    private static int AGRequest = 0;
    private static byte[] AGRequest$Builder = null;
    private static int addHeader = 0;
    private static int delete = 0;
    private static Config getBody = null;
    private static final Integer getHeaders = Integer.valueOf(log.getBody.getBody.getBody());
    private static int getMethod = 0;
    private static final Map<String, rm> getUrl = Collections.unmodifiableMap((Map) ((Class) getMethod.AGRequest((char) (22933 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), TextUtils.indexOf("", "") + 29, View.getDefaultSize(0, 0) + 1077)).getDeclaredConstructor(null).newInstance(null));
    private static int head = 0;
    private static char[] method = null;
    private static short[] newBuilder = null;
    private static final long serialVersionUID = 623200184570711875L;
    private static long url;
    private int bodyXsumMaxLength = -1;
    private Map<String, String> cvmCodeMap;
    private Map<String, String> cvmDigestMap;
    private Boolean cvmEnabled;
    private Integer debugLevel = Integer.valueOf(log.getBody.getHeaders.getBody());
    private String id;
    private String kernel;
    private String kernelId;
    private String kernelPatch;
    private long maxUpdateIntervalInMilliseconds = -1;
    private long minUpdateIntervalInMilliseconds = -1;
    private Boolean nativeHeaderCachingEnabled;
    private String nativeSignalHeaderPrefix;
    private Integer rtd;
    private Boolean storePersistentID;
    private Integer support;
    private long ttlInMilliSeconds = -1;
    private String updateHeaderName;
    private long updateTimeoutInMilliseconds = -1;
    private String updateURL;
    private Map<String, String> updateURLMap;
    private UriFilter uriBypass2;
    private com.apiguard3.network.UriFilter uriFilter;
    private UriFilter uriFilter2;
    private int urlXsumMaxLength = -1;
    private String version;

    static void getSharedInstance() {
        addHeader = -1694036294;
        getMethod = 794243196;
        AGRequest$Builder = new byte[]{-49, -13, 42, 30, -43, -52, -43, -17, 15, -14, 83, -83, 10, 73, -76, 7, -9, -4, e.f153515b, -6, 75, -70, -3, 73, -84, 15, -14, 83, -69, 3, 66, -84, 1, -2, 8, 77, -68, 27, -35, 7, -9, -4, e.f153515b, -6, -11, -16, 9, 11, -21, 86, -65, 65, -69, -17, 21, -7, 72, -84, 1, -2, 8, 77, -69, -8, 12, -13, 78, -82, e.f153515b, 1, 3, -4, -3, 72, -69, -15, 19, -3, -12, 27, 53, -76, 7, -9, -4, e.f153515b, -6, -52, -8, -47, -1, 6, -10, 1, e.f153515b, -17, -52, -5, -30, 15, 3, 1, -13, 34, -34, e.f153515b, 1, 3, -4, 29, -36, 11, -13, 7, -2, 22, -18, -17, e.f153515b, -11, 19, -13, -44, -65, 0, 18, -15, -9, 55, -39, -9, -3, -53, -53, -49, 11, -25, -14, -1, -46, -5, -7, -21, -13, 3, -5, 1, -45, -9, 19, -34, -7, 10, 1, -13, 9, -47, 2, 3, -1, 0, -5, 2, -36, -12, e.f153515b, -7, 9, 25, -33, -8, 2, 8, 8, -2, -3, 37, -54, 21, -11, e.f153515b, -46, 27, -35, 7, -9, -4, e.f153515b, -6};
        AGRequest = 54;
        method = new char[]{45020, 58133, 13866, 18736, 40000, 12099, 25197, 46450, 51345, 7086, 44793, 57804, 13522, 18413, 39671, 11790, 24850, 46126, 51035, 6750, 44409, 57466, 13198, 18073, 39397, 11480, 32713, 45802, 50686, 6410, 44055, 65326, 12848, 17759, 25717, 10388, 64947, 33464, 22485, 58584, 43439, 32490, 770, 53282, 25913, 10816, 65375, 35885, 20855, 58764, 43674, 32689, 3266, 53699, 26275, 11251, 63502, 36116, 21038, 59141, 46170, 31092, 3680, 53913, 26591, 13473, 63930, 36547, 21474, 57521, 46338, 31325, 3897, 56376, 24903, 13936, 64370, 10705, 25933, 'M', 19599, 39344, 59052, 13271, 32980, 52729, 6887, 26388, 46206, 314, 20063, 39770, 59493, 13677, 33181, 52878, 60602, 41050, 30079, 2677, 57100, 27675, 8469, 63026, 35797, 22764, 60917, 'u', 19614, 39352, 59051, 13260, 32963, 52700, 6887, 26385, 46138, 297, 20040, 39782, 59511, 13673, 33175, 'u', 19614, 39352, 59051, 13260, 32963, 52673, 6864, 26428, 46099, 301, 20042, 'u', 19612, 39349, 59020, 13265, 32970, 52704, 6887, 26370, 46188, 'c', 19589, 2758, 'e', 19584, 39357, 59048, 13268, 32963, 52698, 6858, 26419, 'r', 19610, 39352, 57784, 44407, 30787, 1860, 53821, 24874, 11292, 64283, 34536, 21890, 57555, 44969, 31418, 2444, 54417, 24681, 12092, 64091, 35123, 21622, 14181, 31619, 37442, 57037, 2961, 50784, 35465, 24485, 8348, 62917, 18134, 3042, 56572, 41238, 29246, 50996, 34915, 23896, 11885, 62326, 18323, 2205, 'm', 19599, 39332, 59039, 13256, 32962, 52725, 6902, 26389, 46103, 290, 20046, 39757, 59492, 13682, 33171, 52876, 'u', 19614, 39352, 59051, 13260, 32963, 52701, 6892, 26372, 46139, 318, 20044, 39753, 59514, 'u', 19614, 39352, 59051, 13260, 32963, 52672, 6891, 26397, 46139, 291, 20047, 39772, 60597, 41051, 30065, 'u', 19614, 39352, 59051, 13260, 32963, 52673, 6864, 26428, 'k', 19595, 39342, 59044, 13277, 32970, 8218, 27883, 47558};
        url = -4548743475480408850L;
    }

    public void getBody(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.kernel = str;
            int i2 = delete + 115;
            head = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = delete + 37;
        head = i4 % 128;
        if (i4 % 2 == 0) {
            throw new NullPointerException("hashCode");
        }
    }

    public String AGRequest$Builder() {
        int i2 = head;
        int i3 = i2 + 113;
        delete = i3 % 128;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 75;
        delete = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public Long AGResponse() {
        int i2 = head + 103;
        delete = i2 % 128;
        int i3 = i2 % 2;
        Long valueOf = Long.valueOf(this.maxUpdateIntervalInMilliseconds);
        int i4 = head + 17;
        delete = i4 % 128;
        int i5 = i4 % 2;
        return valueOf;
    }

    public String addHeader() {
        int i2 = head + 115;
        int i3 = i2 % 128;
        delete = i3;
        int i4 = i2 % 2;
        String str = this.kernel;
        int i5 = i3 + 59;
        head = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String build() {
        int i2 = delete;
        int i3 = i2 + 63;
        head = i3 % 128;
        int i4 = i3 % 2;
        String str = this.updateHeaderName;
        int i5 = i2 + 107;
        head = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public long delete() {
        int i2 = head;
        int i3 = i2 + 7;
        delete = i3 % 128;
        int i4 = i3 % 2;
        long j2 = this.ttlInMilliSeconds;
        int i5 = i2 + 69;
        delete = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    public Map<String, String> get() {
        int i2 = delete + 9;
        int i3 = i2 % 128;
        head = i3;
        int i4 = i2 % 2;
        Map<String, String> map = this.cvmCodeMap;
        int i5 = i3 + 33;
        delete = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public String getBody() {
        int i2 = head + 47;
        delete = i2 % 128;
        if (i2 % 2 == 0) {
            return this.version;
        }
        return this.version;
    }

    public boolean getUrl() {
        Boolean bool = this.cvmEnabled;
        if (bool == null) {
            int i2 = delete + 49;
            head = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        boolean booleanValue = bool.booleanValue();
        int i4 = delete + 101;
        head = i4 % 128;
        int i5 = i4 % 2;
        return booleanValue;
    }

    public Long head() {
        int i2 = delete + 53;
        head = i2 % 128;
        int i3 = i2 % 2;
        Long valueOf = Long.valueOf(this.updateTimeoutInMilliseconds);
        int i4 = head + 5;
        delete = i4 % 128;
        int i5 = i4 % 2;
        return valueOf;
    }

    public String headers() {
        int i2 = head;
        int i3 = i2 + 77;
        delete = i3 % 128;
        int i4 = i3 % 2;
        String str = this.nativeSignalHeaderPrefix;
        int i5 = i2 + 105;
        delete = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public UriFilter headersMultiMap() {
        int i2 = delete + 33;
        int i3 = i2 % 128;
        head = i3;
        int i4 = i2 % 2;
        UriFilter uriFilter3 = this.uriBypass2;
        int i5 = i3 + 65;
        delete = i5 % 128;
        int i6 = i5 % 2;
        return uriFilter3;
    }

    public String newBuilder() {
        int i2 = delete;
        int i3 = i2 + 111;
        head = i3 % 128;
        int i4 = i3 % 2;
        String str = this.updateURL;
        int i5 = i2 + 103;
        head = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public Long post() {
        int i2 = head + 23;
        delete = i2 % 128;
        int i3 = i2 % 2;
        Long valueOf = Long.valueOf(this.minUpdateIntervalInMilliseconds);
        int i4 = delete + 71;
        head = i4 % 128;
        int i5 = i4 % 2;
        return valueOf;
    }

    public int statusCode() {
        int i2 = head + 115;
        delete = i2 % 128;
        int i3 = i2 % 2;
        return this.rtd.intValue();
    }

    public String url() {
        int i2 = head + 105;
        int i3 = i2 % 128;
        delete = i3;
        int i4 = i2 % 2;
        String str = this.kernelPatch;
        int i5 = i3 + 49;
        head = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public int valueOf() {
        int i2 = head;
        int i3 = i2 + 5;
        delete = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.bodyXsumMaxLength;
        int i6 = i2 + 3;
        delete = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public Boolean AGResponse$Builder() {
        Integer num = this.support;
        if (num == null) {
            return Boolean.FALSE;
        }
        boolean z = true;
        if ((num.intValue() & 1) != 0) {
            z = false;
        } else {
            int i2 = delete;
            int i3 = i2 + 117;
            head = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 89;
            head = i5 % 128;
            int i6 = i5 % 2;
        }
        return Boolean.valueOf(z);
    }

    public Integer AGState() {
        boolean z;
        int i2 = delete + 125;
        head = i2 % 128;
        boolean z2 = false;
        if (i2 % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Integer num = this.debugLevel;
            throw new NullPointerException("hashCode");
        }
        if (this.debugLevel == null) {
            z2 = true;
        }
        if (!z2) {
            return this.debugLevel;
        }
        Integer valueOf = Integer.valueOf(log.getBody.getHeaders.getBody());
        int i3 = head + 11;
        delete = i3 % 128;
        int i4 = i3 % 2;
        return valueOf;
    }

    public UriFilter getStatusCode() {
        int i2 = head + 31;
        int i3 = i2 % 128;
        delete = i3;
        int i4 = i2 % 2;
        UriFilter uriFilter3 = this.uriFilter2;
        int i5 = i3 + 57;
        head = i5 % 128;
        if (i5 % 2 != 0) {
            return uriFilter3;
        }
        throw new NullPointerException("hashCode");
    }

    public String method() {
        boolean z;
        int i2 = head;
        int i3 = i2 + 25;
        delete = i3 % 128;
        int i4 = i3 % 2;
        String str = this.kernelId;
        int i5 = i2 + 125;
        delete = i5 % 128;
        if (i5 % 2 == 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return str;
        }
        throw new NullPointerException("hashCode");
    }

    public Map<String, String> put() {
        char c2;
        int i2 = delete + 11;
        head = i2 % 128;
        if (i2 % 2 != 0) {
            c2 = 'F';
        } else {
            c2 = 'U';
        }
        if (c2 == 'F') {
            return this.updateURLMap;
        }
        Map<String, String> map = this.updateURLMap;
        throw new NullPointerException("hashCode");
    }

    static {
        Covode.recordClassIndex(2498);
        head = 1;
        getSharedInstance();
        try {
            int i2 = delete + 117;
            head = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public boolean getHeaders() {
        Boolean bool = this.storePersistentID;
        if (bool == null) {
            int i2 = head + 87;
            delete = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = delete + 67;
        head = i4 % 128;
        int i5 = i4 % 2;
        return bool.booleanValue();
    }

    public static synchronized Config AGRequest() {
        Config config;
        synchronized (Config.class) {
            MethodCollector.i(2868);
            int i2 = delete + 113;
            head = i2 % 128;
            int i3 = i2 % 2;
            if (getBody == null) {
                Config config2 = new Config();
                getBody = config2;
                config2.updateHeaderName = getUrl((ViewConfiguration.getEdgeSlop() >> 16) + 1694036382, -794243196 - KeyEvent.getDeadChar(0, 0), -55 - View.resolveSize(0, 0), (short) (4 - AndroidCharacter.getEastAsianWidth('0')), (byte) TextUtils.getOffsetBefore("", 0)).intern();
                getBody.nativeSignalHeaderPrefix = getUrl(TextUtils.getOffsetBefore("", 0) + 1694036382, TextUtils.indexOf("", "", 0) - 794243191, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 55, (short) (Process.myPid() >> 22), (byte) (1 - (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)))).intern();
                Config config3 = getBody;
                config3.ttlInMilliSeconds = 86400000;
                config3.updateTimeoutInMilliseconds = 60000;
                config3.minUpdateIntervalInMilliseconds = 300000;
                config3.maxUpdateIntervalInMilliseconds = 28800000;
                config3.urlXsumMaxLength = 1024;
                config3.bodyXsumMaxLength = 1024;
                config3.kernelPatch = null;
                config3.debugLevel = Integer.valueOf(log.getBody.getHeaders.getBody());
                getBody.uriFilter = com.apiguard3.network.UriFilter.getBody();
                getBody.uriFilter2 = UriFilter.getMethod();
                getBody.uriBypass2 = UriFilter.getMethod();
                getBody.nativeHeaderCachingEnabled = Boolean.TRUE;
                getBody.support = 255;
                getBody.rtd = 255;
                int i4 = head + 77;
                delete = i4 % 128;
                int i5 = i4 % 2;
            }
            config = getBody;
            MethodCollector.o(2868);
        }
        return config;
    }

    private Config getRequestHeaders() {
        com.apiguard3.network.UriFilter uriFilter3;
        UriFilter uriFilter4;
        Config config = new Config();
        config.version = this.version;
        config.id = this.id;
        config.kernel = this.kernel;
        config.kernelId = this.kernelId;
        config.kernelPatch = this.kernelPatch;
        config.updateURL = this.updateURL;
        if (this.updateURLMap != null) {
            config.updateURLMap = new HashMap(this.updateURLMap);
        }
        config.updateHeaderName = this.updateHeaderName;
        config.nativeSignalHeaderPrefix = this.nativeSignalHeaderPrefix;
        config.ttlInMilliSeconds = this.ttlInMilliSeconds;
        config.updateTimeoutInMilliseconds = this.updateTimeoutInMilliseconds;
        config.minUpdateIntervalInMilliseconds = this.minUpdateIntervalInMilliseconds;
        config.maxUpdateIntervalInMilliseconds = this.maxUpdateIntervalInMilliseconds;
        config.urlXsumMaxLength = this.urlXsumMaxLength;
        config.bodyXsumMaxLength = this.bodyXsumMaxLength;
        com.apiguard3.network.UriFilter uriFilter5 = this.uriFilter;
        UriFilter uriFilter6 = null;
        if (uriFilter5 != null) {
            uriFilter3 = uriFilter5.getUrl();
        } else {
            int i2 = delete + 43;
            head = i2 % 128;
            int i3 = i2 % 2;
            uriFilter3 = null;
        }
        config.uriFilter = uriFilter3;
        UriFilter uriFilter7 = this.uriFilter2;
        if (uriFilter7 != null) {
            uriFilter4 = uriFilter7.getHeaders();
            int i4 = delete + 119;
            head = i4 % 128;
            int i5 = i4 % 2;
        } else {
            uriFilter4 = null;
        }
        config.uriFilter2 = uriFilter4;
        UriFilter uriFilter8 = this.uriBypass2;
        if (uriFilter8 != null) {
            uriFilter6 = uriFilter8.getHeaders();
        } else {
            int i6 = delete + 119;
            head = i6 % 128;
            if (i6 % 2 != 0) {
            }
        }
        config.uriBypass2 = uriFilter6;
        config.storePersistentID = this.storePersistentID;
        config.cvmEnabled = this.cvmEnabled;
        config.debugLevel = this.debugLevel;
        config.nativeHeaderCachingEnabled = this.nativeHeaderCachingEnabled;
        config.support = this.support;
        config.rtd = this.rtd;
        if (this.cvmCodeMap != null) {
            int i7 = head + 59;
            delete = i7 % 128;
            if (i7 % 2 == 0 ? this.cvmDigestMap != null : this.cvmDigestMap != null) {
                config.cvmCodeMap = new HashMap(this.cvmCodeMap);
                config.cvmDigestMap = new HashMap(this.cvmDigestMap);
            }
        }
        return config;
    }

    public boolean values() {
        try {
            if (!TextUtils.isEmpty(this.version)) {
                int i2 = delete + 15;
                head = i2 % 128;
                if (i2 % 2 == 0 ? getBody(newBuilder(this.version)) : getBody(newBuilder(this.version))) {
                    if (!TextUtils.isEmpty(this.kernel) && !TextUtils.isEmpty(this.kernelId)) {
                        int i3 = delete + 125;
                        head = i3 % 128;
                        int i4 = i3 % 2;
                        if (!(TextUtils.isEmpty(this.id) || TextUtils.isEmpty(this.updateURL) || this.updateURLMap == null || -1 == this.updateTimeoutInMilliseconds || -1 == this.minUpdateIntervalInMilliseconds)) {
                            int i5 = head;
                            int i6 = i5 + 35;
                            delete = i6 % 128;
                            int i7 = i6 % 2;
                            int i8 = i5 + 117;
                            delete = i8 % 128;
                            int i9 = i8 % 2;
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (getUrl e2) {
            checkCertificates.AGRequest(log.getBody.getHeaders, getState.AGRequest.getBody, e2.getMessage());
            return false;
        }
    }

    public boolean getMethod() {
        int i2 = delete + 49;
        head = i2 % 128;
        int i3 = i2 % 2;
        boolean booleanValue = this.nativeHeaderCachingEnabled.booleanValue();
        int i4 = delete + 81;
        head = i4 % 128;
        int i5 = i4 % 2;
        return booleanValue;
    }

    public void getHeaders(Map<String, String> map) {
        int i2 = head + 31;
        delete = i2 % 128;
        int i3 = i2 % 2;
        this.updateURLMap = map;
    }

    public void getMethod(Map<String, String> map) {
        int i2 = head + 95;
        delete = i2 % 128;
        int i3 = i2 % 2;
        this.cvmDigestMap = map;
    }

    public void getUrl(UriFilter uriFilter3) {
        int i2 = head + 101;
        delete = i2 % 128;
        int i3 = i2 % 2;
        this.uriBypass2 = uriFilter3;
    }

    public void AGRequest(String str) {
        int i2 = delete + 65;
        int i3 = i2 % 128;
        head = i3;
        int i4 = i2 % 2;
        this.id = str;
        int i5 = i3 + 91;
        delete = i5 % 128;
        int i6 = i5 % 2;
    }

    public void getHeaders(String str) {
        int i2 = head;
        int i3 = i2 + 103;
        delete = i3 % 128;
        int i4 = i3 % 2;
        this.kernelPatch = str;
        int i5 = i2 + 117;
        delete = i5 % 128;
        int i6 = i5 % 2;
    }

    public void AGRequest(UriFilter uriFilter3) {
        int i2 = head + 73;
        int i3 = i2 % 128;
        delete = i3;
        int i4 = i2 % 2;
        this.uriFilter2 = uriFilter3;
        int i5 = i3 + 53;
        head = i5 % 128;
        if (i5 % 2 == 0) {
            throw new NullPointerException("hashCode");
        }
    }

    public boolean addHeader(String str) {
        int i2 = delete + 49;
        head = i2 % 128;
        if (i2 % 2 == 0 ? AGRequest$Builder(str) : AGRequest$Builder(str)) {
            this.updateURL = str;
            int i3 = delete + 33;
            head = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        checkCertificates.getMethod(log.getBody.getMethod, getState.getBody.getUrl);
        return false;
    }

    public void getHeaders(int i2) {
        boolean z;
        int i3 = delete + 37;
        head = i3 % 128;
        if (i3 % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        this.rtd = Integer.valueOf(i2);
        if (!z) {
            throw new NullPointerException("hashCode");
        }
        int i4 = head + 111;
        delete = i4 % 128;
        int i5 = i4 % 2;
    }

    public void getMethod(Integer num) {
        if (num.intValue() >= 0) {
            int i2 = delete + 59;
            head = i2 % 128;
            int i3 = i2 % 2;
            if (num.intValue() <= getHeaders.intValue()) {
                this.debugLevel = num;
                return;
            }
        }
        checkCertificates.getMethod(log.getBody.getHeaders, getState.getHeaders.transformRequest);
        int i4 = head + 99;
        delete = i4 % 128;
        if (i4 % 2 != 0) {
            throw new NullPointerException("hashCode");
        }
    }

    public void getUrl(String str) {
        char c2;
        int i2 = delete + 59;
        head = i2 % 128;
        int i3 = i2 % 2;
        if (!TextUtils.isEmpty(str)) {
            int i4 = head + 39;
            delete = i4 % 128;
            if (i4 % 2 == 0) {
                c2 = '5';
            } else {
                c2 = 30;
            }
            this.kernelId = str;
            if (c2 != '5') {
                throw new NullPointerException("hashCode");
            }
        }
    }

    static Map<String, String> AGRequest(JSONObject jSONObject) {
        boolean z;
        char c2;
        String str;
        Object obj;
        if (jSONObject != null) {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            int i2 = delete + 53;
            head = i2 % 128;
            int i3 = i2 % 2;
            while (true) {
                if (!keys.hasNext()) {
                    c2 = 'S';
                } else {
                    c2 = '6';
                }
                if (c2 != '6') {
                    return hashMap;
                }
                int i4 = delete + 51;
                head = i4 % 128;
                if (i4 % 2 == 0) {
                    str = keys.next();
                    try {
                        obj = jSONObject.get(str);
                    } catch (JSONException unused) {
                        checkCertificates.getMethod(log.getBody.getMethod, getState.getBody.headers);
                    }
                } else {
                    str = keys.next();
                    obj = jSONObject.get(str);
                }
                hashMap.put(str, obj);
            }
        } else {
            int i5 = head + 17;
            delete = i5 % 128;
            if (i5 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return Collections.emptyMap();
            }
            return Collections.emptyMap();
        }
    }

    private static boolean AGRequest$Builder(String str) {
        try {
            if (!((Boolean) ((Class) getMethod.AGRequest((char) ((Process.getThreadPriority(0) + 20) >> 6), 41 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 5997)).getMethod("getHeaders", null).invoke(null, null)).booleanValue()) {
                int i2 = head + 121;
                delete = i2 % 128;
                int i3 = i2 % 2;
                if (!URLUtil.isHttpsUrl(str)) {
                    return false;
                }
            }
            int i4 = head + 117;
            delete = i4 % 128;
            int i5 = i4 % 2;
            return true;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static Integer getUrl(JSONObject jSONObject) {
        char c2;
        Integer num;
        if (!jSONObject.has(getBody(180 - ((Process.getThreadPriority(0) + 20) >> 6), 2 - Color.red(0), (char) ((Process.myTid() >> 22) + 14081)).intern())) {
            c2 = 29;
        } else {
            c2 = 'C';
        }
        if (c2 != 29) {
            int i2 = head + 37;
            delete = i2 % 128;
            int i3 = i2 % 2;
            try {
                num = Integer.valueOf(jSONObject.getInt(getBody(180 - ExpandableListView.getPackedPositionGroup(0), 2 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 14080)).intern()));
            } catch (Exception e2) {
                checkCertificates.AGRequest(log.getBody.getHeaders, getState.getHeaders.transformRequest, e2.toString());
            }
            int i4 = head + 117;
            delete = i4 % 128;
            int i5 = i4 % 2;
            return num;
        }
        num = null;
        int i42 = head + 117;
        delete = i42 % 128;
        int i52 = i42 % 2;
        return num;
    }

    public void getMethod(String str) {
        boolean z;
        int i2 = head + 103;
        delete = i2 % 128;
        if (i2 % 2 == 0) {
            z = false;
        } else {
            z = true;
        }
        this.version = str;
        if (z) {
            throw new NullPointerException("hashCode");
        }
        int i3 = delete + 1;
        head = i3 % 128;
        int i4 = i3 % 2;
    }

    public void url(String str) {
        int i2 = delete + 35;
        int i3 = i2 % 128;
        head = i3;
        int i4 = i2 % 2;
        if (str != null) {
            this.nativeSignalHeaderPrefix = str;
            int i5 = i3 + 63;
            delete = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        checkCertificates.AGRequest(log.getBody.getUrl, getState.url.getMethod.AGRequest());
        this.nativeSignalHeaderPrefix = getUrl((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1694036381, -794243191 - TextUtils.indexOf("", "", 0, 0), AndroidCharacter.getEastAsianWidth('0') - 59, (short) ((ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) - 1), (byte) (Process.myPid() >> 22)).intern();
    }

    private static Long AGRequest$Builder(JSONObject jSONObject) {
        boolean z;
        int i2 = delete + 13;
        head = i2 % 128;
        int i3 = i2 % 2;
        Long l2 = -1L;
        if (!jSONObject.has(getBody(TextUtils.lastIndexOf("", '0') + 203, (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 18, (char) (Color.rgb(0, 0, 0) + 16777216)).intern())) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int i4 = delete + 61;
            head = i4 % 128;
            if (i4 % 2 == 0) {
                try {
                    l2 = Long.valueOf(jSONObject.getLong(getBody(9953 << (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)), Color.argb(1, 0, 0, 0) + 45, (char) (ViewConfiguration.getJumpTapTimeout() >> 85)).intern()));
                    if (l2.longValue() > 0) {
                    }
                } catch (Exception unused) {
                    throw new getUrl(getState.AGRequest.newBuilder);
                }
            } else {
                l2 = Long.valueOf(jSONObject.getLong(getBody((SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 201, 17 - Color.argb(0, 0, 0, 0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16)).intern()));
                if (l2.longValue() > 0) {
                }
            }
            throw new getUrl(getState.AGRequest.newBuilder);
        }
        int i5 = head + 31;
        delete = i5 % 128;
        int i6 = i5 % 2;
        return l2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a1, code lost:
        if (r5.longValue() > 1) goto L_0x00a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Long addHeader(org.json.JSONObject r6) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.domain.Config.addHeader(org.json.JSONObject):java.lang.Long");
    }

    private static Integer getBody(JSONObject jSONObject) {
        char c2;
        String obj;
        int i2 = head + 27;
        delete = i2 % 128;
        int i3 = i2 % 2;
        Integer num = null;
        if (jSONObject.has(getUrl((ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 1694036410, -794243040 - (Process.myTid() >> 22), (Process.myPid() >> 22) - 55, (short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (byte) TextUtils.getTrimmedLength("")).intern())) {
            try {
                num = Integer.valueOf(jSONObject.getInt(getUrl((ViewConfiguration.getDoubleTapTimeout() >> 16) + 1694036409, (ViewConfiguration.getScrollBarSize() >> 8) - 794243040, (ViewConfiguration.getEdgeSlop() >> 16) - 55, (short) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1))), (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1)).intern()));
            } catch (JSONException e2) {
                checkCertificates.AGRequest(log.getBody.getHeaders, getState.getHeaders.readObject, e2.getMessage());
            }
        }
        log.getBody getbody = log.getBody.getUrl;
        getState.getHeaders getheaders = getState.getHeaders.readObject;
        if (num == null) {
            c2 = ',';
        } else {
            c2 = '\t';
        }
        if (c2 != '\t') {
            obj = getBody(182 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.getOffsetAfter("", 0) + 3, (char) ((SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 37387)).intern();
        } else {
            int i4 = delete + 29;
            head = i4 % 128;
            if (i4 % 2 == 0) {
                obj = num.toString();
            } else {
                obj = num.toString();
            }
        }
        checkCertificates.AGRequest(getbody, getheaders, obj);
        int i5 = delete + 63;
        head = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    private static Boolean getHeaders(JSONObject jSONObject) {
        char c2;
        int i2 = head + 43;
        delete = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = null;
        if (!jSONObject.has(getUrl((ViewConfiguration.getTapTimeout() >> 16) + 1694036395, TextUtils.indexOf("", "") - 794243049, (ViewConfiguration.getEdgeSlop() >> 16) - 55, (short) (KeyEvent.getMaxKeyCode() >> 16), (byte) ExpandableListView.getPackedPositionType(0)).intern())) {
            c2 = 16;
        } else {
            c2 = ' ';
        }
        if (c2 == 16) {
            return null;
        }
        int i4 = head + 39;
        delete = i4 % 128;
        int i5 = i4 % 2;
        try {
            bool = Boolean.valueOf(jSONObject.getBoolean(getUrl(1694036395 - TextUtils.getTrimmedLength(""), -794243048 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), AndroidCharacter.getEastAsianWidth('0') - 59, (short) (-1 - TextUtils.indexOf((CharSequence) "", '0', 0)), (byte) TextUtils.indexOf("", "", 0)).intern()));
            return bool;
        } catch (Exception e2) {
            checkCertificates.AGRequest(log.getBody.getHeaders, getState.getHeaders.gc, e2.toString());
            return bool;
        }
    }

    private static Boolean getMethod(JSONObject jSONObject) {
        boolean z;
        int i2 = head + 107;
        delete = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = null;
        if (!jSONObject.has(getUrl((ViewConfiguration.getTouchSlop() >> 8) + 1694036409, -794243058 - TextUtils.lastIndexOf("", '0'), -55 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) Color.green(0), (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int i4 = head + 55;
            delete = i4 % 128;
            int i5 = i4 % 2;
            try {
                bool = Boolean.valueOf(jSONObject.getBoolean(getUrl(TextUtils.getOffsetAfter("", 0) + 1694036409, TextUtils.lastIndexOf("", '0', 0, 0) - 794243056, TextUtils.getOffsetBefore("", 0) - 55, (short) TextUtils.indexOf("", "", 0, 0), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern()));
                int i6 = head + 71;
                delete = i6 % 128;
                int i7 = i6 % 2;
            } catch (Exception e2) {
                checkCertificates.AGRequest(log.getBody.getHeaders, getState.getHeaders.getSharedInstance, e2.toString());
            }
        }
        return bool;
    }

    private static Integer method(JSONObject jSONObject) {
        boolean z;
        Integer num = -1;
        if (!jSONObject.has(getUrl(1694036391 - ImageFormat.getBitsPerPixel(0), -794243033 - (ViewConfiguration.getScrollBarSize() >> 8), -55 - KeyEvent.getDeadChar(0, 0), (short) TextUtils.getOffsetAfter("", 0), (byte) TextUtils.indexOf("", "")).intern())) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                num = Integer.valueOf(jSONObject.getInt(getUrl(View.MeasureSpec.makeMeasureSpec(0, 0) + 1694036392, Color.green(0) - 794243033, -56 - TextUtils.indexOf((CharSequence) "", '0', 0), (short) (Process.getGidForName("") + 1), (byte) (ViewConfiguration.getLongPressTimeout() >> 16)).intern()));
                if (num.intValue() >= 0) {
                    int i2 = delete + 5;
                    head = i2 % 128;
                    int i3 = i2 % 2;
                } else {
                    throw new getUrl(getState.AGRequest.AGRequest$Builder);
                }
            } catch (Exception unused) {
                throw new getUrl(getState.AGRequest.method);
            }
        }
        int i4 = head + 107;
        delete = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    private static Integer newBuilder(JSONObject jSONObject) {
        char c2;
        int i2 = head + 67;
        delete = i2 % 128;
        int i3 = i2 % 2;
        Integer num = -1;
        if (!jSONObject.has(getBody((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 185, 16 - ImageFormat.getBitsPerPixel(0), (char) ((Process.myTid() >> 22) + 50709)).intern())) {
            c2 = '\'';
        } else {
            c2 = '4';
        }
        if (c2 == '4') {
            int i4 = delete + 39;
            head = i4 % 128;
            int i5 = i4 % 2;
            try {
                num = Integer.valueOf(jSONObject.getInt(getBody(ExpandableListView.getPackedPositionChild(0) + 186, (KeyEvent.getMaxKeyCode() >> 16) + 17, (char) (50709 - ((Process.getThreadPriority(0) + 20) >> 6))).intern()));
                if (num.intValue() < 0) {
                    throw new getUrl(getState.AGRequest.AGRequest$Builder);
                }
            } catch (Exception unused) {
                throw new getUrl(getState.AGRequest.AGRequest$Builder);
            }
        }
        return num;
    }

    private static Long put(JSONObject jSONObject) {
        char c2;
        Long l2 = -1L;
        if (!jSONObject.has(getBody(TextUtils.getOffsetBefore("", 0) + 246, (Process.myPid() >> 22) + 3, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) + 60608)).intern())) {
            c2 = '1';
        } else {
            c2 = 'N';
        }
        if (c2 == 'N') {
            int i2 = head + 91;
            delete = i2 % 128;
            int i3 = i2 % 2;
            try {
                l2 = Long.valueOf(jSONObject.getLong(getBody(246 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 3 - (ViewConfiguration.getTapTimeout() >> 16), (char) (60608 - TextUtils.lastIndexOf("", '0', 0, 0))).intern()));
                if (l2.longValue() <= 0) {
                    throw new getUrl(getState.AGRequest.getUrl);
                }
            } catch (Exception unused) {
                throw new getUrl(getState.AGRequest.getUrl);
            }
        }
        int i4 = delete + 97;
        head = i4 % 128;
        int i5 = i4 % 2;
        return l2;
    }

    private static Long url(JSONObject jSONObject) {
        char c2;
        Long l2 = -1L;
        if (!jSONObject.has(getBody(219 - TextUtils.getCapsMode("", 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 15, (char) ExpandableListView.getPackedPositionGroup(0)).intern())) {
            c2 = 0;
        } else {
            c2 = '1';
        }
        if (c2 == '1') {
            int i2 = delete + 73;
            head = i2 % 128;
            int i3 = i2 % 2;
            try {
                l2 = Long.valueOf(jSONObject.getLong(getBody(219 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 15 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0)).intern()));
                if (l2.longValue() > 0) {
                    int i4 = delete + 125;
                    head = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    throw new getUrl(getState.AGRequest.url);
                }
            } catch (Exception unused) {
                throw new getUrl(getState.AGRequest.url);
            }
        }
        int i6 = delete + 27;
        head = i6 % 128;
        int i7 = i6 % 2;
        return l2;
    }

    static boolean getBody(Integer[] numArr) {
        int i2 = delete + 97;
        head = i2 % 128;
        int i3 = i2 % 2;
        if (!(numArr == null || numArr.length == 0)) {
            try {
                if (getBody(newBuilder(getBody(264 - (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), Color.green(0) + 3, (char) (TextUtils.getOffsetAfter("", 0) + 8235)).intern()), numArr) > 0) {
                    return false;
                }
                int i4 = delete + 47;
                head = i4 % 128;
                int i5 = i4 % 2;
                return true;
            } catch (getUrl unused) {
            }
        }
        return false;
    }

    static Integer[] newBuilder(String str) {
        char c2;
        char c3;
        try {
            String[] split = str.split(getBody(77 - TextUtils.getOffsetBefore("", 0), ExpandableListView.getPackedPositionChild(0) + 3, (char) (TextUtils.indexOf((CharSequence) "", '0') + 10638)).intern());
            if (split.length > 0) {
                Integer[] numArr = new Integer[split.length];
                int i2 = head + 1;
                delete = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 0;
                while (true) {
                    if (i4 >= split.length) {
                        c2 = '1';
                    } else {
                        c2 = 'A';
                    }
                    if (c2 == '1') {
                        return numArr;
                    }
                    int i5 = delete + 77;
                    head = i5 % 128;
                    if (i5 % 2 != 0) {
                        c3 = 'S';
                    } else {
                        c3 = '\n';
                    }
                    if (c3 != '\n') {
                        numArr[i4] = Integer.valueOf(Integer.parseInt(split[i4]));
                        i4++;
                    } else {
                        numArr[i4] = Integer.valueOf(Integer.parseInt(split[i4]));
                        i4 += 87;
                    }
                }
            } else {
                throw new getUrl(getBody((ViewConfiguration.getLongPressTimeout() >> 16) + 79, View.MeasureSpec.getSize(0) + 17, (char) TextUtils.getCapsMode("", 0, 0)).intern());
            }
        } catch (Exception unused) {
            throw new getUrl(getBody(79 - (Process.myPid() >> 22), (ViewConfiguration.getLongPressTimeout() >> 16) + 17, (char) KeyEvent.getDeadChar(0, 0)).intern());
        }
    }

    public void AGRequest(Map<String, String> map) {
        int i2 = delete + 67;
        int i3 = i2 % 128;
        head = i3;
        int i4 = i2 % 2;
        this.cvmCodeMap = map;
        int i5 = i3 + 103;
        delete = i5 % 128;
        int i6 = i5 % 2;
    }

    private Config getHeaders(Config config) {
        Config AGRequest2;
        String str;
        if (config != null) {
            AGRequest2 = config.getRequestHeaders();
            int i2 = delete + 71;
            head = i2 % 128;
            int i3 = i2 % 2;
        } else {
            AGRequest2 = AGRequest();
        }
        String str2 = this.kernelId;
        if (str2 != null || this.kernel == null) {
            String str3 = this.version;
            if (str3 != null) {
                int i4 = head + 3;
                delete = i4 % 128;
                int i5 = i4 % 2;
                AGRequest2.version = str3;
            }
            String str4 = this.id;
            if (str4 != null) {
                AGRequest2.id = str4;
            }
            if (str2 != null) {
                AGRequest2.kernelId = str2;
            }
            String str5 = this.kernel;
            if (str5 != null) {
                AGRequest2.kernel = str5;
            }
            String str6 = this.kernelPatch;
            if (str6 != null) {
                AGRequest2.kernelPatch = str6;
            } else if (this.kernel != null) {
                AGRequest2.kernelPatch = null;
            }
            com.apiguard3.network.UriFilter uriFilter3 = this.uriFilter;
            if (uriFilter3 != null) {
                AGRequest2.uriFilter = uriFilter3.getUrl();
            }
            String str7 = this.updateURL;
            if (str7 != null) {
                AGRequest2.updateURL = str7;
            }
            Map<String, String> map = this.updateURLMap;
            if (map != null) {
                AGRequest2.updateURLMap = map;
            }
            String str8 = this.updateHeaderName;
            if (str8 != null) {
                AGRequest2.updateHeaderName = str8;
            }
            String str9 = this.nativeSignalHeaderPrefix;
            if (str9 != null) {
                AGRequest2.nativeSignalHeaderPrefix = str9;
            }
            long j2 = this.ttlInMilliSeconds;
            if (j2 > 0) {
                AGRequest2.ttlInMilliSeconds = j2;
            }
            long j3 = this.updateTimeoutInMilliseconds;
            if (j3 > 0) {
                AGRequest2.updateTimeoutInMilliseconds = j3;
            }
            long j4 = this.minUpdateIntervalInMilliseconds;
            if (j4 > 0) {
                AGRequest2.minUpdateIntervalInMilliseconds = j4;
            }
            long j5 = this.maxUpdateIntervalInMilliseconds;
            if (j5 > 0) {
                AGRequest2.maxUpdateIntervalInMilliseconds = j5;
            }
            int i6 = this.urlXsumMaxLength;
            if (i6 >= 0) {
                AGRequest2.urlXsumMaxLength = i6;
            }
            int i7 = this.bodyXsumMaxLength;
            if (i7 >= 0) {
                int i8 = head + 33;
                delete = i8 % 128;
                int i9 = i8 % 2;
                AGRequest2.bodyXsumMaxLength = i7;
            }
            UriFilter uriFilter4 = this.uriFilter2;
            if (uriFilter4 != null) {
                int i10 = head + 115;
                delete = i10 % 128;
                if (i10 % 2 == 0) {
                    AGRequest2.uriFilter2 = uriFilter4;
                } else {
                    AGRequest2.uriFilter2 = uriFilter4;
                    throw new NullPointerException("hashCode");
                }
            }
            UriFilter uriFilter5 = this.uriBypass2;
            if (uriFilter5 != null) {
                AGRequest2.uriBypass2 = uriFilter5;
            }
            Boolean bool = this.storePersistentID;
            if (bool != null) {
                AGRequest2.storePersistentID = bool;
            }
            Boolean bool2 = this.cvmEnabled;
            if (bool2 != null) {
                AGRequest2.cvmEnabled = bool2;
            }
            Integer num = this.debugLevel;
            if (num != null) {
                int i11 = head + 57;
                delete = i11 % 128;
                int i12 = i11 % 2;
                AGRequest2.getMethod(num);
            }
            Boolean bool3 = this.nativeHeaderCachingEnabled;
            if (bool3 != null) {
                AGRequest2.AGRequest(bool3.booleanValue());
            }
            Integer num2 = this.support;
            if (num2 != null) {
                int i13 = head + 77;
                delete = i13 % 128;
                if (i13 % 2 == 0) {
                    AGRequest2.getBody(num2.intValue());
                } else {
                    AGRequest2.getBody(num2.intValue());
                    throw new NullPointerException("hashCode");
                }
            }
            Integer num3 = this.rtd;
            if (num3 != null) {
                AGRequest2.getHeaders(num3.intValue());
            }
            if (!(AGRequest2.version == null || AGRequest2.id == null || AGRequest2.kernelId == null || AGRequest2.kernel == null || AGRequest2.uriFilter == null || AGRequest2.updateURL == null)) {
                int i14 = head + 119;
                int i15 = i14 % 128;
                delete = i15;
                int i16 = i14 % 2;
                if (!(AGRequest2.updateURLMap == null || (str = AGRequest2.updateHeaderName) == null)) {
                    int i17 = i15 + 35;
                    int i18 = i17 % 128;
                    head = i18;
                    if (i17 % 2 != 0 ? AGRequest2.nativeSignalHeaderPrefix != null : AGRequest2.nativeSignalHeaderPrefix != null) {
                        if (!(-1 == AGRequest2.ttlInMilliSeconds || -1 == AGRequest2.updateTimeoutInMilliseconds || -1 == AGRequest2.minUpdateIntervalInMilliseconds || -1 == AGRequest2.maxUpdateIntervalInMilliseconds || -1 == AGRequest2.urlXsumMaxLength || -1 == AGRequest2.bodyXsumMaxLength || AGRequest2.uriFilter2 == null)) {
                            int i19 = i18 + 91;
                            delete = i19 % 128;
                            if (i19 % 2 == 0 ? AGRequest2.uriBypass2 != null : AGRequest2.uriBypass2 != null) {
                                if (str.isEmpty()) {
                                    throw new IllegalArgumentException(getUrl(1694036400 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) - 794243152, Color.blue(0) - 55, (short) (-1 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (byte) (ViewConfiguration.getEdgeSlop() >> 16)).intern());
                                } else if (!AGRequest2.nativeSignalHeaderPrefix.isEmpty()) {
                                    if (!(this.cvmCodeMap == null || this.cvmDigestMap == null)) {
                                        if (AGRequest2.cvmCodeMap == null) {
                                            AGRequest2.cvmCodeMap = new HashMap();
                                        }
                                        if (AGRequest2.cvmDigestMap == null) {
                                            AGRequest2.cvmDigestMap = new HashMap();
                                        }
                                        for (String str10 : this.cvmCodeMap.keySet()) {
                                            int i20 = head + 19;
                                            delete = i20 % 128;
                                            int i21 = i20 % 2;
                                            try {
                                                String str11 = this.cvmCodeMap.get(str10);
                                                String str12 = this.cvmDigestMap.get(str10);
                                                String str13 = AGRequest2.cvmDigestMap.get(str10);
                                                if (str13 == null || !str13.equalsIgnoreCase(str12)) {
                                                    AGRequest2.cvmCodeMap.put(str10, str11);
                                                    AGRequest2.cvmDigestMap.put(str10, str12);
                                                }
                                            } catch (Exception unused) {
                                                checkCertificates.getMethod(log.getBody.getHeaders, getState.getHeaders.FraudScore);
                                            }
                                        }
                                    }
                                    return AGRequest2;
                                } else {
                                    throw new IllegalArgumentException(getBody((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 33, 43 - TextUtils.indexOf("", ""), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 25627)).intern());
                                }
                            }
                        }
                    }
                }
            }
            throw new IllegalArgumentException(getBody((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 33, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44949)).intern());
        }
        throw new IllegalArgumentException(getUrl(1694036401 - Color.blue(0), TextUtils.indexOf("", "") - 794243189, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 55, (short) (TextUtils.lastIndexOf("", '0') + 1), (byte) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
    }

    public void AGRequest(boolean z) {
        int i2 = head + 5;
        delete = i2 % 128;
        int i3 = i2 % 2;
        this.nativeHeaderCachingEnabled = Boolean.valueOf(z);
        int i4 = delete + 57;
        head = i4 % 128;
        int i5 = i4 % 2;
    }

    public void getBody(int i2) {
        int i3 = delete + 121;
        head = i3 % 128;
        int i4 = i3 % 2;
        this.support = Integer.valueOf(i2);
        int i5 = delete + 83;
        head = i5 % 128;
        int i6 = i5 % 2;
    }

    public static Config getMethod(String str, Config config) {
        Config body = getBody(new JSONObject(str), config);
        int i2 = delete + 99;
        head = i2 % 128;
        int i3 = i2 % 2;
        return body;
    }

    static int getBody(Integer[] numArr, Integer[] numArr2) {
        int i2;
        int intValue;
        int max = Math.max(numArr.length, numArr2.length);
        for (int i3 = 0; i3 < max; i3++) {
            if (i3 < numArr.length) {
                i2 = numArr[i3].intValue();
            } else {
                i2 = 0;
            }
            if (i3 >= numArr2.length) {
                intValue = 0;
            } else {
                int i4 = delete + 73;
                head = i4 % 128;
                int i5 = i4 % 2;
                intValue = numArr2[i3].intValue();
                int i6 = delete + 87;
                head = i6 % 128;
                int i7 = i6 % 2;
            }
            if (i2 > intValue) {
                return 1;
            }
            if (i2 < intValue) {
                int i8 = head + 25;
                delete = i8 % 128;
                int i9 = i8 % 2;
                return -1;
            }
        }
        return 0;
    }

    private static JSONObject getHeaders(JSONObject jSONObject, String str) {
        String[] split = str.split(getUrl((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1694036352, TextUtils.getOffsetAfter("", 0) - 794243063, -16777271 - Color.rgb(0, 0, 0), (short) (TextUtils.indexOf((CharSequence) "", '0') + 1), (byte) (-16777216 - Color.rgb(0, 0, 0))).intern());
        if (split.length == 3) {
            byte[] decode = Base64.decode(split[0], 10);
            byte[] decode2 = Base64.decode(split[1], 10);
            rm rmVar = getUrl.get(split[2]);
            if (rmVar != null) {
                String str2 = new String(rmVar.AGRequest(decode, decode2), Charset.forName(getUrl(1694036508 - PhoneNumberUtils.toaFromString(""), (ViewConfiguration.getEdgeSlop() >> 16) - 794243062, -54 - (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)), (short) (-1 - TextUtils.indexOf((CharSequence) "", '0')), (byte) ((SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)) - 1)).intern()));
                checkCertificates.AGRequest(log.getBody.AGRequest, new StringBuilder().append(getBody(View.MeasureSpec.getMode(0) + 160, TextUtils.getOffsetBefore("", 0) + 20, (char) (57852 - Color.argb(0, 0, 0, 0))).intern()).append(str2).toString());
                try {
                    JSONObject jSONObject2 = new JSONObject(str2);
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        int i2 = head + 105;
                        delete = i2 % 128;
                        if (i2 % 2 == 0) {
                            String next = keys.next();
                            jSONObject.accumulate(next, jSONObject2.get(next));
                        } else {
                            String next2 = keys.next();
                            jSONObject.accumulate(next2, jSONObject2.get(next2));
                            throw new NullPointerException("hashCode");
                        }
                    }
                } catch (JSONException unused) {
                    checkCertificates.getMethod(log.getBody.getHeaders, getState.getHeaders.log);
                }
                return jSONObject;
            }
            int i3 = head + 119;
            delete = i3 % 128;
            int i4 = i3 % 2;
            checkCertificates.getMethod(log.getBody.getHeaders, getState.getHeaders.APIGuard$InitializationCallback);
            int i5 = delete + 3;
            head = i5 % 128;
            if (i5 % 2 != 0) {
                return jSONObject;
            }
            throw new NullPointerException("hashCode");
        }
        checkCertificates.getMethod(log.getBody.getHeaders, getState.getHeaders.updateKernel);
        return jSONObject;
    }

    static Map<String, String> getUrl(JSONObject jSONObject, String str) {
        char c2;
        char c3;
        char c4;
        int i2 = head;
        int i3 = i2 + 65;
        delete = i3 % 128;
        if (i3 % 2 == 0 ? jSONObject == null : jSONObject == null) {
            int i4 = i2 + 81;
            delete = i4 % 128;
            if (i4 % 2 == 0) {
                c2 = 5;
            } else {
                c2 = '^';
            }
            if (c2 != 5) {
                return Collections.emptyMap();
            }
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                c3 = '0';
            } else {
                c3 = '\b';
            }
            if (c3 == '0') {
                return hashMap;
            }
            String next = keys.next();
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject == null) {
                    c4 = '!';
                } else {
                    c4 = ' ';
                }
                if (c4 == ' ') {
                    hashMap.put(next, optJSONObject.get(str));
                }
            } catch (JSONException unused) {
                checkCertificates.getMethod(log.getBody.getHeaders, getState.getHeaders.FraudScore);
            }
        }
    }

    private static Config getBody(JSONObject jSONObject, Config config) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Map<String, String> map;
        UriFilter uriFilter3;
        UriFilter uriFilter4;
        Map<String, String> map2;
        Map<String, String> map3;
        Boolean bool;
        Integer valueOf;
        JSONObject optJSONObject;
        JSONObject jSONObject2;
        Object obj;
        JSONObject jSONObject3 = jSONObject;
        int i2 = head + 9;
        delete = i2 % 128;
        int i3 = i2 % 2;
        Config requestHeaders = config.getRequestHeaders();
        String optString = jSONObject3.optString(getUrl(61929 - AndroidCharacter.getMirror('0'), -794243110 - TextUtils.indexOf((CharSequence) "", '0'), PhoneNumberUtils.toaFromString("") - 184, (short) (ViewConfiguration.getLongPressTimeout() >> 16), (byte) ExpandableListView.getPackedPositionType(0)).intern());
        if (TextUtils.isEmpty(optString)) {
            checkCertificates.getMethod(log.getBody.getHeaders, getState.getHeaders.APIGuard$Callback);
        } else {
            jSONObject3 = getHeaders(jSONObject3, optString);
        }
        String optString2 = jSONObject3.optString(getUrl(1694036412 - (Process.myPid() >> 22), Process.getGidForName("") - 794243106, TextUtils.indexOf("", "") - 55, (short) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1))), (byte) TextUtils.indexOf("", "", 0)).intern());
        if (TextUtils.isEmpty(optString2)) {
            throw new getUrl(getState.AGRequest.getHeaders);
        } else if (getBody(newBuilder(optString2))) {
            com.apiguard3.network.UriFilter uriFilter5 = new com.apiguard3.network.UriFilter(jSONObject3);
            try {
                if (!jSONObject3.has(getUrl(ImageFormat.getBitsPerPixel(0) + 1694036402, -794243015 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -55 - (ViewConfiguration.getLongPressTimeout() >> 16), (short) (Color.rgb(0, 0, 0) + 16777216), (byte) (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    str = null;
                } else {
                    int i4 = head + 29;
                    delete = i4 % 128;
                    if (i4 % 2 == 0 ? !jSONObject3.has(getBody((ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 259, (ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) + 5, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern()) : !jSONObject3.has(getBody((ExpandableListView.getPackedPositionForChild(0, 1) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 1) == 0 ? 0 : -1)) + 5393, 2 - (ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 0)).intern())) {
                        throw new getUrl(getState.AGRequest.head);
                    }
                    str = (String) jSONObject3.get(getUrl((SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 1694036400, TextUtils.indexOf("", "", 0, 0) - 794243015, ExpandableListView.getPackedPositionGroup(0) - 55, (short) (ExpandableListView.getPackedPositionChild(0) + 1), (byte) ((Process.getThreadPriority(0) + 20) >> 6)).intern());
                }
                String intern = getUrl(1694036399 - View.MeasureSpec.getMode(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 794243100, TextUtils.indexOf("", "", 0, 0) - 55, (short) ExpandableListView.getPackedPositionType(0), (byte) (Process.myPid() >> 22)).intern();
                if (jSONObject3.has(intern)) {
                    str2 = (String) jSONObject3.get(intern);
                } else {
                    str2 = null;
                }
                if (!jSONObject3.has(getBody(258 - Color.blue(0), 6 - (Process.myTid() >> 22), (char) ('0' - AndroidCharacter.getMirror('0'))).intern())) {
                    str3 = null;
                } else if (jSONObject3.has(getUrl(Color.green(0) + 1694036401, Color.rgb(0, 0, 0) - 777465799, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 56, (short) ((Process.getThreadPriority(0) + 20) >> 6), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                    str3 = (String) jSONObject3.get(getBody(258 - KeyEvent.getDeadChar(0, 0), 5 - Process.getGidForName(""), (char) ExpandableListView.getPackedPositionType(0)).intern());
                    if (TextUtils.isEmpty(str3)) {
                        throw new getUrl(getState.AGRequest.get);
                    }
                } else {
                    throw new getUrl(getState.AGRequest.post);
                }
                String intern2 = getBody(TextUtils.getTrimmedLength("") + 96, Drawable.resolveOpacity(0, 0) + 11, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 60625)).intern();
                if (jSONObject3.has(intern2)) {
                    str4 = (String) jSONObject3.get(intern2);
                } else {
                    str4 = null;
                }
                if (!jSONObject3.has(getBody((ViewConfiguration.getLongPressTimeout() >> 16) + 249, 9 - Color.alpha(0), (char) (AndroidCharacter.getEastAsianWidth('0') - 4)).intern())) {
                    str5 = null;
                } else {
                    int i5 = head + 9;
                    delete = i5 % 128;
                    int i6 = i5 % 2;
                    str5 = (String) jSONObject3.get(getBody(249 - View.resolveSize(0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 8, (char) (-1 - ExpandableListView.getPackedPositionChild(0))).intern());
                    if (!AGRequest$Builder(str5)) {
                        throw new getUrl(getState.AGRequest.delete);
                    }
                }
                String intern3 = getBody(107 - TextUtils.getOffsetBefore("", 0), View.resolveSize(0, 0) + 16, (char) (AndroidCharacter.getMirror('0') - '0')).intern();
                if (jSONObject3.has(intern3)) {
                    str6 = (String) jSONObject3.get(intern3);
                } else {
                    str6 = null;
                }
                String intern4 = getUrl(View.getDefaultSize(0, 0) + 1694036404, -794243099 - TextUtils.lastIndexOf("", '0', 0), -51 - AndroidCharacter.getEastAsianWidth('0'), (short) (Process.myPid() >> 22), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern();
                if (!jSONObject3.has(intern4)) {
                    str7 = null;
                } else {
                    int i7 = head + 111;
                    delete = i7 % 128;
                    if (i7 % 2 == 0) {
                        obj = jSONObject3.get(intern4);
                    } else {
                        obj = jSONObject3.get(intern4);
                    }
                    str7 = (String) obj;
                }
                Long put = put(jSONObject3);
                Long addHeader2 = addHeader(jSONObject3);
                Long url2 = url(jSONObject3);
                Long AGRequest$Builder2 = AGRequest$Builder(jSONObject3);
                Integer method2 = method(jSONObject3);
                Integer newBuilder2 = newBuilder(jSONObject3);
                if (!jSONObject3.has(getBody(123 - Color.alpha(0), ExpandableListView.getPackedPositionGroup(0) + 12, (char) Drawable.resolveOpacity(0, 0)).intern())) {
                    map = null;
                } else {
                    int i8 = delete + 93;
                    head = i8 % 128;
                    if (i8 % 2 == 0) {
                        jSONObject2 = jSONObject3.getJSONObject(getBody(TextUtils.indexOf("", "") + 52, View.getDefaultSize(0, 1) * 15, (char) ((Process.getThreadPriority(1) >> 62) / 3)).intern());
                    } else {
                        jSONObject2 = jSONObject3.getJSONObject(getBody(TextUtils.indexOf("", "") + 123, View.getDefaultSize(0, 0) + 12, (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern());
                    }
                    map = AGRequest(jSONObject2);
                }
                if (jSONObject3.has(getBody(135 - Color.blue(0), 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (129 - PhoneNumberUtils.toaFromString(""))).intern())) {
                    uriFilter3 = new UriFilter(jSONObject3.optJSONArray(getBody(135 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 10 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (ViewConfiguration.getPressedStateDuration() >> 16)).intern()));
                } else {
                    uriFilter3 = null;
                }
                if (jSONObject3.has(getUrl((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1694036411, TextUtils.getTrimmedLength("") - 794243074, -56 - ExpandableListView.getPackedPositionChild(0), (short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (AndroidCharacter.getEastAsianWidth('0') - 4)).intern())) {
                    uriFilter4 = new UriFilter(jSONObject3.optJSONArray(getUrl(1694036411 - ExpandableListView.getPackedPositionType(0), ImageFormat.getBitsPerPixel(0) - 794243073, -54 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (short) (-1 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1))), (byte) Color.blue(0)).intern()));
                } else {
                    uriFilter4 = null;
                }
                Boolean method3 = getMethod(jSONObject3);
                Boolean headers = getHeaders(jSONObject3);
                if (jSONObject3.has(getBody(AndroidCharacter.getMirror('0') + 'a', 2 - Drawable.resolveOpacity(0, 0), (char) Color.argb(0, 0, 0, 0)).intern()) && (optJSONObject = jSONObject3.optJSONObject(getBody((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 145, (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 1, (char) (4 - AndroidCharacter.getEastAsianWidth('0'))).intern())) != null) {
                    map3 = getUrl(optJSONObject, getBody(148 - (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)), (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)), (char) (2725 - (ViewConfiguration.getTouchSlop() >> 8))).intern());
                    map2 = getUrl(optJSONObject, getUrl(1694036394 - View.MeasureSpec.makeMeasureSpec(0, 0), -794243065 - ExpandableListView.getPackedPositionChild(0), ExpandableListView.getPackedPositionChild(0) - 54, (short) View.resolveSize(0, 0), (byte) View.resolveSize(0, 0)).intern());
                } else {
                    map2 = null;
                    map3 = null;
                }
                Integer url3 = getUrl(jSONObject3);
                if (jSONObject3.has(getBody(View.getDefaultSize(0, 0) + 148, TextUtils.indexOf("", "") + 9, (char) Drawable.resolveOpacity(0, 0)).intern())) {
                    bool = Boolean.valueOf(jSONObject3.optBoolean(getBody(-16777068 - Color.rgb(0, 0, 0), 9 - (ViewConfiguration.getTapTimeout() >> 16), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)))).intern()));
                } else {
                    bool = null;
                }
                Integer body = getBody(jSONObject3);
                if (!jSONObject3.has(getBody(157 - (Process.myPid() >> 22), (ViewConfiguration.getWindowTouchSlop() >> 8) + 3, (char) TextUtils.indexOf("", "", 0, 0)).intern())) {
                    valueOf = null;
                } else {
                    int i9 = head + 121;
                    delete = i9 % 128;
                    int i10 = i9 % 2;
                    valueOf = Integer.valueOf(jSONObject3.getInt(getBody(TextUtils.indexOf("", "", 0) + 157, TextUtils.lastIndexOf("", '0', 0, 0) + 4, (char) (-1 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)))).intern()));
                }
                int i11 = head + 37;
                delete = i11 % 128;
                int i12 = i11 % 2;
                requestHeaders.getMethod(optString2);
                requestHeaders.AGRequest(str2);
                requestHeaders.getUrl(str);
                requestHeaders.getBody(str3);
                requestHeaders.getHeaders(str4);
                requestHeaders.uriFilter = uriFilter5;
                if (str5 != null) {
                    requestHeaders.addHeader(str5);
                }
                if (str6 == null) {
                    str6 = getUrl(1694036382 - View.MeasureSpec.makeMeasureSpec(0, 0), -794243195 - (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) - 55, (short) TextUtils.getOffsetAfter("", 0), (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern();
                }
                requestHeaders.updateHeaderName = str6;
                if (str7 != null) {
                    int i13 = head + 77;
                    delete = i13 % 128;
                    int i14 = i13 % 2;
                    requestHeaders.url(str7);
                }
                if (put.longValue() > 0) {
                    requestHeaders.ttlInMilliSeconds = put.longValue();
                }
                if (addHeader2.longValue() > 0) {
                    requestHeaders.updateTimeoutInMilliseconds = addHeader2.longValue();
                }
                if (url2.longValue() > 0) {
                    requestHeaders.minUpdateIntervalInMilliseconds = url2.longValue();
                }
                if (AGRequest$Builder2.longValue() > 0) {
                    requestHeaders.maxUpdateIntervalInMilliseconds = AGRequest$Builder2.longValue();
                }
                requestHeaders.urlXsumMaxLength = newBuilder2.intValue();
                requestHeaders.bodyXsumMaxLength = method2.intValue();
                if (map != null) {
                    int i15 = head + 123;
                    delete = i15 % 128;
                    int i16 = i15 % 2;
                    requestHeaders.getHeaders(map);
                }
                if (uriFilter3 != null) {
                    requestHeaders.AGRequest(uriFilter3);
                }
                if (uriFilter4 != null) {
                    requestHeaders.getUrl(uriFilter4);
                }
                if (method3 != null) {
                    requestHeaders.storePersistentID = method3;
                }
                if (headers != null) {
                    requestHeaders.cvmEnabled = headers;
                }
                requestHeaders.AGRequest(map3);
                requestHeaders.getMethod(map2);
                if (url3 != null) {
                    requestHeaders.debugLevel = url3;
                }
                if (bool != null) {
                    requestHeaders.AGRequest(bool.booleanValue());
                }
                if (body != null) {
                    requestHeaders.getBody(body.intValue());
                }
                if (valueOf != null) {
                    requestHeaders.getHeaders(valueOf.intValue());
                    int i17 = head + 67;
                    delete = i17 % 128;
                    int i18 = i17 % 2;
                }
                return requestHeaders.getHeaders(config);
            } catch (getUrl e2) {
                throw e2;
            } catch (Exception unused) {
                throw new getUrl(getState.getBody.post);
            }
        } else {
            throw new getUrl(getState.AGRequest.getHeaders);
        }
    }

    private static String getBody(int i2, int i3, char c2) {
        char[] cArr = new char[i3];
        int i4 = 0;
        while (i4 < i3) {
            int i5 = head + 73;
            int i6 = i5 % 128;
            delete = i6;
            int i7 = i5 % 2;
            cArr[i4] = (char) ((int) ((((long) method[i2 + i4]) ^ (((long) i4) * url)) ^ ((long) c2)));
            i4++;
            int i8 = i6 + 23;
            head = i8 % 128;
            int i9 = i8 % 2;
        }
        return new String(cArr);
    }

    private static String getUrl(int i2, int i3, int i4, short s, byte b2) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        StringBuilder sb = new StringBuilder();
        int i9 = AGRequest;
        int i10 = i4 + i9;
        if (i10 == -1) {
            z = true;
            byte[] bArr = AGRequest$Builder;
            if (bArr == null) {
                i10 = (short) (newBuilder[getMethod + i3] + i9);
            } else {
                int i11 = delete + 83;
                head = i11 % 128;
                int i12 = i11 % 2;
                i10 = (byte) (bArr[getMethod + i3] + i9);
            }
        } else {
            int i13 = delete + 113;
            head = i13 % 128;
            int i14 = i13 % 2;
            z = false;
        }
        if (i10 > 0) {
            int i15 = ((i3 + i10) - 2) + getMethod;
            if (!z) {
                i5 = 0;
            } else {
                int i16 = delete + 49;
                head = i16 % 128;
                int i17 = i16 % 2;
                i5 = 1;
            }
            int i18 = i15 + i5;
            char c2 = (char) (i2 + addHeader);
            sb.append(c2);
            int i19 = head + 123;
            delete = i19 % 128;
            int i20 = i19 % 2;
            for (int i21 = 1; i21 < i10; i21++) {
                int i22 = head + 117;
                int i23 = i22 % 128;
                delete = i23;
                if (i22 % 2 == 0 ? AGRequest$Builder != null : AGRequest$Builder != null) {
                    int i24 = i23 + 5;
                    head = i24 % 128;
                    if (i24 % 2 == 0) {
                        i6 = i18 + 41;
                        i8 = c2 / (((byte) (AGRequest$Builder[i18] >>> s)) & b2);
                        c2 = (char) i8;
                        i18 = i6;
                        sb.append(c2);
                    } else {
                        i6 = i18 - 1;
                        i7 = (byte) (AGRequest$Builder[i18] + s);
                    }
                } else {
                    i6 = i18 - 1;
                    i7 = (short) (newBuilder[i18] + s);
                }
                i8 = c2 + (i7 ^ b2);
                c2 = (char) i8;
                i18 = i6;
                sb.append(c2);
            }
        }
        return sb.toString();
    }
}
