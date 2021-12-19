package com.bytedance.apm.trace.model.cross;

import com.bytedance.apm.trace.a.d;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TracingCrossManager {
    private static Map<Long, d> sCrossTracingContext = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(14763);
    }

    public static void unRegisterCross(long j2) {
        sCrossTracingContext.remove(Long.valueOf(j2));
    }

    public static void registerCross(long j2, d dVar) {
        sCrossTracingContext.put(Long.valueOf(j2), dVar);
    }

    public static void onPassBackAsChild(String str, String str2, ArrayList<NativeSpan> arrayList) {
        d dVar = sCrossTracingContext.get(Long.valueOf(Long.parseLong(str)));
        if (dVar != null) {
            sCrossTracingContext.remove(Long.valueOf(Long.parseLong(str)));
            dVar.a(str2, arrayList);
        }
    }

    public static void onPassBackAsReference(String str, String str2, ArrayList<NativeSpan> arrayList) {
        d dVar = sCrossTracingContext.get(Long.valueOf(Long.parseLong(str)));
        if (dVar != null) {
            sCrossTracingContext.remove(Long.valueOf(Long.parseLong(str)));
            dVar.b(str2, arrayList);
        }
    }
}
