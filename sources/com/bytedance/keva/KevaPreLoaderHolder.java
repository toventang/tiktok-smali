package com.bytedance.keva;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

class KevaPreLoaderHolder {
    private static IKevaPreLoader sPreLoader;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.keva.KevaPreLoaderHolder$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(24515);
        }
    }

    static {
        Covode.recordClassIndex(24514);
    }

    /* access modifiers changed from: package-private */
    public static final class NoOpPreLoader implements IKevaPreLoader {
        static {
            Covode.recordClassIndex(24516);
        }

        @Override // com.bytedance.keva.IKevaPreLoader
        public final void access(String str, int i2) {
        }

        @Override // com.bytedance.keva.IKevaPreLoader
        public final void preload() {
        }

        private NoOpPreLoader() {
        }

        /* synthetic */ NoOpPreLoader(AnonymousClass1 r1) {
            this();
        }
    }

    KevaPreLoaderHolder() {
    }

    public static IKevaPreLoader getPreLoader() {
        MethodCollector.i(5534);
        synchronized (KevaPreLoaderHolder.class) {
            try {
                IKevaPreLoader iKevaPreLoader = sPreLoader;
                if (iKevaPreLoader != null) {
                    return iKevaPreLoader;
                }
                NoOpPreLoader noOpPreLoader = new NoOpPreLoader(null);
                MethodCollector.o(5534);
                return noOpPreLoader;
            } finally {
                MethodCollector.o(5534);
            }
        }
    }

    public static synchronized void injectPreLoader(IKevaPreLoader iKevaPreLoader) {
        synchronized (KevaPreLoaderHolder.class) {
            MethodCollector.i(5535);
            sPreLoader = iKevaPreLoader;
            MethodCollector.o(5535);
        }
    }
}
