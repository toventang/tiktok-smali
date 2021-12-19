package com.bytedance.android.livesdk.as;

import android.util.Pair;
import com.bytedance.android.live.network.d;
import com.bytedance.android.livesdk.as.i;
import com.bytedance.android.livesdk.livesetting.message.LiveUplinkStrategySetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.q;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManagerV2;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentHashMap;

public class b {

    /* renamed from: e  reason: collision with root package name */
    private static b f14063e;

    /* renamed from: a  reason: collision with root package name */
    final ConcurrentHashMap<Class<?>, Pair<IMessageManagerV2, Object>> f14064a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public IMessageManager f14065b;

    /* renamed from: c  reason: collision with root package name */
    public final d f14066c = new d() {
        /* class com.bytedance.android.livesdk.as.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(7802);
        }

        @Override // com.bytedance.android.live.network.d
        public final <T> boolean a(Class<T> cls) {
            return LiveUplinkStrategySetting.INSTANCE.getUplinkApiAllowedList().containsKey(b.a(cls));
        }

        @Override // com.bytedance.android.live.network.d
        public final <T> T a(Class<T> cls, T t) {
            b bVar = b.this;
            if (!(bVar.f14065b instanceof IMessageManagerV2)) {
                return t;
            }
            IMessageManagerV2 iMessageManagerV2 = (IMessageManagerV2) bVar.f14065b;
            if (!LiveUplinkStrategySetting.INSTANCE.supportUplink() || !iMessageManagerV2.isWsConnected()) {
                return t;
            }
            Pair<IMessageManagerV2, Object> pair = bVar.f14064a.get(cls);
            if (pair == null || pair.first != iMessageManagerV2) {
                if (!cls.isInterface()) {
                    throw new IllegalArgumentException("API declarations must be interfaces.");
                } else if (cls.getInterfaces().length <= 0) {
                    pair = new Pair<>(iMessageManagerV2, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new c(bVar, iMessageManagerV2, cls, t)));
                    bVar.f14064a.put(cls, pair);
                } else {
                    throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
                }
            }
            return pair.second == null ? t : (T) pair.second;
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentHashMap<Method, Pair<IMessageManagerV2, i<?>>> f14067d = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(7801);
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(9355);
        if (f14063e == null) {
            synchronized (b.class) {
                try {
                    if (f14063e == null) {
                        f14063e = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9355);
                    throw th;
                }
            }
        }
        b bVar = f14063e;
        MethodCollector.o(9355);
        return bVar;
    }

    public static <T> String a(Class<T> cls) {
        if (cls == null) {
            return "";
        }
        return cls.getSimpleName();
    }

    private i<?> a(IMessageManagerV2 iMessageManagerV2, q qVar, Method method) {
        Pair<IMessageManagerV2, i<?>> pair;
        MethodCollector.i(9683);
        synchronized (this.f14067d) {
            try {
                pair = this.f14067d.get(method);
                if (pair == null || pair.first != iMessageManagerV2) {
                    pair = new Pair<>(iMessageManagerV2, new i.a(qVar, method).a());
                    this.f14067d.put(method, pair);
                }
            } catch (Throwable th) {
                MethodCollector.o(9683);
                throw th;
            }
        }
        i<?> iVar = (i) pair.second;
        MethodCollector.o(9683);
        return iVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01a6 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object a(com.ss.ugc.live.sdk.message.interfaces.IMessageManagerV2 r14, java.lang.Class r15, java.lang.Object r16, java.lang.Object r17, java.lang.reflect.Method r18, java.lang.Object[] r19) {
        /*
        // Method dump skipped, instructions count: 532
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.as.b.a(com.ss.ugc.live.sdk.message.interfaces.IMessageManagerV2, java.lang.Class, java.lang.Object, java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
