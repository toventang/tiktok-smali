package com.bytedance.android.livesdk.olddialog.widget;

import com.bytedance.android.live.t.a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class f implements f.a.d.f {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewGiftBottomWidget f20156a;

    static {
        Covode.recordClassIndex(11889);
    }

    f(LiveNewGiftBottomWidget liveNewGiftBottomWidget) {
        this.f20156a = liveNewGiftBottomWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        LiveNewGiftBottomWidget liveNewGiftBottomWidget = this.f20156a;
        if (liveNewGiftBottomWidget.isViewValid()) {
            liveNewGiftBottomWidget.a(((IWalletService) a.a(IWalletService.class)).walletCenter().b());
        }
    }
}
