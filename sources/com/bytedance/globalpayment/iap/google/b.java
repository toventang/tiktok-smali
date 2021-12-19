package com.bytedance.globalpayment.iap.google;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.c;
import com.android.billingclient.api.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.google.a;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.Iterator;

final /* synthetic */ class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final a.AnonymousClass7 f30394a;

    /* renamed from: b  reason: collision with root package name */
    private final String f30395b;

    static {
        Covode.recordClassIndex(17630);
    }

    b(a.AnonymousClass7 r1, String str) {
        this.f30394a = r1;
        this.f30395b = str;
    }

    @Override // com.android.billingclient.api.c
    public final void a(h hVar) {
        a.AnonymousClass7 r4 = this.f30394a;
        String str = this.f30395b;
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
