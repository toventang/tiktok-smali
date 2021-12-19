package com.ss.android.ugc.aweme.qna.a;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.a.w;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.google.android.material.appbar.AppBarLayout;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.ui.a;
import com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;

public final class e extends com.bytedance.assem.arch.d.a {

    /* renamed from: l  reason: collision with root package name */
    public static final d f119193l = new d((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public Activity f119194j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f119195k;

    /* renamed from: m  reason: collision with root package name */
    private final com.bytedance.assem.arch.extensions.i f119196m = new com.bytedance.assem.arch.extensions.i(bQ_(), new c(this, null));
    private final com.bytedance.assem.arch.viewModel.b n;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.f, com.ss.android.ugc.aweme.qna.vm.f> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(77423);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.qna.vm.f invoke(com.ss.android.ugc.aweme.qna.vm.f fVar) {
            l.c(fVar, "");
            return fVar;
        }
    }

    static {
        Covode.recordClassIndex(77421);
    }

    private final com.ss.android.ugc.aweme.qna.api.c u() {
        return (com.ss.android.ugc.aweme.qna.api.c) this.f119196m.getValue();
    }

    private final QnaBannerViewModel v() {
        return (QnaBannerViewModel) this.n.getValue();
    }

    public static final class d {
        static {
            Covode.recordClassIndex(77425);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(77422);
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
            Covode.recordClassIndex(77424);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qna.a.e.c.invoke():java.lang.Object");
        }
    }

    static final class h extends m implements h.f.a.a<z> {
        final /* synthetic */ View $headerContainer;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(77429);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(e eVar, View view) {
            super(0);
            this.this$0 = eVar;
            this.$headerContainer = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            int i2;
            View view = this.$headerContainer;
            l.b(view, "");
            if (!this.this$0.f119195k) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
            return z.f158842a;
        }
    }

    public e() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.a aVar = i.a.f25718a;
        h.k.c a2 = ab.a(QnaBannerViewModel.class);
        a aVar2 = new a(a2);
        b bVar2 = b.INSTANCE;
        if (l.a(aVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (l.a(aVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (aVar == null || l.a(aVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.n = bVar;
    }

    public static final class f extends com.ss.android.ugc.aweme.qna.ui.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f119198a;

        static {
            Covode.recordClassIndex(77427);
        }

        f(TextView textView) {
            this.f119198a = textView;
        }

        @Override // com.ss.android.ugc.aweme.qna.ui.a
        public final void a(a.EnumC3087a aVar) {
            if (aVar != null) {
                int i2 = f.f119200a[aVar.ordinal()];
                if (i2 == 1) {
                    TextView textView = this.f119198a;
                    l.b(textView, "");
                    textView.setVisibility(0);
                } else if (i2 == 2) {
                    TextView textView2 = this.f119198a;
                    l.b(textView2, "");
                    textView2.setVisibility(8);
                } else if (i2 == 3) {
                    TextView textView3 = this.f119198a;
                    l.b(textView3, "");
                    textView3.setVisibility(0);
                }
            }
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f119199a;

        static {
            Covode.recordClassIndex(77428);
        }

        g(e eVar) {
            this.f119199a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            e.a(this.f119199a).finish();
        }
    }

    public static final /* synthetic */ Activity a(e eVar) {
        Activity activity = eVar.f119194j;
        if (activity == null) {
            l.a("activity");
        }
        return activity;
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$e  reason: collision with other inner class name */
    static final class View$OnClickListenerC3076e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f119197a;

        static {
            Covode.recordClassIndex(77426);
        }

        View$OnClickListenerC3076e(e eVar) {
            this.f119197a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f119197a.ar_(), "//qna/settings").open();
        }
    }

    static final class j extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ View $headerContainer;

        static {
            Covode.recordClassIndex(77431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(View view) {
            super(1);
            this.$headerContainer = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            l.d(th, "");
            View view = this.$headerContainer;
            l.b(view, "");
            view.setVisibility(8);
            return z.f158842a;
        }
    }

    static final class i extends m implements h.f.a.b<com.ss.android.ugc.aweme.qna.api.h, z> {
        final /* synthetic */ SmartImageView $avatarView;
        final /* synthetic */ View $headerContainer;
        final /* synthetic */ TextView $nameView;
        final /* synthetic */ TextView $titleView;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(77430);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(e eVar, View view, TextView textView, TextView textView2, SmartImageView smartImageView) {
            super(1);
            this.this$0 = eVar;
            this.$headerContainer = view;
            this.$titleView = textView;
            this.$nameView = textView2;
            this.$avatarView = smartImageView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.qna.api.h hVar) {
            int i2;
            User user;
            String string;
            com.ss.android.ugc.aweme.qna.api.h hVar2 = hVar;
            View view = this.$headerContainer;
            l.b(view, "");
            if (!this.this$0.f119195k) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
            if (!(hVar2 == null || (user = hVar2.f119248e) == null)) {
                String a2 = in.a(user, false);
                Resources resources = e.a(this.this$0).getResources();
                if (this.this$0.f119195k) {
                    string = resources.getString(R.string.f6d);
                } else {
                    string = resources.getString(R.string.f42, a2);
                }
                l.b(string, "");
                TextView textView = this.$titleView;
                l.b(textView, "");
                textView.setText(string);
                TextView textView2 = this.$nameView;
                l.b(textView2, "");
                textView2.setText(string);
                UrlModel avatarThumb = user.getAvatarThumb();
                l.b(avatarThumb, "");
                v b2 = r.a(com.ss.android.ugc.aweme.base.v.a(avatarThumb)).b(em.a(100));
                b2.K = true;
                v a3 = b2.a("QnaProfile");
                a3.v = w.CENTER_CROP;
                a3.E = this.$avatarView;
                a3.c();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        Long l2;
        l.d(view, "");
        androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this);
        if (b2 != null) {
            this.f119194j = b2;
            String str = u().f119228c;
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            this.f119195k = TextUtils.equals(str, g2.getCurUserId());
            TextView textView = (TextView) view.findViewById(R.id.des);
            TextView textView2 = (TextView) view.findViewById(R.id.det);
            SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.deq);
            View findViewById = view.findViewById(R.id.der);
            AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(R.id.dei);
            if (this.f119195k) {
                l.b(textView2, "");
                textView2.setVisibility(0);
                l.b(findViewById, "");
                findViewById.setVisibility(8);
                appBarLayout.setExpanded(false);
            } else {
                appBarLayout.a(new f(textView2));
            }
            ((TuxIconView) view.findViewById(R.id.dek)).setOnClickListener(new g(this));
            QnaBannerViewModel v = v();
            String str2 = u().f119228c;
            if (str2 != null) {
                l2 = p.g(str2);
            } else {
                l2 = null;
            }
            IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g3, "");
            String lastRecordedSecUid = g3.getLastRecordedSecUid();
            l.b(lastRecordedSecUid, "");
            v.a(l2, lastRecordedSecUid);
            AssemViewModel.a(v(), g.f119201a, null, new j(findViewById), new h(this, findViewById), new i(this, findViewById, textView2, textView, smartImageView), 2);
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.dev);
            if (l.a((Object) u().f119227b, (Object) "click_creator_qna") || l.a((Object) u().f119227b, (Object) "click_toast") || l.a((Object) u().f119227b, (Object) "creator_tools")) {
                l.b(tuxIconView, "");
                tuxIconView.setVisibility(0);
            }
            tuxIconView.setOnClickListener(new View$OnClickListenerC3076e(this));
        }
    }
}
