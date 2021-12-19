package com.bytedance.globalpayment.service.manager.iap;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.f.a;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;

public interface IapExternalService extends IapService {
    static {
        Covode.recordClassIndex(17776);
    }

    void executeUnUploadTokenOrder(IapPaymentMethod iapPaymentMethod, AbsIapChannelOrderData absIapChannelOrderData);

    a getNextState(a aVar);

    void init();

    void onOrderTimeout(OrderInfo orderInfo);

    void tryRestoreUnAckOrder(IapPaymentMethod iapPaymentMethod);
}
