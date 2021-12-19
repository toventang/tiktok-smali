package com.ss.android.ugc.aweme.activity.processor;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.ies.foundation.activity.d;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class i extends d {
    static {
        Covode.recordClassIndex(40323);
    }

    @Override // com.bytedance.ies.foundation.activity.d, com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void b(a aVar, Bundle bundle) {
        l.d(aVar, "");
        super.b(aVar, bundle);
        aVar.setActivityRef(new WeakReference<>(aVar));
    }
}
