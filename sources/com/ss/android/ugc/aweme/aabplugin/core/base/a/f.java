package com.ss.android.ugc.aweme.aabplugin.core.base.a;

import android.app.Activity;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;

public final class f {
    static {
        Covode.recordClassIndex(38444);
    }

    public static void a(int i2) {
        i.b(new g(i2), i.f4826c);
    }

    public static void a(String str) {
        i.b(new h(str), i.f4826c);
    }

    static final /* synthetic */ Object b(int i2) {
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (validTopActivity == null) {
            return null;
        }
        new b(validTopActivity).a(R.style.o1).e(i2).b();
        return null;
    }

    static final /* synthetic */ Object b(String str) {
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (validTopActivity == null) {
            return null;
        }
        new b(validTopActivity).a(R.style.o1).a(str).b();
        return null;
    }
}
