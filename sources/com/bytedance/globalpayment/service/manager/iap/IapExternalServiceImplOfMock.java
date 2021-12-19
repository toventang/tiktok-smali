package com.bytedance.globalpayment.service.manager.iap;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.c;
import com.bytedance.globalpayment.iap.common.ability.c.a;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.List;

public class IapExternalServiceImplOfMock implements IapExternalService {
    static {
        Covode.recordClassIndex(17777);
    }

    public static int com_bytedance_globalpayment_service_manager_iap_IapExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void acquireReward(c cVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void addIapObserver(a aVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void executeUnUploadTokenOrder(IapPaymentMethod iapPaymentMethod, AbsIapChannelOrderData absIapChannelOrderData) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void getChannelUserData(IapPaymentMethod iapPaymentMethod) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void init() {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void jumpToNotExpiredSubscriptionManagerPage(IapPaymentMethod iapPaymentMethod, String str, String str2) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void jumpToSubscriptionManagerPage(IapPaymentMethod iapPaymentMethod) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void newPay(Activity activity, c cVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void onAppResume() {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void onOrderTimeout(OrderInfo orderInfo) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryHasSubscriptionProducts(IapPaymentMethod iapPaymentMethod) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryProductDetails(IapPaymentMethod iapPaymentMethod, List<String> list, String str) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryRewards() {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void querySubscriptionDetails(IapPaymentMethod iapPaymentMethod, List<String> list) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void removeIapObserver(a aVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void tryRestoreUnAckOrder(IapPaymentMethod iapPaymentMethod) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void updateHost(String str) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public boolean hasInitEd() {
        com_bytedance_globalpayment_service_manager_iap_IapExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w("IapExternalService", "cur hasInitEd method is empty impl in IapExternalServiceImplOfMockClass");
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public com.bytedance.globalpayment.iap.common.ability.f.a getNextState(com.bytedance.globalpayment.iap.common.ability.f.a aVar) {
        com_bytedance_globalpayment_service_manager_iap_IapExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w("IapExternalService", "cur getNextState method is empty impl in IapExternalServiceImplOfMockClass");
        return null;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public boolean isSupportPaymentMethod(IapPaymentMethod iapPaymentMethod) {
        com_bytedance_globalpayment_service_manager_iap_IapExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w("IapExternalService", "cur isSupportPaymentMethod method is empty impl in IapExternalServiceImplOfMockClass");
        return false;
    }
}
