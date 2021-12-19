package com.google.b.a.e;

import com.bytedance.covode.number.Covode;
import com.google.b.a.f.a.a.a.a.b;
import com.google.b.a.g.d;
import com.google.b.a.g.f;
import com.google.b.a.g.g;
import com.google.b.a.g.h;
import com.google.b.a.g.i;
import com.google.b.a.g.j;
import com.google.b.a.g.n;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

public abstract class c {
    static {
        Covode.recordClassIndex(33158);
    }

    public abstract void a();

    public abstract void a(double d2);

    public abstract void a(float f2);

    public abstract void a(int i2);

    public abstract void a(long j2);

    public abstract void a(String str);

    public abstract void a(BigDecimal bigDecimal);

    public abstract void a(BigInteger bigInteger);

    public abstract void a(boolean z);

    public abstract void b();

    public abstract void b(String str);

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    /* access modifiers changed from: package-private */
    public final void a(boolean z, Object obj) {
        boolean z2;
        Map gVar;
        Field field;
        boolean z3;
        if (obj != null) {
            Class<?> cls = obj.getClass();
            if (f.a(obj)) {
                f();
            } else if (obj instanceof String) {
                b((String) obj);
            } else {
                boolean z4 = true;
                if (obj instanceof Number) {
                    if (z) {
                        b(obj.toString());
                    } else if (obj instanceof BigDecimal) {
                        a((BigDecimal) obj);
                    } else if (obj instanceof BigInteger) {
                        a((BigInteger) obj);
                    } else if (obj instanceof Long) {
                        a(((Long) obj).longValue());
                    } else if (obj instanceof Float) {
                        float floatValue = ((Number) obj).floatValue();
                        if (Float.isInfinite(floatValue) || Float.isNaN(floatValue)) {
                            z4 = false;
                        }
                        b.a(z4);
                        a(floatValue);
                    } else if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                        a(((Number) obj).intValue());
                    } else {
                        double doubleValue = ((Number) obj).doubleValue();
                        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                            z4 = false;
                        }
                        b.a(z4);
                        a(doubleValue);
                    }
                } else if (obj instanceof Boolean) {
                    a(((Boolean) obj).booleanValue());
                } else if (obj instanceof h) {
                    b(((h) obj).toStringRfc3339());
                } else if ((obj instanceof Iterable) || cls.isArray()) {
                    b();
                    for (Object obj2 : n.a(obj)) {
                        a(z, obj2);
                    }
                    c();
                } else if (cls.isEnum()) {
                    String str = i.a((Enum<?>) ((Enum) obj)).f53659c;
                    if (str == null) {
                        f();
                    } else {
                        b(str);
                    }
                } else {
                    d();
                    boolean z5 = obj instanceof Map;
                    if (!z5 || (obj instanceof j)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    d dVar = null;
                    if (!z2) {
                        dVar = d.a(cls, false);
                    }
                    if (f.a(obj)) {
                        gVar = Collections.emptyMap();
                    } else if (z5) {
                        gVar = (Map) obj;
                    } else {
                        gVar = new g(obj, false);
                    }
                    for (Map.Entry entry : gVar.entrySet()) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) entry.getKey();
                            if (z2) {
                                z3 = z;
                            } else {
                                i a2 = dVar.a(str2);
                                if (a2 == null || (field = a2.f53658b) == null || field.getAnnotation(e.class) == null) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                            }
                            a(str2);
                            a(z3, value);
                        }
                    }
                    e();
                }
            }
        }
    }
}
