package com.bytedance.globalpayment.service.manager.iap.google;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.d.b;
import com.bytedance.globalpayment.iap.common.ability.f.a;
import com.bytedance.globalpayment.iap.common.ability.g.b.d;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.payment.common.lib.a.c;
import java.util.List;

public interface GoogleIapExternalService {
    static {
        Covode.recordClassIndex(17782);
    }

    void consumeProduct(boolean z, String str, ConsumeIapProductListener consumeIapProductListener);

    a getGoogleState(d dVar, Activity activity);

    PayloadPreferencesService getPayloadPreferencesService();

    RestoreGoogleOrderService getRestoreGoogleOrderService();

    void init(b bVar);

    boolean isServiceConnected();

    boolean isSupportGooglePay();

    void jumpToNotExpiredSubscriptionManagerPage(String str, String str2);

    void jumpToSubscriptionManagerPage();

    void queryHasSubscriptionProducts();

    void queryProductDetails(List<String> list, boolean z, c<AbsIapProduct> cVar);

    void queryUnAckEdOrderFromChannel(com.bytedance.globalpayment.iap.a.b bVar);

    void setGpListener(com.bytedance.globalpayment.iap.common.ability.d.a aVar);
}
