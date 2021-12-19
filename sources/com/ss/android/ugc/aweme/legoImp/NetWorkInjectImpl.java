package com.ss.android.ugc.aweme.legoImp;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.g;
import com.ss.android.common.util.INetWorkInject;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.newmedia.c.a;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class NetWorkInjectImpl implements INetWorkInject {
    static {
        Covode.recordClassIndex(68866);
    }

    @Override // com.ss.android.common.util.INetWorkInject
    public final NetworkUtils.b b() {
        return new a();
    }

    @Override // com.ss.android.common.util.INetWorkInject
    public final Context a() {
        Application a2 = g.a();
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.common.util.INetWorkInject
    public final String c() {
        String property = System.getProperty("http.agent");
        l.b(property, "");
        return property;
    }

    public static INetWorkInject d() {
        MethodCollector.i(7357);
        Object a2 = b.a(INetWorkInject.class, false);
        if (a2 != null) {
            INetWorkInject iNetWorkInject = (INetWorkInject) a2;
            MethodCollector.o(7357);
            return iNetWorkInject;
        }
        if (b.ck == null) {
            synchronized (INetWorkInject.class) {
                try {
                    if (b.ck == null) {
                        b.ck = new NetWorkInjectImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7357);
                    throw th;
                }
            }
        }
        NetWorkInjectImpl netWorkInjectImpl = (NetWorkInjectImpl) b.ck;
        MethodCollector.o(7357);
        return netWorkInjectImpl;
    }
}
