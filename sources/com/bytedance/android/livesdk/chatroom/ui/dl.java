package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.z;

final /* synthetic */ class dl implements b {

    /* renamed from: a  reason: collision with root package name */
    private final dd f16130a;

    static {
        Covode.recordClassIndex(8937);
    }

    dl(dd ddVar) {
        this.f16130a = ddVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        dd ddVar = this.f16130a;
        Boolean bool = (Boolean) obj;
        if (ddVar.getView() == null || ddVar.getView().findViewById(R.id.fms) == null) {
            return z.f158842a;
        }
        View findViewById = ddVar.getView().findViewById(R.id.fms);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.setMarginEnd(y.a(bool.booleanValue() ? 118.0f : 6.0f));
        findViewById.setLayoutParams(layoutParams);
        return z.f158842a;
    }
}
