package com.ss.android.ugc.aweme.external;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.port.in.bb;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.services.filter.IFilterService;

public class i implements IFilterService {
    static {
        Covode.recordClassIndex(56748);
    }

    @Override // com.ss.android.ugc.aweme.services.filter.IFilterService
    public void refreshData() {
        c.H.a(new bb.a() {
            /* class com.ss.android.ugc.aweme.external.i.AnonymousClass1 */

            static {
                Covode.recordClassIndex(56749);
            }

            @Override // com.ss.android.ugc.aweme.port.in.bb.a
            public final void onSuccess() {
                c.C.r().c().a();
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.services.filter.IFilterService
    public FilterBean getFilter(int i2) {
        return c.C.r().c().a(i2);
    }

    @Override // com.ss.android.ugc.aweme.services.filter.IFilterService
    public String getFilterEnName(int i2) {
        return c.C.r().c().c(i2);
    }
}
