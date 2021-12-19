package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class SmartPlaytimePredictService implements ISmartPlaytimePredictService {
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
            Covode.recordClassIndex(70995);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ISmartPlaytimePredictService f110602a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f110603b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(70996);
            ISmartPlaytimePredictService a2 = SmartPlaytimePredictServiceImpl.a();
            l.b(a2, "");
            f110602a = a2;
        }
    }

    public static final ISmartPlaytimePredictService instance() {
        return b.f110602a;
    }

    static {
        Covode.recordClassIndex(70994);
    }
}
