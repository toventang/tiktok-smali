package com.bytedance.apm;

import com.bytedance.apm.config.e;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static List<e> f24925a = new ArrayList(2);

    static {
        Covode.recordClassIndex(14563);
    }

    public static synchronized void a(e eVar) {
        synchronized (f.class) {
            f24925a.add(eVar);
        }
    }

    public static synchronized void a(e eVar) {
        synchronized (f.class) {
            for (e eVar2 : f24925a) {
                if (eVar2 != null) {
                    eVar2.a(eVar);
                }
            }
        }
    }
}
