package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.az.a;
import com.ss.android.ugc.aweme.setting.d;

public final class ImportVideoServiceImpl implements a {
    static {
        Covode.recordClassIndex(79487);
    }

    @Override // com.ss.android.ugc.aweme.az.a
    public final long importLongVideoThreshold() {
        return d.a();
    }

    public final boolean isImportLongVideoAllowed() {
        return com.ss.android.ugc.aweme.property.d.a();
    }
}
