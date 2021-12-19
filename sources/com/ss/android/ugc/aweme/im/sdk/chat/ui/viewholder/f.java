package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import com.bytedance.covode.number.Covode;
import java.util.Map;

final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final d f101428a;

    static {
        Covode.recordClassIndex(64859);
    }

    f(d dVar) {
        this.f101428a = dVar;
    }

    public final void run() {
        d dVar = this.f101428a;
        if (dVar.f101417a != null) {
            for (Map.Entry<String, Object> entry : dVar.f101417a.entrySet()) {
                entry.getValue();
            }
        }
    }
}
