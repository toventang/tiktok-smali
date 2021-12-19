package com.ss.android.ugc.aweme.sticker.view;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.interact.view.a;
import com.ss.android.ugc.aweme.editSticker.interact.view.e;
import com.ss.android.ugc.aweme.setting.k;
import com.ss.android.ugc.aweme.shortvideo.dh;
import h.f.b.l;

public final class b implements a {
    static {
        Covode.recordClassIndex(88970);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.a
    public final e a(Context context, int i2) {
        l.d(context, "");
        a aVar = new a(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dh.b(context), a.a(context));
        layoutParams.gravity = 1;
        aVar.setLayoutParams(layoutParams);
        aVar.setDeltaX(i2);
        if (com.bytedance.ies.abmock.b.a().a(true, "dmtborderlineview_do_software3", true) != k.f122245a) {
            aVar.setLayerType(1, null);
        }
        l.b(aVar, "");
        return aVar;
    }
}
