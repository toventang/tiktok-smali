package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.g;

public class i extends CronetEngineBuilderImpl {
    static {
        Covode.recordClassIndex(103531);
    }

    @Override // com.ttnet.org.chromium.net.i
    public final g c() {
        if (this.f155503e == null) {
            this.f155503e = e();
        }
        CronetUrlRequestContext cronetUrlRequestContext = new CronetUrlRequestContext(this);
        this.n = 0;
        return cronetUrlRequestContext;
    }

    public i(Context context) {
        super(context);
    }
}
