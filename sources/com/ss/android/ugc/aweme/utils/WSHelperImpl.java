package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.al;
import com.ss.android.ugc.aweme.app.o;
import com.ss.android.ugc.aweme.i.a;
import com.ss.android.ugc.aweme.net.corenet.IESNetDepend;
import com.ss.android.ugc.aweme.notice.api.helper.WSHelper;
import com.ss.android.ugc.b;
import h.a.ag;
import h.f.b.l;
import h.v;

public final class WSHelperImpl implements WSHelper {
    static {
        Covode.recordClassIndex(93264);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.WSHelper
    public final int b() {
        return (int) d.e();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.WSHelper
    public final boolean c() {
        o a2 = o.a();
        l.b(a2, "");
        return a2.f66861a.f99089b;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.WSHelper
    public final String a() {
        return IESNetDepend.g().a(d.a(), "frontier_urls", "");
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.WSHelper
    public final String d() {
        return IESNetDepend.g().a(d.a(), "boe_ws_host", "");
    }

    public static WSHelper e() {
        MethodCollector.i(3410);
        Object a2 = b.a(WSHelper.class, false);
        if (a2 != null) {
            WSHelper wSHelper = (WSHelper) a2;
            MethodCollector.o(3410);
            return wSHelper;
        }
        if (b.eC == null) {
            synchronized (WSHelper.class) {
                try {
                    if (b.eC == null) {
                        b.eC = new WSHelperImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3410);
                    throw th;
                }
            }
        }
        WSHelperImpl wSHelperImpl = (WSHelperImpl) b.eC;
        MethodCollector.o(3410);
        return wSHelperImpl;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.WSHelper
    public final void a(al alVar) {
        l.d(alVar, "");
        a.c().a(alVar);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.WSHelper
    public final void a(String str) {
        l.d(str, "");
        IESNetDepend.g().a(d.a(), ag.a(v.a("boe_ws_host", str)));
    }
}
