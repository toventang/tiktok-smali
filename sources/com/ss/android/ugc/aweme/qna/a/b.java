package com.ss.android.ugc.aweme.qna.a;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.i;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Objects;

public final class b extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    Activity f119186j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f119187k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<User> f119188l;

    /* renamed from: m  reason: collision with root package name */
    private final i f119189m = new i(bQ_(), new c(this, null));
    private com.ss.android.ugc.aweme.v.a.a n;
    private final com.bytedance.assem.arch.viewModel.b o;

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$b  reason: collision with other inner class name */
    public static final class C3075b extends m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.f, com.ss.android.ugc.aweme.qna.vm.f> {
        public static final C3075b INSTANCE = new C3075b();

        static {
            Covode.recordClassIndex(77413);
        }

        public C3075b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.qna.vm.f invoke(com.ss.android.ugc.aweme.qna.vm.f fVar) {
            l.c(fVar, "");
            return fVar;
        }
    }

    static {
        Covode.recordClassIndex(77411);
    }

    private final QnaBannerViewModel u() {
        return (QnaBannerViewModel) this.o.getValue();
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(77412);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.qna.api.c> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyData;

        static {
            Covode.recordClassIndex(77414);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyData = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.qna.api.c, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.qna.api.c invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyData
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.qna.api.c> r1 = com.ss.android.ugc.aweme.qna.api.c.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qna.a.b.c.invoke():java.lang.Object");
        }
    }

    public b() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.a aVar = i.a.f25718a;
        h.k.c a2 = ab.a(QnaBannerViewModel.class);
        a aVar2 = new a(a2);
        C3075b bVar2 = C3075b.INSTANCE;
        if (l.a(aVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (l.a(aVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (aVar == null || l.a(aVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.o = bVar;
        this.f119188l = new ArrayList<>();
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f119190a;

        static {
            Covode.recordClassIndex(77415);
        }

        d(h.f.a.b bVar) {
            this.f119190a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                h.f.a.b bVar = this.f119190a;
                l.b(view, "");
                bVar.invoke(view);
            }
        }
    }

    static final class g extends m implements h.f.a.b<View, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(77418);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            String str;
            l.d(view, "");
            b bVar = this.this$0;
            Activity activity = bVar.f119186j;
            if (activity == null) {
                l.a("activity");
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//user/ask/");
            if (bVar.f119187k) {
                str = "qa_personal_profile";
            } else {
                str = "qa_others_profile";
            }
            buildRoute.withParam("enter_from", str).withParam("enter_method", "ask_question").withParam("invited_users", bVar.f119188l).open();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        View view2;
        boolean z;
        l.d(view, "");
        androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this);
        if (b2 != null) {
            this.f119186j = b2;
            String str = ((com.ss.android.ugc.aweme.qna.api.c) this.f119189m.getValue()).f119228c;
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            this.f119187k = TextUtils.equals(str, g2.getCurUserId());
            view.setVisibility(0);
            Activity activity = this.f119186j;
            if (activity == null) {
                l.a("activity");
            }
            Activity activity2 = this.f119186j;
            if (activity2 == null) {
                l.a("activity");
            }
            LayoutInflater layoutInflater = activity2.getLayoutInflater();
            l.b(layoutInflater, "");
            com.ss.android.ugc.aweme.v.a.a aVar = new com.ss.android.ugc.aweme.v.a.a(activity, layoutInflater, R.string.f3m);
            this.n = aVar;
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.RelativeLayout");
            aVar.a((RelativeLayout) view);
            com.ss.android.ugc.aweme.v.a.a aVar2 = this.n;
            if (aVar2 != null) {
                IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g3, "");
                String avatarUrl = g3.getAvatarUrl();
                l.b(avatarUrl, "");
                l.d(avatarUrl, "");
                View view3 = aVar2.f143199a;
                SmartCircleImageView smartCircleImageView = null;
                if (view3 != null) {
                    view2 = view3.findViewById(R.id.e_2);
                } else {
                    view2 = null;
                }
                View view4 = aVar2.f143199a;
                if (view4 != null) {
                    smartCircleImageView = (SmartCircleImageView) view4.findViewById(R.id.e9w);
                }
                if (avatarUrl.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    if (smartCircleImageView != null) {
                        smartCircleImageView.setVisibility(8);
                    }
                } else if (aVar2.f143199a != null) {
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    if (smartCircleImageView != null) {
                        smartCircleImageView.setVisibility(0);
                    }
                    v a2 = r.a(avatarUrl);
                    a2.E = smartCircleImageView;
                    a2.c();
                }
            }
            if (this.n != null) {
                View findViewById = view.findViewById(R.id.e9v);
                l.b(findViewById, "");
                findViewById.setOnClickListener(new d(new g(this)));
            }
            f.a.a(this, u(), c.f119191a, (k) null, new e(this), 6);
            f.a.a(this, u(), d.f119192a, (k) null, new f(view), 6);
        }
    }

    static final class f extends m implements h.f.a.m<p, Boolean, z> {
        final /* synthetic */ View $view;

        static {
            Covode.recordClassIndex(77417);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(View view) {
            super(2);
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, Boolean bool) {
            int i2;
            Boolean bool2 = bool;
            l.d(pVar, "");
            if (bool2 != null) {
                boolean booleanValue = bool2.booleanValue();
                View view = this.$view;
                if (booleanValue) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                view.setVisibility(i2);
            }
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.m<p, User, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(77416);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, User user) {
            ArrayList<User> arrayList;
            User user2 = user;
            l.d(pVar, "");
            if (user2 != null) {
                b bVar = this.this$0;
                String uid = user2.getUid();
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                bVar.f119187k = TextUtils.equals(uid, g2.getCurUserId());
                if (!this.this$0.f119187k && (arrayList = this.this$0.f119188l) != null) {
                    arrayList.add(0, user2);
                }
            }
            return z.f158842a;
        }
    }
}
