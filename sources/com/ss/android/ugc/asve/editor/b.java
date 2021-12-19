package com.ss.android.ugc.asve.editor;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.bj;
import com.ss.android.vesdk.y;

public final class b {
    static {
        Covode.recordClassIndex(38121);
    }

    public static final bj a(bj bjVar) {
        if (bjVar == null) {
            bjVar = new bj();
        }
        bjVar.a(new bj.c<>(bj.a.ConfigID_UseNewEngineEffectOpt, Integer.valueOf(y.EFFECT_NEW_OLD_ENGINE_COEXIST.mode)));
        bjVar.a(new bj.c<>(bj.a.ConfigID_ForceDisableGlobalEffect, true));
        return bjVar;
    }
}
