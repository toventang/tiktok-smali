package com.bytedance.android.livesdk.feed.i;

import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class aa implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final PopupWindow f17507a;

    static {
        Covode.recordClassIndex(9694);
    }

    aa(PopupWindow popupWindow) {
        this.f17507a = popupWindow;
    }

    public final void onClick(View view) {
        this.f17507a.dismiss();
    }
}
