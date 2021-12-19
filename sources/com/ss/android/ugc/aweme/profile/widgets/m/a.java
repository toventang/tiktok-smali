package com.ss.android.ugc.aweme.profile.widgets.m;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.f.c;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.Arrays;

public final class a extends com.bytedance.assem.arch.d.a {

    /* renamed from: k  reason: collision with root package name */
    public static final b f117938k = new b((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public TextView f117939j;

    /* renamed from: l  reason: collision with root package name */
    private final i f117940l = new i(bQ_(), new C3004a(this, null));

    static {
        Covode.recordClassIndex(76434);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(76436);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final boolean u() {
        com.ss.android.ugc.aweme.profile.widgets.h.a.a aVar = (com.ss.android.ugc.aweme.profile.widgets.h.a.a) this.f117940l.getValue();
        if (aVar != null) {
            return aVar.f117878c;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.m.a$a  reason: collision with other inner class name */
    public static final class C3004a extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.a> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(76435);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3004a(com.bytedance.assem.arch.core.a aVar, String str) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.m.a.C3004a.invoke():java.lang.Object");
        }
    }

    static final class e extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76439);
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
            TextView textView;
            if (!(aVar == null || (textView = this.this$0.f117939j) == null)) {
                textView.setVisibility(8);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        CharSequence charSequence;
        l.d(view, "");
        TextView textView = (TextView) view.findViewById(R.id.f9j);
        this.f117939j = textView;
        if (textView != null) {
            Context ar_ = ar_();
            if (ar_ != null) {
                com.bytedance.tux.f.c cVar = new com.bytedance.tux.f.c();
                cVar.f45049a = com.bytedance.tux.c.c.a(new c.C1107c());
                com.bytedance.tux.f.c a2 = cVar.a(R.string.ghx);
                a2.f45053e = true;
                a2.f45051c = 52;
                a2.f45050b = false;
                a2.f45052d = 0;
                charSequence = a2.a(ar_);
            } else {
                charSequence = null;
            }
            textView.setText(charSequence);
        }
        TextView textView2 = this.f117939j;
        if (textView2 != null) {
            textView2.setOnClickListener(new c(this));
        }
        com.bytedance.assem.arch.service.d.a(this, ab.a(j.class), b.f117942a, new d(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), c.f117943a, new e(this));
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117941a;

        static {
            Covode.recordClassIndex(76437);
        }

        c(a aVar) {
            this.f117941a = aVar;
        }

        public final void onClick(View view) {
            User user;
            Context ar_;
            String str;
            ClickAgent.onClick(view);
            a aVar = this.f117941a;
            com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(aVar, ab.a(j.class));
            if (iVar != null && (user = iVar.f117705a) != null && (ar_ = aVar.ar_()) != null) {
                com.bytedance.ies.xbridge.base.a.b.a(ar_).a("tip_uid", user.getUid());
                if (aVar.u()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("to_user_id", user.getUid()).a("enter_method", "click_button");
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                r.a("click_tips_button", a2.a("from_user_id", g2.getCurUserId()).f66730a);
                if (!p.a((CharSequence) d.f117944a)) {
                    SmartRouter.buildRoute(ar_, d.f117944a).open();
                }
            }
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76438);
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
            Resources resources;
            String str;
            TextView textView;
            Resources resources2;
            String string;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                String str2 = null;
                boolean z = true;
                int i2 = 0;
                if (!this.this$0.u()) {
                    String uniqueId = t.getUniqueId();
                    if (!(uniqueId == null || (textView = this.this$0.f117939j) == null)) {
                        Context ar_ = this.this$0.ar_();
                        if (!(ar_ == null || (resources2 = ar_.getResources()) == null || (string = resources2.getString(R.string.lb)) == null)) {
                            str2 = com.a.a(string, Arrays.copyOf(new Object[]{uniqueId}, 1));
                            l.b(str2, "");
                        }
                        textView.setContentDescription(str2);
                    }
                } else {
                    TextView textView2 = this.this$0.f117939j;
                    if (textView2 != null) {
                        Context ar_2 = this.this$0.ar_();
                        if (!(ar_2 == null || (resources = ar_2.getResources()) == null)) {
                            str2 = resources.getString(R.string.la);
                        }
                        textView2.setContentDescription(str2);
                    }
                }
                a aVar3 = this.this$0;
                if (!t.getShowTipEntry() || t.isBlock) {
                    z = false;
                } else {
                    if (aVar3.u()) {
                        str = "personal_homepage";
                    } else {
                        str = "others_homepage";
                    }
                    com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("to_user_id", t.getUid());
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g2, "");
                    r.a("show_tips_button", a2.a("from_user_id", g2.getCurUserId()).f66730a);
                }
                TextView textView3 = aVar3.f117939j;
                if (textView3 != null) {
                    if (!z) {
                        i2 = 8;
                    }
                    textView3.setVisibility(i2);
                }
            }
            return z.f158842a;
        }
    }
}
