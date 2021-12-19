package com.ss.android.ugc.aweme.bc.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.g;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.d;
import com.ss.android.ugc.aweme.video.e;

public final class h implements Runnable {
    static {
        Covode.recordClassIndex(42202);
    }

    public final void run() {
        GlobalContext.setContext(g.a());
        e.a(g.a());
        d.f59392a = a.f68526a;
    }

    /* access modifiers changed from: package-private */
    public static final class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f68526a = new a();

        static {
            Covode.recordClassIndex(42203);
        }

        a() {
        }

        @Override // com.ss.android.d.a
        public final void a(String str, String str2) {
            com.ss.android.ugc.aweme.framework.a.a.a(4, str, str2);
        }
    }
}
