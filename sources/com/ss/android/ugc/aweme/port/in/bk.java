package com.ss.android.ugc.aweme.port.in;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.ss.android.ugc.aweme.sticker.h;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public interface bk {
    static {
        Covode.recordClassIndex(74572);
    }

    h a(String str, Context context, Effect effect, OnUnlockShareFinishListener onUnlockShareFinishListener, boolean z);

    String a();

    void a(Activity activity);

    void a(Context context, String str);
}
