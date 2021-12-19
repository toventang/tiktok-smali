package com.ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;

public final class n extends c<n> {
    static {
        Covode.recordClassIndex(70139);
    }

    public n() {
        super("enter_new_collection_creation");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        if (this.f109556h != null) {
            a("enter_from", this.f109556h);
        }
    }

    public final n a(String str) {
        this.f109556h = str;
        return this;
    }
}
