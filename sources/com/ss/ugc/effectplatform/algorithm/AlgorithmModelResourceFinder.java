package com.ss.ugc.effectplatform.algorithm;

import android.content.Context;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ugc.effectplatform.algorithm.e;
import com.ss.ugc.effectplatform.h.h;
import com.ss.ugc.effectplatform.util.n;
import d.a.e.b;
import h.f.b.l;
import h.m.p;
import h.q;
import h.r;
import h.w;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class AlgorithmModelResourceFinder extends d implements ResourceFinder {
    public static final a Companion = new a((byte) 0);
    private static final ConcurrentHashMap<String, Boolean> modelsNotFoundRecord = new ConcurrentHashMap<>();
    private final com.ss.ugc.effectplatform.b.a algorithmModelCache;
    private final AssetResourceFinder assetResourceFinder;
    private final f buildInAssetsManager;
    private final com.ss.ugc.effectplatform.a effectConfig;
    private long effectHandle;
    private final h eventListener;

    public static final void modelNotFound(String str) {
        a.a(str);
    }

    private final native long nativeCreateResourceFinder(long j2);

    public static final class a {
        static {
            Covode.recordClassIndex(102319);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(String str) {
            l.c(str, "");
            b.a("ResourceFinder", "modelNotFound:nameStr=".concat(String.valueOf(str)), null);
            e.a.a().a().onModelNotFound(str, "asset://not_found");
        }
    }

    @Override // com.ss.ugc.effectplatform.algorithm.d
    public final long getEffectHandle() {
        return this.effectHandle;
    }

    static {
        Covode.recordClassIndex(102318);
    }

    public static Context com_ss_ugc_effectplatform_algorithm_AlgorithmModelResourceFinder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.algorithm.d
    public final void onModelFound(String str) {
        l.c(str, "");
        mobModelFound(str);
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public final void release(long j2) {
        this.effectHandle = 0;
        this.assetResourceFinder.release(j2);
    }

    private final void mobModelFound(String str) {
        V v = this.effectConfig.s.f156544a;
        if (v != null) {
            com.ss.ugc.effectplatform.i.b.a((com.ss.ugc.effectplatform.i.a) v, true, this.effectConfig, str, "");
        }
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public final long createNativeResourceFinder(long j2) {
        MethodCollector.i(8958);
        b.f153450b.a();
        this.effectHandle = j2;
        this.assetResourceFinder.createNativeResourceFinder(j2);
        long nativeCreateResourceFinder = nativeCreateResourceFinder(j2);
        MethodCollector.o(8958);
        return nativeCreateResourceFinder;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.algorithm.d
    public final boolean isExactBuiltInResource(String str) {
        Object obj;
        String str2 = "";
        l.c(str, str2);
        try {
            String substring = str.substring(0, p.a((CharSequence) str, "/"));
            l.a((Object) substring, str2);
            obj = q.m223constructorimpl(substring);
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        boolean r0 = q.m228isFailureimpl(obj);
        Object obj2 = obj;
        if (r0) {
            obj2 = str2;
        }
        String str3 = (String) obj2;
        StringBuilder sb = new StringBuilder("model");
        if (str3.length() > 0) {
            str2 = "/".concat(String.valueOf(str3));
        }
        List<String> c2 = this.buildInAssetsManager.c(sb.append(str2).toString());
        String a2 = n.a(str);
        if (c2 != null) {
            Iterator<T> it = c2.iterator();
            while (it.hasNext()) {
                if (l.a((Object) n.a(it.next()), (Object) a2)) {
                    return true;
                }
            }
        }
        return super.isExactBuiltInResource(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.algorithm.d
    public final String getBuiltInResourceUrl(String str) {
        Object obj;
        String str2 = "";
        l.c(str, str2);
        boolean z = false;
        try {
            String substring = str.substring(0, p.a((CharSequence) str, "/"));
            l.a((Object) substring, str2);
            obj = q.m223constructorimpl(substring);
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        boolean r0 = q.m228isFailureimpl(obj);
        Object obj2 = obj;
        if (r0) {
            obj2 = str2;
        }
        String str3 = (String) obj2;
        StringBuilder sb = new StringBuilder("model");
        if (str3.length() > 0) {
            z = true;
        }
        if (z) {
            str2 = "/".concat(String.valueOf(str3));
        }
        String sb2 = sb.append(str2).toString();
        List<String> c2 = this.buildInAssetsManager.c(sb2);
        String a2 = n.a(str);
        if (c2 != null) {
            for (T t : c2) {
                if (l.a((Object) n.a(t), (Object) a2)) {
                    return "asset://" + sb2 + '/' + ((String) t);
                }
            }
        }
        return super.getBuiltInResourceUrl(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.algorithm.d
    public final void onModelNotFound(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        super.onModelNotFound(str, str2);
        mobModelNotFound(str, str2);
    }

    private final void mobModelNotFound(String str, String str2) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap = modelsNotFoundRecord;
        if (!concurrentHashMap.contains(str)) {
            concurrentHashMap.put(str, true);
            V v = this.effectConfig.s.f156544a;
            if (v != null) {
                com.ss.ugc.effectplatform.i.b.a((com.ss.ugc.effectplatform.i.a) v, false, this.effectConfig, str, str2);
            }
        }
    }

    public static final String findResourceUri(String str, String str2) {
        l.c(str2, "");
        if (!e.a.b()) {
            return "asset://not_initialized";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String realFindResourceUri = e.a.a().a().realFindResourceUri(0, str, str2);
        b.a("checkEffect", "findResourceUri name: " + str2 + ", result: " + realFindResourceUri + ", time cost: " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        return realFindResourceUri;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlgorithmModelResourceFinder(com.ss.ugc.effectplatform.b.a aVar, f fVar, h hVar, com.ss.ugc.effectplatform.a aVar2) {
        super(aVar, fVar, hVar);
        l.c(aVar, "");
        l.c(fVar, "");
        l.c(aVar2, "");
        this.algorithmModelCache = aVar;
        this.buildInAssetsManager = fVar;
        this.eventListener = hVar;
        this.effectConfig = aVar2;
        Object obj = fVar.f153466a;
        if (obj != null) {
            Context com_ss_ugc_effectplatform_algorithm_AlgorithmModelResourceFinder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = com_ss_ugc_effectplatform_algorithm_AlgorithmModelResourceFinder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext((Context) obj);
            l.a((Object) com_ss_ugc_effectplatform_algorithm_AlgorithmModelResourceFinder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext, "");
            this.assetResourceFinder = new AssetResourceFinder(com_ss_ugc_effectplatform_algorithm_AlgorithmModelResourceFinder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext.getAssets(), aVar.f153528a);
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }
}
