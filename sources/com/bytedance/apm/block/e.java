package com.bytedance.apm.block;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static List<d> f24658a = new ArrayList(2);

    static {
        Covode.recordClassIndex(14496);
    }

    public static synchronized void a(d dVar) {
        synchronized (e.class) {
            f24658a.add(dVar);
        }
    }

    public static synchronized void a(boolean z, long j2, boolean z2) {
        synchronized (e.class) {
            for (d dVar : f24658a) {
                if (dVar != null) {
                    dVar.a(z, j2, z2);
                }
            }
        }
    }
}
