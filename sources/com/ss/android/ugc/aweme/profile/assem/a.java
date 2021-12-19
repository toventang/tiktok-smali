package com.ss.android.ugc.aweme.profile.assem;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ag;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.m;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.profile.assem.VM.MyVideoListVM;
import com.ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.h;
import h.i;
import h.z;

public final class a extends m<MyVideoListVM> {

    /* renamed from: j  reason: collision with root package name */
    public static final d f116025j = new d((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    private Fragment f116026k;

    /* renamed from: l  reason: collision with root package name */
    private final h f116027l = i.a((h.f.a.a) new e(this));

    /* renamed from: m  reason: collision with root package name */
    private final h f116028m = i.a((h.f.a.a) new g(this));
    private final com.bytedance.assem.arch.viewModel.b n;
    private final com.bytedance.assem.arch.extensions.i o;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.profile.assem.VM.a, com.ss.android.ugc.aweme.profile.assem.VM.a> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(74828);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.profile.assem.VM.a invoke(com.ss.android.ugc.aweme.profile.assem.VM.a aVar) {
            l.c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(74826);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public MyVideoListVM u() {
        return (MyVideoListVM) this.n.getValue();
    }

    private final com.ss.android.ugc.aweme.profile.ui.widget.c z() {
        return (com.ss.android.ugc.aweme.profile.ui.widget.c) this.o.getValue();
    }

    @Override // com.bytedance.ext_power_list.m
    public final PowerList v() {
        return (PowerList) this.f116027l.getValue();
    }

    public final TuxStatusView x() {
        return (TuxStatusView) this.f116028m.getValue();
    }

    public static final class d {
        static {
            Covode.recordClassIndex(74830);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<PowerList> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(74831);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PowerList invoke() {
            return this.this$0.s().findViewById(R.id.d7z);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<TuxStatusView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(74833);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxStatusView invoke() {
            return this.this$0.s().findViewById(R.id.e_o);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$a  reason: collision with other inner class name */
    public static final class C2962a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(74827);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2962a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.profile.ui.widget.c> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(74829);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.ui.widget.c, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.ui.widget.c invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.profile.ui.widget.c> r1 = com.ss.android.ugc.aweme.profile.ui.widget.c.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.assem.a.c.invoke():java.lang.Object");
        }
    }

    @Override // com.bytedance.ext_power_list.m
    public final com.bytedance.ies.powerlist.page.config.c w() {
        com.bytedance.ies.powerlist.page.config.c cVar = new com.bytedance.ies.powerlist.page.config.c();
        cVar.f34356a = 5;
        cVar.f34357b = true;
        return cVar.a(LoadingFooterCell.class);
    }

    public a() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(MyVideoListVM.class);
        C2962a aVar = new C2962a(a2);
        b bVar2 = b.INSTANCE;
        if (l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.n = bVar;
        this.o = new com.bytedance.assem.arch.extensions.i(bQ_(), new c(this, null));
    }

    @Override // com.bytedance.ext_power_list.m, com.bytedance.assem.arch.core.p
    public final void b(View view) {
        Fragment fragment;
        String str;
        l.d(view, "");
        super.b(view);
        com.ss.android.ugc.aweme.profile.ui.widget.c z = z();
        String str2 = null;
        if (z != null) {
            fragment = z.f117396c;
        } else {
            fragment = null;
        }
        this.f116026k = fragment;
        u().n = this.f116026k;
        PowerList v = v();
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        v.a(new com.ss.android.ugc.aweme.profile.ui.a(h.g.a.a(TypedValue.applyDimension(1, 1.0f, system.getDisplayMetrics()))));
        v().a(MyVideoCell.class);
        Fragment fragment2 = this.f116026k;
        if (fragment2 != null) {
            fragment2.getActivity();
        }
        v().setLayoutManager(new WrapGridLayoutManager(3, 1));
        x().a();
        MyVideoListVM y = u();
        com.ss.android.ugc.aweme.profile.ui.widget.c z2 = z();
        if (z2 != null) {
            str = z2.f117394a;
        } else {
            str = null;
        }
        y.f116018k = str;
        MyVideoListVM y2 = u();
        com.ss.android.ugc.aweme.profile.ui.widget.c z3 = z();
        if (z3 != null) {
            str2 = z3.f117395b;
        }
        y2.f116019l = str2;
        f.a.a(this, u(), b.f116031a, (k) null, new f(this), 6);
    }

    static final class f extends h.f.b.m implements h.f.a.m<p, Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(74832);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l.d(pVar, "");
            if (booleanValue) {
                this.this$0.x().setVisibility(8);
                this.this$0.v().setVisibility(0);
            }
            return z.f158842a;
        }
    }
}
