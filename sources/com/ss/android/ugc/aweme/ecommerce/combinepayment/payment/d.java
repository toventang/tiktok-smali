package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import com.bytedance.android.ecommerce.a.g;
import com.bytedance.android.ecommerce.a.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.p;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a */
    public static final d f85271a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(53366);
    }

    public static i a(p pVar) {
        ArrayList arrayList;
        l.d(pVar, "");
        String id = pVar.getId();
        List<m> paymentElements = pVar.getPaymentElements();
        if (paymentElements != null) {
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) paymentElements, 10));
            for (T t : paymentElements) {
                l.d(t, "");
                g gVar = new g(t.getElement(), t.getParamName(), t.getParamValue());
                gVar.f6971d = t.isEncrypted().booleanValue();
                arrayList2.add(gVar);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        i iVar = new i(id, arrayList);
        iVar.f6983b = pVar.getToken();
        return iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r16 == null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ac, code lost:
        if (r16 != null) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r16 != null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.p a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n r16, boolean r17) {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.d.a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n, boolean):com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.p");
    }
}
