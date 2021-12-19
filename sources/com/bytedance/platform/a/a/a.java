package com.bytedance.platform.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Class f41800a;

    /* renamed from: b  reason: collision with root package name */
    private static Field f41801b;

    /* renamed from: c  reason: collision with root package name */
    private static Object f41802c;

    /* renamed from: d  reason: collision with root package name */
    private static Object f41803d;

    /* renamed from: e  reason: collision with root package name */
    private static Set<Integer> f41804e;

    public static synchronized Object a() {
        Object obj;
        synchronized (a.class) {
            MethodCollector.i(6368);
            try {
                if (f41802c == null) {
                    f41802c = h.a(c(), "currentActivityThread", new Object[0]);
                }
                obj = f41802c;
                MethodCollector.o(6368);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                MethodCollector.o(6368);
                return null;
            }
        }
        return obj;
    }

    public static synchronized Object b() {
        Object obj;
        synchronized (a.class) {
            MethodCollector.i(6369);
            if (f41803d == null) {
                try {
                    f41803d = d().get(a());
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                }
            }
            obj = f41803d;
            MethodCollector.o(6369);
        }
        return obj;
    }

    private static synchronized Class c() {
        Class cls;
        synchronized (a.class) {
            MethodCollector.i(6364);
            if (f41800a == null) {
                try {
                    f41800a = Class.forName("android.app.ActivityThread");
                } catch (ClassNotFoundException e2) {
                    e2.printStackTrace();
                }
            }
            cls = f41800a;
            MethodCollector.o(6364);
        }
        return cls;
    }

    private static synchronized Field d() {
        Field field;
        synchronized (a.class) {
            MethodCollector.i(6367);
            if (f41801b == null) {
                f41801b = d.a(c(), "mH");
            }
            field = f41801b;
            MethodCollector.o(6367);
        }
        return field;
    }

    static {
        Covode.recordClassIndex(25558);
        HashSet hashSet = new HashSet();
        f41804e = hashSet;
        hashSet.add(113);
        f41804e.add(114);
        f41804e.add(115);
        f41804e.add(116);
        f41804e.add(121);
        f41804e.add(122);
        f41804e.add(100);
        f41804e.add(159);
        f41804e.add(123);
    }
}
