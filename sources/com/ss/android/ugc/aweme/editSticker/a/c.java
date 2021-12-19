package com.ss.android.ugc.aweme.editSticker.a;

import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.d;

public abstract class c extends PopupWindow implements h {
    static {
        Covode.recordClassIndex(55354);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.a.h
    public void dismiss() {
        super.dismiss();
    }

    public void showAtLocation(View view, int i2, int i3, int i4) {
        try {
            super.showAtLocation(view, i2, i3, i4);
        } catch (Exception e2) {
            d.d().a(e2);
        }
    }
}
