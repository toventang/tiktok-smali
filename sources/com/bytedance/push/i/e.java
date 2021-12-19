package com.bytedance.push.i;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.f.c;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.bytedance.push.settings.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static Map<Integer, c> f42199a;

    static {
        Covode.recordClassIndex(25787);
    }

    private static void b(Context context) {
        if (f42199a == null) {
            List<c> j2 = ((LocalFrequencySettings) h.a(context, LocalFrequencySettings.class)).j();
            if (j2 == null) {
                f42199a = new HashMap();
                return;
            }
            HashMap hashMap = new HashMap();
            for (c cVar : j2) {
                if (cVar != null) {
                    hashMap.put(Integer.valueOf(cVar.f42132e), cVar);
                }
            }
            f42199a = hashMap;
        }
    }

    public static synchronized Map<Integer, c> a(Context context) {
        synchronized (e.class) {
            MethodCollector.i(6476);
            b(context);
            Map<Integer, c> map = f42199a;
            if (map == null) {
                MethodCollector.o(6476);
                return null;
            }
            Map<Integer, c> unmodifiableMap = Collections.unmodifiableMap(map);
            MethodCollector.o(6476);
            return unmodifiableMap;
        }
    }

    static synchronized c a(Context context, int i2) {
        synchronized (e.class) {
            MethodCollector.i(6471);
            b(context);
            Map<Integer, c> map = f42199a;
            if (map == null) {
                MethodCollector.o(6471);
                return null;
            }
            c cVar = map.get(Integer.valueOf(i2));
            MethodCollector.o(6471);
            return cVar;
        }
    }

    static synchronized void a(Context context, c cVar) {
        synchronized (e.class) {
            MethodCollector.i(6473);
            b(context);
            Map<Integer, c> map = f42199a;
            if (map == null) {
                MethodCollector.o(6473);
                return;
            }
            map.put(Integer.valueOf(cVar.f42132e), cVar);
            ((LocalFrequencySettings) h.a(context, LocalFrequencySettings.class)).a(new ArrayList(f42199a.values()));
            MethodCollector.o(6473);
        }
    }
}
