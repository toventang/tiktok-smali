package com.bytedance.ies.abmock.datacenter;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.datacenter.a.a;
import com.bytedance.ies.abmock.datacenter.c.b;
import com.google.gson.f;
import com.google.gson.l;
import com.google.gson.o;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class e {

    /* renamed from: f  reason: collision with root package name */
    private static volatile e f31823f;

    /* renamed from: j  reason: collision with root package name */
    private static final Object f31824j = new Object();

    /* renamed from: a  reason: collision with root package name */
    public a f31825a;

    /* renamed from: b  reason: collision with root package name */
    public f f31826b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f31827c;

    /* renamed from: d  reason: collision with root package name */
    public int f31828d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f31829e = false;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, Object> f31830g = new ConcurrentHashMap();

    /* renamed from: h  reason: collision with root package name */
    private Map<String, Object> f31831h = new ConcurrentHashMap();

    /* renamed from: i  reason: collision with root package name */
    private f f31832i = new f();

    public final String[] a(String str, boolean z) {
        String[] a2;
        Object a3 = a(str, String[].class);
        Object obj = f31824j;
        if (a3 == obj) {
            if (this.f31829e) {
                return null;
            }
            a(str);
        } else if (a3 != null) {
            return (String[]) a3;
        }
        f fVar = this.f31826b;
        if (fVar == null || !fVar.e() || !b.f31810a.b(str)) {
            a2 = com.bytedance.ies.abmock.datacenter.c.a.f31807a.a(str);
        } else {
            a2 = b.f31810a.a(str);
        }
        if (a2 != null || !this.f31829e) {
            a(str, a2, z);
        } else {
            a(str, obj, z);
        }
        return a2;
    }

    public final Object a(String str, boolean z, boolean z2, Class cls) {
        Object a2;
        Object a3 = a(str, cls);
        Object obj = f31824j;
        if (a3 == obj) {
            if (this.f31829e) {
                return null;
            }
            a(str);
        } else if (a3 != null) {
            return a3;
        }
        f fVar = this.f31826b;
        if (fVar == null || !fVar.e() || !b.f31810a.b(str)) {
            a2 = com.bytedance.ies.abmock.datacenter.c.a.f31807a.a(str, cls);
        } else {
            a2 = b.f31810a.a(str, cls);
        }
        if (a2 != null || !this.f31829e) {
            a(str, a2, z, z2);
        } else {
            a(str, obj, z, z2);
        }
        return a2;
    }

    public final boolean a(String str, boolean z, boolean z2) {
        Boolean valueOf;
        Object a2 = a(str, (Class) null);
        if (a2 != null) {
            return ((Boolean) a2).booleanValue();
        }
        f fVar = this.f31826b;
        if (fVar == null || !fVar.e() || !b.f31810a.b(str)) {
            valueOf = Boolean.valueOf(com.bytedance.ies.abmock.datacenter.c.a.f31807a.a(str, z));
        } else {
            valueOf = Boolean.valueOf(b.f31810a.a(str, z));
        }
        a(str, valueOf, z2);
        return valueOf.booleanValue();
    }

    public final String a(String str, String str2, boolean z) {
        String a2;
        Object a3 = a(str, (Class) null);
        if (a3 != null) {
            return (String) a3;
        }
        f fVar = this.f31826b;
        if (fVar == null || !fVar.e() || !b.f31810a.b(str)) {
            a2 = com.bytedance.ies.abmock.datacenter.c.a.f31807a.a(str, str2);
        } else {
            a2 = b.f31810a.a(str, str2);
        }
        a(str, (Object) a2, z);
        return a2;
    }

    static {
        Covode.recordClassIndex(18607);
    }

    private e() {
    }

    public static e a() {
        MethodCollector.i(1494);
        if (f31823f == null) {
            synchronized (e.class) {
                try {
                    if (f31823f == null) {
                        f31823f = new e();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1494);
                    throw th;
                }
            }
        }
        e eVar = f31823f;
        MethodCollector.o(1494);
        return eVar;
    }

    public final void b() {
        this.f31831h.clear();
        if (this.f31829e) {
            for (Map.Entry<String, Object> entry : this.f31830g.entrySet()) {
                if (!(entry == null || entry.getValue() != f31824j || entry.getKey() == null)) {
                    this.f31830g.remove(entry.getKey());
                }
            }
        }
    }

    private Object b(String str) {
        Object obj = this.f31830g.get(str);
        if (obj != null) {
            return obj;
        }
        return this.f31831h.get(str);
    }

    public final void a(String str) {
        if (str != null) {
            this.f31830g.remove(str);
            this.f31831h.remove(str);
        }
    }

    private Object a(String str, Class cls) {
        Object obj;
        if (!this.f31825a.enable() || (obj = this.f31825a.get(str)) == null) {
            return b(str);
        }
        if (cls == null || obj.getClass().isAssignableFrom(cls) || !(obj instanceof o)) {
            return obj;
        }
        return this.f31832i.a((l) obj, cls);
    }

    private void a(String str, Object obj, boolean z) {
        a(str, obj, z, false);
    }

    public final double a(String str, double d2, boolean z) {
        Double valueOf;
        Object a2 = a(str, (Class) null);
        if (a2 != null) {
            return ((Double) a2).doubleValue();
        }
        f fVar = this.f31826b;
        if (fVar == null || !fVar.e() || !b.f31810a.b(str)) {
            valueOf = Double.valueOf(com.bytedance.ies.abmock.datacenter.c.a.f31807a.a(str, d2));
        } else {
            valueOf = Double.valueOf(b.f31810a.a(str, d2));
        }
        a(str, valueOf, z);
        return valueOf.doubleValue();
    }

    public final float a(String str, float f2, boolean z) {
        Float valueOf;
        Object a2 = a(str, (Class) null);
        if (a2 != null) {
            return ((Float) a2).floatValue();
        }
        f fVar = this.f31826b;
        if (fVar == null || !fVar.e() || !b.f31810a.b(str)) {
            valueOf = Float.valueOf(com.bytedance.ies.abmock.datacenter.c.a.f31807a.a(str, f2));
        } else {
            valueOf = Float.valueOf(b.f31810a.a(str, f2));
        }
        a(str, valueOf, z);
        return valueOf.floatValue();
    }

    public final int a(String str, int i2, boolean z) {
        Integer valueOf;
        Object a2 = a(str, (Class) null);
        if (a2 != null) {
            return ((Integer) a2).intValue();
        }
        f fVar = this.f31826b;
        if (fVar == null || !fVar.e() || !b.f31810a.b(str)) {
            valueOf = Integer.valueOf(com.bytedance.ies.abmock.datacenter.c.a.f31807a.a(str, i2));
        } else {
            valueOf = Integer.valueOf(b.f31810a.a(str, i2));
        }
        a(str, valueOf, z);
        return valueOf.intValue();
    }

    public final long a(String str, long j2, boolean z) {
        Long valueOf;
        Object a2 = a(str, (Class) null);
        if (a2 != null) {
            return ((Long) a2).longValue();
        }
        f fVar = this.f31826b;
        if (fVar == null || !fVar.e() || !b.f31810a.b(str)) {
            valueOf = Long.valueOf(com.bytedance.ies.abmock.datacenter.c.a.f31807a.a(str, j2));
        } else {
            valueOf = Long.valueOf(b.f31810a.a(str, j2));
        }
        a(str, valueOf, z);
        return valueOf.longValue();
    }

    private void a(String str, Object obj, boolean z, boolean z2) {
        com.bytedance.ies.abmock.datacenter.b.a.f31805d.a(str);
        if (z2 || obj == null) {
            return;
        }
        if (z) {
            this.f31830g.put(str, obj);
        } else {
            this.f31831h.put(str, obj);
        }
    }
}
