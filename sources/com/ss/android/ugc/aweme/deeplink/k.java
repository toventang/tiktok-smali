package com.ss.android.ugc.aweme.deeplink;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final DeepLinkHandlerActivity f79497a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f79498b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f79499c;

    static {
        Covode.recordClassIndex(49384);
    }

    k(DeepLinkHandlerActivity deepLinkHandlerActivity, Intent intent, Bundle bundle) {
        this.f79497a = deepLinkHandlerActivity;
        this.f79498b = intent;
        this.f79499c = bundle;
    }

    public final void run() {
        a.a(this.f79497a, this.f79498b, this.f79499c);
    }
}
