package com.bytedance.ies.sdk.widgets;

import android.view.View;
import com.bytedance.covode.number.Covode;

public interface FluencyOpt {
    static {
        Covode.recordClassIndex(20706);
    }

    View getPreloadLayout(int i2);

    void post(Runnable runnable, Object obj);

    void removeMessages(Object obj);

    public static final class DefaultImpls {
        static {
            Covode.recordClassIndex(20707);
        }

        public static /* synthetic */ void post$default(FluencyOpt fluencyOpt, Runnable runnable, Object obj, int i2, Object obj2) {
            if (obj2 == null) {
                if ((i2 & 2) != 0) {
                    obj = null;
                }
                fluencyOpt.post(runnable, obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
        }
    }
}
