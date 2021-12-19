package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.IFetchModelListener;
import com.ss.android.ugc.effectmanager.ModelEventListener;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.h.h;

public final class ModelListenerAdaptKt {
    static {
        Covode.recordClassIndex(95585);
    }

    public static final e<String[]> toKNListener(IFetchModelListener iFetchModelListener) {
        if (iFetchModelListener == null) {
            return null;
        }
        return new ModelListenerAdaptKt$toKNListener$1(iFetchModelListener);
    }

    public static final h toKNListener(ModelEventListener modelEventListener) {
        if (modelEventListener == null) {
            return null;
        }
        return new ModelListenerAdaptKt$toKNListener$2(modelEventListener);
    }
}
