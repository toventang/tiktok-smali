package com.ss.android.ugc.aweme.ml.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ml.data.MLDataCenterServiceImpl;
import h.f.b.l;

public abstract class MLDataCenterService implements IMLDataCenterService {
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
            Covode.recordClassIndex(70866);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static IMLDataCenterService f110379a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f110380b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(70867);
            IMLDataCenterService a2 = MLDataCenterServiceImpl.a();
            l.b(a2, "");
            f110379a = a2;
        }
    }

    public static final IMLDataCenterService instance() {
        return b.f110379a;
    }

    static {
        Covode.recordClassIndex(70865);
    }
}
