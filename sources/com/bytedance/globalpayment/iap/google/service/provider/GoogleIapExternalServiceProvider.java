package com.bytedance.globalpayment.iap.google.service.provider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.d.b;
import com.bytedance.globalpayment.iap.common.ability.g.b.d;
import com.bytedance.globalpayment.iap.google.a;
import com.bytedance.globalpayment.iap.google.helper.RestoreOrderService;
import com.bytedance.globalpayment.iap.google.service.PayloadPreferencesServiceImpl;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.payment.common.lib.a.c;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService;
import com.bytedance.globalpayment.service.manager.iap.google.PayloadPreferencesService;
import com.bytedance.globalpayment.service.manager.iap.google.RestoreGoogleOrderService;
import java.util.List;

public class GoogleIapExternalServiceProvider implements GoogleIapExternalService {
    static {
        Covode.recordClassIndex(17658);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public boolean isServiceConnected() {
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public PayloadPreferencesService getPayloadPreferencesService() {
        return PayloadPreferencesServiceImpl.getInstance();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryHasSubscriptionProducts() {
        a.a().c();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public boolean isSupportGooglePay() {
        return a.a().b();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public RestoreGoogleOrderService getRestoreGoogleOrderService() {
        return RestoreOrderService.getIns(com.bytedance.globalpayment.payment.common.lib.h.a.a().i().b());
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void jumpToSubscriptionManagerPage() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions"));
        intent.addFlags(268435456);
        com_bytedance_globalpayment_iap_google_service_provider_GoogleIapExternalServiceProvider_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(com.bytedance.globalpayment.payment.common.lib.h.a.a().i().b(), intent);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void init(b bVar) {
        a.a().a(bVar);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryUnAckEdOrderFromChannel(com.bytedance.globalpayment.iap.a.b bVar) {
        a.a().a(bVar);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void setGpListener(com.bytedance.globalpayment.iap.common.ability.d.a aVar) {
        a.a().a(aVar);
    }

    public static void com_bytedance_globalpayment_iap_google_service_provider_GoogleIapExternalServiceProvider_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public com.bytedance.globalpayment.iap.common.ability.f.a getGoogleState(d dVar, Activity activity) {
        return new com.bytedance.globalpayment.iap.google.e.a(dVar, activity);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void jumpToNotExpiredSubscriptionManagerPage(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + str + "&package=" + str2));
        intent.addFlags(268435456);
        com_bytedance_globalpayment_iap_google_service_provider_GoogleIapExternalServiceProvider_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(com.bytedance.globalpayment.payment.common.lib.h.a.a().i().b(), intent);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void consumeProduct(boolean z, String str, ConsumeIapProductListener consumeIapProductListener) {
        a.a().a(z, str, consumeIapProductListener);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryProductDetails(List<String> list, boolean z, c<AbsIapProduct> cVar) {
        a.a().a(list, z, cVar);
    }
}
