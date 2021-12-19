package com.bytedance.globalpayment.service.manager.iap.amazon;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.d.b;
import com.bytedance.globalpayment.iap.common.ability.f.a;
import com.bytedance.globalpayment.iap.common.ability.g.b.d;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.payment.common.lib.a.c;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.List;

public interface AmazonIapExternalService {
    static {
        Covode.recordClassIndex(17779);
    }

    void consumeProduct(String str, ConsumeIapProductListener consumeIapProductListener);

    a getAmazonState(d dVar, Activity activity);

    void getAmazonUserId(com.bytedance.globalpayment.iap.a.a aVar);

    void init(b bVar);

    boolean isSupportAmazonPay();

    void queryProductDetails(List<String> list, boolean z, c<AbsIapProduct> cVar);

    void queryUnAckEdOrderFromChannel(com.bytedance.globalpayment.iap.a.b bVar);
}
