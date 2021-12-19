package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.ies.abmock.datacenter.e;
import com.bytedance.ies.abmock.g;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.utils.c;
import h.f.b.l;
import java.util.List;

public final class ABCacheOptInitTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static final a f107718a = new a((byte) 0);

    static {
        Covode.recordClassIndex(68905);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
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
            Covode.recordClassIndex(68906);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
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
        System.currentTimeMillis();
        e.a().f31829e = b.a().a(true, "ab_lib_empty_call_opt", false);
        boolean a2 = b.a().a(true, "ab_call_opt", false);
        c.f142752a = a2;
        if (a2) {
            try {
                com.ss.android.ugc.aweme.player.a.f114913a = c.f142752a;
                com.bytedance.ies.abmock.a.a aVar = com.ss.android.ugc.aweme.utils.a.f142584a;
                l.c(aVar, "");
                g.f31853f.add(aVar);
            } catch (Throwable unused) {
                c.f142752a = false;
                com.ss.android.ugc.aweme.player.a.f114913a = false;
            }
        }
    }
}
