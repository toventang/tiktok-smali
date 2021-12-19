package com.google.b.a.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.b.a.f.a.a.a.a.b;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.WeakHashMap;

public final class i {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<Field, i> f53656d = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f53657a;

    /* renamed from: b  reason: collision with root package name */
    public final Field f53658b;

    /* renamed from: c  reason: collision with root package name */
    public final String f53659c;

    static {
        Covode.recordClassIndex(33188);
    }

    public final <T extends Enum<T>> T b() {
        return (T) Enum.valueOf(this.f53658b.getDeclaringClass(), this.f53658b.getName());
    }

    public final boolean a() {
        return Modifier.isFinal(this.f53658b.getModifiers());
    }

    public final Object a(Object obj) {
        return a(this.f53658b, obj);
    }

    public static i a(Enum<?> r5) {
        boolean z;
        try {
            i a2 = a(r5.getClass().getField(r5.name()));
            if (a2 != null) {
                z = true;
            } else {
                z = false;
            }
            b.a(z, "enum constant missing @Value or @NullValue annotation: %s", r5);
            return a2;
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static i a(Field field) {
        MethodCollector.i(3434);
        String str = null;
        if (field == null) {
            MethodCollector.o(3434);
            return null;
        }
        Map<Field, i> map = f53656d;
        synchronized (map) {
            try {
                i iVar = map.get(field);
                boolean isEnumConstant = field.isEnumConstant();
                if (iVar == null) {
                    if (isEnumConstant) {
                        o oVar = (o) field.getAnnotation(o.class);
                        if (oVar != null) {
                            str = oVar.a();
                        } else if (((l) field.getAnnotation(l.class)) == null) {
                            MethodCollector.o(3434);
                            return null;
                        }
                    } else if (!Modifier.isStatic(field.getModifiers())) {
                        k kVar = (k) field.getAnnotation(k.class);
                        if (kVar == null) {
                            return null;
                        }
                        str = kVar.a();
                        field.setAccessible(true);
                    }
                    if ("##default".equals(str)) {
                        str = field.getName();
                    }
                    iVar = new i(field, str);
                    map.put(field, iVar);
                }
                MethodCollector.o(3434);
                return iVar;
            } finally {
                MethodCollector.o(3434);
            }
        }
    }

    private static Object a(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private i(Field field, String str) {
        String intern;
        this.f53658b = field;
        if (str == null) {
            intern = null;
        } else {
            intern = str.intern();
        }
        this.f53659c = intern;
        this.f53657a = f.a((Type) field.getType());
    }

    public final void a(Object obj, Object obj2) {
        a(this.f53658b, obj, obj2);
    }

    public static void a(Field field, Object obj, Object obj2) {
        if (Modifier.isFinal(field.getModifiers())) {
            Object a2 = a(field, obj);
            if (obj2 == null) {
                if (a2 == null) {
                    return;
                }
            } else if (obj2.equals(a2)) {
                return;
            }
            String valueOf = String.valueOf(String.valueOf(a2));
            String valueOf2 = String.valueOf(String.valueOf(obj2));
            String valueOf3 = String.valueOf(String.valueOf(field.getName()));
            String valueOf4 = String.valueOf(String.valueOf(obj.getClass().getName()));
            throw new IllegalArgumentException(new StringBuilder(valueOf.length() + 48 + valueOf2.length() + valueOf3.length() + valueOf4.length()).append("expected final value <").append(valueOf).append("> but was <").append(valueOf2).append("> on ").append(valueOf3).append(" field in ").append(valueOf4).toString());
        }
        try {
            field.set(obj, obj2);
        } catch (SecurityException e2) {
            throw new IllegalArgumentException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalArgumentException(e3);
        }
    }
}
