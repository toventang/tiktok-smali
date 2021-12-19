package com.bytedance.android.livesdk.chatroom.b;

import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdk.utils.b;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final f f14982a;

    static {
        Covode.recordClassIndex(8321);
    }

    w(f fVar) {
        this.f14982a = fVar;
    }

    public final void run() {
        LiveAppBundleUtils.ensurePluginAvailable(((IHostContext) a.a(IHostContext.class)).context(), b.CMAF);
        LiveAppBundleUtils.ensurePluginAvailable(((IHostContext) a.a(IHostContext.class)).context(), b.QUIC);
        LiveAppBundleUtils.ensurePluginAvailable(((IHostContext) a.a(IHostContext.class)).context(), b.RTS);
    }
}
