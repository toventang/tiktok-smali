package com.ss.android.ugc.aweme.poi_api.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.operators.ae;
import java.util.HashMap;

public final class PoiVideoListDefaultOperatorService implements IDetailPageShareVMService {
    static {
        Covode.recordClassIndex(74417);
    }

    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, ae> a() {
        return c.a().l();
    }
}
