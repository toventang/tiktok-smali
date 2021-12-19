package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.ap;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.z;

final /* synthetic */ class au implements b {

    /* renamed from: a  reason: collision with root package name */
    private final at f15915a;

    static {
        Covode.recordClassIndex(8799);
    }

    au(at atVar) {
        this.f15915a = atVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        View findViewById;
        at atVar = this.f15915a;
        ap apVar = (ap) obj;
        if (atVar.H != null && (apVar instanceof ap) && (findViewById = atVar.H.findViewById(R.id.bqn)) != null && (findViewById.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.leftMargin = apVar.f14003a;
            layoutParams.topMargin = apVar.f14004b;
            layoutParams.rightMargin = apVar.f14005c;
            layoutParams.bottomMargin = apVar.f14006d;
        }
        return z.f158842a;
    }
}
