package com.ss.android.ugc.aweme.deeplink.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.deeplink.d;
import com.ss.android.ugc.aweme.deeplink.d.c;
import com.ss.android.ugc.aweme.deeplink.u;
import com.ss.android.ugc.aweme.journey.z;
import h.f.b.l;

public final class f extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f79455a = new a((byte) 0);

    static {
        Covode.recordClassIndex(49367);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49368);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public f() {
        super(true);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.c.b
    public final boolean b(d dVar) {
        l.d(dVar, "");
        return z.f105220a.b(dVar.f79464d);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.c.b
    public final boolean a(d dVar) {
        l.d(dVar, "");
        c.c("NewUserJourneyNode");
        u.a("NewUserJourneyNode");
        z.f105220a.a(dVar.f79464d, false, true);
        return true;
    }
}
