package com.bytedance.ies.bullet.c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.c.c.k;
import com.bytedance.ies.bullet.c.c.n;
import com.bytedance.ies.bullet.c.c.z;
import h.f.a.q;
import java.util.List;

public interface d extends k {

    public interface a {
        static {
            Covode.recordClassIndex(18804);
        }

        void a(b bVar);
    }

    public interface b {
        static {
            Covode.recordClassIndex(18805);
        }

        d a();
    }

    static {
        Covode.recordClassIndex(18803);
    }

    com.bytedance.ies.bullet.c.c.d<?, ?, ?, ?> a(com.bytedance.ies.bullet.service.f.a.b.b bVar);

    List<com.bytedance.ies.bullet.c.c.d<?, ?, ?, ?>> a();

    void a(k kVar);

    void a(n nVar, z zVar, Uri uri, List<String> list, com.bytedance.ies.bullet.c.e.a.b bVar, q<? super i, ? super Uri, ? super Boolean, h.z> qVar, h.f.a.b<? super Throwable, h.z> bVar2);

    com.bytedance.ies.bullet.c.e.a.b b();

    void b(k kVar);
}
