package com.ss.android.ugc.aweme.ml.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ml.impl.SmartPreloadCommentV2ServiceImpl;
import h.f.b.l;

public abstract class SmartPreloadCommentV2Service implements ISmartPreloadCommentV2Service {
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
            Covode.recordClassIndex(70887);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ISmartPreloadCommentV2Service f110389a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f110390b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(70888);
            ISmartPreloadCommentV2Service a2 = SmartPreloadCommentV2ServiceImpl.a();
            l.b(a2, "");
            f110389a = a2;
        }
    }

    public static final ISmartPreloadCommentV2Service instance() {
        return b.f110389a;
    }

    static {
        Covode.recordClassIndex(70886);
    }
}
