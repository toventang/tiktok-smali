package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.c;
import com.ttnet.org.chromium.net.i;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks;

public final class j extends i {
    private VersionSafeCallbacks.a F;

    static {
        Covode.recordClassIndex(103532);
    }

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl
    public final VersionSafeCallbacks.a f() {
        return this.F;
    }

    public j(Context context) {
        super(context);
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.i
    public final /* synthetic */ i a(c.a.AbstractC4117a aVar) {
        return a(aVar);
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl
    public final CronetEngineBuilderImpl b(c.a.AbstractC4117a aVar) {
        this.F = new VersionSafeCallbacks.a(aVar);
        return this;
    }
}
