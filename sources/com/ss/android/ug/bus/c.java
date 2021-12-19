package com.ss.android.ug.bus;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<Type, ConcurrentHashMap<a, Object>> f61870a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f61871b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final Handler f61872c = new Handler(Looper.getMainLooper());

    public interface a<T> {
        static {
            Covode.recordClassIndex(38035);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(38032);
    }

    public static <Event> void a(final Event event) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            f61872c.post(new Runnable() {
                /* class com.ss.android.ug.bus.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(38034);
                }

                public final void run() {
                    c.a(event);
                }
            });
            return;
        }
        ConcurrentHashMap<a, Object> concurrentHashMap = f61870a.get(event.getClass());
        if (concurrentHashMap != null) {
            for (a aVar : concurrentHashMap.keySet()) {
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
    }

    public static <EVENT> void a(final m mVar, final a<EVENT> aVar) {
        if (aVar != null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                f61872c.post(new Runnable() {
                    /* class com.ss.android.ug.bus.c.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(38033);
                    }

                    public final void run() {
                        c.a(mVar, aVar);
                    }
                });
                return;
            }
            Type type = ((ParameterizedType) aVar.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0];
            ConcurrentHashMap<Type, ConcurrentHashMap<a, Object>> concurrentHashMap = f61870a;
            ConcurrentHashMap<a, Object> concurrentHashMap2 = concurrentHashMap.get(type);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap<>();
                concurrentHashMap.put(type, concurrentHashMap2);
            }
            concurrentHashMap2.put(aVar, f61871b);
            if (mVar != null) {
                mVar.getLifecycle().a(new UgCallbackCenter$2(concurrentHashMap2, aVar, type));
            }
        }
    }
}
