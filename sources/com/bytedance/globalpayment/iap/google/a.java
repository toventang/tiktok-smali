package com.bytedance.globalpayment.iap.google;

import android.app.Activity;
import android.app.Application;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.b;
import com.android.billingclient.api.d;
import com.android.billingclient.api.e;
import com.android.billingclient.api.f;
import com.android.billingclient.api.g;
import com.android.billingclient.api.h;
import com.android.billingclient.api.i;
import com.android.billingclient.api.k;
import com.android.billingclient.api.l;
import com.android.billingclient.api.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.google.b.b;
import com.bytedance.globalpayment.iap.google.helper.RestoreOrderService;
import com.bytedance.globalpayment.iap.google.helper.c;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class a implements k, com.bytedance.globalpayment.iap.google.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f30343a = a.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f30344b = false;
    private static String p = "CONSTRUCT_YOUR";
    private static volatile com.bytedance.globalpayment.iap.google.a.a t;

    /* renamed from: c  reason: collision with root package name */
    public AtomicBoolean f30345c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    public ConcurrentMap<String, ConsumeIapProductListener> f30346d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    public CopyOnWriteArraySet<Purchase> f30347e = new CopyOnWriteArraySet<>();

    /* renamed from: f  reason: collision with root package name */
    public CopyOnWriteArraySet<b> f30348f = new CopyOnWriteArraySet<>();

    /* renamed from: g  reason: collision with root package name */
    public Map<String, SkuDetails> f30349g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    List<AbsIapChannelOrderData> f30350h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public AtomicBoolean f30351i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    public d f30352j;

    /* renamed from: k  reason: collision with root package name */
    public com.bytedance.globalpayment.iap.common.ability.d.a f30353k;

    /* renamed from: l  reason: collision with root package name */
    public AtomicBoolean f30354l = new AtomicBoolean(false);

    /* renamed from: m  reason: collision with root package name */
    public boolean f30355m;
    private ConcurrentMap<String, com.bytedance.globalpayment.iap.google.b.a> n = new ConcurrentHashMap();
    private ConcurrentMap<String, com.bytedance.globalpayment.iap.google.b.a> o = new ConcurrentHashMap();
    private ConcurrentHashMap<String, AbsIapChannelOrderData> q = new ConcurrentHashMap<>();
    private b r = new b() {
        /* class com.bytedance.globalpayment.iap.google.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(17617);
        }

        @Override // com.bytedance.globalpayment.iap.google.b.b
        public final void a() {
            a.this.f30353k.onPurchasesUpdated(null, null);
            RestoreOrderService.getIns(com.bytedance.globalpayment.payment.common.lib.h.a.a().i().b());
            if (!com.bytedance.globalpayment.payment.common.lib.h.a.a().h().d()) {
                com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            }
        }

        @Override // com.bytedance.globalpayment.iap.google.b.b
        public final void a(com.bytedance.globalpayment.iap.common.ability.d dVar) {
            a.this.f30353k.onQueryFinished(IapPaymentMethod.GOOGLE, null, null);
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        }
    };
    private f s = new f() {
        /* class com.bytedance.globalpayment.iap.google.a.AnonymousClass3 */

        static {
            Covode.recordClassIndex(17620);
        }

        @Override // com.android.billingclient.api.f
        public final void a() {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            a.this.f30354l.set(false);
            a.this.f30345c.set(false);
            a.this.f30345c.set(false);
        }

        @Override // com.android.billingclient.api.f
        public final void b(h hVar) {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            a.this.f30354l.set(false);
            com.bytedance.globalpayment.iap.common.ability.d a2 = c.a(hVar);
            if (hVar.f5852a == 0) {
                a.this.f30345c.set(true);
                Iterator<b> it = a.this.f30348f.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                a.this.f30348f.clear();
                return;
            }
            a.this.f30345c.set(false);
            Iterator<b> it2 = a.this.f30348f.iterator();
            while (it2.hasNext()) {
                it2.next().a(a2);
            }
            a.this.f30348f.clear();
        }
    };
    private Application u;

    @Override // com.bytedance.globalpayment.iap.google.a.a
    public final boolean b() {
        return this.f30355m;
    }

    @Override // com.bytedance.globalpayment.iap.google.a.a
    public final void a(final com.bytedance.globalpayment.iap.common.ability.d.b bVar) {
        if (this.f30352j == null) {
            d.a aVar = new d.a(com.bytedance.globalpayment.payment.common.lib.h.a.a().i().b(), (byte) 0);
            aVar.f5819c = this;
            aVar.f5817a = true;
            if (aVar.f5818b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            } else if (aVar.f5819c == null) {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            } else if (aVar.f5817a) {
                this.f30352j = new e(aVar.f5817a, aVar.f5818b, aVar.f5819c);
            } else {
                throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
            }
        }
        p = com.bytedance.globalpayment.payment.common.lib.h.a.a().i().d().f30540b;
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        this.f30348f.size();
        this.f30348f.add(this.r);
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        this.f30348f.size();
        a(new b() {
            /* class com.bytedance.globalpayment.iap.google.a.AnonymousClass4 */

            static {
                Covode.recordClassIndex(17621);
            }

            @Override // com.bytedance.globalpayment.iap.google.b.b
            public final void a() {
                a.this.f30355m = true;
                bVar.a((com.bytedance.globalpayment.iap.common.ability.d) new com.bytedance.globalpayment.iap.common.ability.d().withErrorCode(0));
            }

            @Override // com.bytedance.globalpayment.iap.google.b.b
            public final void a(com.bytedance.globalpayment.iap.common.ability.d dVar) {
                bVar.a(dVar);
            }
        });
    }

    public final void a(b bVar) {
        if (this.f30354l.get()) {
            this.f30348f.add(bVar);
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            this.f30348f.size();
        } else if (this.f30345c.get()) {
            bVar.a();
        } else {
            this.f30348f.add(bVar);
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            this.f30348f.size();
            try {
                if (!this.f30354l.getAndSet(true)) {
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    this.f30352j.a(this.s);
                }
            } catch (Throwable th) {
                com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                th.getMessage();
            }
        }
    }

    @Override // com.bytedance.globalpayment.iap.google.a.a
    public final void a(final com.bytedance.globalpayment.iap.a.b bVar) {
        a(new b() {
            /* class com.bytedance.globalpayment.iap.google.a.AnonymousClass5 */

            static {
                Covode.recordClassIndex(17622);
            }

            @Override // com.bytedance.globalpayment.iap.google.b.b
            public final void a() {
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    com.bytedance.common.utility.b.e.a(new Runnable() {
                        /* class com.bytedance.globalpayment.iap.google.a.AnonymousClass5.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(17623);
                        }

                        public final void run() {
                            a.this.b(bVar);
                        }
                    });
                } else {
                    a.this.b(bVar);
                }
            }

            @Override // com.bytedance.globalpayment.iap.google.b.b
            public final void a(com.bytedance.globalpayment.iap.common.ability.d dVar) {
                com.bytedance.globalpayment.iap.a.b bVar = bVar;
                if (bVar != null) {
                    bVar.onQueryFinished(IapPaymentMethod.GOOGLE, dVar, Collections.emptyList());
                }
            }
        });
    }

    @Override // com.bytedance.globalpayment.iap.google.a.a
    public final void a(final boolean z, final String str, final ConsumeIapProductListener consumeIapProductListener) {
        if (this.f30346d.containsKey(str)) {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        } else {
            a(new b() {
                /* class com.bytedance.globalpayment.iap.google.a.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(17625);
                }

                @Override // com.bytedance.globalpayment.iap.google.b.b
                public final void a() {
                    boolean z = z;
                    String str = str;
                    ConsumeIapProductListener consumeIapProductListener = consumeIapProductListener;
                    if (consumeIapProductListener != null) {
                        a.this.f30346d.put(str, consumeIapProductListener);
                    }
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    if (z) {
                        b.a aVar = new b.a((byte) 0);
                        aVar.f5816a = str;
                        if (aVar.f5816a != null) {
                            com.android.billingclient.api.b bVar = new com.android.billingclient.api.b((byte) 0);
                            bVar.f5815a = aVar.f5816a;
                            a.this.f30352j.a(bVar, new b(this, str));
                            return;
                        }
                        throw new IllegalArgumentException("Purchase token must be set");
                    }
                    i.a aVar2 = new i.a((byte) 0);
                    aVar2.f5857a = str;
                    if (aVar2.f5857a != null) {
                        i iVar = new i((byte) 0);
                        iVar.f5856a = aVar2.f5857a;
                        a.this.f30352j.a(iVar, new c(this));
                        return;
                    }
                    throw new IllegalArgumentException("Purchase token must be set");
                }

                @Override // com.bytedance.globalpayment.iap.google.b.b
                public final void a(com.bytedance.globalpayment.iap.common.ability.d dVar) {
                    ConsumeIapProductListener consumeIapProductListener = consumeIapProductListener;
                    if (consumeIapProductListener != null) {
                        consumeIapProductListener.onConsumeFinished(dVar);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.globalpayment.iap.google.a.a
    public final void a(final List<String> list, final boolean z, final com.bytedance.globalpayment.payment.common.lib.a.c<AbsIapProduct> cVar) {
        a(new com.bytedance.globalpayment.iap.google.b.b() {
            /* class com.bytedance.globalpayment.iap.google.a.AnonymousClass8 */

            static {
                Covode.recordClassIndex(17626);
            }

            @Override // com.bytedance.globalpayment.iap.google.b.b
            public final void a() {
                String str;
                if (z) {
                    str = "subs";
                } else {
                    str = "inapp";
                }
                com.bytedance.globalpayment.payment.common.lib.h.b.d e2 = com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                Object[] objArr = new Object[2];
                int i2 = 0;
                objArr[0] = str;
                StringBuilder sb = new StringBuilder();
                List list = list;
                if (list != null) {
                    i2 = list.size();
                }
                objArr[1] = sb.append(i2).toString();
                e2.a("BillingManager: query skuDetails list from google service, itemType: %s, skuList length is: %s", objArr);
                l.a a2 = l.a().a(list);
                a2.f5861a = str;
                a.this.f30352j.a(a2.a(), new d(this, cVar));
            }

            @Override // com.bytedance.globalpayment.iap.google.b.b
            public final void a(com.bytedance.globalpayment.iap.common.ability.d dVar) {
                cVar.a(dVar, null);
            }
        });
    }

    @Override // com.android.billingclient.api.k
    public final void a(h hVar, List<Purchase> list) {
        com.bytedance.globalpayment.iap.google.c.b bVar;
        Map<String, SkuDetails> map = this.f30349g;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Purchase purchase : list) {
                SkuDetails skuDetails = map.get(purchase.b());
                arrayList.add(new com.bytedance.globalpayment.iap.google.c.a(purchase, skuDetails != null && skuDetails.c().equals("subs")));
            }
        }
        this.f30353k.onPurchasesUpdated(c.a(hVar), arrayList);
        this.f30351i.compareAndSet(true, false);
        com.bytedance.globalpayment.iap.common.ability.d a2 = c.a(hVar);
        if (list != null) {
            list.size();
            list.size();
            Iterator<Purchase> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        com.bytedance.globalpayment.iap.google.helper.b.a().a(a2, list);
        if (hVar.f5852a == 0) {
            HashSet hashSet = new HashSet(this.n.keySet());
            hashSet.addAll(this.o.keySet());
            ArrayList<Purchase> arrayList2 = new ArrayList();
            if (list != null) {
                for (Purchase purchase2 : list) {
                    if (!b(purchase2.f5773a, purchase2.f5774b)) {
                        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                        purchase2.a();
                        String b2 = purchase2.b();
                        if (!hashSet.contains(b2)) {
                            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                            com.bytedance.globalpayment.iap.google.helper.b.a().a(purchase2);
                            a((com.bytedance.globalpayment.iap.a.b) this.f30353k);
                        } else {
                            com.bytedance.globalpayment.iap.google.b.a aVar = this.n.get(b2);
                            com.bytedance.globalpayment.iap.google.b.a aVar2 = this.o.get(b2);
                            SkuDetails skuDetails2 = this.f30349g.get(b2);
                            boolean z = skuDetails2 != null && skuDetails2.c().equals("subs");
                            if (aVar2 != null) {
                                aVar2.a(new com.bytedance.globalpayment.iap.google.c.a(purchase2, z));
                            } else if (aVar != null) {
                                aVar.a(new com.bytedance.globalpayment.iap.google.c.a(purchase2, z));
                            }
                        }
                    } else {
                        arrayList2.add(purchase2);
                        if (purchase2.d() == 1) {
                            this.f30347e.add(purchase2);
                        }
                    }
                }
            }
            for (final Purchase purchase3 : arrayList2) {
                String b3 = purchase3.b();
                com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                if (!hashSet.contains(b3)) {
                    String optString = purchase3.f5775c.optString("obfuscatedAccountId");
                    String optString2 = purchase3.f5775c.optString("obfuscatedProfileId");
                    if (!(optString == null && optString2 == null)) {
                        com.android.billingclient.api.a aVar3 = new com.android.billingclient.api.a(optString, optString2);
                        JSONObject a3 = a(aVar3.f5785a, aVar3.f5786b);
                        if (a3 != null) {
                            final String optString3 = a3.optString("merchant_id");
                            final String optString4 = a3.optString("uid");
                            final String optString5 = a3.optString("trade_no");
                            if (!TextUtils.isEmpty(optString3) && !TextUtils.isEmpty(optString4) && !TextUtils.isEmpty(optString5)) {
                                if (this.f30350h.size() == 0) {
                                    a(new com.bytedance.globalpayment.iap.a.b() {
                                        /* class com.bytedance.globalpayment.iap.google.a.AnonymousClass2 */

                                        static {
                                            Covode.recordClassIndex(17619);
                                        }

                                        @Override // com.bytedance.globalpayment.iap.a.b
                                        public final void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
                                            a.this.a(purchase3, optString3, optString4, optString5);
                                        }
                                    });
                                } else {
                                    a(purchase3, optString3, optString4, optString5);
                                }
                            }
                        }
                    }
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    com.bytedance.globalpayment.iap.google.helper.b.a().a(purchase3);
                    a((com.bytedance.globalpayment.iap.a.b) this.f30353k);
                }
                com.bytedance.globalpayment.iap.google.b.a aVar4 = this.n.get(b3);
                com.bytedance.globalpayment.iap.google.b.a aVar5 = this.o.get(b3);
                SkuDetails skuDetails3 = this.f30349g.get(b3);
                com.bytedance.globalpayment.iap.google.c.a aVar6 = new com.bytedance.globalpayment.iap.google.c.a(purchase3, skuDetails3 != null && skuDetails3.c().equals("subs"));
                if (skuDetails3 == null) {
                    bVar = null;
                } else {
                    bVar = new com.bytedance.globalpayment.iap.google.c.b(skuDetails3);
                }
                RestoreOrderService.getIns(this.u).onGoogleCallback(aVar6);
                if (aVar5 != null) {
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e().a("BillingManager: dispatch '%s' to pendingListener(%s) to deal with.", b3, Integer.valueOf(aVar5.hashCode()));
                    aVar5.a(c.a(hVar), aVar6, bVar);
                    this.o.remove(b3, aVar5);
                } else if (aVar4 != null) {
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e().a("BillingManager: dispatch '%s' to purchasedListener(%s) to deal with.", b3, Integer.valueOf(aVar4.hashCode()));
                    aVar4.a(c.a(hVar), aVar6, bVar);
                    this.n.remove(b3, aVar4);
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    aVar4.hashCode();
                    if (purchase3.d() == 2) {
                        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                        aVar4.hashCode();
                        this.o.put(b3, aVar4);
                    }
                } else {
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e().b("BillingManager: Serious error! sku: '%s' cannot be deal with.", b3);
                }
            }
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (String str : this.n.keySet()) {
            final com.bytedance.globalpayment.iap.google.b.a aVar7 = this.n.get(str);
            if (!(aVar7 == null || aVar7.b() > 0 || aVar7.e() || aVar7.c() == null || aVar7.d() == null)) {
                if (hVar.f5852a == -1 && this.f30351i.compareAndSet(false, true)) {
                    a(new com.bytedance.globalpayment.iap.google.b.b() {
                        /* class com.bytedance.globalpayment.iap.google.a.AnonymousClass10 */

                        static {
                            Covode.recordClassIndex(17618);
                        }

                        @Override // com.bytedance.globalpayment.iap.google.b.b
                        public final void a() {
                            a.this.a(aVar7.c(), aVar7.d(), aVar7);
                        }

                        @Override // com.bytedance.globalpayment.iap.google.b.b
                        public final void a(com.bytedance.globalpayment.iap.common.ability.d dVar) {
                            aVar7.a(dVar, null, null);
                        }
                    });
                } else if ((hVar.f5852a == -3 || TextUtils.equals("An internal error occurred.", hVar.f5853b)) && this.f30351i.compareAndSet(false, true)) {
                    a(aVar7.c(), aVar7.d(), aVar7);
                }
                concurrentHashMap.put(str, aVar7);
            }
            aVar7.a(c.a(hVar), null, null);
        }
        this.n.clear();
        this.n.putAll(concurrentHashMap);
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
    }

    static {
        Covode.recordClassIndex(17616);
    }

    public static com.bytedance.globalpayment.iap.google.a.a a() {
        MethodCollector.i(12675);
        if (t == null) {
            synchronized (a.class) {
                try {
                    if (t == null) {
                        t = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12675);
                    throw th;
                }
            }
        }
        com.bytedance.globalpayment.iap.google.a.a aVar = t;
        MethodCollector.o(12675);
        return aVar;
    }

    @Override // com.bytedance.globalpayment.iap.google.a.a
    public final void c() {
        Purchase.a b2 = this.f30352j.b("subs");
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        if (b2.f5777b.f5852a == 0) {
            List<Purchase> list = b2.f5776a;
            ArrayList arrayList = new ArrayList();
            for (Purchase purchase : list) {
                if (purchase.e()) {
                    arrayList.add(purchase.b());
                }
            }
            com.bytedance.globalpayment.iap.common.ability.b.e().a().b(IapPaymentMethod.GOOGLE, new com.bytedance.globalpayment.iap.common.ability.d(0, "query has subscription success in google service"), arrayList);
            return;
        }
        com.bytedance.globalpayment.iap.common.ability.b.e().a().b(IapPaymentMethod.GOOGLE, c.a(b2.f5777b), null);
    }

    @Override // com.bytedance.globalpayment.iap.google.a.a
    public final void a(com.bytedance.globalpayment.iap.common.ability.d.a aVar) {
        if (this.f30353k == null) {
            this.f30353k = aVar;
        }
    }

    public final synchronized void b(com.bytedance.globalpayment.iap.a.b bVar) {
        MethodCollector.i(12799);
        System.currentTimeMillis();
        this.f30350h.clear();
        Purchase.a b2 = this.f30352j.b("inapp");
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        System.currentTimeMillis();
        int i2 = this.f30352j.a("subscriptions").f5852a;
        if (i2 != 0) {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        }
        if (i2 == 0) {
            Purchase.a b3 = this.f30352j.b("subs");
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            System.currentTimeMillis();
            if (b3.f5777b.f5852a == 0) {
                List<Purchase> list = b3.f5776a;
                ArrayList arrayList = new ArrayList();
                for (Purchase purchase : list) {
                    if (!purchase.e()) {
                        arrayList.add(purchase);
                    }
                }
                a((List<Purchase>) arrayList, true);
            }
        } else if (b2.f5777b.f5852a == 0) {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        }
        if (b2.f5777b.f5852a == 0) {
            a(b2.f5776a, false);
        }
        bVar.onQueryFinished(IapPaymentMethod.GOOGLE, new com.bytedance.globalpayment.iap.common.ability.d(0, "query success."), this.f30350h);
        MethodCollector.o(12799);
    }

    private static JSONObject a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            String[] split = com.bytedance.globalpayment.payment.common.lib.j.e.a(str).split("-");
            String[] split2 = com.bytedance.globalpayment.payment.common.lib.j.e.a(str2).split("-");
            if (split.length != 0) {
                if (split2.length != 0) {
                    jSONObject.put("trade_no", split2[0]);
                    jSONObject.put("trade_amount", split2[1]);
                    jSONObject.put("app_id", split[0]);
                    jSONObject.put("merchant_id", split[1]);
                    jSONObject.put("uid", split[2]);
                    return jSONObject;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static boolean b(String str, String str2) {
        if (!p.contains("CONSTRUCT_YOUR")) {
            try {
                String str3 = p;
                com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2)) {
                    return com.bytedance.globalpayment.iap.google.f.c.a(com.bytedance.globalpayment.iap.google.f.c.a(str3), str, str2);
                }
                com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                return false;
            } catch (Exception e2) {
                com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                e2.getLocalizedMessage();
                return false;
            }
        } else {
            throw new RuntimeException("Please update your app's public key at: BASE_64_ENCODED_PUBLIC_KEY");
        }
    }

    private void a(List<Purchase> list, boolean z) {
        this.f30347e.addAll(list);
        for (Purchase purchase : list) {
            this.f30350h.add(new com.bytedance.globalpayment.iap.google.c.a(purchase, z));
        }
        list.size();
        if (z) {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        } else {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        }
    }

    public final void a(Activity activity, g gVar, com.bytedance.globalpayment.iap.google.b.a aVar) {
        aVar.a();
        this.f30352j.a(activity, gVar);
    }

    public final void a(Activity activity, String str, g gVar, com.bytedance.globalpayment.iap.google.b.a aVar) {
        aVar.a(gVar);
        this.n.put(str, aVar);
        aVar.f();
        a(activity, gVar, aVar);
    }

    public final void a(Purchase purchase, String str, String str2, String str3) {
        for (AbsIapChannelOrderData absIapChannelOrderData : this.f30350h) {
            if (TextUtils.equals(absIapChannelOrderData.getProductId(), purchase.b())) {
                boolean isSubscription = absIapChannelOrderData.isSubscription();
                com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                com.bytedance.globalpayment.iap.common.ability.c cVar = new com.bytedance.globalpayment.iap.common.ability.c(SystemClock.uptimeMillis());
                cVar.f30262b = str;
                cVar.f30265e = str2;
                cVar.f30267g = isSubscription;
                OrderData orderData = new OrderData(cVar, PayType.CAIJING_CALLBACK);
                orderData.setProductId(absIapChannelOrderData.getProductId());
                orderData.setOrderId(str3);
                orderData.setIapPaymentMethod(IapPaymentMethod.GOOGLE);
                orderData.setUserId(str2);
                orderData.setAbsIapChannelOrderData(absIapChannelOrderData);
                orderData.setIapPayMonitor(new com.bytedance.globalpayment.iap.common.ability.e.b(absIapChannelOrderData.getProductId(), str3, isSubscription, PayType.CAIJING_CALLBACK, orderData));
                this.f30353k.onCJBillingCallback(orderData);
            }
        }
    }

    @Override // com.bytedance.globalpayment.iap.google.a.a
    public final void a(final Activity activity, final String str, final boolean z, final OrderData orderData, final com.bytedance.globalpayment.iap.google.b.a aVar) {
        a(new com.bytedance.globalpayment.iap.google.b.b() {
            /* class com.bytedance.globalpayment.iap.google.a.AnonymousClass6 */

            static {
                Covode.recordClassIndex(17624);
            }

            @Override // com.bytedance.globalpayment.iap.google.b.b
            public final void a() {
                String str;
                if (a.this.f30351i.get()) {
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    return;
                }
                a.this.f30351i.compareAndSet(false, true);
                a aVar = a.this;
                Activity activity = activity;
                String str2 = str;
                boolean z = z;
                OrderData orderData = orderData;
                com.bytedance.globalpayment.iap.google.b.a aVar2 = aVar;
                SkuDetails skuDetails = aVar.f30349g.get(str2);
                if (skuDetails != null) {
                    aVar.a(activity, str2, com.bytedance.globalpayment.iap.google.helper.a.a(g.b().a(skuDetails), orderData), aVar2);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(str2);
                l.a a2 = l.a().a(arrayList);
                if (z) {
                    str = "subs";
                } else {
                    str = "inapp";
                }
                a2.f5861a = str;
                aVar.a(activity, a2.a(), str2, orderData, aVar2, 0, null);
            }

            @Override // com.bytedance.globalpayment.iap.google.b.b
            public final void a(com.bytedance.globalpayment.iap.common.ability.d dVar) {
                com.bytedance.globalpayment.iap.google.b.a aVar = aVar;
                if (aVar != null) {
                    aVar.a(dVar, null, null);
                }
            }
        });
    }

    public final void a(final Activity activity, final l lVar, final String str, final OrderData orderData, final com.bytedance.globalpayment.iap.google.b.a aVar, final int i2, final h hVar) {
        this.f30352j.a(lVar, new m() {
            /* class com.bytedance.globalpayment.iap.google.a.AnonymousClass9 */

            static {
                Covode.recordClassIndex(17627);
            }

            private void a(List<SkuDetails> list) {
                if (list == null || list.isEmpty()) {
                    com.bytedance.globalpayment.iap.common.ability.d dVar = new com.bytedance.globalpayment.iap.common.ability.d(-1, "-1:google details is empty, doesn't has this product.");
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    a(str, orderData, dVar);
                    return;
                }
                for (SkuDetails skuDetails : list) {
                    if (skuDetails != null) {
                        a.this.f30349g.put(skuDetails.a(), skuDetails);
                    }
                }
                SkuDetails skuDetails2 = a.this.f30349g.get(str);
                if (skuDetails2 != null) {
                    a.this.a(activity, str, com.bytedance.globalpayment.iap.google.helper.a.a(g.b().a(skuDetails2), orderData), aVar);
                    return;
                }
                com.bytedance.globalpayment.iap.common.ability.d dVar2 = new com.bytedance.globalpayment.iap.common.ability.d(-2, "-2:google details doesn't has this product.");
                com.bytedance.globalpayment.payment.common.lib.h.a.a().e().c("BillingManager: onQuerySkuDetailsSuccess but doesn't contain %s", str);
                a(str, orderData, dVar2);
            }

            @Override // com.android.billingclient.api.m
            public final void b(final h hVar, List<SkuDetails> list) {
                com.bytedance.globalpayment.iap.google.helper.b a2 = com.bytedance.globalpayment.iap.google.helper.b.a();
                int i2 = i2;
                h hVar2 = hVar;
                JSONObject jSONObject = new JSONObject();
                a2.add(jSONObject, "retry_count", (long) i2);
                if (hVar != null) {
                    a2.add(jSONObject, "cur_result_code", (long) hVar.f5852a);
                    a2.add(jSONObject, "cur_result_message", hVar.f5853b);
                } else {
                    a2.add(jSONObject, "cur_result_code", -1L);
                    a2.add(jSONObject, "cur_result_message", "unknown");
                }
                if (hVar2 != null) {
                    a2.add(jSONObject, "pre_result_code", (long) hVar.f5852a);
                    a2.add(jSONObject, "pre_result_message", hVar.f5853b);
                } else {
                    a2.add(jSONObject, "pre_result_code", -1L);
                    a2.add(jSONObject, "pre_result_message", "unknown");
                }
                a2.add(jSONObject, "payment_method", IapPaymentMethod.GOOGLE.channelName);
                com.bytedance.globalpayment.payment.common.lib.h.a.a().j().a("retry_query_sku_details_event", jSONObject);
                if (hVar.f5852a == 0) {
                    a(list);
                } else if (i2 != 0) {
                    com.bytedance.globalpayment.iap.common.ability.d a3 = c.a(hVar);
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e().c("BillingManager: querySkuDetailsAsync before execute new purchase had error, result: %s", a3);
                    a(str, orderData, a3);
                } else if (hVar.f5852a == -3) {
                    a.this.a(activity, lVar, str, orderData, aVar, i2 + 1, hVar);
                } else if (hVar.f5852a == -1) {
                    a.this.a(new com.bytedance.globalpayment.iap.google.b.b() {
                        /* class com.bytedance.globalpayment.iap.google.a.AnonymousClass9.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(17628);
                        }

                        @Override // com.bytedance.globalpayment.iap.google.b.b
                        public final void a() {
                            a.this.a(activity, lVar, str, orderData, aVar, i2 + 1, hVar);
                        }

                        @Override // com.bytedance.globalpayment.iap.google.b.b
                        public final void a(com.bytedance.globalpayment.iap.common.ability.d dVar) {
                            com.bytedance.globalpayment.iap.common.ability.d a2 = c.a(hVar);
                            com.bytedance.globalpayment.payment.common.lib.h.a.a().e().c("BillingManager: querySkuDetailsAsync before execute new purchase had error, result: %s", a2);
                            AnonymousClass9 r2 = AnonymousClass9.this;
                            r2.a(str, orderData, a2);
                        }
                    });
                } else if (TextUtils.equals("An internal error occurred.", hVar.f5853b)) {
                    a.this.a(activity, lVar, str, orderData, aVar, i2 + 1, hVar);
                } else {
                    com.bytedance.globalpayment.iap.common.ability.d a4 = c.a(hVar);
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e().c("BillingManager: querySkuDetailsAsync before execute new purchase had error, result: %s", a4);
                    a(str, orderData, a4);
                }
            }

            public final void a(String str, OrderData orderData, com.bytedance.globalpayment.iap.common.ability.d dVar) {
                com.bytedance.globalpayment.iap.google.helper.b.a().a(str, orderData.getOrderId(), orderData.getIapPayRequest().f30262b, orderData.getUserId(), dVar);
                com.bytedance.globalpayment.iap.google.b.a aVar = aVar;
                if (aVar != null) {
                    aVar.a(dVar, null, null);
                }
                a.this.f30351i.compareAndSet(true, false);
            }
        });
    }
}
