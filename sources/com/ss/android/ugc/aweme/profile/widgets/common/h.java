package com.ss.android.ugc.aweme.profile.widgets.common;

import android.view.View;
import androidx.lifecycle.ag;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.service.d;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.refresh.TuxRefreshLayout;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.bytedance.tux.widget.spring.e;
import com.bytedance.tux.widget.spring.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.ss.android.ugc.aweme.story.avatar.ProfileStoryRingViewModel;
import com.ss.android.ugc.aweme.story.avatar.p;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;

public abstract class h extends com.bytedance.assem.arch.d.a implements j {

    /* renamed from: j  reason: collision with root package name */
    public SpringLayout f117703j;

    /* renamed from: k  reason: collision with root package name */
    final com.bytedance.assem.arch.viewModel.b f117704k;

    public static final class b extends m implements h.f.a.b<p, p> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(76186);
        }

        public b() {
            super(1);
        }

        public final p invoke(p pVar) {
            l.c(pVar, "");
            return pVar;
        }
    }

    static {
        Covode.recordClassIndex(76184);
    }

    public abstract String v();

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(76185);
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

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(76187);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            j.a.a(this.this$0, g.NORMAL, 1);
            com.ss.android.ugc.aweme.profile.widgets.b.c cVar = (com.ss.android.ugc.aweme.profile.widgets.b.c) d.e(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.widgets.b.c.class));
            if (cVar != null) {
                cVar.N();
            }
            r.a("refresh_page", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.this$0.v()).f66730a);
            ((ProfileStoryRingViewModel) this.this$0.f117704k.getValue()).a("pull");
            return z.f158842a;
        }
    }

    public h() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(ProfileStoryRingViewModel.class);
        a aVar = new a(a2);
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
        this.f117704k = bVar;
    }

    @Override // com.bytedance.assem.arch.core.p
    public void b(View view) {
        l.d(view, "");
        this.f117703j = (TuxRefreshLayout) view.findViewById(R.id.dk8);
        if (com.ss.android.ugc.aweme.tux.a.b.a.a()) {
            SpringLayout springLayout = this.f117703j;
            if (springLayout != null) {
                springLayout.setOnRefreshListener(new c(this));
                return;
            }
            return;
        }
        SpringLayout springLayout2 = this.f117703j;
        if (springLayout2 != null) {
            springLayout2.setNestedHeader(null);
        }
        SpringLayout springLayout3 = this.f117703j;
        if (springLayout3 != null) {
            springLayout3.setOverScrollMode(e.NONE);
        }
        SpringLayout springLayout4 = this.f117703j;
        if (springLayout4 != null) {
            springLayout4.setScrollMode(g.NONE);
        }
    }
}
