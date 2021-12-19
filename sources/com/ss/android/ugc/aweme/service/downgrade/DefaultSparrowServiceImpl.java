package com.ss.android.ugc.aweme.service.downgrade;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.service.IPublishXService;
import com.ss.android.ugc.aweme.service.ISparrowService;
import h.f.b.l;
import java.util.Map;

public final class DefaultSparrowServiceImpl implements ISparrowService {
    static {
        Covode.recordClassIndex(79382);
    }

    public static final class a implements IPublishXService {
        static {
            Covode.recordClassIndex(79383);
        }

        @Override // com.ss.android.ugc.aweme.service.IPublishXService
        public final void a(Throwable th, Map<String, ? extends Object> map) {
            l.d(th, "");
            l.d(map, "");
        }

        a() {
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ISparrowService
    public final IPublishXService a() {
        return new a();
    }
}
