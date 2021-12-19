package com.google.android.play.core.a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.b;
import com.google.android.play.core.install.a;
import com.google.android.play.core.tasks.m;

final class q extends p<Void> {
    static {
        Covode.recordClassIndex(32651);
    }

    q(s sVar, m<Void> mVar) {
        super(sVar, new b("OnCompleteUpdateCallback"), mVar);
    }

    @Override // com.google.android.play.core.a.p, com.google.android.play.core.b.bx
    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f52722b.b(new a(bundle.getInt("error.code", -2)));
        } else {
            this.f52722b.a((Object) null);
        }
    }
}
