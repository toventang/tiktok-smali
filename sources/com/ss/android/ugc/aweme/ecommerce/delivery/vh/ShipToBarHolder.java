package com.ss.android.ugc.aweme.ecommerce.delivery.vh;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.pdp.b.k;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.z;
import h.h;
import h.z;
import java.util.List;

public final class ShipToBarHolder extends JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.delivery.b.a> implements au {

    /* renamed from: g  reason: collision with root package name */
    public static final b f85928g = new b((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public final boolean f85929f;

    /* renamed from: j  reason: collision with root package name */
    private final h f85930j;

    static {
        Covode.recordClassIndex(53792);
    }

    public final DeliveryPanelViewModel m() {
        return (DeliveryPanelViewModel) this.f85930j.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(53794);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
        View view = this.itemView;
        l.b(view, "");
        a.C2089a.a(view, true);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<DeliveryPanelViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(53793);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jediViewHolder;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.vh.ShipToBarHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_delivery_vh_ShipToBarHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public /* synthetic */ ShipToBarHolder(ViewGroup viewGroup) {
        this(viewGroup, true);
    }

    public static final class c extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85931a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShipToBarHolder f85932b;

        static {
            Covode.recordClassIndex(53795);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ShipToBarHolder shipToBarHolder) {
            super(700);
            this.f85932b = shipToBarHolder;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                ShipToBarHolder shipToBarHolder = this.f85932b;
                shipToBarHolder.withState(shipToBarHolder.m(), new a(this));
            }
        }

        static final class a extends h.f.b.m implements h.f.a.b<DeliveryPanelState, z> {
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(53796);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(1);
                this.this$0 = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(DeliveryPanelState deliveryPanelState) {
                DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
                l.d(deliveryPanelState2, "");
                com.ss.android.ugc.aweme.ecommerce.delivery.vm.a aVar = com.ss.android.ugc.aweme.ecommerce.delivery.vm.a.PUSH_AREA_PAGE;
                for (T t : deliveryPanelState2.getAddressRenderData()) {
                    if ((t instanceof com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d) && t != null) {
                        aVar = com.ss.android.ugc.aweme.ecommerce.delivery.vm.a.PUSH_ADDRESS_PAGE;
                    }
                }
                this.this$0.f85932b.m().a(aVar);
                if (this.this$0.f85932b.m().f85934a instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) {
                    View view = this.this$0.f85932b.itemView;
                    l.b(view, "");
                    k a2 = k.a.a(view.getContext());
                    if (a2 != null) {
                        a2.b("ship_to", (Boolean) null);
                    }
                }
                com.ss.android.ugc.aweme.ecommerce.delivery.a.a("ship_to", "confirm", null, null, null);
                return z.f158842a;
            }
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<List<? extends Region>, z> {
        final /* synthetic */ z.e $shipToBarText;

        static {
            Covode.recordClassIndex(53798);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(z.e eVar) {
            super(1);
            this.$shipToBarText = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(List<? extends Region> list) {
            List<? extends Region> list2 = list;
            l.d(list2, "");
            this.$shipToBarText.element = (T) n.a(n.h((Iterable) list2), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, AnonymousClass1.f85933a, 30);
            return h.z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d, h.z> {
        final /* synthetic */ z.e $shipToBarText;
        final /* synthetic */ ShipToBarHolder this$0;

        static {
            Covode.recordClassIndex(53797);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ShipToBarHolder shipToBarHolder, z.e eVar) {
            super(1);
            this.this$0 = shipToBarHolder;
            this.$shipToBarText = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d dVar) {
            T t;
            com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d dVar2 = dVar;
            l.d(dVar2, "");
            z.e eVar = this.$shipToBarText;
            if (dVar2.f85924a) {
                t = (T) Address.a(dVar2.f85925b);
            } else {
                if (this.this$0.f85929f) {
                    View view = this.this$0.itemView;
                    l.b(view, "");
                    t = (T) view.getContext().getString(R.string.bg8);
                } else {
                    t = "";
                }
                l.b(t, "");
            }
            eVar.element = t;
            return h.z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.delivery.b.a aVar) {
        int i2;
        com.ss.android.ugc.aweme.ecommerce.delivery.b.a aVar2 = aVar;
        l.d(aVar2, "");
        z.e eVar = new z.e();
        View view = this.itemView;
        l.b(view, "");
        T t = (T) view.getContext().getString(R.string.bg8);
        l.b(t, "");
        eVar.element = t;
        aVar2.a(new d(this, eVar));
        e eVar2 = new e(eVar);
        l.d(eVar2, "");
        List<Region> b2 = aVar2.b();
        if (b2 != null) {
            eVar2.invoke(b2);
        }
        View view2 = this.itemView;
        l.b(view2, "");
        TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.lj);
        l.b(tuxTextView, "");
        tuxTextView.setText(eVar.element);
        View view3 = this.itemView;
        l.b(view3, "");
        view3.setOnClickListener(new c(this));
        View view4 = this.itemView;
        l.b(view4, "");
        view4.setClickable(this.f85929f);
        boolean z = this.f85929f;
        View view5 = this.itemView;
        l.b(view5, "");
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) view5.findViewById(R.id.b8z);
        l.b(autoRTLImageView, "");
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        autoRTLImageView.setVisibility(i2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShipToBarHolder(android.view.ViewGroup r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            h.f.b.l.d(r5, r3)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131558961(0x7f0d0231, float:1.8743253E38)
            r0 = 0
            android.view.View r0 = com.a.a(r2, r1, r5, r0)
            h.f.b.l.b(r0, r3)
            r4.<init>(r0)
            r4.f85929f = r6
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel.class
            h.k.c r1 = h.f.b.ab.a(r0)
            com.ss.android.ugc.aweme.ecommerce.delivery.vh.ShipToBarHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.delivery.vh.ShipToBarHolder$a
            r0.<init>(r4, r1, r1)
            h.h r0 = h.i.a(r0)
            r4.f85930j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.vh.ShipToBarHolder.<init>(android.view.ViewGroup, boolean):void");
    }
}
