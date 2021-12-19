package com.ss.android.ugc.aweme.qna.a;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ag;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaCreationViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaSelectedPageViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.m;
import h.z;
import java.util.Objects;

public final class i extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    public static final g f119202j = new g((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.assem.arch.extensions.i f119203k = new com.bytedance.assem.arch.extensions.i(bQ_(), new e(this, null));

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f119204l;

    /* renamed from: m  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f119205m;
    private final com.bytedance.assem.a.a n;
    private Activity o;
    private Resources p;
    private DmtTabLayout q;
    private Integer r;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.f, com.ss.android.ugc.aweme.qna.vm.f> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(77437);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.qna.vm.f invoke(com.ss.android.ugc.aweme.qna.vm.f fVar) {
            h.f.b.l.c(fVar, "");
            return fVar;
        }
    }

    public static final class d extends m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.h, com.ss.android.ugc.aweme.qna.vm.h> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(77439);
        }

        public d() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.qna.vm.h invoke(com.ss.android.ugc.aweme.qna.vm.h hVar) {
            h.f.b.l.c(hVar, "");
            return hVar;
        }
    }

    public static final class f extends m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.g, com.ss.android.ugc.aweme.qna.vm.g> {
        public static final f INSTANCE = new f();

        static {
            Covode.recordClassIndex(77441);
        }

        public f() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.qna.vm.g invoke(com.ss.android.ugc.aweme.qna.vm.g gVar) {
            h.f.b.l.c(gVar, "");
            return gVar;
        }
    }

    static {
        Covode.recordClassIndex(77435);
    }

    private final QnaBannerViewModel v() {
        return (QnaBannerViewModel) this.f119204l.getValue();
    }

    private final QnaSelectedPageViewModel w() {
        return (QnaSelectedPageViewModel) this.f119205m.getValue();
    }

    public final com.ss.android.ugc.aweme.qna.api.c u() {
        return (com.ss.android.ugc.aweme.qna.api.c) this.f119203k.getValue();
    }

    public static final class g {
        static {
            Covode.recordClassIndex(77442);
        }

        private g() {
        }

        public /* synthetic */ g(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.assem.arch.d.a, com.bytedance.assem.arch.core.p
    public final void t() {
        super.t();
        com.facebook.drawee.a.a.c.a(ar_(), null);
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(77436);
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

    public static final class c extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(77438);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class e extends m implements h.f.a.a<com.ss.android.ugc.aweme.qna.api.c> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyData;

        static {
            Covode.recordClassIndex(77440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(com.bytedance.assem.arch.core.a aVar, String str) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qna.a.i.e.invoke():java.lang.Object");
        }
    }

    public i() {
        com.bytedance.assem.arch.viewModel.b bVar;
        com.bytedance.assem.arch.viewModel.b bVar2;
        i.a aVar = i.a.f25718a;
        h.k.c a2 = ab.a(QnaBannerViewModel.class);
        a aVar2 = new a(a2);
        b bVar3 = b.INSTANCE;
        if (h.f.b.l.a(aVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, bVar3, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (h.f.b.l.a(aVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, bVar3, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (aVar == null || h.f.b.l.a(aVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar3, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f119204l = bVar;
        i.a aVar3 = i.a.f25718a;
        h.k.c a3 = ab.a(QnaSelectedPageViewModel.class);
        c cVar = new c(a3);
        d dVar = d.INSTANCE;
        if (h.f.b.l.a(aVar3, i.a.f25718a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, dVar, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (h.f.b.l.a(aVar3, i.d.f25721a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, dVar, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (aVar3 == null || h.f.b.l.a(aVar3, i.b.f25719a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, dVar, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f119205m = bVar2;
        this.n = new com.bytedance.assem.a.a(ab.a(QnaCreationViewModel.class), null, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.c.f25670a, f.INSTANCE, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f119206a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DmtTabLayout.f f119207b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f119208c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ View f119209d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.b f119210e;

        static {
            Covode.recordClassIndex(77443);
        }

        h(int i2, DmtTabLayout.f fVar, i iVar, View view, com.ss.android.ugc.aweme.qna.b bVar) {
            this.f119206a = i2;
            this.f119207b = fVar;
            this.f119208c = iVar;
            this.f119209d = view;
            this.f119210e = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f119210e.f119264a = this.f119206a;
            this.f119207b.a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.i$i  reason: collision with other inner class name */
    public static final class C3077i implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f119211a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f119212b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qna.b f119213c;

        static {
            Covode.recordClassIndex(77444);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            String str;
            String d2 = this.f119213c.b(i2).d();
            if (d2 != null) {
                boolean a2 = com.ss.android.ugc.aweme.qna.b.b.a(this.f119211a.u().f119228c);
                h.f.b.l.d(d2, "");
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                if (a2) {
                    str = "qa_personal_profile";
                } else {
                    str = "qa_others_profile";
                }
                r.a("change_qa_profile_tab", dVar.a("enter_from", str).a("tab_name", d2).f66730a);
            }
            this.f119211a.a(this.f119213c, i2);
        }

        C3077i(i iVar, View view, com.ss.android.ugc.aweme.qna.b bVar) {
            this.f119211a = iVar;
            this.f119212b = view;
            this.f119213c = bVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.assem.arch.core.p
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.view.View r20) {
        /*
        // Method dump skipped, instructions count: 601
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qna.a.i.b(android.view.View):void");
    }

    public final void a(com.ss.android.ugc.aweme.qna.b bVar, int i2) {
        w().a(bVar.b(i2));
    }

    static final class j extends m implements h.f.a.m<p, Long, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.qna.fragment.g $answersFragment;
        final /* synthetic */ View $view$inlined;
        final /* synthetic */ com.ss.android.ugc.aweme.qna.b $viewPagerAdapter$inlined;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(77445);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(com.ss.android.ugc.aweme.qna.fragment.g gVar, i iVar, View view, com.ss.android.ugc.aweme.qna.b bVar) {
            super(2);
            this.$answersFragment = gVar;
            this.this$0 = iVar;
            this.$view$inlined = view;
            this.$viewPagerAdapter$inlined = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, Long l2) {
            Long l3 = l2;
            h.f.b.l.d(pVar, "");
            if (l3 != null) {
                this.this$0.a(this.$answersFragment, l3.longValue(), this.$viewPagerAdapter$inlined);
            }
            return z.f158842a;
        }
    }

    static final class k extends m implements h.f.a.m<p, Long, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.qna.fragment.m $questionsFragment;
        final /* synthetic */ View $view$inlined;
        final /* synthetic */ com.ss.android.ugc.aweme.qna.b $viewPagerAdapter$inlined;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(77446);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(com.ss.android.ugc.aweme.qna.fragment.m mVar, i iVar, View view, com.ss.android.ugc.aweme.qna.b bVar) {
            super(2);
            this.$questionsFragment = mVar;
            this.this$0 = iVar;
            this.$view$inlined = view;
            this.$viewPagerAdapter$inlined = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, Long l2) {
            Long l3 = l2;
            h.f.b.l.d(pVar, "");
            if (l3 != null) {
                this.this$0.a(this.$questionsFragment, l3.longValue(), this.$viewPagerAdapter$inlined);
            }
            return z.f158842a;
        }
    }

    static final class l extends m implements h.f.a.m<p, com.ss.android.ugc.aweme.qna.vm.e, z> {
        final /* synthetic */ int $questionTabPosition;
        final /* synthetic */ View $view$inlined;
        final /* synthetic */ ViewPager $viewPager$inlined;
        final /* synthetic */ com.ss.android.ugc.aweme.qna.b $viewPagerAdapter$inlined;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(77447);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(int i2, ViewPager viewPager, i iVar, View view, com.ss.android.ugc.aweme.qna.b bVar) {
            super(2);
            this.$questionTabPosition = i2;
            this.$viewPager$inlined = viewPager;
            this.this$0 = iVar;
            this.$view$inlined = view;
            this.$viewPagerAdapter$inlined = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.ss.android.ugc.aweme.qna.vm.e eVar) {
            h.f.b.l.d(pVar, "");
            h.f.b.l.d(eVar, "");
            if (eVar == com.ss.android.ugc.aweme.qna.vm.e.PUBLISH_SUCCEED) {
                this.$viewPager$inlined.setCurrentItem(this.$questionTabPosition, true);
            }
            return z.f158842a;
        }
    }

    public final void a(com.ss.android.ugc.aweme.qna.fragment.a aVar, long j2, com.ss.android.ugc.aweme.qna.b bVar) {
        String string;
        View view;
        TuxTextView tuxTextView;
        String string2;
        View view2;
        TuxTextView tuxTextView2;
        int count = bVar.getCount();
        for (int i2 = 0; i2 < count; i2++) {
            DmtTabLayout dmtTabLayout = this.q;
            if (dmtTabLayout == null) {
                h.f.b.l.a("tabLayout");
            }
            DmtTabLayout.f b2 = dmtTabLayout.b(i2);
            bVar.a(i2);
            Fragment a2 = bVar.a(i2);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment");
            String d2 = ((com.ss.android.ugc.aweme.qna.fragment.a) a2).d();
            String d3 = aVar.d();
            if (h.f.b.l.a((Object) d2, (Object) d3)) {
                if (d3 != null) {
                    int hashCode = d3.hashCode();
                    if (hashCode != -1782234803) {
                        if (hashCode == -847398795 && d3.equals("answers")) {
                            if (j2 == 1000) {
                                Resources resources = this.p;
                                if (resources == null) {
                                    h.f.b.l.a("resources");
                                }
                                string2 = resources.getString(R.string.f43);
                            } else if (j2 > 1000) {
                                Resources resources2 = this.p;
                                if (resources2 == null) {
                                    h.f.b.l.a("resources");
                                }
                                string2 = resources2.getString(R.string.f44);
                            } else {
                                Resources resources3 = this.p;
                                if (resources3 == null) {
                                    h.f.b.l.a("resources");
                                }
                                string2 = resources3.getString(R.string.f45, com.ss.android.ugc.aweme.i18n.b.a(j2));
                            }
                            h.f.b.l.b(string2, "");
                            if (!(b2 == null || (view2 = b2.f33753f) == null || (tuxTextView2 = (TuxTextView) view2.findViewById(R.id.ehl)) == null)) {
                                tuxTextView2.setText(string2);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (d3.equals("questions")) {
                        if (j2 == 1000) {
                            Resources resources4 = this.p;
                            if (resources4 == null) {
                                h.f.b.l.a("resources");
                            }
                            string = resources4.getString(R.string.f47);
                        } else if (j2 > 1000) {
                            Resources resources5 = this.p;
                            if (resources5 == null) {
                                h.f.b.l.a("resources");
                            }
                            string = resources5.getString(R.string.f48);
                        } else {
                            Resources resources6 = this.p;
                            if (resources6 == null) {
                                h.f.b.l.a("resources");
                            }
                            string = resources6.getString(R.string.f46, com.ss.android.ugc.aweme.i18n.b.a(j2));
                        }
                        h.f.b.l.b(string, "");
                        if (!(b2 == null || (view = b2.f33753f) == null || (tuxTextView = (TuxTextView) view.findViewById(R.id.ehl)) == null)) {
                            tuxTextView.setText(string);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
