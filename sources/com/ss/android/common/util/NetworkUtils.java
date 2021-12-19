package com.ss.android.common.util;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.CookieManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.app.api.l;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.legoImp.NetWorkInjectImpl;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URLConnection;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.params.HttpParams;
import org.json.JSONArray;
import org.json.JSONObject;

public class NetworkUtils {
    private static int isForceHttps = 1;
    private static volatile boolean mAllowKeepAlive = true;
    private static volatile long mLocalTime = -1;
    private static volatile long mServerTime = -1;
    private static c sApiInterceptor;
    private static a sApiLibSelector;
    private static d sCommandListener;
    private static final Object sCookieLock = new Object();
    private static volatile boolean sCookieMgrInited = false;
    private static volatile boolean sHasRebuildSsl = false;
    private static g sMonitorProcessHook;
    private static ArrayList<String> sNoHttpList = new ArrayList<>();
    private static volatile j sServerTimeFromResponse;
    private static String sShareCookieHost;
    private static volatile int sUseDnsMapping = -1;
    private static String sUserAgent = null;

    public interface a {
        static {
            Covode.recordClassIndex(36661);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(36662);
        }

        String a(String str, boolean z);

        void a();

        void a(List<com.ss.android.http.a.b.d> list, boolean z);
    }

    public interface c {
        static {
            Covode.recordClassIndex(36663);
        }

        String a();

        String b();

        List<String> c();

        List<String> d();
    }

    public interface d {
        static {
            Covode.recordClassIndex(36664);
        }

        String a();

        void a(List<String> list);
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public String f59380a;

        static {
            Covode.recordClassIndex(36666);
        }
    }

    public interface g {
        static {
            Covode.recordClassIndex(36667);
        }

        void a(long j2, long j3, String str, String str2, f fVar);

        void a(long j2, long j3, String str, String str2, f fVar, Throwable th);
    }

    public interface i {
        static {
            Covode.recordClassIndex(36669);
        }

        URI a();

        void b();
    }

    public interface j {
        static {
            Covode.recordClassIndex(36670);
        }

        long a(String str);
    }

    public static int com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_LogLancet_v(String str, String str2) {
        return 0;
    }

    public static int com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    public static String com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_network_NetworkUtilsLancet_filterUrl(String str) {
        return str;
    }

    public static void com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_ssretrofitchain_ServerTimeLancet_handleTimeStampFromResponse(String str) {
    }

    public static String filterUrl(String str) {
        return com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_network_NetworkUtilsLancet_filterUrl(str);
    }

    public static int getServerTime() {
        return com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_ssretrofitchain_ServerTimeLancet_getServerTime();
    }

    public static void handleTimeStampFromResponse(String str) {
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_ssretrofitchain_ServerTimeLancet_handleTimeStampFromResponse(str);
    }

    public enum h {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        
        final int nativeInt;

        public final int getValue() {
            return this.nativeInt;
        }

        static {
            Covode.recordClassIndex(36668);
        }

        private h(int i2) {
            this.nativeInt = i2;
        }
    }

    public static boolean getAllowKeepAlive() {
        return mAllowKeepAlive;
    }

    public static c getApiRequestInterceptor() {
        return sApiInterceptor;
    }

    public static d getCommandListener() {
        return sCommandListener;
    }

    public static boolean getHasRebuildSsl() {
        return sHasRebuildSsl;
    }

    public static int getIsForceHttps() {
        return isForceHttps;
    }

    public static String getShareCookieHost() {
        return sShareCookieHost;
    }

    public static String executeGet(int i2, String str) {
        return executeGet(0, i2, str, true, true);
    }

    public static String executeGet(int i2, String str, int i3, int i4) {
        return executeGet(0, i2, str, true, true, (List<com.ss.android.http.a.a>) null, (com.ss.android.http.a.b.e) null, true);
    }

    public static String executeGet(int i2, String str, boolean z) {
        return executeGet(0, i2, str, z, true);
    }

    public static String executeGet(int i2, String str, boolean z, boolean z2) {
        return executeGet(0, i2, str, z, z2, (List<com.ss.android.http.a.a>) null, (com.ss.android.http.a.b.e) null, true);
    }

    public static String executeGet(int i2, String str, boolean z, boolean z2, List<com.ss.android.http.a.a> list, com.ss.android.http.a.b.e eVar, boolean z3) {
        return executeGet(0, i2, str, z, z2, list, eVar, z3);
    }

    public static String executeGet(int i2, String str, List<com.ss.android.http.a.b.d> list) {
        return executeGet(0, i2, str, true, true, list);
    }

    public static String executeGet(int i2, String str, int i3, int i4, List<com.ss.android.http.a.b.d> list) {
        return executeGet(0, i2, str, true, true, null, null, true, list);
    }

    public static String executeGet(int i2, String str, boolean z, List<com.ss.android.http.a.b.d> list) {
        return executeGet(0, i2, str, z, true, list);
    }

    public static String executeGet(int i2, String str, boolean z, boolean z2, List<com.ss.android.http.a.b.d> list) {
        return executeGet(0, i2, str, z, z2, null, null, true, list);
    }

    public static String executeGet(int i2, String str, boolean z, boolean z2, List<com.ss.android.http.a.a> list, com.ss.android.http.a.b.e eVar, boolean z3, List<com.ss.android.http.a.b.d> list2) {
        return executeGet(0, i2, str, z, z2, list, eVar, z3, list2);
    }

    public static String executeGet(int i2, int i3, String str, boolean z, boolean z2, List<com.ss.android.http.a.a> list, com.ss.android.http.a.b.e eVar, boolean z3, List<com.ss.android.http.a.b.d> list2) {
        try {
            return executeGetRetry(i2, i3, addGetRetryCountParam(filterUrl(str), "no_retry"), z, list, eVar, z3, list2, z2);
        } catch (Exception e2) {
            if (TextUtils.isEmpty(str) || !str.startsWith("https") || (!(e2 instanceof SSLException) && !(e2 instanceof GeneralSecurityException))) {
                return executeGetRetry(i2, i3, addGetRetryCountParam(filterUrl(str), "first_retry"), z, list, eVar, z3, list2, z2);
            }
            if (!isHitNoHttpList(str)) {
                return executeGetRetry(i2, i3, addGetRetryCountParam(str, "retry_http"), z, list, eVar, z3, list2, z2);
            }
            return executeGetRetry(i2, i3, addGetRetryCountParam(filterUrl(str), "first_retry"), z, list, eVar, z3, list2, z2);
        }
    }

    public static String executePost(int i2, String str, List<com.ss.android.http.a.b.d> list, com.ss.android.common.b.c[] cVarArr) {
        return executePost(0, i2, str, list, cVarArr);
    }

    public static String executePost(String str, JSONObject jSONObject, String str2, List<com.ss.android.http.a.a> list) {
        byte[] bytes;
        if (str2 == null || !str2.startsWith("application/json")) {
            ArrayList arrayList = new ArrayList();
            jsonObjectToBasicNameValuePairs(arrayList, jSONObject, "");
            return executePost(0, 0, str, arrayList, (com.ss.android.common.b.c[]) null, list);
        }
        if (jSONObject == null) {
            bytes = null;
        } else {
            bytes = jSONObject.toString().getBytes("UTF-8");
        }
        return executePost(-1, str, bytes, e.GZIP, str2, list);
    }

    public static String executePost(int i2, String str, byte[] bArr, e eVar, String str2) {
        return executePost(i2, str, bArr, eVar, str2, (List<com.ss.android.http.a.a>) null);
    }

    public static String executePost(int i2, String str, byte[] bArr, e eVar, String str2, List<com.ss.android.http.a.a> list) {
        if (str == null) {
            return null;
        }
        return execute(UGCMonitor.TYPE_POST, i2, addCommonParams(str, true), bArr, eVar, str2, list);
    }

    public static boolean getUseDnsMapping() {
        if (sUseDnsMapping > 0) {
            return true;
        }
        return false;
    }

    public static String getUserAgent() {
        tryInitUserAgent();
        return sUserAgent;
    }

    public static b getApiProcessHook() {
        return NetWorkInjectImpl.d().b();
    }

    public static Context getAppContext() {
        return NetWorkInjectImpl.d().a();
    }

    public static int com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_ssretrofitchain_ServerTimeLancet_getServerTime() {
        long currentTimeMillis = System.currentTimeMillis();
        if (l.f66628a > 0) {
            currentTimeMillis = (l.f66628a + currentTimeMillis) - l.f66629b;
        }
        return (int) (currentTimeMillis / 1000);
    }

    public enum e {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        
        final int nativeInt;

        static {
            Covode.recordClassIndex(36665);
        }

        private e(int i2) {
            this.nativeInt = i2;
        }
    }

    static {
        Covode.recordClassIndex(36659);
    }

    public static int NetworkUtils__getServerTime$___twin___() {
        long currentTimeMillis = System.currentTimeMillis();
        if (mServerTime > 0) {
            currentTimeMillis = (mServerTime + System.currentTimeMillis()) - mLocalTime;
        }
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_LogLancet_d("NetworkUtils", "getServerTime = ".concat(String.valueOf(currentTimeMillis)));
        return (int) (currentTimeMillis / 1000);
    }

    public static CookieManager tryNecessaryInit() {
        MethodCollector.i(3676);
        synchronized (sCookieLock) {
            try {
                if (!sCookieMgrInited) {
                    try {
                        Thread.sleep(1500);
                    } catch (Exception unused) {
                    }
                    sCookieMgrInited = true;
                }
            } finally {
                MethodCollector.o(3676);
            }
        }
        NetWorkInjectImpl.d().b().a();
        CookieManager instance = CookieManager.getInstance();
        if (!instance.acceptCookie()) {
            instance.setAcceptCookie(true);
        }
        return instance;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.common.util.NetworkUtils$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f59378a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 36660(0x8f34, float:5.1372E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.common.util.NetworkUtils$h[] r0 = com.ss.android.common.util.NetworkUtils.h.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.common.util.NetworkUtils.AnonymousClass1.f59378a = r2
                com.ss.android.common.util.NetworkUtils$h r0 = com.ss.android.common.util.NetworkUtils.h.WIFI     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.common.util.NetworkUtils.AnonymousClass1.f59378a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.common.util.NetworkUtils$h r0 = com.ss.android.common.util.NetworkUtils.h.MOBILE_2G     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.android.common.util.NetworkUtils.AnonymousClass1.f59378a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.common.util.NetworkUtils$h r0 = com.ss.android.common.util.NetworkUtils.h.MOBILE_3G     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.android.common.util.NetworkUtils.AnonymousClass1.f59378a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.common.util.NetworkUtils$h r0 = com.ss.android.common.util.NetworkUtils.h.MOBILE_4G     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.ss.android.common.util.NetworkUtils.AnonymousClass1.f59378a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.ss.android.common.util.NetworkUtils$h r0 = com.ss.android.common.util.NetworkUtils.h.MOBILE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.NetworkUtils.AnonymousClass1.<clinit>():void");
        }
    }

    public static synchronized void tryInitUserAgent() {
        synchronized (NetworkUtils.class) {
            MethodCollector.i(3952);
            if (sUserAgent != null) {
                MethodCollector.o(3952);
                return;
            }
            String c2 = NetWorkInjectImpl.d().c();
            if (c2 != null) {
                try {
                    char[] charArray = c2.toCharArray();
                    int length = charArray.length;
                    boolean z = false;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (charArray[i2] < ' ' || charArray[i2] > '~') {
                            charArray[i2] = '?';
                            z = true;
                        }
                    }
                    if (z) {
                        c2 = new String(charArray);
                    }
                } catch (Exception unused) {
                }
            }
            sUserAgent = c2;
            MethodCollector.o(3952);
        }
    }

    public static void setAllowKeepAlive(boolean z) {
        mAllowKeepAlive = z;
    }

    public static void setApiLibrarySelector(a aVar) {
        sApiLibSelector = aVar;
    }

    public static void setApiRequestInterceptor(c cVar) {
        sApiInterceptor = cVar;
    }

    public static void setCommandListener(d dVar) {
        sCommandListener = dVar;
    }

    public static void setHasRebuildSsl(boolean z) {
        sHasRebuildSsl = z;
    }

    public static void setIsForceHttps(int i2) {
        isForceHttps = i2;
    }

    public static void setMonitorProcessHook(g gVar) {
        sMonitorProcessHook = gVar;
    }

    public static void setNoHttpList(ArrayList<String> arrayList) {
        sNoHttpList = arrayList;
    }

    public static void setServerTimeFromResponse(j jVar) {
        sServerTimeFromResponse = jVar;
    }

    public static void setShareCookieHost(String str) {
        sShareCookieHost = str;
    }

    public static void setUseDnsMapping(int i2) {
        sUseDnsMapping = i2;
    }

    public static void safeClose(Closeable closeable) {
        safeClose(closeable, null);
    }

    public static String NetworkUtils__filterUrl$___twin___(String str) {
        c cVar;
        if (!TextUtils.isEmpty(str) && (cVar = sApiInterceptor) != null) {
            return cVar.a();
        }
        return str;
    }

    public static Context com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public static NetworkInfo com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public static String getNetworkAccessType(Context context) {
        return getNetworkAccessType(com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1(context));
    }

    public static String getNetworkOperatorCode(Context context) {
        try {
            return ((TelephonyManager) com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "phone")).getNetworkOperator();
        } catch (Exception unused) {
            return "unkown";
        }
    }

    public static List<String> getShareCookieHostList(String str) {
        c cVar = sApiInterceptor;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public static void setTimeout(URLConnection uRLConnection) {
        if (uRLConnection != null) {
            uRLConnection.setConnectTimeout(15000);
            uRLConnection.setReadTimeout(15000);
        }
    }

    public static h com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1(Context context) {
        if (com.ss.android.ugc.aweme.lancet.j.f107228g != h.NONE && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107228g;
        }
        h networkType = getNetworkType(context);
        com.ss.android.ugc.aweme.lancet.j.f107228g = networkType;
        return networkType;
    }

    public static String getEtag(com.ss.android.http.a.b.e eVar) {
        com.ss.android.http.a.a b2;
        if (eVar == null || (b2 = eVar.b("ETag")) == null) {
            return null;
        }
        return b2.b();
    }

    public static String getLastModified(com.ss.android.http.a.b.e eVar) {
        com.ss.android.http.a.a b2;
        if (eVar == null || (b2 = eVar.b("Last-Modified")) == null) {
            return null;
        }
        return b2.b();
    }

    public static boolean isMobile(Context context) {
        h com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1 = com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1(context);
        if (h.MOBILE_2G == com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1 || h.MOBILE_3G == com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1 || h.MOBILE_4G == com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1 || h.MOBILE == com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1) {
            return true;
        }
        return false;
    }

    public static boolean isNetworkAvailable(Context context) {
        try {
            NetworkInfo com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo = com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo((ConnectivityManager) com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "connectivity"));
            if (com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo == null || !com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    public static boolean isWifi(Context context) {
        try {
            NetworkInfo com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo = com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo((ConnectivityManager) com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "connectivity"));
            if (com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo != null) {
                if (com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo.isAvailable()) {
                    if (1 == com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo.getType()) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void setUserAgent(HttpParams httpParams) {
        tryInitUserAgent();
        String str = sUserAgent;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (httpParams != null) {
            httpParams.setParameter("http.useragent", str);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static boolean testIsSSBinary(String str) {
        int indexOf;
        if (str != null && (indexOf = str.indexOf("application/octet-stream")) >= 0 && str.indexOf("ssmix=", indexOf + 24) > 0) {
            return true;
        }
        return false;
    }

    public static int com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_telephony_TelephonyManagerLancet_getNetworkType(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT < 29) {
            return telephonyManager.getNetworkType();
        }
        if (!com.ss.android.ugc.aweme.lancet.d.a.f107198a.getAndSet(true)) {
            com.ss.android.ugc.aweme.lancet.d.a.a().a();
        }
        int i2 = com.ss.android.ugc.aweme.lancet.d.a.a().f107202b.get();
        if (com.ss.android.ugc.aweme.lancet.d.a.f107200c || i2 != -1) {
            return i2;
        }
        return 0;
    }

    public static String getNetworkAccessType(h hVar) {
        try {
            int i2 = AnonymousClass1.f59378a[hVar.ordinal()];
            if (i2 == 1) {
                return "wifi";
            }
            if (i2 == 2) {
                return "2g";
            }
            if (i2 == 3) {
                return "3g";
            }
            if (i2 == 4) {
                return "4g";
            }
            if (i2 != 5) {
                return "";
            }
            return "mobile";
        } catch (Exception unused) {
            return "";
        }
    }

    private static boolean isHitNoHttpList(String str) {
        ArrayList<String> arrayList;
        if (isForceHttps == 1) {
            return true;
        }
        if (!TextUtils.isEmpty(str) && (arrayList = sNoHttpList) != null && !arrayList.isEmpty()) {
            Iterator<String> it = sNoHttpList.iterator();
            while (it.hasNext()) {
                if (str.contains(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Pair<String, String> parseContentType(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        com.ss.android.http.a.b[] c2 = new com.ss.android.http.a.b.a("Content-Type", str).c();
        if (c2.length == 0) {
            return null;
        }
        int i2 = 0;
        com.ss.android.http.a.b bVar = c2[0];
        String a2 = bVar.a();
        com.ss.android.http.a.c[] c3 = bVar.c();
        if (c3 != null) {
            int length = c3.length;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                com.ss.android.http.a.c cVar = c3[i2];
                if ("charset".equalsIgnoreCase(cVar.a())) {
                    str2 = cVar.b();
                    break;
                }
                i2++;
            }
        }
        return new Pair<>(a2, str2);
    }

    public static void NetworkUtils__handleTimeStampFromResponse$___twin___(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (sServerTimeFromResponse != null) {
                long a2 = sServerTimeFromResponse.a(str);
                if (a2 > 0) {
                    mServerTime = a2;
                    mLocalTime = System.currentTimeMillis();
                    return;
                }
                return;
            }
            try {
                long optLong = ((JSONObject) new JSONObject(str).get("extra")).optLong("now", -1);
                com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_LogLancet_d("NetworkUtils", "now = ".concat(String.valueOf(optLong)));
                if (optLong >= 0) {
                    mServerTime = optLong;
                    mLocalTime = System.currentTimeMillis();
                }
            } catch (Exception unused) {
            }
        }
    }

    public static boolean com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(4096);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(4096);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(4096);
        return delete;
    }

    public static long extractMaxAge(com.ss.android.http.a.b.e eVar) {
        com.ss.android.http.a.a b2;
        if (eVar == null || (b2 = eVar.b("Cache-Control")) == null) {
            return -1;
        }
        try {
            com.ss.android.http.a.b[] c2 = b2.c();
            if (c2 != null) {
                for (com.ss.android.http.a.b bVar : c2) {
                    if ("max-age".equals(bVar.a())) {
                        String b3 = bVar.b();
                        if (b3 != null) {
                            return Long.parseLong(b3);
                        }
                        return -1;
                    }
                }
            }
        } catch (Exception e2) {
            com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_LogLancet_w("NetworkUtils", "extract max-age exception: ".concat(String.valueOf(e2)));
        }
        return -1;
    }

    public static h getNetworkType(Context context) {
        try {
            NetworkInfo com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo = com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo((ConnectivityManager) com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "connectivity"));
            if (com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo == null || !com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo.isAvailable()) {
                return h.NONE;
            }
            int type = com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo.getType();
            if (1 == type) {
                return h.WIFI;
            }
            if (type != 0) {
                return h.MOBILE;
            }
            switch (com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_telephony_TelephonyManagerLancet_getNetworkType((TelephonyManager) com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "phone"))) {
                case 1:
                case 2:
                case 4:
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    return h.MOBILE_2G;
                case 3:
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                case ABRConfig.ABR_SELECT_SCENE:
                case 15:
                    return h.MOBILE_3G;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    return h.MOBILE_4G;
                default:
                    return h.MOBILE;
            }
        } catch (Throwable unused) {
            return h.MOBILE;
        }
    }

    public static String addCommonParams(String str, boolean z) {
        return NetWorkInjectImpl.d().b().a(str, z);
    }

    public static List<String> getShareCookie(CookieManager cookieManager, String str) {
        c cVar = sApiInterceptor;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    private static void putCommonParams(List<com.ss.android.http.a.b.d> list, boolean z) {
        NetWorkInjectImpl.d().b().a(list, z);
    }

    private static String addGetRetryCountParam(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        g gVar = new g(str);
        gVar.a("retry_type", str2);
        return gVar.toString();
    }

    private static List<com.ss.android.http.a.b.d> addPostRetryCountParam(List<com.ss.android.http.a.b.d> list, String str) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(new com.ss.android.http.a.b.d("retry_type", str));
        return list;
    }

    public static byte[] downloadFile(int i2, String str) {
        com.ss.android.common.b.a aVar = com.bytedance.ies.b.b.a.f31923a;
        if (aVar != null) {
            return aVar.a(i2, str);
        }
        return null;
    }

    private static String joinCommonParams(String str, List<com.ss.android.http.a.b.d> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        sb.append(com.ss.android.http.a.a.a.a.a(list, "UTF-8"));
        return sb.toString();
    }

    private static void safeClose(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                if (str != null) {
                    com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_LogLancet_d("NetworkUtils", str + " " + e2);
                }
            }
        }
    }

    public static Object com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(3997);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(3997);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static String tryDnsMapping(String str, String[] strArr) {
        h com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1;
        c cVar;
        if (sUseDnsMapping <= 0 || strArr == null || strArr.length <= 0 || ((str != null && str.startsWith("https://")) || NetWorkInjectImpl.d().a() == null || (com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1 = com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1(com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(NetWorkInjectImpl.d().a()))) == null)) {
            return str;
        }
        int i2 = AnonymousClass1.f59378a[com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1.ordinal()];
        int i3 = 4;
        if (i2 == 1) {
            i3 = 1;
        } else if (i2 != 2) {
            if (i2 == 3 || i2 == 4) {
                i3 = 2;
            } else if (i2 != 5) {
                i3 = 0;
            }
        }
        if (!((sUseDnsMapping & i3) == 0 || (cVar = sApiInterceptor) == null)) {
            String b2 = cVar.b();
            if (!TextUtils.isEmpty(b2)) {
                return b2;
            }
            strArr[0] = null;
            return str;
        }
        return str;
    }

    public static String executeGet(int i2, int i3, String str) {
        return executeGet(i2, i3, str, true, true);
    }

    public static void handleApiOk(String str, long j2, f fVar) {
        NetWorkInjectImpl.d();
        TextUtils.isEmpty(str);
    }

    public static void addCacheValidationHeaders(List<com.ss.android.http.a.a> list, String str, String str2) {
        if (list != null) {
            if (!TextUtils.isEmpty(str)) {
                list.add(new com.ss.android.http.a.b.a("If-None-Match", str));
            }
            if (!TextUtils.isEmpty(str2)) {
                list.add(new com.ss.android.http.a.b.a("If-Modified-Since", str2));
            }
        }
    }

    private static String decodeSSBinary(byte[] bArr, int i2, String str) {
        if (bArr == null || i2 <= 0) {
            return null;
        }
        byte[] bArr2 = {-99, -114, Byte.MAX_VALUE, 90};
        int i3 = 0;
        do {
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3 % 4]);
            i3++;
        } while (i3 < i2);
        return new String(bArr, 0, i2, str);
    }

    private static byte[] getBytes(InputStream inputStream, long j2, String str) {
        MethodCollector.i(1258);
        if (j2 <= 2147483647L) {
            int i2 = (int) j2;
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i3, i2 - i3);
                if (read < 0) {
                    break;
                }
                i3 += read;
            }
            if (i3 >= i2) {
                inputStream.close();
                MethodCollector.o(1258);
                return bArr;
            }
            IOException iOException = new IOException("Could not completely read file ".concat(String.valueOf(str)));
            MethodCollector.o(1258);
            throw iOException;
        }
        IOException iOException2 = new IOException("File is too large: ".concat(String.valueOf(str)));
        MethodCollector.o(1258);
        throw iOException2;
    }

    private static void jsonObjectToBasicNameValuePairs(List<com.ss.android.http.a.b.d> list, JSONObject jSONObject, String str) {
        String obj;
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String str2 = TextUtils.isEmpty(str) ? next : str + "[" + next + "]";
                Object obj2 = jSONObject.get(next);
                if (obj2 instanceof JSONObject) {
                    jsonObjectToBasicNameValuePairs(list, (JSONObject) obj2, str2);
                } else if (obj2 instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj2;
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        jsonObjectToBasicNameValuePairs(list, jSONArray.getJSONObject(i2), str2);
                    }
                } else {
                    if (obj2 == null) {
                        obj = "";
                    } else {
                        obj = obj2.toString();
                    }
                    list.add(new com.ss.android.http.a.b.d(str2, obj));
                }
            }
        }
    }

    public static byte[] stream2ByteArray(int i2, InputStream inputStream, long j2) {
        int i3;
        long j3 = j2;
        MethodCollector.i(4030);
        if (inputStream == null) {
            MethodCollector.o(4030);
            return null;
        } else if (j3 > 2147483647L) {
            try {
                com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_LogLancet_w("NetworkUtils", "HTTP entity too large to be buffered in memory");
                return null;
            } finally {
                inputStream.close();
                MethodCollector.o(4030);
            }
        } else {
            if (j3 < 0) {
                j3 = 4096;
            } else if (j3 > ((long) i2)) {
                com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_LogLancet_w("NetworkUtils", "entity length exceed given maxLength: " + i2 + " " + j3);
                inputStream.close();
                MethodCollector.o(4030);
                return null;
            }
            com.ss.android.http.a.d.a aVar = new com.ss.android.http.a.d.a((int) j3);
            byte[] bArr = new byte[4096];
            int i4 = 0;
            do {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    byte[] bArr2 = new byte[aVar.f59539b];
                    if (aVar.f59539b > 0) {
                        System.arraycopy(aVar.f59538a, 0, bArr2, 0, aVar.f59539b);
                    }
                    inputStream.close();
                    MethodCollector.o(4030);
                    return bArr2;
                } else if (read < 0 || (i3 = read + 0) < 0 || i3 > 4096) {
                    IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
                    MethodCollector.o(4030);
                    throw indexOutOfBoundsException;
                } else {
                    if (read != 0) {
                        int i5 = aVar.f59539b + read;
                        if (i5 > aVar.f59538a.length) {
                            byte[] bArr3 = new byte[Math.max(aVar.f59538a.length << 1, i5)];
                            System.arraycopy(aVar.f59538a, 0, bArr3, 0, aVar.f59539b);
                            aVar.f59538a = bArr3;
                        }
                        System.arraycopy(bArr, 0, aVar.f59538a, aVar.f59539b, read);
                        aVar.f59539b = i5;
                    }
                    i4 += read;
                }
            } while (i4 <= i2);
            com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_LogLancet_w("NetworkUtils", "entity length did exceed given maxLength");
            inputStream.close();
            MethodCollector.o(4030);
            return null;
        }
    }

    public static String executePost(int i2, String str, com.ss.android.common.b.a.a aVar) {
        return executePost(0, i2, str, aVar, (com.ss.android.common.b.c[]) null);
    }

    public static String executePost(int i2, String str, List<com.ss.android.http.a.b.d> list) {
        return executePost(0, i2, str, list, (com.ss.android.common.b.c[]) null);
    }

    public static String executePost(int i2, int i3, String str, com.ss.android.common.b.a.a aVar) {
        return executePost(i2, i3, str, aVar, (com.ss.android.common.b.c[]) null);
    }

    public static String executePost(int i2, int i3, String str, List<com.ss.android.http.a.b.d> list) {
        return executePost(i2, i3, str, list, (com.ss.android.common.b.c[]) null);
    }

    public static void handleApiError(String str, Throwable th, long j2, f fVar) {
        if (!TextUtils.isEmpty(str) && th != null) {
            NetWorkInjectImpl.d();
        }
    }

    public static String executeGet(int i2, int i3, String str, List<com.ss.android.http.a.b.d> list) {
        return executeGet(i2, i3, str, true, true, list);
    }

    public static String executePut(String str, JSONObject jSONObject, String str2, List<com.ss.android.http.a.a> list) {
        byte[] bytes;
        if (str2 == null || !str2.startsWith("application/json")) {
            ArrayList arrayList = new ArrayList();
            jsonObjectToBasicNameValuePairs(arrayList, jSONObject, "");
            return executePut(0, 0, str, arrayList, (com.ss.android.common.b.c[]) null, list);
        }
        if (jSONObject == null) {
            bytes = null;
        } else {
            bytes = jSONObject.toString().getBytes("UTF-8");
        }
        return executePut(-1, str, bytes, e.GZIP, str2, list);
    }

    public static String executeGet(int i2, int i3, String str, boolean z) {
        return executeGet(i2, i3, str, z, true);
    }

    public static String postFile(int i2, String str, String str2, String str3) {
        com.ss.android.common.b.a.a aVar = new com.ss.android.common.b.a.a();
        if (str3.startsWith("content://")) {
            Uri parse = Uri.parse(str3);
            InputStream a2 = c.b.d.a(NetWorkInjectImpl.d().a(), parse);
            long a3 = c.b.e.a(NetWorkInjectImpl.d().a(), parse);
            String path = parse.getPath();
            aVar.a(str2, getBytes(a2, a3, path), path);
        } else {
            aVar.a(str2, new File(str3));
        }
        return executePost(0, i2, str, aVar);
    }

    public static String executePost(int i2, String str, com.ss.android.common.b.a.a aVar, com.ss.android.common.b.c[] cVarArr) {
        return executePost(0, i2, str, aVar, cVarArr);
    }

    public static String executeGet(int i2, int i3, String str, int i4, int i5) {
        return executeGet(i2, i3, str, true, true, (List<com.ss.android.http.a.a>) null, (com.ss.android.http.a.b.e) null, true);
    }

    public static String executePostFile(int i2, int i3, String str, com.ss.android.common.b.a.a aVar, List<com.ss.android.http.a.b.d> list) {
        return executePostFile(i2, i3, str, aVar, null, list);
    }

    public static String executePostRetry(int i2, int i3, String str, List<com.ss.android.http.a.b.d> list, com.ss.android.common.b.c[] cVarArr) {
        return executePostRetry(i2, i3, str, list, cVarArr, null);
    }

    public static String executeDelete(int i2, int i3, String str, List<com.ss.android.http.a.a> list, List<com.ss.android.http.a.b.d> list2) {
        if (str == null) {
            return null;
        }
        String addCommonParams = addCommonParams(str, true);
        com.ss.android.common.b.b bVar = com.bytedance.ies.b.b.a.f31924b;
        if (bVar != null) {
            addCommonParams = bVar.a();
        }
        com.ss.android.common.b.a aVar = com.bytedance.ies.b.b.a.f31923a;
        if (aVar != null) {
            return aVar.a(i2, i3, addCommonParams, list);
        }
        return null;
    }

    public static String executePost(int i2, int i3, String str, List<com.ss.android.http.a.b.d> list, com.ss.android.common.b.c[] cVarArr) {
        return executePost(i2, i3, str, list, cVarArr, (List<com.ss.android.http.a.a>) null);
    }

    public static void monitorApiSample(long j2, long j3, String str, String str2, f fVar) {
        g gVar = sMonitorProcessHook;
        if (!TextUtils.isEmpty(str) && j2 > 0 && gVar != null) {
            gVar.a(j2, j3, str, str2, fVar);
        }
    }

    public static String executePost(int i2, int i3, String str, com.ss.android.common.b.a.a aVar, com.ss.android.common.b.c[] cVarArr) {
        String filterUrl = filterUrl(str);
        try {
            return executePostRetry(i2, i3, filterUrl, aVar, cVarArr, addPostRetryCountParam(null, "no_retry"), true);
        } catch (Exception e2) {
            if (TextUtils.isEmpty(filterUrl) || !filterUrl.startsWith("https") || (!(e2 instanceof SSLException) && !(e2 instanceof GeneralSecurityException))) {
                return executePostRetry(i2, i3, filterUrl(filterUrl), aVar, cVarArr, addPostRetryCountParam(null, "first_retry"), false);
            }
            return executePostRetry(i2, i3, filterUrl, aVar, cVarArr, addPostRetryCountParam(null, "retry_http"), false);
        }
    }

    public static String executeGet(int i2, int i3, String str, boolean z, List<com.ss.android.http.a.b.d> list) {
        return executeGet(i2, i3, str, z, true, list);
    }

    public static String postFile(int i2, String str, String str2, String str3, List<com.ss.android.http.a.b.d> list) {
        com.ss.android.common.b.a.a aVar = new com.ss.android.common.b.a.a();
        if (str3.startsWith("content://")) {
            Uri parse = Uri.parse(str3);
            InputStream a2 = c.b.d.a(NetWorkInjectImpl.d().a(), parse);
            long a3 = c.b.e.a(NetWorkInjectImpl.d().a(), parse);
            String path = parse.getPath();
            aVar.a(str2, getBytes(a2, a3, path), path);
        } else {
            aVar.a(str2, new File(str3));
        }
        return executePostFile(0, i2, str, aVar, list);
    }

    public static String response2String(boolean z, boolean z2, int i2, InputStream inputStream, String str) {
        MethodCollector.i(1314);
        if (i2 <= 0) {
            i2 = 5242880;
        }
        if (i2 < 1048576) {
            i2 = 1048576;
        }
        if (inputStream == null) {
            MethodCollector.o(1314);
            return null;
        }
        if (str == null) {
            str = "UTF-8";
        }
        if (z) {
            try {
                inputStream = new GZIPInputStream(inputStream);
            } catch (Throwable th) {
                safeClose(inputStream);
                MethodCollector.o(1314);
                throw th;
            }
        }
        byte[] bArr = new byte[8192];
        int i3 = 0;
        do {
            try {
                if (i3 + 4096 > bArr.length) {
                    byte[] bArr2 = new byte[(bArr.length * 2)];
                    System.arraycopy(bArr, 0, bArr2, 0, i3);
                    bArr = bArr2;
                }
                int read = inputStream.read(bArr, i3, 4096);
                if (read > 0) {
                    i3 += read;
                } else if (i3 <= 0) {
                    safeClose(inputStream);
                    MethodCollector.o(1314);
                    return null;
                } else if (z2) {
                    String decodeSSBinary = decodeSSBinary(bArr, i3, str);
                    safeClose(inputStream);
                    MethodCollector.o(1314);
                    return decodeSSBinary;
                } else {
                    String str2 = new String(bArr, 0, i3, str);
                    safeClose(inputStream);
                    MethodCollector.o(1314);
                    return str2;
                }
            } catch (EOFException e2) {
                if (!z || i3 <= 0) {
                    MethodCollector.o(1314);
                    throw e2;
                }
                com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_LogLancet_w("NetworkUtils", "ungzip got exception ".concat(String.valueOf(e2)));
            } catch (IOException e3) {
                String message = e3.getMessage();
                if (!z || i3 <= 0 || (!"CRC mismatch".equals(message) && !"Size mismatch".equals(message))) {
                    MethodCollector.o(1314);
                    throw e3;
                }
                com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_LogLancet_w("NetworkUtils", "ungzip got exception ".concat(String.valueOf(e3)));
            }
        } while (i3 <= i2);
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_LogLancet_w("NetworkUtils", "entity length did exceed given maxLength");
        safeClose(inputStream);
        MethodCollector.o(1314);
        return null;
    }

    public static String executeGet(int i2, int i3, String str, boolean z, boolean z2) {
        return executeGet(i2, i3, str, z, z2, (List<com.ss.android.http.a.a>) null, (com.ss.android.http.a.b.e) null, true);
    }

    public static String executePostRetry(int i2, int i3, String str, List<com.ss.android.http.a.b.d> list, com.ss.android.common.b.c[] cVarArr, List<com.ss.android.http.a.a> list2) {
        return executetRetry(UGCMonitor.TYPE_POST, i2, i3, str, list, cVarArr, list2);
    }

    public static String executePut(int i2, int i3, String str, List<com.ss.android.http.a.b.d> list, com.ss.android.common.b.c[] cVarArr, List<com.ss.android.http.a.a> list2) {
        return execute("put", i2, i3, str, list, cVarArr, list2);
    }

    public static String executePutRetry(int i2, int i3, String str, List<com.ss.android.http.a.b.d> list, com.ss.android.common.b.c[] cVarArr, List<com.ss.android.http.a.a> list2) {
        return executetRetry("put", i2, i3, str, list, cVarArr, list2);
    }

    public static String executePut(int i2, String str, byte[] bArr, e eVar, String str2, List<com.ss.android.http.a.a> list) {
        if (str == null) {
            return null;
        }
        return execute("put", i2, addCommonParams(str, true), bArr, eVar, str2, list);
    }

    public static String executeGet(int i2, int i3, String str, int i4, int i5, List<com.ss.android.http.a.b.d> list) {
        return executeGet(i2, i3, str, true, true, null, null, true, list);
    }

    public static void monitorApiError(long j2, long j3, String str, String str2, f fVar, Throwable th) {
        g gVar;
        if (!TextUtils.isEmpty(str) && th != null && (gVar = sMonitorProcessHook) != null) {
            gVar.a(j2, j3, str, str2, fVar, th);
        }
    }

    public static String executePost(int i2, int i3, String str, List<com.ss.android.http.a.b.d> list, com.ss.android.common.b.c[] cVarArr, List<com.ss.android.http.a.a> list2) {
        return execute(UGCMonitor.TYPE_POST, i2, i3, str, list, cVarArr, list2);
    }

    public static String executePostFile(int i2, int i3, String str, com.ss.android.common.b.a.a aVar, com.ss.android.common.b.c[] cVarArr, List<com.ss.android.http.a.b.d> list) {
        String filterUrl = filterUrl(str);
        try {
            return executePostFileRetry(i2, i3, filterUrl, aVar, cVarArr, addPostRetryCountParam(list, "no_retry"), true);
        } catch (Exception e2) {
            com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_LogLancet_d("EvilsoulM", "retry................");
            if (TextUtils.isEmpty(filterUrl) || !filterUrl.startsWith("https") || (!(e2 instanceof SSLException) && !(e2 instanceof GeneralSecurityException))) {
                return executePostFileRetry(i2, i3, filterUrl(filterUrl), aVar, cVarArr, addPostRetryCountParam(list, "first_retry"), false);
            }
            return executePostFileRetry(i2, i3, filterUrl, aVar, cVarArr, addPostRetryCountParam(list, "retry_http"), false);
        }
    }

    public static String executePost(int i2, int i3, String str, byte[] bArr, e eVar, String str2) {
        String str3;
        MethodCollector.i(1286);
        String filterUrl = filterUrl(str);
        if (filterUrl == null) {
            MethodCollector.o(1286);
            return null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        if (e.GZIP == eVar) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
                str3 = "gzip";
            } catch (Throwable th) {
                gZIPOutputStream.close();
                MethodCollector.o(1286);
                throw th;
            }
        } else if (e.DEFLATER != eVar || length <= 128) {
            str3 = null;
        } else {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8192);
            Deflater deflater = new Deflater();
            deflater.setInput(bArr);
            deflater.finish();
            byte[] bArr2 = new byte[8192];
            while (!deflater.finished()) {
                byteArrayOutputStream2.write(bArr2, 0, deflater.deflate(bArr2));
            }
            deflater.end();
            bArr = byteArrayOutputStream2.toByteArray();
            str3 = "deflate";
        }
        com.ss.android.common.b.a aVar = com.bytedance.ies.b.b.a.f31923a;
        if (aVar != null) {
            String a2 = aVar.a(i2, i3, filterUrl, bArr, str3, str2);
            MethodCollector.o(1286);
            return a2;
        }
        MethodCollector.o(1286);
        return null;
    }

    public static String postFile(int i2, String str, String str2, String str3, Map<String, String> map, com.ss.android.common.b.c[] cVarArr) {
        com.ss.android.common.b.a.a aVar = new com.ss.android.common.b.a.a();
        if (str3.startsWith("content://")) {
            Uri parse = Uri.parse(str3);
            InputStream a2 = c.b.d.a(NetWorkInjectImpl.d().a(), parse);
            long a3 = c.b.e.a(NetWorkInjectImpl.d().a(), parse);
            String path = parse.getPath();
            aVar.a(str2, getBytes(a2, a3, path), path);
        } else {
            aVar.a(str2, new File(str3));
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                aVar.a(entry.getKey(), entry.getValue());
            }
        }
        return executePost(0, i2, str, aVar, cVarArr);
    }

    public static String executeGet(int i2, int i3, String str, boolean z, boolean z2, List<com.ss.android.http.a.b.d> list) {
        return executeGet(i2, i3, str, z, z2, null, null, true, list);
    }

    public static String executePostRetry(int i2, int i3, String str, com.ss.android.common.b.a.a aVar, com.ss.android.common.b.c[] cVarArr, List<com.ss.android.http.a.b.d> list, boolean z) {
        String filterUrl = filterUrl(str);
        if (filterUrl == null) {
            return null;
        }
        putCommonParams(list, true);
        String joinCommonParams = joinCommonParams(filterUrl, list);
        com.ss.android.common.b.a aVar2 = com.bytedance.ies.b.b.a.f31923a;
        if (aVar2 != null) {
            return aVar2.a(i2, i3, joinCommonParams, list, aVar, cVarArr);
        }
        return null;
    }

    public static String executePostFileRetry(int i2, int i3, String str, com.ss.android.common.b.a.a aVar, com.ss.android.common.b.c[] cVarArr, List<com.ss.android.http.a.b.d> list, boolean z) {
        String filterUrl = filterUrl(str);
        if (filterUrl == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        putCommonParams(arrayList, true);
        String joinCommonParams = joinCommonParams(filterUrl, arrayList);
        list.addAll(arrayList);
        com.ss.android.common.b.a aVar2 = com.bytedance.ies.b.b.a.f31923a;
        if (aVar2 != null) {
            return aVar2.a(i2, i3, joinCommonParams, list, aVar, cVarArr);
        }
        return null;
    }

    public static String postData(int i2, String str, String str2, byte[] bArr, String str3, Map<String, String> map, com.ss.android.common.b.c[] cVarArr) {
        com.ss.android.common.b.a.a aVar = new com.ss.android.common.b.a.a();
        aVar.a(str2, bArr, str3);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                aVar.a(entry.getKey(), entry.getValue());
            }
        }
        return executePost(0, i2, str, aVar, cVarArr);
    }

    public static String uploadFile(int i2, String str, String str2, String str3, c cVar, long j2, com.ss.android.common.b.c[] cVarArr) {
        String filterUrl = filterUrl(str);
        if (filterUrl != null && !TextUtils.isEmpty(str3)) {
            File file = new File(str3);
            com.ss.android.common.b.a.a aVar = new com.ss.android.common.b.a.a();
            aVar.a(str2, file);
            ArrayList arrayList = new ArrayList();
            putCommonParams(arrayList, true);
            String joinCommonParams = joinCommonParams(filterUrl, arrayList);
            com.ss.android.common.b.a aVar2 = com.bytedance.ies.b.b.a.f31923a;
            if (aVar2 != null) {
                return aVar2.a(i2, joinCommonParams, aVar, cVar, j2, cVarArr);
            }
        }
        return null;
    }

    private static String execute(String str, int i2, int i3, String str2, List<com.ss.android.http.a.b.d> list, com.ss.android.common.b.c[] cVarArr, List<com.ss.android.http.a.a> list2) {
        String filterUrl = filterUrl(str2);
        try {
            return executetRetry(str, i2, i3, filterUrl, addPostRetryCountParam(list, "no_retry"), cVarArr, list2);
        } catch (Exception unused) {
            if (TextUtils.isEmpty(filterUrl) || !filterUrl.startsWith("https")) {
                return executetRetry(str, i2, i3, filterUrl(filterUrl), addPostRetryCountParam(list, "first_retry"), cVarArr, list2);
            }
            if (!isHitNoHttpList(filterUrl)) {
                return executetRetry(str, i2, i3, filterUrl, addPostRetryCountParam(list, "retry_http"), cVarArr, list2);
            }
            return executetRetry(str, i2, i3, filterUrl(filterUrl), addPostRetryCountParam(list, "first_retry"), cVarArr, list2);
        }
    }

    public static String execute(String str, int i2, String str2, byte[] bArr, e eVar, String str3, List<com.ss.android.http.a.a> list) {
        String str4;
        MethodCollector.i(1233);
        if ("get".equals(str)) {
            RuntimeException runtimeException = new RuntimeException("this method does not support [get]");
            MethodCollector.o(1233);
            throw runtimeException;
        } else if (!"delete".equals(str)) {
            String filterUrl = filterUrl(str2);
            if (filterUrl == null || TextUtils.isEmpty(str)) {
                MethodCollector.o(1233);
                return null;
            }
            if (bArr == null) {
                bArr = new byte[0];
            }
            int length = bArr.length;
            if (e.GZIP == eVar) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.close();
                    bArr = byteArrayOutputStream.toByteArray();
                    str4 = "gzip";
                } catch (Throwable th) {
                    gZIPOutputStream.close();
                    MethodCollector.o(1233);
                    throw th;
                }
            } else if (e.DEFLATER != eVar || length <= 128) {
                str4 = null;
            } else {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8192);
                Deflater deflater = new Deflater();
                deflater.setInput(bArr);
                deflater.finish();
                byte[] bArr2 = new byte[8192];
                while (!deflater.finished()) {
                    byteArrayOutputStream2.write(bArr2, 0, deflater.deflate(bArr2));
                }
                deflater.end();
                bArr = byteArrayOutputStream2.toByteArray();
                str4 = "deflate";
            }
            com.ss.android.common.b.a aVar = com.bytedance.ies.b.b.a.f31923a;
            if (aVar == null) {
                MethodCollector.o(1233);
                return null;
            } else if ("put".equals(str)) {
                String b2 = aVar.b(0, i2, filterUrl, bArr, str4, str3, list);
                MethodCollector.o(1233);
                return b2;
            } else {
                String a2 = aVar.a(0, i2, filterUrl, bArr, str4, str3, list);
                MethodCollector.o(1233);
                return a2;
            }
        } else {
            RuntimeException runtimeException2 = new RuntimeException("This method does not support [delete]");
            MethodCollector.o(1233);
            throw runtimeException2;
        }
    }

    private static String executetRetry(String str, int i2, int i3, String str2, List<com.ss.android.http.a.b.d> list, com.ss.android.common.b.c[] cVarArr, List<com.ss.android.http.a.a> list2) {
        if (str2 == null || TextUtils.isEmpty(str)) {
            return null;
        }
        if ("get".equals(str)) {
            throw new RuntimeException("executetRetry does not support [get]");
        } else if (!"delete".equals(str)) {
            ArrayList arrayList = new ArrayList();
            putCommonParams(arrayList, true);
            String joinCommonParams = joinCommonParams(str2, arrayList);
            list.addAll(arrayList);
            try {
                com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_LogLancet_v("NetworkUtils", "POST " + new String[1][0] + " " + joinCommonParams + " " + Arrays.toString(list.toArray()));
            } catch (Exception unused) {
            }
            com.ss.android.common.b.b bVar = com.bytedance.ies.b.b.a.f31924b;
            if (bVar != null) {
                joinCommonParams = bVar.a();
            }
            com.ss.android.common.b.a aVar = com.bytedance.ies.b.b.a.f31923a;
            if (aVar == null) {
                return null;
            }
            if ("put".equals(str)) {
                return aVar.b(i2, i3, joinCommonParams, list, true, cVarArr, list2);
            }
            return aVar.a(i2, i3, joinCommonParams, list, true, cVarArr, list2);
        } else {
            throw new RuntimeException("executetRetry does not support [delete]");
        }
    }

    public static String executeGet(int i2, int i3, String str, boolean z, boolean z2, List<com.ss.android.http.a.a> list, com.ss.android.http.a.b.e eVar, boolean z3) {
        return executeGet(i2, i3, str, z, z2, list, eVar, z3, null);
    }

    public static String executeGetRetry(int i2, int i3, String str, boolean z, List<com.ss.android.http.a.a> list, com.ss.android.http.a.b.e eVar, boolean z2, List<com.ss.android.http.a.b.d> list2, boolean z3) {
        String str2 = str;
        boolean z4 = z;
        if (str2 == null) {
            return null;
        }
        if (z3) {
            str2 = addCommonParams(str2, true);
        }
        if (!mAllowKeepAlive) {
            z4 = false;
        }
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_LogLancet_v("NetworkUtils", "GET " + z4 + " " + str2);
        com.ss.android.common.b.b bVar = com.bytedance.ies.b.b.a.f31924b;
        if (bVar != null) {
            str2 = bVar.a();
        }
        com.ss.android.common.b.a aVar = com.bytedance.ies.b.b.a.f31923a;
        if (aVar != null) {
            return aVar.a(i2, i3, str2, list, z4, true, eVar, z2);
        }
        return null;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:20:0x0058 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.File] */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0118, code lost:
        if (r12 <= 0) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r4.seek(0);
        r0 = new java.io.FileOutputStream(new java.io.File(r14, r22));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r2 = r4.read(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0130, code lost:
        if (r2 == -1) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0132, code lost:
        r0.write(r3, 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0137, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x013b, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x013c, code lost:
        r11 = null;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0144, code lost:
        safeClose(null, "close instream exception ");
        safeClose(null, "close outstream exception ");
        safeClose(null, "close random file exception ");
        com.bytedance.frameworks.apm.trace.MethodCollector.o(4088);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0154, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0155, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0156, code lost:
        r0 = null;
        r11 = null;
        r4 = null;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015a, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x015b, code lost:
        r0 = null;
        r11 = null;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0173, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0174, code lost:
        r11 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01a6 A[SYNTHETIC, Splitter:B:115:0x01a6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean stream2File(java.io.InputStream r15, long r16, com.ss.android.common.util.NetworkUtils.i r18, int r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, com.ss.android.common.util.b<java.lang.String> r23, java.lang.String r24, com.ss.android.common.util.e r25) {
        /*
        // Method dump skipped, instructions count: 444
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.NetworkUtils.stream2File(java.io.InputStream, long, com.ss.android.common.util.NetworkUtils$i, int, java.lang.String, java.lang.String, java.lang.String, com.ss.android.common.util.b, java.lang.String, com.ss.android.common.util.e):boolean");
    }

    public static boolean downloadFile(int i2, String str, String str2, String str3, String str4, b<String> bVar, String str5, e eVar, List<com.ss.android.http.a.b.d> list, String[] strArr, int[] iArr) {
        com.ss.android.common.b.a aVar = com.bytedance.ies.b.b.a.f31923a;
        if (aVar != null) {
            return aVar.a(i2, str, str2, str3, str4, bVar, str5, eVar, list, strArr, iArr);
        }
        return false;
    }

    public static boolean downloadVideo(int i2, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, b<String> bVar, String str2, e eVar, List<com.ss.android.http.a.b.d> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler) {
        com.ss.android.common.b.a aVar = com.bytedance.ies.b.b.a.f31923a;
        if (aVar != null) {
            return aVar.a(i2, str, stringBuffer, stringBuffer2, stringBuffer3, bVar, str2, eVar, list, strArr, iArr, redirectHandler);
        }
        return false;
    }
}
