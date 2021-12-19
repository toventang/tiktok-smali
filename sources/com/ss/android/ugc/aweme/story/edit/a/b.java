package com.ss.android.ugc.aweme.story.edit.a;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.interact.view.a;
import com.ss.android.ugc.aweme.editSticker.interact.view.e;
import com.ss.android.ugc.aweme.shortvideo.dh;
import h.f.b.l;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f137048a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(89600);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.a
    public final e a(Context context, int i2) {
        l.d(context, "");
        l.d(context, "");
        a aVar = new a(context, (byte) 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dh.b(context), com.ss.android.ugc.aweme.sticker.view.a.a(context));
        layoutParams.gravity = 1;
        aVar.setLayoutParams(layoutParams);
        aVar.setDeltaX(i2);
        aVar.setLayerType(1, null);
        return aVar;
    }
}
