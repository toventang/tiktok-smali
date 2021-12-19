package com.ss.android.ugc.aweme.ml.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedPreloadServiceImpl;
import h.f.b.l;

public abstract class SmartFeedPreloadService implements ISmartFeedPreloadService {
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
            Covode.recordClassIndex(70883);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ISmartFeedPreloadService f110387a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f110388b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(70884);
            ISmartFeedPreloadService a2 = SmartFeedPreloadServiceImpl.a();
            l.b(a2, "");
            f110387a = a2;
        }
    }

    public static final ISmartFeedPreloadService instance() {
        return b.f110387a;
    }

    static {
        Covode.recordClassIndex(70882);
    }
}
