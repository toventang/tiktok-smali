package com.ss.android.ugc.aweme.services.external;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.w;

public interface IInitTaskService {
    public static final Companion Companion = Companion.$$INSTANCE;

    static {
        Covode.recordClassIndex(79637);
    }

    w initTask(int i2);

    Runnable initTask(int i2, Object obj);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(79638);
        }
    }
}
