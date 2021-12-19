package com.bytedance.android.live.p;

import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

final /* synthetic */ class c implements PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    private final DataChannel f12162a;

    static {
        Covode.recordClassIndex(6668);
    }

    c(DataChannel dataChannel) {
        this.f12162a = dataChannel;
    }

    public final void onDismiss() {
        o.POPUP.release(this.f12162a);
    }
}
