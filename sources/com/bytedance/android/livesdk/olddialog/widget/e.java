package com.bytedance.android.livesdk.olddialog.widget;

import android.view.View;
import com.bytedance.android.livesdk.olddialog.giftpanellist.b.b;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewGiftBottomWidget f20155a;

    static {
        Covode.recordClassIndex(11888);
    }

    e(LiveNewGiftBottomWidget liveNewGiftBottomWidget) {
        this.f20155a = liveNewGiftBottomWidget;
    }

    public final void onClick(View view) {
        LiveNewGiftBottomWidget liveNewGiftBottomWidget = this.f20155a;
        if (liveNewGiftBottomWidget.f20107d != null) {
            liveNewGiftBottomWidget.f20105b.f20098d.postValue(new b(liveNewGiftBottomWidget.f20107d, "click_more_button"));
        }
    }
}
