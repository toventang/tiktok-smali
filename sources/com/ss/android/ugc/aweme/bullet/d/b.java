package com.ss.android.ugc.aweme.bullet.d;

import android.content.Context;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.a.c;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.c.a.o;
import com.bytedance.ies.bullet.c.c.a.q;
import com.bytedance.ies.bullet.c.c.j;
import com.bytedance.ies.bullet.kit.web.a.e;
import com.bytedance.ies.bullet.kit.web.a.g;
import com.bytedance.ies.bullet.kit.web.d;
import com.bytedance.ies.bullet.kit.web.f;
import com.ss.android.ugc.aweme.ad.b.b;
import h.a.ag;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class b implements c, g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69278b = new a((byte) 0);

    static {
        Covode.recordClassIndex(42714);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42715);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.d.b$b  reason: collision with other inner class name */
    public static final class C1562b implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.bullet.module.base.b f69279a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f69280b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.bullet.c.e.a.b f69281c;

        static {
            Covode.recordClassIndex(42716);
        }

        @Override // com.bytedance.ies.bullet.c.c.e
        public final j a(com.bytedance.ies.bullet.c.e.a.b bVar) {
            l.d(bVar, "");
            return null;
        }

        @Override // com.bytedance.ies.bullet.kit.web.d
        public final com.bytedance.ies.bullet.kit.web.g d() {
            return null;
        }

        @Override // com.bytedance.ies.bullet.kit.web.d
        public final com.bytedance.ies.bullet.kit.web.b c() {
            return new com.bytedance.ies.bullet.kit.web.b(this) {
                /* class com.ss.android.ugc.aweme.bullet.d.b.C1562b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C1562b f69282a;

                static {
                    Covode.recordClassIndex(42717);
                }

                {
                    this.f69282a = r1;
                }

                @Override // com.bytedance.ies.bullet.kit.web.b
                public final Map<String, Object> a(com.bytedance.ies.bullet.kit.web.c cVar) {
                    Map<String, Object> a2;
                    l.d(cVar, "");
                    l.b(b.a.f65586a, "");
                    com.ss.android.ugc.aweme.ad.b.c a3 = com.ss.android.ugc.aweme.ad.b.b.a();
                    if (a3 == null || (a2 = a3.a(this.f69282a.f69279a)) == null) {
                        return ag.a();
                    }
                    return a2;
                }
            };
        }

        @Override // com.bytedance.ies.bullet.kit.web.d
        public final e a() {
            return this.f69280b.a(this.f69281c, this.f69279a.z);
        }

        @Override // com.bytedance.ies.bullet.kit.web.d
        public final com.bytedance.ies.bullet.kit.web.a.d b() {
            com.bytedance.ies.bullet.c.e.a.b bVar = this.f69281c;
            com.ss.android.ugc.aweme.bullet.business.b bVar2 = this.f69279a.z;
            l.d(bVar, "");
            l.d(bVar2, "");
            return new com.ss.android.ugc.aweme.bullet.module.base.d(bVar, bVar2);
        }

        C1562b(com.ss.android.ugc.aweme.bullet.module.base.b bVar, b bVar2, com.bytedance.ies.bullet.c.e.a.b bVar3) {
            this.f69279a = bVar;
            this.f69280b = bVar2;
            this.f69281c = bVar3;
        }
    }

    @Override // com.bytedance.ies.bullet.a.d
    public final List<q> c(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        return c.a.b(bVar);
    }

    @Override // com.bytedance.ies.bullet.a.d
    public final com.bytedance.ies.bullet.c.e.b.a<com.bytedance.ies.bullet.c.c.a.c> d(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        return c.a.c(bVar);
    }

    @Override // com.bytedance.ies.bullet.a.f
    public com.bytedance.ies.bullet.ui.common.b.c e(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        return new com.ss.android.ugc.aweme.bullet.module.base.b(bVar, new com.ss.android.ugc.aweme.bullet.business.a());
    }

    @Override // com.bytedance.ies.bullet.a.i
    public List<com.bytedance.ies.bullet.service.f.a.b.q> f(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        return c.a.d(bVar);
    }

    @Override // com.bytedance.ies.bullet.kit.web.a.g
    public f k(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        l.c(bVar, "");
        return new com.bytedance.ies.bullet.kit.web.a.c();
    }

    @Override // com.bytedance.ies.bullet.a.d
    public final List<o> a(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        return c.a.a(bVar);
    }

    @Override // com.bytedance.ies.bullet.kit.web.a.g
    public final d l(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        Object c2 = bVar.c(com.bytedance.ies.bullet.ui.common.b.c.class);
        if (!(c2 instanceof com.ss.android.ugc.aweme.bullet.module.base.b)) {
            c2 = null;
        }
        com.ss.android.ugc.aweme.bullet.module.base.b bVar2 = (com.ss.android.ugc.aweme.bullet.module.base.b) c2;
        if (bVar2 != null) {
            return new C1562b(bVar2, this, bVar);
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.a.d
    public List<k> b(com.bytedance.ies.bullet.c.e.a.b bVar) {
        Map<String, com.bytedance.ies.web.a.d> liveWalletJSB;
        Set<Map.Entry<String, com.bytedance.ies.web.a.d>> entrySet;
        l.d(bVar, "");
        ArrayList arrayList = new ArrayList();
        com.bytedance.ies.web.a.a aVar = (com.bytedance.ies.web.a.a) bVar.c(com.bytedance.ies.web.a.a.class);
        Object c2 = bVar.c(Context.class);
        if (!(aVar == null || c2 == null || (liveWalletJSB = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).getLiveWalletJSB(new WeakReference<>(c2), aVar)) == null || (entrySet = liveWalletJSB.entrySet()) == null || (r3 = entrySet.iterator()) == null)) {
            for (Map.Entry<String, com.bytedance.ies.web.a.d> entry : entrySet) {
                if (!(entry.getKey() == null || entry.getValue() == null)) {
                    String key = entry.getKey();
                    l.b(key, "");
                    com.bytedance.ies.web.a.d value = entry.getValue();
                    l.b(value, "");
                    arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, key, value));
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public e a(com.bytedance.ies.bullet.c.e.a.b bVar, com.ss.android.ugc.aweme.bullet.business.b bVar2) {
        l.d(bVar, "");
        l.d(bVar2, "");
        return new com.ss.android.ugc.aweme.bullet.module.base.f(bVar, bVar2);
    }
}
