package com.bytedance.globalpayment.iap.google;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.h;
import com.android.billingclient.api.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.google.a;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.Iterator;

final /* synthetic */ class c implements j {

    /* renamed from: a  reason: collision with root package name */
    private final a.AnonymousClass7 f30396a;

    static {
        Covode.recordClassIndex(17633);
    }

    c(a.AnonymousClass7 r1) {
        this.f30396a = r1;
    }

    @Override // com.android.billingclient.api.j
    public final void a(h hVar, String str) {
        a.AnonymousClass7 r3 = this.f30396a;
        ConsumeIapProductListener consumeIapProductListener = a.this.f30346d.get(str);
        if (consumeIapProductListener != null) {
            if (a.this.f30347e.size() == 0) {
                com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            }
            Iterator<Purchase> it = a.this.f30347e.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().c())) {
                    consumeIapProductListener.onConsumeFinished(com.bytedance.globalpayment.iap.google.helper.c.a(hVar));
                }
            }
        }
        a.this.f30346d.remove(str);
    }
}
