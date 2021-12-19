package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.net.Uri;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final BottomRightBannerWidget f16506a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri.Builder f16507b;

    static {
        Covode.recordClassIndex(9145);
    }

    h(BottomRightBannerWidget bottomRightBannerWidget, Uri.Builder builder) {
        this.f16506a = bottomRightBannerWidget;
        this.f16507b = builder;
    }

    public final void run() {
        BottomRightBannerWidget bottomRightBannerWidget = this.f16506a;
        bottomRightBannerWidget.f16249d.a(bottomRightBannerWidget.f16246a, this.f16507b.toString());
    }
}
