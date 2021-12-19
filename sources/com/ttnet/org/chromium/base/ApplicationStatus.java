package com.ttnet.org.chromium.base;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ApplicationStatus {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Activity, a> f155102a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b  reason: collision with root package name */
    public static int f155103b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static Activity f155104c;

    /* renamed from: d  reason: collision with root package name */
    public static b f155105d;

    /* renamed from: e  reason: collision with root package name */
    public static final h<b> f155106e = new h<>();

    /* renamed from: f  reason: collision with root package name */
    public static final h<Object> f155107f = new h<>();

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ boolean f155108g = true;

    /* renamed from: h  reason: collision with root package name */
    private static final h<Object> f155109h = new h<>();

    public interface b {
        static {
            Covode.recordClassIndex(103246);
        }

        void a(int i2);
    }

    public static native void nativeOnApplicationStateChange(int i2);

    private ApplicationStatus() {
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f155111a;

        /* renamed from: b  reason: collision with root package name */
        public h<Object> f155112b;

        static {
            Covode.recordClassIndex(103245);
        }

        private a() {
            this.f155111a = 6;
            this.f155112b = new h<>();
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static boolean a() {
        boolean z;
        MethodCollector.i(14009);
        synchronized (f155102a) {
            try {
                if (f155103b != 0) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
                MethodCollector.o(14009);
            }
        }
        return z;
    }

    public static int getStateForApplication() {
        int i2;
        MethodCollector.i(14012);
        synchronized (f155102a) {
            try {
                i2 = f155103b;
            } finally {
                MethodCollector.o(14012);
            }
        }
        return i2;
    }

    private static void registerThreadSafeNativeApplicationStateListener() {
        AnonymousClass3 r1 = new Runnable() {
            /* class com.ttnet.org.chromium.base.ApplicationStatus.AnonymousClass3 */

            static {
                Covode.recordClassIndex(103243);
            }

            public final void run() {
                if (ApplicationStatus.f155105d == null) {
                    AnonymousClass1 r0 = new b() {
                        /* class com.ttnet.org.chromium.base.ApplicationStatus.AnonymousClass3.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(103244);
                        }

                        @Override // com.ttnet.org.chromium.base.ApplicationStatus.b
                        public final void a(int i2) {
                            MethodCollector.i(13854);
                            ApplicationStatus.nativeOnApplicationStateChange(i2);
                            MethodCollector.o(13854);
                        }
                    };
                    ApplicationStatus.f155105d = r0;
                    ApplicationStatus.a(r0);
                }
            }
        };
        if (ThreadUtils.b()) {
            r1.run();
        } else {
            ThreadUtils.a().post(r1);
        }
    }

    static {
        Covode.recordClassIndex(103240);
    }

    private static int b() {
        boolean z = false;
        boolean z2 = false;
        for (a aVar : f155102a.values()) {
            int i2 = aVar.f155111a;
            if (i2 == 4) {
                z = true;
            } else if (i2 == 5) {
                z2 = true;
            } else if (i2 != 6) {
                return 1;
            }
        }
        if (z) {
            return 2;
        }
        if (z2) {
            return 3;
        }
        return 4;
    }

    public static void a(b bVar) {
        f155106e.a(bVar);
    }

    public static void a(Activity activity, int i2) {
        a aVar;
        MethodCollector.i(14011);
        if (activity != null) {
            if (f155104c == null || i2 == 1 || i2 == 3 || i2 == 2) {
                f155104c = activity;
            }
            int stateForApplication = getStateForApplication();
            Map<Activity, a> map = f155102a;
            synchronized (map) {
                try {
                    if (!map.containsKey(activity)) {
                        map.put(activity, new a((byte) 0));
                    }
                    aVar = map.get(activity);
                    aVar.f155111a = i2;
                    if (i2 == 6) {
                        map.remove(activity);
                        if (activity == f155104c) {
                            f155104c = null;
                        }
                    }
                    f155103b = b();
                } finally {
                    MethodCollector.o(14011);
                }
            }
            Iterator<Object> it = aVar.f155112b.iterator();
            while (it.hasNext()) {
                it.next();
            }
            Iterator<Object> it2 = f155109h.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            int stateForApplication2 = getStateForApplication();
            if (stateForApplication2 != stateForApplication) {
                Iterator<b> it3 = f155106e.iterator();
                while (it3.hasNext()) {
                    it3.next().a(stateForApplication2);
                }
            }
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("null activity is not supported");
        MethodCollector.o(14011);
        throw illegalArgumentException;
    }
}
