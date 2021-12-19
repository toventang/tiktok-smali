package com.bytedance.android.livesdk.feed.i;

import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class s implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final p f17566a;

    /* renamed from: b  reason: collision with root package name */
    private final PopupWindow f17567b;

    static {
        Covode.recordClassIndex(9720);
    }

    s(p pVar, PopupWindow popupWindow) {
        this.f17566a = pVar;
        this.f17567b = popupWindow;
    }

    public final void onClick(View view) {
        this.f17566a.a(this.f17567b);
    }
}
