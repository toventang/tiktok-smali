package com.ttnet.org.chromium.net;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.c;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

public abstract class e {

    /* renamed from: b  reason: collision with root package name */
    private static final String f155470b = e.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    protected final Context f155471a;

    public abstract c.a a();

    public abstract String b();

    public abstract String c();

    static {
        Covode.recordClassIndex(103422);
    }

    public String toString() {
        return "[class=" + getClass().getName() + ", name=" + b() + ", version=" + c() + ", enabled=true]";
    }

    public e(Context context) {
        if (context != null) {
            this.f155471a = context;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.Set<com.ttnet.org.chromium.net.e> */
    /* JADX WARN: Multi-variable type inference failed */
    static boolean a(Context context, String str, Set<e> set) {
        try {
            set.add(context.getClassLoader().loadClass(str).asSubclass(e.class).getConstructor(Context.class).newInstance(context));
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }
}
