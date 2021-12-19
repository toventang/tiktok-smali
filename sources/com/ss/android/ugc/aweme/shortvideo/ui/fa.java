package com.ss.android.ugc.aweme.shortvideo.ui;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.scheduler.d;
import com.ss.android.ugc.aweme.scheduler.g;
import com.ss.android.ugc.aweme.scheduler.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class fa implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f131749a;

    static {
        Covode.recordClassIndex(86290);
    }

    fa(Bundle bundle) {
        this.f131749a = bundle;
    }

    @Override // com.ss.android.ugc.aweme.scheduler.d
    public final void a() {
        Bundle bundle = this.f131749a;
        if (h.c() == 0) {
            g.a("PublishParallel previous task is finished, start pre publish task");
            h.c(bundle);
            h.f120867f = null;
        }
    }
}
