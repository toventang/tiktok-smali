package com.ss.android.ugc.aweme.ecommerce.delivery.a;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.delivery.a;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.pdp.b.k;
import com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public final class b extends g implements q {

    /* renamed from: a  reason: collision with root package name */
    public boolean f85813a;

    /* renamed from: b  reason: collision with root package name */
    public long f85814b = SystemClock.elapsedRealtime();

    static {
        Covode.recordClassIndex(53676);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.bytedance.jedi.arch.v
    public final m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.delivery.a.g
    public final void b() {
        withState(this.f85824d, new j(this, ActivityStack.isAppBackGround()));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.delivery.a.g
    public final void d() {
        withState(this.f85824d, new k(this));
    }

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.i getLifecycle() {
        androidx.lifecycle.i lifecycle = this.f85823c.getLifecycle();
        l.b(lifecycle, "");
        return lifecycle;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.a.b$b  reason: collision with other inner class name */
    static final class C2059b extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53679);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2059b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f85824d.f85935b.invoke();
            com.ss.android.ugc.aweme.ecommerce.delivery.a.a("close", "close", null, null, null);
            return z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53680);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f85824d.a(com.ss.android.ugc.aweme.ecommerce.delivery.vm.a.POP);
            this.this$0.f85824d.a(AnonymousClass1.f85816a);
            com.ss.android.ugc.aweme.ecommerce.delivery.a.a("close", "return", null, null, null);
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e $areaSelectFragment;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53682);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e eVar) {
            super(0);
            this.this$0 = bVar;
            this.$areaSelectFragment = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean b2 = this.$areaSelectFragment.b();
            if (!b2) {
                this.this$0.f85824d.a(AnonymousClass1.f85817a);
            }
            return Boolean.valueOf(b2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.delivery.a.g
    public final void e() {
        com.ss.android.ugc.aweme.ecommerce.pdp.b.k a2;
        if ((this.f85824d.f85934a instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) && (a2 = k.a.a(this.f85823c.getContext())) != null) {
            a2.b("glide_close", (Boolean) null);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53688);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.aweme.ecommerce.pdp.b.k a2;
            if ((this.this$0.f85824d.f85934a instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) && (a2 = k.a.a(this.this$0.f85823c.getContext())) != null) {
                a2.b("quit", (Boolean) null);
            }
            this.this$0.f85823c.dismiss();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.delivery.a.g
    public final void c() {
        this.f85823c.getChildFragmentManager().a().a(R.id.ak4, new com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b()).c();
        f.a.b.b unused = selectSubscribe(this.f85824d, d.f85820a, new ah(), new e(this));
        f.a.b.b unused2 = selectSubscribe(this.f85824d, e.f85821a, new ah(), new f(this));
        f.a.b.b unused3 = selectSubscribe(this.f85824d, f.f85822a, new ah(), new g(this));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.delivery.a.g
    public final void a() {
        DeliveryPanelStarter.EnterParam enterParam;
        Object obj;
        DeliveryPanelViewModel deliveryPanelViewModel = this.f85824d;
        h hVar = new h(this);
        l.d(hVar, "");
        deliveryPanelViewModel.f85935b = hVar;
        Bundle arguments = this.f85823c.getArguments();
        if (arguments != null && (enterParam = (DeliveryPanelStarter.EnterParam) arguments.getParcelable("enter_param")) != null) {
            if (enterParam.f85794g == null) {
                this.f85824d.f85934a = new DeliveryPanelStarter.EnterParamForProductDetailPage(enterParam.f85788a, enterParam.f85789b, enterParam.f85790c, enterParam.f85791d, enterParam.f85792e, enterParam.f85793f, enterParam.f85795h);
            } else {
                this.f85824d.f85934a = new DeliveryPanelStarter.EnterParamForOrderSubmitPage(enterParam.f85794g, enterParam.f85788a, enterParam.f85795h);
            }
            try {
                obj = com.ss.android.ugc.aweme.ecommerce.router.j.a().a(enterParam.f85795h, HashMap.class);
            } catch (Exception unused) {
                obj = null;
            }
            HashMap hashMap = (HashMap) obj;
            com.ss.android.ugc.aweme.ecommerce.delivery.a.f85809a.clear();
            com.ss.android.ugc.aweme.ecommerce.delivery.a.f85810b = -1;
            com.ss.android.ugc.aweme.ecommerce.delivery.a.f85810b = System.currentTimeMillis();
            LinkedHashMap<String, Object> linkedHashMap = com.ss.android.ugc.aweme.ecommerce.delivery.a.f85809a;
            if (hashMap != null) {
                linkedHashMap.putAll(hashMap);
            }
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            linkedHashMap.put("page_name", "logistics");
            linkedHashMap.put("is_fullscreen", 0);
            linkedHashMap.remove("shipping_price");
            linkedHashMap.remove("shipping_currency");
            linkedHashMap.remove("free_shipping_condition");
        }
    }

    public static final class i implements DialogInterface.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f85818a;

        static {
            Covode.recordClassIndex(53689);
        }

        i(b bVar) {
            this.f85818a = bVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
            if (i2 != 4 || keyEvent == null || keyEvent.getAction() != 1) {
                return false;
            }
            boolean booleanValue = this.f85818a.f85824d.f85936c.invoke().booleanValue();
            if (!booleanValue) {
                androidx.fragment.app.i childFragmentManager = this.f85818a.f85823c.getChildFragmentManager();
                l.b(childFragmentManager, "");
                if (childFragmentManager.f().size() > 1) {
                    this.f85818a.f85824d.a(com.ss.android.ugc.aweme.ecommerce.delivery.vm.a.POP);
                    return true;
                }
            }
            return booleanValue;
        }
    }

    static final class a extends h.f.b.m implements h.f.a.b<List<? extends Region>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53677);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends Region> list) {
            l.d(list, "");
            this.this$0.f85824d.a(this.this$0.f85823c.getContext(), list);
            this.this$0.f85824d.a(AnonymousClass1.f85815a);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.delivery.a.g
    public final void a(Dialog dialog) {
        l.d(dialog, "");
        dialog.setOnKeyListener(new i(this));
    }

    static final class k extends h.f.b.m implements h.f.a.b<DeliveryPanelState, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53691);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(DeliveryPanelState deliveryPanelState) {
            DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
            l.d(deliveryPanelState2, "");
            DeliveryPanelStarter.PackedDeliverySelectResult a2 = this.this$0.a(deliveryPanelState2);
            String b2 = com.ss.android.ugc.aweme.account.util.i.a().b(a2);
            if (b2 != null) {
                EventCenter.a().a("ec_delivery_panel_close", b2);
            }
            DeliveryPanelStarter.a(a2);
            return z.f158842a;
        }
    }

    public final void a(Fragment fragment) {
        n a2 = this.f85823c.getChildFragmentManager().a();
        l.b(a2, "");
        n a3 = a2.a(R.anim.aq, R.anim.ar, R.anim.aq, R.anim.ar);
        l.b(a3, "");
        a3.a(R.id.ak4, fragment).a((String) null).c();
    }

    public final DeliveryPanelStarter.PackedDeliverySelectResult a(DeliveryPanelState deliveryPanelState) {
        Address address;
        String str;
        Address address2;
        if (!deliveryPanelState.getApply()) {
            return new DeliveryPanelStarter.PackedDeliverySelectResult();
        }
        Parcelable parcelable = this.f85824d.f85934a;
        String str2 = null;
        if (parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) {
            com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d a2 = deliveryPanelState.getSelectedShipToInfo().a();
            if (a2 == null || (address2 = a2.f85925b) == null) {
                str = null;
            } else {
                str = address2.f84298a;
            }
            DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage = (DeliveryPanelStarter.EnterParamForProductDetailPage) parcelable;
            boolean z = true;
            if (!(!l.a((Object) str, (Object) enterParamForProductDetailPage.f85800b)) && !(!l.a(deliveryPanelState.getSelectedShipToInfo().b(), enterParamForProductDetailPage.f85801c))) {
                z = false;
            }
            com.ss.android.ugc.aweme.ecommerce.pdp.b.k a3 = k.a.a(this.f85823c.getContext());
            if (a3 != null) {
                a3.b("continue", Boolean.valueOf(z));
            }
        }
        LogisticDTO selectedLogistic = deliveryPanelState.getSelectedLogistic();
        com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d a4 = deliveryPanelState.getSelectedShipToInfo().a();
        if (!(a4 == null || (address = a4.f85925b) == null)) {
            str2 = address.f84298a;
        }
        return new DeliveryPanelStarter.PackedDeliverySelectResult(selectedLogistic, str2, deliveryPanelState.getSelectedShipToInfo().b());
    }

    static final class j extends h.f.b.m implements h.f.a.b<DeliveryPanelState, z> {
        final /* synthetic */ boolean $isBackGround;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53690);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar, boolean z) {
            super(1);
            this.this$0 = bVar;
            this.$isBackGround = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(DeliveryPanelState deliveryPanelState) {
            boolean z;
            String str;
            boolean z2;
            Integer num;
            Float f2;
            String str2;
            LogisticTextDTO logisticTextDTO;
            Price price;
            Price price2;
            String priceVal;
            DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
            l.d(deliveryPanelState2, "");
            com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.a aVar = this.this$0.f85824d.f85937d;
            if (aVar == null || !(!aVar.f85916b.isEmpty())) {
                z = false;
            } else {
                z = true;
            }
            if (deliveryPanelState2.getApply()) {
                str = "next";
            } else if (this.$isBackGround) {
                str = "close";
            } else {
                str = "return";
            }
            if (!z || deliveryPanelState2.getSelectedShipToInfo().a() == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            DeliveryPanelStarter.PackedDeliverySelectResult a2 = this.this$0.a(deliveryPanelState2);
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.this$0.f85814b;
            boolean z3 = this.this$0.f85813a;
            LogisticDTO selectedLogistic = deliveryPanelState2.getSelectedLogistic();
            String str3 = null;
            if (selectedLogistic != null) {
                num = Integer.valueOf(selectedLogistic.f85889a);
            } else {
                num = null;
            }
            LogisticDTO selectedLogistic2 = deliveryPanelState2.getSelectedLogistic();
            if (selectedLogistic2 == null || (price2 = selectedLogistic2.f85894f) == null || (priceVal = price2.getPriceVal()) == null) {
                f2 = null;
            } else {
                f2 = p.c(priceVal);
            }
            LogisticDTO selectedLogistic3 = deliveryPanelState2.getSelectedLogistic();
            if (selectedLogistic3 == null || (price = selectedLogistic3.f85894f) == null) {
                str2 = null;
            } else {
                str2 = price.getCurrency();
            }
            LogisticDTO selectedLogistic4 = deliveryPanelState2.getSelectedLogistic();
            if (!(selectedLogistic4 == null || (logisticTextDTO = selectedLogistic4.f85898j) == null)) {
                str3 = logisticTextDTO.f85905f;
            }
            l.d(a2, "");
            l.d(str, "");
            com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_stay_page", new a.d(elapsedRealtime, z, str, z2, z3, a2, num, f2, str2, str3));
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.delivery.a.g
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.oi, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53684);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l.d(iVar, "");
            if (booleanValue) {
                this.this$0.f85823c.dismiss();
            }
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(com.ss.android.ugc.aweme.ecommerce.common.a.a aVar, DeliveryPanelViewModel deliveryPanelViewModel) {
        super(aVar, deliveryPanelViewModel);
        l.d(aVar, "");
        l.d(deliveryPanelViewModel, "");
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53686);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            int intValue = num.intValue();
            l.d(iVar2, "");
            if (intValue == -1 && !this.this$0.f85813a) {
                iVar2.withState(this.this$0.f85824d, new h.f.a.b<DeliveryPanelState, z>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.delivery.a.b.g.AnonymousClass1 */
                    final /* synthetic */ g this$0;

                    static {
                        Covode.recordClassIndex(53687);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(DeliveryPanelState deliveryPanelState) {
                        List<LogisticDTO> list;
                        boolean z;
                        DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
                        l.d(deliveryPanelState2, "");
                        this.this$0.this$0.f85813a = true;
                        com.ss.android.ugc.aweme.ecommerce.pdp.b.k a2 = k.a.a(this.this$0.this$0.f85823c.getContext());
                        if (a2 != null) {
                            if (deliveryPanelState2.getSelectedShipToInfo().f85830a != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            a2.a("logistics", Boolean.valueOf(z));
                        }
                        boolean z2 = !deliveryPanelState2.getAddressRenderData().isEmpty();
                        com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.a aVar = this.this$0.this$0.f85824d.f85937d;
                        if (!(aVar == null || (list = aVar.f85915a) == null)) {
                            ArrayList arrayList = new ArrayList();
                            for (T t : list) {
                                if (l.a((Object) t.f85891c, (Object) true)) {
                                    arrayList.add(t);
                                }
                            }
                            LogisticDTO logisticDTO = (LogisticDTO) h.a.n.h((List) arrayList);
                            if (logisticDTO != null) {
                                Integer.valueOf(logisticDTO.f85889a);
                            }
                        }
                        com.ss.android.ugc.aweme.ecommerce.delivery.a.a(deliveryPanelState2, z2);
                        return z.f158842a;
                    }
                });
            }
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.ecommerce.delivery.vm.b, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53685);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.ecommerce.delivery.vm.b bVar) {
            com.ss.android.ugc.aweme.ecommerce.delivery.vm.b bVar2 = bVar;
            l.d(iVar, "");
            l.d(bVar2, "");
            int i2 = c.f85819a[bVar2.f85945a.ordinal()];
            if (i2 == 1) {
                this.this$0.a(new com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b());
            } else if (i2 == 2) {
                Parcelable parcelable = this.this$0.f85824d.f85934a;
                if (!(parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage)) {
                    parcelable = null;
                }
                DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage = (DeliveryPanelStarter.EnterParamForProductDetailPage) parcelable;
                if (enterParamForProductDetailPage != null) {
                    b bVar3 = this.this$0;
                    com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e a2 = e.d.a(null, new OrderSKUDTO(enterParamForProductDetailPage.f85802d, enterParamForProductDetailPage.f85803e, Integer.valueOf(enterParamForProductDetailPage.f85804f), null, 0, null, null, null, null, 488), 0, false, null, 29);
                    com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e.a(a2, new c(bVar3), new C2059b(bVar3), new a(bVar3), null, 8);
                    bVar3.f85824d.a(new d(bVar3, a2));
                    bVar3.a(a2);
                }
            } else if (i2 == 3) {
                this.this$0.f85823c.getChildFragmentManager().c();
            } else if (i2 == 4) {
                androidx.fragment.app.i childFragmentManager = this.this$0.f85823c.getChildFragmentManager();
                l.b(childFragmentManager, "");
                for (int size = childFragmentManager.f().size(); size >= 2; size--) {
                    this.this$0.f85823c.getChildFragmentManager().c();
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(ahVar, "");
        l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
