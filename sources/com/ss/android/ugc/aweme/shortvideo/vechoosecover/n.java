package com.ss.android.ugc.aweme.shortvideo.vechoosecover;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.publish.f.e;
import com.ss.android.ugc.aweme.shortvideo.upload.ad;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import h.f.b.l;

public final class n extends a {
    static {
        Covode.recordClassIndex(86757);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.vechoosecover.a
    public final void a(AbstractImageUploader abstractImageUploader, e eVar) {
        l.d(abstractImageUploader, "");
        l.d(eVar, "");
        ad adVar = new ad();
        adVar.a(eVar);
        abstractImageUploader.a(adVar.a());
    }
}
