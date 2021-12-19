package com.bytedance.globalpayment.service.manager.ecommerce;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.a.a.a.a.b;
import com.bytedance.globalpayment.a.a.a.a.c;
import com.bytedance.globalpayment.a.a.a.a.d;
import com.bytedance.globalpayment.a.b.a;
import java.util.List;

public class ECommerceExternalServiceImplOfMock implements ECommerceExternalService {
    static {
        Covode.recordClassIndex(17769);
    }

    public static int com_bytedance_globalpayment_service_manager_ecommerce_ECommerceExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceExternalService
    public void init() {
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceService
    public void onLanguageUpdate(String str) {
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceExternalService
    public void pay(int i2, a aVar, b bVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceService
    public void pay(com.bytedance.globalpayment.a.a.a.d.a.b bVar, c cVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceService
    public void payWithChannel(int i2, a aVar, b bVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceService
    public void queryOrderState(com.bytedance.globalpayment.a.a.a.d.a.c cVar, d dVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceExternalService
    public void startBankCardOcr(String str, com.bytedance.globalpayment.a.a.a.a.a aVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceService
    public void updateNonce(String str) {
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceService
    public com.bytedance.globalpayment.a.a.a.c.a getECommerceInterceptor() {
        com_bytedance_globalpayment_service_manager_ecommerce_ECommerceExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w("ECommerceExternalService", "cur getECommerceInterceptor method is empty impl in ECommerceExternalServiceImplOfMockClass");
        return new com.bytedance.globalpayment.a.a.a.c.b();
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceExternalService
    public ECommerceService getECommerceService() {
        com_bytedance_globalpayment_service_manager_ecommerce_ECommerceExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w("ECommerceExternalService", "cur getECommerceService method is empty impl in ECommerceExternalServiceImplOfMockClass");
        return new ECommerceServiceImplOfMock();
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceService
    public String encryptWithRsa(String str) {
        com_bytedance_globalpayment_service_manager_ecommerce_ECommerceExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w("ECommerceExternalService", "cur encryptWithRsa method is empty impl in ECommerceExternalServiceImplOfMockClass");
        return "";
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceService
    public com.bytedance.globalpayment.a.a.a.d.b getCardPaymentMethod(String str) {
        com_bytedance_globalpayment_service_manager_ecommerce_ECommerceExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w("ECommerceExternalService", "cur getCardPaymentMethod method is empty impl in ECommerceExternalServiceImplOfMockClass");
        return null;
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceExternalService
    public com.bytedance.globalpayment.a.a.a.c.c getPayChannel(int i2) {
        com_bytedance_globalpayment_service_manager_ecommerce_ECommerceExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w("ECommerceExternalService", "cur getPayChannel method is empty impl in ECommerceExternalServiceImplOfMockClass");
        return new com.bytedance.globalpayment.a.a.a.c.d();
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceService
    public List<Object> getElements(String str, String[] strArr) {
        com_bytedance_globalpayment_service_manager_ecommerce_ECommerceExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w("ECommerceExternalService", "cur getElements method is empty impl in ECommerceExternalServiceImplOfMockClass");
        return null;
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceService
    public com.bytedance.globalpayment.a.a.a.d.a isValidElement(String str, String str2, String str3) {
        com_bytedance_globalpayment_service_manager_ecommerce_ECommerceExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w("ECommerceExternalService", "cur isValidElement method is empty impl in ECommerceExternalServiceImplOfMockClass");
        return null;
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceService
    public com.bytedance.globalpayment.a.a.a.d.a isValidExpiryDateElement(String str, String str2, String str3) {
        com_bytedance_globalpayment_service_manager_ecommerce_ECommerceExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w("ECommerceExternalService", "cur isValidExpiryDateElement method is empty impl in ECommerceExternalServiceImplOfMockClass");
        return null;
    }
}
