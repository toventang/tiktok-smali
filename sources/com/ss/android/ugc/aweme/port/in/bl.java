package com.ss.android.ugc.aweme.port.in;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public interface bl {
    static {
        Covode.recordClassIndex(74573);
    }

    Dialog a(Effect effect, DialogInterface.OnDismissListener onDismissListener, Handler handler, Activity activity);
}
