package com.ss.android.ugc.aweme.ml.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ml.impl.SmartPreloadProfileV2ServiceImpl;
import h.f.b.l;

public abstract class SmartPreloadProfileV2Service implements ISmartPreloadProfileV2Service {
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
            Covode.recordClassIndex(70891);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ISmartPreloadProfileV2Service f110391a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f110392b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(70892);
            ISmartPreloadProfileV2Service a2 = SmartPreloadProfileV2ServiceImpl.a();
            l.b(a2, "");
            f110391a = a2;
        }
    }

    public static final ISmartPreloadProfileV2Service instance() {
        return b.f110391a;
    }

    static {
        Covode.recordClassIndex(70890);
    }
}
