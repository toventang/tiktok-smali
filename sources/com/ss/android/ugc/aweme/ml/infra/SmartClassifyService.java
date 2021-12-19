package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class SmartClassifyService implements ISmartClassifyService {
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
            Covode.recordClassIndex(70972);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        static ISmartClassifyService f110580a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f110581b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(70973);
            ISmartClassifyService a2 = SmartClassifyServiceImpl.a();
            l.b(a2, "");
            f110580a = a2;
        }
    }

    public static final ISmartClassifyService instance() {
        return b.f110580a;
    }

    static {
        Covode.recordClassIndex(70971);
    }
}
