package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.model.message.c;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final BottomRightBannerWidget f16504a;

    /* renamed from: b  reason: collision with root package name */
    private final c f16505b;

    static {
        Covode.recordClassIndex(9144);
    }

    g(BottomRightBannerWidget bottomRightBannerWidget, c cVar) {
        this.f16504a = bottomRightBannerWidget;
        this.f16505b = cVar;
    }

    public final void run() {
        this.f16504a.b(this.f16505b);
    }
}
