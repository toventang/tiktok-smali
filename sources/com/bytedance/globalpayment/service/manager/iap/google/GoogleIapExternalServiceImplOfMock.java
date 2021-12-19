package com.bytedance.globalpayment.service.manager.iap.google;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.d.a;
import com.bytedance.globalpayment.iap.common.ability.d.b;
import com.bytedance.globalpayment.iap.common.ability.g.b.d;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.payment.common.lib.a.c;
import java.util.List;

public class GoogleIapExternalServiceImplOfMock implements GoogleIapExternalService {
    static {
        Covode.recordClassIndex(17783);
    }

    public static int com_bytedance_globalpayment_service_manager_iap_google_GoogleIapExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void consumeProduct(boolean z, String str, ConsumeIapProductListener consumeIapProductListener) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void init(b bVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void jumpToNotExpiredSubscriptionManagerPage(String str, String str2) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void jumpToSubscriptionManagerPage() {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryHasSubscriptionProducts() {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryProductDetails(List<String> list, boolean z, c<AbsIapProduct> cVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryUnAckEdOrderFromChannel(com.bytedance.globalpayment.iap.a.b bVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void setGpListener(a aVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public PayloadPreferencesService getPayloadPreferencesService() {
        com_bytedance_globalpayment_service_manager_iap_google_GoogleIapExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w("GoogleIapExternalService", "cur getPayloadPreferencesService method is empty impl in GoogleIapExternalServiceImplOfMockClass");
        return new PayloadPreferencesServiceImplOfMock();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public RestoreGoogleOrderService getRestoreGoogleOrderService() {
        com_bytedance_globalpayment_service_manager_iap_google_GoogleIapExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w("GoogleIapExternalService", "cur getRestoreGoogleOrderService method is empty impl in GoogleIapExternalServiceImplOfMockClass");
        return new RestoreGoogleOrderServiceImplOfMock();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public boolean isServiceConnected() {
        com_bytedance_globalpayment_service_manager_iap_google_GoogleIapExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w("GoogleIapExternalService", "cur isServiceConnected method is empty impl in GoogleIapExternalServiceImplOfMockClass");
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public boolean isSupportGooglePay() {
        com_bytedance_globalpayment_service_manager_iap_google_GoogleIapExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w("GoogleIapExternalService", "cur isSupportGooglePay method is empty impl in GoogleIapExternalServiceImplOfMockClass");
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public com.bytedance.globalpayment.iap.common.ability.f.a getGoogleState(d dVar, Activity activity) {
        com_bytedance_globalpayment_service_manager_iap_google_GoogleIapExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w("GoogleIapExternalService", "cur getGoogleState method is empty impl in GoogleIapExternalServiceImplOfMockClass");
        return null;
    }
}
