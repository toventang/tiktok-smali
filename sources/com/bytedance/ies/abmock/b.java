package com.bytedance.ies.abmock;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.datacenter.c;
import com.bytedance.ies.abmock.datacenter.c.a;
import com.bytedance.ies.abmock.datacenter.e;
import com.bytedance.ies.abmock.datacenter.f;
import com.google.gson.o;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class b {

    /* renamed from: d  reason: collision with root package name */
    private static volatile b f31793d;

    /* renamed from: a  reason: collision with root package name */
    public c f31794a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, Object> f31795b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public o f31796c;

    static {
        Covode.recordClassIndex(18590);
    }

    public final boolean a(String str, boolean z) {
        try {
            return ((Boolean) a(str, Boolean.valueOf(z))).booleanValue();
        } catch (Throwable unused) {
            return z;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T a(boolean z, String str, Class cls, Object obj) {
        boolean z2;
        try {
            T t = (T) a(z, str, cls);
            if (t == null) {
                if (e.a().f31827c) {
                    z2 = a.f31807a.b(str);
                } else {
                    z2 = com.bytedance.ies.abmock.datacenter.b.f31799a.f31800b.contains(str);
                }
                if (!z2) {
                    return obj;
                }
            }
            return t;
        } catch (Throwable unused) {
            return obj;
        }
    }

    public final boolean a(o oVar) {
        this.f31796c = oVar;
        e.a().b();
        return o.a(oVar);
    }

    public final boolean a(boolean z, String str, boolean z2) {
        if (j.a().c()) {
            e.a();
            return e.a(str, z2, z);
        }
        try {
            Object b2 = b(z, str, false);
            if (b2 != null) {
                j.a();
                return ((Boolean) b2).booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(this.f31794a.a(str, z2));
            a(str, z, valueOf);
            j.a();
            return valueOf.booleanValue();
        } catch (Throwable unused) {
            return z2;
        }
    }

    public final String a(boolean z, String str, String str2) {
        if (j.a().c()) {
            e.a();
            return e.a(str, str2, z);
        }
        try {
            Object b2 = b(z, str, false);
            if (b2 != null) {
                j.a();
                return (String) b2;
            }
            String a2 = this.f31794a.a(str, str2);
            a(str, z, a2);
            j.a();
            return a2;
        } catch (Throwable unused) {
            return str2;
        }
    }

    public final <T> T a(boolean z, String str, Class cls) {
        if (j.a().c()) {
            e.a();
            return (T) e.a(str, z, false, cls);
        }
        T t = (T) b(z, str, false);
        if (t != null) {
            j.a();
            return t;
        }
        T t2 = (T) this.f31794a.a(str, cls);
        a(str, z, t2);
        j.a();
        return t2;
    }

    public final <T> T a(boolean z, String str) {
        if (j.a().c()) {
            e.a();
            return (T) e.a(str, z);
        }
        T t = (T) b(z, str, false);
        if (t != null) {
            j.a();
            return t;
        }
        T t2 = (T) this.f31794a.a(str);
        a(str, z, t2);
        j.a();
        return t2;
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(8621);
        if (f31793d == null) {
            synchronized (b.class) {
                try {
                    if (f31793d == null) {
                        f31793d = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8621);
                    throw th;
                }
            }
        }
        b bVar = f31793d;
        MethodCollector.o(8621);
        return bVar;
    }

    public final void a(String str) {
        if (str != null) {
            this.f31795b.remove(str);
        }
    }

    private <T> T a(String str, T t) {
        T t2 = (T) b(true, str, true);
        if (t2 != null) {
            j.a();
            return t2;
        }
        a(str, true, (Object) t);
        j.a();
        return t;
    }

    public final int a(String str, int i2) {
        try {
            return ((Integer) a(str, Integer.valueOf(i2))).intValue();
        } catch (Throwable unused) {
            return i2;
        }
    }

    private void a(String str, boolean z, Object obj) {
        if (z && obj != null) {
            this.f31795b.put(str, obj);
        }
    }

    private Object b(boolean z, String str, boolean z2) {
        Object obj;
        Object obj2;
        Object obj3;
        if (z2) {
            f fVar = j.a().f31867d;
            if (!(fVar == null || fVar.c() == null || !fVar.c().enable() || !fVar.a() || (obj3 = fVar.c().get(str)) == null)) {
                return obj3;
            }
        } else if (j.a().d().enable() && j.a().b() && (obj2 = j.a().d().get(str)) != null) {
            a.a(str + " use mock data!!");
            return obj2;
        }
        if (!z || (obj = this.f31795b.get(str)) == null) {
            return null;
        }
        return obj;
    }

    public final double a(boolean z, String str, double d2) {
        if (j.a().c()) {
            e.a();
            return e.a(str, d2, z);
        }
        try {
            Object b2 = b(z, str, false);
            if (b2 != null) {
                j.a();
                return ((Double) b2).doubleValue();
            }
            Double valueOf = Double.valueOf(this.f31794a.a(str, d2));
            a(str, z, valueOf);
            j.a();
            return valueOf.doubleValue();
        } catch (Throwable unused) {
            return d2;
        }
    }

    public final float a(boolean z, String str, float f2) {
        if (j.a().c()) {
            e.a();
            return e.a(str, f2, z);
        }
        try {
            Object b2 = b(z, str, false);
            if (b2 != null) {
                j.a();
                return ((Float) b2).floatValue();
            }
            Float valueOf = Float.valueOf(this.f31794a.a(str, f2));
            a(str, z, valueOf);
            j.a();
            return valueOf.floatValue();
        } catch (Throwable unused) {
            return f2;
        }
    }

    public final int a(boolean z, String str, int i2) {
        if (j.a().c()) {
            e.a();
            return e.a(str, i2, z);
        }
        try {
            Object b2 = b(z, str, false);
            if (b2 != null) {
                j.a();
                return ((Integer) b2).intValue();
            }
            Integer valueOf = Integer.valueOf(this.f31794a.a(str, i2));
            a(str, z, valueOf);
            j.a();
            return valueOf.intValue();
        } catch (Throwable unused) {
            return i2;
        }
    }

    public final long a(boolean z, String str, long j2) {
        if (j.a().c()) {
            e.a();
            return e.a(str, j2, z);
        }
        try {
            Object b2 = b(z, str, false);
            if (b2 != null) {
                j.a();
                return ((Long) b2).longValue();
            }
            Long valueOf = Long.valueOf(this.f31794a.a(str, j2));
            a(str, z, valueOf);
            j.a();
            return valueOf.longValue();
        } catch (Throwable unused) {
            return j2;
        }
    }
}
