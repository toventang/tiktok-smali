package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.ShopBill;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.OrderSubmitInfoView;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.ss.android.ugc.aweme.ecommerce.widget.LogoTuxTextView;
import com.ss.android.ugc.aweme.ecommerce.widget.ProductCounterV2View;
import com.ss.android.ugc.aweme.ecommercebase.view.TagTextView;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.utils.hk;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.h;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.internal.o;

public final class ProductInfoVH extends JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f> implements au {

    /* renamed from: g  reason: collision with root package name */
    public static final b f85120g = new b((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public final View f85121f;

    /* renamed from: j  reason: collision with root package name */
    private final h f85122j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f85123k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f85124l;

    /* renamed from: m  reason: collision with root package name */
    private c f85125m = new c(this);

    static {
        Covode.recordClassIndex(53202);
    }

    public final OrderSubmitViewModel m() {
        return (OrderSubmitViewModel) this.f85122j.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(53204);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final class c extends RecyclerView.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f f85126a;

        /* renamed from: b  reason: collision with root package name */
        public final List<com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.h> f85127b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ProductInfoVH f85128c;

        static {
            Covode.recordClassIndex(53205);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(this, viewGroup, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemCount() {
            return this.f85127b.size();
        }

        static final class e extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(53210);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f85128c.m().C = true;
                return z.f158842a;
            }
        }

        public /* synthetic */ c(ProductInfoVH productInfoVH) {
            this(productInfoVH, new ArrayList());
        }

        static final class a extends h.f.b.m implements h.f.a.b<MotionEvent, z> {
            final /* synthetic */ ProductCounterV2View $this_apply$inlined;

            static {
                Covode.recordClassIndex(53206);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(ProductCounterV2View productCounterV2View) {
                super(1);
                this.$this_apply$inlined = productCounterV2View;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                l.d(motionEvent2, "");
                if (motionEvent2.getAction() == 0) {
                    int[] iArr = new int[2];
                    this.$this_apply$inlined.getLocationInWindow(iArr);
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    int measuredWidth = this.$this_apply$inlined.getMeasuredWidth() + i2;
                    int measuredHeight = this.$this_apply$inlined.getMeasuredHeight() + i3;
                    if (motionEvent2.getRawX() < ((float) i2) || motionEvent2.getRawX() > ((float) measuredWidth) || motionEvent2.getRawY() < ((float) i3) || motionEvent2.getRawY() > ((float) measuredHeight)) {
                        KeyboardUtils.c(this.$this_apply$inlined.getInput());
                    }
                }
                return z.f158842a;
            }
        }

        private c(ProductInfoVH productInfoVH, List<com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.h> list) {
            l.d(list, "");
            this.f85128c = productInfoVH;
            this.f85126a = null;
            this.f85127b = list;
        }

        static final class d extends h.f.b.m implements h.f.a.m<Boolean, Integer, z> {
            final /* synthetic */ ProductCounterV2View $this_apply;
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(53209);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(ProductCounterV2View productCounterV2View, c cVar) {
                super(2);
                this.$this_apply = productCounterV2View;
                this.this$0 = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(Boolean bool, Integer num) {
                boolean booleanValue = bool.booleanValue();
                int intValue = num.intValue();
                int[] iArr = new int[2];
                this.$this_apply.getLocationInWindow(iArr);
                if (!booleanValue || intValue >= iArr[1] + this.$this_apply.getMeasuredHeight()) {
                    this.this$0.f85128c.m().c(0);
                } else {
                    this.this$0.f85128c.m().c((iArr[1] + this.$this_apply.getMeasuredHeight()) - intValue);
                }
                this.this$0.f85128c.m().s = booleanValue;
                return z.f158842a;
            }
        }

        public final class b extends RecyclerView.ViewHolder {

            /* renamed from: a  reason: collision with root package name */
            public final ConstraintLayout f85129a;

            /* renamed from: b  reason: collision with root package name */
            public final LogoTuxTextView f85130b;

            /* renamed from: c  reason: collision with root package name */
            public final SmartImageView f85131c;

            /* renamed from: d  reason: collision with root package name */
            public final TextView f85132d;

            /* renamed from: e  reason: collision with root package name */
            public final TextView f85133e;

            /* renamed from: f  reason: collision with root package name */
            public final TextView f85134f;

            /* renamed from: g  reason: collision with root package name */
            public final ProductCounterV2View f85135g;

            /* renamed from: h  reason: collision with root package name */
            public final TextView f85136h;

            /* renamed from: i  reason: collision with root package name */
            public final TagTextView f85137i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ c f85138j;

            static {
                Covode.recordClassIndex(53207);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(c cVar, View view) {
                super(view);
                l.d(view, "");
                this.f85138j = cVar;
                View findViewById = view.findViewById(R.id.ad7);
                l.b(findViewById, "");
                this.f85129a = (ConstraintLayout) findViewById;
                View findViewById2 = view.findViewById(R.id.d_c);
                l.b(findViewById2, "");
                this.f85130b = (LogoTuxTextView) findViewById2;
                View findViewById3 = view.findViewById(R.id.d_1);
                l.b(findViewById3, "");
                this.f85131c = (SmartImageView) findViewById3;
                View findViewById4 = view.findViewById(R.id.d_b);
                l.b(findViewById4, "");
                this.f85132d = (TextView) findViewById4;
                View findViewById5 = view.findViewById(R.id.cjm);
                l.b(findViewById5, "");
                this.f85133e = (TextView) findViewById5;
                View findViewById6 = view.findViewById(R.id.d99);
                l.b(findViewById6, "");
                this.f85134f = (TextView) findViewById6;
                View findViewById7 = view.findViewById(R.id.ag0);
                l.b(findViewById7, "");
                this.f85135g = (ProductCounterV2View) findViewById7;
                View findViewById8 = view.findViewById(R.id.bsj);
                l.b(findViewById8, "");
                this.f85136h = (TextView) findViewById8;
                View findViewById9 = view.findViewById(R.id.d0n);
                l.b(findViewById9, "");
                this.f85137i = (TagTextView) findViewById9;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH$c$c  reason: collision with other inner class name */
        static final class C2038c extends h.f.b.m implements h.f.a.m<Integer, String, z> {
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(53208);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2038c(c cVar) {
                super(2);
                this.this$0 = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(Integer num, String str) {
                ArrayList arrayList;
                OrderShopDigest orderShopDigest;
                ArrayList arrayList2;
                OrderSKUDTO a2;
                int intValue = num.intValue();
                l.d(str, "");
                OrderSubmitViewModel m2 = this.this$0.f85128c.m();
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f fVar = this.this$0.f85126a;
                l.d(str, "");
                m2.D = true;
                List<OrderShopDigest> list = m2.f84730c;
                if (list != null) {
                    ArrayList arrayList3 = new ArrayList(n.a((Iterable) list, 10));
                    for (T t : list) {
                        if (l.a((Object) (fVar != null ? fVar.f84825a : null), (Object) t.getSellerId())) {
                            if (l.a((Object) (fVar != null ? fVar.f84826b : null), (Object) t.getWarehouseId())) {
                                List<OrderSKUDTO> orderSKUs = t.getOrderSKUs();
                                if (orderSKUs != null) {
                                    ArrayList arrayList4 = new ArrayList(n.a((Iterable) orderSKUs, 10));
                                    for (T t2 : orderSKUs) {
                                        if (l.a((Object) t2.f85907b, (Object) str)) {
                                            a2 = OrderSKUDTO.a(t2, null, null, Integer.valueOf(intValue), null, null, null, null, null, null, 507);
                                        } else {
                                            a2 = OrderSKUDTO.a(t2, null, null, null, null, null, null, null, null, null, 511);
                                        }
                                        arrayList4.add(a2);
                                    }
                                    arrayList2 = arrayList4;
                                } else {
                                    arrayList2 = null;
                                }
                                orderShopDigest = OrderShopDigest.copy$default(t, null, null, arrayList2, null, null, 27, null);
                                arrayList3.add(orderShopDigest);
                            }
                        }
                        orderShopDigest = OrderShopDigest.copy$default(t, null, null, null, null, null, 31, null);
                        arrayList3.add(orderShopDigest);
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                OrderSubmitViewModel.a(m2, false, false, false, false, arrayList, 45);
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("edit_quantity", (Boolean) null, 6);
                return z.f158842a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x01b1  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x01e5  */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onBindViewHolder(com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH.c.b r10, int r11) {
            /*
            // Method dump skipped, instructions count: 566
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH.c.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        public static final class f implements View.OnLayoutChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f85139a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f85140b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.h f85141c;

            static {
                Covode.recordClassIndex(53211);
            }

            f(c cVar, b bVar, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.h hVar) {
                this.f85139a = cVar;
                this.f85140b = bVar;
                this.f85141c = hVar;
            }

            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int i10;
                int i11;
                this.f85140b.f85132d.removeOnLayoutChangeListener(this);
                if (view != null && view.getMeasuredHeight() >= com.ss.android.ugc.aweme.base.utils.n.a(17.0d) * 2) {
                    androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                    bVar.a(this.f85140b.f85129a);
                    bVar.a(R.id.d99);
                    bVar.b(-2);
                    bVar.a();
                    bVar.a(R.id.d99, 6, R.id.d_c, 6);
                    String str = this.f85141c.f84844h;
                    if (str == null || str.length() == 0) {
                        i10 = R.id.d_b;
                    } else {
                        i10 = R.id.cjm;
                    }
                    bVar.a(R.id.d99, 3, i10, 4, com.ss.android.ugc.aweme.base.utils.n.a(20.0d));
                    if (this.f85139a.f85128c.m().f84728a == 0) {
                        i11 = R.id.ag0;
                    } else {
                        i11 = R.id.bsj;
                    }
                    bVar.a(R.id.d99, 7, i11, 6);
                    bVar.b(this.f85140b.f85129a);
                }
            }
        }

        private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
            boolean a2;
            MethodCollector.i(8871);
            l.d(viewGroup, "");
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.rj, viewGroup, false);
            l.b(a3, "");
            b bVar = new b(cVar, a3);
            try {
                if (bVar.itemView.getParent() != null) {
                    try {
                        a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a2) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                        com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(bVar.itemView);
                        }
                    }
                }
            } catch (Exception e2) {
                ai.a(e2);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            gg.f143005a = bVar.getClass().getName();
            MethodCollector.o(8871);
            return bVar;
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<OrderSubmitViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(53203);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_viewholder_ProductInfoVH$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
        a.C2089a.a(this.f85121f, true);
        View view = this.f85121f;
        f.a.b.b unused = selectSubscribe(m(), g.f85161a, new ah(), new g(view));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.e37);
        l.b(recyclerView, "");
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.e37);
        l.b(recyclerView2, "");
        recyclerView2.setAdapter(this.f85125m);
    }

    public static final class e extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85146a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f85147b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ProductInfoVH f85148c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f f85149d;

        static {
            Covode.recordClassIndex(53213);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                Context context = this.f85147b.getContext();
                l.b(context, "");
                final androidx.fragment.app.e b2 = com.bytedance.jedi.ext.adapter.b.b(context);
                ProductInfoVH productInfoVH = this.f85148c;
                productInfoVH.withState(productInfoVH.m(), new h.f.a.b<OrderSubmitState, z>() {
                    /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH.e.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(53214);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(OrderSubmitState orderSubmitState) {
                        OrderSubmitState orderSubmitState2 = orderSubmitState;
                        l.d(orderSubmitState2, "");
                        Bundle bundle = new Bundle();
                        bundle.putString("message", orderSubmitState2.getMessage());
                        androidx.fragment.app.i supportFragmentManager = b2.getSupportFragmentManager();
                        l.b(supportFragmentManager, "");
                        l.d(supportFragmentManager, "");
                        l.d(bundle, "");
                        if (bundle.getString("message") != null) {
                            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a aVar = new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a();
                            aVar.setArguments(bundle);
                            aVar.show(supportFragmentManager, "OSPMessagePanelFragment");
                        }
                        return z.f158842a;
                    }
                });
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("message", this.f85148c.m().j(), null, null, null, null, null, null, null, null, 1020);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(View view, ProductInfoVH productInfoVH, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f fVar) {
            super(700);
            this.f85147b = view;
            this.f85148c = productInfoVH;
            this.f85149d = fVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductInfoVH(View view) {
        super(view);
        l.d(view, "");
        this.f85121f = view;
        h.k.c a2 = h.f.b.ab.a(OrderSubmitViewModel.class);
        this.f85122j = h.i.a((h.f.a.a) new a(this, a2, a2));
    }

    public static final class d extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85142a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f85143b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ProductInfoVH f85144c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f f85145d;

        static {
            Covode.recordClassIndex(53212);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            List<LogisticDTO> list;
            Float f2;
            String str;
            LogisticTextDTO logisticTextDTO;
            Price price;
            Price price2;
            String priceVal;
            if (view != null && (list = this.f85145d.f84830f) != null && list.size() > 1) {
                String str2 = null;
                if (1 != 0) {
                    OrderSubmitViewModel m2 = this.f85144c.m();
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f fVar = this.f85145d;
                    Context context = this.f85143b.getContext();
                    l.b(context, "");
                    l.d(fVar, "");
                    l.d(list, "");
                    l.d(context, "");
                    m2.k();
                    bz unused = kotlinx.coroutines.i.a(bs.f159054a, o.f159148a, null, new OrderSubmitViewModel.v(m2, context, list, fVar, null), 2);
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("logistics", (Boolean) null, 6);
                    HashMap<String, Object> j2 = this.f85144c.m().j();
                    LogisticDTO logisticDTO = this.f85145d.f84831g;
                    if (logisticDTO == null || (price2 = logisticDTO.f85894f) == null || (priceVal = price2.getPriceVal()) == null) {
                        f2 = null;
                    } else {
                        f2 = p.c(priceVal);
                    }
                    LogisticDTO logisticDTO2 = this.f85145d.f84831g;
                    if (logisticDTO2 == null || (price = logisticDTO2.f85894f) == null) {
                        str = null;
                    } else {
                        str = price.getCurrency();
                    }
                    LogisticDTO logisticDTO3 = this.f85145d.f84831g;
                    if (!(logisticDTO3 == null || (logisticTextDTO = logisticDTO3.f85898j) == null)) {
                        str2 = logisticTextDTO.f85905f;
                    }
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("logistics", j2, null, f2, str, str2, null, null, null, null, 964);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(View view, ProductInfoVH productInfoVH, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f fVar) {
            super(700);
            this.f85143b = view;
            this.f85144c = productInfoVH;
            this.f85145d = fVar;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<OrderSubmitState, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f $item$inlined;
        final /* synthetic */ View $this_apply;
        final /* synthetic */ ProductInfoVH this$0;

        static {
            Covode.recordClassIndex(53215);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(View view, ProductInfoVH productInfoVH, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f fVar) {
            super(1);
            this.$this_apply = view;
            this.this$0 = productInfoVH;
            this.$item$inlined = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(OrderSubmitState orderSubmitState) {
            String str;
            String str2;
            l.d(orderSubmitState, "");
            if (this.$item$inlined.f84832h && this.this$0.m().f84728a != 0) {
                ShopBill shopBill = this.$item$inlined.f84836l;
                if (shopBill != null) {
                    str = shopBill.getProductTotal();
                } else {
                    str = null;
                }
                if (hk.a(str)) {
                    RelativeLayout relativeLayout = (RelativeLayout) this.$this_apply.findViewById(R.id.e32);
                    l.b(relativeLayout, "");
                    relativeLayout.setVisibility(0);
                    ShopBill shopBill2 = this.$item$inlined.f84836l;
                    if (shopBill2 == null || (str2 = shopBill2.getProductTotal()) == null) {
                        str2 = "";
                    }
                    Context context = this.$this_apply.getContext();
                    l.b(context, "");
                    SpannableString spannableString = new SpannableString(context.getResources().getQuantityString(R.plurals.bz, this.$item$inlined.f84829e.size(), String.valueOf(this.$item$inlined.f84829e.size()), str2));
                    int a2 = p.a((CharSequence) spannableString, str2, 0, false, 6);
                    if (a2 != -1) {
                        spannableString.setSpan(new com.bytedance.tux.f.a.b(42, true), a2, str2.length() + a2, 33);
                    }
                    TuxTextView tuxTextView = (TuxTextView) this.$this_apply.findViewById(R.id.ees);
                    l.b(tuxTextView, "");
                    tuxTextView.setText(spannableString);
                    return z.f158842a;
                }
            }
            RelativeLayout relativeLayout2 = (RelativeLayout) this.$this_apply.findViewById(R.id.e32);
            l.b(relativeLayout2, "");
            relativeLayout2.setVisibility(8);
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f fVar) {
        String str;
        int i2;
        String str2;
        boolean z;
        String str3;
        String str4;
        LogisticTextDTO logisticTextDTO;
        com.bytedance.lighten.a.a.a thumbFirstImageUrlModel;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f fVar2 = fVar;
        l.d(fVar2, "");
        View view = this.f85121f;
        Image image = fVar2.f84827c;
        if (!(image == null || (thumbFirstImageUrlModel = image.toThumbFirstImageUrlModel()) == null)) {
            v a2 = r.a(thumbFirstImageUrlModel);
            a2.E = (SmartImageView) view.findViewById(R.id.e31);
            a2.c();
        }
        c cVar = this.f85125m;
        l.d(fVar2, "");
        cVar.f85126a = fVar2;
        cVar.f85127b.clear();
        cVar.f85127b.addAll(fVar2.f84829e);
        cVar.notifyDataSetChanged();
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.e34);
        l.b(tuxTextView, "");
        tuxTextView.setText(fVar2.f84828d);
        if (fVar2.f84834j) {
            String str5 = null;
            if (!this.f85124l) {
                this.f85124l = true;
                HashMap<String, Object> j2 = m().j();
                LogisticDTO logisticDTO = fVar2.f84831g;
                if (logisticDTO == null || (logisticTextDTO = logisticDTO.f85898j) == null) {
                    str4 = null;
                } else {
                    str4 = logisticTextDTO.f85905f;
                }
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("logistics", j2, (String) null, str4, (String) null, (Boolean) null, (Boolean) null, (String) null, 988);
            }
            OrderSubmitInfoView orderSubmitInfoView = (OrderSubmitInfoView) view.findViewById(R.id.e2z);
            l.b(orderSubmitInfoView, "");
            orderSubmitInfoView.setVisibility(0);
            OrderSubmitInfoView orderSubmitInfoView2 = (OrderSubmitInfoView) view.findViewById(R.id.e2z);
            LogisticDTO logisticDTO2 = fVar2.f84831g;
            if (logisticDTO2 == null || (str = logisticDTO2.f85890b) == null) {
                str = view.getResources().getString(R.string.bfz);
                l.b(str, "");
            }
            orderSubmitInfoView2.setTitleText(str);
            LogisticDTO logisticDTO3 = fVar2.f84831g;
            if (logisticDTO3 != null) {
                if (l.a((Object) logisticDTO3.f85896h, (Object) true)) {
                    i2 = R.color.bh;
                } else {
                    i2 = R.color.c5;
                }
                OrderSubmitInfoView orderSubmitInfoView3 = (OrderSubmitInfoView) view.findViewById(R.id.e2z);
                Price price = logisticDTO3.f85894f;
                if (price == null || (str2 = price.getPriceStr()) == null) {
                    str2 = "";
                }
                orderSubmitInfoView3.setDescText(str2);
                if (l.a((Object) logisticDTO3.f85896h, (Object) true)) {
                    Integer valueOf = Integer.valueOf((int) R.raw.icon_truck_moving_ltr);
                    View view2 = this.itemView;
                    l.b(view2, "");
                    ((OrderSubmitInfoView) view.findViewById(R.id.e2z)).a(valueOf, androidx.core.content.b.c(view2.getContext(), R.color.bh));
                } else {
                    ((OrderSubmitInfoView) view.findViewById(R.id.e2z)).a(null, -16777216);
                }
                View view3 = this.itemView;
                l.b(view3, "");
                ((OrderSubmitInfoView) view.findViewById(R.id.e2z)).setDescColor(androidx.core.content.b.c(view3.getContext(), i2));
                LogisticTextDTO logisticTextDTO2 = logisticDTO3.f85898j;
                if (!(logisticTextDTO2 == null || (str3 = logisticTextDTO2.f85902c) == null)) {
                    ((OrderSubmitInfoView) view.findViewById(R.id.e2z)).setSubDescText(str3);
                }
                OrderSubmitInfoView orderSubmitInfoView4 = (OrderSubmitInfoView) view.findViewById(R.id.e2z);
                LogisticTextDTO logisticTextDTO3 = logisticDTO3.f85898j;
                if (logisticTextDTO3 != null) {
                    str5 = logisticTextDTO3.f85904e;
                }
                orderSubmitInfoView4.setSubDescExtraText(str5);
                OrderSubmitInfoView orderSubmitInfoView5 = (OrderSubmitInfoView) view.findViewById(R.id.e2z);
                List<LogisticDTO> list = fVar2.f84830f;
                if (list == null || list.size() <= 1) {
                    z = false;
                } else {
                    z = true;
                }
                orderSubmitInfoView5.a(z);
            }
        } else {
            OrderSubmitInfoView orderSubmitInfoView6 = (OrderSubmitInfoView) view.findViewById(R.id.e2z);
            l.b(orderSubmitInfoView6, "");
            orderSubmitInfoView6.setVisibility(8);
        }
        String string = view.getResources().getString(R.string.fxg);
        l.b(string, "");
        ((OrderSubmitInfoView) view.findViewById(R.id.clf)).setTitleText(string);
        View view4 = this.f85121f;
        if (fVar2.f84832h) {
            OrderSubmitInfoView orderSubmitInfoView7 = (OrderSubmitInfoView) view4.findViewById(R.id.clf);
            l.b(orderSubmitInfoView7, "");
            orderSubmitInfoView7.setVisibility(0);
            TuxTextView tuxTextView2 = (TuxTextView) view4.findViewById(R.id.fc5);
            l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(8);
            if (!this.f85123k) {
                this.f85123k = true;
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("message", m().j(), (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (String) null, 1020);
            }
        } else {
            if (fVar2.f84833i != null) {
                TuxTextView tuxTextView3 = (TuxTextView) view4.findViewById(R.id.fc5);
                l.b(tuxTextView3, "");
                tuxTextView3.setVisibility(0);
                TuxTextView tuxTextView4 = (TuxTextView) view4.findViewById(R.id.fc5);
                l.b(tuxTextView4, "");
                tuxTextView4.setText(fVar2.f84833i);
            }
            OrderSubmitInfoView orderSubmitInfoView8 = (OrderSubmitInfoView) view4.findViewById(R.id.e2z);
            l.b(orderSubmitInfoView8, "");
            orderSubmitInfoView8.setVisibility(8);
            OrderSubmitInfoView orderSubmitInfoView9 = (OrderSubmitInfoView) view4.findViewById(R.id.clf);
            l.b(orderSubmitInfoView9, "");
            orderSubmitInfoView9.setVisibility(8);
        }
        OrderSubmitInfoView orderSubmitInfoView10 = (OrderSubmitInfoView) view.findViewById(R.id.e2z);
        l.b(orderSubmitInfoView10, "");
        orderSubmitInfoView10.setOnClickListener(new d(view, this, fVar2));
        OrderSubmitInfoView orderSubmitInfoView11 = (OrderSubmitInfoView) view.findViewById(R.id.clf);
        l.b(orderSubmitInfoView11, "");
        orderSubmitInfoView11.setOnClickListener(new e(view, this, fVar2));
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.aml);
        l.b(relativeLayout, "");
        relativeLayout.setVisibility(8);
        OrderSubmitInfoView orderSubmitInfoView12 = (OrderSubmitInfoView) view.findViewById(R.id.e2z);
        l.b(orderSubmitInfoView12, "");
        if (orderSubmitInfoView12.getVisibility() != 0) {
            RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(R.id.aml);
            l.b(relativeLayout2, "");
            if (relativeLayout2.getVisibility() != 0) {
                OrderSubmitInfoView orderSubmitInfoView13 = (OrderSubmitInfoView) view.findViewById(R.id.clf);
                l.b(orderSubmitInfoView13, "");
                if (orderSubmitInfoView13.getVisibility() != 0) {
                    Space space = (Space) view.findViewById(R.id.e7r);
                    l.b(space, "");
                    space.setVisibility(8);
                    withState(m(), new f(view, this, fVar2));
                }
            }
        }
        Space space2 = (Space) view.findViewById(R.id.e7r);
        l.b(space2, "");
        space2.setVisibility(0);
        withState(m(), new f(view, this, fVar2));
    }

    static final class g extends h.f.b.m implements h.f.a.m<JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f>, String, z> {
        final /* synthetic */ View $this_apply;

        static {
            Covode.recordClassIndex(53216);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(View view) {
            super(2);
            this.$this_apply = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f> jediSimpleViewHolder, String str) {
            String str2 = str;
            l.d(jediSimpleViewHolder, "");
            l.d(str2, "");
            OrderSubmitInfoView orderSubmitInfoView = (OrderSubmitInfoView) this.$this_apply.findViewById(R.id.clf);
            if (str2.length() == 0) {
                str2 = this.$this_apply.getContext().getString(R.string.fxh);
            }
            l.b(str2, "");
            orderSubmitInfoView.setDescText(str2);
            return z.f158842a;
        }
    }
}
