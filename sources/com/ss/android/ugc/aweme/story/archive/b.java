package com.ss.android.ugc.aweme.story.archive;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.m;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.z;
import java.util.List;

public final class b extends m<StoryArchListViewModel> {

    /* renamed from: j  reason: collision with root package name */
    final h.h f136742j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f136743k = h.i.a((h.f.a.a) new e(this));

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.assem.a.a f136744l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f136745m;
    private final h.h n;

    public static final class a extends h.f.b.m implements h.f.a.b<h, h> {
        public static final a INSTANCE = new a();

        static {
            Covode.recordClassIndex(89326);
        }

        public a() {
            super(1);
        }

        public final h invoke(h hVar) {
            l.c(hVar, "");
            return hVar;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f136751a = new k();

        static {
            Covode.recordClassIndex(89340);
        }

        k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "story_arch_list";
        }
    }

    static {
        Covode.recordClassIndex(89325);
    }

    @Override // com.bytedance.ext_power_list.m
    public final PowerList v() {
        return (PowerList) this.f136743k.getValue();
    }

    /* renamed from: x */
    public final StoryArchListViewModel u() {
        return (StoryArchListViewModel) this.f136744l.getValue();
    }

    /* access modifiers changed from: package-private */
    public final TuxStatusView y() {
        return (TuxStatusView) this.f136745m.getValue();
    }

    public final TuxStatusView.c z() {
        return (TuxStatusView.c) this.n.getValue();
    }

    static final class e extends h.f.b.m implements h.f.a.a<PowerList> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89334);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PowerList invoke() {
            return this.this$0.s().findViewById(R.id.ec3);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<TuxStatusView> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89339);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxStatusView invoke() {
            TuxStatusView tuxStatusView = (TuxStatusView) this.this$0.s().findViewById(R.id.e_o);
            tuxStatusView.setLayoutVariant(0);
            return tuxStatusView;
        }
    }

    @Override // com.bytedance.ext_power_list.m
    public final com.bytedance.ies.powerlist.page.config.c w() {
        com.bytedance.ies.powerlist.page.config.c cVar = new com.bytedance.ies.powerlist.page.config.c();
        cVar.f34356a = 5;
        cVar.f34357b = true;
        return cVar.a(LoadingFooterCell.class);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.b$b  reason: collision with other inner class name */
    static final class C3571b extends h.f.b.m implements h.f.a.a<TuxStatusView.c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89327);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3571b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxStatusView.c invoke() {
            String str;
            String str2;
            Context ar_ = this.this$0.ar_();
            if (ar_ == null || (str = ar_.getString(R.string.g99)) == null) {
                str = "";
            }
            l.b(str, "");
            Context ar_2 = this.this$0.ar_();
            if (ar_2 == null || (str2 = ar_2.getString(R.string.g98)) == null) {
                str2 = "";
            }
            l.b(str2, "");
            return new TuxStatusView.c().a(str).a((CharSequence) str2).a(com.bytedance.tux.c.c.a(AnonymousClass1.f136746a));
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<TuxStatusView.c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89329);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxStatusView.c invoke() {
            String str;
            String str2;
            Context ar_ = this.this$0.ar_();
            if (ar_ == null || (str = ar_.getString(R.string.g9w)) == null) {
                str = "";
            }
            l.b(str, "");
            Context ar_2 = this.this$0.ar_();
            if (ar_2 == null || (str2 = ar_2.getString(R.string.g9u)) == null) {
                str2 = "";
            }
            l.b(str2, "");
            TuxStatusView.c a2 = new TuxStatusView.c().a(com.bytedance.tux.c.c.a(AnonymousClass1.f136747a)).a(str).a((CharSequence) str2);
            a2.f45362j = new h.f.a.b<TuxButton, z>(this) {
                /* class com.ss.android.ugc.aweme.story.archive.b.c.AnonymousClass2 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(89331);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(TuxButton tuxButton) {
                    String str;
                    TuxButton tuxButton2 = tuxButton;
                    l.d(tuxButton2, "");
                    Context ar_ = this.this$0.this$0.ar_();
                    if (ar_ != null) {
                        str = ar_.getString(R.string.cjx);
                    } else {
                        str = null;
                    }
                    tuxButton2.setText(str);
                    tuxButton2.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_tab_arrow_counter_clockwise_fill));
                    tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                        /* class com.ss.android.ugc.aweme.story.archive.b.c.AnonymousClass2.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass2 f136748a;

                        static {
                            Covode.recordClassIndex(89332);
                        }

                        {
                            this.f136748a = r1;
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            b bVar = this.f136748a.this$0.this$0;
                            bVar.v().setVisibility(8);
                            TuxStatusView y = bVar.y();
                            l.b(y, "");
                            y.setVisibility(0);
                            bVar.y().a();
                            bVar.u().g();
                        }
                    });
                    return z.f158842a;
                }
            };
            return a2;
        }
    }

    public b() {
        k kVar = k.f136751a;
        this.f136744l = new com.bytedance.assem.a.a(ab.a(StoryArchListViewModel.class), kVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.c.f25670a, a.INSTANCE, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        this.f136745m = h.i.a((h.f.a.a) new j(this));
        this.n = h.i.a((h.f.a.a) new c(this));
        this.f136742j = h.i.a((h.f.a.a) new C3571b(this));
    }

    static final class h extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89337);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            l.d(th, "");
            b bVar = this.this$0;
            bVar.a(bVar.z());
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89338);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            l.d(th, "");
            androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this.this$0);
            if (b2 != null) {
                new com.bytedance.tux.g.b(b2).e(R.string.g9h).b();
            }
            return z.f158842a;
        }
    }

    public static final class d extends GridLayoutManager.c {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ GridLayoutManager f136749e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f136750f;

        static {
            Covode.recordClassIndex(89333);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int a(int i2) {
            int headerCount = this.f136750f.v().getHeaderCount();
            List<com.bytedance.ies.powerlist.b.a> c2 = this.f136750f.v().getState().c();
            if (i2 < headerCount) {
                return this.f136749e.f3760b;
            }
            if (i2 >= headerCount + c2.size()) {
                return this.f136749e.f3760b;
            }
            return 1;
        }

        d(GridLayoutManager gridLayoutManager, b bVar) {
            this.f136749e = gridLayoutManager;
            this.f136750f = bVar;
        }
    }

    public final void a(TuxStatusView.c cVar) {
        String str;
        StringBuilder sb = new StringBuilder("show status: ");
        if (l.a(cVar, z())) {
            str = "error";
        } else {
            str = "empty";
        }
        com.ss.android.ugc.aweme.story.j.a.b("StoryArchListAssem", sb.append(str).toString());
        v().setVisibility(8);
        TuxStatusView y = y();
        l.b(y, "");
        y.setVisibility(0);
        y().setStatus(cVar);
    }

    @Override // com.bytedance.ext_power_list.m, com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        y().a();
        v().a(StoryArchListCell.class);
        v().setItemAnimator(null);
        PowerList v = v();
        ar_();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(3);
        gridLayoutManager.a(new d(gridLayoutManager, this));
        v.setLayoutManager(gridLayoutManager);
        super.b(view);
        f.a.a(this, u(), c.f136752a, com.bytedance.assem.arch.viewModel.l.a(), new f(this), 4);
        f.a.a(this, u(), d.f136753a, (com.bytedance.assem.arch.viewModel.k) null, new g(this), 6);
        AssemViewModel.a(u(), e.f136754a, null, new h(this), null, null, 26);
        AssemViewModel.a(u(), f.f136755a, null, new i(this), null, null, 26);
    }

    static final class f extends h.f.b.m implements h.f.a.m<p, List<? extends g>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89335);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, List<? extends g> list) {
            List<? extends g> list2 = list;
            l.d(pVar, "");
            b bVar = this.this$0;
            if (list2 == null || list2.isEmpty()) {
                bVar.a((TuxStatusView.c) bVar.f136742j.getValue());
            } else {
                TuxStatusView y = bVar.y();
                l.b(y, "");
                y.setVisibility(8);
                bVar.v().setVisibility(0);
            }
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends String>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89336);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends String> aVar) {
            androidx.fragment.app.e b2;
            com.bytedance.assem.arch.extensions.a<? extends String> aVar2 = aVar;
            l.d(pVar, "");
            l.d(aVar2, "");
            T t = aVar2.f25631b;
            if (!TextUtils.isEmpty(t) && (b2 = com.bytedance.assem.arch.extensions.b.b(this.this$0)) != null) {
                SmartRouter.buildRoute(b2, "aweme://story/detail").withParam("video_from", "STORY_ENTRANCE_ARCHIVE").withParam("enter_from", "story_archive").withParam("id", (String) t).open();
            }
            return z.f158842a;
        }
    }
}
