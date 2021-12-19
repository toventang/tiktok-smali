package com.ss.android.ugc.aweme.ecommerce.delivery;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.track.c;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashMap<String, Object> f85809a = new LinkedHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static long f85810b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static final a f85811c = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(53670);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.a$a  reason: collision with other inner class name */
    static final class C2058a extends m implements h.f.a.b<Map<String, Object>, z> {
        final /* synthetic */ String $freeShippingCondition;
        final /* synthetic */ String $optionName;
        final /* synthetic */ String $optionType;
        final /* synthetic */ int $rank;
        final /* synthetic */ String $shippingFeeCurrency;
        final /* synthetic */ Float $shippingPrice;

        static {
            Covode.recordClassIndex(53671);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2058a(String str, String str2, int i2, Float f2, String str3, String str4) {
            super(1);
            this.$optionName = str;
            this.$optionType = str2;
            this.$rank = i2;
            this.$shippingPrice = f2;
            this.$shippingFeeCurrency = str3;
            this.$freeShippingCondition = str4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Map<String, Object> map) {
            Map<String, Object> map2 = map;
            String str = "";
            l.d(map2, str);
            String str2 = this.$optionName;
            if (str2 != null) {
                str = str2;
            }
            map2.put("option_name", str);
            map2.put("option_type", this.$optionType);
            map2.put("rank", Integer.valueOf(this.$rank));
            Object obj = this.$shippingPrice;
            if (obj != null) {
                map2.put("shipping_price", obj);
            }
            Object obj2 = this.$shippingFeeCurrency;
            if (obj2 != null) {
                map2.put("shipping_currency", obj2);
            }
            Object obj3 = this.$freeShippingCondition;
            if (obj3 != null) {
                map2.put("free_shipping_condition", obj3);
            }
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<Map<String, Object>, z> {
        final /* synthetic */ String $freeShippingCondition;
        final /* synthetic */ String $optionName;
        final /* synthetic */ String $optionType;
        final /* synthetic */ int $rank;
        final /* synthetic */ String $shippingFeeCurrency;
        final /* synthetic */ Float $shippingPrice;

        static {
            Covode.recordClassIndex(53673);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str, String str2, int i2, Float f2, String str3, String str4) {
            super(1);
            this.$optionName = str;
            this.$optionType = str2;
            this.$rank = i2;
            this.$shippingPrice = f2;
            this.$shippingFeeCurrency = str3;
            this.$freeShippingCondition = str4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Map<String, Object> map) {
            Map<String, Object> map2 = map;
            String str = "";
            l.d(map2, str);
            String str2 = this.$optionName;
            if (str2 != null) {
                str = str2;
            }
            map2.put("option_name", str);
            map2.put("option_type", this.$optionType);
            map2.put("rank", Integer.valueOf(this.$rank));
            Object obj = this.$shippingPrice;
            if (obj != null) {
                map2.put("shipping_price", obj);
            }
            Object obj2 = this.$shippingFeeCurrency;
            if (obj2 != null) {
                map2.put("shipping_currency", obj2);
            }
            Object obj3 = this.$freeShippingCondition;
            if (obj3 != null) {
                map2.put("free_shipping_condition", obj3);
            }
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<c.a, z> {
        final /* synthetic */ boolean $hasAddress;
        final /* synthetic */ DeliveryPanelState $result;

        static {
            Covode.recordClassIndex(53672);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z, DeliveryPanelState deliveryPanelState) {
            super(1);
            this.$hasAddress = z;
            this.$result = deliveryPanelState;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            LogisticTextDTO logisticTextDTO;
            String str;
            Price price;
            String currency;
            Price price2;
            String priceVal;
            Float c2;
            int i2;
            c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.a(a.f85809a);
            int i3 = 0;
            aVar2.b("is_fullscreen", 0);
            aVar2.b("is_delivery_info_complete", Integer.valueOf(this.$hasAddress ? 1 : 0));
            if (this.$hasAddress) {
                if (this.$result.getSelectedLogistic() != null) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                aVar2.b("is_address_deliverable", Integer.valueOf(i2));
            }
            LogisticDTO selectedLogistic = this.$result.getSelectedLogistic();
            if (!(selectedLogistic == null || (price2 = selectedLogistic.f85894f) == null || (priceVal = price2.getPriceVal()) == null || (c2 = p.c(priceVal)) == null)) {
                aVar2.b("shipping_price", Float.valueOf(c2.floatValue()));
            }
            LogisticDTO selectedLogistic2 = this.$result.getSelectedLogistic();
            if (!(selectedLogistic2 == null || (price = selectedLogistic2.f85894f) == null || (currency = price.getCurrency()) == null)) {
                aVar2.b("shipping_currency", currency);
            }
            LogisticDTO selectedLogistic3 = this.$result.getSelectedLogistic();
            if (!(selectedLogistic3 == null || (logisticTextDTO = selectedLogistic3.f85898j) == null || (str = logisticTextDTO.f85905f) == null)) {
                aVar2.b("free_shipping_condition", str);
            }
            LogisticDTO selectedLogistic4 = this.$result.getSelectedLogistic();
            if (selectedLogistic4 != null) {
                i3 = selectedLogistic4.f85889a;
            }
            aVar2.b("delivery_option", Integer.valueOf(i3));
            return z.f158842a;
        }
    }

    public static final class d extends m implements h.f.a.b<c.a, z> {
        final /* synthetic */ boolean $addressReachable;
        final /* synthetic */ boolean $didLoaded;
        final /* synthetic */ long $duration;
        final /* synthetic */ String $freeShippingCondition;
        final /* synthetic */ boolean $hasAddress;
        final /* synthetic */ Integer $normalDeliveryOption;
        final /* synthetic */ String $quitType;
        final /* synthetic */ DeliveryPanelStarter.PackedDeliverySelectResult $result;
        final /* synthetic */ String $shippingCurrency;
        final /* synthetic */ Float $shippingPrice;

        static {
            Covode.recordClassIndex(53674);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(long j2, boolean z, String str, boolean z2, boolean z3, DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult, Integer num, Float f2, String str2, String str3) {
            super(1);
            this.$duration = j2;
            this.$hasAddress = z;
            this.$quitType = str;
            this.$addressReachable = z2;
            this.$didLoaded = z3;
            this.$result = packedDeliverySelectResult;
            this.$normalDeliveryOption = num;
            this.$shippingPrice = f2;
            this.$shippingCurrency = str2;
            this.$freeShippingCondition = str3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            Integer num;
            c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.a(a.f85809a);
            aVar2.a("stay_time", Long.valueOf(this.$duration));
            aVar2.b("is_fullscreen", 0);
            aVar2.b("is_delivery_info_complete", Integer.valueOf(this.$hasAddress ? 1 : 0));
            aVar2.b("quit_type", this.$quitType);
            if (this.$hasAddress) {
                aVar2.b("is_address_deliverable", Integer.valueOf(this.$addressReachable ? 1 : 0));
            }
            aVar2.b("is_load_data", Integer.valueOf(this.$didLoaded ? 1 : 0));
            LogisticDTO logisticDTO = this.$result.f85806a;
            if (logisticDTO != null) {
                num = Integer.valueOf(logisticDTO.f85889a);
            } else {
                num = this.$normalDeliveryOption;
            }
            if (num != null) {
                aVar2.b("delivery_option", num);
            }
            Float f2 = this.$shippingPrice;
            if (f2 != null) {
                aVar2.b("shipping_price", f2);
            }
            String str = this.$shippingCurrency;
            if (str != null) {
                aVar2.b("shipping_currency", str);
            }
            String str2 = this.$freeShippingCondition;
            if (str2 != null) {
                aVar2.b("free_shipping_condition", str2);
            }
            return z.f158842a;
        }
    }

    public static void a(DeliveryPanelState deliveryPanelState, boolean z) {
        l.d(deliveryPanelState, "");
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_enter_page", new b(z, deliveryPanelState));
    }

    public static void a(String str, String str2, Float f2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(f85809a);
        linkedHashMap.put("button_name", str);
        linkedHashMap.put("button_type", str2);
        if (f2 != null) {
            linkedHashMap.put("shipping_price", f2);
        }
        if (str3 != null) {
            linkedHashMap.put("shipping_currency", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("free_shipping_condition", str4);
        }
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_button_click", linkedHashMap);
    }

    public static void a(String str, String str2, int i2, Float f2, String str3, String str4) {
        l.d(str2, "");
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_select_option", f85809a, new c(str, str2, i2, f2, str3, str4));
    }

    public static void b(String str, String str2, int i2, Float f2, String str3, String str4) {
        l.d(str2, "");
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_option_show", f85809a, new C2058a(str, str2, i2, f2, str3, str4));
    }
}
