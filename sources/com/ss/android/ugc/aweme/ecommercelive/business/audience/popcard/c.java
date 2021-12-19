package com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.FlashSaleViewModel;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.ProductSyncViewModel;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.utils.cg;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class c extends com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.b implements org.greenrobot.eventbus.i, j {

    /* renamed from: b  reason: collision with root package name */
    private boolean f87861b;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f87862c;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f87863d = h.i.a((h.f.a.a) g.f87928a);

    static {
        Covode.recordClassIndex(55254);
    }

    private final a d() {
        return (a) this.f87862c.getValue();
    }

    private final Handler e() {
        return (Handler) this.f87863d.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(45, new org.greenrobot.eventbus.g(c.class, "onShopCartAnimChange", com.ss.android.ugc.aweme.ecommercelive.business.audience.b.b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public final void a(List<? extends com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.c> list) {
        String sb;
        com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.a b2;
        View view = this.f87833a.f87929c.f87836b;
        if (view instanceof com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.c) {
            boolean z = true;
            if (list == null || list.isEmpty()) {
                ((com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.c) view).setFlashSaleViewVisible(false);
                return;
            }
            com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.c cVar = (com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.c) list.get(0);
            if (!cVar.a() || (b2 = cVar.b()) == null || !b2.b()) {
                z = false;
            }
            com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.c cVar2 = (com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.c) view;
            cVar2.setFlashSaleViewVisible(z);
            if (z) {
                com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.a b3 = cVar.b();
                String str = "";
                if (b3 != null && b3.b()) {
                    if (b3.c() > 86400000) {
                        sb = y.a((int) R.string.cxb);
                    } else {
                        long c2 = b3.c() / 1000;
                        long j2 = c2 / 60;
                        long j3 = j2 / 60;
                        long j4 = c2 % 60;
                        long j5 = j2 % 60;
                        long j6 = j3 % 24;
                        StringBuilder append = new StringBuilder().append(j6 < 10 ? "0".concat(String.valueOf(j6)) : String.valueOf(j6)).append(':');
                        int i2 = (j5 > 10 ? 1 : (j5 == 10 ? 0 : -1));
                        String valueOf = String.valueOf(j5);
                        if (i2 < 0) {
                            valueOf = "0".concat(valueOf);
                        }
                        StringBuilder append2 = append.append(valueOf).append(':');
                        int i3 = (j4 > 10 ? 1 : (j4 == 10 ? 0 : -1));
                        String valueOf2 = String.valueOf(j4);
                        if (i3 < 0) {
                            valueOf2 = "0".concat(valueOf2);
                        }
                        sb = append2.append(valueOf2).toString();
                        l.b(sb, str);
                    }
                    if (sb != null) {
                        str = sb;
                    }
                }
                cVar2.setFlashSaleInfo(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(55258);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a("user_close");
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f87928a = new g();

        static {
            Covode.recordClassIndex(55261);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static final class h extends m implements h.f.a.a<a> {
        final /* synthetic */ d $widget;

        static {
            Covode.recordClassIndex(55262);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(d dVar) {
            super(0);
            this.$widget = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a(new h.f.a.b<com.ss.android.ugc.aweme.ecommercelive.business.audience.b.b, z>(this) {
                /* class com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.c.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(55263);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.ecommercelive.business.audience.b.b bVar) {
                    com.ss.android.ugc.aweme.ecommercelive.business.audience.b.b bVar2 = bVar;
                    l.d(bVar2, "");
                    IFrameSlot.SlotViewModel slotViewModel = this.this$0.$widget.f87930d;
                    if (slotViewModel != null) {
                        com.ss.android.ugc.aweme.ecommercelive.business.common.c.c.a(slotViewModel, bVar2.f87784a);
                    }
                    return z.f158842a;
                }
            });
        }
    }

    private final void h() {
        FlashSaleViewModel b2 = b();
        if (b2 != null) {
            b2.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(55260);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            List<com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.c> list;
            t<List<com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.c>> tVar;
            c cVar = this.this$0;
            FlashSaleViewModel b2 = cVar.b();
            if (b2 == null || (tVar = b2.f87807d) == null) {
                list = null;
            } else {
                list = tVar.getValue();
            }
            cVar.a(list);
            return z.f158842a;
        }
    }

    private final void f() {
        if (!this.f87861b) {
            g();
            this.f87833a.f87929c.a(new d(this));
            this.f87833a.f87929c.a(new e(this));
            this.f87833a.f87929c.f87837c = new f(this);
            this.f87861b = true;
        }
    }

    public final ProductSyncViewModel c() {
        Context context;
        ab.a aVar = this.f87833a.f87931e;
        if (aVar != null) {
            context = aVar.a();
        } else {
            context = null;
        }
        if (!(context instanceof androidx.appcompat.app.d)) {
            context = null;
        }
        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) context;
        if (dVar != null) {
            return (ProductSyncViewModel) ae.a(dVar, (ad.b) null).a(ProductSyncViewModel.class);
        }
        return null;
    }

    private final void g() {
        Context context;
        t<List<com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.c>> tVar;
        t<List<com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.c>> tVar2;
        t<List<com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.a>> tVar3;
        ab.a aVar = this.f87833a.f87931e;
        androidx.lifecycle.m mVar = null;
        if (aVar != null) {
            context = aVar.a();
        } else {
            context = null;
        }
        if (context instanceof androidx.lifecycle.m) {
            mVar = context;
        }
        androidx.lifecycle.m mVar2 = mVar;
        if (mVar2 != null) {
            ProductSyncViewModel c2 = c();
            if (!(c2 == null || (tVar3 = c2.f87817f) == null)) {
                tVar3.observe(mVar2, new a(this, mVar2));
            }
            FlashSaleViewModel b2 = b();
            if (!(b2 == null || (tVar2 = b2.f87806c) == null)) {
                tVar2.observe(mVar2, new b(this, mVar2));
            }
            FlashSaleViewModel b3 = b();
            if (b3 != null && (tVar = b3.f87807d) != null) {
                tVar.observe(mVar2, new C2129c(this, mVar2));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.b
    public final void a() {
        h();
        e().removeCallbacks(d());
        cg.b(this);
    }

    public final FlashSaleViewModel b() {
        Context context;
        ab.a aVar = this.f87833a.f87931e;
        if (aVar != null) {
            context = aVar.a();
        } else {
            context = null;
        }
        if (!(context instanceof androidx.appcompat.app.d)) {
            context = null;
        }
        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) context;
        if (dVar != null) {
            return (FlashSaleViewModel) ae.a(dVar, (ad.b) null).a(FlashSaleViewModel.class);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.c$c  reason: collision with other inner class name */
    public static final class C2129c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f87897a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.m f87898b;

        static {
            Covode.recordClassIndex(55257);
        }

        C2129c(c cVar, androidx.lifecycle.m mVar) {
            this.f87897a = cVar;
            this.f87898b = mVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f87897a.a((List) obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(dVar);
        l.d(dVar, "");
        this.f87862c = h.i.a((h.f.a.a) new h(dVar));
    }

    public static String a(com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.a aVar) {
        if (aVar.a()) {
            return "warm_up";
        }
        if (aVar.b()) {
            return "on_sale";
        }
        return null;
    }

    @r
    public final void onShopCartAnimChange(com.ss.android.ugc.aweme.ecommercelive.business.audience.b.b bVar) {
        l.d(bVar, "");
        d().f87830a = bVar;
        e().postDelayed(d(), bVar.f87785b);
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f87864a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.m f87865b;

        static {
            Covode.recordClassIndex(55255);
        }

        a(c cVar, androidx.lifecycle.m mVar) {
            this.f87864a = cVar;
            this.f87865b = mVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            l.b(list, "");
            if (!list.isEmpty()) {
                this.f87864a.f87833a.f87929c.a(PopupCardVO.a.a((com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.a) list.get(0)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends m implements h.f.a.b<com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.c, Boolean> {
        final /* synthetic */ Long $productId$inlined;

        static {
            Covode.recordClassIndex(55264);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(Long l2) {
            super(1);
            this.$productId$inlined = l2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.c cVar) {
            boolean z;
            com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.c cVar2 = cVar;
            l.d(cVar2, "");
            if (cVar2 instanceof com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.b) {
                long productId = ((com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.b) cVar2).f87827a.getProductId();
                Long l2 = this.$productId$inlined;
                if (l2 != null && productId == l2.longValue()) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    public static String b(com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.a aVar) {
        l.d(aVar, "");
        if (!aVar.a() && aVar.b()) {
            if (aVar.c() > 86400000) {
                return "gt_24";
            }
            if (aVar.c() > 0) {
                return "in_24";
            }
        }
        return "no_countdown";
    }

    public final com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.a a(Long l2) {
        com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.c a2;
        FlashSaleViewModel b2 = b();
        if (b2 == null || (a2 = b2.a(new i(l2))) == null) {
            return null;
        }
        return a2.b();
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f87867a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.m f87868b;

        static {
            Covode.recordClassIndex(55256);
        }

        b(c cVar, androidx.lifecycle.m mVar) {
            this.f87867a = cVar;
            this.f87868b = mVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Room room;
            ArrayList arrayList = new ArrayList();
            for (com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.c cVar : (List) obj) {
                if (cVar instanceof com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.b) {
                    arrayList.add(String.valueOf(((com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.b) cVar).f87827a.getProductId()));
                }
            }
            ProductSyncViewModel c2 = this.f87867a.c();
            if (!(c2 == null || (room = this.f87867a.f87833a.f87933g) == null)) {
                c2.a(String.valueOf(room.getId()), arrayList);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.b
    public final void a(com.ss.android.ugc.aweme.ecommercelive.business.common.a.c cVar) {
        PopupCardVO popupCardVO;
        String str;
        cg.a(this);
        f();
        if (cVar != null && (popupCardVO = this.f87833a.f87929c.f87835a) != null) {
            a(popupCardVO, cVar.f87959c);
            d dVar = this.f87833a;
            if (dVar.f87937k > 0 && dVar.f87938l > 0 && dVar.f87939m > 0 && dVar.n > 0 && dVar.f87939m > dVar.f87938l) {
                long currentTimeMillis = System.currentTimeMillis() - dVar.f87937k;
                long j2 = dVar.f87938l - dVar.f87937k;
                long j3 = dVar.f87939m - dVar.f87938l;
                long j4 = dVar.n - dVar.f87939m;
                long currentTimeMillis2 = System.currentTimeMillis() - dVar.n;
                Room room = dVar.f87933g;
                if (room != null) {
                    str = room.getIdStr();
                } else {
                    str = null;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("room_id", str);
                    jSONObject.put("total_duration", currentTimeMillis);
                    jSONObject.put("before_enter_room_interface_duration", j2);
                    jSONObject.put("enter_room_interface_duration", j3);
                    jSONObject.put("live_process_data_duration", j4);
                    jSONObject.put("ec_process_data_duration", currentTimeMillis2);
                    com.ss.android.ugc.aweme.common.r.a("rd_tiktokec_live_pop_product_show", jSONObject);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.b
    public final void b(String str) {
        Long l2;
        String str2;
        l.d(str, "");
        PopupCardVO popupCardVO = this.f87833a.f87929c.f87835a;
        String str3 = null;
        if (popupCardVO != null) {
            l2 = Long.valueOf(popupCardVO.getProductId());
        } else {
            l2 = null;
        }
        com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.a a2 = a(l2);
        Map<String, String> map = this.f87833a.f87935i;
        com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar = this.f87833a.f87932f;
        if (a2 != null) {
            str2 = a(a2);
            str3 = b(a2);
        } else {
            str2 = null;
        }
        l.d(aVar, "");
        com.ss.android.ugc.aweme.app.f.d a3 = com.ss.android.ugc.aweme.ecommercelive.business.common.b.b.a(aVar).a("stay_time", aVar.c("stay_time")).a("quit_type", aVar.c("quit_type"));
        if (str2 != null) {
            a3.a("flashsale_status", str2);
        }
        if (str3 != null) {
            a3.a("countdown_type", str3);
        }
        if (map != null) {
            a3.a(map);
        }
        l.b(a3, "");
        com.ss.android.ugc.aweme.ecommercelive.business.common.b.b.a(a3);
        com.ss.android.ugc.aweme.common.r.a("livesdk_tiktokec_product_entrance_stay_time", a3.f66730a);
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<String, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(55259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            Long l2;
            Long l3;
            String str2;
            String str3;
            Long l4;
            String str4;
            String str5;
            String str6;
            String str7 = str;
            l.d(str7, "");
            this.this$0.f87833a.f87932f.a("click_area", str7, false);
            c cVar = this.this$0;
            PopupCardVO popupCardVO = cVar.f87833a.f87929c.f87835a;
            if (popupCardVO != null) {
                l2 = Long.valueOf(popupCardVO.getProductId());
            } else {
                l2 = null;
            }
            com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.a a2 = cVar.a(l2);
            com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar = this.this$0.f87833a.f87932f;
            Room room = this.this$0.f87833a.f87933g;
            if (room != null) {
                l3 = Long.valueOf(room.getId());
            } else {
                l3 = null;
            }
            String valueOf = String.valueOf(l3);
            Boolean bool = this.this$0.f87833a.f87934h;
            Map<String, String> map = this.this$0.f87833a.f87935i;
            HashMap hashMap = new HashMap();
            Map<String, String> map2 = this.this$0.f87833a.f87936j;
            if (map2 != null) {
                hashMap.putAll(map2);
                hashMap.put("refer", "image");
                hashMap.put("label", "user_otherclick");
            }
            if (a2 != null) {
                str2 = c.a(a2);
                str3 = c.b(a2);
            } else {
                str2 = null;
                str3 = null;
            }
            com.ss.android.ugc.aweme.ecommercelive.business.common.b.b.b(aVar, valueOf, bool, map, hashMap, "product_detail", str2, str3);
            com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar2 = this.this$0.f87833a.f87932f;
            Room room2 = this.this$0.f87833a.f87933g;
            if (room2 != null) {
                l4 = Long.valueOf(room2.getId());
            } else {
                l4 = null;
            }
            String valueOf2 = String.valueOf(l4);
            Boolean bool2 = this.this$0.f87833a.f87934h;
            Map<String, String> map3 = this.this$0.f87833a.f87935i;
            HashMap hashMap2 = new HashMap();
            Map<String, String> map4 = this.this$0.f87833a.f87936j;
            if (map4 != null) {
                hashMap2.putAll(map4);
                hashMap2.put("refer", "product_detail");
                hashMap2.put("label", "user_otherclick");
            }
            if (a2 != null) {
                str4 = c.a(a2);
                str5 = c.b(a2);
            } else {
                str4 = null;
                str5 = null;
            }
            PopupCardVO popupCardVO2 = this.this$0.f87833a.f87929c.f87835a;
            if (popupCardVO2 == null) {
                str6 = null;
            } else if (popupCardVO2.isSoldOut()) {
                str6 = "1";
            } else {
                str6 = "0";
            }
            l.d(aVar2, "");
            com.ss.android.ugc.aweme.app.f.d a3 = com.ss.android.ugc.aweme.ecommercelive.business.common.b.b.a(aVar2).a("item_order", aVar2.c("item_order")).a("click_area", aVar2.c("click_area"));
            String c2 = aVar2.c("list_skin_type");
            if (c2 == null) {
                c2 = "";
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("list_skin_type", c2);
            String c3 = aVar2.c("product_skin_type");
            if (c3 == null) {
                c3 = "";
            }
            com.ss.android.ugc.aweme.app.f.d a5 = a4.a("product_skin_type", c3);
            if (aVar2.a("campaign_id")) {
                a5.a("campaign_id", aVar2.c("campaign_id"));
            }
            if (aVar2.a("campaign_type")) {
                a5.a("campaign_type", aVar2.c("campaign_type"));
            }
            if (aVar2.a("campaign_channel")) {
                a5.a("campaign_channel", aVar2.c("campaign_channel"));
            }
            if (aVar2.a("campaign_user_tag")) {
                a5.a("campaign_user_tag", aVar2.c("campaign_user_tag"));
            }
            if (str4 != null) {
                a5.a("flashsale_status", str4);
            }
            if (str5 != null) {
                a5.a("countdown_type", str5);
            }
            if (str6 != null) {
                a5.a("is_sold_out", str6);
            }
            l.b(a5, "");
            com.ss.android.ugc.aweme.ecommercelive.business.common.b.b.a(a5);
            a5.a(map3);
            a5.a((Map<? extends String, ? extends String>) hashMap2);
            com.ss.android.ugc.aweme.common.r.a("livesdk_tiktokec_product_click", a5.f66730a);
            if (l.a((Object) bool2, (Object) true)) {
                HashMap hashMap3 = new HashMap();
                if (map3 != null) {
                    hashMap3.putAll(map3);
                }
                hashMap3.put("refer", "image");
                HashMap hashMap4 = new HashMap();
                if (valueOf2 != null) {
                    hashMap4.put("room_id", valueOf2);
                }
                com.bytedance.android.livesdk.utils.a.a("live_ad", "otherclick", hashMap3, hashMap4);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.b
    public final void a(com.ss.android.ugc.aweme.ecommercelive.framework.a.a.b bVar) {
        l.d(bVar, "");
        f();
        PopupCardVO popupCardVO = this.f87833a.f87929c.f87835a;
        if (popupCardVO != null) {
            a(popupCardVO, bVar.f88010b);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.b
    public final void a(String str) {
        Object obj;
        String str2;
        String str3;
        t<Pair<Boolean, String>> tVar;
        Pair<Boolean, String> value;
        l.d(str, "");
        h();
        IFrameSlot.SlotViewModel slotViewModel = this.f87833a.f87930d;
        if (slotViewModel == null || (tVar = slotViewModel.f12709a) == null || (value = tVar.getValue()) == null) {
            obj = null;
        } else {
            obj = value.first;
        }
        if (l.a(obj, (Object) true)) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ecommercelive.business.audience.b.a(false));
            this.f87833a.c(str);
        }
        this.f87833a.q.removeMessages(0);
        this.f87833a.f87929c.f87836b = null;
        if (l.a((Object) str, (Object) "unpin")) {
            Room room = this.f87833a.f87933g;
            if (room == null || (str2 = String.valueOf(room.getId())) == null) {
                str2 = "0";
            }
            String h2 = d.h();
            com.ss.android.ugc.aweme.ecommercelive.business.common.b.g gVar = com.ss.android.ugc.aweme.ecommercelive.business.common.b.g.Audience;
            PopupCardVO popupCardVO = this.f87833a.f87929c.f87835a;
            if (popupCardVO == null || (str3 = String.valueOf(popupCardVO.getProductId())) == null) {
                str3 = "";
            }
            l.d(str2, "");
            l.d(h2, "");
            l.d(gVar, "");
            l.d(str3, "");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("author_id", h2);
                jSONObject.put("room_id", str2);
                jSONObject.put("product_id", str3);
                jSONObject.put("live_role", gVar.getRoleStr());
                com.ss.android.ugc.aweme.common.r.a("rd_tiktokec_cancel_pin_product", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    private final void b(PopupCardVO popupCardVO, long j2) {
        FlashSaleViewModel b2 = b();
        if (b2 != null) {
            b2.a(n.a(new com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.b(popupCardVO, j2)));
        }
    }

    private final void a(PopupCardVO popupCardVO, long j2) {
        Long l2;
        int i2;
        String str;
        String str2;
        Long l3;
        Long l4;
        String str3;
        String str4;
        Long l5;
        String str5;
        String str6;
        PromotionView promotionView;
        String a2;
        PromotionView promotionView2;
        String a3;
        PromotionView promotionView3;
        String a4;
        PromotionView promotionView4;
        String a5;
        String promotionLogoLog;
        com.ss.android.ugc.aweme.ecommercelive.business.common.a.e promotionSkin;
        b(popupCardVO, j2);
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ecommercelive.business.audience.b.a(true));
        this.f87833a.q.sendEmptyMessageDelayed(0, com.ss.android.ugc.aweme.ecommercelive.business.audience.a.c.a().f87742b);
        com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar = this.f87833a.f87932f;
        PopupCardVO popupCardVO2 = this.f87833a.f87929c.f87835a;
        String str7 = null;
        if (popupCardVO2 != null) {
            l2 = Long.valueOf(popupCardVO2.getProductId());
        } else {
            l2 = null;
        }
        aVar.a("product_id", String.valueOf(l2), false);
        com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar2 = this.f87833a.f87932f;
        PopupCardVO popupCardVO3 = this.f87833a.f87929c.f87835a;
        int i3 = -1;
        if (popupCardVO3 != null) {
            i2 = popupCardVO3.getPlatform();
        } else {
            i2 = -1;
        }
        aVar2.a("product_source", i2);
        com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar3 = this.f87833a.f87932f;
        PopupCardVO popupCardVO4 = this.f87833a.f87929c.f87835a;
        if (popupCardVO4 != null) {
            i3 = popupCardVO4.getSourceFrom();
        }
        aVar3.a("source_from", i3);
        com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar4 = this.f87833a.f87932f;
        PopupCardVO popupCardVO5 = this.f87833a.f87929c.f87835a;
        String str8 = "";
        if (popupCardVO5 == null || (promotionSkin = popupCardVO5.getPromotionSkin()) == null || (str = promotionSkin.f87973b) == null) {
            str = str8;
        }
        aVar4.a("list_skin_type", str, false);
        com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar5 = this.f87833a.f87932f;
        PopupCardVO popupCardVO6 = this.f87833a.f87929c.f87835a;
        if (!(popupCardVO6 == null || (promotionLogoLog = popupCardVO6.getPromotionLogoLog()) == null)) {
            str8 = promotionLogoLog;
        }
        aVar5.a("product_skin_type", str8, false);
        PopupCardVO popupCardVO7 = this.f87833a.f87929c.f87835a;
        if (popupCardVO7 != null) {
            this.f87833a.f87932f.a("item_order", popupCardVO7.getBagIndex());
        }
        PopupCardVO popupCardVO8 = this.f87833a.f87929c.f87835a;
        if (!(popupCardVO8 == null || (promotionView4 = popupCardVO8.getPromotionView()) == null || (a5 = com.ss.android.ugc.aweme.ecommercebase.dto.a.a(promotionView4, "campaign_id")) == null || a5.length() <= 0)) {
            this.f87833a.f87932f.a("campaign_id", a5, false);
        }
        PopupCardVO popupCardVO9 = this.f87833a.f87929c.f87835a;
        if (!(popupCardVO9 == null || (promotionView3 = popupCardVO9.getPromotionView()) == null || (a4 = com.ss.android.ugc.aweme.ecommercebase.dto.a.a(promotionView3, "campaign_channel")) == null || a4.length() <= 0)) {
            this.f87833a.f87932f.a("campaign_channel", a4, false);
        }
        PopupCardVO popupCardVO10 = this.f87833a.f87929c.f87835a;
        if (!(popupCardVO10 == null || (promotionView2 = popupCardVO10.getPromotionView()) == null || (a3 = com.ss.android.ugc.aweme.ecommercebase.dto.a.a(promotionView2, "campaign_user_tag")) == null || a3.length() <= 0)) {
            this.f87833a.f87932f.a("campaign_user_tag", a3, false);
        }
        PopupCardVO popupCardVO11 = this.f87833a.f87929c.f87835a;
        if (!(popupCardVO11 == null || (promotionView = popupCardVO11.getPromotionView()) == null || (a2 = com.ss.android.ugc.aweme.ecommercebase.dto.a.a(promotionView, "campaign_type")) == null || a2.length() <= 0)) {
            this.f87833a.f87932f.a("campaign_type", a2, false);
        }
        com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar6 = this.f87833a.f87932f;
        PopupCardVO popupCardVO12 = this.f87833a.f87929c.f87835a;
        if (popupCardVO12 != null) {
            str2 = popupCardVO12.getSource();
        } else {
            str2 = null;
        }
        aVar6.a("source", str2, true);
        this.f87833a.f87932f.a("start_time", System.currentTimeMillis());
        PopupCardVO popupCardVO13 = this.f87833a.f87929c.f87835a;
        if (popupCardVO13 != null) {
            l3 = Long.valueOf(popupCardVO13.getProductId());
        } else {
            l3 = null;
        }
        com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.a a6 = a(l3);
        com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar7 = this.f87833a.f87932f;
        Room room = this.f87833a.f87933g;
        if (room != null) {
            l4 = Long.valueOf(room.getId());
        } else {
            l4 = null;
        }
        String valueOf = String.valueOf(l4);
        Boolean bool = this.f87833a.f87934h;
        Map<String, String> map = this.f87833a.f87935i;
        HashMap hashMap = new HashMap();
        Map<String, String> map2 = this.f87833a.f87936j;
        if (map2 != null) {
            hashMap.putAll(map2);
            hashMap.put("refer", "image");
            hashMap.put("label", "user_othershow");
        }
        if (a6 != null) {
            str3 = a(a6);
            str4 = b(a6);
        } else {
            str3 = null;
            str4 = null;
        }
        com.ss.android.ugc.aweme.ecommercelive.business.common.b.b.a(aVar7, valueOf, bool, map, hashMap, "product_detail", str3, str4);
        com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar8 = this.f87833a.f87932f;
        Room room2 = this.f87833a.f87933g;
        if (room2 != null) {
            l5 = Long.valueOf(room2.getId());
        } else {
            l5 = null;
        }
        String valueOf2 = String.valueOf(l5);
        Boolean bool2 = this.f87833a.f87934h;
        Map<String, String> map3 = this.f87833a.f87935i;
        HashMap hashMap2 = new HashMap();
        Map<String, String> map4 = this.f87833a.f87936j;
        if (map4 != null) {
            hashMap2.putAll(map4);
            hashMap2.put("refer", "product_detail");
            hashMap2.put("label", "user_othershow");
        }
        if (a6 != null) {
            str5 = a(a6);
            str6 = b(a6);
        } else {
            str5 = null;
            str6 = null;
        }
        PopupCardVO popupCardVO14 = this.f87833a.f87929c.f87835a;
        if (popupCardVO14 != null) {
            if (popupCardVO14.isSoldOut()) {
                str7 = "1";
            } else {
                str7 = "0";
            }
        }
        com.ss.android.ugc.aweme.ecommercelive.business.common.b.b.a(aVar8, valueOf2, bool2, map3, hashMap2, "image", str5, str6, str7);
    }
}
