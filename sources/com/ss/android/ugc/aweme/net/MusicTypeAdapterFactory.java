package com.ss.android.ugc.aweme.net;

import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.google.gson.c.b;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.v;
import com.google.gson.w;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.utils.gw;

public class MusicTypeAdapterFactory implements w {
    static {
        Covode.recordClassIndex(72117);
    }

    @Override // com.google.gson.w
    public <T> v<T> create(f fVar, a<T> aVar) {
        if (!Music.class.isAssignableFrom(aVar.rawType)) {
            return null;
        }
        final v<T> a2 = fVar.a(this, aVar);
        return new v<T>() {
            /* class com.ss.android.ugc.aweme.net.MusicTypeAdapterFactory.AnonymousClass1 */

            static {
                Covode.recordClassIndex(72118);
            }

            @Override // com.google.gson.v
            public final T read(com.google.gson.c.a aVar) {
                if (aVar.f() == b.NULL) {
                    aVar.k();
                    return null;
                }
                T t = (T) ((Music) a2.read(aVar));
                gw.a().a(t.getOwnerId(), t.getSecUid());
                return t;
            }

            @Override // com.google.gson.v
            public final void write(c cVar, T t) {
                if (t == null) {
                    cVar.f();
                } else {
                    a2.write(cVar, t);
                }
            }
        };
    }
}
