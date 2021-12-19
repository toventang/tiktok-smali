package com.ss.android.ugc.aweme.ecommerce.sku.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.widget.Widget;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bo;
import com.ss.android.ugc.aweme.ecommerce.cart.repository.a;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.x;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class SkuPanelBottomWidget extends SkuPanelBaseWidget implements au {

    /* renamed from: h  reason: collision with root package name */
    TuxButton f87420h;

    /* renamed from: i  reason: collision with root package name */
    public TuxButton f87421i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f87422j;

    /* renamed from: k  reason: collision with root package name */
    public int f87423k;

    /* renamed from: l  reason: collision with root package name */
    private final int f87424l = R.layout.qw;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f87425m;

    static {
        Covode.recordClassIndex(54915);
    }

    public final SkuPanelViewModel o() {
        return (SkuPanelViewModel) this.f87425m.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.k, com.ss.android.ugc.aweme.base.arch.JediBaseWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.widget.Widget
    public final int b() {
        return this.f87424l;
    }

    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SkuPanelBottomWidget f87429a;

        static {
            Covode.recordClassIndex(54923);
        }

        h(SkuPanelBottomWidget skuPanelBottomWidget) {
            this.f87429a = skuPanelBottomWidget;
        }

        public final void run() {
            this.f87429a.f87422j = true;
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<SkuPanelViewModel> {
        final /* synthetic */ Widget $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(54916);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Widget widget, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = widget;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBottomWidget.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_sku_view_SkuPanelBottomWidget$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ SkuPanelBottomWidget this$0;

        static {
            Covode.recordClassIndex(54919);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SkuPanelBottomWidget skuPanelBottomWidget) {
            super(0);
            this.this$0 = skuPanelBottomWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Context context;
            boolean z;
            Boolean pdpFullScreen;
            List<SkuItem> list;
            SkuPanelViewModel o = this.this$0.o();
            View view = this.this$0.f46127e;
            String str = null;
            if (view != null) {
                context = view.getContext();
            } else {
                context = null;
            }
            SkuPanelState skuPanelState = o.f87502c;
            if (skuPanelState != null) {
                skuPanelState.setJumpOSP(true);
            }
            SkuPanelState skuPanelState2 = o.f87502c;
            if (skuPanelState2 != null) {
                skuPanelState2.setCloseFrom(1);
            }
            SkuPanelState skuPanelState3 = o.f87502c;
            if (skuPanelState3 != null) {
                SkuPanelState skuPanelState4 = o.f87502c;
                if (skuPanelState4 != null) {
                    SkuInfo skuInfo = o.f87503d;
                    if (skuInfo != null) {
                        list = skuInfo.f87415a;
                    } else {
                        list = null;
                    }
                    SkuItem fullSkuItem = skuPanelState4.getFullSkuItem(list);
                    if (fullSkuItem != null) {
                        str = fullSkuItem.getSkuId();
                    }
                }
                skuPanelState3.setSkuId(str);
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams = o.f87504e;
            if (!(skuEnterParams == null || !skuEnterParams.getNeedRequest() || context == null)) {
                SkuPanelState skuPanelState5 = o.f87502c;
                if (skuPanelState5 != null) {
                    skuPanelState5.setJumpOSP(false);
                }
                ProductPackStruct productPackStruct = o.f87505f;
                SkuPanelState skuPanelState6 = o.f87502c;
                IPdpStarter.PdpEnterParam a2 = SkuPanelStarter.a(o.f87504e);
                SkuPanelStarter.SkuEnterParams skuEnterParams2 = o.f87504e;
                if (skuEnterParams2 == null || (pdpFullScreen = skuEnterParams2.getPdpFullScreen()) == null) {
                    z = false;
                } else {
                    z = pdpFullScreen.booleanValue();
                }
                x.a(context, productPackStruct, null, skuPanelState6, a2, z, null);
            }
            o.c(SkuPanelViewModel.f.f87514a);
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ SkuPanelBottomWidget this$0;

        static {
            Covode.recordClassIndex(54920);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(SkuPanelBottomWidget skuPanelBottomWidget) {
            super(0);
            this.this$0 = skuPanelBottomWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Integer num;
            String str;
            Integer num2;
            String str2;
            List<SkuItem> list;
            SkuPanelViewModel o = this.this$0.o();
            SkuPanelState skuPanelState = o.f87502c;
            if (skuPanelState != null) {
                skuPanelState.setJumpOSP(false);
            }
            SkuPanelState skuPanelState2 = o.f87502c;
            if (skuPanelState2 != null) {
                skuPanelState2.setCloseFrom(3);
            }
            SkuPanelState skuPanelState3 = o.f87502c;
            String str3 = null;
            if (skuPanelState3 != null) {
                SkuPanelState skuPanelState4 = o.f87502c;
                if (skuPanelState4 != null) {
                    SkuInfo skuInfo = o.f87503d;
                    if (skuInfo != null) {
                        list = skuInfo.f87415a;
                    } else {
                        list = null;
                    }
                    SkuItem fullSkuItem = skuPanelState4.getFullSkuItem(list);
                    if (fullSkuItem != null) {
                        str2 = fullSkuItem.getSkuId();
                        skuPanelState3.setSkuId(str2);
                    }
                }
                str2 = null;
                skuPanelState3.setSkuId(str2);
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams = o.f87504e;
            if (skuEnterParams != null) {
                num = Integer.valueOf(skuEnterParams.getClickFrom());
            } else {
                num = null;
            }
            String a2 = com.ss.android.ugc.aweme.ecommerce.sku.model.a.a(num);
            SkuPanelState skuPanelState5 = o.f87502c;
            if (skuPanelState5 != null) {
                str = skuPanelState5.getSkuId();
            } else {
                str = null;
            }
            Integer valueOf = Integer.valueOf(l.a(o.f87507k, true) ? 1 : 0);
            SkuPanelStarter.SkuEnterParams skuEnterParams2 = o.f87504e;
            if (skuEnterParams2 != null) {
                num2 = Integer.valueOf(skuEnterParams2.getClickFrom());
            } else {
                num2 = null;
            }
            String a3 = com.ss.android.ugc.aweme.ecommerce.cart.a.a(num2);
            SkuPanelStarter.SkuEnterParams skuEnterParams3 = o.f87504e;
            if (skuEnterParams3 != null) {
                str3 = skuEnterParams3.getEnterFrom();
            }
            com.ss.android.ugc.aweme.ecommerce.sku.a.a.a(a2, str, valueOf, a3, "sku", str3, null);
            o.c(SkuPanelViewModel.g.f87515a);
            return z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ SkuPanelBottomWidget this$0;

        static {
            Covode.recordClassIndex(54918);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SkuPanelBottomWidget skuPanelBottomWidget) {
            super(0);
            this.this$0 = skuPanelBottomWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            SkuItem skuItem;
            Integer num;
            String str;
            Integer num2;
            String str2;
            Object obj;
            String str3;
            String str4;
            String str5;
            Integer num3;
            Object obj2;
            HashMap<String, Object> hashMap;
            HashMap<String, Object> hashMap2;
            Object obj3;
            View view;
            androidx.fragment.app.e activity;
            Window window;
            HashMap<String, Object> trackParams;
            HashMap<String, Object> visitReportParams;
            HashMap<String, Object> visitReportParams2;
            String str6;
            String str7;
            List<SkuItem> list;
            SkuPanelViewModel o = this.this$0.o();
            View view2 = this.this$0.f46127e;
            SkuPanelState skuPanelState = o.f87502c;
            if (skuPanelState != null) {
                skuPanelState.setJumpOSP(false);
            }
            SkuPanelState skuPanelState2 = o.f87502c;
            if (skuPanelState2 != null) {
                skuPanelState2.setCloseFrom(2);
            }
            SkuPanelState skuPanelState3 = o.f87502c;
            String str8 = null;
            if (skuPanelState3 != null) {
                SkuInfo skuInfo = o.f87503d;
                if (skuInfo != null) {
                    list = skuInfo.f87415a;
                } else {
                    list = null;
                }
                skuItem = skuPanelState3.getFullSkuItem(list);
            } else {
                skuItem = null;
            }
            SkuPanelState skuPanelState4 = o.f87502c;
            if (skuPanelState4 != null) {
                if (skuItem != null) {
                    str7 = skuItem.getSkuId();
                } else {
                    str7 = null;
                }
                skuPanelState4.setSkuId(str7);
            }
            SkuPanelState skuPanelState5 = o.f87502c;
            if (skuPanelState5 != null) {
                if (skuItem != null) {
                    str6 = skuItem.getWarehouseId();
                } else {
                    str6 = null;
                }
                skuPanelState5.setWarehouseId(str6);
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams = o.f87504e;
            if (skuEnterParams != null) {
                num = Integer.valueOf(skuEnterParams.getClickFrom());
            } else {
                num = null;
            }
            String a2 = com.ss.android.ugc.aweme.ecommerce.sku.model.a.a(num);
            SkuPanelState skuPanelState6 = o.f87502c;
            if (skuPanelState6 != null) {
                str = skuPanelState6.getSkuId();
            } else {
                str = null;
            }
            Integer valueOf = Integer.valueOf(l.a(o.f87507k, true) ? 1 : 0);
            SkuPanelStarter.SkuEnterParams skuEnterParams2 = o.f87504e;
            if (skuEnterParams2 != null) {
                num2 = Integer.valueOf(skuEnterParams2.getClickFrom());
            } else {
                num2 = null;
            }
            String a3 = com.ss.android.ugc.aweme.ecommerce.cart.a.a(num2);
            SkuPanelStarter.SkuEnterParams skuEnterParams3 = o.f87504e;
            if (skuEnterParams3 != null) {
                str2 = skuEnterParams3.getEnterFrom();
            } else {
                str2 = null;
            }
            com.ss.android.ugc.aweme.ecommerce.sku.a.a.a(a2, str, valueOf, a3, "sku", str2, null);
            com.ss.android.ugc.aweme.ecommerce.cart.repository.a aVar = com.ss.android.ugc.aweme.ecommerce.cart.repository.a.f84677c;
            SkuPanelStarter.SkuEnterParams skuEnterParams4 = o.f87504e;
            if (skuEnterParams4 == null || (visitReportParams2 = skuEnterParams4.getVisitReportParams()) == null) {
                obj = null;
            } else {
                obj = visitReportParams2.get("seller_id");
            }
            String str9 = (String) obj;
            if (str9 == null) {
                str9 = o.f87508l;
            }
            SkuPanelState skuPanelState7 = o.f87502c;
            if (skuPanelState7 != null) {
                str3 = skuPanelState7.getWarehouseId();
            } else {
                str3 = null;
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams5 = o.f87504e;
            if (skuEnterParams5 != null) {
                str4 = skuEnterParams5.getProductId();
            } else {
                str4 = null;
            }
            SkuPanelState skuPanelState8 = o.f87502c;
            if (skuPanelState8 != null) {
                str5 = skuPanelState8.getSkuId();
            } else {
                str5 = null;
            }
            SkuPanelState skuPanelState9 = o.f87502c;
            if (skuPanelState9 != null) {
                num3 = skuPanelState9.getProductQuantity();
            } else {
                num3 = null;
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams6 = o.f87504e;
            if (skuEnterParams6 == null || (visitReportParams = skuEnterParams6.getVisitReportParams()) == null) {
                obj2 = null;
            } else {
                obj2 = visitReportParams.get("chain_key");
            }
            String str10 = (String) obj2;
            SkuPanelStarter.SkuEnterParams skuEnterParams7 = o.f87504e;
            if (skuEnterParams7 != null) {
                hashMap = skuEnterParams7.getTrackParams();
            } else {
                hashMap = null;
            }
            String a4 = a.C2025a.a(hashMap);
            SkuPanelStarter.SkuEnterParams skuEnterParams8 = o.f87504e;
            if (skuEnterParams8 != null) {
                hashMap2 = skuEnterParams8.getTrackParams();
            } else {
                hashMap2 = null;
            }
            Integer valueOf2 = Integer.valueOf(IPdpStarter.a.a(hashMap2));
            SkuPanelStarter.SkuEnterParams skuEnterParams9 = o.f87504e;
            if (skuEnterParams9 == null || (trackParams = skuEnterParams9.getTrackParams()) == null) {
                obj3 = null;
            } else {
                obj3 = trackParams.get("author_id");
            }
            com.ss.android.ugc.aweme.ecommerce.cart.repository.a.b bVar = new com.ss.android.ugc.aweme.ecommerce.cart.repository.a.b(str9, str3, str4, str5, num3, str10, a4, valueOf2, (String) obj3);
            com.ss.android.ugc.aweme.ecommerce.sku.d dVar = o.f87506g;
            if (dVar == null || (activity = dVar.getActivity()) == null || (window = activity.getWindow()) == null || (view = window.getDecorView()) == null) {
                view = view2;
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams10 = o.f87504e;
            if (skuEnterParams10 != null) {
                str8 = skuEnterParams10.getEnterFrom();
            }
            aVar.a(bVar, view2, view, !l.a((Object) str8, (Object) "product_detail"), new SkuPanelViewModel.b(o, view2), new SkuPanelViewModel.c(o)).a(new SkuPanelViewModel.d(o, skuItem), SkuPanelViewModel.e.f87513a);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget
    public final void n() {
        super.n();
        this.f87420h = (TuxButton) a(R.id.e59);
        TuxButton tuxButton = (TuxButton) a(R.id.e5_);
        this.f87421i = tuxButton;
        int i2 = this.f87423k;
        if (i2 == 0) {
            TuxButton tuxButton2 = this.f87420h;
            if (tuxButton2 == null) {
                l.a("addToCartBtn");
            }
            tuxButton2.setButtonVariant(1);
            TuxButton tuxButton3 = this.f87420h;
            if (tuxButton3 == null) {
                l.a("addToCartBtn");
            }
            int c2 = androidx.core.content.b.c(tuxButton3.getContext(), R.color.bh);
            TuxButton tuxButton4 = this.f87420h;
            if (tuxButton4 == null) {
                l.a("addToCartBtn");
            }
            tuxButton4.setTextColor(c2);
            TuxButton tuxButton5 = this.f87420h;
            if (tuxButton5 == null) {
                l.a("addToCartBtn");
            }
            TuxButton tuxButton6 = this.f87420h;
            if (tuxButton6 == null) {
                l.a("addToCartBtn");
            }
            Context context = tuxButton6.getContext();
            l.b(context, "");
            tuxButton5.setBackgroundDrawable(com.ss.android.ugc.aweme.ecommerce.widget.a.a(context));
            TuxButton tuxButton7 = this.f87420h;
            if (tuxButton7 == null) {
                l.a("addToCartBtn");
            }
            tuxButton7.setText(R.string.bj8);
            f.a.b.b unused = selectSubscribe(o(), a.f87454a, new ah(), new g(this));
        } else if (i2 == 1) {
            TuxButton tuxButton8 = this.f87420h;
            if (tuxButton8 == null) {
                l.a("addToCartBtn");
            }
            tuxButton8.setVisibility(8);
            TuxButton tuxButton9 = this.f87421i;
            if (tuxButton9 == null) {
                l.a("buyNowBtn");
            }
            tuxButton9.setText(R.string.bhn);
        } else if (i2 == 2) {
            if (tuxButton == null) {
                l.a("buyNowBtn");
            }
            tuxButton.setVisibility(8);
            TuxButton tuxButton10 = this.f87420h;
            if (tuxButton10 == null) {
                l.a("addToCartBtn");
            }
            ViewGroup.LayoutParams layoutParams = tuxButton10.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            int i3 = Build.VERSION.SDK_INT;
            TuxButton tuxButton11 = this.f87420h;
            if (tuxButton11 == null) {
                l.a("addToCartBtn");
            }
            ViewGroup.LayoutParams layoutParams2 = tuxButton11.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams2).setMarginEnd(0);
            TuxButton tuxButton12 = this.f87420h;
            if (tuxButton12 == null) {
                l.a("addToCartBtn");
            }
            tuxButton12.setText(R.string.bhn);
            TuxButton tuxButton13 = this.f87420h;
            if (tuxButton13 == null) {
                l.a("addToCartBtn");
            }
            tuxButton13.setButtonVariant(0);
            a(false, null);
        } else if (i2 == 3) {
            TuxButton tuxButton14 = this.f87420h;
            if (tuxButton14 == null) {
                l.a("addToCartBtn");
            }
            tuxButton14.setVisibility(8);
            TuxButton tuxButton15 = this.f87421i;
            if (tuxButton15 == null) {
                l.a("buyNowBtn");
            }
            tuxButton15.setText(R.string.bhn);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new h(this), 450);
        a(false, null);
        TuxButton tuxButton16 = this.f87421i;
        if (tuxButton16 == null) {
            l.a("buyNowBtn");
        }
        tuxButton16.setOnClickListener(new f(this));
        f.a.b.b unused2 = selectSubscribe(o(), b.f87455a, new ah(), new i(this));
    }

    public static final class f extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f87427a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuPanelBottomWidget f87428b;

        static {
            Covode.recordClassIndex(54921);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(SkuPanelBottomWidget skuPanelBottomWidget) {
            super(700);
            this.f87428b = skuPanelBottomWidget;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null && this.f87428b.f87422j) {
                if (this.f87428b.f87423k == 3) {
                    SkuPanelBottomWidget skuPanelBottomWidget = this.f87428b;
                    String a2 = skuPanelBottomWidget.l().a();
                    if (a2 != null) {
                        View view2 = skuPanelBottomWidget.f46127e;
                        if (view2 != null) {
                            Context context = skuPanelBottomWidget.a().getContext();
                            l.b(context, "");
                            String string = context.getResources().getString(R.string.bgp, a2);
                            l.b(string, "");
                            new com.bytedance.tux.g.b(view2).a(string).b();
                            return;
                        }
                        return;
                    }
                    skuPanelBottomWidget.a(new e(skuPanelBottomWidget));
                    return;
                }
                SkuPanelBottomWidget skuPanelBottomWidget2 = this.f87428b;
                String a3 = skuPanelBottomWidget2.l().a();
                if (a3 != null) {
                    View view3 = skuPanelBottomWidget2.f46127e;
                    if (view3 != null) {
                        Context context2 = skuPanelBottomWidget2.a().getContext();
                        l.b(context2, "");
                        String string2 = context2.getResources().getString(R.string.bgp, a3);
                        l.b(string2, "");
                        new com.bytedance.tux.g.b(view3).a(string2).b();
                        return;
                    }
                    return;
                }
                skuPanelBottomWidget2.a(new d(skuPanelBottomWidget2));
            }
        }
    }

    public SkuPanelBottomWidget(int i2) {
        this.f87423k = i2;
        h.k.c a2 = h.f.b.ab.a(SkuPanelViewModel.class);
        this.f87425m = h.i.a((h.f.a.a) new a(this, a2, a2));
    }

    /* access modifiers changed from: package-private */
    public final void a(h.f.a.a<z> aVar) {
        IAccountService a2 = AccountService.a();
        IAccountUserService e2 = a2.e();
        l.b(e2, "");
        if (!e2.isLogin()) {
            bo g2 = a2.g();
            IAccountService.d dVar = new IAccountService.d();
            dVar.f62401a = k();
            dVar.f62405e = new b(aVar);
            g2.showLoginAndRegisterView(dVar.a());
            return;
        }
        aVar.invoke();
    }

    public static final class j extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f87430a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuPanelBottomWidget f87431b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f87432c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AddToCartButton f87433d;

        static {
            Covode.recordClassIndex(54925);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            String str;
            if (view != null && this.f87431b.f87422j) {
                if (this.f87432c) {
                    View view2 = this.f87431b.f46127e;
                    if (view2 != null) {
                        com.bytedance.tux.g.b bVar = new com.bytedance.tux.g.b(view2);
                        AddToCartButton addToCartButton = this.f87433d;
                        if (addToCartButton != null) {
                            str = addToCartButton.getClickHint();
                        } else {
                            str = null;
                        }
                        bVar.a(str).b();
                        return;
                    }
                    return;
                }
                SkuPanelBottomWidget skuPanelBottomWidget = this.f87431b;
                String a2 = skuPanelBottomWidget.l().a();
                if (a2 != null) {
                    Context context = skuPanelBottomWidget.a().getContext();
                    l.b(context, "");
                    String string = context.getResources().getString(R.string.bgp, a2);
                    l.b(string, "");
                    View view3 = skuPanelBottomWidget.f46127e;
                    if (view3 != null) {
                        new com.bytedance.tux.g.b(view3).a(string).b();
                        return;
                    }
                    return;
                }
                skuPanelBottomWidget.a(new c(skuPanelBottomWidget));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(SkuPanelBottomWidget skuPanelBottomWidget, boolean z, AddToCartButton addToCartButton) {
            super(700);
            this.f87431b = skuPanelBottomWidget;
            this.f87432c = z;
            this.f87433d = addToCartButton;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z, AddToCartButton addToCartButton) {
        TuxButton tuxButton = this.f87420h;
        if (tuxButton == null) {
            l.a("addToCartBtn");
        }
        tuxButton.setOnClickListener(new j(this, z, addToCartButton));
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ SkuPanelBottomWidget this$0;

        static {
            Covode.recordClassIndex(54924);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(SkuPanelBottomWidget skuPanelBottomWidget) {
            super(2);
            this.this$0 = skuPanelBottomWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            int i2;
            l.d(iVar, "");
            TuxButton tuxButton = this.this$0.f87421i;
            if (tuxButton == null) {
                l.a("buyNowBtn");
            }
            Context context = this.this$0.a().getContext();
            l.b(context, "");
            Resources resources = context.getResources();
            if (this.this$0.f87423k == 1 || this.this$0.f87423k == 3) {
                i2 = R.string.bhn;
            } else if (l.a((Object) bool, (Object) true)) {
                i2 = R.string.bhg;
            } else {
                i2 = R.string.bfu;
            }
            tuxButton.setText(resources.getString(i2));
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, AddToCartButton, z> {
        final /* synthetic */ SkuPanelBottomWidget this$0;

        static {
            Covode.recordClassIndex(54922);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(SkuPanelBottomWidget skuPanelBottomWidget) {
            super(2);
            this.this$0 = skuPanelBottomWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, AddToCartButton addToCartButton) {
            Integer num;
            AddToCartButton addToCartButton2 = addToCartButton;
            l.d(iVar, "");
            SkuPanelBottomWidget skuPanelBottomWidget = this.this$0;
            if (addToCartButton2 != null) {
                num = addToCartButton2.getStatus();
            } else {
                num = null;
            }
            if (num != null) {
                if (num.intValue() == 2) {
                    TuxButton tuxButton = skuPanelBottomWidget.f87420h;
                    if (tuxButton == null) {
                        l.a("addToCartBtn");
                    }
                    tuxButton.setVisibility(0);
                    TuxButton tuxButton2 = skuPanelBottomWidget.f87420h;
                    if (tuxButton2 == null) {
                        l.a("addToCartBtn");
                    }
                    TuxButton tuxButton3 = skuPanelBottomWidget.f87420h;
                    if (tuxButton3 == null) {
                        l.a("addToCartBtn");
                    }
                    tuxButton2.setBackgroundColor(androidx.core.content.b.c(tuxButton3.getContext(), R.color.f159922f));
                    TuxButton tuxButton4 = skuPanelBottomWidget.f87420h;
                    if (tuxButton4 == null) {
                        l.a("addToCartBtn");
                    }
                    int c2 = androidx.core.content.b.c(tuxButton4.getContext(), R.color.bz);
                    TuxButton tuxButton5 = skuPanelBottomWidget.f87420h;
                    if (tuxButton5 == null) {
                        l.a("addToCartBtn");
                    }
                    tuxButton5.setTextColor(c2);
                    skuPanelBottomWidget.a(true, addToCartButton2);
                } else if (num.intValue() == 1) {
                    TuxButton tuxButton6 = skuPanelBottomWidget.f87420h;
                    if (tuxButton6 == null) {
                        l.a("addToCartBtn");
                    }
                    tuxButton6.setVisibility(0);
                    TuxButton tuxButton7 = skuPanelBottomWidget.f87420h;
                    if (tuxButton7 == null) {
                        l.a("addToCartBtn");
                    }
                    int c3 = androidx.core.content.b.c(tuxButton7.getContext(), R.color.bh);
                    TuxButton tuxButton8 = skuPanelBottomWidget.f87420h;
                    if (tuxButton8 == null) {
                        l.a("addToCartBtn");
                    }
                    tuxButton8.setTextColor(c3);
                    TuxButton tuxButton9 = skuPanelBottomWidget.f87420h;
                    if (tuxButton9 == null) {
                        l.a("addToCartBtn");
                    }
                    TuxButton tuxButton10 = skuPanelBottomWidget.f87420h;
                    if (tuxButton10 == null) {
                        l.a("addToCartBtn");
                    }
                    Context context = tuxButton10.getContext();
                    l.b(context, "");
                    tuxButton9.setBackgroundDrawable(com.ss.android.ugc.aweme.ecommerce.widget.a.a(context));
                    skuPanelBottomWidget.a(false, null);
                }
                return z.f158842a;
            }
            TuxButton tuxButton11 = skuPanelBottomWidget.f87420h;
            if (tuxButton11 == null) {
                l.a("addToCartBtn");
            }
            tuxButton11.setVisibility(8);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f87426a;

        static {
            Covode.recordClassIndex(54917);
        }

        b(h.f.a.a aVar) {
            this.f87426a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i2 == 1 && i3 == 1) {
                this.f87426a.invoke();
            }
        }
    }
}
