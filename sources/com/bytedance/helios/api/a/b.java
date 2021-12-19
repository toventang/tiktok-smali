package com.bytedance.helios.api.a;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.w;
import java.lang.reflect.Constructor;
import java.util.Map;

public class b {
    public static final a Companion = new a((byte) 0);
    public static b INSTANCE;
    public final Map<String, c> mCheckerMap = new androidx.c.a();

    static {
        Covode.recordClassIndex(17799);
    }

    public static int com_bytedance_helios_api_anchor_AnchorManager_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static final b get() {
        return a.a();
    }

    public String getAnchorTaskName() {
        return "";
    }

    public void startCheck(Activity activity, int i2) {
    }

    public void stopCheck(Activity activity) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(17800);
        }

        private a() {
        }

        public static b a() {
            b bVar;
            MethodCollector.i(12664);
            if (b.INSTANCE == null) {
                synchronized (b.class) {
                    try {
                        if (b.INSTANCE == null) {
                            try {
                                Constructor<?> declaredConstructor = Class.forName("com.bytedance.helios.sdk.anchor.AnchorManagerImpl").getDeclaredConstructor(new Class[0]);
                                l.a((Object) declaredConstructor, "");
                                declaredConstructor.setAccessible(true);
                                Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                if (newInstance != null) {
                                    bVar = (b) newInstance;
                                    b.INSTANCE = bVar;
                                } else {
                                    w wVar = new w("null cannot be cast to non-null type");
                                    MethodCollector.o(12664);
                                    throw wVar;
                                }
                            } catch (Exception unused) {
                                bVar = new b();
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(12664);
                        throw th;
                    }
                }
            }
            b bVar2 = b.INSTANCE;
            if (bVar2 == null) {
                l.a();
            }
            MethodCollector.o(12664);
            return bVar2;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void removeResourceChecker(String str) {
        MethodCollector.i(13092);
        l.c(str, "");
        com_bytedance_helios_api_anchor_AnchorManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("AnchorManager", "removeResourceChecker: ".concat(String.valueOf(str)));
        synchronized (this) {
            try {
                this.mCheckerMap.remove(str);
            } finally {
                MethodCollector.o(13092);
            }
        }
    }

    public final void addResourceChecker(String str, c cVar) {
        MethodCollector.i(13000);
        l.c(str, "");
        l.c(cVar, "");
        com_bytedance_helios_api_anchor_AnchorManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("AnchorManager", "addResourceChecker: " + str + '/' + cVar);
        synchronized (this) {
            try {
                this.mCheckerMap.put(str, cVar);
            } finally {
                MethodCollector.o(13000);
            }
        }
    }
}
