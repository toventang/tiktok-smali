package com.ss.android.ugc.aweme.influencer;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceRNToLynxConfigService;
import com.ss.android.ugc.b;

public final class ECommerceRNToLynxConfigService implements IECommerceRNToLynxConfigService {
    static {
        Covode.recordClassIndex(66930);
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceRNToLynxConfigService
    public final String a() {
        return "aweme://lynxview/?hide_nav_bar=1&thread_strategy=0&immersive_mode=0&hide_status_bar=0&channel=lynx_ecommerce_tab_shop&bundle=profile_tab_shop_page/template.js&dynamic=1&is_host_profile={is_host_profile}&target_sec_uid={target_sec_uid}&enter_from={enter_from}&author_id={author_id}&follow_status={follow_status}";
    }

    public static IECommerceRNToLynxConfigService b() {
        MethodCollector.i(9029);
        Object a2 = b.a(IECommerceRNToLynxConfigService.class, false);
        if (a2 != null) {
            IECommerceRNToLynxConfigService iECommerceRNToLynxConfigService = (IECommerceRNToLynxConfigService) a2;
            MethodCollector.o(9029);
            return iECommerceRNToLynxConfigService;
        }
        if (b.bF == null) {
            synchronized (IECommerceRNToLynxConfigService.class) {
                try {
                    if (b.bF == null) {
                        b.bF = new ECommerceRNToLynxConfigService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9029);
                    throw th;
                }
            }
        }
        ECommerceRNToLynxConfigService eCommerceRNToLynxConfigService = (ECommerceRNToLynxConfigService) b.bF;
        MethodCollector.o(9029);
        return eCommerceRNToLynxConfigService;
    }
}
