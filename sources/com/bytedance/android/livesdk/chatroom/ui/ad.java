package com.bytedance.android.livesdk.chatroom.ui;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.z;

final /* synthetic */ class ad implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f15854a;

    static {
        Covode.recordClassIndex(8745);
    }

    ad(a aVar) {
        this.f15854a = aVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        a aVar = this.f15854a;
        if (aVar.F != null) {
            ViewGroup.LayoutParams layoutParams = aVar.F.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams).addRule(6, R.id.clu);
            }
        }
        return z.f158842a;
    }
}
