package com.ss.android.ugc.aweme.sticker.g;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;

public interface c {

    public interface a {
        static {
            Covode.recordClassIndex(88180);
        }

        void a(Effect effect, int i2);

        void a(Effect effect, ExceptionResult exceptionResult);

        void b(Effect effect);

        void c(Effect effect);
    }

    public interface b {
        static {
            Covode.recordClassIndex(88181);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(88179);
    }

    void a(String str, String str2, IFetchEffectListener iFetchEffectListener);

    void a(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener);
}
