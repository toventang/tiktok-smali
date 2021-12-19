package com.ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.multi.c;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.v;
import org.greenrobot.eventbus.EventBus;

public final class n extends o {

    /* renamed from: d  reason: collision with root package name */
    private d f110988d;

    static {
        Covode.recordClassIndex(71216);
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final c i() {
        return new n();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final int k() {
        return ab.SHOUTOUT.getTYPE();
    }

    private static boolean n() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    static final class a implements com.ss.android.ugc.aweme.base.component.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f110989a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f110990b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f110991c;

        static {
            Covode.recordClassIndex(71217);
        }

        a(n nVar, d dVar, Activity activity) {
            this.f110989a = nVar;
            this.f110990b = dVar;
            this.f110991c = activity;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            String str;
            String schema;
            d dVar = this.f110990b;
            IAccountUserService g2 = b.g();
            l.b(g2, "");
            if (g2.isLogin()) {
                str = "1";
            } else {
                str = "0";
            }
            dVar.a("login_status", str);
            o.a(this.f110989a, this.f110990b, false, false, 6);
            AnchorCommonStruct anchorCommonStruct = this.f110989a.f110994h;
            if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null) {
                EventBus.a(EventBus.a(), this.f110989a);
                SmartRouter.buildRoute(this.f110991c, schema).withParam("need_close_event", true).withParam("enter_from", this.f110989a.p()).open();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void c(d dVar) {
        l.d(dVar, "");
        super.c(dVar);
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void b(d dVar) {
        l.d(dVar, "");
        super.b(dVar);
        r.a("shoutouts_entrance_show", ag.a(v.a("enter_from", p()), v.a("channel", "anchor"), v.a("to_user_id", o().getAuthorUid())));
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final void d(d dVar) {
        String str;
        String schema;
        l.d(dVar, "");
        this.f110988d = dVar;
        r();
        if (!j.f107226e || !j.b() || j.c()) {
            j.f107226e = n();
        }
        if (!j.f107226e) {
            new com.bytedance.tux.g.b(r()).e(R.string.de2).b();
            return;
        }
        Activity e2 = a().e();
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        if (!g2.isLogin()) {
            com.ss.android.ugc.aweme.login.c.a(e2, p(), "", new a(this, dVar, e2));
            return;
        }
        IAccountUserService g3 = b.g();
        l.b(g3, "");
        if (g3.isLogin()) {
            str = "1";
        } else {
            str = "0";
        }
        dVar.a("login_status", str);
        o.a(this, dVar, false, false, 6);
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null) {
            SmartRouter.buildRoute(e2, schema).withParam("need_close_event", true).withParam("enter_from", p()).open();
        }
    }
}
