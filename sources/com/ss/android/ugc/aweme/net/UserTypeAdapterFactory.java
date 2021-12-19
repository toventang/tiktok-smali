package com.ss.android.ugc.aweme.net;

import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.google.gson.c.b;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.v;
import com.google.gson.w;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.gw;

public class UserTypeAdapterFactory implements w {
    static {
        Covode.recordClassIndex(72123);
    }

    @Override // com.google.gson.w
    public <T> v<T> create(f fVar, a<T> aVar) {
        if (!User.class.isAssignableFrom(aVar.rawType)) {
            return null;
        }
        final v<T> a2 = fVar.a(this, aVar);
        return new v<T>() {
            /* class com.ss.android.ugc.aweme.net.UserTypeAdapterFactory.AnonymousClass1 */

            static {
                Covode.recordClassIndex(72124);
            }

            @Override // com.google.gson.v
            public final T read(com.google.gson.c.a aVar) {
                if (aVar.f() == b.NULL) {
                    aVar.k();
                    return null;
                }
                T t = (T) ((User) a2.read(aVar));
                gw.a().a(t.getUid(), t.getSecUid());
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
