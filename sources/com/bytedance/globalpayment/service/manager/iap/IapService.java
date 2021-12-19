package com.bytedance.globalpayment.service.manager.iap;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.c;
import com.bytedance.globalpayment.iap.common.ability.c.a;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.List;

public interface IapService {
    static {
        Covode.recordClassIndex(17778);
    }

    void acquireReward(c cVar);

    void addIapObserver(a aVar);

    void getChannelUserData(IapPaymentMethod iapPaymentMethod);

    boolean hasInitEd();

    boolean isSupportPaymentMethod(IapPaymentMethod iapPaymentMethod);

    void jumpToNotExpiredSubscriptionManagerPage(IapPaymentMethod iapPaymentMethod, String str, String str2);

    void jumpToSubscriptionManagerPage(IapPaymentMethod iapPaymentMethod);

    void newPay(Activity activity, c cVar);

    void onAppResume();

    void queryHasSubscriptionProducts(IapPaymentMethod iapPaymentMethod);

    void queryProductDetails(IapPaymentMethod iapPaymentMethod, List<String> list, String str);

    void queryRewards();

    void querySubscriptionDetails(IapPaymentMethod iapPaymentMethod, List<String> list);

    void removeIapObserver(a aVar);

    void updateHost(String str);
}
