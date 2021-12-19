package com.ss.android.ugc.aweme.ecommerce.sku.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.track.c;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashMap<String, Object> f87365a = new LinkedHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final a f87366b = new a();

    public static String a(int i2) {
        return i2 <= 6 ? "no_greater_than_6" : "greater_than_6";
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(54847);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.a.a$a  reason: collision with other inner class name */
    public static final class C2109a extends m implements h.f.a.b<c.a, z> {
        final /* synthetic */ int $count;
        final /* synthetic */ String $pageType;
        final /* synthetic */ ProductPackStruct $productInfoPack;
        final /* synthetic */ SkuPrice $skuPrice;
        final /* synthetic */ Map $trackParams;

        static {
            Covode.recordClassIndex(54848);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2109a(Map map, ProductPackStruct productPackStruct, SkuPrice skuPrice, int i2, String str) {
            super(1);
            this.$trackParams = map;
            this.$productInfoPack = productPackStruct;
            this.$skuPrice = skuPrice;
            this.$count = i2;
            this.$pageType = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            l.d(aVar2, "");
            com.ss.android.ugc.aweme.ecommerce.util.a.a(aVar2, this.$trackParams, this.$productInfoPack, this.$skuPrice, this.$count, this.$pageType);
            return z.f158842a;
        }
    }

    public static final class d extends m implements h.f.a.b<c.a, z> {
        final /* synthetic */ String $previousPage;
        final /* synthetic */ int $skuNumber;
        final /* synthetic */ String $sourceButton;

        static {
            Covode.recordClassIndex(54851);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(int i2, String str, String str2) {
            super(1);
            this.$skuNumber = i2;
            this.$previousPage = str;
            this.$sourceButton = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            String str;
            c.a aVar2 = aVar;
            l.d(aVar2, "");
            c.a.a(aVar2, a.f87365a);
            aVar2.a("page_name", "sku");
            aVar2.a("sku_show_type", a.a(this.$skuNumber));
            if (!a.f87365a.containsKey("previous_page") && (str = this.$previousPage) != null) {
                aVar2.a("previous_page", str);
            }
            String str2 = this.$sourceButton;
            if (str2 != null) {
                aVar2.a("source_button", str2);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<c.a, z> {
        final /* synthetic */ String $cartForm;
        final /* synthetic */ Integer $isSingleSku;
        final /* synthetic */ String $pageName;
        final /* synthetic */ String $previousPageName;
        final /* synthetic */ String $skuId;
        final /* synthetic */ String $sourceButton;
        final /* synthetic */ Map $trackParams;

        static {
            Covode.recordClassIndex(54849);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Map map, String str, String str2, Integer num, String str3, String str4, String str5) {
            super(1);
            this.$trackParams = map;
            this.$sourceButton = str;
            this.$skuId = str2;
            this.$isSingleSku = num;
            this.$cartForm = str3;
            this.$pageName = str4;
            this.$previousPageName = str5;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            String str;
            c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.a(this.$trackParams);
            String str2 = this.$sourceButton;
            if (str2 != null) {
                aVar2.a("source_button", str2);
            }
            String str3 = this.$skuId;
            if (str3 != null) {
                aVar2.a("sku_id", str3);
            }
            Integer num = this.$isSingleSku;
            if (num != null) {
                num.intValue();
                aVar2.a("is_single_sku", this.$isSingleSku);
            }
            String str4 = this.$cartForm;
            if (str4 != null) {
                aVar2.a("cart_form", str4);
            }
            String str5 = this.$pageName;
            if (str5 != null) {
                aVar2.a("page_name", str5);
            }
            if (!this.$trackParams.containsKey("previous_page") && (str = this.$previousPageName) != null) {
                aVar2.a("previous_page", str);
            }
            return z.f158842a;
        }
    }

    public static final class e extends m implements h.f.a.b<c.a, z> {
        final /* synthetic */ long $duration;
        final /* synthetic */ boolean $isLoadData;
        final /* synthetic */ String $previousPage;
        final /* synthetic */ String $quitType;
        final /* synthetic */ int $skuNumber;
        final /* synthetic */ String $sourceButton;

        static {
            Covode.recordClassIndex(54852);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(int i2, long j2, String str, boolean z, String str2, String str3) {
            super(1);
            this.$skuNumber = i2;
            this.$duration = j2;
            this.$quitType = str;
            this.$isLoadData = z;
            this.$previousPage = str2;
            this.$sourceButton = str3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            String str;
            c.a aVar2 = aVar;
            l.d(aVar2, "");
            c.a.a(aVar2, a.f87365a);
            aVar2.a("page_name", "sku");
            aVar2.a("sku_show_type", a.a(this.$skuNumber));
            aVar2.a("stay_time", Long.valueOf(this.$duration));
            aVar2.a("quit_type", this.$quitType);
            aVar2.a("is_load_data", Integer.valueOf(this.$isLoadData ? 1 : 0));
            if (!a.f87365a.containsKey("previous_page") && (str = this.$previousPage) != null) {
                aVar2.a("previous_page", str);
            }
            String str2 = this.$sourceButton;
            if (str2 != null) {
                aVar2.a("source_button", str2);
            }
            return z.f158842a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        if (r1.length() == 0) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct r7) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.sku.a.a.a(com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct):void");
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<c.a, z> {
        final /* synthetic */ Integer $addSkuNum;
        final /* synthetic */ String $cartForm;
        final /* synthetic */ String $cartItemId;
        final /* synthetic */ String $failReason;
        final /* synthetic */ Map $generalParams;
        final /* synthetic */ Integer $isSingleSku;
        final /* synthetic */ Integer $isSuccess;
        final /* synthetic */ String $pageName;
        final /* synthetic */ String $previousPageName;
        final /* synthetic */ String $skuId;
        final /* synthetic */ Integer $skuNumAfter;
        final /* synthetic */ Integer $skuNumBefore;
        final /* synthetic */ String $sourceButton;

        static {
            Covode.recordClassIndex(54850);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Map map, String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, Integer num3, Integer num4, Integer num5, String str6, String str7) {
            super(1);
            this.$generalParams = map;
            this.$cartItemId = str;
            this.$sourceButton = str2;
            this.$skuId = str3;
            this.$isSingleSku = num;
            this.$cartForm = str4;
            this.$isSuccess = num2;
            this.$failReason = str5;
            this.$addSkuNum = num3;
            this.$skuNumBefore = num4;
            this.$skuNumAfter = num5;
            this.$pageName = str6;
            this.$previousPageName = str7;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            String str;
            c.a aVar2 = aVar;
            l.d(aVar2, "");
            Map<String, ? extends Object> map = this.$generalParams;
            if (map == null) {
                map = a.f87365a;
            }
            aVar2.a(map);
            String str2 = this.$cartItemId;
            if (str2 != null) {
                aVar2.a("cart_item_id", str2);
            }
            String str3 = this.$sourceButton;
            if (str3 != null) {
                aVar2.a("source_button", str3);
            }
            String str4 = this.$skuId;
            if (str4 != null) {
                aVar2.a("sku_id", str4);
            }
            Integer num = this.$isSingleSku;
            if (num != null) {
                num.intValue();
                aVar2.a("is_single_sku", this.$isSingleSku);
            }
            String str5 = this.$cartForm;
            if (str5 != null) {
                aVar2.a("cart_form", str5);
            }
            Integer num2 = this.$isSuccess;
            if (num2 != null) {
                num2.intValue();
                aVar2.a("is_success", this.$isSuccess);
            }
            String str6 = this.$failReason;
            if (str6 != null) {
                aVar2.a("fail_reason", str6);
            }
            Integer num3 = this.$addSkuNum;
            if (num3 != null) {
                num3.intValue();
                aVar2.a("add_sku_num", this.$addSkuNum);
            }
            Integer num4 = this.$skuNumBefore;
            if (num4 != null) {
                num4.intValue();
                aVar2.a("sku_num_before", this.$skuNumBefore);
            }
            Integer num5 = this.$skuNumAfter;
            if (num5 != null) {
                num5.intValue();
                aVar2.a("sku_num_after", this.$skuNumAfter);
            }
            String str7 = this.$pageName;
            if (str7 != null) {
                aVar2.a("page_name", str7);
            }
            if (!map.containsKey("previous_page") && (str = this.$previousPageName) != null) {
                aVar2.a("previous_page", str);
            }
            return z.f158842a;
        }
    }

    public static void a(ProductPackStruct productPackStruct, SkuPrice skuPrice, int i2, Map<String, ? extends Object> map, String str) {
        Map<String, ? extends Object> map2 = map;
        if (map2 == null) {
            map2 = f87365a;
        }
        com.ss.android.ugc.aweme.ecommerce.track.c.a("AddToCart", new C2109a(map2, productPackStruct, skuPrice, i2, str));
    }

    public static void a(String str, String str2, Integer num, String str3, String str4, String str5, Map<String, ? extends Object> map) {
        Map<String, ? extends Object> map2 = map;
        if (map2 == null) {
            map2 = f87365a;
        }
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_confirm_cart", new b(map2, str, str2, num, str3, str4, str5));
    }

    public static void a(String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, Integer num3, Integer num4, Integer num5, String str6, String str7, Map<String, ? extends Object> map) {
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_confirm_cart_result", new c(map, str, str2, str3, num, str4, num2, str5, num3, num4, num5, str6, str7));
    }
}
