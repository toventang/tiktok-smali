package com.ss.android.ugc.aweme.sticker.view;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.interact.view.d;
import com.ss.android.ugc.aweme.editSticker.interact.view.f;
import h.f.b.l;

public final class c implements d {
    static {
        Covode.recordClassIndex(88971);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.d
    public final f a(Context context) {
        l.d(context, "");
        d dVar = new d(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        dVar.setLayoutParams(layoutParams);
        return dVar;
    }
}
