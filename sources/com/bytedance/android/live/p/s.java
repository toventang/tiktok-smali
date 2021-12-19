package com.bytedance.android.live.p;

import android.graphics.drawable.Drawable;
import com.bytedance.android.live.share.c;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class s {
    static {
        Covode.recordClassIndex(6686);
    }

    public static final Drawable a(Drawable drawable) {
        l.d(drawable, "");
        drawable.setAlpha(128);
        return drawable;
    }

    public static final boolean a(Room room) {
        if (!((c) a.a(c.class)).shareable(room)) {
            return true;
        }
        return false;
    }
}
