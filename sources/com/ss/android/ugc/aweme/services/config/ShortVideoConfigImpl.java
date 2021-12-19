package com.ss.android.ugc.aweme.services.config;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class ShortVideoConfigImpl extends ShortVideoConfigBaseImpl {
    public static final Companion Companion = new Companion(null);
    public static ShortVideoConfigImpl sInstance;

    static {
        Covode.recordClassIndex(79587);
    }

    public static final ShortVideoConfigImpl getInstance() {
        return Companion.getInstance();
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public final String cutsameSdkVersion() {
        return "";
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(79588);
        }

        private Companion() {
        }

        public final ShortVideoConfigImpl getInstance() {
            MethodCollector.i(11651);
            if (ShortVideoConfigImpl.sInstance == null) {
                synchronized (ShortVideoConfigBaseImpl.class) {
                    try {
                        if (ShortVideoConfigImpl.sInstance == null) {
                            ShortVideoConfigImpl.sInstance = new ShortVideoConfigImpl();
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(11651);
                        throw th;
                    }
                }
            }
            ShortVideoConfigImpl shortVideoConfigImpl = ShortVideoConfigImpl.sInstance;
            if (shortVideoConfigImpl == null) {
                l.b();
            }
            MethodCollector.o(11651);
            return shortVideoConfigImpl;
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public final List<String> getBOEBypassHostList() {
        return z.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public final List<String> getBOEBypassPathList() {
        return z.INSTANCE;
    }
}
