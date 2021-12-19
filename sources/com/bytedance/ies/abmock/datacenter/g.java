package com.bytedance.ies.abmock.datacenter;

import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.datacenter.c.a;
import com.google.gson.f;

public abstract class g extends j {
    static {
        Covode.recordClassIndex(18610);
    }

    @Override // com.bytedance.ies.abmock.datacenter.i, com.bytedance.ies.abmock.datacenter.j
    public final boolean c(String str) {
        if (e.a().f31827c) {
            return a.f31807a.b(str);
        }
        return h.f31834a.f31835b.contains(str);
    }

    @Override // com.bytedance.ies.abmock.datacenter.i, com.bytedance.ies.abmock.datacenter.j
    public final String[] a(String str) {
        if (e.a().f31827c) {
            return a.f31807a.a(str);
        }
        return h.f31834a.a(str);
    }

    @Override // com.bytedance.ies.abmock.datacenter.i, com.bytedance.ies.abmock.datacenter.j
    public final String[] b(String str) {
        return h.f31834a.a(str);
    }

    @Override // com.bytedance.ies.abmock.datacenter.i, com.bytedance.ies.abmock.datacenter.j
    public final void a(String str, double d2) {
        h.f31834a.f31835b.storeDouble(str, d2);
    }

    @Override // com.bytedance.ies.abmock.datacenter.i, com.bytedance.ies.abmock.datacenter.j
    public final void b(String str, String str2) {
        h.f31834a.a(str, str2);
    }

    @Override // com.bytedance.ies.abmock.datacenter.i, com.bytedance.ies.abmock.datacenter.j
    public final int c(String str, int i2) {
        return h.f31834a.a(str, i2);
    }

    @Override // com.bytedance.ies.abmock.datacenter.i, com.bytedance.ies.abmock.datacenter.j
    public final String d(String str, String str2) {
        return h.f31834a.b(str, str2);
    }

    @Override // com.bytedance.ies.abmock.datacenter.i, com.bytedance.ies.abmock.datacenter.j
    public final void a(String str, float f2) {
        h.f31834a.f31835b.storeFloat(str, f2);
    }

    @Override // com.bytedance.ies.abmock.datacenter.i, com.bytedance.ies.abmock.datacenter.j
    public final double b(String str, double d2) {
        return h.f31834a.f31835b.getDouble(str, d2);
    }

    @Override // com.bytedance.ies.abmock.datacenter.i, com.bytedance.ies.abmock.datacenter.j
    public final boolean c(String str, boolean z) {
        return h.f31834a.a(str, z);
    }

    @Override // com.bytedance.ies.abmock.datacenter.i, com.bytedance.ies.abmock.datacenter.j
    public final Object a(String str, Class cls) {
        if (e.a().f31827c) {
            return a.f31807a.a(str, cls);
        }
        return b(str, cls);
    }

    @Override // com.bytedance.ies.abmock.datacenter.i, com.bytedance.ies.abmock.datacenter.j
    public final float b(String str, float f2) {
        return h.f31834a.f31835b.getFloat(str, f2);
    }

    @Override // com.bytedance.ies.abmock.datacenter.i, com.bytedance.ies.abmock.datacenter.j
    public final String c(String str, String str2) {
        if (e.a().f31827c) {
            return a.f31807a.a(str, str2);
        }
        return d(str, str2);
    }

    @Override // com.bytedance.ies.abmock.datacenter.i, com.bytedance.ies.abmock.datacenter.j
    public final void a(String str, int i2) {
        h.f31834a.f31835b.storeInt(str, i2);
    }

    @Override // com.bytedance.ies.abmock.datacenter.i, com.bytedance.ies.abmock.datacenter.j
    public final int b(String str, int i2) {
        if (e.a().f31827c) {
            return a.f31807a.a(str, i2);
        }
        return c(str, i2);
    }

    @Override // com.bytedance.ies.abmock.datacenter.i, com.bytedance.ies.abmock.datacenter.j
    public final void a(String str, long j2) {
        h.f31834a.f31835b.storeLong(str, j2);
    }

    @Override // com.bytedance.ies.abmock.datacenter.i, com.bytedance.ies.abmock.datacenter.j
    public final long b(String str, long j2) {
        return h.f31834a.f31835b.getLong(str, j2);
    }

    @Override // com.bytedance.ies.abmock.datacenter.i, com.bytedance.ies.abmock.datacenter.j
    public final void a(String str, String str2) {
        h.f31834a.a(str, str2);
    }

    @Override // com.bytedance.ies.abmock.datacenter.i, com.bytedance.ies.abmock.datacenter.j
    public final Object b(String str, Class cls) {
        String b2 = h.f31834a.b(str, null);
        if (b2 != null) {
            try {
                h hVar = h.f31834a;
                if (hVar.f31836c == null) {
                    hVar.f31836c = new f();
                }
                return hVar.f31836c.a(b2, cls);
            } catch (Throwable th) {
                b.a(th);
            }
        }
        return null;
    }

    @Override // com.bytedance.ies.abmock.datacenter.i, com.bytedance.ies.abmock.datacenter.j
    public final void a(String str, boolean z) {
        h.f31834a.f31835b.storeBoolean(str, z);
    }

    @Override // com.bytedance.ies.abmock.datacenter.i, com.bytedance.ies.abmock.datacenter.j
    public final boolean b(String str, boolean z) {
        if (e.a().f31827c) {
            return a.f31807a.a(str, z);
        }
        return c(str, z);
    }
}
