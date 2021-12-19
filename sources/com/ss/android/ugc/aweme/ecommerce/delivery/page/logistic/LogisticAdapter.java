package com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic;

import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.g;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.delivery.vh.ShipFromBarHolder;
import com.ss.android.ugc.aweme.ecommerce.delivery.vh.ShipToBarHolder;
import com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.z;

public final class LogisticAdapter extends com.ss.android.ugc.aweme.base.arch.c<Object> {

    /* renamed from: d  reason: collision with root package name */
    public final m f85854d;

    static {
        Covode.recordClassIndex(53741);
    }

    public final class LogisticViewHolder extends JediSimpleViewHolder<LogisticDTO> implements au {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ LogisticAdapter f85855f;

        /* renamed from: g  reason: collision with root package name */
        private final h f85856g;

        static {
            Covode.recordClassIndex(53742);
        }

        public final DeliveryPanelViewModel m() {
            return (DeliveryPanelViewModel) this.f85856g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
        public final void onStateChanged(m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void e() {
            super.e();
        }

        public static final class a extends h.f.b.m implements h.f.a.a<DeliveryPanelViewModel> {
            final /* synthetic */ JediViewHolder $this_hostViewModel;
            final /* synthetic */ h.k.c $viewModelClass;
            final /* synthetic */ h.k.c $viewModelClass$inlined;

            static {
                Covode.recordClassIndex(53743);
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
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter.LogisticViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            public static ac com_ss_android_ugc_aweme_ecommerce_delivery_page_logistic_LogisticAdapter$LogisticViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.a(str, cls);
                }
                ac a2 = adVar.a(str, cls);
                ab.a(a2, adVar);
                return a2;
            }
        }

        public static final class b extends bp {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ long f85857a = 700;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ LogisticViewHolder f85858b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ LogisticDTO f85859c;

            static {
                Covode.recordClassIndex(53744);
            }

            @Override // com.ss.android.ugc.aweme.utils.bp
            public final void a(View view) {
                if (view != null) {
                    this.f85858b.m().c(new DeliveryPanelViewModel.i(this.f85859c));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(LogisticViewHolder logisticViewHolder, LogisticDTO logisticDTO) {
                super(700);
                this.f85858b = logisticViewHolder;
                this.f85859c = logisticDTO;
            }
        }

        static final class d extends h.f.b.m implements h.f.a.b<DeliveryPanelState, z> {
            final /* synthetic */ LogisticDTO $item$inlined;
            final /* synthetic */ View $this_with;
            final /* synthetic */ LogisticViewHolder this$0;

            static {
                Covode.recordClassIndex(53746);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(View view, LogisticViewHolder logisticViewHolder, LogisticDTO logisticDTO) {
                super(1);
                this.$this_with = view;
                this.this$0 = logisticViewHolder;
                this.$item$inlined = logisticDTO;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x00c7  */
            /* JADX WARNING: Removed duplicated region for block: B:29:0x00d1  */
            /* JADX WARNING: Removed duplicated region for block: B:33:0x00e4  */
            @Override // h.f.a.b
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelState r9) {
                /*
                // Method dump skipped, instructions count: 237
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter.LogisticViewHolder.d.invoke(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final /* synthetic */ void a(LogisticDTO logisticDTO) {
            boolean z;
            String str;
            int i2;
            String str2;
            String str3;
            String str4;
            LogisticDTO logisticDTO2 = logisticDTO;
            l.d(logisticDTO2, "");
            View view = this.itemView;
            l.b(view, "");
            if (this.f39676i != this.f85855f.getItemCount() - 1) {
                z = true;
            } else {
                z = false;
            }
            a.C2089a.a(view, z);
            View view2 = this.itemView;
            TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.ahm);
            l.b(tuxTextView, "");
            Price price = logisticDTO2.f85894f;
            if (price == null || (str = price.getPriceStr()) == null) {
                str = "";
            }
            tuxTextView.setText(str);
            if (l.a((Object) logisticDTO2.f85896h, (Object) true)) {
                i2 = R.color.bh;
            } else {
                i2 = R.color.bx;
            }
            View view3 = this.itemView;
            l.b(view3, "");
            ((TuxTextView) view2.findViewById(R.id.ahm)).setTextColor(androidx.core.content.b.c(view3.getContext(), i2));
            TuxTextView tuxTextView2 = (TuxTextView) view2.findViewById(R.id.d0e);
            l.b(tuxTextView2, "");
            TextPaint paint = tuxTextView2.getPaint();
            l.b(paint, "");
            TuxTextView tuxTextView3 = (TuxTextView) view2.findViewById(R.id.d0e);
            l.b(tuxTextView3, "");
            TextPaint paint2 = tuxTextView3.getPaint();
            l.b(paint2, "");
            paint.setFlags(paint2.getFlags() | 16);
            TuxTextView tuxTextView4 = (TuxTextView) view2.findViewById(R.id.d0e);
            l.b(tuxTextView4, "");
            String str5 = logisticDTO2.f85895g;
            if (str5 == null) {
                str5 = "";
            }
            tuxTextView4.setText(str5);
            TuxTextView tuxTextView5 = (TuxTextView) view2.findViewById(R.id.c9g);
            l.b(tuxTextView5, "");
            LogisticTextDTO logisticTextDTO = logisticDTO2.f85898j;
            String str6 = null;
            if (logisticTextDTO != null) {
                str2 = logisticTextDTO.f85902c;
            } else {
                str2 = null;
            }
            a(tuxTextView5, str2);
            TuxTextView tuxTextView6 = (TuxTextView) view2.findViewById(R.id.amm);
            l.b(tuxTextView6, "");
            LogisticTextDTO logisticTextDTO2 = logisticDTO2.f85898j;
            if (logisticTextDTO2 != null) {
                str3 = logisticTextDTO2.f85900a;
            } else {
                str3 = null;
            }
            a(tuxTextView6, str3);
            TuxTextView tuxTextView7 = (TuxTextView) view2.findViewById(R.id.ekq);
            l.b(tuxTextView7, "");
            LogisticTextDTO logisticTextDTO3 = logisticDTO2.f85898j;
            if (logisticTextDTO3 != null) {
                str4 = logisticTextDTO3.f85904e;
            } else {
                str4 = null;
            }
            a(tuxTextView7, str4);
            TuxTextView tuxTextView8 = (TuxTextView) view2.findViewById(R.id.ak5);
            l.b(tuxTextView8, "");
            a(tuxTextView8, logisticDTO2.f85890b);
            TuxTextView tuxTextView9 = (TuxTextView) view2.findViewById(R.id.dzf);
            l.b(tuxTextView9, "");
            LogisticTextDTO logisticTextDTO4 = logisticDTO2.f85898j;
            if (logisticTextDTO4 != null) {
                str6 = logisticTextDTO4.f85901b;
            }
            a(tuxTextView9, str6);
            view2.setOnClickListener(new b(this, logisticDTO2));
            f.a.b.b unused = selectSubscribe(m(), a.f85862a, new ah(), new c(view2, this, logisticDTO2));
            withState(m(), new d(view2, this, logisticDTO2));
        }

        private static void a(TextView textView, String str) {
            int i2 = 0;
            if (str == null || str.length() == 0) {
                i2 = 8;
            }
            textView.setVisibility(i2);
            textView.setText(str);
        }

        static final class c extends h.f.b.m implements h.f.a.m<JediSimpleViewHolder<LogisticDTO>, LogisticDTO, z> {
            final /* synthetic */ LogisticDTO $item$inlined;
            final /* synthetic */ View $this_with;
            final /* synthetic */ LogisticViewHolder this$0;

            static {
                Covode.recordClassIndex(53745);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(View view, LogisticViewHolder logisticViewHolder, LogisticDTO logisticDTO) {
                super(2);
                this.$this_with = view;
                this.this$0 = logisticViewHolder;
                this.$item$inlined = logisticDTO;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(JediSimpleViewHolder<LogisticDTO> jediSimpleViewHolder, LogisticDTO logisticDTO) {
                String str;
                LogisticDTO logisticDTO2 = logisticDTO;
                l.d(jediSimpleViewHolder, "");
                RadioButton radioButton = (RadioButton) this.$this_with.findViewById(R.id.dgn);
                l.b(radioButton, "");
                if (logisticDTO2 != null) {
                    str = logisticDTO2.f85899k;
                } else {
                    str = null;
                }
                radioButton.setChecked(l.a((Object) str, (Object) this.$item$inlined.f85899k));
                return z.f158842a;
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public LogisticViewHolder(com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                h.f.b.l.d(r6, r3)
                r4.f85855f = r5
                android.content.Context r0 = r6.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
                r1 = 2131558962(0x7f0d0232, float:1.8743255E38)
                r0 = 0
                android.view.View r0 = com.a.a(r2, r1, r6, r0)
                h.f.b.l.b(r0, r3)
                r4.<init>(r0)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel.class
                h.k.c r1 = h.f.b.ab.a(r0)
                com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter$LogisticViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter$LogisticViewHolder$a
                r0.<init>(r4, r1, r1)
                h.h r0 = h.i.a(r0)
                r4.f85856g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter.LogisticViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter, android.view.ViewGroup):void");
        }
    }

    @Override // com.ss.android.ugc.aweme.base.arch.h, com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        return ((com.ss.android.ugc.aweme.base.arch.d) this).f67986a.b(i2);
    }

    static final class b extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f85860a = new b();

        static {
            Covode.recordClassIndex(53748);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return new ShipToBarHolder(viewGroup2);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f85861a = new d();

        static {
            Covode.recordClassIndex(53750);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return new ShipFromBarHolder(viewGroup2);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends g, ?>> {
        final /* synthetic */ LogisticAdapter this$0;

        static {
            Covode.recordClassIndex(53752);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(LogisticAdapter logisticAdapter) {
            super(1);
            this.this$0 = logisticAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return new LogisticViewHolder(this.this$0, viewGroup2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LogisticAdapter(m mVar) {
        super(mVar, (j.e) null, 6);
        l.d(mVar, "");
        this.f85854d = mVar;
    }

    static final class a extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ LogisticAdapter this$0;

        static {
            Covode.recordClassIndex(53747);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(LogisticAdapter logisticAdapter) {
            super(1);
            this.this$0 = logisticAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.delivery.b.a);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ LogisticAdapter this$0;

        static {
            Covode.recordClassIndex(53749);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(LogisticAdapter logisticAdapter) {
            super(1);
            this.this$0 = logisticAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.c);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ LogisticAdapter this$0;

        static {
            Covode.recordClassIndex(53751);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(LogisticAdapter logisticAdapter) {
            super(1);
            this.this$0 = logisticAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof LogisticDTO);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.arch.h
    public final void a(com.bytedance.jedi.ext.adapter.b.g<JediViewHolder<? extends g, ?>> gVar) {
        l.d(gVar, "");
        com.bytedance.jedi.ext.adapter.b.g unused = gVar.a(new a(this), null, b.f85860a);
        com.bytedance.jedi.ext.adapter.b.g unused2 = gVar.a(new c(this), null, d.f85861a);
        com.bytedance.jedi.ext.adapter.b.g unused3 = gVar.a(new e(this), null, new f(this));
    }
}
