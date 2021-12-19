package com.ss.android.ugc.aweme.journey;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.journey.a.c;
import com.ss.android.ugc.aweme.journey.p;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.s;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import h.f.b.l;
import java.util.List;

public final class y implements r {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f105215a;

    /* renamed from: b  reason: collision with root package name */
    public static c f105216b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f105217c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private final p f105218d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f105219e;

    static {
        Covode.recordClassIndex(67446);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return s.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "request_";
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
            Covode.recordClassIndex(67447);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(Context context) {
            l.d(context, "");
            y.f105215a = true;
            y.f105216b = new c();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final aa b() {
        if (this.f105219e) {
            return aa.NORMAL;
        }
        return aa.IDLE;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public y() {
        p a2 = p.a.a();
        this.f105218d = a2;
        boolean z = false;
        if (a2.c() != 0 && !a2.f104884a && !f105215a && !MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).shouldShowForcedLogin()) {
            z = true;
        }
        this.f105219e = z;
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final void a(Context context, boolean z) {
        l.d(context, "");
        if (this.f105219e) {
            a.a(context);
        }
    }
}
