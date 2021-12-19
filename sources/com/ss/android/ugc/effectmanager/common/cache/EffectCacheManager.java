package com.ss.android.ugc.effectmanager.common.cache;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import h.f.b.ab;
import h.f.b.g;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.i;
import h.m;
import java.util.HashMap;

public final class EffectCacheManager {
    public static final Companion Companion = new Companion(null);
    public static final h instance$delegate = i.a(m.SYNCHRONIZED, EffectCacheManager$Companion$instance$2.INSTANCE);
    private HashMap<String, ICache> caches;

    public static final class Companion {
        static final /* synthetic */ h.k.i[] $$delegatedProperties = {new y(ab.a(Companion.class), "instance", "getInstance()Lcom/ss/android/ugc/effectmanager/common/cache/EffectCacheManager;")};

        public final EffectCacheManager getInstance() {
            return (EffectCacheManager) EffectCacheManager.instance$delegate.getValue();
        }

        private Companion() {
        }

        static {
            Covode.recordClassIndex(95265);
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    private EffectCacheManager() {
        this.caches = new HashMap<>();
    }

    static {
        Covode.recordClassIndex(95264);
    }

    public /* synthetic */ EffectCacheManager(g gVar) {
        this();
    }

    public final synchronized ICache getCache(String str) {
        MethodCollector.i(727);
        l.c(str, "");
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(727);
            return null;
        } else if (!this.caches.containsKey(str)) {
            MethodCollector.o(727);
            return null;
        } else {
            ICache iCache = this.caches.get(str);
            MethodCollector.o(727);
            return iCache;
        }
    }

    public final synchronized void setCache(String str, ICache iCache) {
        MethodCollector.i(731);
        l.c(str, "");
        this.caches.put(str, iCache);
        MethodCollector.o(731);
    }
}
