package com.ss.android.ugc.aweme.social.widget.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.provider.h;
import com.ss.android.ugc.aweme.profile.model.User;
import h.c.d;
import h.f.b.l;
import h.z;
import java.util.List;

public interface a extends h {

    /* renamed from: com.ss.android.ugc.aweme.social.widget.b.a$a  reason: collision with other inner class name */
    public static final class C3466a {
        static {
            Covode.recordClassIndex(87475);
        }

        public static void a(a aVar, h.f.a.a<z> aVar2) {
            l.d(aVar2, "");
            h.a.a(aVar, aVar2);
        }
    }

    static {
        Covode.recordClassIndex(87474);
    }

    Object a(d<? super z> dVar);

    List<User> a();

    void a(List<? extends User> list);

    long b();
}
