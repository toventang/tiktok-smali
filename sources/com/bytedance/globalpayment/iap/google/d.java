package com.bytedance.globalpayment.iap.google;

import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.h;
import com.android.billingclient.api.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.google.a;
import com.bytedance.globalpayment.iap.google.c.b;
import com.bytedance.globalpayment.payment.common.lib.a.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final /* synthetic */ class d implements m {

    /* renamed from: a  reason: collision with root package name */
    private final a.AnonymousClass8 f30404a;

    /* renamed from: b  reason: collision with root package name */
    private final c f30405b;

    static {
        Covode.recordClassIndex(17636);
    }

    d(a.AnonymousClass8 r1, c cVar) {
        this.f30404a = r1;
        this.f30405b = cVar;
    }

    @Override // com.android.billingclient.api.m
    public final void b(h hVar, List list) {
        int sb;
        a.AnonymousClass8 r3 = this.f30404a;
        c cVar = this.f30405b;
        com.bytedance.globalpayment.payment.common.lib.h.b.d e2 = com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        Object[] objArr = new Object[2];
        objArr[0] = hVar.f5852a + ":" + hVar.f5853b;
        if (list == null) {
            sb = 0;
        } else {
            sb = new StringBuilder().append(list.size()).toString();
        }
        objArr[1] = sb;
        e2.a("BillingManager: result of query skuDetails list asynchronously is billingResult code is %s,skuDetailsList size is %s", objArr);
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SkuDetails skuDetails = (SkuDetails) it.next();
                arrayList.add(new b(skuDetails));
                if (!a.this.f30349g.containsKey(skuDetails.a())) {
                    a.this.f30349g.put(skuDetails.a(), skuDetails);
                }
            }
        }
        cVar.a(com.bytedance.globalpayment.iap.google.helper.c.a(hVar), arrayList);
    }
}
