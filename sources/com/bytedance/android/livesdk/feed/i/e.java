package com.bytedance.android.livesdk.feed.i;

import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final PopupWindow f17513a;

    static {
        Covode.recordClassIndex(9700);
    }

    e(PopupWindow popupWindow) {
        this.f17513a = popupWindow;
    }

    public final void onClick(View view) {
        this.f17513a.dismiss();
    }
}
