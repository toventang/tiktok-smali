package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.b;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class PaymentAdapter extends com.ss.android.ugc.aweme.base.arch.c<Object> {

    /* renamed from: d  reason: collision with root package name */
    public final androidx.lifecycle.m f85182d;

    static {
        Covode.recordClassIndex(53255);
    }

    public final class CardNumberElementViewHolder extends JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.c> implements au {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ PaymentAdapter f85188f;

        /* renamed from: g  reason: collision with root package name */
        private final h.h f85189g;

        static {
            Covode.recordClassIndex(53264);
        }

        public final PaymentViewModel m() {
            return (PaymentViewModel) this.f85189g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
        public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        static final class e extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.c $item$inlined;
            final /* synthetic */ CardNumberElementViewHolder this$0;

            static {
                Covode.recordClassIndex(53269);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(CardNumberElementViewHolder cardNumberElementViewHolder, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.c cVar) {
                super(0);
                this.this$0 = cardNumberElementViewHolder;
                this.$item$inlined = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* bridge */ /* synthetic */ z invoke() {
                this.$item$inlined.f85248a = null;
                return z.f158842a;
            }
        }

        public static final class a extends h.f.b.m implements h.f.a.a<PaymentViewModel> {
            final /* synthetic */ JediViewHolder $this_hostViewModel;
            final /* synthetic */ h.k.c $viewModelClass;
            final /* synthetic */ h.k.c $viewModelClass$inlined;

            static {
                Covode.recordClassIndex(53265);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
                super(0);
                this.$this_hostViewModel = jediViewHolder;
                this.$viewModelClass = cVar;
                this.$viewModelClass$inlined = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // h.f.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.CardNumberElementViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            public static ac com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentAdapter$CardNumberElementViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.a(str, cls);
                }
                ac a2 = adVar.a(str, cls);
                ab.a(a2, adVar);
                return a2;
            }
        }

        static final class c extends h.f.b.m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, z> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.c $item$inlined;
            final /* synthetic */ CardNumberElementViewHolder this$0;

            static {
                Covode.recordClassIndex(53267);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(CardNumberElementViewHolder cardNumberElementViewHolder, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.c cVar) {
                super(1);
                this.this$0 = cardNumberElementViewHolder;
                this.$item$inlined = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list) {
                List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list2 = list;
                String str = "";
                h.f.b.l.d(list2, str);
                PaymentViewModel m2 = this.this$0.m();
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar = this.$item$inlined.f85251c;
                String str2 = this.$item$inlined.f85250b.f85288a;
                if (str2 != null) {
                    str = str2;
                }
                m2.a(oVar, str, (List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>) list2);
                return z.f158842a;
            }
        }

        static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o, z> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.c $item$inlined;
            final /* synthetic */ CardNumberElementViewHolder this$0;

            static {
                Covode.recordClassIndex(53266);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(CardNumberElementViewHolder cardNumberElementViewHolder, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.c cVar) {
                super(1);
                this.this$0 = cardNumberElementViewHolder;
                this.$item$inlined = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar) {
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar2 = oVar;
                if (!(oVar2 == null || oVar2.a() == null)) {
                    PaymentViewModel m2 = this.this$0.m();
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar3 = this.$item$inlined.f85251c;
                    h.f.b.l.d(oVar3, "");
                    h.f.b.l.d(oVar2, "");
                    m2.a(oVar3, "card_type_element", h.a.n.b(new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m("card_id_element", "card_id_element", oVar2.f85334a, null, null, 24, null), new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m("card_token_element", "card_token_element", oVar2.p, null, null, 24, null)));
                    m2.c(new PaymentViewModel.b(oVar3, oVar2));
                }
                return z.f158842a;
            }
        }

        static final class d extends h.f.b.m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, String> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.c $item$inlined;
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c $this_apply;
            final /* synthetic */ CardNumberElementViewHolder this$0;

            static {
                Covode.recordClassIndex(53268);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c cVar, CardNumberElementViewHolder cardNumberElementViewHolder, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.c cVar2) {
                super(1);
                this.$this_apply = cVar;
                this.this$0 = cardNumberElementViewHolder;
                this.$item$inlined = cVar2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ String invoke(List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list) {
                t tVar;
                boolean z;
                List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list2 = list;
                h.f.b.l.d(list2, "");
                String a2 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.a.c.a(this.$item$inlined.f85250b, this.$item$inlined.f85251c, list2);
                String str = null;
                if (a2 != null) {
                    t.f85425h[0] = ",card_number";
                } else {
                    t.f85425h[0] = null;
                }
                if (!com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c.f85536d && (tVar = this.this$0.m().f85210d) != null) {
                    String c2 = this.$item$inlined.f85251c.c();
                    if (a2 == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String str2 = this.$item$inlined.f85250b.f85288a;
                    if (str2 != null) {
                        str = h.m.p.a(str2, "eg_ccdc_global_", "", false);
                    }
                    tVar.a(c2, z, str, this.$this_apply.getMInputType());
                }
                return a2;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.c cVar) {
            b.C2044b bVar;
            int i2;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.c cVar2 = cVar;
            String str = "";
            h.f.b.l.d(cVar2, str);
            if (this.f85188f.a(this.f39676i + 1) != null) {
                boolean z = this.f85188f.a(this.f39676i + 1) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.e;
                if (this.f85188f.a(this.f39676i + 1) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.a) {
                    i2 = com.ss.android.ugc.aweme.ecommerce.util.h.f87572f;
                } else {
                    i2 = com.ss.android.ugc.aweme.ecommerce.util.h.f87571e;
                }
                bVar = new b.C2044b(i2, 0, 0, 0, false, z, 30);
            } else {
                bVar = new b.C2044b(com.ss.android.ugc.aweme.ecommerce.util.h.f87571e, 0, 0, 0, false, true, 30);
            }
            View view = this.itemView;
            h.f.b.l.b(view, str);
            b.a.a(view, bVar);
            View view2 = this.itemView;
            Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.CardNumberElement");
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c cVar3 = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c) view2;
            cVar3.setOnPaymentMethodIdentify(new b(this, cVar2));
            cVar3.setOnValueChange(new c(this, cVar2));
            cVar3.setOnVerify(new d(cVar3, this, cVar2));
            cVar3.setOnErrorClear(new e(this, cVar2));
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar = cVar2.f85250b;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar = cVar2.f85251c;
            PaymentViewModel m2 = m();
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar2 = cVar2.f85251c;
            String str2 = cVar2.f85250b.f85288a;
            if (str2 != null) {
                str = str2;
            }
            cVar3.a(eVar, oVar, m2.b(oVar2, str), cVar2.f85248a);
            cVar3.setPaymentLogger(m().f85210d);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public CardNumberElementViewHolder(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r4, android.view.ViewGroup r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                h.f.b.l.d(r5, r0)
                r3.f85188f = r4
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c r2 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c
                android.content.Context r1 = r5.getContext()
                h.f.b.l.b(r1, r0)
                r0 = 0
                r2.<init>(r1, r0)
                r3.<init>(r2)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.class
                h.k.c r1 = h.f.b.ab.a(r0)
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$CardNumberElementViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$CardNumberElementViewHolder$a
                r0.<init>(r3, r1, r1)
                h.h r0 = h.i.a(r0)
                r3.f85189g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.CardNumberElementViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    public final class DateElementViewHolder extends JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.d> implements au {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ PaymentAdapter f85190f;

        /* renamed from: g  reason: collision with root package name */
        private final h.h f85191g;

        static {
            Covode.recordClassIndex(53270);
        }

        public final PaymentViewModel m() {
            return (PaymentViewModel) this.f85191g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
        public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        static final class d extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.d $item$inlined;
            final /* synthetic */ DateElementViewHolder this$0;

            static {
                Covode.recordClassIndex(53274);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(DateElementViewHolder dateElementViewHolder, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.d dVar) {
                super(0);
                this.this$0 = dateElementViewHolder;
                this.$item$inlined = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* bridge */ /* synthetic */ z invoke() {
                this.$item$inlined.f85249a = null;
                return z.f158842a;
            }
        }

        public static final class a extends h.f.b.m implements h.f.a.a<PaymentViewModel> {
            final /* synthetic */ JediViewHolder $this_hostViewModel;
            final /* synthetic */ h.k.c $viewModelClass;
            final /* synthetic */ h.k.c $viewModelClass$inlined;

            static {
                Covode.recordClassIndex(53271);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
                super(0);
                this.$this_hostViewModel = jediViewHolder;
                this.$viewModelClass = cVar;
                this.$viewModelClass$inlined = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // h.f.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.DateElementViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            public static ac com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentAdapter$DateElementViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.a(str, cls);
                }
                ac a2 = adVar.a(str, cls);
                ab.a(a2, adVar);
                return a2;
            }
        }

        static final class b extends h.f.b.m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, z> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.d $item$inlined;
            final /* synthetic */ DateElementViewHolder this$0;

            static {
                Covode.recordClassIndex(53272);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(DateElementViewHolder dateElementViewHolder, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.d dVar) {
                super(1);
                this.this$0 = dateElementViewHolder;
                this.$item$inlined = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list) {
                List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list2 = list;
                String str = "";
                h.f.b.l.d(list2, str);
                PaymentViewModel m2 = this.this$0.m();
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar = this.$item$inlined.f85251c;
                String str2 = this.$item$inlined.f85250b.f85288a;
                if (str2 != null) {
                    str = str2;
                }
                m2.a(oVar, str, (List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>) list2);
                return z.f158842a;
            }
        }

        static final class c extends h.f.b.m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, String> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.d $item$inlined;
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.d $this_apply;
            final /* synthetic */ DateElementViewHolder this$0;

            static {
                Covode.recordClassIndex(53273);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.d dVar, DateElementViewHolder dateElementViewHolder, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.d dVar2) {
                super(1);
                this.$this_apply = dVar;
                this.this$0 = dateElementViewHolder;
                this.$item$inlined = dVar2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ String invoke(List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list) {
                List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list2 = list;
                h.f.b.l.d(list2, "");
                String a2 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.a.c.a(this.$item$inlined.f85250b, this.$item$inlined.f85251c, list2);
                boolean z = true;
                if (a2 != null) {
                    t.f85425h[1] = ",date";
                } else {
                    t.f85425h[1] = null;
                }
                t tVar = this.this$0.m().f85210d;
                if (tVar != null) {
                    String c2 = this.$item$inlined.f85251c.c();
                    if (a2 != null) {
                        z = false;
                    }
                    tVar.a(c2, z, t.d(this.$item$inlined.f85250b.f85293f), this.$this_apply.getMInputType());
                    tVar.a(t.d(this.$item$inlined.f85250b.f85293f), tVar.b(h.f.b.ab.a(DateElementViewHolder.class).b()), this.$this_apply.getMInputType());
                }
                return a2;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.d dVar) {
            b.C2044b bVar;
            int i2;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.d dVar2 = dVar;
            String str = "";
            h.f.b.l.d(dVar2, str);
            if (this.f85190f.a(this.f39676i + 1) != null) {
                boolean z = this.f85190f.a(this.f39676i + 1) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.e;
                if (this.f85190f.a(this.f39676i + 1) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.a) {
                    i2 = com.ss.android.ugc.aweme.ecommerce.util.h.f87572f;
                } else {
                    i2 = com.ss.android.ugc.aweme.ecommerce.util.h.f87571e;
                }
                bVar = new b.C2044b(i2, 0, 0, 0, false, z, 30);
            } else {
                bVar = new b.C2044b(com.ss.android.ugc.aweme.ecommerce.util.h.f87571e, 0, 0, 0, false, true, 30);
            }
            View view = this.itemView;
            h.f.b.l.b(view, str);
            b.a.a(view, bVar);
            View view2 = this.itemView;
            Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.DateElement");
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.d dVar3 = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.d) view2;
            dVar3.setOnValueChange(new b(this, dVar2));
            dVar3.setOnVerify(new c(dVar3, this, dVar2));
            dVar3.setOnErrorClear(new d(this, dVar2));
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar = dVar2.f85250b;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar = dVar2.f85251c;
            PaymentViewModel m2 = m();
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar2 = dVar2.f85251c;
            String str2 = dVar2.f85250b.f85288a;
            if (str2 != null) {
                str = str2;
            }
            dVar3.a(eVar, oVar, m2.b(oVar2, str), dVar2.f85249a);
            dVar3.setPaymentLogger(m().f85210d);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DateElementViewHolder(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r4, android.view.ViewGroup r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                h.f.b.l.d(r5, r0)
                r3.f85190f = r4
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.d r2 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.d
                android.content.Context r1 = r5.getContext()
                h.f.b.l.b(r1, r0)
                r0 = 0
                r2.<init>(r1, r0)
                r3.<init>(r2)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.class
                h.k.c r1 = h.f.b.ab.a(r0)
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$DateElementViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$DateElementViewHolder$a
                r0.<init>(r3, r1, r1)
                h.h r0 = h.i.a(r0)
                r3.f85191g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.DateElementViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    public final class NormalElementViewHolder extends JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.f> implements au {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ PaymentAdapter f85192f;

        /* renamed from: g  reason: collision with root package name */
        private final h.h f85193g;

        static {
            Covode.recordClassIndex(53275);
        }

        public final PaymentViewModel m() {
            return (PaymentViewModel) this.f85193g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
        public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        static final class d extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.f $item$inlined;
            final /* synthetic */ NormalElementViewHolder this$0;

            static {
                Covode.recordClassIndex(53279);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(NormalElementViewHolder normalElementViewHolder, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.f fVar) {
                super(0);
                this.this$0 = normalElementViewHolder;
                this.$item$inlined = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* bridge */ /* synthetic */ z invoke() {
                this.$item$inlined.f85252a = null;
                return z.f158842a;
            }
        }

        public static final class a extends h.f.b.m implements h.f.a.a<PaymentViewModel> {
            final /* synthetic */ JediViewHolder $this_hostViewModel;
            final /* synthetic */ h.k.c $viewModelClass;
            final /* synthetic */ h.k.c $viewModelClass$inlined;

            static {
                Covode.recordClassIndex(53276);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
                super(0);
                this.$this_hostViewModel = jediViewHolder;
                this.$viewModelClass = cVar;
                this.$viewModelClass$inlined = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // h.f.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.NormalElementViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            public static ac com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentAdapter$NormalElementViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.a(str, cls);
                }
                ac a2 = adVar.a(str, cls);
                ab.a(a2, adVar);
                return a2;
            }
        }

        static final class b extends h.f.b.m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, z> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.f $item$inlined;
            final /* synthetic */ NormalElementViewHolder this$0;

            static {
                Covode.recordClassIndex(53277);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(NormalElementViewHolder normalElementViewHolder, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.f fVar) {
                super(1);
                this.this$0 = normalElementViewHolder;
                this.$item$inlined = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list) {
                List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list2 = list;
                String str = "";
                h.f.b.l.d(list2, str);
                PaymentViewModel m2 = this.this$0.m();
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar = this.$item$inlined.f85251c;
                String str2 = this.$item$inlined.f85250b.f85288a;
                if (str2 != null) {
                    str = str2;
                }
                m2.a(oVar, str, (List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>) list2);
                return z.f158842a;
            }
        }

        static final class e extends h.f.b.m implements h.f.a.b<Boolean, z> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.f $item$inlined;
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.h $this_apply;
            final /* synthetic */ NormalElementViewHolder this$0;

            static {
                Covode.recordClassIndex(53280);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.h hVar, NormalElementViewHolder normalElementViewHolder, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.f fVar) {
                super(1);
                this.$this_apply = hVar;
                this.this$0 = normalElementViewHolder;
                this.$item$inlined = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Boolean bool) {
                boolean booleanValue = bool.booleanValue();
                NormalElementViewHolder normalElementViewHolder = this.this$0;
                Integer num = ((com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.e) normalElementViewHolder.aI_()).f85250b.f85290c;
                int ordinal = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.f.Email.ordinal();
                if (num != null && num.intValue() == ordinal) {
                    normalElementViewHolder.m().b(booleanValue);
                }
                t tVar = this.this$0.m().f85210d;
                if (tVar != null) {
                    String str = null;
                    if (booleanValue) {
                        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e elementDTO = this.$this_apply.getElementDTO();
                        if (elementDTO != null) {
                            str = elementDTO.f85293f;
                        }
                        tVar.c(t.d(str));
                        tVar.a(h.f.b.ab.a(NormalElementViewHolder.class).b());
                    } else {
                        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e elementDTO2 = this.$this_apply.getElementDTO();
                        if (elementDTO2 != null) {
                            str = elementDTO2.f85293f;
                        }
                        tVar.a(t.d(str), tVar.b(h.f.b.ab.a(NormalElementViewHolder.class).b()), this.$this_apply.getMInputMethod());
                    }
                }
                return z.f158842a;
            }
        }

        static final class c extends h.f.b.m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, String> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.f $item$inlined;
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.h $this_apply;
            final /* synthetic */ NormalElementViewHolder this$0;

            static {
                Covode.recordClassIndex(53278);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.h hVar, NormalElementViewHolder normalElementViewHolder, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.f fVar) {
                super(1);
                this.$this_apply = hVar;
                this.this$0 = normalElementViewHolder;
                this.$item$inlined = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
                if (r2 == null) goto L_0x0052;
             */
            @Override // h.f.a.b
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.String invoke(java.util.List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> r8) {
                /*
                // Method dump skipped, instructions count: 253
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.NormalElementViewHolder.c.invoke(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.f fVar) {
            b.C2044b bVar;
            int i2;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.f fVar2 = fVar;
            String str = "";
            h.f.b.l.d(fVar2, str);
            if (this.f85192f.a(this.f39676i + 1) != null) {
                boolean z = this.f85192f.a(this.f39676i + 1) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.e;
                if (this.f85192f.a(this.f39676i + 1) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.a) {
                    i2 = com.ss.android.ugc.aweme.ecommerce.util.h.f87572f;
                } else {
                    i2 = com.ss.android.ugc.aweme.ecommerce.util.h.f87571e;
                }
                bVar = new b.C2044b(i2, 0, 0, 0, false, z, 30);
            } else {
                bVar = new b.C2044b(com.ss.android.ugc.aweme.ecommerce.util.h.f87571e, 0, 0, 0, false, true, 30);
            }
            View view = this.itemView;
            h.f.b.l.b(view, str);
            b.a.a(view, bVar);
            View view2 = this.itemView;
            Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.NormalElement");
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.h hVar = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.h) view2;
            hVar.setOnValueChange(new b(this, fVar2));
            hVar.setOnVerify(new c(hVar, this, fVar2));
            hVar.setOnErrorClear(new d(this, fVar2));
            hVar.setOnFocusChange(new e(hVar, this, fVar2));
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar = fVar2.f85250b;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar = fVar2.f85251c;
            PaymentViewModel m2 = m();
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar2 = fVar2.f85251c;
            String str2 = fVar2.f85250b.f85288a;
            if (str2 != null) {
                str = str2;
            }
            hVar.a(eVar, oVar, m2.b(oVar2, str), fVar2.f85252a);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public NormalElementViewHolder(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r4, android.view.ViewGroup r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                h.f.b.l.d(r5, r0)
                r3.f85192f = r4
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.h r2 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.h
                android.content.Context r1 = r5.getContext()
                h.f.b.l.b(r1, r0)
                r0 = 0
                r2.<init>(r1, r0)
                r3.<init>(r2)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.class
                h.k.c r1 = h.f.b.ab.a(r0)
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$NormalElementViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$NormalElementViewHolder$a
                r0.<init>(r3, r1, r1)
                h.h r0 = h.i.a(r0)
                r3.f85193g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.NormalElementViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    public final class PhoneElementViewHolder extends JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.i> implements au {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ PaymentAdapter f85198f;

        /* renamed from: g  reason: collision with root package name */
        private final h.h f85199g;

        static {
            Covode.recordClassIndex(53288);
        }

        public final PaymentViewModel m() {
            return (PaymentViewModel) this.f85199g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
        public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        static final class d extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.i $item$inlined;
            final /* synthetic */ PhoneElementViewHolder this$0;

            static {
                Covode.recordClassIndex(53292);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(PhoneElementViewHolder phoneElementViewHolder, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.i iVar) {
                super(0);
                this.this$0 = phoneElementViewHolder;
                this.$item$inlined = iVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* bridge */ /* synthetic */ z invoke() {
                this.$item$inlined.f85257a = null;
                return z.f158842a;
            }
        }

        public static final class a extends h.f.b.m implements h.f.a.a<PaymentViewModel> {
            final /* synthetic */ JediViewHolder $this_hostViewModel;
            final /* synthetic */ h.k.c $viewModelClass;
            final /* synthetic */ h.k.c $viewModelClass$inlined;

            static {
                Covode.recordClassIndex(53289);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
                super(0);
                this.$this_hostViewModel = jediViewHolder;
                this.$viewModelClass = cVar;
                this.$viewModelClass$inlined = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // h.f.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.PhoneElementViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            public static ac com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentAdapter$PhoneElementViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.a(str, cls);
                }
                ac a2 = adVar.a(str, cls);
                ab.a(a2, adVar);
                return a2;
            }
        }

        static final class b extends h.f.b.m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, z> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.i $item$inlined;
            final /* synthetic */ PhoneElementViewHolder this$0;

            static {
                Covode.recordClassIndex(53290);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(PhoneElementViewHolder phoneElementViewHolder, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.i iVar) {
                super(1);
                this.this$0 = phoneElementViewHolder;
                this.$item$inlined = iVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list) {
                List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list2 = list;
                String str = "";
                h.f.b.l.d(list2, str);
                PaymentViewModel m2 = this.this$0.m();
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar = this.$item$inlined.f85251c;
                String str2 = this.$item$inlined.f85250b.f85288a;
                if (str2 != null) {
                    str = str2;
                }
                m2.a(oVar, str, (List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>) list2);
                return z.f158842a;
            }
        }

        static final class c extends h.f.b.m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, String> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.i $item$inlined;
            final /* synthetic */ PhoneElementViewHolder this$0;

            static {
                Covode.recordClassIndex(53291);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(PhoneElementViewHolder phoneElementViewHolder, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.i iVar) {
                super(1);
                this.this$0 = phoneElementViewHolder;
                this.$item$inlined = iVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ String invoke(List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list) {
                boolean z;
                List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list2 = list;
                h.f.b.l.d(list2, "");
                String a2 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.a.c.a(this.$item$inlined.f85250b, this.$item$inlined.f85251c, list2);
                t tVar = this.this$0.m().f85210d;
                if (tVar != null) {
                    String c2 = this.$item$inlined.f85251c.c();
                    if (a2 == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    tVar.a((t) c2, (String) z, (boolean) this.$item$inlined.f85250b.f85288a, (String) null);
                }
                return a2;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.i iVar) {
            b.C2044b bVar;
            int i2;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.i iVar2 = iVar;
            String str = "";
            h.f.b.l.d(iVar2, str);
            if (this.f85198f.a(this.f39676i + 1) != null) {
                boolean z = this.f85198f.a(this.f39676i + 1) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.e;
                if (this.f85198f.a(this.f39676i + 1) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.a) {
                    i2 = com.ss.android.ugc.aweme.ecommerce.util.h.f87572f;
                } else {
                    i2 = com.ss.android.ugc.aweme.ecommerce.util.h.f87571e;
                }
                bVar = new b.C2044b(i2, 0, 0, 0, false, z, 30);
            } else {
                bVar = new b.C2044b(com.ss.android.ugc.aweme.ecommerce.util.h.f87571e, 0, 0, 0, false, true, 30);
            }
            View view = this.itemView;
            h.f.b.l.b(view, str);
            b.a.a(view, bVar);
            View view2 = this.itemView;
            Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.PhoneElement");
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.j jVar = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.j) view2;
            jVar.setOnValueChange(new b(this, iVar2));
            jVar.setOnVerify(new c(this, iVar2));
            jVar.setOnErrorClear(new d(this, iVar2));
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar = iVar2.f85250b;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar = iVar2.f85251c;
            PaymentViewModel m2 = m();
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar2 = iVar2.f85251c;
            String str2 = iVar2.f85250b.f85288a;
            if (str2 != null) {
                str = str2;
            }
            jVar.a(eVar, oVar, m2.b(oVar2, str), iVar2.f85257a);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public PhoneElementViewHolder(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r4, android.view.ViewGroup r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                h.f.b.l.d(r5, r0)
                r3.f85198f = r4
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.j r2 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.j
                android.content.Context r1 = r5.getContext()
                h.f.b.l.b(r1, r0)
                r0 = 0
                r2.<init>(r1, r0)
                r3.<init>(r2)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.class
                h.k.c r1 = h.f.b.ab.a(r0)
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$PhoneElementViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$PhoneElementViewHolder$a
                r0.<init>(r3, r1, r1)
                h.h r0 = h.i.a(r0)
                r3.f85199g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.PhoneElementViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    public final class AddressElementViewHolder extends JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.a> implements au {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ PaymentAdapter f85183f;

        /* renamed from: g  reason: collision with root package name */
        private final h.h f85184g;

        static {
            Covode.recordClassIndex(53256);
        }

        public final PaymentViewModel m() {
            return (PaymentViewModel) this.f85184g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
        public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        public static final class a extends h.f.b.m implements h.f.a.a<PaymentViewModel> {
            final /* synthetic */ JediViewHolder $this_hostViewModel;
            final /* synthetic */ h.k.c $viewModelClass;
            final /* synthetic */ h.k.c $viewModelClass$inlined;

            static {
                Covode.recordClassIndex(53257);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
                super(0);
                this.$this_hostViewModel = jediViewHolder;
                this.$viewModelClass = cVar;
                this.$viewModelClass$inlined = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // h.f.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.AddressElementViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            public static ac com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentAdapter$AddressElementViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.a(str, cls);
                }
                ac a2 = adVar.a(str, cls);
                ab.a(a2, adVar);
                return a2;
            }
        }

        static final class c extends h.f.b.m implements h.f.a.b<Boolean, z> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.a $item$inlined;
            final /* synthetic */ AddressElementViewHolder this$0;

            static {
                Covode.recordClassIndex(53259);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(AddressElementViewHolder addressElementViewHolder, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.a aVar) {
                super(1);
                this.this$0 = addressElementViewHolder;
                this.$item$inlined = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Boolean bool) {
                this.this$0.m().f85211e = bool.booleanValue();
                return z.f158842a;
            }
        }

        static final class b extends h.f.b.m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, z> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.a $item$inlined;
            final /* synthetic */ AddressElementViewHolder this$0;

            static {
                Covode.recordClassIndex(53258);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(AddressElementViewHolder addressElementViewHolder, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.a aVar) {
                super(1);
                this.this$0 = addressElementViewHolder;
                this.$item$inlined = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list) {
                List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list2 = list;
                String str = "";
                h.f.b.l.d(list2, str);
                PaymentViewModel m2 = this.this$0.m();
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar = this.$item$inlined.f85251c;
                String str2 = this.$item$inlined.f85250b.f85288a;
                if (str2 != null) {
                    str = str2;
                }
                m2.a(oVar, str, (List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>) list2);
                return z.f158842a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.a aVar) {
            b.C2044b bVar;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.a aVar2 = aVar;
            String str = "";
            h.f.b.l.d(aVar2, str);
            if (this.f85183f.a(this.f39676i + 1) != null) {
                bVar = new b.C2044b(com.ss.android.ugc.aweme.ecommerce.util.h.f87571e, 0, 0, 0, false, this.f85183f.a(this.f39676i + 1) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.e, 30);
            } else {
                bVar = new b.C2044b(com.ss.android.ugc.aweme.ecommerce.util.h.f87571e, 0, 0, 0, false, true, 30);
            }
            View view = this.itemView;
            h.f.b.l.b(view, str);
            b.a.a(view, bVar);
            View view2 = this.itemView;
            Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AddressElement");
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a aVar3 = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a) view2;
            aVar3.setOnValueChange(new b(this, aVar2));
            aVar3.setOnUseShippingAddressChange(new c(this, aVar2));
            aVar3.setOnRegionPanelStatus(m().f85207a);
            aVar3.setShippingAddress(m().f85208b);
            aVar3.setUseShippingAddress(m().f85211e);
            aVar3.setLogger(m().f85210d);
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar = aVar2.f85250b;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar = aVar2.f85251c;
            PaymentViewModel m2 = m();
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar2 = aVar2.f85251c;
            String str2 = aVar2.f85250b.f85288a;
            if (str2 != null) {
                str = str2;
            }
            aVar3.a(eVar, oVar, m2.b(oVar2, str), aVar2.f85246a);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public AddressElementViewHolder(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r4, android.view.ViewGroup r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                h.f.b.l.d(r5, r0)
                r3.f85183f = r4
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a r2 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a
                android.content.Context r1 = r5.getContext()
                h.f.b.l.b(r1, r0)
                r0 = 0
                r2.<init>(r1, r0)
                r3.<init>(r2)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.class
                h.k.c r1 = h.f.b.ab.a(r0)
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$AddressElementViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$AddressElementViewHolder$a
                r0.<init>(r3, r1, r1)
                h.h r0 = h.i.a(r0)
                r3.f85184g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.AddressElementViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    public final class BalanceElementViewHolder extends JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.b> implements au {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ PaymentAdapter f85186f;

        /* renamed from: g  reason: collision with root package name */
        private final h.h f85187g;

        static {
            Covode.recordClassIndex(53261);
        }

        public final PaymentViewModel m() {
            return (PaymentViewModel) this.f85187g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
        public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        public static final class a extends h.f.b.m implements h.f.a.a<PaymentViewModel> {
            final /* synthetic */ JediViewHolder $this_hostViewModel;
            final /* synthetic */ h.k.c $viewModelClass;
            final /* synthetic */ h.k.c $viewModelClass$inlined;

            static {
                Covode.recordClassIndex(53262);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
                super(0);
                this.$this_hostViewModel = jediViewHolder;
                this.$viewModelClass = cVar;
                this.$viewModelClass$inlined = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // h.f.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.BalanceElementViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            public static ac com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentAdapter$BalanceElementViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.a(str, cls);
                }
                ac a2 = adVar.a(str, cls);
                ab.a(a2, adVar);
                return a2;
            }
        }

        static final class b extends h.f.b.m implements h.f.a.b<String, String> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.b $item$inlined;
            final /* synthetic */ BalanceElementViewHolder this$0;

            static {
                Covode.recordClassIndex(53263);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(BalanceElementViewHolder balanceElementViewHolder, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.b bVar) {
                super(1);
                this.this$0 = balanceElementViewHolder;
                this.$item$inlined = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ String invoke(String str) {
                boolean z;
                T t;
                String paymentMethodBindUrl;
                String str2 = str;
                PaymentViewModel m2 = this.this$0.m();
                if (str2 == null || str2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return null;
                }
                m2.f85215l = str2;
                Iterator<T> it = m2.f85214k.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (h.f.b.l.a((Object) t.getPaymentMethodId(), (Object) str2)) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null && (paymentMethodBindUrl = t2.getPaymentMethodBindUrl()) != null && paymentMethodBindUrl.length() != 0) {
                    return paymentMethodBindUrl;
                }
                m2.c(PaymentViewModel.d.f85217a);
                return null;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.b bVar) {
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.b bVar2 = bVar;
            String str = "";
            h.f.b.l.d(bVar2, str);
            View view = this.itemView;
            h.f.b.l.b(view, str);
            b.a.a(view, new b.C2044b(0, 0, 0, 0, true, false, 47));
            View view2 = this.itemView;
            Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.BalanceElement");
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.b bVar3 = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.b) view2;
            bVar3.setGetBindUrl(new b(this, bVar2));
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar = bVar2.f85250b;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar = bVar2.f85251c;
            PaymentViewModel m2 = m();
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar2 = bVar2.f85251c;
            String str2 = bVar2.f85250b.f85288a;
            if (str2 != null) {
                str = str2;
            }
            bVar3.a(eVar, oVar, m2.b(oVar2, str), bVar2.f85247a);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public BalanceElementViewHolder(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r4, android.view.ViewGroup r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                h.f.b.l.d(r5, r0)
                r3.f85186f = r4
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.b r2 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.b
                android.content.Context r1 = r5.getContext()
                h.f.b.l.b(r1, r0)
                r0 = 0
                r2.<init>(r1, r0)
                r3.<init>(r2)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.class
                h.k.c r1 = h.f.b.ab.a(r0)
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$BalanceElementViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$BalanceElementViewHolder$a
                r0.<init>(r3, r1, r1)
                h.h r0 = h.i.a(r0)
                r3.f85187g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.BalanceElementViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    public final class OptionElementViewHolder extends JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.g> implements au {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ PaymentAdapter f85194f;

        /* renamed from: g  reason: collision with root package name */
        private final h.h f85195g;

        static {
            Covode.recordClassIndex(53281);
        }

        public final PaymentViewModel m() {
            return (PaymentViewModel) this.f85195g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
        public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        public static final class a extends h.f.b.m implements h.f.a.a<PaymentViewModel> {
            final /* synthetic */ JediViewHolder $this_hostViewModel;
            final /* synthetic */ h.k.c $viewModelClass;
            final /* synthetic */ h.k.c $viewModelClass$inlined;

            static {
                Covode.recordClassIndex(53282);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
                super(0);
                this.$this_hostViewModel = jediViewHolder;
                this.$viewModelClass = cVar;
                this.$viewModelClass$inlined = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // h.f.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.OptionElementViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            public static ac com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentAdapter$OptionElementViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.a(str, cls);
                }
                ac a2 = adVar.a(str, cls);
                ab.a(a2, adVar);
                return a2;
            }
        }

        static final class b extends h.f.b.m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, z> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.g $item$inlined;
            final /* synthetic */ OptionElementViewHolder this$0;

            static {
                Covode.recordClassIndex(53283);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(OptionElementViewHolder optionElementViewHolder, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.g gVar) {
                super(1);
                this.this$0 = optionElementViewHolder;
                this.$item$inlined = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list) {
                String str;
                List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list2 = list;
                String str2 = "";
                h.f.b.l.d(list2, str2);
                PaymentViewModel m2 = this.this$0.m();
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar = this.$item$inlined.f85251c;
                String str3 = this.$item$inlined.f85250b.f85288a;
                if (str3 != null) {
                    str2 = str3;
                }
                m2.a(oVar, str2, (List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>) list2);
                t tVar = this.this$0.m().f85210d;
                if (tVar != null) {
                    String c2 = this.$item$inlined.f85251c.c();
                    String str4 = this.$item$inlined.f85250b.f85288a;
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m mVar = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m) h.a.n.b((List) list2, 0);
                    if (mVar != null) {
                        str = mVar.getParamValue();
                    } else {
                        str = null;
                    }
                    tVar.a(c2, true, str4, str);
                }
                return z.f158842a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.g gVar) {
            b.C2044b bVar;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.g gVar2 = gVar;
            String str = "";
            h.f.b.l.d(gVar2, str);
            if (this.f85194f.a(this.f39676i + 1) != null) {
                bVar = null;
            } else {
                bVar = new b.C2044b(com.ss.android.ugc.aweme.ecommerce.util.h.f87571e, 0, 0, 0, false, true, 30);
            }
            View view = this.itemView;
            h.f.b.l.b(view, str);
            b.a.a(view, bVar);
            View view2 = this.itemView;
            Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.OptionElement");
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.i iVar = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.i) view2;
            iVar.setOnValueChange(new b(this, gVar2));
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar = gVar2.f85250b;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar = gVar2.f85251c;
            PaymentViewModel m2 = m();
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar2 = gVar2.f85251c;
            String str2 = gVar2.f85250b.f85288a;
            if (str2 != null) {
                str = str2;
            }
            iVar.a(eVar, oVar, m2.b(oVar2, str), gVar2.f85253a);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public OptionElementViewHolder(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r4, android.view.ViewGroup r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                h.f.b.l.d(r5, r0)
                r3.f85194f = r4
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.i r2 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.i
                android.content.Context r1 = r5.getContext()
                h.f.b.l.b(r1, r0)
                r0 = 0
                r2.<init>(r1, r0)
                r3.<init>(r2)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.class
                h.k.c r1 = h.f.b.ab.a(r0)
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$OptionElementViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$OptionElementViewHolder$a
                r0.<init>(r3, r1, r1)
                h.h r0 = h.i.a(r0)
                r3.f85195g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.OptionElementViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    public final class PaymentMethodViewHolder extends JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h> implements au {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ PaymentAdapter f85196f;

        /* renamed from: g  reason: collision with root package name */
        private final h.h f85197g;

        static {
            Covode.recordClassIndex(53284);
        }

        public final PaymentViewModel m() {
            return (PaymentViewModel) this.f85197g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
        public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        public static final class a extends h.f.b.m implements h.f.a.a<PaymentViewModel> {
            final /* synthetic */ JediViewHolder $this_hostViewModel;
            final /* synthetic */ h.k.c $viewModelClass;
            final /* synthetic */ h.k.c $viewModelClass$inlined;

            static {
                Covode.recordClassIndex(53285);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
                super(0);
                this.$this_hostViewModel = jediViewHolder;
                this.$viewModelClass = cVar;
                this.$viewModelClass$inlined = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // h.f.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.PaymentMethodViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            public static ac com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentAdapter$PaymentMethodViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.a(str, cls);
                }
                ac a2 = adVar.a(str, cls);
                ab.a(a2, adVar);
                return a2;
            }
        }

        static final class b extends h.f.b.m implements h.f.a.b<String, z> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h $item$inlined;
            final /* synthetic */ PaymentMethodViewHolder this$0;

            static {
                Covode.recordClassIndex(53286);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(PaymentMethodViewHolder paymentMethodViewHolder, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h hVar) {
                super(1);
                this.this$0 = paymentMethodViewHolder;
                this.$item$inlined = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(String str) {
                PaymentViewModel m2 = this.this$0.m();
                m2.c(new PaymentViewModel.j(m2, this.$item$inlined.f85254a));
                return z.f158842a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h hVar) {
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h hVar2 = hVar;
            h.f.b.l.d(hVar2, "");
            View view = this.itemView;
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.PaymentMethodView");
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.d dVar = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.d) view;
            dVar.setPaymentMethod(hVar2.f85254a);
            dVar.setOnCheckedListener(new b(this, hVar2));
            withState(m(), new c(dVar, this, hVar2));
        }

        static final class c extends h.f.b.m implements h.f.a.b<PaymentState, z> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h $item$inlined;
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.d $this_apply;
            final /* synthetic */ PaymentMethodViewHolder this$0;

            static {
                Covode.recordClassIndex(53287);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.d dVar, PaymentMethodViewHolder paymentMethodViewHolder, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h hVar) {
                super(1);
                this.$this_apply = dVar;
                this.this$0 = paymentMethodViewHolder;
                this.$item$inlined = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(PaymentState paymentState) {
                b.C2044b bVar;
                boolean z;
                List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e> a2;
                PaymentState paymentState2 = paymentState;
                h.f.b.l.d(paymentState2, "");
                boolean a3 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.l.a(this.$item$inlined.f85254a, paymentState2.getCheckedPaymentMethod());
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.a aVar = this.$item$inlined.f85254a.t;
                if (aVar != null && h.f.b.l.a((Object) false, (Object) aVar.f85272a)) {
                    a3 = false;
                }
                this.$this_apply.setChecked(a3);
                this.$this_apply.setPaymentViewModel(this.this$0.m());
                if (this.this$0.f85196f.a(this.this$0.f39676i + 1) != null) {
                    if (!(this.this$0.f85196f.a(this.this$0.f39676i + 1) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h) || (a3 && (a2 = this.$item$inlined.f85254a.a()) != null && !a2.isEmpty())) {
                        z = false;
                    } else {
                        z = true;
                    }
                    bVar = new b.C2044b(0, 0, 0, 0, z, false, 47);
                } else {
                    bVar = new b.C2044b(com.ss.android.ugc.aweme.ecommerce.util.h.f87571e, 0, 0, 0, false, true, 30);
                }
                View view = this.this$0.itemView;
                h.f.b.l.b(view, "");
                b.a.a(view, bVar);
                return z.f158842a;
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public PaymentMethodViewHolder(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r4, android.view.ViewGroup r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                h.f.b.l.d(r5, r0)
                r3.f85196f = r4
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.d r2 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.d
                android.content.Context r1 = r5.getContext()
                h.f.b.l.b(r1, r0)
                r0 = 0
                r2.<init>(r1, r0)
                r3.<init>(r2)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.class
                h.k.c r1 = h.f.b.ab.a(r0)
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$PaymentMethodViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$PaymentMethodViewHolder$a
                r0.<init>(r3, r1, r1)
                h.h r0 = h.i.a(r0)
                r3.f85197g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.PaymentMethodViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    public final class SaveElementViewHolder extends JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.j> implements au {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ PaymentAdapter f85200f;

        /* renamed from: g  reason: collision with root package name */
        private final h.h f85201g;

        static {
            Covode.recordClassIndex(53293);
        }

        public final PaymentViewModel m() {
            return (PaymentViewModel) this.f85201g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
        public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        public static final class a extends h.f.b.m implements h.f.a.a<PaymentViewModel> {
            final /* synthetic */ JediViewHolder $this_hostViewModel;
            final /* synthetic */ h.k.c $viewModelClass;
            final /* synthetic */ h.k.c $viewModelClass$inlined;

            static {
                Covode.recordClassIndex(53294);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
                super(0);
                this.$this_hostViewModel = jediViewHolder;
                this.$viewModelClass = cVar;
                this.$viewModelClass$inlined = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // h.f.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.SaveElementViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            public static ac com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentAdapter$SaveElementViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.a(str, cls);
                }
                ac a2 = adVar.a(str, cls);
                ab.a(a2, adVar);
                return a2;
            }
        }

        static final class b extends h.f.b.m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, z> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.j $item$inlined;
            final /* synthetic */ SaveElementViewHolder this$0;

            static {
                Covode.recordClassIndex(53295);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(SaveElementViewHolder saveElementViewHolder, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.j jVar) {
                super(1);
                this.this$0 = saveElementViewHolder;
                this.$item$inlined = jVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list) {
                List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list2 = list;
                String str = "";
                h.f.b.l.d(list2, str);
                PaymentViewModel m2 = this.this$0.m();
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar = this.$item$inlined.f85251c;
                String str2 = this.$item$inlined.f85250b.f85288a;
                if (str2 != null) {
                    str = str2;
                }
                m2.a(oVar, str, (List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>) list2);
                return z.f158842a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.j jVar) {
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.j jVar2 = jVar;
            String str = "";
            h.f.b.l.d(jVar2, str);
            View view = this.itemView;
            h.f.b.l.b(view, str);
            b.a.a(view, new b.C2044b(com.ss.android.ugc.aweme.ecommerce.util.h.f87571e, 0, 80, 0, false, true, 26));
            View view2 = this.itemView;
            Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.SaveElement");
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.m mVar = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.m) view2;
            mVar.setOnValueChange(new b(this, jVar2));
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar = jVar2.f85250b;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar = jVar2.f85251c;
            PaymentViewModel m2 = m();
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar2 = jVar2.f85251c;
            String str2 = jVar2.f85250b.f85288a;
            if (str2 != null) {
                str = str2;
            }
            mVar.a(eVar, oVar, m2.b(oVar2, str), jVar2.f85258a);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public SaveElementViewHolder(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r4, android.view.ViewGroup r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                h.f.b.l.d(r5, r0)
                r3.f85200f = r4
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.m r2 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.m
                android.content.Context r1 = r5.getContext()
                h.f.b.l.b(r1, r0)
                r0 = 0
                r2.<init>(r1, r0)
                r3.<init>(r2)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.class
                h.k.c r1 = h.f.b.ab.a(r0)
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$SaveElementViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$SaveElementViewHolder$a
                r0.<init>(r3, r1, r1)
                h.h r0 = h.i.a(r0)
                r3.f85201g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.SaveElementViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    public final class SeeMoreViewHolder extends JediSimpleViewHolder<aa> implements au {

        /* renamed from: f  reason: collision with root package name */
        final h.h f85202f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ PaymentAdapter f85203g;

        static {
            Covode.recordClassIndex(53296);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
        public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        public static final class a extends h.f.b.m implements h.f.a.a<PaymentViewModel> {
            final /* synthetic */ JediViewHolder $this_hostViewModel;
            final /* synthetic */ h.k.c $viewModelClass;
            final /* synthetic */ h.k.c $viewModelClass$inlined;

            static {
                Covode.recordClassIndex(53297);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
                super(0);
                this.$this_hostViewModel = jediViewHolder;
                this.$viewModelClass = cVar;
                this.$viewModelClass$inlined = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // h.f.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.SeeMoreViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            public static ac com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentAdapter$SeeMoreViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.a(str, cls);
                }
                ac a2 = adVar.a(str, cls);
                ab.a(a2, adVar);
                return a2;
            }
        }

        static final class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SeeMoreViewHolder f85204a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ aa f85205b;

            static {
                Covode.recordClassIndex(53298);
            }

            b(SeeMoreViewHolder seeMoreViewHolder, aa aaVar) {
                this.f85204a = seeMoreViewHolder;
                this.f85205b = aaVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                aa aaVar = this.f85205b;
                h.f.b.l.d(aaVar, "");
                ((JediViewModel) this.f85204a.f85202f.getValue()).c(new PaymentViewModel.i(aaVar));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final /* synthetic */ void a(aa aaVar) {
            aa aaVar2 = aaVar;
            h.f.b.l.d(aaVar2, "");
            View view = this.itemView;
            h.f.b.l.b(view, "");
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.dwv);
            h.f.b.l.b(tuxTextView, "");
            View view2 = this.itemView;
            h.f.b.l.b(view2, "");
            tuxTextView.setText(view2.getContext().getString(R.string.bj2));
            this.itemView.setOnClickListener(new b(this, aaVar2));
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public SeeMoreViewHolder(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                h.f.b.l.d(r6, r3)
                r4.f85203g = r5
                android.content.Context r0 = r6.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
                r1 = 2131558995(0x7f0d0253, float:1.8743322E38)
                r0 = 0
                android.view.View r0 = com.a.a(r2, r1, r6, r0)
                h.f.b.l.b(r0, r3)
                r4.<init>(r0)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.class
                h.k.c r1 = h.f.b.ab.a(r0)
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$SeeMoreViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter$SeeMoreViewHolder$a
                r0.<init>(r4, r1, r1)
                h.h r0 = h.i.a(r0)
                r4.f85202f = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.SeeMoreViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    @Override // com.ss.android.ugc.aweme.base.arch.h, com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        return ((com.ss.android.ugc.aweme.base.arch.d) this).f67986a.b(i2);
    }

    static final class b extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {
        final /* synthetic */ PaymentAdapter this$0;

        static {
            Covode.recordClassIndex(53300);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PaymentAdapter paymentAdapter) {
            super(1);
            this.this$0 = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new AddressElementViewHolder(this.this$0, viewGroup2);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {
        final /* synthetic */ PaymentAdapter this$0;

        static {
            Covode.recordClassIndex(53302);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(PaymentAdapter paymentAdapter) {
            super(1);
            this.this$0 = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new DateElementViewHolder(this.this$0, viewGroup2);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {
        final /* synthetic */ PaymentAdapter this$0;

        static {
            Covode.recordClassIndex(53304);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(PaymentAdapter paymentAdapter) {
            super(1);
            this.this$0 = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new NormalElementViewHolder(this.this$0, viewGroup2);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {
        final /* synthetic */ PaymentAdapter this$0;

        static {
            Covode.recordClassIndex(53306);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(PaymentAdapter paymentAdapter) {
            super(1);
            this.this$0 = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new OptionElementViewHolder(this.this$0, viewGroup2);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {
        final /* synthetic */ PaymentAdapter this$0;

        static {
            Covode.recordClassIndex(53308);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(PaymentAdapter paymentAdapter) {
            super(1);
            this.this$0 = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new SaveElementViewHolder(this.this$0, viewGroup2);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {
        final /* synthetic */ PaymentAdapter this$0;

        static {
            Covode.recordClassIndex(53310);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(PaymentAdapter paymentAdapter) {
            super(1);
            this.this$0 = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new AreaTitleViewHolder(this.this$0, viewGroup2);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {
        final /* synthetic */ PaymentAdapter this$0;

        static {
            Covode.recordClassIndex(53311);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(PaymentAdapter paymentAdapter) {
            super(1);
            this.this$0 = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new PhoneElementViewHolder(this.this$0, viewGroup2);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {
        final /* synthetic */ PaymentAdapter this$0;

        static {
            Covode.recordClassIndex(53313);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(PaymentAdapter paymentAdapter) {
            super(1);
            this.this$0 = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new BalanceElementViewHolder(this.this$0, viewGroup2);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {
        final /* synthetic */ PaymentAdapter this$0;

        static {
            Covode.recordClassIndex(53315);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(PaymentAdapter paymentAdapter) {
            super(1);
            this.this$0 = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new SeeMoreViewHolder(this.this$0, viewGroup2);
        }
    }

    static final class s extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {
        final /* synthetic */ PaymentAdapter this$0;

        static {
            Covode.recordClassIndex(53317);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(PaymentAdapter paymentAdapter) {
            super(1);
            this.this$0 = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new PaymentMethodViewHolder(this.this$0, viewGroup2);
        }
    }

    static final class u extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {
        final /* synthetic */ PaymentAdapter this$0;

        static {
            Covode.recordClassIndex(53319);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(PaymentAdapter paymentAdapter) {
            super(1);
            this.this$0 = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new CardNumberElementViewHolder(this.this$0, viewGroup2);
        }
    }

    static final class a extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ PaymentAdapter this$0;

        static {
            Covode.recordClassIndex(53299);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(PaymentAdapter paymentAdapter) {
            super(1);
            this.this$0 = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof a);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ PaymentAdapter this$0;

        static {
            Covode.recordClassIndex(53301);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PaymentAdapter paymentAdapter) {
            super(1);
            this.this$0 = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.d);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ PaymentAdapter this$0;

        static {
            Covode.recordClassIndex(53303);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(PaymentAdapter paymentAdapter) {
            super(1);
            this.this$0 = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.f);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ PaymentAdapter this$0;

        static {
            Covode.recordClassIndex(53305);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(PaymentAdapter paymentAdapter) {
            super(1);
            this.this$0 = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.g);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ PaymentAdapter this$0;

        static {
            Covode.recordClassIndex(53307);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(PaymentAdapter paymentAdapter) {
            super(1);
            this.this$0 = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.j);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ PaymentAdapter this$0;

        static {
            Covode.recordClassIndex(53309);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(PaymentAdapter paymentAdapter) {
            super(1);
            this.this$0 = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.i);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ PaymentAdapter this$0;

        static {
            Covode.recordClassIndex(53312);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(PaymentAdapter paymentAdapter) {
            super(1);
            this.this$0 = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.b);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ PaymentAdapter this$0;

        static {
            Covode.recordClassIndex(53314);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(PaymentAdapter paymentAdapter) {
            super(1);
            this.this$0 = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof aa);
        }
    }

    static final class r extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ PaymentAdapter this$0;

        static {
            Covode.recordClassIndex(53316);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(PaymentAdapter paymentAdapter) {
            super(1);
            this.this$0 = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h);
        }
    }

    static final class t extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ PaymentAdapter this$0;

        static {
            Covode.recordClassIndex(53318);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(PaymentAdapter paymentAdapter) {
            super(1);
            this.this$0 = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.c);
        }
    }

    static final class v extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ PaymentAdapter this$0;

        static {
            Covode.recordClassIndex(53320);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(PaymentAdapter paymentAdapter) {
            super(1);
            this.this$0 = paymentAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentAdapter(androidx.lifecycle.m mVar) {
        super(mVar, new b(), 4);
        h.f.b.l.d(mVar, "");
        this.f85182d = mVar;
    }

    public final class AreaTitleViewHolder extends JediSimpleViewHolder<a> implements au {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ PaymentAdapter f85185f;

        static {
            Covode.recordClassIndex(53260);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
        public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final /* synthetic */ void a(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            View view = this.itemView;
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
            View view2 = this.itemView;
            h.f.b.l.b(view2, "");
            ((TuxTextView) view).setText(((TuxTextView) view2).getContext().getString(aVar2.f85224a));
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public AreaTitleViewHolder(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                h.f.b.l.d(r6, r3)
                r4.f85185f = r5
                android.content.Context r0 = r6.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
                r1 = 2131558994(0x7f0d0252, float:1.874332E38)
                r0 = 0
                android.view.View r0 = com.a.a(r2, r1, r6, r0)
                h.f.b.l.b(r0, r3)
                r4.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter.AreaTitleViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter, android.view.ViewGroup):void");
        }
    }

    @Override // com.ss.android.ugc.aweme.base.arch.h
    public final void a(com.bytedance.jedi.ext.adapter.b.g<JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> gVar) {
        h.f.b.l.d(gVar, "");
        com.bytedance.jedi.ext.adapter.b.g unused = gVar.a(new a(this), null, new l(this));
        com.bytedance.jedi.ext.adapter.b.g unused2 = gVar.a(new p(this), null, new q(this));
        com.bytedance.jedi.ext.adapter.b.g unused3 = gVar.a(new r(this), null, new s(this));
        com.bytedance.jedi.ext.adapter.b.g unused4 = gVar.a(new t(this), null, new u(this));
        com.bytedance.jedi.ext.adapter.b.g unused5 = gVar.a(new v(this), null, new b(this));
        com.bytedance.jedi.ext.adapter.b.g unused6 = gVar.a(new c(this), null, new d(this));
        com.bytedance.jedi.ext.adapter.b.g unused7 = gVar.a(new e(this), null, new f(this));
        com.bytedance.jedi.ext.adapter.b.g unused8 = gVar.a(new g(this), null, new h(this));
        com.bytedance.jedi.ext.adapter.b.g unused9 = gVar.a(new i(this), null, new j(this));
        com.bytedance.jedi.ext.adapter.b.g unused10 = gVar.a(new k(this), null, new m(this));
        com.bytedance.jedi.ext.adapter.b.g unused11 = gVar.a(new n(this), null, new o(this));
    }
}
