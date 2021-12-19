package com.ss.android.ugc.aweme.profile.widgets.k;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
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

public final class a extends com.bytedance.assem.arch.d.a {

    /* renamed from: k  reason: collision with root package name */
    public static final b f117912k = new b((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public TuxTextView f117913j;

    /* renamed from: l  reason: collision with root package name */
    private final i f117914l = new i(bQ_(), new C3002a(this, null));

    static {
        Covode.recordClassIndex(76409);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(76411);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final boolean u() {
        if (this.f117914l.getValue() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.k.a$a  reason: collision with other inner class name */
    public static final class C3002a extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.a> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(76410);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3002a(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.widgets.h.a.a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.ss.android.ugc.aweme.profile.widgets.h.a.a.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.k.a.C3002a.invoke():java.lang.Object");
        }
    }

    static final class e extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76414);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            TuxTextView tuxTextView;
            if (!(aVar == null || (tuxTextView = this.this$0.f117913j) == null)) {
                tuxTextView.setVisibility(8);
            }
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76413);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(1);
            this.this$0 = aVar;
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

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117915a;

        static {
            Covode.recordClassIndex(76412);
        }

        c(a aVar) {
            this.f117915a = aVar;
        }

        public final void onClick(View view) {
            User user;
            ClickAgent.onClick(view);
            a aVar = this.f117915a;
            com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(aVar, ab.a(j.class));
            if (iVar != null && (user = iVar.f117705a) != null) {
                Context ar_ = aVar.ar_();
                if (ar_ == null) {
                    l.b();
                }
                if (!fe.a(ar_)) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(aVar.ar_()).a(R.string.de8).a();
                    return;
                }
                Context ar_2 = aVar.ar_();
                if (ar_2 == null) {
                    l.b();
                }
                com.ss.android.ugc.aweme.shoutouts.b.a.a(ar_2, user.getUid());
            }
        }
    }

    static final class f extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76415);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(1);
            this.this$0 = aVar;
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
                if (activity != null && this.this$0.u() && activity.getIntent().getBooleanExtra("extra.from.shoutouts.opt.out", false)) {
                    activity.getIntent().removeExtra("extra.from.shoutouts.opt.out");
                    new com.ss.android.ugc.aweme.tux.a.i.a(activity).a(R.string.fzi).a();
                    t.shoutoutsStatus = 404;
                    this.this$0.a((User) t);
                }
            }
            return z.f158842a;
        }
    }

    public final void a(User user) {
        boolean z;
        String str;
        if (this.f117913j != null) {
            int i2 = 0;
            if (!com.ss.android.ugc.aweme.shoutouts.b.a.a(user) || (!u() && (user.isBlock || !(!user.isSecret() || user.getFollowStatus() == 1 || user.getFollowStatus() == 2)))) {
                z = false;
            } else {
                z = true;
            }
            TuxTextView tuxTextView = this.f117913j;
            if ((tuxTextView == null || tuxTextView.getVisibility() != 0) && z) {
                if (u()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                r.a("shoutouts_entrance_show", v.a(str, "enter_from"), v.a("profile_link", "channel"), v.a(user.getUid(), "to_user_id"));
            }
            TuxTextView tuxTextView2 = this.f117913j;
            if (tuxTextView2 != null) {
                if (!z) {
                    i2 = 8;
                }
                tuxTextView2.setVisibility(i2);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.e3m);
        this.f117913j = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setOnClickListener(new c(this));
        }
        com.bytedance.assem.arch.service.d.a(this, ab.a(j.class), b.f117916a, new d(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), c.f117919a, new e(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(x.class), d.f117921a, new f(this));
    }
}
