package com.ss.android.ugc.aweme.favorites.c;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.z;
import h.z;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class h extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.assem.arch.extensions.i f90523j = new com.bytedance.assem.arch.extensions.i(bQ_(), new c(this, null));

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.assem.arch.extensions.i f90524k = new com.bytedance.assem.arch.extensions.i(bQ_(), new d(this, null));

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f90525l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f90526m;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.favorites.viewmodel.d, com.ss.android.ugc.aweme.favorites.viewmodel.d> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(56835);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.favorites.viewmodel.d invoke(com.ss.android.ugc.aweme.favorites.viewmodel.d dVar) {
            h.f.b.l.c(dVar, "");
            return dVar;
        }
    }

    public interface f extends com.bytedance.assem.arch.service.c {
        static {
            Covode.recordClassIndex(56839);
        }

        void a();

        void c();

        void d();
    }

    static {
        Covode.recordClassIndex(56833);
    }

    public final com.ss.android.ugc.aweme.favorites.api.d u() {
        return (com.ss.android.ugc.aweme.favorites.api.d) this.f90523j.getValue();
    }

    public final e v() {
        return (e) this.f90524k.getValue();
    }

    public final VideoCollectionContentViewModel w() {
        return (VideoCollectionContentViewModel) this.f90525l.getValue();
    }

    public final f x() {
        return (f) this.f90526m.getValue();
    }

    public static final class e implements com.bytedance.assem.arch.extensions.c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f90527a;

        static {
            Covode.recordClassIndex(56838);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && this.f90527a == ((e) obj).f90527a;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.f90527a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "Config(hasMoreCollection=" + this.f90527a + ")";
        }

        private /* synthetic */ e() {
            this(false);
        }

        public e(boolean z) {
            this.f90527a = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$h  reason: collision with other inner class name */
    static final class C2187h extends h.f.b.m implements h.f.a.a<f> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(56841);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2187h(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            return com.bytedance.assem.arch.service.d.b(this.this$0, ab.a(f.class));
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(56834);
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

    public static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.favorites.api.d> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyData;

        static {
            Covode.recordClassIndex(56836);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyData = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.favorites.api.d, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.favorites.api.d invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyData
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.favorites.api.d> r1 = com.ss.android.ugc.aweme.favorites.api.d.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.c.h.c.invoke():java.lang.Object");
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<e> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(56837);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.favorites.c.h$e, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.favorites.c.h.e invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.favorites.c.h$e> r1 = com.ss.android.ugc.aweme.favorites.c.h.e.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.c.h.d.invoke():java.lang.Object");
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<ad.b> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(56840);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            String str = this.this$0.u().f90449a;
            if (str == null) {
                str = "";
            }
            return VideoCollectionContentViewModel.a.a(str);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ View $icManage;
        final /* synthetic */ View $icMore;
        final /* synthetic */ View $operateView;
        final /* synthetic */ z.c $scrollY;
        final /* synthetic */ TuxStatusView $statusView;
        final /* synthetic */ View $tvBack;
        final /* synthetic */ TextView $tvCancel;

        static {
            Covode.recordClassIndex(56843);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(TuxStatusView tuxStatusView, View view, z.c cVar, View view2, View view3, TextView textView, View view4) {
            super(0);
            this.$statusView = tuxStatusView;
            this.$icManage = view;
            this.$scrollY = cVar;
            this.$tvBack = view2;
            this.$icMore = view3;
            this.$tvCancel = textView;
            this.$operateView = view4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            com.bytedance.tux.h.i.b(this.$statusView, null, 0, null, null, false, 29);
            this.$statusView.a();
            this.$statusView.setVisibility(0);
            this.$icManage.setEnabled(false);
            this.$scrollY.element = 0;
            this.$tvBack.setVisibility(0);
            this.$icMore.setVisibility(0);
            this.$tvCancel.setVisibility(8);
            this.$operateView.setVisibility(8);
            return h.z.f158842a;
        }
    }

    public h() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        g gVar = new g(this);
        h.k.c a2 = ab.a(VideoCollectionContentViewModel.class);
        a aVar = new a(a2);
        b bVar2 = b.INSTANCE;
        if (h.f.b.l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), gVar, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (h.f.b.l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), gVar, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || h.f.b.l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), gVar, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f90525l = bVar;
        this.f90526m = h.i.a((h.f.a.a) new C2187h(this));
    }

    static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f90532a;

        static {
            Covode.recordClassIndex(56846);
        }

        l(androidx.fragment.app.e eVar) {
            this.f90532a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f90532a.finish();
        }
    }

    static final class m implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f90533a;

        static {
            Covode.recordClassIndex(56847);
        }

        m(h hVar) {
            this.f90533a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f90533a.w().a(true);
        }
    }

    static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f90534a;

        static {
            Covode.recordClassIndex(56848);
        }

        n(h hVar) {
            this.f90534a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f90534a.w().a(false);
        }
    }

    static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f90537a;

        static {
            Covode.recordClassIndex(56850);
        }

        p(h hVar) {
            this.f90537a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f90537a.x().c();
        }
    }

    static final class q implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f90538a;

        static {
            Covode.recordClassIndex(56851);
        }

        q(h hVar) {
            this.f90538a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f90538a.x().d();
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<Throwable, h.z> {
        final /* synthetic */ TuxStatusView $statusView;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(56844);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(h hVar, TuxStatusView tuxStatusView) {
            super(1);
            this.this$0 = hVar;
            this.$statusView = tuxStatusView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Throwable th) {
            h.f.b.l.d(th, "");
            com.bytedance.tux.h.i.b(this.$statusView, null, 0, null, null, false, 29);
            this.$statusView.setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new h.f.a.a<h.z>(this) {
                /* class com.ss.android.ugc.aweme.favorites.c.h.k.AnonymousClass1 */
                final /* synthetic */ k this$0;

                static {
                    Covode.recordClassIndex(56845);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ h.z invoke() {
                    this.this$0.this$0.w().d(true);
                    return h.z.f158842a;
                }
            }));
            this.$statusView.setVisibility(0);
            return h.z.f158842a;
        }
    }

    static final class o implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f90535a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f90536b;

        static {
            Covode.recordClassIndex(56849);
        }

        o(h hVar, androidx.fragment.app.e eVar) {
            this.f90535a = hVar;
            this.f90536b = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            e v = this.f90535a.v();
            if (v == null || !v.f90527a) {
                new com.bytedance.tux.g.b(this.f90536b).e(R.string.bu0).b();
            } else {
                this.f90535a.x().a();
            }
        }
    }

    static final class r extends h.f.b.m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.favorites.viewmodel.a>, h.z> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ Context $context;
        final /* synthetic */ View $icManage;
        final /* synthetic */ View $icMore;
        final /* synthetic */ View $operateView;
        final /* synthetic */ RecyclerView $rv;
        final /* synthetic */ TuxStatusView $statusView;
        final /* synthetic */ View $tvBack;
        final /* synthetic */ TextView $tvCancel;
        final /* synthetic */ TextView $tvMove;
        final /* synthetic */ TextView $tvName;
        final /* synthetic */ TextView $tvRemove;
        final /* synthetic */ TextView $tvSelected;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(56852);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(h hVar, TuxStatusView tuxStatusView, Context context, androidx.fragment.app.e eVar, View view, TextView textView, TextView textView2, View view2, View view3, TextView textView3, View view4, TextView textView4, TextView textView5, RecyclerView recyclerView) {
            super(1);
            this.this$0 = hVar;
            this.$statusView = tuxStatusView;
            this.$context = context;
            this.$activity = eVar;
            this.$icManage = view;
            this.$tvName = textView;
            this.$tvSelected = textView2;
            this.$tvBack = view2;
            this.$icMore = view3;
            this.$tvCancel = textView3;
            this.$operateView = view4;
            this.$tvMove = textView4;
            this.$tvRemove = textView5;
            this.$rv = recyclerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(List<? extends com.ss.android.ugc.aweme.favorites.viewmodel.a> list) {
            boolean z;
            int i2;
            String str;
            int i3;
            int i4;
            int i5;
            int i6;
            boolean z2;
            float f2;
            e v;
            String string;
            List<? extends com.ss.android.ugc.aweme.favorites.viewmodel.a> list2 = list;
            h.f.b.l.d(list2, "");
            int i7 = 8;
            boolean z3 = true;
            int i8 = 0;
            if (list2.isEmpty()) {
                TuxStatusView tuxStatusView = this.$statusView;
                Resources system = Resources.getSystem();
                h.f.b.l.a((Object) system, "");
                com.bytedance.tux.h.i.b(tuxStatusView, null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 140.0f, system.getDisplayMetrics()))), null, null, false, 29);
                TuxStatusView tuxStatusView2 = this.$statusView;
                TuxStatusView.c cVar = new TuxStatusView.c();
                String string2 = this.$context.getString(R.string.btp);
                h.f.b.l.b(string2, "");
                TuxStatusView.c a2 = cVar.a(string2);
                String string3 = this.$context.getString(R.string.bto);
                h.f.b.l.b(string3, "");
                TuxStatusView.c a3 = a2.a((CharSequence) string3).a(com.bytedance.tux.c.c.a(AnonymousClass1.f90539a));
                a3.f45362j = new h.f.a.b<TuxButton, h.z>(this) {
                    /* class com.ss.android.ugc.aweme.favorites.c.h.r.AnonymousClass2 */
                    final /* synthetic */ r this$0;

                    static {
                        Covode.recordClassIndex(56854);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ h.z invoke(TuxButton tuxButton) {
                        TuxButton tuxButton2 = tuxButton;
                        h.f.b.l.d(tuxButton2, "");
                        tuxButton2.setButtonSize(3);
                        tuxButton2.setButtonVariant(1);
                        tuxButton2.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_plus));
                        tuxButton2.setText(R.string.btu);
                        tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                            /* class com.ss.android.ugc.aweme.favorites.c.h.r.AnonymousClass2.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass2 f90540a;

                            static {
                                Covode.recordClassIndex(56855);
                            }

                            {
                                this.f90540a = r1;
                            }

                            public final void onClick(View view) {
                                ClickAgent.onClick(view);
                                SmartRouter.buildRoute(this.f90540a.this$0.$activity, "aweme://favorite/videos/collections/add/video").withParam("collectionId", this.f90540a.this$0.this$0.u().f90449a).withParam("from", "COLLECTION_CONTENT").open();
                            }
                        });
                        return h.z.f158842a;
                    }
                };
                tuxStatusView2.setStatus(a3);
                this.$statusView.setVisibility(0);
                this.$icManage.setEnabled(false);
            } else {
                this.$statusView.setVisibility(8);
                this.$icManage.setEnabled(true);
            }
            this.$tvName.setText(this.this$0.u().f90450b);
            boolean z4 = list2 instanceof Collection;
            if (!z4 || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().f91002b != 0) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (!z4 || !list2.isEmpty()) {
                Iterator<T> it2 = list2.iterator();
                i2 = 0;
                while (it2.hasNext()) {
                    if (it2.next().f91002b == 2 && (i2 = i2 + 1) < 0) {
                        h.a.n.b();
                    }
                }
            } else {
                i2 = 0;
            }
            TextView textView = this.$tvSelected;
            Context context = this.$context;
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (context == null || (string = context.getString(R.string.bu8)) == null) {
                str = null;
            } else {
                str = com.a.a(string, Arrays.copyOf(new Object[]{String.valueOf(i2)}, 1));
                h.f.b.l.b(str, "");
            }
            textView.setText(str);
            View view = this.$tvBack;
            if (z) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            view.setVisibility(i3);
            View view2 = this.$icMore;
            if (z) {
                i4 = 8;
            } else {
                i4 = 0;
            }
            view2.setVisibility(i4);
            TextView textView2 = this.$tvCancel;
            if (z) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            textView2.setVisibility(i5);
            View view3 = this.$operateView;
            if (z) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            view3.setVisibility(i6);
            View view4 = this.$icManage;
            if (!z) {
                i7 = 0;
            }
            view4.setVisibility(i7);
            TextView textView3 = this.$tvMove;
            if (i2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            textView3.setEnabled(z2);
            TextView textView4 = this.$tvMove;
            float f3 = 1.0f;
            if (!textView4.isEnabled() || (v = this.this$0.v()) == null || !v.f90527a) {
                f2 = 0.4f;
            } else {
                f2 = 1.0f;
            }
            textView4.setAlpha(f2);
            TextView textView5 = this.$tvRemove;
            if (i2 <= 0) {
                z3 = false;
            }
            textView5.setEnabled(z3);
            TextView textView6 = this.$tvRemove;
            if (!textView6.isEnabled()) {
                f3 = 0.4f;
            }
            textView6.setAlpha(f3);
            ViewGroup.LayoutParams layoutParams = this.$rv.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = layoutParams;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
            if (marginLayoutParams2 != null) {
                if (z) {
                    i8 = this.$operateView.getHeight();
                }
                marginLayoutParams2.bottomMargin = i8;
                this.$rv.setLayoutParams(marginLayoutParams2);
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        String str;
        String string;
        h.f.b.l.d(view, "");
        View findViewById = view.findViewById(R.id.dy3);
        h.f.b.l.b(findViewById, "");
        TextView textView = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.a8f);
        h.f.b.l.b(findViewById2, "");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        View findViewById3 = view.findViewById(R.id.ckg);
        h.f.b.l.b(findViewById3, "");
        View findViewById4 = view.findViewById(R.id.czl);
        h.f.b.l.b(findViewById4, "");
        TextView textView2 = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.czm);
        h.f.b.l.b(findViewById5, "");
        TextView textView3 = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.q9);
        h.f.b.l.b(findViewById6, "");
        View findViewById7 = view.findViewById(R.id.cs_);
        h.f.b.l.b(findViewById7, "");
        TextView textView4 = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.a1p);
        h.f.b.l.b(findViewById8, "");
        TextView textView5 = (TextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.biz);
        h.f.b.l.b(findViewById9, "");
        View findViewById10 = view.findViewById(R.id.bj2);
        h.f.b.l.b(findViewById10, "");
        View findViewById11 = view.findViewById(R.id.e_o);
        h.f.b.l.b(findViewById11, "");
        TuxStatusView tuxStatusView = (TuxStatusView) findViewById11;
        androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this);
        if (b2 != null) {
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            float applyDimension = TypedValue.applyDimension(1, 120.0f, system.getDisplayMetrics());
            z.c cVar = new z.c();
            cVar.element = 0;
            recyclerView.a(new i(cVar, applyDimension, findViewById9, textView4));
            textView4.setText(u().f90450b);
            findViewById6.setOnClickListener(new l(b2));
            findViewById9.setOnClickListener(new m(this));
            textView5.setOnClickListener(new n(this));
            Context ar_ = ar_();
            if (ar_ == null || (string = ar_.getString(R.string.bu8)) == null) {
                str = null;
            } else {
                str = com.a.a(string, Arrays.copyOf(new Object[]{"0"}, 1));
                h.f.b.l.b(str, "");
            }
            textView.setText(str);
            textView2.setOnClickListener(new o(this, b2));
            textView3.setOnClickListener(new p(this));
            findViewById10.setOnClickListener(new q(this));
            Context context = tuxStatusView.getContext();
            AssemViewModel.a(w(), i.f90541a, null, new k(this, tuxStatusView), new j(tuxStatusView, findViewById9, cVar, findViewById6, findViewById10, textView5, findViewById3), new r(this, tuxStatusView, context, b2, findViewById9, textView4, textView, findViewById6, findViewById10, textView5, findViewById3, textView2, textView3, recyclerView), 2);
        }
    }

    public static final class i extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.c f90528a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f90529b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f90530c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f90531d;

        static {
            Covode.recordClassIndex(56842);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            float f2;
            boolean z;
            h.f.b.l.d(recyclerView, "");
            this.f90528a.element += i3;
            if (((float) this.f90528a.element) > this.f90529b) {
                f2 = 1.0f;
            } else {
                f2 = ((float) this.f90528a.element) / this.f90529b;
            }
            this.f90530c.setAlpha(f2);
            View view = this.f90530c;
            if (f2 > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            view.setEnabled(z);
            this.f90531d.setAlpha(f2);
        }

        i(z.c cVar, float f2, View view, TextView textView) {
            this.f90528a = cVar;
            this.f90529b = f2;
            this.f90530c = view;
            this.f90531d = textView;
        }
    }
}
