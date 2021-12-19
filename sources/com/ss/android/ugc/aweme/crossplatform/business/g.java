package com.ss.android.ugc.aweme.crossplatform.business;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.a.c;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;

public interface g {
    static {
        Covode.recordClassIndex(48846);
    }

    <T extends BusinessService.Business> T a(Class<T> cls);

    void a();

    void a(com.ss.android.ugc.aweme.crossplatform.d.a.a aVar);

    public static class a {
        static {
            Covode.recordClassIndex(48847);
        }

        public static g a(c cVar) {
            return new e(cVar);
        }
    }
}
