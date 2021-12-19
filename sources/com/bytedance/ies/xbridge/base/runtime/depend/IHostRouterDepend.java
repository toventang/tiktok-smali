package com.bytedance.ies.xbridge.base.runtime.depend;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.model.b.c;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public interface IHostRouterDepend {
    static {
        Covode.recordClassIndex(21425);
    }

    boolean closeView(c cVar, e eVar, String str, boolean z);

    boolean openSchema(c cVar, String str, Map<String, ? extends Object> map, e eVar, Context context);

    a provideRouteOpenExceptionHandler(c cVar);

    List<a> provideRouteOpenHandlerList(c cVar);

    public static final class a {
        static {
            Covode.recordClassIndex(21426);
        }

        public static boolean a(IHostRouterDepend iHostRouterDepend, c cVar, String str, Map<String, ? extends Object> map, e eVar) {
            Context context;
            l.c(str, "");
            l.c(map, "");
            l.c(eVar, "");
            List<a> provideRouteOpenHandlerList = iHostRouterDepend.provideRouteOpenHandlerList(cVar);
            a provideRouteOpenExceptionHandler = iHostRouterDepend.provideRouteOpenExceptionHandler(cVar);
            T t = null;
            T t2 = null;
            for (T t3 : provideRouteOpenHandlerList) {
                if (t2 == null) {
                    t = t3;
                } else {
                    t2.f35868a = t3;
                }
                t3.f35869b = provideRouteOpenExceptionHandler;
                t2 = t3;
            }
            boolean z = false;
            if (t == null) {
                return false;
            }
            do {
                if (t.a().contains(e.ALL) || t.a().contains(eVar)) {
                    if (cVar != null) {
                        try {
                            context = (Context) cVar.a(Context.class);
                        } catch (Throwable unused) {
                            t = t.f35869b;
                            continue;
                        }
                    } else {
                        context = null;
                    }
                    z = t.a(str, map, context);
                    if (z) {
                        break;
                    }
                    t = t.f35868a;
                    continue;
                } else {
                    t = t.f35868a;
                    continue;
                }
            } while (t != null);
            return z;
        }
    }
}
