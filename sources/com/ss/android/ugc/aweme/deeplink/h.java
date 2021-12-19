package com.ss.android.ugc.aweme.deeplink;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final DeepLinkHandlerActivity f79492a;

    static {
        Covode.recordClassIndex(49381);
    }

    h(DeepLinkHandlerActivity deepLinkHandlerActivity) {
        this.f79492a = deepLinkHandlerActivity;
    }

    public final void run() {
        new b(this.f79492a).e(R.string.f0w).b();
    }
}
