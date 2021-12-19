package com.ss.android.ugc.aweme.bullet;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.newmedia.e;
import com.ss.android.sdk.webview.m;
import com.ss.android.ugc.aweme.app.d;
import com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy;
import com.ss.android.ugc.aweme.bullet.module.p001default.a;
import com.ss.android.ugc.aweme.web.k;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.List;
import org.json.JSONObject;

public final class BulletHostProxy implements IBulletHostProxy {
    static {
        Covode.recordClassIndex(42398);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy
    public final m a() {
        l.b(e.a(), "");
        k kVar = k.f145061a;
        l.b(kVar, "");
        return kVar;
    }

    public static IBulletHostProxy b() {
        MethodCollector.i(4320);
        Object a2 = b.a(IBulletHostProxy.class, false);
        if (a2 != null) {
            IBulletHostProxy iBulletHostProxy = (IBulletHostProxy) a2;
            MethodCollector.o(4320);
            return iBulletHostProxy;
        }
        if (b.W == null) {
            synchronized (IBulletHostProxy.class) {
                try {
                    if (b.W == null) {
                        b.W = new BulletHostProxy();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4320);
                    throw th;
                }
            }
        }
        BulletHostProxy bulletHostProxy = (BulletHostProxy) b.W;
        MethodCollector.o(4320);
        return bulletHostProxy;
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy
    public final List<com.bytedance.ies.bullet.c.c.a.k> a(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        return a.a(bVar);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy
    public final JSONObject a(String str) {
        l.d(str, "");
        return com.ss.android.ugc.aweme.bullet.utils.a.a(str);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy
    public final boolean a(Context context, String str) {
        return d.a.a(context, str, (String) null, false);
    }
}
