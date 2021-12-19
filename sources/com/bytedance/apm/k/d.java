package com.bytedance.apm.k;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import com.bytedance.apm.k.a.b;
import com.bytedance.covode.number.Covode;

public final class d {
    static {
        Covode.recordClassIndex(14653);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038 A[Catch:{ Exception -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[Catch:{ Exception -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.apm.k.a.a a() {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.k.d.a():com.bytedance.apm.k.a.a");
    }

    public static b a(Context context) {
        b bVar = new b();
        try {
            long j2 = Runtime.getRuntime().totalMemory();
            long freeMemory = Runtime.getRuntime().freeMemory();
            bVar.f25061a = j2;
            bVar.f25062b = freeMemory;
            bVar.f25063c = j2 - freeMemory;
            Debug.MemoryInfo a2 = com.bytedance.apm.q.b.a(Process.myPid(), context);
            if (a2 != null) {
                int i2 = a2.dalvikPss;
                int i3 = a2.nativePss;
                int totalPss = a2.getTotalPss();
                if (Build.VERSION.SDK_INT >= 23) {
                    try {
                        bVar.f25067g = ((long) Integer.parseInt(a2.getMemoryStat("summary.graphics"))) * 1024;
                        bVar.s = ((long) Integer.parseInt(a2.getMemoryStat("summary.java-heap"))) * 1024;
                        bVar.t = ((long) Integer.parseInt(a2.getMemoryStat("summary.native-heap"))) * 1024;
                        bVar.u = ((long) Integer.parseInt(a2.getMemoryStat("summary.code"))) * 1024;
                        bVar.v = ((long) Integer.parseInt(a2.getMemoryStat("summary.stack"))) * 1024;
                        bVar.w = ((long) Integer.parseInt(a2.getMemoryStat("summary.private-other"))) * 1024;
                        bVar.x = ((long) Integer.parseInt(a2.getMemoryStat("summary.system"))) * 1024;
                        bVar.r = ((long) Integer.parseInt(a2.getMemoryStat("summary.total-pss"))) * 1024;
                        bVar.q = ((long) Integer.parseInt(a2.getMemoryStat("summary.total-swap"))) * 1024;
                    } catch (Exception unused) {
                    }
                }
                bVar.f25064d = ((long) i2) * 1024;
                bVar.f25065e = ((long) i3) * 1024;
                bVar.f25066f = ((long) totalPss) * 1024;
                bVar.f25069i = ((long) a2.dalvikPrivateDirty) * 1024;
                bVar.f25070j = ((long) a2.dalvikSharedDirty) * 1024;
                bVar.f25071k = ((long) a2.otherPss) * 1024;
                bVar.f25072l = ((long) a2.otherPrivateDirty) * 1024;
                bVar.f25073m = ((long) a2.otherSharedDirty) * 1024;
                bVar.n = ((long) a2.getTotalSwappablePss()) * 1024;
                bVar.o = ((long) a2.getTotalPrivateDirty()) * 1024;
                bVar.p = ((long) a2.getTotalSharedClean()) * 1024;
            }
            bVar.f25068h = com.bytedance.apm.q.b.e() * 1024;
        } catch (Exception unused2) {
        }
        return bVar;
    }
}
