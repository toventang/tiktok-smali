package com.ss.android.ugc.aweme.ml.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedLoadMoreServiceImpl;
import h.f.b.l;

public abstract class SmartFeedLoadMoreService implements ISmartFeedLoadMoreService {
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
            Covode.recordClassIndex(70879);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ISmartFeedLoadMoreService f110385a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f110386b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(70880);
            ISmartFeedLoadMoreService a2 = SmartFeedLoadMoreServiceImpl.a();
            l.b(a2, "");
            f110385a = a2;
        }
    }

    public static final ISmartFeedLoadMoreService instance() {
        return b.f110385a;
    }

    static {
        Covode.recordClassIndex(70878);
    }
}
