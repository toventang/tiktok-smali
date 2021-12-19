package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.deviceregister.b.d;

public final class DataService extends BaseDataService {
    static {
        Covode.recordClassIndex(79445);
    }

    @Override // com.ss.android.ugc.aweme.bk, com.ss.android.ugc.aweme.services.BaseDataService
    public final void onDeviceRegistrationInfoChanged() {
        Keva repo = Keva.getRepo("did_set_time");
        if (d.A && repo.getLong("did_set_time", -1) == -1) {
            repo.storeLong("did_set_time", System.currentTimeMillis());
        }
    }
}
