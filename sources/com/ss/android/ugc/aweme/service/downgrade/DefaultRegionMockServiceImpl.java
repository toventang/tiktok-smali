package com.ss.android.ugc.aweme.service.downgrade;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.service.IRegionMockService;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class DefaultRegionMockServiceImpl implements IRegionMockService {
    static {
        Covode.recordClassIndex(79380);
    }

    @Override // com.ss.android.ugc.aweme.service.IRegionMockService
    public final void a(Activity activity, ViewGroup viewGroup) {
        l.d(activity, "");
        l.d(viewGroup, "");
    }

    @Override // com.ss.android.ugc.aweme.service.IRegionMockService
    public final void a(e eVar, b<? super String, z> bVar) {
        l.d(eVar, "");
        l.d(bVar, "");
    }
}
