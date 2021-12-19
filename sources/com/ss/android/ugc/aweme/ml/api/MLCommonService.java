package com.ss.android.ugc.aweme.ml.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ml.impl.MLCommonServiceImpl;
import h.f.b.l;

public abstract class MLCommonService implements IMLCommonService {
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
            Covode.recordClassIndex(70862);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static IMLCommonService f110377a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f110378b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(70863);
            IMLCommonService a2 = MLCommonServiceImpl.a();
            l.b(a2, "");
            f110377a = a2;
        }
    }

    public static final IMLCommonService instance() {
        return b.f110377a;
    }

    static {
        Covode.recordClassIndex(70861);
    }
}
