package com.ss.android.ugc.aweme.ml.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedAdUIServiceImpl;
import h.f.b.l;

public abstract class SmartFeedAdUIService implements ISmartFeedAdUIService {
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
            Covode.recordClassIndex(70875);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ISmartFeedAdUIService f110383a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f110384b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(70876);
            ISmartFeedAdUIService a2 = SmartFeedAdUIServiceImpl.a();
            l.b(a2, "");
            f110383a = a2;
        }
    }

    public static final ISmartFeedAdUIService instance() {
        return b.f110383a;
    }

    static {
        Covode.recordClassIndex(70874);
    }
}
