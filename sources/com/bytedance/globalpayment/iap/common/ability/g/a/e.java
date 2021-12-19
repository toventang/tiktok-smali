package com.bytedance.globalpayment.iap.common.ability.g.a;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.b;
import com.bytedance.globalpayment.iap.common.ability.c.a;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.globalpayment.iap.common.ability.g.b.f;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.IapChannelUserData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    private a f30304a;

    /* renamed from: b  reason: collision with root package name */
    private Set<a> f30305b;

    static {
        Covode.recordClassIndex(17579);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.g.b.f
    public final void a(IapPaymentMethod iapPaymentMethod, d dVar) {
        if (d()) {
            b(iapPaymentMethod, dVar);
        } else {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().c().a().execute(new f(this, iapPaymentMethod, dVar));
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.g.b.f
    public final void a(IapPaymentMethod iapPaymentMethod, d dVar, List<AbsIapProduct> list) {
        if (d()) {
            a(dVar, list);
        } else {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().c().a().execute(new i(this, iapPaymentMethod, dVar, list));
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(List<AbsIapProduct> list) {
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            for (AbsIapProduct absIapProduct : list) {
                jSONArray.put(absIapProduct.getProductId());
            }
        }
        b.e().b();
        Set<a> set = this.f30305b;
        if (set != null) {
            Iterator<a> it = set.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    private static boolean d() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        b.e().b();
        Set<a> set = this.f30305b;
        if (set != null) {
            Iterator<a> it = set.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        Set<a> set = this.f30305b;
        if (set != null) {
            Iterator<a> it = set.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        Set<a> set = this.f30305b;
        if (set != null) {
            Iterator<a> it = set.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.globalpayment.iap.common.ability.g.a.e$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30306a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 17580(0x44ac, float:2.4635E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.globalpayment.iap.common.ability.model.enums.PayType[] r0 = com.bytedance.globalpayment.iap.common.ability.model.enums.PayType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.globalpayment.iap.common.ability.g.a.e.AnonymousClass1.f30306a = r2
                com.bytedance.globalpayment.iap.common.ability.model.enums.PayType r0 = com.bytedance.globalpayment.iap.common.ability.model.enums.PayType.PRE     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.globalpayment.iap.common.ability.g.a.e.AnonymousClass1.f30306a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.globalpayment.iap.common.ability.model.enums.PayType r0 = com.bytedance.globalpayment.iap.common.ability.model.enums.PayType.EXTRA_QUERY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.globalpayment.iap.common.ability.g.a.e.AnonymousClass1.f30306a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.globalpayment.iap.common.ability.model.enums.PayType r0 = com.bytedance.globalpayment.iap.common.ability.model.enums.PayType.EXTRA_TOKEN     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.globalpayment.iap.common.ability.g.a.e.AnonymousClass1.f30306a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.globalpayment.iap.common.ability.model.enums.PayType r0 = com.bytedance.globalpayment.iap.common.ability.model.enums.PayType.CAIJING_TOKEN     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.globalpayment.iap.common.ability.g.a.e.AnonymousClass1.f30306a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.globalpayment.iap.common.ability.model.enums.PayType r0 = com.bytedance.globalpayment.iap.common.ability.model.enums.PayType.CAIJING_CALLBACK     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.globalpayment.iap.common.ability.g.a.e.AnonymousClass1.<clinit>():void");
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.g.b.f
    public final void a(a aVar) {
        a aVar2 = this.f30304a;
        if (aVar != aVar2) {
            if (aVar2 == null) {
                this.f30304a = aVar;
                return;
            }
            if (this.f30305b == null) {
                HashSet hashSet = new HashSet();
                this.f30305b = hashSet;
                hashSet.add(this.f30304a);
            }
            this.f30305b.add(aVar);
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.g.b.f
    public final void b(a aVar) {
        Set<a> set = this.f30305b;
        if (set != null) {
            set.remove(aVar);
            if (this.f30305b.size() == 0) {
                this.f30305b = null;
            }
        }
        if (aVar == this.f30304a) {
            this.f30304a = null;
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.g.b.f
    public final void a(OrderInfo orderInfo) {
        if (d()) {
            a();
        } else {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().c().a().execute(new h(this, orderInfo));
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.g.b.f
    public final void a(d dVar, OrderInfo orderInfo) {
        if (d()) {
            b(dVar, orderInfo);
        } else {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().c().a().execute(new g(this, dVar, orderInfo));
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(d dVar, OrderInfo orderInfo) {
        b.e().b();
        int i2 = AnonymousClass1.f30306a[dVar.f30275c.ordinal()];
        if (i2 == 1) {
            Set<a> set = this.f30305b;
            if (set != null) {
                Iterator<a> it = set.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                return;
            }
            a aVar = this.f30304a;
        } else if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
            Set<a> set2 = this.f30305b;
            if (set2 != null) {
                for (a aVar2 : set2) {
                    aVar2.b(dVar, orderInfo);
                }
                return;
            }
            a aVar3 = this.f30304a;
            if (aVar3 != null) {
                aVar3.b(dVar, orderInfo);
            }
        } else {
            Set<a> set3 = this.f30305b;
            if (set3 != null) {
                for (a aVar4 : set3) {
                    aVar4.a(dVar, orderInfo);
                }
                return;
            }
            a aVar5 = this.f30304a;
            if (aVar5 != null) {
                aVar5.a(dVar, orderInfo);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(d dVar, List<AbsIapProduct> list) {
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            for (AbsIapProduct absIapProduct : list) {
                jSONArray.put(absIapProduct.getProductId());
            }
        }
        b.e().b();
        Set<a> set = this.f30305b;
        if (set != null) {
            for (a aVar : set) {
                aVar.b(dVar, list);
            }
            return;
        }
        a aVar2 = this.f30304a;
        if (aVar2 != null) {
            aVar2.b(dVar, list);
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.g.b.f
    public final void a(d dVar, IapChannelUserData iapChannelUserData) {
        if (d()) {
            c();
        } else {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().c().a().execute(new m(this, dVar, iapChannelUserData));
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.g.b.f
    public final void b(d dVar, List<AbsIapProduct> list) {
        if (d()) {
            c(dVar, list);
        } else {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().c().a().execute(new j(this, dVar, list));
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(d dVar, List<AbsIapProduct> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            for (AbsIapProduct absIapProduct : list) {
                jSONArray.put(absIapProduct.getProductId());
            }
        }
        b.e().b();
        Set<a> set = this.f30305b;
        if (set != null) {
            for (a aVar : set) {
                aVar.a(dVar, list);
            }
            return;
        }
        a aVar2 = this.f30304a;
        if (aVar2 != null) {
            aVar2.a(dVar, list);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(IapPaymentMethod iapPaymentMethod, d dVar) {
        b.e().b();
        Set<a> set = this.f30305b;
        if (set != null) {
            for (a aVar : set) {
                aVar.a(iapPaymentMethod, dVar);
            }
            return;
        }
        a aVar2 = this.f30304a;
        if (aVar2 != null) {
            aVar2.a(iapPaymentMethod, dVar);
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.g.b.f
    public final void a(d dVar, boolean z, List<AbsIapProduct> list) {
        if (d()) {
            a(list);
        } else {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().c().a().execute(new l(this, dVar, z, list));
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.g.b.f
    public final void b(IapPaymentMethod iapPaymentMethod, d dVar, List<String> list) {
        if (d()) {
            b();
        } else {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().c().a().execute(new k(this, iapPaymentMethod, dVar, list));
        }
    }
}
