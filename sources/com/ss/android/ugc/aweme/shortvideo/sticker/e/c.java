package com.ss.android.ugc.aweme.shortvideo.sticker.e;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.bk;
import com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.ss.android.ugc.aweme.sticker.h;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class c implements bk {
    static {
        Covode.recordClassIndex(85453);
    }

    @Override // com.ss.android.ugc.aweme.port.in.bk
    public final void a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.port.in.bk
    public final String a() {
        String str = a.f130267a;
        l.b(str, "");
        return str;
    }

    @Override // com.ss.android.ugc.aweme.port.in.bk
    public final void a(Activity activity) {
        l.d(activity, "");
        a.a(activity);
    }

    @Override // com.ss.android.ugc.aweme.port.in.bk
    public final h a(String str, Context context, Effect effect, OnUnlockShareFinishListener onUnlockShareFinishListener, boolean z) {
        l.d(str, "");
        l.d(context, "");
        l.d(onUnlockShareFinishListener, "");
        return new b(str, context, effect, onUnlockShareFinishListener, z);
    }
}
