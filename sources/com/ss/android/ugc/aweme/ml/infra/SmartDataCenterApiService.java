package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class SmartDataCenterApiService implements ISmartDataCenterApiService {
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
            Covode.recordClassIndex(70982);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ISmartDataCenterApiService f110585a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f110586b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(70983);
            ISmartDataCenterApiService a2 = SmartDataCenterApiServiceImpl.a();
            l.b(a2, "");
            f110585a = a2;
        }
    }

    public static final ISmartDataCenterApiService instance() {
        return b.f110585a;
    }

    static {
        Covode.recordClassIndex(70981);
    }
}
