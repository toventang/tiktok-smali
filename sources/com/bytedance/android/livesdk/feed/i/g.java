package com.bytedance.android.livesdk.feed.i;

import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final PopupWindow f17515a;

    static {
        Covode.recordClassIndex(9702);
    }

    g(PopupWindow popupWindow) {
        this.f17515a = popupWindow;
    }

    public final void onClick(View view) {
        this.f17515a.dismiss();
    }
}
