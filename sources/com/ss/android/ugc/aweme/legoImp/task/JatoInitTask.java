package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.common.jato.Jato;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.List;
import java.util.concurrent.ExecutorService;

public final class JatoInitTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static ExecutorService f107804a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f107805b = new a((byte) 0);

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
            Covode.recordClassIndex(69033);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements com.bytedance.common.jato.b {
        static {
            Covode.recordClassIndex(69034);
        }

        @Override // com.bytedance.common.jato.b
        public final void a(String str) {
        }

        @Override // com.bytedance.common.jato.b
        public final void a(String str, Throwable th) {
        }

        b() {
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static {
        Covode.recordClassIndex(69032);
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        ExecutorService a3 = g.a(a2.a());
        h.f.b.l.b(a3, "");
        f107804a = a3;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (context != null) {
            int d2 = SettingsRequestServiceImpl.i().d();
            Jato.init(context, false, new b(), g.a());
            if (d2 == 0) {
                Jato.initScheduler(4867);
            } else if (d2 == 1) {
                Jato.initScheduler(771);
            }
            Jato.requestBlockGc(d.a(), 3000);
        }
    }
}
