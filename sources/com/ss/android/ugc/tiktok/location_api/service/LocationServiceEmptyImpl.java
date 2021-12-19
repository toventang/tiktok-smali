package com.ss.android.ugc.tiktok.location_api.service;

import com.bytedance.bpea.basics.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.w;
import h.f.b.l;

public final class LocationServiceEmptyImpl implements ILocationService {
    static {
        Covode.recordClassIndex(98124);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final w getInitLocationTask() {
        return null;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final int getLocationAB() {
        return -1;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void initLocation(d dVar) {
        l.d(dVar, "");
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void setOpt(boolean z) {
    }
}
