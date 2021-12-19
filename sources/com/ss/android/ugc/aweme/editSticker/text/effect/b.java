package com.ss.android.ugc.aweme.editSticker.text.effect;

import android.graphics.Canvas;
import android.text.StaticLayout;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {
    static {
        Covode.recordClassIndex(55693);
    }

    public static final void a(StaticLayout staticLayout, Canvas canvas, float f2, float f3) {
        l.d(staticLayout, "");
        l.d(canvas, "");
        int save = canvas.save();
        canvas.translate(f2, f3);
        try {
            staticLayout.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
