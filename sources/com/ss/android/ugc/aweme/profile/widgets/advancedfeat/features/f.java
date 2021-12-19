package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.service.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class f extends i {
    static {
        Covode.recordClassIndex(76070);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i
    public final com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a B() {
        return com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a.QA;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i
    public final View A() {
        return a(R.string.dc, R.raw.icon_qa_ltr, new a(this));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i, com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.core.a
    public final void f() {
        super.f();
        d.a(this, ab.a(j.class), g.f117626a, new b(this));
        d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), h.f117627a, new c(this));
    }

    static final class c extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76073);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar) {
            super(1);
            this.this$0 = fVar;
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

    static final class b extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76072);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            T t2;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null || (t2 = aVar2.f25631b) == null || t2.isBlock)) {
                if (com.ss.android.ugc.aweme.profile.widgets.advancedfeat.b.a.a(t)) {
                    this.this$0.y();
                } else {
                    this.this$0.z();
                }
            }
            return z.f158842a;
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f117625a;

        static {
            Covode.recordClassIndex(76071);
        }

        a(f fVar) {
            this.f117625a = fVar;
        }

        public final void onClick(View view) {
            User user;
            String str;
            ClickAgent.onClick(view);
            f fVar = this.f117625a;
            com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) d.f(fVar, ab.a(j.class));
            if (iVar != null && (user = iVar.f117705a) != null) {
                if (fVar.v()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("to_user_id", user.getUid());
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                r.a("click_qa_entrance", a2.a("from_user_id", g2.getCurUserId()).f66730a);
                SmartRouter.buildRoute(fVar.ar_(), "aweme://user/qna/profile/" + user.getUid()).withParam("enter_from", str).withParam("enter_method", "click_qa_entrance").open();
            }
        }
    }
}
