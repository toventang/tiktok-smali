package com.bytedance.push.settings;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.settings.a.a;
import com.bytedance.push.settings.storage.h;
import com.bytedance.push.settings.storage.i;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<Class<? extends ISettings>, ISettings> f42311a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<Class<? extends ISettings>, Object> f42312b = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(25850);
    }

    g() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.ClassNotFoundException */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: java.lang.NoSuchMethodException */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: java.lang.IllegalAccessException */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: java.lang.reflect.InvocationTargetException */
    /* JADX WARN: Multi-variable type inference failed */
    private static <T extends ISettings> T b(Context context, Class<T> cls) {
        h hVar = h.f42313a;
        InstantiationException instantiationException = null;
        try {
            a aVar = (a) cls.getAnnotation(a.class);
            if (aVar != null) {
                i a2 = hVar.a(context, aVar.b(), aVar.a());
                T t = (T) ((ISettings) Class.forName(cls.getName() + "$$SettingImpl", true, cls.getClassLoader()).getConstructor(i.class).newInstance(a2));
                t.updateSettings(context, null);
                return t;
            }
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            instantiationException = e2;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            instantiationException = e3;
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
            instantiationException = e4;
        } catch (InstantiationException e5) {
            e5.printStackTrace();
            instantiationException = e5;
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
            instantiationException = e6;
        }
        if (instantiationException != null) {
            throw new IllegalStateException("get settings instance error，please check warning log", instantiationException);
        }
        throw new IllegalStateException("get settings instance error，please check warning log");
    }

    public final <T extends ISettings> T a(Context context, Class<T> cls) {
        Object obj;
        MethodCollector.i(3660);
        ISettings iSettings = (T) this.f42311a.get(cls);
        if (iSettings == null) {
            synchronized (this.f42312b) {
                try {
                    if (!this.f42312b.containsKey(cls) || (obj = this.f42312b.get(cls)) == null) {
                        obj = new Object();
                        this.f42312b.put(cls, obj);
                    }
                } finally {
                    MethodCollector.o(3660);
                }
            }
            synchronized (obj) {
                try {
                    iSettings = this.f42311a.get(cls);
                    if (iSettings == null && (iSettings = (T) b(context, cls)) != null) {
                        this.f42311a.put(cls, iSettings);
                    }
                } finally {
                    MethodCollector.o(3660);
                }
            }
        } else if (this.f42312b.containsKey(cls)) {
            this.f42312b.remove(cls);
        }
        return iSettings;
    }
}
