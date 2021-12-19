package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import h.f.b.l;
import h.h;
import h.k.c;
import h.z;

public final class OrderSubmitSpanVH extends AbsFullSpanVH<d> implements au {

    /* renamed from: f  reason: collision with root package name */
    private final h f85093f;

    static {
        Covode.recordClassIndex(53183);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
        f.a.b.b unused = selectSubscribe((OrderSubmitViewModel) this.f85093f.getValue(), c.f85154a, new ah(), b.f85094a);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<OrderSubmitViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ c $viewModelClass;
        final /* synthetic */ c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(53184);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, c cVar, c cVar2) {
            super(0);
            this.$this_hostViewModel = jediViewHolder;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.OrderSubmitSpanVH.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_viewholder_OrderSubmitSpanVH$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderSubmitSpanVH(ViewGroup viewGroup) {
        super(new View(viewGroup.getContext()));
        l.d(viewGroup, "");
        MethodCollector.i(6992);
        c a2 = h.f.b.ab.a(OrderSubmitViewModel.class);
        this.f85093f = h.i.a((h.f.a.a) new a(this, a2, a2));
        MethodCollector.o(6992);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(Object obj) {
        d dVar = (d) obj;
        l.d(dVar, "");
        View view = this.itemView;
        l.b(view, "");
        RecyclerView.j jVar = new RecyclerView.j(-1, (int) n.b(view.getContext(), dVar.f85155a));
        jVar.leftMargin = dVar.f85157c;
        jVar.rightMargin = dVar.f85157c;
        View view2 = this.itemView;
        l.b(view2, "");
        view2.setLayoutParams(jVar);
        this.itemView.setPadding(dVar.f85157c, 0, dVar.f85157c, 0);
        this.itemView.setBackgroundColor(dVar.f85158d);
        View view3 = this.itemView;
        l.b(view3, "");
        a.C2089a.a(view3, dVar.f85156b);
    }

    static final class b extends h.f.b.m implements h.f.a.m<JediSimpleViewHolder<d>, Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f85094a = new b();

        static {
            Covode.recordClassIndex(53185);
        }

        b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(JediSimpleViewHolder<d> jediSimpleViewHolder, Boolean bool) {
            int i2;
            JediSimpleViewHolder<d> jediSimpleViewHolder2 = jediSimpleViewHolder;
            boolean booleanValue = bool.booleanValue();
            l.d(jediSimpleViewHolder2, "");
            View view = jediSimpleViewHolder2.itemView;
            l.b(view, "");
            if (booleanValue) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
            return z.f158842a;
        }
    }
}
