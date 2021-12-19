package com.bytedance.im.core.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class bc {

    /* renamed from: g  reason: collision with root package name */
    private static bc f37884g;

    /* renamed from: a  reason: collision with root package name */
    public int f37885a;

    /* renamed from: b  reason: collision with root package name */
    public long f37886b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f37887c = true;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, h> f37888d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public List<ai> f37889e;

    /* renamed from: f  reason: collision with root package name */
    public Set<Object> f37890f = new HashSet();

    /* renamed from: h  reason: collision with root package name */
    private int f37891h = 0;

    static {
        Covode.recordClassIndex(22732);
    }

    private bc() {
    }

    public final void b() {
        Iterator<Object> it = this.f37890f.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public static bc a() {
        MethodCollector.i(9916);
        if (f37884g == null) {
            synchronized (bc.class) {
                try {
                    if (f37884g == null) {
                        f37884g = new bc();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9916);
                    throw th;
                }
            }
        }
        bc bcVar = f37884g;
        MethodCollector.o(9916);
        return bcVar;
    }
}
