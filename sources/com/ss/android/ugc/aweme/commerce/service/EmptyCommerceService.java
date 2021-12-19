package com.ss.android.ugc.aweme.commerce.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public class EmptyCommerceService implements ICommerceService {
    public static final a Companion = new a((byte) 0);

    static {
        Covode.recordClassIndex(45236);
    }

    public static int com_ss_android_ugc_aweme_commerce_service_EmptyCommerceService_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45237);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.service.ICommerceService
    public Aweme getAwemeById(String str) {
        com_ss_android_ugc_aweme_commerce_service_EmptyCommerceService_com_ss_android_ugc_aweme_lancet_LogLancet_e("EmptyCommerceService", "Some Error Happen");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commerce.service.ICommerceService
    public void logCommerceEvents(String str, com.ss.android.ugc.aweme.commerce.service.a.a aVar) {
        l.d(str, "");
        com_ss_android_ugc_aweme_commerce_service_EmptyCommerceService_com_ss_android_ugc_aweme_lancet_LogLancet_e("EmptyCommerceService", "Some Error Happen");
    }
}
