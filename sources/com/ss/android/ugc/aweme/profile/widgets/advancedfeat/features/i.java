package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.x;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.ss.android.ugc.aweme.utils.fe;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.v;
import h.z;

public final class i extends com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i {
    public String o = "";
    public boolean p;

    static {
        Covode.recordClassIndex(76076);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i
    public final com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a B() {
        return com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a.Shoutouts;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i
    public final View A() {
        return a(R.string.fzt, R.raw.icon_shoutouts, new a(this));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i, com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.core.a
    public final void f() {
        super.f();
        com.bytedance.assem.arch.service.d.a(this, ab.a(j.class), j.f117629a, new b(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), k.f117630a, new c(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(x.class), l.f117631a, new d(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.c.class), m.f117632a, new e(this));
    }

    static final class c extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(76079);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(i iVar) {
            super(1);
            this.this$0 = iVar;
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
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(76078);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                this.this$0.a((User) t);
            }
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(76081);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends Integer> aVar) {
            com.bytedance.assem.arch.extensions.a<? extends Integer> aVar2 = aVar;
            if (aVar2 != null && aVar2.f25631b.intValue() == com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a.Shoutouts.getId() && this.this$0.p) {
                i iVar = this.this$0;
                iVar.c(iVar.o);
                this.this$0.p = false;
            }
            return z.f158842a;
        }
    }

    public final void a(User user) {
        if (com.ss.android.ugc.aweme.profile.widgets.advancedfeat.b.a.c(user, v())) {
            if (!this.f117610l) {
                if (x()) {
                    String uid = user.getUid();
                    l.b(uid, "");
                    c(uid);
                } else {
                    String uid2 = user.getUid();
                    l.b(uid2, "");
                    this.o = uid2;
                    this.p = true;
                }
            }
            y();
            return;
        }
        z();
    }

    public final void c(String str) {
        String str2;
        if (v()) {
            str2 = "personal_homepage";
        } else {
            str2 = "others_homepage";
        }
        r.a("shoutouts_entrance_show", v.a(str2, "enter_from"), v.a("profile_link", "channel"), v.a(str, "to_user_id"));
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f117628a;

        static {
            Covode.recordClassIndex(76077);
        }

        a(i iVar) {
            this.f117628a = iVar;
        }

        public final void onClick(View view) {
            User user;
            ClickAgent.onClick(view);
            i iVar = this.f117628a;
            com.ss.android.ugc.aweme.profile.widgets.common.i iVar2 = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(iVar, ab.a(j.class));
            if (iVar2 != null && (user = iVar2.f117705a) != null) {
                if (!fe.a(iVar.w())) {
                    Activity a2 = o.a(iVar.w());
                    if (a2 != null) {
                        new com.bytedance.tux.g.b(a2).e(R.string.de8).b();
                        return;
                    }
                    return;
                }
                com.ss.android.ugc.aweme.shoutouts.b.a.a(iVar.w(), user.getUid());
            }
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(76080);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                Context ar_ = this.this$0.ar_();
                if (!(ar_ instanceof Activity)) {
                    ar_ = null;
                }
                Activity activity = (Activity) ar_;
                if (activity != null && this.this$0.v() && activity.getIntent().getBooleanExtra("extra.from.shoutouts.opt.out", false)) {
                    activity.getIntent().removeExtra("extra.from.shoutouts.opt.out");
                    new com.bytedance.tux.g.b(activity).e(R.string.fzi).b();
                    t.shoutoutsStatus = 404;
                    this.this$0.a((User) t);
                }
            }
            return z.f158842a;
        }
    }
}
