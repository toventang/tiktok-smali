package com.bytedance.globalpayment.service.manager.fe.ability;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.a.a.a.c.a;
import com.bytedance.globalpayment.a.a.a.c.b;

public class FeAbilityExternalServiceImplOfMock implements FeAbilityExternalService {
    static {
        Covode.recordClassIndex(17775);
    }

    public static int com_bytedance_globalpayment_service_manager_fe_ability_FeAbilityExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.globalpayment.service.manager.fe.ability.FeAbilityExternalService
    public void init() {
    }

    @Override // com.bytedance.globalpayment.service.manager.fe.ability.FeAbilityExternalService
    public a getECommerceInterceptor() {
        com_bytedance_globalpayment_service_manager_fe_ability_FeAbilityExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w("FeAbilityExternalService", "cur getECommerceInterceptor method is empty impl in FeAbilityExternalServiceImplOfMockClass");
        return new b();
    }

    @Override // com.bytedance.globalpayment.service.manager.fe.ability.FeAbilityExternalService
    public boolean openWebPageByScheme(Context context, String str) {
        com_bytedance_globalpayment_service_manager_fe_ability_FeAbilityExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w("FeAbilityExternalService", "cur openWebPageByScheme method is empty impl in FeAbilityExternalServiceImplOfMockClass");
        return false;
    }
}
