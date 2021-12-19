package com.ss.android.ugc.aweme.account.apiguard;

import android.app.Application;
import com.apiguard3.APIGuard;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.network.partner.b.f;
import com.bytedance.ies.ugc.network.partner.b.g;
import com.ss.android.ugc.aweme.IApiGuardService;
import com.ss.android.ugc.aweme.utils.ah;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ApiGuardService implements IApiGuardService {
    public static final a Companion = new a((byte) 0);
    private static final String PROD_KEY = "PROD";
    private static final String QA_KEY = "QA";
    public static final String TAG = "apiguard";
    private static APIGuard apiGuard;
    private static volatile boolean didInit;
    private static AtomicBoolean didStartInit = new AtomicBoolean(false);

    public static final class a {
        static {
            Covode.recordClassIndex(38722);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements APIGuard.InitializationCallback {
        static {
            Covode.recordClassIndex(38723);
        }

        @Override // com.apiguard3.APIGuard.Callback
        public final void checkCertificates(List<Certificate> list, String str) {
        }

        @Override // com.apiguard3.APIGuard.InitializationCallback
        public final void onInitializationSuccess() {
        }

        b() {
        }

        @Override // com.apiguard3.APIGuard.Callback
        public final void log(String str) {
            com.ss.android.ugc.aweme.framework.a.a.a(4, ApiGuardService.class.getSimpleName(), str);
        }

        @Override // com.apiguard3.APIGuard.InitializationCallback
        public final void onInitializationFailure(String str) {
            l.d(str, "");
            com.ss.android.ugc.aweme.framework.a.a.a(4, ApiGuardService.TAG, "onInitializationFailure");
        }
    }

    @Override // com.ss.android.ugc.aweme.IApiGuardService
    public final boolean isEnabled() {
        return a.a();
    }

    @Override // com.ss.android.ugc.aweme.IApiGuardService
    public final void initializeApiGuard() {
        Application application = com.ss.android.ugc.aweme.a.f62426a;
        l.b(application, "");
        tryInit(application);
    }

    static {
        Covode.recordClassIndex(38721);
    }

    private final void tryInit(Application application) {
        if (a.a() && !didInit && didStartInit.compareAndSet(false, true)) {
            init(application);
            didInit = true;
        }
    }

    public static IApiGuardService createIApiGuardServicebyMonsterPlugin(boolean z) {
        MethodCollector.i(9772);
        Object a2 = com.ss.android.ugc.b.a(IApiGuardService.class, z);
        if (a2 != null) {
            IApiGuardService iApiGuardService = (IApiGuardService) a2;
            MethodCollector.o(9772);
            return iApiGuardService;
        }
        if (com.ss.android.ugc.b.z == null) {
            synchronized (IApiGuardService.class) {
                try {
                    if (com.ss.android.ugc.b.z == null) {
                        com.ss.android.ugc.b.z = new ApiGuardService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9772);
                    throw th;
                }
            }
        }
        ApiGuardService apiGuardService = (ApiGuardService) com.ss.android.ugc.b.z;
        MethodCollector.o(9772);
        return apiGuardService;
    }

    private final Map<String, List<String>> getFilterHeadersMap(List<com.bytedance.retrofit2.client.b> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (com.bytedance.retrofit2.client.b bVar : list) {
            String str = bVar.f42471a;
            List list2 = (List) linkedHashMap.get(str);
            if (list2 == null) {
                list2 = new ArrayList();
                l.b(str, "");
                linkedHashMap.put(str, list2);
            }
            String str2 = bVar.f42472b;
            l.b(str2, "");
            list2.add(str2);
        }
        return linkedHashMap;
    }

    private final Map<String, List<String>> getHeadersMap(List<com.bytedance.retrofit2.client.b> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (com.bytedance.retrofit2.client.b bVar : list) {
            String str = bVar.f42471a;
            List list2 = (List) linkedHashMap.get(str);
            if (list2 == null) {
                list2 = new ArrayList();
                l.b(str, "");
                linkedHashMap.put(str, list2);
            }
            String str2 = bVar.f42472b;
            l.b(str2, "");
            list2.add(str2);
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.IApiGuardService
    public final Map<String, String> appendHeaders(f fVar) {
        l.d(fVar, "");
        if (!didInit) {
            return null;
        }
        try {
            APIGuard aPIGuard = apiGuard;
            if (aPIGuard != null) {
                return aPIGuard.generateHeaders(fVar.f35269b.f35299g, fVar.f35271d.f35259a, new LinkedHashMap(), null);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.IApiGuardService
    public final void parseHeaders(g<?> gVar) {
        l.d(gVar, "");
        if (didInit) {
            try {
                APIGuard aPIGuard = apiGuard;
                if (aPIGuard != null) {
                    aPIGuard.analyzeResponse(gVar.f35282a.f35299g, getFilterHeadersMap(gVar.f35285d.a()), null, gVar.f35283b);
                }
            } catch (Exception unused) {
            }
        }
    }

    private final void init(Application application) {
        String str;
        ah a2 = ah.a();
        l.b(a2, "");
        if (a2.f142630a) {
            str = QA_KEY;
        } else {
            str = PROD_KEY;
        }
        apiGuard = APIGuard.getSharedInstance();
        com.ss.android.ugc.aweme.framework.a.a.b(4, TAG, "Initializing ApiGuard on " + str + " with " + System.identityHashCode(apiGuard));
        APIGuard aPIGuard = apiGuard;
        if (aPIGuard != null) {
            aPIGuard.initialize(application, new b(), R.raw.apiguard, str);
        }
    }
}
