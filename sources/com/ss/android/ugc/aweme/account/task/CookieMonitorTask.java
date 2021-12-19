package com.ss.android.ugc.aweme.account.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.l;
import java.util.List;

public final class CookieMonitorTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f65336a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f65337b = new a((byte) 0);

    static {
        Covode.recordClassIndex(40171);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40172);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.IDLE;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (!f65336a) {
            f65336a = true;
            IAccountUserService g2 = b.g();
            l.b(g2, "");
            if (g2.isLogin()) {
                com.ss.android.ugc.aweme.account.n.b.a(1);
            }
        }
    }
}
