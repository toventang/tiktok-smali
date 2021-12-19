package com.ss.android.ugc.aweme.ecommerce.pdp.b;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.review.f;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.track.TrackerProvider;
import com.ss.android.ugc.aweme.ecommerce.track.c;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class k {
    public static final a C = new a((byte) 0);
    public DeliveryPanelStarter.PackedDeliverySelectResult A;
    public final IPdpStarter.PdpEnterParam B;
    private final Set<String> D;
    private boolean E;
    private boolean F;
    private final HashSet<String> G;
    private final HashSet<String> H;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<String, Object> f86382a;

    /* renamed from: b  reason: collision with root package name */
    public long f86383b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final HashSet<String> f86384c = new HashSet<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashSet<String> f86385d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f86386e;

    /* renamed from: f  reason: collision with root package name */
    public long f86387f = -1;

    /* renamed from: g  reason: collision with root package name */
    public final HashSet<String> f86388g = new HashSet<>();

    /* renamed from: h  reason: collision with root package name */
    public boolean f86389h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f86390i;

    /* renamed from: j  reason: collision with root package name */
    public ProductPackStruct f86391j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f86392k;

    /* renamed from: l  reason: collision with root package name */
    public Integer f86393l;

    /* renamed from: m  reason: collision with root package name */
    public Long f86394m;
    public boolean n;
    public boolean o;
    public Integer p;
    public long q = -1;
    public long r = -1;
    public long s = -1;
    public long t = -1;
    public boolean u;
    public boolean v;
    public int w;
    public long x = -1;
    public String y = "next";
    public Boolean z;

    static {
        Covode.recordClassIndex(54096);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54097);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static k a(Context context) {
            k kVar = null;
            if (context == null) {
                return null;
            }
            Activity a2 = com.ss.android.ugc.aweme.base.utils.o.a(context);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ac a3 = ae.a((androidx.fragment.app.e) a2, (ad.b) null).a(TrackerProvider.class);
            h.f.b.l.b(a3, "");
            Object obj = ((TrackerProvider) a3).f87521a;
            if (obj instanceof k) {
                kVar = obj;
            }
            return kVar;
        }
    }

    public static final class d extends com.google.gson.b.a<Map<String, ? extends Object>> {
        static {
            Covode.recordClassIndex(54100);
        }

        d() {
        }
    }

    public final void a(boolean z2) {
        this.n = z2;
        this.f86382a.put("page_show_type", z2 ? "full_screen" : "half_screen");
    }

    public final void a(String str) {
        h.f.b.l.d(str, "");
        this.y = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0045, code lost:
        if (r1.length() == 0) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.ecommerce.track.c.a r6) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.b.k.a(com.ss.android.ugc.aweme.ecommerce.track.c$a):void");
    }

    public final void a(boolean z2, boolean z3) {
        new h(z2, SystemClock.elapsedRealtime() - this.f86387f, this.f86384c.size(), z3).c(this.f86382a);
        this.f86387f = SystemClock.elapsedRealtime();
    }

    public final void a(String str, boolean z2, Float f2, String str2, boolean z3, String str3) {
        h.f.b.l.d(str, "");
        if (h.f.b.l.a((Object) str, (Object) "showcase_detail")) {
            new l("shopprofile", z2).c(this.f86382a);
        } else {
            new l(str, z2).c(this.f86382a);
        }
        if (z3 || !this.D.contains(str)) {
            com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_module_show", new l(this, str, f2, str2, str3));
        }
        this.D.add(str);
    }

    public final void a(String str, com.ss.android.ugc.aweme.ecommerce.pdp.d.h hVar) {
        h.f.b.l.d(str, "");
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_module_click", new C2083k(this, str, hVar));
    }

    public final void a(String str, HashMap<String, Object> hashMap) {
        h.f.b.l.d(str, "");
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_button_show", new f(this, str, hashMap));
    }

    public final void a(String str, Boolean bool, Boolean bool2) {
        h.f.b.l.d(str, "");
        new d(str, bool, bool2).c(this.f86382a);
        this.f86388g.add(str);
    }

    public final void a(String str, Boolean bool) {
        h.f.b.l.d(str, "");
        new o(str, bool).c(this.f86382a);
        if (!h.f.b.l.a((Object) str, (Object) "logistics")) {
            com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_enter_page", new m(this, str));
        }
    }

    public final void a(String str, long j2, String str2) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_stay_page", new n(this, str, j2, str2));
    }

    public final void a(Boolean bool, boolean z2, long j2) {
        new s().c(this.f86382a);
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_confirm_sku", new t(this, z2, j2, bool));
    }

    public final void b() {
        new p().c(this.f86382a);
    }

    public final void c() {
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_cart_entrance_show", new h(this));
    }

    public final void d() {
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_cart_entrance_click", new g(this));
    }

    public final void a() {
        if (!this.F) {
            this.F = true;
            com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_module_show", new s(this));
        }
    }

    public final void e(String str) {
        h.f.b.l.d(str, "");
        new q(str).c(this.f86382a);
    }

    static final class e extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ HashMap $hashMap;
        final /* synthetic */ String $name;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54101);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(k kVar, String str, HashMap hashMap) {
            super(1);
            this.this$0 = kVar;
            this.$name = str;
            this.$hashMap = hashMap;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            c.a.a(aVar2, this.this$0.f86382a);
            aVar2.b("button_name", this.$name);
            HashMap hashMap = this.$hashMap;
            if (hashMap != null) {
                c.a.a(aVar2, hashMap);
            }
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ HashMap $hashMap;
        final /* synthetic */ String $name;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54102);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(k kVar, String str, HashMap hashMap) {
            super(1);
            this.this$0 = kVar;
            this.$name = str;
            this.$hashMap = hashMap;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            c.a.a(aVar2, this.this$0.f86382a);
            aVar2.b("button_name", this.$name);
            HashMap hashMap = this.$hashMap;
            if (hashMap != null) {
                c.a.a(aVar2, hashMap);
            }
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54103);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(k kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            c.a.a(aVar2, this.this$0.f86382a);
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54104);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(k kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            c.a.a(aVar2, this.this$0.f86382a);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ String $pageName;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54109);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(k kVar, String str) {
            super(1);
            this.this$0 = kVar;
            this.$pageName = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            c.a.a(aVar2, this.this$0.f86382a);
            aVar2.b("page_name", this.$pageName);
            this.this$0.c(aVar2);
            return z.f158842a;
        }
    }

    public final void b(String str) {
        if (str == null) {
            this.w = 0;
            return;
        }
        this.w = 1;
        this.f86384c.add(str);
    }

    public final void c(String str) {
        h.f.b.l.d(str, "");
        new j(str).c(this.f86382a);
    }

    public final void d(String str) {
        if (str != null) {
            new m(str).c(this.f86382a);
            this.f86386e = true;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ int $count;
        final /* synthetic */ SkuPrice $skuPrice;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54098);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar, SkuPrice skuPrice, int i2) {
            super(1);
            this.this$0 = kVar;
            this.$skuPrice = skuPrice;
            this.$count = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            com.ss.android.ugc.aweme.ecommerce.util.a.a(aVar2, this.this$0.f86382a, this.this$0.f86391j, this.$skuPrice, this.$count, "product_detail");
            aVar2.b("action_refer", "product_detail");
            return z.f158842a;
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.b<Long, Long> {
        final /* synthetic */ Object $clickProductStartTime;

        static {
            Covode.recordClassIndex(54105);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(Object obj) {
            super(1);
            this.$clickProductStartTime = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Long invoke(Long l2) {
            long longValue = l2.longValue();
            Object obj = this.$clickProductStartTime;
            long j2 = -1;
            if ((obj instanceof Long) && (!h.f.b.l.a(obj, (Object) -1L))) {
                j2 = longValue - ((Number) this.$clickProductStartTime).longValue();
            }
            return Long.valueOf(j2);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.pdp.d.g $infoData;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54106);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(k kVar, com.ss.android.ugc.aweme.ecommerce.pdp.d.g gVar) {
            super(1);
            this.this$0 = kVar;
            this.$infoData = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            c.a.a(aVar2, this.this$0.f86382a);
            this.this$0.a(aVar2);
            k.a(aVar2, this.$infoData.f86468i);
            aVar2.b("module_name", "price");
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ String $freeShippingCondition;
        final /* synthetic */ String $moduleName;
        final /* synthetic */ String $shippingFeeCurrency;
        final /* synthetic */ Float $shippingPrice;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54108);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(k kVar, String str, Float f2, String str2, String str3) {
            super(1);
            this.this$0 = kVar;
            this.$moduleName = str;
            this.$shippingPrice = f2;
            this.$shippingFeeCurrency = str2;
            this.$freeShippingCondition = str3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            c.a.a(aVar2, this.this$0.f86382a);
            aVar2.b("module_name", this.$moduleName);
            if (h.f.b.l.a((Object) this.$moduleName, (Object) "logistics")) {
                Float f2 = this.$shippingPrice;
                if (f2 != null) {
                    aVar2.b("shipping_price", f2);
                }
                String str = this.$shippingFeeCurrency;
                if (str != null) {
                    aVar2.b("shipping_currency", str);
                }
                String str2 = this.$freeShippingCondition;
                if (str2 != null) {
                    aVar2.b("free_shipping_condition", str2);
                }
            }
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ long $duration;
        final /* synthetic */ String $pageName;
        final /* synthetic */ String $quitType;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54110);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(k kVar, String str, long j2, String str2) {
            super(1);
            this.this$0 = kVar;
            this.$pageName = str;
            this.$duration = j2;
            this.$quitType = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            c.a.a(aVar2, this.this$0.f86382a);
            aVar2.b("page_name", this.$pageName);
            aVar2.b("stay_time", Long.valueOf(this.$duration));
            aVar2.b("quit_type", this.$quitType);
            this.this$0.c(aVar2);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ boolean $isSelf;
        final /* synthetic */ String $photoId;
        final /* synthetic */ int $photoOrder;
        final /* synthetic */ String $reviewId;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54113);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(k kVar, String str, int i2, String str2, boolean z) {
            super(1);
            this.this$0 = kVar;
            this.$photoId = str;
            this.$photoOrder = i2;
            this.$reviewId = str2;
            this.$isSelf = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            c.a.a(aVar2, this.this$0.f86382a);
            aVar2.b("photo_id", this.$photoId);
            aVar2.b("rank", Integer.valueOf(this.$photoOrder));
            aVar2.b("review_id", this.$reviewId);
            aVar2.b("is_self", Integer.valueOf(this.$isSelf ? 1 : 0));
            return z.f158842a;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54115);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(k kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            ProductDetailReview productDetailReview;
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            c.a.a(aVar2, this.this$0.f86382a);
            ProductPackStruct productPackStruct = this.this$0.f86391j;
            if (productPackStruct != null) {
                productDetailReview = productPackStruct.n;
            } else {
                productDetailReview = null;
            }
            k.a(aVar2, productDetailReview);
            aVar2.b("module_name", "review_entrance");
            return z.f158842a;
        }
    }

    public static final class u extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ String $activityName;
        final /* synthetic */ String $promotionName;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54117);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public u(k kVar, String str, String str2) {
            super(1);
            this.this$0 = kVar;
            this.$activityName = str;
            this.$promotionName = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            c.a.a(aVar2, this.this$0.f86382a);
            aVar2.c("activity_name", this.$activityName);
            aVar2.c("promotion_name", this.$promotionName);
            if (h.f.b.l.a((Object) this.$activityName, (Object) "flashsale")) {
                this.this$0.b(aVar2);
                aVar2.f87533a.remove("flashsale_price");
            }
            return z.f158842a;
        }
    }

    public static void b(Map<String, ? extends Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "product_detail");
        linkedHashMap.put("popup_name", "server");
        linkedHashMap.put("action_type", "retry");
        linkedHashMap.put("error_code", "10007209");
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_popup_click", linkedHashMap);
    }

    public static Map<String, Object> f(String str) {
        Object obj;
        Map<String, Object> map = null;
        if (str == null) {
            return null;
        }
        try {
            obj = h.q.m223constructorimpl((Map) com.ss.android.ugc.aweme.account.util.i.a(str, new d().type));
        } catch (Throwable th) {
            obj = h.q.m223constructorimpl(h.r.a(th));
        }
        if (!h.q.m228isFailureimpl(obj)) {
            map = obj;
        }
        return map;
    }

    public final void c(c.a aVar) {
        LogisticDTO logisticDTO;
        h.f.b.l.d(aVar, "");
        aVar.b("previous_page", "product_detail");
        int i2 = 0;
        aVar.b("is_fullscreen", 0);
        Boolean bool = this.z;
        if (bool != null) {
            aVar.b("is_address_deliverable", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        ProductPackStruct productPackStruct = this.f86391j;
        if (!(productPackStruct == null || (logisticDTO = productPackStruct.f86645i) == null)) {
            i2 = logisticDTO.f85889a;
        }
        aVar.b("delivery_option", Integer.valueOf(i2));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k$k  reason: collision with other inner class name */
    static final class C2083k extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ String $moduleName;
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.pdp.d.h $productSelect;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54107);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2083k(k kVar, String str, com.ss.android.ugc.aweme.ecommerce.pdp.d.h hVar) {
            super(1);
            this.this$0 = kVar;
            this.$moduleName = str;
            this.$productSelect = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0073, code lost:
            if (r3 != null) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0077, code lost:
            if (r3 != null) goto L_0x0054;
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.ecommerce.track.c.a r6) {
            /*
            // Method dump skipped, instructions count: 124
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.b.k.C2083k.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static final class r extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ ReviewItemStruct $reviewItemStruct;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54114);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(k kVar, ReviewItemStruct reviewItemStruct) {
            super(1);
            this.this$0 = kVar;
            this.$reviewItemStruct = reviewItemStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            ProductDetailReview productDetailReview;
            ProductDetailReview productDetailReview2;
            List<ReviewItemStruct> list;
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            c.a.a(aVar2, this.this$0.f86382a);
            ProductPackStruct productPackStruct = this.this$0.f86391j;
            if (productPackStruct != null) {
                productDetailReview = productPackStruct.n;
            } else {
                productDetailReview = null;
            }
            k.a(aVar2, productDetailReview);
            f.a.a(aVar2, this.$reviewItemStruct, null);
            ProductPackStruct productPackStruct2 = this.this$0.f86391j;
            int i2 = 0;
            if (productPackStruct2 != null && (productDetailReview2 = productPackStruct2.n) != null && (list = productDetailReview2.f86632c) != null) {
                Iterator<ReviewItemStruct> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else if (h.f.b.l.a((Object) it.next().f87055a.f87068a, (Object) this.$reviewItemStruct.f87055a.f87068a)) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            aVar2.b("rank", Integer.valueOf(i2));
            return z.f158842a;
        }
    }

    public final void b(ReviewItemStruct reviewItemStruct) {
        List<Image> list;
        boolean z2;
        boolean z3;
        h.f.b.l.d(reviewItemStruct, "");
        List<Image> list2 = reviewItemStruct.f87055a.f87071d;
        if (list2 != null) {
            int i2 = 0;
            for (T t2 : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    h.a.n.a();
                }
                String str = reviewItemStruct.f87055a.f87068a;
                String valueOf = String.valueOf(t2.getUri());
                Boolean bool = reviewItemStruct.f87060f;
                if (bool != null) {
                    z3 = bool.booleanValue();
                } else {
                    z3 = false;
                }
                a(str, valueOf, i2, z3);
                i2 = i3;
            }
        }
        ReviewItemStruct.AppendReview appendReview = reviewItemStruct.f87055a.f87073f;
        if (!(appendReview == null || (list = appendReview.f87065b) == null)) {
            int i4 = 0;
            for (T t3 : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    h.a.n.a();
                }
                String str2 = reviewItemStruct.f87055a.f87068a;
                String valueOf2 = String.valueOf(t3.getUri());
                Boolean bool2 = reviewItemStruct.f87060f;
                if (bool2 != null) {
                    z2 = bool2.booleanValue();
                } else {
                    z2 = false;
                }
                a(str2, valueOf2, i4, z2);
                i4 = i5;
            }
        }
    }

    public final void c(boolean z2) {
        if (this.v) {
            new i(z2).c(this.f86382a);
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54099);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(k kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            List<SkuItem> list;
            float f2;
            float f3;
            Price realPrice;
            String priceVal;
            Float c2;
            Price realPrice2;
            String priceVal2;
            Float c3;
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            ProductPackStruct productPackStruct = this.this$0.f86391j;
            SkuPrice skuPrice = null;
            Object next = null;
            skuPrice = null;
            if (!(productPackStruct == null || (list = productPackStruct.f86643g) == null)) {
                ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getPrice());
                }
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        SkuPrice skuPrice2 = (SkuPrice) next;
                        if (skuPrice2 == null || (realPrice2 = skuPrice2.getRealPrice()) == null || (priceVal2 = realPrice2.getPriceVal()) == null || (c3 = h.m.p.c(priceVal2)) == null) {
                            f2 = 0.0f;
                        } else {
                            f2 = c3.floatValue();
                        }
                        do {
                            Object next2 = it2.next();
                            SkuPrice skuPrice3 = (SkuPrice) next2;
                            if (skuPrice3 == null || (realPrice = skuPrice3.getRealPrice()) == null || (priceVal = realPrice.getPriceVal()) == null || (c2 = h.m.p.c(priceVal)) == null) {
                                f3 = 0.0f;
                            } else {
                                f3 = c2.floatValue();
                            }
                            if (Float.compare(f2, f3) > 0) {
                                next = next2;
                                f2 = f3;
                            }
                        } while (it2.hasNext());
                    }
                }
                skuPrice = (SkuPrice) next;
            }
            com.ss.android.ugc.aweme.ecommerce.util.a.a(aVar2, this.this$0.f86382a, this.this$0.f86391j, skuPrice, 1, "product_detail");
            return z.f158842a;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ long $clickBuynowStartTime;
        final /* synthetic */ boolean $fullScreen;
        final /* synthetic */ Boolean $isBuyWithCoupon;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54116);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(k kVar, boolean z, long j2, Boolean bool) {
            super(1);
            this.this$0 = kVar;
            this.$fullScreen = z;
            this.$clickBuynowStartTime = j2;
            this.$isBuyWithCoupon = bool;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            int i2;
            String str;
            String str2;
            String str3;
            PickTag pickTag;
            List<SaleProp> list;
            Integer num;
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            c.a.a(aVar2, this.this$0.f86382a);
            this.this$0.a(aVar2);
            ProductPackStruct productPackStruct = this.this$0.f86391j;
            if (productPackStruct == null || (num = productPackStruct.f86639c) == null) {
                i2 = 1;
            } else {
                i2 = num.intValue();
            }
            aVar2.b("product_type", String.valueOf(i2));
            if (this.$fullScreen) {
                str = "full_screen";
            } else {
                str = "half_screen";
            }
            aVar2.b("page_show_type", str);
            aVar2.b("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - this.$clickBuynowStartTime));
            ProductPackStruct productPackStruct2 = this.this$0.f86391j;
            if (productPackStruct2 == null || (list = productPackStruct2.f86642f) == null || list.size() <= 6) {
                str2 = "no_greater_than_6";
            } else {
                str2 = "greater_than_6";
            }
            aVar2.b("sku_show_type", str2);
            ProductPackStruct productPackStruct3 = this.this$0.f86391j;
            if (productPackStruct3 == null || (pickTag = productPackStruct3.s) == null) {
                str3 = null;
            } else {
                str3 = pickTag.f86622d;
            }
            Map<String, ? extends Object> f2 = k.f(str3);
            if (f2 != null) {
                aVar2.a(f2);
            }
            Boolean bool = this.$isBuyWithCoupon;
            if (bool != null) {
                aVar2.b("is_buy_with_coupon", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            }
            return z.f158842a;
        }
    }

    public static void a(Map<String, ? extends Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "product_detail");
        linkedHashMap.put("popup_name", "server");
        linkedHashMap.put("error_code", "10007209");
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_popup_show", linkedHashMap);
    }

    public final void b(c.a aVar) {
        Object obj;
        String str;
        FlashSale flashSale;
        Integer num = this.f86393l;
        String str2 = null;
        if (num != null) {
            if (num.intValue() == 1) {
                obj = "warm_up";
            } else if (num.intValue() == 2) {
                obj = "on_sale";
            } else {
                return;
            }
            aVar.c("flashsale_status", obj);
            ProductPackStruct productPackStruct = this.f86391j;
            if (productPackStruct == null || (flashSale = productPackStruct.o) == null) {
                str = null;
            } else {
                str = flashSale.f86612g;
            }
            aVar.c("flashsale_price", str);
            if (h.f.b.l.a(obj, (Object) "warm_up")) {
                Long l2 = this.f86394m;
                if (l2 != null && l2.longValue() >= 86400000) {
                    str2 = "no_countdown";
                    aVar.c("countdown_type", str2);
                }
            } else {
                if (h.f.b.l.a(obj, (Object) "on_sale")) {
                    Long l3 = this.f86394m;
                    if (l3 != null && l3.longValue() >= 86400000) {
                        str2 = "gt_24";
                    }
                }
                aVar.c("countdown_type", str2);
            }
            str2 = "in_24";
            aVar.c("countdown_type", str2);
        }
    }

    public static final class o extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ Object $clickBuynowStartTime;
        final /* synthetic */ boolean $fullScreen;
        final /* synthetic */ boolean $isWithCoupon;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54111);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(k kVar, boolean z, Object obj, boolean z2) {
            super(1);
            this.this$0 = kVar;
            this.$fullScreen = z;
            this.$clickBuynowStartTime = obj;
            this.$isWithCoupon = z2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            String str;
            int i2;
            int i3;
            Float f2;
            String str2;
            PickTag pickTag;
            LogisticDTO logisticDTO;
            LogisticTextDTO logisticTextDTO;
            String str3;
            LogisticDTO logisticDTO2;
            Price price;
            LogisticDTO logisticDTO3;
            Price price2;
            String priceVal;
            LogisticDTO logisticDTO4;
            Integer num;
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            c.a.a(aVar2, this.this$0.f86382a);
            if (this.$fullScreen) {
                str = "full_screen";
            } else {
                str = "half_screen";
            }
            aVar2.b("page_show_type", str);
            ProductPackStruct productPackStruct = this.this$0.f86391j;
            if (productPackStruct == null || (num = productPackStruct.f86639c) == null) {
                i2 = 1;
            } else {
                i2 = num.intValue();
            }
            aVar2.b("product_type", String.valueOf(i2));
            ProductPackStruct productPackStruct2 = this.this$0.f86391j;
            if (productPackStruct2 == null || (logisticDTO4 = productPackStruct2.f86645i) == null) {
                i3 = 0;
            } else {
                i3 = logisticDTO4.f85889a;
            }
            aVar2.b("delivery_option", Integer.valueOf(i3));
            Object obj = this.$clickBuynowStartTime;
            if ((obj instanceof Long) && (!h.f.b.l.a(obj, (Object) -1L))) {
                aVar2.a("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) this.$clickBuynowStartTime).longValue()));
            }
            ProductPackStruct productPackStruct3 = this.this$0.f86391j;
            String str4 = null;
            if (productPackStruct3 == null || (logisticDTO3 = productPackStruct3.f86645i) == null || (price2 = logisticDTO3.f85894f) == null || (priceVal = price2.getPriceVal()) == null) {
                f2 = null;
            } else {
                f2 = h.m.p.c(priceVal);
            }
            ProductPackStruct productPackStruct4 = this.this$0.f86391j;
            if (productPackStruct4 == null || (logisticDTO2 = productPackStruct4.f86645i) == null || (price = logisticDTO2.f85894f) == null) {
                str2 = null;
            } else {
                str2 = price.getCurrency();
            }
            if (!(f2 == null || str2 == null)) {
                aVar2.b("shipping_price", f2);
                aVar2.b("shipping_currency", str2);
            }
            ProductPackStruct productPackStruct5 = this.this$0.f86391j;
            if (!(productPackStruct5 == null || (logisticDTO = productPackStruct5.f86645i) == null || (logisticTextDTO = logisticDTO.f85898j) == null || (str3 = logisticTextDTO.f85905f) == null)) {
                aVar2.b("free_shipping_condition", str3);
            }
            aVar2.b("precise_exp", Integer.valueOf(com.ss.android.ugc.aweme.ecommerce.ab.f.a()));
            ProductPackStruct productPackStruct6 = this.this$0.f86391j;
            if (!(productPackStruct6 == null || (pickTag = productPackStruct6.s) == null)) {
                str4 = pickTag.f86622d;
            }
            Map<String, ? extends Object> f3 = k.f(str4);
            if (f3 != null) {
                aVar2.a(f3);
            }
            aVar2.b("is_with_coupon", Integer.valueOf(this.$isWithCoupon ? 1 : 0));
            this.this$0.a(aVar2);
            this.this$0.b(aVar2);
            return z.f158842a;
        }
    }

    public static final class p extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ boolean $addressDeliverable;
        final /* synthetic */ boolean $clickAddCart;
        final /* synthetic */ boolean $clickCollect;
        final /* synthetic */ boolean $fullScreen;
        final /* synthetic */ boolean $isWithCoupon;
        final /* synthetic */ String $shippingFeeCurrency;
        final /* synthetic */ Float $shippingPrice;
        final /* synthetic */ boolean $skuSelected;
        final /* synthetic */ long $stayTime;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54112);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(k kVar, boolean z, long j2, boolean z2, boolean z3, boolean z4, boolean z5, Float f2, String str, boolean z6) {
            super(1);
            this.this$0 = kVar;
            this.$fullScreen = z;
            this.$stayTime = j2;
            this.$skuSelected = z2;
            this.$clickAddCart = z3;
            this.$clickCollect = z4;
            this.$addressDeliverable = z5;
            this.$shippingPrice = f2;
            this.$shippingFeeCurrency = str;
            this.$isWithCoupon = z6;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            String str;
            int i2;
            String str2;
            PickTag pickTag;
            LogisticDTO logisticDTO;
            LogisticTextDTO logisticTextDTO;
            String str3;
            LogisticDTO logisticDTO2;
            Integer num;
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            c.a.a(aVar2, this.this$0.f86382a);
            if (this.$fullScreen) {
                str = "full_screen";
            } else {
                str = "half_screen";
            }
            aVar2.b("page_show_type", str);
            ProductPackStruct productPackStruct = this.this$0.f86391j;
            int i3 = 1;
            if (productPackStruct == null || (num = productPackStruct.f86639c) == null) {
                i2 = 1;
            } else {
                i2 = num.intValue();
            }
            aVar2.b("product_type", String.valueOf(i2));
            this.this$0.a(aVar2);
            aVar2.b("sku_photo_view_cnt", Integer.valueOf(this.this$0.f86385d.size()));
            aVar2.b("main_photo_view_cnt", Integer.valueOf(this.this$0.f86384c.size()));
            aVar2.b("stay_time", Long.valueOf(this.$stayTime));
            aVar2.b("quit_type", this.this$0.y);
            aVar2.b("is_sku_selected", Integer.valueOf(this.$skuSelected ? 1 : 0));
            aVar2.b("is_add_cart", Integer.valueOf(this.$clickAddCart ? 1 : 0));
            aVar2.b("is_collection_clicked", Integer.valueOf(this.$clickCollect ? 1 : 0));
            aVar2.b("is_image_clicked", Integer.valueOf(this.this$0.f86386e ? 1 : 0));
            aVar2.b("is_seller_store_entered", Integer.valueOf(this.this$0.f86392k ? 1 : 0));
            int i4 = 0;
            if (this.this$0.f86391j == null) {
                i3 = 0;
            }
            aVar2.b("is_load_data", Integer.valueOf(i3));
            aVar2.b("is_address_deliverable", Integer.valueOf(this.$addressDeliverable ? 1 : 0));
            ProductPackStruct productPackStruct2 = this.this$0.f86391j;
            if (!(productPackStruct2 == null || (logisticDTO2 = productPackStruct2.f86645i) == null)) {
                i4 = logisticDTO2.f85889a;
            }
            aVar2.b("delivery_option", Integer.valueOf(i4));
            Float f2 = this.$shippingPrice;
            if (!(f2 == null || this.$shippingFeeCurrency == null)) {
                aVar2.b("shipping_price", f2);
                aVar2.b("shipping_currency", this.$shippingFeeCurrency);
            }
            this.this$0.b(aVar2);
            ProductPackStruct productPackStruct3 = this.this$0.f86391j;
            if (!(productPackStruct3 == null || (logisticDTO = productPackStruct3.f86645i) == null || (logisticTextDTO = logisticDTO.f85898j) == null || (str3 = logisticTextDTO.f85905f) == null)) {
                aVar2.b("free_shipping_condition", str3);
            }
            ProductPackStruct productPackStruct4 = this.this$0.f86391j;
            if (productPackStruct4 == null || (pickTag = productPackStruct4.s) == null) {
                str2 = null;
            } else {
                str2 = pickTag.f86622d;
            }
            Map<String, ? extends Object> f3 = k.f(str2);
            if (f3 != null) {
                aVar2.a(f3);
            }
            aVar2.b("is_with_coupon", Integer.valueOf(this.$isWithCoupon ? 1 : 0));
            return z.f158842a;
        }
    }

    public final void a(com.ss.android.ugc.aweme.ecommerce.pdp.d.g gVar) {
        h.f.b.l.d(gVar, "");
        if (!this.E) {
            this.E = true;
            com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_module_show", new j(this, gVar));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0067, code lost:
        if (r1.length() == 0) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct r7) {
        /*
        // Method dump skipped, instructions count: 221
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.b.k.a(com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct):void");
    }

    public final void b(boolean z2) {
        this.o = z2;
        this.f86382a.put("is_single_sku", Integer.valueOf(z2 ? 1 : 0));
    }

    public final void a(ReviewItemStruct reviewItemStruct) {
        h.f.b.l.d(reviewItemStruct, "");
        if (!this.G.contains(reviewItemStruct.f87055a.f87068a)) {
            this.G.add(reviewItemStruct.f87055a.f87068a);
            com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_review_show", new r(this, reviewItemStruct));
        }
    }

    public final void a(SkuPrice skuPrice, int i2) {
        com.ss.android.ugc.aweme.ecommerce.track.c.a("StartCheckout", new b(this, skuPrice, i2));
    }

    public static void a(c.a aVar, ProductDetailReview productDetailReview) {
        int i2;
        if (productDetailReview == null || productDetailReview.f86630a == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        aVar.b("has_rate", Integer.valueOf(i2));
        if (productDetailReview != null) {
            Float f2 = productDetailReview.f86630a;
            if (f2 != null) {
                aVar.b("rate", Float.valueOf(f2.floatValue()));
            }
            Integer num = productDetailReview.f86631b;
            if (num != null) {
                aVar.b("review_cnt", Integer.valueOf(num.intValue()));
            }
        }
    }

    public k(Context context, IPdpStarter.PdpEnterParam pdpEnterParam) {
        String str;
        h.f.b.l.d(context, "");
        h.f.b.l.d(pdpEnterParam, "");
        this.B = pdpEnterParam;
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        this.f86382a = linkedHashMap;
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "product_detail");
        HashMap<String, Object> trackParams = pdpEnterParam.getTrackParams();
        if (trackParams != null) {
            linkedHashMap.putAll(trackParams);
        }
        linkedHashMap.remove("user_id");
        if (this.n) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        linkedHashMap.put("page_show_type", str);
        a(pdpEnterParam.getFullScreen());
        b(false);
        this.q = SystemClock.elapsedRealtime();
        this.r = SystemClock.elapsedRealtime();
        TrackerProvider.a.a(context, this);
        this.D = new LinkedHashSet();
        this.G = new HashSet<>();
        this.H = new HashSet<>();
    }

    public final void b(String str, Boolean bool) {
        h.f.b.l.d(str, "");
        new e(str, bool).c(this.f86382a);
    }

    public final void b(String str, HashMap<String, Object> hashMap) {
        h.f.b.l.d(str, "");
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_button_click", new e(this, str, hashMap));
    }

    private void a(String str, String str2, int i2, boolean z2) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        if (!this.H.contains(str2)) {
            this.H.add(str2);
            com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_photo_show", new q(this, str2, i2, str, z2));
        }
    }

    public static /* synthetic */ void a(k kVar, String str, boolean z2, Float f2, String str2, String str3, int i2) {
        Float f3 = f2;
        String str4 = str2;
        String str5 = null;
        if ((i2 & 4) != 0) {
            f3 = null;
        }
        if ((i2 & 8) != 0) {
            str4 = null;
        }
        if ((i2 & 32) == 0) {
            str5 = str3;
        }
        kVar.a(str, z2, f3, str4, false, str5);
    }
}
