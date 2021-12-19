package com.ss.android.ugc.aweme.ecommerce.preloader;

import androidx.c.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.ecommerce.service.ILowResolutionImageCache;
import com.ss.android.ugc.b;

public final class LowResolutionImageCache implements ILowResolutionImageCache {

    /* renamed from: a  reason: collision with root package name */
    public static final e<String, String> f86944a = new e<>(128);

    /* renamed from: b  reason: collision with root package name */
    public static final a f86945b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(54507);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(54506);
    }

    public static ILowResolutionImageCache a() {
        MethodCollector.i(5236);
        Object a2 = b.a(ILowResolutionImageCache.class, false);
        if (a2 != null) {
            ILowResolutionImageCache iLowResolutionImageCache = (ILowResolutionImageCache) a2;
            MethodCollector.o(5236);
            return iLowResolutionImageCache;
        }
        if (b.bj == null) {
            synchronized (ILowResolutionImageCache.class) {
                try {
                    if (b.bj == null) {
                        b.bj = new LowResolutionImageCache();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5236);
                    throw th;
                }
            }
        }
        LowResolutionImageCache lowResolutionImageCache = (LowResolutionImageCache) b.bj;
        MethodCollector.o(5236);
        return lowResolutionImageCache;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.ILowResolutionImageCache
    public final void a(String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            f86944a.a(str, str2);
        }
    }
}
