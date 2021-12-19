package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class SmartRegressCalculateService implements ISmartRegressCalculateService {
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
            Covode.recordClassIndex(71000);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        static ISmartRegressCalculateService f110609a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f110610b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(71001);
            ISmartRegressCalculateService a2 = SmartRegressCalculateServiceImpl.a();
            l.b(a2, "");
            f110609a = a2;
        }
    }

    public static final ISmartRegressCalculateService instance() {
        return b.f110609a;
    }

    static {
        Covode.recordClassIndex(70999);
    }
}
