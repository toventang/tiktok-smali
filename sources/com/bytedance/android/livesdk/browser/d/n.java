package com.bytedance.android.livesdk.browser.d;

import com.bytedance.android.live.uikit.layout.FullscreenVideoFrame;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class n implements FullscreenVideoFrame.a {

    /* renamed from: a  reason: collision with root package name */
    private final h f14380a;

    static {
        Covode.recordClassIndex(7963);
    }

    n(h hVar) {
        this.f14380a = hVar;
    }

    @Override // com.bytedance.android.live.uikit.layout.FullscreenVideoFrame.a
    public final void a() {
        h hVar = this.f14380a;
        if (hVar.n != null) {
            hVar.n.onHideCustomView();
        }
    }
}
