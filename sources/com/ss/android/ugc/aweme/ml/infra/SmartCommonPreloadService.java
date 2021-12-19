package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class SmartCommonPreloadService implements ISmartCommonPreloadService {
    public static final a Companion = new a((byte) 0);
    public static boolean debug = com.ss.android.ugc.aweme.ml.a.a.f110297a;

    public static final boolean getDebug() {
        return debug;
    }

    public static final void setDebug(boolean z) {
        debug = z;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(70977);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ISmartCommonPreloadService f110582a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f110583b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(70978);
            ISmartCommonPreloadService a2 = SmartCommonPreloadServiceImpl.a();
            l.b(a2, "");
            f110582a = a2;
        }
    }

    public static final ISmartCommonPreloadService instance() {
        return b.f110582a;
    }

    static {
        Covode.recordClassIndex(70976);
    }
}
