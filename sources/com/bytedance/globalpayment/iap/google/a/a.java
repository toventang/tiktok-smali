package com.bytedance.globalpayment.iap.google.a;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.a.b;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.payment.common.lib.a.c;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.List;

public interface a {
    static {
        Covode.recordClassIndex(17629);
    }

    void a(Activity activity, String str, boolean z, OrderData orderData, com.bytedance.globalpayment.iap.google.b.a aVar);

    void a(b bVar);

    void a(com.bytedance.globalpayment.iap.common.ability.d.a aVar);

    void a(com.bytedance.globalpayment.iap.common.ability.d.b bVar);

    void a(List<String> list, boolean z, c<AbsIapProduct> cVar);

    void a(boolean z, String str, ConsumeIapProductListener consumeIapProductListener);

    boolean b();

    void c();
}
