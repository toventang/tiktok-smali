package com.bytedance.ies.bullet.service.f;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.g;
import h.f.b.l;

public abstract class a implements g {
    static {
        Covode.recordClassIndex(19434);
    }

    @Override // com.bytedance.ies.bullet.service.base.g
    public final Uri a(Uri uri, Bundle bundle) {
        l.c(uri, "");
        l.c(bundle, "");
        return uri;
    }
}
