package com.bytedance.android.live.wallet.api;

import com.bytedance.android.live.wallet.c.c;
import com.bytedance.android.live.wallet.g;
import com.bytedance.android.livesdk.wallet.e;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.globalpayment.iap.common.ability.c.a;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class b implements a {

    /* renamed from: d  reason: collision with root package name */
    private static b f13042d;

    /* renamed from: a  reason: collision with root package name */
    public String f13043a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13044b = false;

    /* renamed from: c  reason: collision with root package name */
    private final List<g> f13045c = new CopyOnWriteArrayList();

    static {
        Covode.recordClassIndex(7245);
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(6175);
        if (f13042d == null) {
            synchronized (b.class) {
                try {
                    if (f13042d == null) {
                        f13042d = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6175);
                    throw th;
                }
            }
        }
        b bVar = f13042d;
        MethodCollector.o(6175);
        return bVar;
    }

    public final void b(g gVar) {
        this.f13045c.remove(gVar);
    }

    public final void a(g gVar) {
        if (!this.f13045c.contains(gVar) && gVar != null) {
            this.f13045c.add(gVar);
        }
    }

    private void a(int i2, Object obj) {
        for (g gVar : this.f13045c) {
            if (gVar != null) {
                gVar.a(i2, obj);
            }
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.c.a
    public final void a(d dVar, OrderInfo orderInfo) {
        String str;
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.f13045c) && orderInfo != null && dVar != null && m.a(orderInfo.getExtraPayload(), "0") && m.a(this.f13043a, orderInfo.getUserId())) {
            if (dVar.f30274b == null || !dVar.f30274b.f30267g) {
                str = "ttlive_pipo_create_order";
            } else {
                str = "ttlive_pipo_iap_subscription";
            }
            if (dVar.getCode() != 0) {
                a(2, dVar.getCode(), dVar.getDetailCode(), str, new Exception(dVar.getMessage()), new com.bytedance.android.livesdk.wallet.g(orderInfo.getProductId(), orderInfo.getOrderId()));
            } else if (orderInfo.getOrderId() == null) {
                a(2, 32, -1, str, new Exception("create pipo order fail"), new com.bytedance.android.livesdk.wallet.g(orderInfo.getProductId(), orderInfo.getOrderId()));
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("sku_id", orderInfo.getProductId());
                hashMap.put("order_id", orderInfo.getOrderId());
                c.a(str, hashMap);
                a(2, new e(orderInfo.getProductId(), orderInfo.getOrderId(), orderInfo.getUserId()));
            }
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.c.a
    public final void b(d dVar, OrderInfo orderInfo) {
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.f13045c) && orderInfo != null && dVar != null && m.a(orderInfo.getExtraPayload(), "0") && m.a(this.f13043a, orderInfo.getUserId())) {
            if (dVar.getCode() != 0) {
                a(2, dVar.getCode(), dVar.getDetailCode(), "ttlive_wallet_supplement_order", new Exception(dVar.getMessage()), new com.bytedance.android.livesdk.wallet.g(orderInfo.getProductId(), orderInfo.getOrderId()));
            } else if (orderInfo.getOrderId() == null) {
                a(2, 51, -1, "ttlive_wallet_supplement_order", new Exception("supplement_order_fail"), new com.bytedance.android.livesdk.wallet.g(orderInfo.getProductId(), orderInfo.getOrderId()));
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("order_id", orderInfo.getOrderId());
                c.a("ttlive_wallet_supplement_order", hashMap);
                a(2, new e(orderInfo.getProductId(), orderInfo.getOrderId(), orderInfo.getUserId()));
            }
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.c.a
    public final void a(d dVar, List<AbsIapProduct> list) {
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.f13045c) && dVar != null && m.a(dVar.f30273a, "0")) {
            if (dVar.getCode() != 0) {
                a(1, dVar.getCode(), dVar.getDetailCode(), "ttlive_query_pipo_purchase", new Exception(dVar.getMessage()), new com.bytedance.android.livesdk.wallet.g("", ""));
            } else if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
                a(1, 21, -1, "ttlive_query_pipo_purchase", new Exception("query pipo purchase empty"), new com.bytedance.android.livesdk.wallet.g("", ""));
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("item_size", Integer.valueOf(list.size()));
                c.a("ttlive_query_pipo_purchase", hashMap);
                ArrayList arrayList = new ArrayList();
                for (AbsIapProduct absIapProduct : list) {
                    if (absIapProduct != null) {
                        com.bytedance.android.livesdk.wallet.c cVar = new com.bytedance.android.livesdk.wallet.c(absIapProduct.getProductId(), absIapProduct.getPrice(), absIapProduct.getPriceCurrencyCode(), absIapProduct.getPriceAmountMicros(), absIapProduct.getDescription());
                        if (absIapProduct.getChannelUserData() != null) {
                            cVar.f22414j = new com.bytedance.android.livesdk.wallet.a(absIapProduct.getChannelUserData().getUserId(), absIapProduct.getChannelUserData().getUserMarkPlace());
                        }
                        arrayList.add(cVar);
                    }
                }
                a(1, arrayList);
            }
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.c.a
    public final void b(d dVar, List<AbsIapProduct> list) {
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.f13045c) && dVar != null) {
            if (dVar.getCode() != 0) {
                a(4, dVar.getCode(), dVar.getDetailCode(), "ttlive_fetch_subscription_products", new Exception(dVar.getMessage()), new com.bytedance.android.livesdk.wallet.g("", ""));
            } else if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
                a(4, 21, -1, "ttlive_fetch_subscription_products", new Exception("query pipo purchase empty"), new com.bytedance.android.livesdk.wallet.g("", ""));
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("item_size", Integer.valueOf(list.size()));
                c.a("ttlive_fetch_subscription_products", hashMap);
                ArrayList arrayList = new ArrayList();
                for (AbsIapProduct absIapProduct : list) {
                    if (absIapProduct != null) {
                        arrayList.add(new com.bytedance.android.livesdk.wallet.c(absIapProduct.getProductId(), absIapProduct.getPrice(), absIapProduct.getPriceCurrencyCode(), absIapProduct.getPriceAmountMicros(), absIapProduct.getDescription()));
                    }
                }
                a(4, arrayList);
            }
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.c.a
    public final void a(IapPaymentMethod iapPaymentMethod, d dVar) {
        String str;
        HashMap hashMap = new HashMap();
        if (iapPaymentMethod != null) {
            str = iapPaymentMethod.channelName;
        } else {
            str = "";
        }
        hashMap.put("pay_method", str);
        if (dVar == null) {
            c.a("ttlive_pipo_init", -1, -1, "iapResult is null", hashMap);
        } else if (!dVar.isSuccess()) {
            c.a("ttlive_pipo_init", dVar.getCode(), dVar.getDetailCode(), dVar.getMessage(), hashMap);
        }
    }

    private void a(int i2, int i3, int i4, String str, Exception exc, com.bytedance.android.livesdk.wallet.g gVar) {
        HashMap hashMap = new HashMap();
        if (i2 == 2) {
            hashMap.put("order_id", gVar.f22422b);
            hashMap.put("sku_id", gVar.f22421a);
        }
        c.a(str, i3, i4, exc.getMessage(), hashMap);
        com.bytedance.android.live.wallet.c.a.a(i3, i4, exc.getMessage());
        for (g gVar2 : this.f13045c) {
            if (gVar2 != null) {
                gVar2.a(i2, i3, i4, exc, gVar);
            }
        }
    }
}
