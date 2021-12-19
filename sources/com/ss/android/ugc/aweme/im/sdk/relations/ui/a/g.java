package com.ss.android.ugc.aweme.im.sdk.relations.ui.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.f;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

public final class g extends a {
    static {
        Covode.recordClassIndex(66184);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a
    public final String a(IMContact iMContact) {
        IMUser a2 = f.a(iMContact);
        if (a2 != null) {
            return "@" + a2.getUniqueId();
        }
        return null;
    }
}
