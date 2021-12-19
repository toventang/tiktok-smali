package com.ss.android.ugc.aweme.dsp.playpage.queue;

import android.view.View;
import androidx.lifecycle.ag;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.m;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.ugc.aweme.dsp.playpage.playview.queue.MDQueueCurrentMusicCell;
import com.ss.android.ugc.aweme.dsp.playpage.playview.queue.MDQueueCurrentTitleCell;
import com.ss.android.ugc.aweme.dsp.playpage.playview.queue.MDQueueMoreTitleCell;
import com.ss.android.ugc.aweme.dsp.playpage.playview.queue.MDQueueNextMusicCell;
import com.ss.android.ugc.aweme.dsp.playpage.playview.queue.MDQueueNextTitleCell;
import h.f.b.ab;
import h.f.b.l;
import h.h;
import h.i;
import java.util.Objects;

public final class a extends m<MDQueueViewModel> {

    /* renamed from: j  reason: collision with root package name */
    private final h f83910j = i.a((h.f.a.a) new c(this));

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f83911k;

    public static final class b extends h.f.b.m implements h.f.a.b<e, e> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(52326);
        }

        public b() {
            super(1);
        }

        public final e invoke(e eVar) {
            l.c(eVar, "");
            return eVar;
        }
    }

    static {
        Covode.recordClassIndex(52324);
    }

    @Override // com.bytedance.ext_power_list.m
    public final PowerList v() {
        return (PowerList) this.f83910j.getValue();
    }

    static final class c extends h.f.b.m implements h.f.a.a<PowerList> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(52327);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PowerList invoke() {
            View s = this.this$0.s();
            Objects.requireNonNull(s, "null cannot be cast to non-null type com.bytedance.ies.powerlist.PowerList");
            return s;
        }
    }

    /* Return type fixed from 'com.bytedance.ext_power_list.AssemListViewModel' to match base method */
    @Override // com.bytedance.ext_power_list.m
    public final /* synthetic */ MDQueueViewModel u() {
        return (MDQueueViewModel) this.f83911k.getValue();
    }

    @Override // com.bytedance.ext_power_list.m
    public final com.bytedance.ies.powerlist.page.config.c w() {
        com.bytedance.ies.powerlist.page.config.c cVar = new com.bytedance.ies.powerlist.page.config.c();
        cVar.f34357b = true;
        cVar.f34356a = 2;
        return cVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playpage.queue.a$a  reason: collision with other inner class name */
    public static final class C2000a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(52325);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2000a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public a() {
        h.k.c a2 = ab.a(MDQueueViewModel.class);
        this.f83911k = new com.bytedance.assem.arch.viewModel.b(a2, new C2000a(a2), u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.a(this), b.INSTANCE, u.b(this), u.c(this));
    }

    @Override // com.bytedance.ext_power_list.m, com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        PowerList v = v();
        v.a(MDQueueCurrentTitleCell.class, MDQueueCurrentMusicCell.class, MDQueueNextTitleCell.class, MDQueueNextMusicCell.class, MDQueueMoreTitleCell.class);
        v.a(new d());
        v.setItemAnimator(null);
        super.b(view);
    }
}
