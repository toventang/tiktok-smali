package com.ss.android.ugc.aweme.profile.widgets.j;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;

public final class a extends com.bytedance.assem.arch.d.a {

    /* renamed from: l  reason: collision with root package name */
    public static final b f117899l = new b((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    final i f117900j = new i(bQ_(), new C3001a(this, null));

    /* renamed from: k  reason: collision with root package name */
    TextView f117901k;

    static {
        Covode.recordClassIndex(76395);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(76397);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class e extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ z.e $fragment;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76400);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, z.e eVar) {
            super(1);
            this.this$0 = aVar;
            this.$fragment = eVar;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.assem.arch.extensions.a<? extends h.z> aVar) {
            if (aVar != null) {
                this.this$0.ar_();
                if (!j.f107229h || !j.b() || j.c()) {
                    j.f107229h = a();
                }
                if (!j.f107229h) {
                    new com.bytedance.tux.g.b((Fragment) this.$fragment.element).e(R.string.de8).b();
                } else {
                    j.a.a((com.ss.android.ugc.aweme.profile.widgets.common.j) com.bytedance.assem.arch.service.d.a(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class)), null, 3);
                }
            }
            return h.z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.j.a$a  reason: collision with other inner class name */
    public static final class C3001a extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.a> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(76396);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3001a(com.bytedance.assem.arch.core.a aVar, String str) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.j.a.C3001a.invoke():java.lang.Object");
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, h.z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76399);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            T t2;
            TextView textView;
            int i2;
            Integer displayQnaOnProfile;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null || (t2 = aVar2.f25631b) == null || t2.isBlock)) {
                a aVar3 = this.this$0;
                if (!(aVar3.f117901k == null || (textView = aVar3.f117901k) == null)) {
                    if (!QnaService.a().enablePublicQna() || (displayQnaOnProfile = t.getDisplayQnaOnProfile()) == null || displayQnaOnProfile.intValue() != 1) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    textView.setVisibility(i2);
                }
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        z.e eVar = new z.e();
        T t = (T) com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) this);
        if (t != null) {
            eVar.element = t;
            TextView textView = (TextView) view.findViewById(R.id.f57);
            this.f117901k = textView;
            if (textView != null) {
                textView.setOnClickListener(new c(this));
            }
            com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class), b.f117903a, new d(this));
            com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), c.f117904a, new e(this, eVar));
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117902a;

        static {
            Covode.recordClassIndex(76398);
        }

        c(a aVar) {
            this.f117902a = aVar;
        }

        public final void onClick(View view) {
            User user;
            String str;
            ClickAgent.onClick(view);
            a aVar = this.f117902a;
            com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(aVar, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
            if (iVar != null && (user = iVar.f117705a) != null) {
                if (aVar.f117900j.getValue() != null) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("to_user_id", user.getUid());
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                r.a("click_qa_entrance", a2.a("from_user_id", g2.getCurUserId()).f66730a);
                SmartRouter.buildRoute(aVar.ar_(), "aweme://user/qna/profile/" + user.getUid()).withParam("enter_from", str).withParam("enter_method", "click_qa_entrance").open();
            }
        }
    }
}
