package com.ss.android.ugc.aweme.plugin.aab;

import android.os.Build;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.plugin.a.a;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.ies.ugc.aweme.plugin.service.a;
import com.bytedance.m.c;
import com.ss.android.ugc.aweme.aabplugin.core.b.d;
import com.ss.android.ugc.aweme.aabplugin.core.base.n;
import com.ss.android.ugc.aweme.aabplugin.core.base.o;
import com.ss.android.ugc.aweme.plugin.aab.b;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class AabPluginServiceImpl implements IPluginService {

    /* renamed from: a  reason: collision with root package name */
    private static final b f115522a = b.f115525c;

    static {
        Covode.recordClassIndex(74153);
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final boolean b() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final a c() {
        e();
        return new a();
    }

    public static IPluginService d() {
        MethodCollector.i(9424);
        Object a2 = b.a(IPluginService.class, false);
        if (a2 != null) {
            IPluginService iPluginService = (IPluginService) a2;
            MethodCollector.o(9424);
            return iPluginService;
        }
        if (b.db == null) {
            synchronized (IPluginService.class) {
                try {
                    if (b.db == null) {
                        b.db = new AabPluginServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9424);
                    throw th;
                }
            }
        }
        AabPluginServiceImpl aabPluginServiceImpl = (AabPluginServiceImpl) b.db;
        MethodCollector.o(9424);
        return aabPluginServiceImpl;
    }

    private static boolean e() {
        if (b.f115523a.get() == 3) {
            return true;
        }
        int i2 = b.f115523a.get();
        if (i2 == 0 ? b.f115523a.compareAndSet(0, 1) : i2 == 1) {
            b.a();
        }
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final List<String> a() {
        e();
        ArrayList arrayList = new ArrayList();
        Map<String, com.bytedance.m.b.a> a2 = c.a();
        if (a2 != null) {
            for (com.bytedance.m.b.a aVar : a2.values()) {
                if (aVar.f41329c == 5) {
                    arrayList.add(aVar.f41327a);
                }
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final boolean a(String str) {
        e();
        return o.a(str);
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final void a(com.bytedance.ies.ugc.aweme.plugin.a.b bVar) {
        l.d(bVar, "");
        int i2 = b.f115523a.get();
        if (i2 == 0) {
            b.f115524b = bVar;
            if (!b.f115523a.compareAndSet(0, 1)) {
                return;
            }
            if (bVar.f35077b) {
                b.a();
            } else {
                i.b(b.a.f115526a, i.f4824a);
            }
        } else if (i2 == 1) {
            b.f115524b = bVar;
            if (bVar.f35077b) {
                b.a();
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final void a(com.bytedance.ies.ugc.aweme.plugin.a.c cVar) {
        n dVar;
        com.ss.android.ugc.aweme.aabplugin.core.base.l aVar;
        e();
        l.d(cVar, "");
        Locale locale = cVar.f35088h;
        String str = cVar.f35081a;
        boolean z = cVar.f35083c;
        com.bytedance.ies.ugc.aweme.plugin.a.a aVar2 = cVar.f35086f;
        if (aVar2 == null) {
            aVar2 = new a.C0790a().a();
        }
        n.a.C1368a aVar3 = new n.a.C1368a(cVar, z);
        if (locale != null) {
            l.b(aVar2, "");
            dVar = new d(locale, z, aVar3, aVar2);
        } else {
            l.b(str, "");
            l.b(aVar2, "");
            dVar = new com.ss.android.ugc.aweme.aabplugin.core.a.d(str, z, aVar3, aVar2);
        }
        dVar.f62517k = cVar.f35085e;
        dVar.f62509c = cVar.f35087g;
        if (dVar instanceof d) {
            aVar = new com.ss.android.ugc.aweme.aabplugin.core.b.a((d) dVar);
        } else {
            aVar = new com.ss.android.ugc.aweme.aabplugin.core.a.a((com.ss.android.ugc.aweme.aabplugin.core.a.d) dVar);
        }
        aVar.a();
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final boolean a(String str, String str2) {
        e();
        return c.f41336a.a(str, str2);
    }
}
