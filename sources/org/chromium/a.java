package org.chromium;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.g.g;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import java.net.CookieHandler;
import java.util.List;
import java.util.Map;

public class a extends TTAppInfoProvider {

    /* renamed from: a  reason: collision with root package name */
    private static a f159752a;

    /* renamed from: b  reason: collision with root package name */
    private TTAppInfoProvider.AppInfo f159753b;

    /* renamed from: c  reason: collision with root package name */
    private Context f159754c;

    static {
        Covode.recordClassIndex(106440);
    }

    @Override // com.ttnet.org.chromium.net.TTAppInfoProvider
    public final TTAppInfoProvider.AppInfo a() {
        MethodCollector.i(12959);
        try {
            synchronized (a.class) {
                try {
                    if (this.f159753b == null) {
                        this.f159753b = new TTAppInfoProvider.AppInfo();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12959);
                    throw th;
                }
            }
            this.f159753b.f155442b = c.a().a("getAppId");
            this.f159753b.f155448h = c.a().a("getAppName");
            this.f159753b.f155449i = c.a().a("getSdkAppId");
            this.f159753b.f155450j = c.a().a("getSdkVersion");
            this.f159753b.f155451k = c.a().a("getChannel");
            this.f159753b.f155444d = c.a().a("getDeviceId");
            if (f.a(this.f159754c)) {
                this.f159753b.z = "1";
            } else {
                this.f159753b.z = "0";
            }
            this.f159753b.s = c.a().a("getAbi");
            this.f159753b.f155453m = c.a().a("getDevicePlatform");
            this.f159753b.f155447g = c.a().a("getDeviceType");
            this.f159753b.n = c.a().a("getDeviceBrand");
            this.f159753b.o = c.a().a("getDeviceModel");
            this.f159753b.f155445e = c.a().a("getNetAccessType");
            this.f159753b.f155443c = c.a().a("getOSApi");
            this.f159753b.f155452l = c.a().a("getOSVersion");
            this.f159753b.f155441a = c.a().a("getUserId");
            this.f159753b.f155446f = c.a().a("getVersionCode");
            this.f159753b.p = c.a().a("getVersionName");
            this.f159753b.q = c.a().a("getUpdateVersionCode");
            this.f159753b.r = c.a().a("getManifestVersionCode");
            this.f159753b.A = c.a().a("getStoreIdc");
            this.f159753b.B = c.a().a("getRegion");
            this.f159753b.C = c.a().a("getSysRegion");
            this.f159753b.D = c.a().a("getCarrierRegion");
            this.f159753b.G = c.a().a("getTNCRequestFlags");
            this.f159753b.H = c.a().a("getHttpDnsRequestFlags");
            Map<String, String> b2 = c.a().b();
            if (b2 != null && !b2.isEmpty()) {
                this.f159753b.t = b2.get("first");
                this.f159753b.u = b2.get("second");
                this.f159753b.v = b2.get("third");
                this.f159753b.w = b2.get("httpdns");
                this.f159753b.x = b2.get("netlog");
                this.f159753b.y = b2.get("boe");
            }
            Map<String, String> f2 = c.a().f();
            String str = "";
            if (f2 != null && !f2.isEmpty()) {
                for (Map.Entry<String, String> entry : f2.entrySet()) {
                    str = entry.getKey() + ":" + entry.getValue() + "\r\n" + str;
                }
            }
            String a2 = a(b2.get("first"));
            if (!TextUtils.isEmpty(a2)) {
                str = "Cookie:" + a2 + "\r\n" + str;
            }
            this.f159753b.E = str;
            Map<String, String> g2 = c.a().g();
            String str2 = "";
            if (g2 != null && !g2.isEmpty()) {
                for (Map.Entry<String, String> entry2 : g2.entrySet()) {
                    str2 = entry2.getKey() + ":" + entry2.getValue() + "\r\n" + str2;
                }
            }
            this.f159753b.F = str2;
            if (d.a().loggerDebug()) {
                d.a().loggerD("CronetAppInfoProvider", "get appinfo = ".concat(String.valueOf("AppInfo{, mUserId='" + this.f159753b.getUserId() + '\'' + ", mAppId='" + this.f159753b.getAppId() + '\'' + ", mOSApi='" + this.f159753b.getOSApi() + '\'' + ", mDeviceId='" + this.f159753b.getDeviceId() + '\'' + ", mNetAccessType='" + this.f159753b.getNetAccessType() + '\'' + ", mVersionCode='" + this.f159753b.getVersionCode() + '\'' + ", mDeviceType='" + this.f159753b.getDeviceType() + '\'' + ", mAppName='" + this.f159753b.getAppName() + '\'' + ", mSdkAppID='" + this.f159753b.getSdkAppID() + '\'' + ", mSdkVersion='" + this.f159753b.getSdkVersion() + '\'' + ", mChannel='" + this.f159753b.getChannel() + '\'' + ", mOSVersion='" + this.f159753b.getOSVersion() + '\'' + ", mAbi='" + this.f159753b.getAbi() + '\'' + ", mDevicePlatform='" + this.f159753b.getDevicePlatform() + '\'' + ", mDeviceBrand='" + this.f159753b.getDeviceBrand() + '\'' + ", mDeviceModel='" + this.f159753b.getDeviceModel() + '\'' + ", mVersionName='" + this.f159753b.getVersionName() + '\'' + ", mUpdateVersionCode='" + this.f159753b.getUpdateVersionCode() + '\'' + ", mManifestVersionCode='" + this.f159753b.getManifestVersionCode() + '\'' + ", mHostFirst='" + this.f159753b.getHostFirst() + '\'' + ", mHostSecond='" + this.f159753b.getHostSecond() + '\'' + ", mHostThird='" + this.f159753b.getHostThird() + '\'' + ", mDomainHttpDns='" + this.f159753b.getDomainHttpDns() + '\'' + ", mDomainNetlog='" + this.f159753b.getDomainNetlog() + '\'' + ", mDomainBoe='" + this.f159753b.getDomainBoe() + '\'' + '}')));
            }
        } catch (Throwable unused) {
        }
        TTAppInfoProvider.AppInfo appInfo = this.f159753b;
        MethodCollector.o(12959);
        return appInfo;
    }

    private a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f159754c = applicationContext;
    }

    public static a a(Context context) {
        MethodCollector.i(12858);
        if (f159752a == null) {
            synchronized (a.class) {
                try {
                    if (f159752a == null) {
                        f159752a = new a(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12858);
                    throw th;
                }
            }
        }
        a aVar = f159752a;
        MethodCollector.o(12858);
        return aVar;
    }

    private static String a(String str) {
        CookieHandler cookieHandler = CookieHandler.getDefault();
        if (!TextUtils.isEmpty(str) && cookieHandler != null) {
            try {
                Map<String, List<String>> map = cookieHandler.get(g.b("https://".concat(String.valueOf(str))), null);
                if (map != null && map.size() > 0) {
                    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                        if ("Cookie".equalsIgnoreCase(entry.getKey()) && !entry.getValue().isEmpty()) {
                            StringBuilder sb = new StringBuilder();
                            int i2 = 0;
                            for (String str2 : entry.getValue()) {
                                if (i2 > 0) {
                                    sb.append("; ");
                                }
                                sb.append(str2);
                                i2++;
                            }
                            return sb.toString();
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
