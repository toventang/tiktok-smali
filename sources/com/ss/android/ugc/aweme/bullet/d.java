package com.ss.android.ugc.aweme.bullet;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.a.c;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.c.a.o;
import com.bytedance.ies.bullet.c.c.a.q;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.c.e.b.a;
import com.bytedance.ies.bullet.kit.lynx.e;
import com.bytedance.ies.bullet.kit.rn.i;
import com.bytedance.ies.bullet.kit.web.a.g;
import com.bytedance.ies.bullet.kit.web.f;
import com.ss.android.ugc.aweme.bullet.module.p001default.DefaultLynxKitDelegatesProvider;
import h.f.b.l;
import java.util.List;

public final class d implements c, com.bytedance.ies.bullet.kit.lynx.b.d, com.bytedance.ies.bullet.kit.rn.a.c, g {
    static {
        Covode.recordClassIndex(42708);
    }

    @Override // com.bytedance.ies.bullet.a.d
    public final List<o> a(b bVar) {
        l.d(bVar, "");
        return c.a.a(bVar);
    }

    @Override // com.bytedance.ies.bullet.a.d
    public final List<k> b(b bVar) {
        l.d(bVar, "");
        return BulletHostProxy.b().a(bVar);
    }

    @Override // com.bytedance.ies.bullet.a.d
    public final List<q> c(b bVar) {
        l.d(bVar, "");
        return c.a.b(bVar);
    }

    @Override // com.bytedance.ies.bullet.a.d
    public final a<com.bytedance.ies.bullet.c.c.a.c> d(b bVar) {
        l.d(bVar, "");
        return c.a.c(bVar);
    }

    @Override // com.bytedance.ies.bullet.a.f
    public final com.bytedance.ies.bullet.ui.common.b.c e(b bVar) {
        l.d(bVar, "");
        return new com.ss.android.ugc.aweme.bullet.module.base.b(bVar);
    }

    @Override // com.bytedance.ies.bullet.a.i
    public final List<com.bytedance.ies.bullet.service.f.a.b.q> f(b bVar) {
        l.d(bVar, "");
        return c.a.d(bVar);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.b.d
    public final e g(b bVar) {
        l.d(bVar, "");
        return new com.ss.android.ugc.aweme.bullet.module.p001default.b();
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.b.d
    public final com.bytedance.ies.bullet.kit.lynx.c h(b bVar) {
        l.d(bVar, "");
        return new DefaultLynxKitDelegatesProvider();
    }

    @Override // com.bytedance.ies.bullet.kit.rn.a.c
    public final i i(b bVar) {
        l.d(bVar, "");
        return new com.ss.android.ugc.aweme.bullet.module.p001default.d(bVar);
    }

    @Override // com.bytedance.ies.bullet.kit.rn.a.c
    public final com.bytedance.ies.bullet.kit.rn.g j(b bVar) {
        l.d(bVar, "");
        return new com.ss.android.ugc.aweme.bullet.module.p001default.c(bVar);
    }

    @Override // com.bytedance.ies.bullet.kit.web.a.g
    public final f k(b bVar) {
        l.d(bVar, "");
        return new com.ss.android.ugc.aweme.bullet.module.p001default.f(bVar);
    }

    @Override // com.bytedance.ies.bullet.kit.web.a.g
    public final com.bytedance.ies.bullet.kit.web.d l(b bVar) {
        l.d(bVar, "");
        return new com.ss.android.ugc.aweme.bullet.module.p001default.e(bVar);
    }
}
