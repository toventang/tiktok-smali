package com.bytedance.android.live.effect.api.a;

import com.bytedance.android.live.effect.model.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;

public interface j {

    public interface a<T> {
        static {
            Covode.recordClassIndex(4905);
        }

        List<e<T>> a(EffectChannelResponse effectChannelResponse);
    }

    public interface b {
        static {
            Covode.recordClassIndex(4906);
        }

        void a();
    }

    public interface c<T> {
        static {
            Covode.recordClassIndex(4907);
        }

        void a();

        void a(List<e<T>> list);
    }

    public interface d<T> {
        static {
            Covode.recordClassIndex(4908);
        }

        List<e<T>> a(List<e<T>> list);
    }

    static {
        Covode.recordClassIndex(4904);
    }
}
