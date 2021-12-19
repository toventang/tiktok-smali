package com.bytedance.android.live.broadcast.api.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

public interface a {

    /* renamed from: com.bytedance.android.live.broadcast.api.b.a$a  reason: collision with other inner class name */
    public interface AbstractC0100a {
        static {
            Covode.recordClassIndex(3672);
        }

        void a(String str, com.bytedance.android.livesdkapi.depend.model.a aVar);

        void b(String str, com.bytedance.android.livesdkapi.depend.model.a aVar);
    }

    public interface b {
        static {
            Covode.recordClassIndex(3673);
        }

        void a();

        void a(EffectChannelResponse effectChannelResponse);
    }

    static {
        Covode.recordClassIndex(3671);
    }

    void a();

    void a(String str, b bVar);

    void a(String str, com.bytedance.android.livesdkapi.depend.model.a aVar, AbstractC0100a aVar2);

    boolean a(com.bytedance.android.livesdkapi.depend.model.a aVar);
}
