package org.chromium;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.base.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class c {

    /* renamed from: b  reason: collision with root package name */
    private static volatile c f159756b;

    /* renamed from: a  reason: collision with root package name */
    public Object f159757a;

    static {
        Covode.recordClassIndex(106442);
    }

    private c() {
    }

    public final Map<String, String> b() {
        try {
            Object obj = this.f159757a;
            if (obj == null) {
                return Collections.emptyMap();
            }
            return (Map) k.a(obj).a("getGetDomainDependHostMap").f155250a;
        } catch (Throwable unused) {
            return Collections.emptyMap();
        }
    }

    public final String c() {
        try {
            Object obj = this.f159757a;
            if (obj == null) {
                return null;
            }
            return (String) k.a(obj).a("getGetDomainDefaultJSON").f155250a;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final ArrayList<byte[]> d() {
        try {
            Object obj = this.f159757a;
            if (obj == null) {
                return null;
            }
            return (ArrayList) k.a(obj).a("getOpaqueData").f155250a;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Map<String[], Pair<byte[], byte[]>> e() {
        try {
            Object obj = this.f159757a;
            if (obj == null) {
                return null;
            }
            return (Map) k.a(obj).a("getClientOpaqueData").f155250a;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Map<String, String> f() {
        try {
            Object obj = this.f159757a;
            if (obj == null) {
                return null;
            }
            return (Map) k.a(obj).a("getTNCRequestHeader").f155250a;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Map<String, String> g() {
        try {
            Object obj = this.f159757a;
            if (obj == null) {
                return null;
            }
            return (Map) k.a(obj).a("getTNCRequestQuery").f155250a;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean h() {
        try {
            Object obj = this.f159757a;
            if (obj == null) {
                return false;
            }
            return ((Boolean) k.a(obj).a("isEnableQuic").f155250a).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean i() {
        try {
            Object obj = this.f159757a;
            if (obj == null) {
                return false;
            }
            return ((Boolean) k.a(obj).a("isEnableHttp2").f155250a).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean j() {
        try {
            Object obj = this.f159757a;
            if (obj == null) {
                return false;
            }
            return ((Boolean) k.a(obj).a("isEnableBrotli").f155250a).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public final Map<String, Pair<Integer, Integer>> k() {
        try {
            Object obj = this.f159757a;
            if (obj == null) {
                return null;
            }
            return (Map) k.a(obj).a("getQuicHint").f155250a;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean l() {
        try {
            Object obj = this.f159757a;
            if (obj == null) {
                return false;
            }
            return ((Boolean) k.a(obj).a("isBOEProxyEnabled").f155250a).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public final String m() {
        try {
            Object obj = this.f159757a;
            if (obj == null) {
                return null;
            }
            return (String) k.a(obj).a("getBypassBOEJSON").f155250a;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String n() {
        try {
            Object obj = this.f159757a;
            if (obj == null) {
                return null;
            }
            return (String) k.a(obj).a("getStoreIdcRuleJSON").f155250a;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean o() {
        try {
            Object obj = this.f159757a;
            if (obj == null) {
                return false;
            }
            return ((Boolean) k.a(obj).a("needCustomLoadLibrary").f155250a).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public final String p() {
        try {
            Object obj = this.f159757a;
            if (obj == null) {
                return null;
            }
            return (String) k.a(obj).a("getCronetSoPath").f155250a;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final int q() {
        try {
            Object obj = this.f159757a;
            if (obj == null) {
                return 0;
            }
            return ((Integer) k.a(obj).a("getProcessFlag").f155250a).intValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static c a() {
        MethodCollector.i(13694);
        if (f159756b == null) {
            synchronized (c.class) {
                try {
                    if (f159756b == null) {
                        f159756b = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13694);
                    throw th;
                }
            }
        }
        c cVar = f159756b;
        MethodCollector.o(13694);
        return cVar;
    }

    /* access modifiers changed from: package-private */
    public final String a(String str) {
        try {
            Object obj = this.f159757a;
            if (obj == null) {
                return "";
            }
            return (String) k.a(obj).a(str).f155250a;
        } catch (Throwable unused) {
            return "";
        }
    }

    public final Map<String, String> a(String str, Map<String, String> map) {
        if (d.a().loggerDebug()) {
            d.a().loggerD("CronetAppProviderManager", "onCallToAddSecurityFactor info url = ".concat(String.valueOf(str)));
        }
        try {
            Object obj = this.f159757a;
            if (obj == null) {
                return null;
            }
            return (Map) k.a(obj).a("onCallToAddSecurityFactor", new Class[]{String.class, Map.class}, str, map).f155250a;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void a(String str, String str2) {
        if (d.a().loggerDebug()) {
            d.a().loggerD("CronetAppProviderManager", "Send monitor json = " + str + ", log type =" + str2);
        }
        try {
            Object obj = this.f159757a;
            if (obj != null) {
                k.a(obj).a("sendAppMonitorEvent", new Class[]{String.class, String.class}, str, str2);
            }
        } catch (Throwable unused) {
        }
    }
}
