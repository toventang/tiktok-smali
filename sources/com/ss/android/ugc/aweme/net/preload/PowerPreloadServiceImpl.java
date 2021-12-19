package com.ss.android.ugc.aweme.net.preload;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.network.IPowerPreload;
import com.bytedance.ies.ugc.network.partner.b.h;
import com.ss.android.ugc.aweme.net.preload.a;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public final class PowerPreloadServiceImpl implements IPowerPreload {
    static {
        Covode.recordClassIndex(72301);
    }

    public static IPowerPreload a() {
        MethodCollector.i(5867);
        Object a2 = b.a(IPowerPreload.class, false);
        if (a2 != null) {
            IPowerPreload iPowerPreload = (IPowerPreload) a2;
            MethodCollector.o(5867);
            return iPowerPreload;
        }
        if (b.cS == null) {
            synchronized (IPowerPreload.class) {
                try {
                    if (b.cS == null) {
                        b.cS = new PowerPreloadServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5867);
                    throw th;
                }
            }
        }
        PowerPreloadServiceImpl powerPreloadServiceImpl = (PowerPreloadServiceImpl) b.cS;
        MethodCollector.o(5867);
        return powerPreloadServiceImpl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: androidx.c.e<java.lang.String, com.ss.android.ugc.aweme.net.preload.e> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.ugc.aweme.network.IPowerPreload
    public final void a(String str, Map<String, String> map) {
        f fVar;
        String str2;
        boolean z;
        l.d(str, "");
        if (str.length() != 0) {
            l.d(str, "");
            a.C2873a aVar = a.f112496b;
            if (aVar != null) {
                l.d(str, "");
                if (str.length() != 0) {
                    Set<String> keySet = aVar.f112503a.c().keySet();
                    ArrayList<Object> arrayList = new ArrayList();
                    for (T t : keySet) {
                        e a2 = aVar.f112503a.a(t.toString());
                        if (!(a2 == null || (fVar = a2.f112509a) == null || (str2 = fVar.w) == null || str2.length() == 0)) {
                            h a3 = h.a(str2);
                            if (map == null) {
                                z = l.a((Object) a.C2873a.b(str), (Object) a.C2873a.b(a3.f35297e.a()));
                            } else {
                                z = true;
                                for (Map.Entry<String, String> entry : map.entrySet()) {
                                    String a4 = a3.f35298f.a(entry.getKey());
                                    if (a4 == null) {
                                        a4 = "";
                                    }
                                    if (!l.a((Object) a4, (Object) entry.getValue())) {
                                        z = false;
                                    }
                                }
                            }
                            if (z) {
                                arrayList.add(t);
                            }
                        }
                    }
                    for (Object obj : arrayList) {
                        aVar.f112503a.b(obj);
                    }
                }
            }
        }
    }
}
