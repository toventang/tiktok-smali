package com.ss.android.ugc.aweme.view.b;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.i;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.t;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.x;
import com.ss.android.ugc.aweme.model.j;
import com.ss.android.ugc.aweme.model.n;
import com.ss.android.ugc.aweme.model.q;
import com.ss.android.ugc.aweme.model.r;
import com.ss.android.ugc.aweme.model.u;
import com.ss.android.ugc.aweme.profile.ui.v2.z;
import com.ss.android.ugc.aweme.utils.hx;
import com.ss.android.ugc.aweme.view.customView.NaviGLSurfaceView;
import com.ss.android.ugc.aweme.view.customView.NaviNonSwipingViewPager;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSpinnerViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

public final class c extends com.ss.android.ugc.aweme.view.customView.b {

    /* renamed from: b  reason: collision with root package name */
    public i f144114b;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f144115c = h.i.a((h.f.a.a) new a(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.h f144116d = h.i.a((h.f.a.a) new h(this));

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f144117e;

    static {
        Covode.recordClassIndex(94306);
    }

    @Override // com.ss.android.ugc.aweme.view.customView.b
    public final View a(int i2) {
        if (this.f144117e == null) {
            this.f144117e = new SparseArray();
        }
        View view = (View) this.f144117e.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f144117e.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.view.customView.b
    public final int b() {
        return R.layout.apo;
    }

    @Override // com.ss.android.ugc.aweme.view.customView.b
    public final void j() {
        SparseArray sparseArray = this.f144117e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final ProfileNaviCreatorViewModel k() {
        return (ProfileNaviCreatorViewModel) this.f144115c.getValue();
    }

    public final ProfileNaviSpinnerViewModel l() {
        return (ProfileNaviSpinnerViewModel) this.f144116d.getValue();
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.view.customView.b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        j();
    }

    @Override // com.ss.android.ugc.aweme.view.customView.b
    public final NaviGLSurfaceView e() {
        return (NaviGLSurfaceView) a(R.id.ct2);
    }

    static final class a extends m implements h.f.a.a<ProfileNaviCreatorViewModel> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(94307);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ProfileNaviCreatorViewModel invoke() {
            JediViewModel a2 = t.a(this.this$0.requireActivity()).a(ProfileNaviCreatorViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    static final class h extends m implements h.f.a.a<ProfileNaviSpinnerViewModel> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(94319);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ProfileNaviSpinnerViewModel invoke() {
            JediViewModel a2 = t.a(this.this$0.requireActivity()).a(ProfileNaviSpinnerViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.view.customView.b
    public final void g() {
        super.g();
        f.a.b.b unused = selectSubscribe(a(), d.f144127a, new ah(), new f(this));
        f.a.b.b unused2 = selectSubscribe(a(), e.f144129a, new ah(), new g(this));
    }

    public final boolean m() {
        a();
        if (r.f110811a == null) {
            return true;
        }
        a();
        q qVar = r.f110811a;
        if (qVar == null) {
            l.b();
        }
        if (!z.a(qVar.f110805a)) {
            return true;
        }
        return false;
    }

    public final String n() {
        ViewPager viewPager = (ViewPager) a(R.id.ct7);
        l.b(viewPager, "");
        int currentItem = viewPager.getCurrentItem();
        List<u> tabList = ((ProfileNaviEditorState) a().a(this)).getTabList();
        if (tabList == null || tabList.size() <= currentItem) {
            return null;
        }
        return tabList.get(currentItem).a();
    }

    public final void o() {
        ViewPager viewPager = (ViewPager) a(R.id.ct4);
        if (viewPager != null) {
            viewPager.setAdapter(null);
        }
        NaviNonSwipingViewPager naviNonSwipingViewPager = (NaviNonSwipingViewPager) a(R.id.ct7);
        if (naviNonSwipingViewPager != null) {
            naviNonSwipingViewPager.setVisibility(0);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.ct3);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.view.customView.b
    public final void c() {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.da4);
        if (tuxTextView != null) {
            tuxTextView.setOnClickListener(new b(this));
        }
        TuxIconView tuxIconView = (TuxIconView) a(R.id.d_x);
        if (tuxIconView != null) {
            tuxIconView.setOnClickListener(new View$OnClickListenerC3837c(this));
        }
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.da5);
        if (tuxTextView2 != null) {
            tuxTextView2.setOnClickListener(new d(this));
        }
        ((TuxButton) a(R.id.ct1)).setOnClickListener(new e(this));
    }

    public c(i iVar) {
        l.d(iVar, "");
        this.f144114b = iVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.view.b.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC3837c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f144119a;

        static {
            Covode.recordClassIndex(94309);
        }

        View$OnClickListenerC3837c(c cVar) {
            this.f144119a = cVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.common.r.a("click_exit_avatar", new com.ss.android.ugc.aweme.app.f.d().a("item_tab", this.f144119a.n()).f66730a);
            if (this.f144119a.getContext() != null) {
                a.C0731a a2 = new a.C0731a(this.f144119a.getContext()).a(R.string.a1j);
                Context context = this.f144119a.getContext();
                if (context != null) {
                    str = context.getString(R.string.a1h);
                } else {
                    str = null;
                }
                a2.f33402b = str;
                a2.M = true;
                com.bytedance.ies.dmt.ui.dialog.a a3 = a2.a(R.string.a1i, (DialogInterface.OnClickListener) new a(this), false).b(R.string.a12, (DialogInterface.OnClickListener) b.f144121a, false).a();
                com.ss.android.ugc.aweme.bn.a.a();
                a3.c();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.view.b.c$c$b */
        static final class b implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static final b f144121a = new b();

            static {
                Covode.recordClassIndex(94311);
            }

            b() {
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                com.ss.android.ugc.aweme.common.r.a("cancel_exit_avatar", new com.ss.android.ugc.aweme.app.f.d().f66730a);
                dialogInterface.cancel();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.view.b.c$c$a */
        static final class a implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ View$OnClickListenerC3837c f144120a;

            static {
                Covode.recordClassIndex(94310);
            }

            a(View$OnClickListenerC3837c cVar) {
                this.f144120a = cVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                boolean m2 = this.f144120a.f144119a.m();
                com.ss.android.ugc.aweme.common.r.a("confirm_exit_avatar", new com.ss.android.ugc.aweme.app.f.d().a("is_new", m2 ? 1 : 0).a("end_time", String.valueOf(new Date().getTime())).f66730a);
                ProfileNaviEditorViewModel a2 = this.f144120a.f144119a.a();
                a2.d(ProfileNaviEditorViewModel.s.f144356a);
                a2.d(ProfileNaviEditorViewModel.t.f144357a);
            }
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f144118a;

        static {
            Covode.recordClassIndex(94308);
        }

        b(c cVar) {
            this.f144118a = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0093 A[LOOP:0: B:24:0x008d->B:26:0x0093, LOOP_END] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r6) {
            /*
            // Method dump skipped, instructions count: 196
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.view.b.c.b.onClick(android.view.View):void");
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f144122a;

        static {
            Covode.recordClassIndex(94312);
        }

        d(c cVar) {
            this.f144122a = cVar;
        }

        public final void onClick(View view) {
            com.ss.android.ugc.aweme.model.d dVar;
            String str;
            String str2;
            String str3;
            String a2;
            ClickAgent.onClick(view);
            this.f144122a.o();
            x editCategory = ((ProfileNaviEditorState) this.f144122a.a().a(this.f144122a)).getEditCategory();
            this.f144122a.a();
            q qVar = r.f110811a;
            if (editCategory != null) {
                dVar = editCategory.f76613b;
                if (!(dVar == null || qVar == null)) {
                    if (z.a(dVar.h())) {
                        a2 = dVar.h();
                        if (a2 == null) {
                            l.b();
                        }
                    } else {
                        a2 = dVar.a();
                    }
                    if (qVar.b(a2) != null) {
                        n b2 = qVar.b(a2);
                        if (b2 == null) {
                            l.b();
                        }
                        str = b2.a();
                    } else if (qVar.c(a2) != null) {
                        j c2 = qVar.c(a2);
                        if (c2 == null) {
                            l.b();
                        }
                        str = c2.f110772a;
                    }
                }
                str = null;
            } else {
                dVar = null;
                str = null;
            }
            if (editCategory != null) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                for (Map.Entry<String, Integer> entry : editCategory.f76612a.entrySet()) {
                    sb.append(entry.getKey());
                    sb2.append(entry.getValue().intValue());
                    sb.append(",");
                    sb2.append(",");
                }
                str2 = sb.toString();
                str3 = sb2.toString();
            } else {
                str2 = null;
                str3 = null;
            }
            com.ss.android.ugc.aweme.common.r.a("submit_avatar_detail", new com.ss.android.ugc.aweme.app.f.d().a("item_id", str).a("item_tab", dVar != null ? dVar.a() : null).a("detail_category", str2).a("value", str3).f66730a);
            ProfileNaviEditorState profileNaviEditorState = (ProfileNaviEditorState) this.f144122a.a().at_();
            x editCategory2 = profileNaviEditorState.getEditCategory();
            if (editCategory2 != null) {
                editCategory2.a();
            }
            profileNaviEditorState.setEditCategory(null);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f144123a;

        static {
            Covode.recordClassIndex(94313);
        }

        e(c cVar) {
            this.f144123a = cVar;
        }

        public final void onClick(View view) {
            com.ss.android.ugc.aweme.view.customView.a naviManager;
            ClickAgent.onClick(view);
            this.f144123a.l().d(ProfileNaviSpinnerViewModel.b.f144405a);
            String n = this.f144123a.n();
            this.f144123a.a();
            q qVar = r.f110811a;
            boolean m2 = this.f144123a.m();
            String valueOf = String.valueOf(new Date().getTime());
            StringBuilder sb = new StringBuilder();
            if (qVar != null) {
                for (n nVar : qVar.f110807c.values()) {
                    sb.append(nVar.a());
                    sb.append(",");
                }
                for (j jVar : qVar.f110808d.values()) {
                    sb.append(jVar.f110772a);
                    sb.append(",");
                }
            }
            com.ss.android.ugc.aweme.common.r.a("save_avatar", new com.ss.android.ugc.aweme.app.f.d().a("is_new", m2 ? 1 : 0).a("last_item_tab", n).a("item_list", sb.toString()).a("end_time", valueOf).f66730a);
            c cVar = this.f144123a;
            ((NaviGLSurfaceView) cVar.a(R.id.ct2)).setCamera(false);
            NaviGLSurfaceView e2 = cVar.e();
            if (!(e2 == null || (naviManager = e2.getNaviManager()) == null)) {
                naviManager.a(66670, 1, 1, "");
            }
            this.f144123a.a(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.view.b.c.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f144124a;

                static {
                    Covode.recordClassIndex(94314);
                }

                {
                    this.f144124a = r1;
                }

                public final void run() {
                    this.f144124a.f144123a.l().d(ProfileNaviSpinnerViewModel.a.f144404a);
                    ((NaviGLSurfaceView) this.f144124a.f144123a.a(R.id.ct2)).queueEvent(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.view.b.c.e.AnonymousClass1.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f144125a;

                        static {
                            Covode.recordClassIndex(94315);
                        }

                        {
                            this.f144125a = r1;
                        }

                        /* renamed from: com.ss.android.ugc.aweme.view.b.c$e$1$1$a */
                        static final class a extends m implements h.f.a.a<h.z> {
                            final /* synthetic */ File $this_run;
                            final /* synthetic */ AnonymousClass1 this$0;

                            static {
                                Covode.recordClassIndex(94316);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            a(File file, AnonymousClass1 r3) {
                                super(0);
                                this.$this_run = file;
                                this.this$0 = r3;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.a
                            public final /* synthetic */ h.z invoke() {
                                ProfileNaviCreatorViewModel k2 = this.this$0.f144125a.f144124a.f144123a.k();
                                File file = this.$this_run;
                                l.d(file, "");
                                r.f110812b = new com.ss.android.ugc.aweme.model.c(file);
                                q qVar = r.f110811a;
                                if (qVar != null) {
                                    ProfileNaviCreatorViewModel.a.a(file, new ProfileNaviCreatorViewModel.q(qVar));
                                    k2.j();
                                }
                                this.this$0.f144125a.f144124a.f144123a.k().g();
                                return h.z.f158842a;
                            }
                        }

                        public final void run() {
                            MethodCollector.i(6932);
                            try {
                                com.ss.android.ugc.aweme.view.customView.a naviManager = ((NaviGLSurfaceView) this.f144125a.f144124a.f144123a.a(R.id.ct2)).getNaviManager();
                                if (naviManager != null) {
                                    int[] iArr = naviManager.O;
                                    if (iArr == null) {
                                        l.b();
                                    }
                                    GLES20.glBindFramebuffer(36160, iArr[0]);
                                    Bitmap a2 = com.ss.android.ugc.aweme.view.customView.a.a(naviManager.f144176e, naviManager.f144177f, false);
                                    l.d(a2, "");
                                    int min = Math.min(a2.getWidth(), a2.getHeight());
                                    Bitmap createBitmap = Bitmap.createBitmap(a2, (a2.getWidth() - min) / 2, (a2.getHeight() - min) / 2, min, min);
                                    l.b(createBitmap, "");
                                    if (createBitmap != null) {
                                        File a3 = com.ss.android.ugc.aweme.common.u.a(this.f144125a.f144124a.f144123a.getContext(), createBitmap);
                                        if (a3 != null) {
                                            hx.a(0, new a(a3, this));
                                            MethodCollector.o(6932);
                                            return;
                                        }
                                        MethodCollector.o(6932);
                                        return;
                                    }
                                }
                                MethodCollector.o(6932);
                            } catch (Exception e2) {
                                if (e2.getMessage() != null) {
                                    this.f144125a.f144124a.f144123a.getTag();
                                }
                                MethodCollector.o(6932);
                            }
                        }
                    });
                }
            }, 1000);
        }
    }

    static final class f extends m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends u>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(94317);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, List<? extends u> list) {
            List<? extends u> list2 = list;
            l.d(iVar, "");
            if (list2 != null) {
                c cVar = this.this$0;
                ViewPager viewPager = (ViewPager) cVar.a(R.id.ct7);
                l.b(viewPager, "");
                Context requireContext = cVar.requireContext();
                l.b(requireContext, "");
                viewPager.setAdapter(new com.ss.android.ugc.aweme.view.a.d(requireContext, cVar.f144114b, list2));
            }
            return h.z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.m<com.bytedance.jedi.arch.i, x, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(94318);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, x xVar) {
            x xVar2 = xVar;
            l.d(iVar, "");
            if (xVar2 != null) {
                c cVar = this.this$0;
                com.ss.android.ugc.aweme.model.d dVar = xVar2.f76613b;
                NaviNonSwipingViewPager naviNonSwipingViewPager = (NaviNonSwipingViewPager) cVar.a(R.id.ct7);
                if (naviNonSwipingViewPager != null) {
                    naviNonSwipingViewPager.setVisibility(8);
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) cVar.a(R.id.ct3);
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                }
                ViewPager viewPager = (ViewPager) cVar.a(R.id.ct4);
                if (viewPager != null) {
                    Context requireContext = cVar.requireContext();
                    l.b(requireContext, "");
                    viewPager.setAdapter(new com.ss.android.ugc.aweme.view.a.e(requireContext, cVar.f144114b, dVar));
                }
            }
            return h.z.f158842a;
        }
    }
}
