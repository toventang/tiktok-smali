package org.chromium;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend;

public class d implements ICronetDepend {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f159758a;

    /* renamed from: b  reason: collision with root package name */
    private ICronetDepend f159759b;

    static {
        Covode.recordClassIndex(106443);
    }

    private d() {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public String getSsCookieKey() {
        ICronetDepend iCronetDepend = this.f159759b;
        if (iCronetDepend != null) {
            return iCronetDepend.getSsCookieKey();
        }
        return "X-SS-Cookie";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public boolean loggerDebug() {
        ICronetDepend iCronetDepend = this.f159759b;
        if (iCronetDepend != null) {
            return iCronetDepend.loggerDebug();
        }
        return false;
    }

    public static d a() {
        MethodCollector.i(11539);
        if (f159758a == null) {
            synchronized (d.class) {
                try {
                    if (f159758a == null) {
                        f159758a = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11539);
                    throw th;
                }
            }
        }
        d dVar = f159758a;
        MethodCollector.o(11539);
        return dVar;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public void setAdapter(ICronetDepend iCronetDepend) {
        this.f159759b = iCronetDepend;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public void loggerD(String str, String str2) {
        ICronetDepend iCronetDepend = this.f159759b;
        if (iCronetDepend != null) {
            iCronetDepend.loggerD(str, str2);
        }
    }
}
