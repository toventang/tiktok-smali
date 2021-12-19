package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class SmartMLSceneService implements ISmartMLSceneService {
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
            Covode.recordClassIndex(70987);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        static ISmartMLSceneService f110587a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f110588b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(70988);
            ISmartMLSceneService a2 = SmartMLSceneServiceImpl.a();
            l.b(a2, "");
            f110587a = a2;
        }
    }

    public static final ISmartMLSceneService instance() {
        return b.f110587a;
    }

    static {
        Covode.recordClassIndex(70986);
    }
}
