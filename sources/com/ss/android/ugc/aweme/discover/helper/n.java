package com.ss.android.ugc.aweme.discover.helper;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.a.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f81155a = new n();

    private n() {
    }

    static {
        Covode.recordClassIndex(50444);
    }

    public static Drawable a(int i2, Context context, int i3) {
        if (context == null) {
            return null;
        }
        if (i2 == 1) {
            return b.a(context, 2131233603);
        }
        return b.a(context, i3);
    }

    public static Drawable a(Aweme aweme, Context context, int i2) {
        if (context == null) {
            return null;
        }
        if (aweme == null || aweme.getUserDigg() != 1) {
            return b.a(context, i2);
        }
        if (ag.c()) {
            return b.a(context, 2131233605);
        }
        return b.a(context, 2131233604);
    }
}
