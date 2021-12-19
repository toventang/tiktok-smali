package com.ss.android.ugc.aweme.web;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.c;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class GeckoXClientManager implements IGeckoXClientManager {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, c> f144856a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, c> f144857b = new LinkedHashMap();

    static {
        Covode.recordClassIndex(94720);
    }

    public static IGeckoXClientManager a() {
        MethodCollector.i(11611);
        Object a2 = b.a(IGeckoXClientManager.class, false);
        if (a2 != null) {
            IGeckoXClientManager iGeckoXClientManager = (IGeckoXClientManager) a2;
            MethodCollector.o(11611);
            return iGeckoXClientManager;
        }
        if (b.eF == null) {
            synchronized (IGeckoXClientManager.class) {
                try {
                    if (b.eF == null) {
                        b.eF = new GeckoXClientManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11611);
                    throw th;
                }
            }
        }
        GeckoXClientManager geckoXClientManager = (GeckoXClientManager) b.eF;
        MethodCollector.o(11611);
        return geckoXClientManager;
    }

    @Override // com.ss.android.ugc.aweme.web.IGeckoXClientManager
    public final c b(String str) {
        c cVar;
        MethodCollector.i(11435);
        l.d(str, "");
        synchronized (this.f144857b) {
            try {
                cVar = this.f144857b.get(str);
            } finally {
                MethodCollector.o(11435);
            }
        }
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.web.IGeckoXClientManager
    public final c a(String str) {
        c cVar;
        MethodCollector.i(11433);
        if (str == null || str.length() == 0) {
            MethodCollector.o(11433);
            return null;
        }
        synchronized (this.f144856a) {
            try {
                cVar = this.f144856a.get(str);
            } finally {
                MethodCollector.o(11433);
            }
        }
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.web.IGeckoXClientManager
    public final void a(String str, c cVar) {
        MethodCollector.i(11432);
        l.d(str, "");
        synchronized (this.f144856a) {
            try {
                this.f144856a.put(str, cVar);
            } finally {
                MethodCollector.o(11432);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.web.IGeckoXClientManager
    public final void b(String str, c cVar) {
        MethodCollector.i(11434);
        l.d(str, "");
        l.d(cVar, "");
        synchronized (this.f144857b) {
            try {
                this.f144857b.put(str, cVar);
            } finally {
                MethodCollector.o(11434);
            }
        }
    }
}
