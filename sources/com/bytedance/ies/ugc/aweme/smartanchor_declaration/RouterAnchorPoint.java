package com.bytedance.ies.ugc.aweme.smartanchor_declaration;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.a.a;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ck.d;
import com.ss.android.ugc.aweme.ck.f;
import com.ss.android.ugc.aweme.ck.g;
import com.ss.android.ugc.aweme.ck.h;
import com.ss.android.ugc.aweme.ck.i;
import com.ss.android.ugc.aweme.ck.k;
import com.ss.android.ugc.aweme.ck.l;
import com.ss.android.ugc.aweme.ck.m;
import com.ss.android.ugc.aweme.ck.n;
import com.ss.android.ugc.aweme.ck.o;
import com.ss.android.ugc.aweme.ck.p;
import com.ss.android.ugc.aweme.ck.w;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.b;
import com.ss.android.ugc.aweme.donation.DonationServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.ECommerceService;
import com.ss.android.ugc.aweme.util.n;
import java.util.Iterator;

public class RouterAnchorPoint implements a {
    static {
        Covode.recordClassIndex(21081);
    }

    public static a getPoint() {
        return new RouterAnchorPoint();
    }

    @Override // com.bytedance.ies.ugc.aweme.a.a
    public void run(Object obj) {
        SmartRouter.addInterceptor(new b());
        SmartRouter.addInterceptor(new w());
        SmartRouter.addInterceptor(new g());
        SmartRouter.addInterceptor(new m());
        SmartRouter.addInterceptor(new com.ss.android.ugc.aweme.ck.a());
        System.out.println("Cofig will add challenge");
        SmartRouter.addInterceptor(new f());
        SmartRouter.addInterceptor(new h());
        Iterator<T> it = ECommerceService.createIECommerceServicebyMonsterPlugin(false).getEComPipeRouterInterceptors().iterator();
        while (it.hasNext()) {
            SmartRouter.addInterceptor(it.next());
        }
        SmartRouter.addInterceptor(new com.ss.android.ugc.aweme.app.h.a());
        SmartRouter.addInterceptor(new w());
        SmartRouter.addInterceptor(new o());
        SmartRouter.addInterceptor(new p());
        SmartRouter.addInterceptor(new g());
        SmartRouter.addInterceptor(new n());
        SmartRouter.addInterceptor(new l());
        SmartRouter.addInterceptor(com.ss.android.ugc.aweme.compliance.api.a.p().d());
        SmartRouter.addInterceptor(new d());
        SmartRouter.addInterceptor(DonationServiceImpl.b().a());
        SmartRouter.addInterceptor(new i());
        SmartRouter.addInterceptor(new k());
        Iterator<T> it2 = ECommerceService.createIECommerceServicebyMonsterPlugin(false).getECommerceRouterInterceptors().iterator();
        while (it2.hasNext()) {
            SmartRouter.addInterceptor(it2.next());
        }
        SmartRouter.addInterceptor(new com.ss.android.ugc.aweme.search.m.b());
        SmartRouter.addInterceptor(new n.a());
    }
}
