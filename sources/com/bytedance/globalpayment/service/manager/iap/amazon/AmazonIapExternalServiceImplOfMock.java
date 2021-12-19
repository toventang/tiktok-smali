package com.bytedance.globalpayment.service.manager.iap.amazon;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.a.a;
import com.bytedance.globalpayment.iap.common.ability.d.b;
import com.bytedance.globalpayment.iap.common.ability.g.b.d;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.payment.common.lib.a.c;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.List;

public class AmazonIapExternalServiceImplOfMock implements AmazonIapExternalService {
    static {
        Covode.recordClassIndex(17780);
    }

    public static int com_bytedance_globalpayment_service_manager_iap_amazon_AmazonIapExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public void consumeProduct(String str, ConsumeIapProductListener consumeIapProductListener) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public void getAmazonUserId(a aVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public void init(b bVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public void queryProductDetails(List<String> list, boolean z, c<AbsIapProduct> cVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public void queryUnAckEdOrderFromChannel(com.bytedance.globalpayment.iap.a.b bVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public boolean isSupportAmazonPay() {
        com_bytedance_globalpayment_service_manager_iap_amazon_AmazonIapExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w("AmazonIapExternalService", "cur isSupportAmazonPay method is empty impl in AmazonIapExternalServiceImplOfMockClass");
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public com.bytedance.globalpayment.iap.common.ability.f.a getAmazonState(d dVar, Activity activity) {
        com_bytedance_globalpayment_service_manager_iap_amazon_AmazonIapExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w("AmazonIapExternalService", "cur getAmazonState method is empty impl in AmazonIapExternalServiceImplOfMockClass");
        return null;
    }
}
