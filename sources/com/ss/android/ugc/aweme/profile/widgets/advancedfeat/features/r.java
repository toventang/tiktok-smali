package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;

public final class r extends i {
    public String o = "";

    static {
        Covode.recordClassIndex(76095);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i
    public final com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a B() {
        return com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a.Tipping;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i
    public final View A() {
        return a(R.string.ghx, R.raw.icon_tips, new a(this));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i, com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.core.a
    public final void f() {
        super.f();
        com.bytedance.assem.arch.service.d.a(this, ab.a(j.class), s.f117642a, new b(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), t.f117643a, new c(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.c.class), u.f117644a, new d(this));
    }

    static final class c extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(76098);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(r rVar) {
            super(1);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            if (aVar != null) {
                this.this$0.z();
            }
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(76099);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(r rVar) {
            super(1);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends Integer> aVar) {
            String str;
            com.bytedance.assem.arch.extensions.a<? extends Integer> aVar2 = aVar;
            if (aVar2 != null && aVar2.f25631b.intValue() == com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a.Tipping.getId()) {
                r rVar = this.this$0;
                String str2 = rVar.o;
                if (rVar.v()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("to_user_id", str2);
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                com.ss.android.ugc.aweme.common.r.a("show_tips_button", a2.a("from_user_id", g2.getCurUserId()).f66730a);
            }
            return z.f158842a;
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f117641a;

        static {
            Covode.recordClassIndex(76096);
        }

        a(r rVar) {
            this.f117641a = rVar;
        }

        public final void onClick(View view) {
            User user;
            Context ar_;
            String str;
            ClickAgent.onClick(view);
            r rVar = this.f117641a;
            com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(rVar, ab.a(j.class));
            if (iVar != null && (user = iVar.f117705a) != null && (ar_ = rVar.ar_()) != null) {
                com.bytedance.ies.xbridge.base.a.b.a(ar_).a("tip_uid", user.getUid());
                if (rVar.v()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("to_user_id", user.getUid()).a("enter_method", "click_button");
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                com.ss.android.ugc.aweme.common.r.a("click_tips_button", a2.a("from_user_id", g2.getCurUserId()).f66730a);
                if (!p.a((CharSequence) com.ss.android.ugc.aweme.profile.widgets.m.d.f117944a)) {
                    SmartRouter.buildRoute(ar_, com.ss.android.ugc.aweme.profile.widgets.m.d.f117944a).open();
                }
            }
        }
    }

    static final class b extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(76097);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(r rVar) {
            super(1);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
            if (r0 == null) goto L_0x0042;
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.profile.model.User> r9) {
            /*
            // Method dump skipped, instructions count: 136
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.r.b.invoke(java.lang.Object):java.lang.Object");
        }
    }
}
