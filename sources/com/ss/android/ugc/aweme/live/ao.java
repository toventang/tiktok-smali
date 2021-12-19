package com.ss.android.ugc.aweme.live;

import com.bytedance.android.live.i.a.d;
import com.bytedance.android.live.n.k;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.live.ad;
import h.f.b.l;

public final class ao implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final a f108326a = new a((byte) 0);

    static {
        Covode.recordClassIndex(69400);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(69401);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        static ao f108327a = new ao();

        /* renamed from: b  reason: collision with root package name */
        public static final b f108328b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(69402);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.l
    public final Boolean a() {
        c cVar = ad.a.f108097a;
        l.b(cVar, "");
        g f2 = cVar.f();
        if (f2 != null) {
            return Boolean.valueOf(f2.l());
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.l
    public final void a(boolean z) {
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(d.class);
        l.b(a2, "");
        k livePlayController = ((d) a2).getLivePlayController();
        if (livePlayController != null) {
            livePlayController.a(z, livePlayController.b());
        }
    }
}
