package com.g.a;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class a {

    /* renamed from: a  reason: collision with root package name */
    static a f49252a = new a();

    /* renamed from: b  reason: collision with root package name */
    private Class<?> f49253b;

    /* renamed from: c  reason: collision with root package name */
    private Object f49254c;

    /* renamed from: d  reason: collision with root package name */
    private Method f49255d;

    static {
        Covode.recordClassIndex(30821);
    }

    private a() {
        try {
            Class<?> cls = Class.forName("com.vivo.gamewatch.common.GameWatchManager");
            this.f49253b = cls;
            this.f49254c = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public final Object[] a(String str, Object... objArr) {
        Class<?> cls;
        if (this.f49254c == null || (cls = this.f49253b) == null) {
            return null;
        }
        try {
            if (this.f49255d == null) {
                this.f49255d = cls.getMethod("execute", String.class, Object[].class);
            }
            return (Object[]) this.f49255d.invoke(this.f49254c, str, objArr);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
