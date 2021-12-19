package com.bytedance.push.settings;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.settings.a.a;
import com.bytedance.push.settings.storage.i;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<Class<? extends ILocalSettings>, ILocalSettings> f42309a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final i f42310b;

    static {
        Covode.recordClassIndex(25849);
    }

    f(i iVar) {
        this.f42310b = iVar;
    }

    /* access modifiers changed from: package-private */
    public final <T extends ILocalSettings> T a(Context context, Class<T> cls) {
        MethodCollector.i(8184);
        ILocalSettings iLocalSettings = (T) this.f42309a.get(cls);
        if (iLocalSettings == null) {
            synchronized (this) {
                try {
                    iLocalSettings = this.f42309a.get(cls);
                    if (iLocalSettings == null) {
                        iLocalSettings = (T) b(context, cls);
                        this.f42309a.put(cls, iLocalSettings);
                    }
                } finally {
                    MethodCollector.o(8184);
                }
            }
        }
        return iLocalSettings;
    }

    private <T extends ILocalSettings> T b(Context context, Class<T> cls) {
        i iVar = this.f42310b;
        try {
            Constructor<?> constructor = Class.forName(cls.getName() + "$$SettingImpl", true, cls.getClassLoader()).getConstructor(Context.class, i.class);
            a aVar = (a) cls.getAnnotation(a.class);
            if (aVar != null) {
                String a2 = aVar.a();
                return (T) ((ILocalSettings) constructor.newInstance(context, iVar.a(context, aVar.b(), a2)));
            }
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
        } catch (InstantiationException e5) {
            e5.printStackTrace();
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
        }
        throw new IllegalStateException("get settings instance error，please check warning log");
    }
}
